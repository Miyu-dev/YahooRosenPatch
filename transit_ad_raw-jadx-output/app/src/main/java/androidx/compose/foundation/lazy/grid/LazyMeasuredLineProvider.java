package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyMeasuredLineProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "", "isVertical", "", "slotSizesSums", "", "", "crossAxisSpacing", "gridItemsCount", "spaceBetweenLines", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "measuredLineFactory", "Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;", "(ZLjava/util/List;IIILandroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;)V", "keyToIndexMap", "", "getKeyToIndexMap", "()Ljava/util/Map;", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "startSlot", "span", "childConstraints-JhjzzOo$foundation_release", "(II)J", "getAndMeasure", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "getAndMeasure-bKFJvoY", "(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemConstraints", "itemIndex", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "itemConstraints-HZ0wssc", "(I)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LazyMeasuredLineProvider {
    private final int crossAxisSpacing;
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyMeasuredItemProvider measuredItemProvider;
    private final MeasuredLineFactory measuredLineFactory;
    private final List<Integer> slotSizesSums;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyMeasuredLineProvider(boolean z, List<Integer> list, int i2, int i3, int i4, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, MeasuredLineFactory measuredLineFactory) {
        m.h(list, "slotSizesSums");
        m.h(lazyMeasuredItemProvider, "measuredItemProvider");
        m.h(lazyGridSpanLayoutProvider, "spanLayoutProvider");
        m.h(measuredLineFactory, "measuredLineFactory");
        this.isVertical = z;
        this.slotSizesSums = list;
        this.crossAxisSpacing = i2;
        this.gridItemsCount = i3;
        this.spaceBetweenLines = i4;
        this.measuredItemProvider = lazyMeasuredItemProvider;
        this.spanLayoutProvider = lazyGridSpanLayoutProvider;
        this.measuredLineFactory = measuredLineFactory;
    }

    /* JADX INFO: renamed from: childConstraints-JhjzzOo$foundation_release, reason: not valid java name */
    public final long m653childConstraintsJhjzzOo$foundation_release(int startSlot, int span) {
        int iIntValue = ((span - 1) * this.crossAxisSpacing) + (this.slotSizesSums.get((startSlot + span) - 1).intValue() - (startSlot == 0 ? 0 : this.slotSizesSums.get(startSlot - 1).intValue()));
        int i2 = iIntValue >= 0 ? iIntValue : 0;
        return this.isVertical ? Constraints.INSTANCE.m5245fixedWidthOenEA2s(i2) : Constraints.INSTANCE.m5244fixedHeightOenEA2s(i2);
    }

    /* JADX INFO: renamed from: getAndMeasure-bKFJvoY, reason: not valid java name */
    public final LazyGridMeasuredLine m654getAndMeasurebKFJvoY(int lineIndex) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(lineIndex);
        int size = lineConfiguration.getSpans().size();
        int i2 = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int iM597getCurrentLineSpanimpl = GridItemSpan.m597getCurrentLineSpanimpl(lineConfiguration.getSpans().get(i4).getPackedValue());
            LazyGridMeasuredItem lazyGridMeasuredItemM652getAndMeasureednRnyU = this.measuredItemProvider.m652getAndMeasureednRnyU(ItemIndex.m603constructorimpl(lineConfiguration.getFirstItemIndex() + i4), i2, m653childConstraintsJhjzzOo$foundation_release(i3, iM597getCurrentLineSpanimpl));
            i3 += iM597getCurrentLineSpanimpl;
            j jVar = j.a;
            lazyGridMeasuredItemArr[i4] = lazyGridMeasuredItemM652getAndMeasureednRnyU;
        }
        return this.measuredLineFactory.mo637createLineH9FfpSk(lineIndex, lazyGridMeasuredItemArr, lineConfiguration.getSpans(), i2);
    }

    public final Map<Object, Integer> getKeyToIndexMap() {
        return this.measuredItemProvider.getKeyToIndexMap();
    }

    /* JADX INFO: renamed from: itemConstraints-HZ0wssc, reason: not valid java name */
    public final long m655itemConstraintsHZ0wssc(int itemIndex) {
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider = this.spanLayoutProvider;
        return m653childConstraintsJhjzzOo$foundation_release(0, lazyGridSpanLayoutProvider.spanOf(itemIndex, lazyGridSpanLayoutProvider.getSlotsPerLine()));
    }
}
