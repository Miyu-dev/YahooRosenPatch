package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B9\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u00100\u001a\u00020\n\u0012\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001601\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0013\u0010\t\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0006J%\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010(\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0011\u0010*\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b)\u0010\u001aR\u0011\u0010,\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0016\u0010/\u001a\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/compose/material3/SheetState;", "", "", "requireOffset", "Lkotlin/j;", "expand", "(Ldj/c;)Ljava/lang/Object;", "partialExpand", "show", "hide", "Landroidx/compose/material3/SheetValue;", "targetValue", "velocity", "animateTo$material3_release", "(Landroidx/compose/material3/SheetValue;FLdj/c;)Ljava/lang/Object;", "animateTo", "snapTo$material3_release", "(Landroidx/compose/material3/SheetValue;Ldj/c;)Ljava/lang/Object;", "snapTo", "settle$material3_release", "(FLdj/c;)Ljava/lang/Object;", "settle", "", "skipPartiallyExpanded", "Z", "getSkipPartiallyExpanded$material3_release", "()Z", "skipHiddenState", "getSkipHiddenState$material3_release", "Landroidx/compose/material3/SwipeableV2State;", "swipeableState", "Landroidx/compose/material3/SwipeableV2State;", "getSwipeableState$material3_release", "()Landroidx/compose/material3/SwipeableV2State;", "setSwipeableState$material3_release", "(Landroidx/compose/material3/SwipeableV2State;)V", "getCurrentValue", "()Landroidx/compose/material3/SheetValue;", "currentValue", "getTargetValue", "isVisible", "getHasExpandedState", "hasExpandedState", "getHasPartiallyExpandedState", "hasPartiallyExpandedState", "getOffset$material3_release", "()Ljava/lang/Float;", TypedValues.CycleType.S_WAVE_OFFSET, "initialValue", "Lkotlin/Function1;", "confirmValueChange", "<init>", "(ZLandroidx/compose/material3/SheetValue;Lkj/l;Z)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SheetState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;
    private SwipeableV2State<SheetValue> swipeableState;

    /* JADX INFO: compiled from: SheetDefaults.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SheetState;", "Landroidx/compose/material3/SheetValue;", "skipPartiallyExpanded", "", "confirmValueChange", "Lkotlin/Function1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<SheetState, SheetValue> Saver(final boolean z, final l<? super SheetValue, Boolean> lVar) {
            m.h(lVar, "confirmValueChange");
            return SaverKt.Saver(new p<SaverScope, SheetState, SheetValue>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$1
                public final SheetValue invoke(SaverScope saverScope, SheetState sheetState) {
                    m.h(saverScope, "$this$Saver");
                    m.h(sheetState, "it");
                    return sheetState.getCurrentValue();
                }
            }, new l<SheetValue, SheetState>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final SheetState invoke(SheetValue sheetValue) {
                    m.h(sheetValue, "savedValue");
                    return new SheetState(z, sheetValue, lVar, false, 8, null);
                }
            });
        }

        private Companion() {
        }
    }

    public SheetState(boolean z, SheetValue sheetValue, l<? super SheetValue, Boolean> lVar, boolean z2) {
        m.h(sheetValue, "initialValue");
        m.h(lVar, "confirmValueChange");
        this.skipPartiallyExpanded = z;
        this.skipHiddenState = z2;
        if (z) {
            if (!(sheetValue != SheetValue.PartiallyExpanded)) {
                throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
            }
        }
        if (z2) {
            if (!(sheetValue != SheetValue.Hidden)) {
                throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
            }
        }
        this.swipeableState = new SwipeableV2State<>(sheetValue, SwipeableV2Defaults.INSTANCE.getAnimationSpec(), lVar, null, 0.0f, 24, null);
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState sheetState, SheetValue sheetValue, float f, dj.c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = sheetState.swipeableState.getLastVelocity();
        }
        return sheetState.animateTo$material3_release(sheetValue, f, cVar);
    }

    public final Object animateTo$material3_release(SheetValue sheetValue, float f, dj.c<? super j> cVar) throws Throwable {
        Object objAnimateTo = this.swipeableState.animateTo(sheetValue, f, cVar);
        return objAnimateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo : j.a;
    }

    public final Object expand(dj.c<? super j> cVar) {
        Object objAnimateTo$default = SwipeableV2State.animateTo$default(this.swipeableState, SheetValue.Expanded, 0.0f, cVar, 2, null);
        return objAnimateTo$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$default : j.a;
    }

    public final SheetValue getCurrentValue() {
        return this.swipeableState.getCurrentValue();
    }

    public final boolean getHasExpandedState() {
        return this.swipeableState.hasAnchorForValue(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.swipeableState.hasAnchorForValue(SheetValue.PartiallyExpanded);
    }

    public final Float getOffset$material3_release() {
        return this.swipeableState.getOffset();
    }

    /* JADX INFO: renamed from: getSkipHiddenState$material3_release, reason: from getter */
    public final boolean getSkipHiddenState() {
        return this.skipHiddenState;
    }

    /* JADX INFO: renamed from: getSkipPartiallyExpanded$material3_release, reason: from getter */
    public final boolean getSkipPartiallyExpanded() {
        return this.skipPartiallyExpanded;
    }

    public final SwipeableV2State<SheetValue> getSwipeableState$material3_release() {
        return this.swipeableState;
    }

    public final SheetValue getTargetValue() {
        return this.swipeableState.getTargetValue();
    }

    public final Object hide(dj.c<? super j> cVar) {
        if (!(!this.skipHiddenState)) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, cVar, 2, null);
        return objAnimateTo$material3_release$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$material3_release$default : j.a;
    }

    public final boolean isVisible() {
        return this.swipeableState.getCurrentValue() != SheetValue.Hidden;
    }

    public final Object partialExpand(dj.c<? super j> cVar) {
        if (!(!this.skipPartiallyExpanded)) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, cVar, 2, null);
        return objAnimateTo$material3_release$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$material3_release$default : j.a;
    }

    public final float requireOffset() {
        return this.swipeableState.requireOffset();
    }

    public final void setSwipeableState$material3_release(SwipeableV2State<SheetValue> swipeableV2State) {
        m.h(swipeableV2State, "<set-?>");
        this.swipeableState = swipeableV2State;
    }

    public final Object settle$material3_release(float f, dj.c<? super j> cVar) throws Throwable {
        Object obj = this.swipeableState.settle(f, cVar);
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : j.a;
    }

    public final Object show(dj.c<? super j> cVar) {
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded, 0.0f, cVar, 2, null);
        return objAnimateTo$material3_release$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$material3_release$default : j.a;
    }

    public final Object snapTo$material3_release(SheetValue sheetValue, dj.c<? super j> cVar) {
        Object objSnapTo = this.swipeableState.snapTo(sheetValue, cVar);
        return objSnapTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objSnapTo : j.a;
    }

    public /* synthetic */ SheetState(boolean z, SheetValue sheetValue, l lVar, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? SheetValue.Hidden : sheetValue, (i2 & 4) != 0 ? new l<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetState.1
            public final Boolean invoke(SheetValue sheetValue2) {
                m.h(sheetValue2, "it");
                return Boolean.TRUE;
            }
        } : lVar, (i2 & 8) != 0 ? false : z2);
    }
}
