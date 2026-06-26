package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import dj.c;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyGridAnimateScrollScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J7\u0010\u0017\u001a\u00020\u000e2\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010&\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0014\u0010(\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0014\u0010*\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollScope;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "visibleItems", "", "isVertical", "", "calculateLineAverageMainAxisSize", "index", "getTargetItemOffset", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollOffset", "Lkotlin/j;", "snapToItem", "targetScrollOffset", "", "expectedDistanceTo", "Lkotlin/Function2;", "Ldj/c;", "", "block", "scroll", "(Lkj/p;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLastVisibleItemIndex", "lastVisibleItemIndex", "getItemCount", "itemCount", "getNumOfItemsForTeleport", "numOfItemsForTeleport", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyGridAnimateScrollScope implements LazyAnimateScrollScope {
    private final LazyGridState state;

    public LazyGridAnimateScrollScope(LazyGridState lazyGridState) {
        m.h(lazyGridState, "state");
        this.state = lazyGridState;
    }

    private final int calculateLineAverageMainAxisSize(final List<? extends LazyGridItemInfo> visibleItems, final boolean isVertical) {
        l<Integer, Integer> lVar = new l<Integer, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Integer invoke(int i2) {
                return Integer.valueOf(isVertical ? visibleItems.get(i2).getRow() : visibleItems.get(i2).getColumn());
            }
        };
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < visibleItems.size()) {
            int iIntValue = ((Number) lVar.invoke(Integer.valueOf(i2))).intValue();
            if (iIntValue == -1) {
                i2++;
            } else {
                int iMax = 0;
                while (i2 < visibleItems.size() && ((Number) lVar.invoke(Integer.valueOf(i2))).intValue() == iIntValue) {
                    iMax = Math.max(iMax, isVertical ? IntSize.m5426getHeightimpl(visibleItems.get(i2).getSize()) : IntSize.m5427getWidthimpl(visibleItems.get(i2).getSize()));
                    i2++;
                }
                i3 += iMax;
                i4++;
            }
        }
        return i3 / i4;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float expectedDistanceTo(int index, int targetScrollOffset) {
        List<LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int slotsPerLine$foundation_release = this.state.getSlotsPerLine$foundation_release();
        int iCalculateLineAverageMainAxisSize = calculateLineAverageMainAxisSize(visibleItemsInfo, this.state.isVertical$foundation_release());
        int firstVisibleItemIndex = (((slotsPerLine$foundation_release - 1) * (index < getFirstVisibleItemIndex() ? -1 : 1)) + (index - getFirstVisibleItemIndex())) / slotsPerLine$foundation_release;
        int iMin = Math.min(Math.abs(targetScrollOffset), iCalculateLineAverageMainAxisSize);
        if (targetScrollOffset < 0) {
            iMin *= -1;
        }
        return ((iCalculateLineAverageMainAxisSize * firstVisibleItemIndex) + iMin) - getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Density getDensity() {
        return this.state.getDensity$foundation_release();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getFirstVisibleItemScrollOffset() {
        return this.state.getFirstVisibleItemScrollOffset();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getLastVisibleItemIndex() {
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) y.A1(this.state.getLayoutInfo().getVisibleItemsInfo());
        if (lazyGridItemInfo != null) {
            return lazyGridItemInfo.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getNumOfItemsForTeleport() {
        return this.state.getSlotsPerLine$foundation_release() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Integer getTargetItemOffset(int index) {
        LazyGridItemInfo lazyGridItemInfo;
        List<LazyGridItemInfo> visibleItemsInfo = this.state.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                lazyGridItemInfo = null;
                break;
            }
            lazyGridItemInfo = visibleItemsInfo.get(i2);
            if (lazyGridItemInfo.getIndex() == index) {
                break;
            }
            i2++;
        }
        LazyGridItemInfo lazyGridItemInfo2 = lazyGridItemInfo;
        if (lazyGridItemInfo2 != null) {
            return Integer.valueOf(this.state.isVertical$foundation_release() ? IntOffset.m5386getYimpl(lazyGridItemInfo2.getOffset()) : IntOffset.m5385getXimpl(lazyGridItemInfo2.getOffset()));
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public Object scroll(p<? super ScrollScope, ? super c<? super j>, ? extends Object> pVar, c<? super j> cVar) {
        Object objE = androidx.compose.foundation.gestures.c.e(this.state, null, pVar, cVar, 1, null);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : j.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void snapToItem(ScrollScope scrollScope, int i2, int i3) {
        m.h(scrollScope, "<this>");
        this.state.snapToItemIndexInternal$foundation_release(i2, i3);
    }
}
