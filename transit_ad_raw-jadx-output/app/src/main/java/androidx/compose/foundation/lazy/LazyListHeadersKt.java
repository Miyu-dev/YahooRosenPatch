package androidx.compose.foundation.lazy;

import a.f;
import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyListHeaders.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LazyListHeadersKt {
    public static final LazyListPositionedItem findOrComposeLazyListHeader(List<LazyListPositionedItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, List<Integer> list2, int i2, int i3, int i4) {
        m.h(list, "composedVisibleItems");
        m.h(lazyMeasuredItemProvider, "itemProvider");
        m.h(list2, "headerIndexes");
        int index = ((LazyListPositionedItem) y.r1(list)).getIndex();
        int size = list2.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i5 = 0;
        while (i5 < size && list2.get(i5).intValue() <= index) {
            iIntValue = list2.get(i5).intValue();
            i5++;
            iIntValue2 = ((i5 < 0 || i5 > f.I(list2)) ? -1 : list2.get(i5)).intValue();
        }
        int size2 = list.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i6 = -1;
        for (int i7 = 0; i7 < size2; i7++) {
            LazyListPositionedItem lazyListPositionedItem = list.get(i7);
            if (lazyListPositionedItem.getIndex() == iIntValue) {
                offset = lazyListPositionedItem.getOffset();
                i6 = i7;
            } else if (lazyListPositionedItem.getIndex() == iIntValue2) {
                offset2 = lazyListPositionedItem.getOffset();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        LazyMeasuredItem lazyMeasuredItemM588getAndMeasureZjPyQlc = lazyMeasuredItemProvider.m588getAndMeasureZjPyQlc(DataIndex.m550constructorimpl(iIntValue));
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i2, offset) : -i2;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - lazyMeasuredItemM588getAndMeasureZjPyQlc.getSize());
        }
        LazyListPositionedItem lazyListPositionedItemPosition = lazyMeasuredItemM588getAndMeasureZjPyQlc.position(iMax, i3, i4);
        if (i6 != -1) {
            list.set(i6, lazyListPositionedItemPosition);
        } else {
            list.add(0, lazyListPositionedItemPosition);
        }
        return lazyListPositionedItemPosition;
    }
}
