package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import qj.d;
import qj.f;

/* JADX INFO: compiled from: LazyGridMeasure.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aå\u0001\u0010+\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2*\u0010'\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#\u0012\u0004\u0012\u00020&0\"H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aR\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00110#2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130#H\u0083\bø\u0001\u0001\u001a\u008c\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020/2\f\u00104\u001a\b\u0012\u0004\u0012\u0002000/2\f\u00105\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001a$\u0010?\u001a\u00020<*\u0002002\u0006\u0010>\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0000H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/j;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-t5wl_D8", "(ILandroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkj/q;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "itemConstraints", "filter", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "calculateExtraItems", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "calculateItemsOffsets", "mainAxisOffset", "positionExtraItem", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyGridMeasureKt {
    @ExperimentalFoundationApi
    private static final List<LazyGridMeasuredItem> calculateExtraItems(LazyLayoutPinnedItemList lazyLayoutPinnedItemList, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyGridItemProvider lazyGridItemProvider, l<? super ItemIndex, Constraints> lVar, l<? super Integer, Boolean> lVar2) {
        int size = lazyLayoutPinnedItemList.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i2);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (((Boolean) lVar2.invoke(Integer.valueOf(iFindIndexByKey))).booleanValue()) {
                int iM603constructorimpl = ItemIndex.m603constructorimpl(iFindIndexByKey);
                LazyGridMeasuredItem lazyGridMeasuredItemM651getAndMeasureednRnyU$default = LazyMeasuredItemProvider.m651getAndMeasureednRnyU$default(lazyMeasuredItemProvider, iM603constructorimpl, 0, ((Constraints) lVar.invoke(ItemIndex.m601boximpl(iM603constructorimpl))).getValue(), 2, null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemM651getAndMeasureednRnyU$default);
            }
        }
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    private static final List<LazyGridPositionedItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i2, int i3, int i4, int i5, int i6, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i7 = z ? i3 : i2;
        boolean z3 = i4 < Math.min(i7, i5);
        if (z3) {
            if (!(i6 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        int size = list.size();
        int length = 0;
        for (int i8 = 0; i8 < size; i8++) {
            length += list.get(i8).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z3) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr[i9] = list.get(calculateItemsOffsets$reverseAware(i9, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                iArr2[i10] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i7, iArr, iArr2);
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                horizontal.arrange(density, i7, iArr, LayoutDirection.Ltr, iArr2);
            }
            d fVar = new f(0, size2 - 1);
            if (z2) {
                fVar = new d(fVar.b, 0, -fVar.c);
            }
            int i11 = fVar.a;
            int i12 = fVar.b;
            int i13 = fVar.c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (true) {
                    int mainAxisSize = iArr2[i11];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(i11, z2, size2));
                    if (z2) {
                        mainAxisSize = (i7 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    arrayList.addAll(lazyGridMeasuredLine.position(mainAxisSize, i2, i3));
                    if (i11 == i12) {
                        break;
                    }
                    i11 += i13;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i6;
            for (int i14 = 0; i14 < size3; i14++) {
                LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(i14);
                mainAxisSizeWithSpacings -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                arrayList.add(positionExtraItem(lazyGridMeasuredItem, mainAxisSizeWithSpacings, i2, i3));
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i6;
            for (int i15 = 0; i15 < size4; i15++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i15);
                arrayList.addAll(lazyGridMeasuredLine2.position(mainAxisSizeWithSpacings2, i2, i3));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i16 = 0; i16 < size5; i16++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i16);
                arrayList.add(positionExtraItem(lazyGridMeasuredItem2, mainAxisSizeWithSpacings2, i2, i3));
                mainAxisSizeWithSpacings2 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i2, boolean z, int i3) {
        return !z ? i2 : (i3 - i2) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dc  */
    /* JADX INFO: renamed from: measureLazyGrid-t5wl_D8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureResult m638measureLazyGridt5wl_D8(int r35, androidx.compose.foundation.lazy.grid.LazyGridItemProvider r36, androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider r37, androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider r38, int r39, int r40, int r41, int r42, int r43, int r44, float r45, long r46, boolean r48, androidx.compose.foundation.layout.Arrangement.Vertical r49, androidx.compose.foundation.layout.Arrangement.Horizontal r50, boolean r51, androidx.compose.ui.unit.Density r52, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator r53, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider r54, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r55, kj.q<? super java.lang.Integer, ? super java.lang.Integer, ? super kj.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.j>, ? extends androidx.compose.ui.layout.MeasureResult> r56) {
        /*
            Method dump skipped, instruction units count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.m638measureLazyGridt5wl_D8(int, androidx.compose.foundation.lazy.grid.LazyGridItemProvider, androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider, androidx.compose.foundation.lazy.grid.LazyMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator, androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, kj.q):androidx.compose.foundation.lazy.grid.LazyGridMeasureResult");
    }

    private static final LazyGridPositionedItem positionExtraItem(LazyGridMeasuredItem lazyGridMeasuredItem, int i2, int i3, int i4) {
        return lazyGridMeasuredItem.position(i2, 0, i3, i4, 0, 0);
    }
}
