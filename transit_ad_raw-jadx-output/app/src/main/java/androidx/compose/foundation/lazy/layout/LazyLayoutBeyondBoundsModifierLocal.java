package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.unit.LayoutDirection;
import kj.l;
import kj.p;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 /2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001/B/\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b-\u0010.J%\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\n*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\n*\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;", "currentInterval", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "direction", "addNextInterval-FR3nfPY", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;I)Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;", "addNextInterval", "", "hasMoreContent-FR3nfPY", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo$Interval;I)Z", "hasMoreContent", "isOppositeToOrientation-4vf7U8o", "(I)Z", "isOppositeToOrientation", "T", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "block", "layout-o7g1Pn8", "(ILkj/l;)Ljava/lang/Object;", "layout", "Landroidx/compose/foundation/lazy/layout/BeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/layout/BeyondBoundsState;", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "reverseLayout", "Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "key", "getValue", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "value", "<init>", "(Landroidx/compose/foundation/lazy/layout/BeyondBoundsState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    private static final LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1 emptyBeyondBoundsScope = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    };
    private final LazyListBeyondBoundsInfo beyondBoundsInfo;
    private final LayoutDirection layoutDirection;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final BeyondBoundsState state;

    /* JADX INFO: compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(BeyondBoundsState beyondBoundsState, LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, boolean z, LayoutDirection layoutDirection, Orientation orientation) {
        m.h(beyondBoundsState, "state");
        m.h(lazyListBeyondBoundsInfo, "beyondBoundsInfo");
        m.h(layoutDirection, "layoutDirection");
        m.h(orientation, "orientation");
        this.state = beyondBoundsState;
        this.beyondBoundsInfo = lazyListBeyondBoundsInfo;
        this.reverseLayout = z;
        this.layoutDirection = layoutDirection;
        this.orientation = orientation;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX INFO: renamed from: addNextInterval-FR3nfPY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.Interval m672addNextIntervalFR3nfPY(androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo.Interval r6, int r7) throws kotlin.KotlinNothingValueException {
        /*
            r5 = this;
            int r0 = r6.getStart()
            int r6 = r6.getEnd()
            androidx.compose.ui.layout.BeyondBoundsLayout$LayoutDirection$Companion r1 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE
            int r2 = r1.m4220getBeforehoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(r7, r2)
            if (r2 == 0) goto L18
        L14:
            int r0 = r0 + (-1)
            goto L8c
        L18:
            int r2 = r1.m4219getAfterhoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(r7, r2)
            if (r2 == 0) goto L26
        L22:
            int r6 = r6 + 1
            goto L8c
        L26:
            int r2 = r1.m4218getAbovehoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(r7, r2)
            if (r2 == 0) goto L35
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L14
            goto L22
        L35:
            int r2 = r1.m4221getBelowhoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(r7, r2)
            if (r2 == 0) goto L44
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L22
            goto L14
        L44:
            int r2 = r1.m4222getLefthoxUOeE()
            boolean r2 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(r7, r2)
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L69
            androidx.compose.ui.unit.LayoutDirection r7 = r5.layoutDirection
            int[] r1 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.WhenMappings.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L64
            if (r7 == r3) goto L5f
            goto L8c
        L5f:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L22
            goto L14
        L64:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L14
            goto L22
        L69:
            int r1 = r1.m4223getRighthoxUOeE()
            boolean r7 = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(r7, r1)
            if (r7 == 0) goto L93
            androidx.compose.ui.unit.LayoutDirection r7 = r5.layoutDirection
            int[] r1 = androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.WhenMappings.$EnumSwitchMapping$0
            int r7 = r7.ordinal()
            r7 = r1[r7]
            if (r7 == r4) goto L87
            if (r7 == r3) goto L82
            goto L8c
        L82:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L14
            goto L22
        L87:
            boolean r7 = r5.reverseLayout
            if (r7 == 0) goto L22
            goto L14
        L8c:
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r7 = r5.beyondBoundsInfo
            androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval r6 = r7.addInterval(r0, r6)
            return r6
        L93:
            androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt.access$unsupportedDirection()
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal.m672addNextIntervalFR3nfPY(androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval, int):androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo$Interval");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: hasMoreContent-FR3nfPY, reason: not valid java name */
    public final boolean m673hasMoreContentFR3nfPY(LazyListBeyondBoundsInfo.Interval interval, int i2) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (m674isOppositeToOrientation4vf7U8o(i2)) {
            return false;
        }
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.INSTANCE;
        if (BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4220getBeforehoxUOeE())) {
            return hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        if (BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4219getAfterhoxUOeE())) {
            return hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4218getAbovehoxUOeE())) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this) : hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        if (BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4221getBelowhoxUOeE())) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval) : hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4222getLefthoxUOeE())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
            if (i3 == 1) {
                return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this) : hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
            }
            if (i3 == 2) {
                return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval) : hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4223getRighthoxUOeE())) {
            LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
            throw new KotlinNothingValueException();
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[this.layoutDirection.ordinal()];
        if (i4 == 1) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval) : hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this);
        }
        if (i4 == 2) {
            return this.reverseLayout ? hasMoreContent_FR3nfPY$hasMoreItemsAfter(interval, this) : hasMoreContent_FR3nfPY$hasMoreItemsBefore(interval);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean hasMoreContent_FR3nfPY$hasMoreItemsAfter(LazyListBeyondBoundsInfo.Interval interval, LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal) {
        return interval.getEnd() < lazyLayoutBeyondBoundsModifierLocal.state.getItemCount() - 1;
    }

    private static final boolean hasMoreContent_FR3nfPY$hasMoreItemsBefore(LazyListBeyondBoundsInfo.Interval interval) {
        return interval.getStart() > 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: renamed from: isOppositeToOrientation-4vf7U8o, reason: not valid java name */
    private final boolean m674isOppositeToOrientation4vf7U8o(int i2) throws KotlinNothingValueException {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.INSTANCE;
        if (!(BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4218getAbovehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4221getBelowhoxUOeE()))) {
            if (!(BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4222getLefthoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4223getRighthoxUOeE()))) {
                if (!(BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4220getBeforehoxUOeE()) ? true : BeyondBoundsLayout.LayoutDirection.m4214equalsimpl0(i2, companion.m4219getAfterhoxUOeE()))) {
                    LazyLayoutBeyondBoundsModifierLocalKt.unsupportedDirection();
                    throw new KotlinNothingValueException();
                }
            } else if (this.orientation == Orientation.Vertical) {
                return true;
            }
        } else if (this.orientation == Orientation.Horizontal) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(l lVar) {
        return androidx.compose.ui.b.a(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(l lVar) {
        return androidx.compose.ui.b.b(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public BeyondBoundsLayout getValue() {
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* JADX INFO: renamed from: layout-o7g1Pn8, reason: not valid java name */
    public <T> T mo675layouto7g1Pn8(final int direction, l<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) throws KotlinNothingValueException {
        m.h(block, "block");
        if (this.state.getItemCount() <= 0 || !this.state.getHasVisibleItems()) {
            return (T) block.invoke(emptyBeyondBoundsScope);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.beyondBoundsInfo.addInterval(this.state.getFirstVisibleIndex(), this.state.getLastVisibleIndex());
        T t = null;
        while (t == null && m673hasMoreContentFR3nfPY((LazyListBeyondBoundsInfo.Interval) objectRef.element, direction)) {
            LazyListBeyondBoundsInfo.Interval intervalM672addNextIntervalFR3nfPY = m672addNextIntervalFR3nfPY((LazyListBeyondBoundsInfo.Interval) objectRef.element, direction);
            this.beyondBoundsInfo.removeInterval((LazyListBeyondBoundsInfo.Interval) objectRef.element);
            objectRef.element = intervalM672addNextIntervalFR3nfPY;
            this.state.remeasure();
            t = (T) block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                @Override // androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                public boolean getHasMoreContent() {
                    return this.this$0.m673hasMoreContentFR3nfPY((LazyListBeyondBoundsInfo.Interval) objectRef.element, direction);
                }
            });
        }
        this.beyondBoundsInfo.removeInterval((LazyListBeyondBoundsInfo.Interval) objectRef.element);
        this.state.remeasure();
        return t;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
