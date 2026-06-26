package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyGridMeasuredItem.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0080\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004\u0012\u0006\u0010)\u001a\u00020(\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020\u0004\u0012\u0006\u00104\u001a\u00020(ø\u0001\u0001¢\u0006\u0004\b<\u0010=J.\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\u0004ø\u0001\u0001J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fR#\u0010\u0013\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u001a\u0010!\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R#\u0010$\u001a\u00020#8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0017R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00102\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b2\u0010\u0014R\u0014\u00103\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0017R\u0014\u00104\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010*R\u0017\u00105\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u00107R\u0018\u00109\u001a\u00020\u0004*\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u00108R\u0011\u0010;\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b:\u0010\u0019\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "", "mainAxisMap", "copy-4Tuh3kE", "(JLkj/l;)J", "copy", "index", "getMainAxisSize", "getCrossAxisSize", "getCrossAxisOffset", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Lkotlin/j;", "place", TypedValues.CycleType.S_WAVE_OFFSET, "J", "getOffset-nOcc-ac", "()J", "I", "getIndex", "()I", "", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "row", "getRow", "column", "getColumn", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "minMainAxisOffset", "maxMainAxisOffset", "", "isVertical", "Z", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Ljava/util/List;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "visualOffset", "mainAxisLayoutSize", "reverseLayout", "hasAnimations", "getHasAnimations", "()Z", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "getPlaceablesCount", "placeablesCount", "<init>", "(JILjava/lang/Object;IIJIIZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyGridPositionedItem implements LazyGridItemInfo {
    private final int column;
    private final boolean hasAnimations;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int mainAxisLayoutSize;
    private final int maxMainAxisOffset;
    private final int minMainAxisOffset;
    private final long offset;
    private final List<Placeable> placeables;
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final int row;
    private final long size;
    private final long visualOffset;

    public /* synthetic */ LazyGridPositionedItem(long j, int i2, Object obj, int i3, int i4, long j2, int i5, int i6, boolean z, List list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j3, int i7, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i2, obj, i3, i4, j2, i5, i6, z, list, lazyGridItemPlacementAnimator, j3, i7, z2);
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m641copy4Tuh3kE(long j, l<? super Integer, Integer> lVar) {
        int iM5385getXimpl = this.isVertical ? IntOffset.m5385getXimpl(j) : ((Number) lVar.invoke(Integer.valueOf(IntOffset.m5385getXimpl(j)))).intValue();
        boolean z = this.isVertical;
        int iM5386getYimpl = IntOffset.m5386getYimpl(j);
        if (z) {
            iM5386getYimpl = ((Number) lVar.invoke(Integer.valueOf(iM5386getYimpl))).intValue();
        }
        return IntOffsetKt.IntOffset(iM5385getXimpl, iM5386getYimpl);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec(int index) {
        Object parentData = this.placeables.get(index).getParentData();
        if (parentData instanceof FiniteAnimationSpec) {
            return (FiniteAnimationSpec) parentData;
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m5385getXimpl(getOffset()) : IntOffset.m5386getYimpl(getOffset());
    }

    public final int getCrossAxisSize() {
        return this.isVertical ? IntSize.m5427getWidthimpl(getSize()) : IntSize.m5426getHeightimpl(getSize());
    }

    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize(int index) {
        return getMainAxisSize(this.placeables.get(index));
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    public final int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope placementScope) {
        m.h(placementScope, "scope");
        int placeablesCount = getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            Placeable placeable = this.placeables.get(i2);
            long jM628getAnimatedOffsetYT5a7pE = getAnimationSpec(i2) != null ? this.placementAnimator.m628getAnimatedOffsetYT5a7pE(getKey(), i2, this.minMainAxisOffset - getMainAxisSize(placeable), this.maxMainAxisOffset, getOffset()) : getOffset();
            if (this.reverseLayout) {
                jM628getAnimatedOffsetYT5a7pE = IntOffsetKt.IntOffset(this.isVertical ? IntOffset.m5385getXimpl(jM628getAnimatedOffsetYT5a7pE) : (this.mainAxisLayoutSize - IntOffset.m5385getXimpl(jM628getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable), this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m5386getYimpl(jM628getAnimatedOffsetYT5a7pE)) - getMainAxisSize(placeable) : IntOffset.m5386getYimpl(jM628getAnimatedOffsetYT5a7pE));
            }
            if (this.isVertical) {
                long j = this.visualOffset;
                Placeable.PlacementScope.m4275placeWithLayeraW9wM$default(placementScope, placeable, androidx.browser.browseractions.a.c(j, IntOffset.m5386getYimpl(jM628getAnimatedOffsetYT5a7pE), IntOffset.m5385getXimpl(j) + IntOffset.m5385getXimpl(jM628getAnimatedOffsetYT5a7pE)), 0.0f, null, 6, null);
            } else {
                long j2 = this.visualOffset;
                Placeable.PlacementScope.m4274placeRelativeWithLayeraW9wM$default(placementScope, placeable, androidx.browser.browseractions.a.c(j2, IntOffset.m5386getYimpl(jM628getAnimatedOffsetYT5a7pE), IntOffset.m5385getXimpl(j2) + IntOffset.m5385getXimpl(jM628getAnimatedOffsetYT5a7pE)), 0.0f, null, 6, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyGridPositionedItem(long j, int i2, Object obj, int i3, int i4, long j2, int i5, int i6, boolean z, List<? extends Placeable> list, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j3, int i7, boolean z2) {
        this.offset = j;
        this.index = i2;
        this.key = obj;
        this.row = i3;
        this.column = i4;
        this.size = j2;
        this.minMainAxisOffset = i5;
        this.maxMainAxisOffset = i6;
        this.isVertical = z;
        this.placeables = list;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j3;
        this.mainAxisLayoutSize = i7;
        this.reverseLayout = z2;
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

    public final int getMainAxisSize() {
        return this.isVertical ? IntSize.m5426getHeightimpl(getSize()) : IntSize.m5427getWidthimpl(getSize());
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }
}
