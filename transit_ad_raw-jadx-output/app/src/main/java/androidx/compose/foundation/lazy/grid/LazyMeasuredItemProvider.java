package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyMeasuredItemProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ-\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "measureScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "defaultMainAxisSpacing", "", "measuredItemFactory", "Landroidx/compose/foundation/lazy/grid/MeasuredItemFactory;", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/lazy/grid/MeasuredItemFactory;)V", "keyToIndexMap", "", "getKeyToIndexMap", "()Ljava/util/Map;", "getAndMeasure", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "index", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "mainAxisSpacing", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getAndMeasure-ednRnyU", "(IIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LazyMeasuredItemProvider {
    private final int defaultMainAxisSpacing;
    private final LazyGridItemProvider itemProvider;
    private final LazyLayoutMeasureScope measureScope;
    private final MeasuredItemFactory measuredItemFactory;

    @ExperimentalFoundationApi
    public LazyMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, MeasuredItemFactory measuredItemFactory) {
        m.h(lazyGridItemProvider, "itemProvider");
        m.h(lazyLayoutMeasureScope, "measureScope");
        m.h(measuredItemFactory, "measuredItemFactory");
        this.itemProvider = lazyGridItemProvider;
        this.measureScope = lazyLayoutMeasureScope;
        this.defaultMainAxisSpacing = i2;
        this.measuredItemFactory = measuredItemFactory;
    }

    /* JADX INFO: renamed from: getAndMeasure-ednRnyU$default, reason: not valid java name */
    public static /* synthetic */ LazyGridMeasuredItem m651getAndMeasureednRnyU$default(LazyMeasuredItemProvider lazyMeasuredItemProvider, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = lazyMeasuredItemProvider.defaultMainAxisSpacing;
        }
        return lazyMeasuredItemProvider.m652getAndMeasureednRnyU(i2, i3, j);
    }

    /* JADX INFO: renamed from: getAndMeasure-ednRnyU, reason: not valid java name */
    public final LazyGridMeasuredItem m652getAndMeasureednRnyU(int index, int mainAxisSpacing, long constraints) {
        int iM5236getMinHeightimpl;
        Object key = this.itemProvider.getKey(index);
        List<Placeable> listMo678measure0kLqBqw = this.measureScope.mo678measure0kLqBqw(index, constraints);
        if (Constraints.m5233getHasFixedWidthimpl(constraints)) {
            iM5236getMinHeightimpl = Constraints.m5237getMinWidthimpl(constraints);
        } else {
            if (!Constraints.m5232getHasFixedHeightimpl(constraints)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            iM5236getMinHeightimpl = Constraints.m5236getMinHeightimpl(constraints);
        }
        return this.measuredItemFactory.mo636createItemPU_OBEw(index, key, iM5236getMinHeightimpl, mainAxisSpacing, listMo678measure0kLqBqw);
    }

    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.itemProvider.getKeyToIndexMap();
    }
}
