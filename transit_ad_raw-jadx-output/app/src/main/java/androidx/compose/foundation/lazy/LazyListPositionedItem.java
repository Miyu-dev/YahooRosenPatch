package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyMeasuredItem.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020!\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020!\u0012\u0006\u0010.\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b7\u00108J.\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u0004ø\u0001\u0001J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010R\u001a\u0010\u0014\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0015R\u0017\u0010/\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u00020\u0004*\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u00103R\u0011\u00106\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b5\u0010\u0016\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "", "mainAxisMap", "copy-4Tuh3kE", "(JLkj/l;)J", "copy", "index", "getOffset-Bjo55l4", "(I)J", "getOffset", "getMainAxisSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Lkotlin/j;", "place", TypedValues.CycleType.S_WAVE_OFFSET, "I", "()I", "getIndex", "", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "size", "getSize", "minMainAxisOffset", "maxMainAxisOffset", "", "isVertical", "Z", "", "Landroidx/compose/foundation/lazy/LazyListPlaceableWrapper;", "wrappers", "Ljava/util/List;", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "visualOffset", "J", "reverseLayout", "mainAxisLayoutSize", "hasAnimations", "getHasAnimations", "()Z", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "getPlaceablesCount", "placeablesCount", "<init>", "(IILjava/lang/Object;IIIZLjava/util/List;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyListPositionedItem implements LazyListItemInfo {
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int mainAxisLayoutSize;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final int offset;
    private final LazyListItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int size;
    private final long visualOffset;
    private final List<LazyListPlaceableWrapper> wrappers;

    public /* synthetic */ LazyListPositionedItem(int i2, int i3, Object obj, int i4, int i5, int i6, boolean z, List list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, boolean z2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, obj, i4, i5, i6, z, list, lazyListItemPlacementAnimator, j, z2, i7);
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m579copy4Tuh3kE(long j, l<? super Integer, Integer> lVar) {
        int iM5385getXimpl = this.isVertical ? IntOffset.m5385getXimpl(j) : ((Number) lVar.invoke(Integer.valueOf(IntOffset.m5385getXimpl(j)))).intValue();
        boolean z = this.isVertical;
        int iM5386getYimpl = IntOffset.m5386getYimpl(j);
        if (z) {
            iM5386getYimpl = ((Number) lVar.invoke(Integer.valueOf(iM5386getYimpl))).intValue();
        }
        return IntOffsetKt.IntOffset(iM5385getXimpl, iM5386getYimpl);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int index) {
        Object parentData = this.wrappers.get(index).getPlaceable().getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize(int index) {
        return getMainAxisSize(this.wrappers.get(index).getPlaceable());
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    public final long m580getOffsetBjo55l4(int index) {
        return this.wrappers.get(index).getOffset();
    }

    public final int getPlaceablesCount() {
        return this.wrappers.size();
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope placementScope) {
        m.h(placementScope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            Placeable placeable = this.wrappers.get(i2).getPlaceable();
            long jM568getAnimatedOffsetYT5a7pE = getAnimationSpec(i2) != null ? this.placementAnimator.m568getAnimatedOffsetYT5a7pE(getKey(), i2, this.minMainAxisOffset - getMainAxisSize(placeable), this.maxMainAxisOffset, m580getOffsetBjo55l4(i2)) : m580getOffsetBjo55l4(i2);
            if (this.reverseLayout) {
                jM568getAnimatedOffsetYT5a7pE = IntOffsetKt.IntOffset(this.isVertical ? IntOffset.m5385getXimpl(jM568getAnimatedOffsetYT5a7pE) : (this.mainAxisLayoutSize - IntOffset.m5385getXimpl(jM568getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable), this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m5386getYimpl(jM568getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable) : IntOffset.m5386getYimpl(jM568getAnimatedOffsetYT5a7pE));
            }
            if (this.isVertical) {
                long j = this.visualOffset;
                Placeable.PlacementScope.m4275placeWithLayeraW9wM$default(placementScope, placeable, androidx.browser.browseractions.a.c(j, IntOffset.m5386getYimpl(jM568getAnimatedOffsetYT5a7pE), IntOffset.m5385getXimpl(j) + IntOffset.m5385getXimpl(jM568getAnimatedOffsetYT5a7pE)), 0.0f, null, 6, null);
            } else {
                long j2 = this.visualOffset;
                Placeable.PlacementScope.m4274placeRelativeWithLayeraW9wM$default(placementScope, placeable, androidx.browser.browseractions.a.c(j2, IntOffset.m5386getYimpl(jM568getAnimatedOffsetYT5a7pE), IntOffset.m5385getXimpl(j2) + IntOffset.m5385getXimpl(jM568getAnimatedOffsetYT5a7pE)), 0.0f, null, 6, null);
            }
        }
    }

    private LazyListPositionedItem(int i2, int i3, Object obj, int i4, int i5, int i6, boolean z, List<LazyListPlaceableWrapper> list, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j, boolean z2, int i7) {
        this.offset = i2;
        this.index = i3;
        this.key = obj;
        this.size = i4;
        this.minMainAxisOffset = i5;
        this.maxMainAxisOffset = i6;
        this.isVertical = z;
        this.wrappers = list;
        this.placementAnimator = lazyListItemPlacementAnimator;
        this.visualOffset = j;
        this.reverseLayout = z2;
        this.mainAxisLayoutSize = i7;
        int placeablesCount = getPlaceablesCount();
        boolean z3 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= placeablesCount) {
                break;
            }
            if (getAnimationSpec(i8) != null) {
                z3 = true;
                break;
            }
            i8++;
        }
        this.hasAnimations = z3;
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
