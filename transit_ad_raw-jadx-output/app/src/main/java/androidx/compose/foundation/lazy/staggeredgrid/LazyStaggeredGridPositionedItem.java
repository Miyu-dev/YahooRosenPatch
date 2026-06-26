package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.browser.browseractions.a;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020 \u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020\u0004ø\u0001\u0001¢\u0006\u0004\b.\u0010/J.\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R#\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010!\u001a\u00020 8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010\u0014R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0016R\u0019\u0010-\u001a\u00020\u0004*\u00020$8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/Function1;", "", "mainAxisMap", "copy-4Tuh3kE", "(JLkj/l;)J", "copy", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "context", "Lkotlin/j;", "place", "", "toString", TypedValues.CycleType.S_WAVE_OFFSET, "J", "getOffset-nOcc-ac", "()J", "index", "I", "getIndex", "()I", "lane", "getLane", "", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Ljava/util/List;", "", "isVertical", "Z", "mainAxisLayoutSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "mainAxisSize", "<init>", "(JIILjava/lang/Object;JLjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class LazyStaggeredGridPositionedItem implements LazyStaggeredGridItemInfo {
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final int mainAxisLayoutSize;
    private final long offset;
    private final List<Placeable> placeables;
    private final long size;

    public /* synthetic */ LazyStaggeredGridPositionedItem(long j, int i2, int i3, Object obj, long j2, List list, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i2, i3, obj, j2, list, z, i4);
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m716copy4Tuh3kE(long j, l<? super Integer, Integer> lVar) {
        int iM5385getXimpl = this.isVertical ? IntOffset.m5385getXimpl(j) : ((Number) lVar.invoke(Integer.valueOf(IntOffset.m5385getXimpl(j)))).intValue();
        boolean z = this.isVertical;
        int iM5386getYimpl = IntOffset.m5386getYimpl(j);
        if (z) {
            iM5386getYimpl = ((Number) lVar.invoke(Integer.valueOf(iM5386getYimpl))).intValue();
        }
        return IntOffsetKt.IntOffset(iM5385getXimpl, iM5386getYimpl);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope placementScope, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        long offset;
        m.h(placementScope, "scope");
        m.h(lazyStaggeredGridMeasureContext, "context");
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = list.get(i2);
            if (lazyStaggeredGridMeasureContext.getReverseLayout()) {
                long offset2 = getOffset();
                offset = IntOffsetKt.IntOffset(this.isVertical ? IntOffset.m5385getXimpl(offset2) : (this.mainAxisLayoutSize - IntOffset.m5385getXimpl(offset2)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth()), this.isVertical ? (this.mainAxisLayoutSize - IntOffset.m5386getYimpl(offset2)) - (this.isVertical ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m5386getYimpl(offset2));
            } else {
                offset = getOffset();
            }
            long jM705getContentOffsetnOccac = lazyStaggeredGridMeasureContext.getContentOffset();
            Placeable.PlacementScope.m4274placeRelativeWithLayeraW9wM$default(placementScope, placeable, a.c(jM705getContentOffsetnOccac, IntOffset.m5386getYimpl(offset), IntOffset.m5385getXimpl(jM705getContentOffsetnOccac) + IntOffset.m5385getXimpl(offset)), 0.0f, null, 6, null);
        }
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyStaggeredGridPositionedItem(long j, int i2, int i3, Object obj, long j2, List<? extends Placeable> list, boolean z, int i4) {
        this.offset = j;
        this.index = i2;
        this.lane = i3;
        this.key = obj;
        this.size = j2;
        this.placeables = list;
        this.isVertical = z;
        this.mainAxisLayoutSize = i4;
    }
}
