package androidx.compose.foundation.lazy.staggeredgrid;

import a.f;
import androidx.appcompat.R;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"findVisibleItem", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "itemIndex", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LazyStaggeredGridMeasureResultKt {
    public static final LazyStaggeredGridItemInfo findVisibleItem(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, final int i2) {
        m.h(lazyStaggeredGridLayoutInfo, "<this>");
        if (lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            return null;
        }
        if (!(i2 <= ((LazyStaggeredGridItemInfo) y.z1(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() && ((LazyStaggeredGridItemInfo) y.r1(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo())).getIndex() <= i2)) {
            return null;
        }
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        return (LazyStaggeredGridItemInfo) y.u1(f.n(visibleItemsInfo, 0, visibleItemsInfo.size(), new l<LazyStaggeredGridItemInfo, Integer>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Integer invoke(LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo) {
                m.h(lazyStaggeredGridItemInfo, "it");
                return Integer.valueOf(lazyStaggeredGridItemInfo.getIndex() - i2);
            }
        }), lazyStaggeredGridLayoutInfo.getVisibleItemsInfo());
    }
}
