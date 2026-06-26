package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.y;
import kotlin.jvm.internal.Ref;
import qj.d;
import qj.f;

/* JADX INFO: compiled from: LazyListMeasure.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aó\u0001\u0010,\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2*\u0010(\u001a&\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$\u0012\u0004\u0012\u00020'0#H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aL\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002\u001aS\u00104\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001a\u008c\u0001\u0010>\u001a\b\u0012\u0004\u0012\u00020=0-2\f\u00105\u001a\b\u0012\u0004\u0012\u00020.0\u00132\f\u00106\u001a\b\u0012\u0004\u0012\u00020.0\u00132\f\u00107\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\"\u0018\u0010D\u001a\u00020\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "Landroidx/compose/foundation/lazy/DataIndex;", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "beyondBoundsInfo", "beyondBoundsItemCount", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/j;", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-Hh3qtAg", "(ILandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkj/q;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "", "Landroidx/compose/foundation/lazy/LazyMeasuredItem;", "visibleItems", "createItemsAfterList", "currentFirstItemIndex", "createItemsBeforeList-tv8sHfA", "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;", "createItemsBeforeList", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "calculateItemsOffsets", "Lkotlin/Pair;", "EmptyRange", "Lkotlin/Pair;", "getNotInEmptyRange", "(I)Z", "notInEmptyRange", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyListMeasureKt {
    private static final Pair<Integer, Integer> EmptyRange = new Pair<>(Integer.MIN_VALUE, Integer.MIN_VALUE);

    private static final List<LazyListPositionedItem> calculateItemsOffsets(List<LazyMeasuredItem> list, List<LazyMeasuredItem> list2, List<LazyMeasuredItem> list3, int i2, int i3, int i4, int i5, int i6, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i7 = z ? i3 : i2;
        boolean z3 = i4 < Math.min(i7, i5);
        if (z3) {
            if (!(i6 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list3.size() + list2.size() + list.size());
        if (z3) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = list.get(calculateItemsOffsets$reverseAware(i8, z2, size)).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i9 = 0; i9 < size; i9++) {
                iArr2[i9] = 0;
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
            d fVar = new f(0, size - 1);
            if (z2) {
                fVar = new d(fVar.b, 0, -fVar.c);
            }
            int i10 = fVar.a;
            int i11 = fVar.b;
            int i12 = fVar.c;
            if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                while (true) {
                    int size2 = iArr2[i10];
                    LazyMeasuredItem lazyMeasuredItem = list.get(calculateItemsOffsets$reverseAware(i10, z2, size));
                    if (z2) {
                        size2 = (i7 - size2) - lazyMeasuredItem.getSize();
                    }
                    arrayList.add(lazyMeasuredItem.position(size2, i2, i3));
                    if (i10 == i11) {
                        break;
                    }
                    i10 += i12;
                }
            }
        } else {
            int size3 = list2.size();
            int sizeWithSpacings = i6;
            for (int i13 = 0; i13 < size3; i13++) {
                LazyMeasuredItem lazyMeasuredItem2 = list2.get(i13);
                sizeWithSpacings -= lazyMeasuredItem2.getSizeWithSpacings();
                arrayList.add(lazyMeasuredItem2.position(sizeWithSpacings, i2, i3));
            }
            int size4 = list.size();
            int sizeWithSpacings2 = i6;
            for (int i14 = 0; i14 < size4; i14++) {
                LazyMeasuredItem lazyMeasuredItem3 = list.get(i14);
                arrayList.add(lazyMeasuredItem3.position(sizeWithSpacings2, i2, i3));
                sizeWithSpacings2 += lazyMeasuredItem3.getSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i15 = 0; i15 < size5; i15++) {
                LazyMeasuredItem lazyMeasuredItem4 = list3.get(i15);
                arrayList.add(lazyMeasuredItem4.position(sizeWithSpacings2, i2, i3));
                sizeWithSpacings2 += lazyMeasuredItem4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i2, boolean z, int i3) {
        return !z ? i2 : (i3 - i2) - 1;
    }

    private static final List<LazyMeasuredItem> createItemsAfterList(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, List<LazyMeasuredItem> list, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i2, int i3, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int index = ((LazyMeasuredItem) y.z1(list)).getIndex();
        if (lazyListBeyondBoundsInfo.hasIntervals()) {
            index = Math.max(createItemsAfterList$endIndex(lazyListBeyondBoundsInfo, i2), index);
        }
        int iMin = Math.min(index + i3, i2 - 1);
        int index2 = ((LazyMeasuredItem) y.z1(list)).getIndex() + 1;
        if (index2 <= iMin) {
            while (true) {
                createItemsAfterList$addItem(objectRef, lazyMeasuredItemProvider, index2);
                if (index2 == iMin) {
                    break;
                }
                index2++;
            }
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i4 = 0; i4 < size; i4++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i4);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (iFindIndexByKey > iMin && iFindIndexByKey < i2) {
                createItemsAfterList$addItem(objectRef, lazyMeasuredItemProvider, iFindIndexByKey);
            }
        }
        List<LazyMeasuredItem> list2 = (List) objectRef.element;
        return list2 == null ? EmptyList.INSTANCE : list2;
    }

    private static final void createItemsAfterList$addItem(Ref.ObjectRef<List<LazyMeasuredItem>> objectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i2) {
        if (objectRef.element == null) {
            objectRef.element = new ArrayList();
        }
        Object obj = objectRef.element;
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ((List) obj).add(lazyMeasuredItemProvider.m588getAndMeasureZjPyQlc(DataIndex.m550constructorimpl(i2)));
    }

    private static final int createItemsAfterList$endIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i2) {
        return Math.min(lazyListBeyondBoundsInfo.getEnd(), i2 - 1);
    }

    /* JADX INFO: renamed from: createItemsBeforeList-tv8sHfA, reason: not valid java name */
    private static final List<LazyMeasuredItem> m576createItemsBeforeListtv8sHfA(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i2, LazyMeasuredItemProvider lazyMeasuredItemProvider, LazyListItemProvider lazyListItemProvider, int i3, int i4, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        int iMin = lazyListBeyondBoundsInfo.hasIntervals() ? Math.min(createItemsBeforeList_tv8sHfA$startIndex(lazyListBeyondBoundsInfo, i3), i2) : i2;
        int iMax = Math.max(0, iMin - i4);
        int i5 = i2 - 1;
        if (iMax <= i5) {
            while (true) {
                createItemsBeforeList_tv8sHfA$addItem$5(objectRef, lazyMeasuredItemProvider, i5);
                if (i5 == iMax) {
                    break;
                }
                i5--;
            }
        }
        int size = lazyLayoutPinnedItemList.size();
        for (int i6 = 0; i6 < size; i6++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = lazyLayoutPinnedItemList.get(i6);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, pinnedItem.getKey(), pinnedItem.getIndex());
            if (iFindIndexByKey < iMax) {
                createItemsBeforeList_tv8sHfA$addItem$5(objectRef, lazyMeasuredItemProvider, iFindIndexByKey);
            }
        }
        List<LazyMeasuredItem> list = (List) objectRef.element;
        return list == null ? EmptyList.INSTANCE : list;
    }

    private static final void createItemsBeforeList_tv8sHfA$addItem$5(Ref.ObjectRef<List<LazyMeasuredItem>> objectRef, LazyMeasuredItemProvider lazyMeasuredItemProvider, int i2) {
        if (objectRef.element == null) {
            objectRef.element = new ArrayList();
        }
        Object obj = objectRef.element;
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ((List) obj).add(lazyMeasuredItemProvider.m588getAndMeasureZjPyQlc(DataIndex.m550constructorimpl(i2)));
    }

    private static final int createItemsBeforeList_tv8sHfA$startIndex(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, int i2) {
        return Math.min(lazyListBeyondBoundsInfo.getStart(), i2 - 1);
    }

    private static final boolean getNotInEmptyRange(int i2) {
        return i2 != Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c5 A[PHI: r2 r4 r6 r17 r20
  0x01c5: PHI (r2v9 int) = (r2v8 int), (r2v31 int) binds: [B:59:0x0186, B:66:0x01ba] A[DONT_GENERATE, DONT_INLINE]
  0x01c5: PHI (r4v4 int) = (r4v3 int), (r4v24 int) binds: [B:59:0x0186, B:66:0x01ba] A[DONT_GENERATE, DONT_INLINE]
  0x01c5: PHI (r6v6 int) = (r6v5 int), (r6v22 int) binds: [B:59:0x0186, B:66:0x01ba] A[DONT_GENERATE, DONT_INLINE]
  0x01c5: PHI (r17v3 int) = (r17v2 int), (r17v7 int) binds: [B:59:0x0186, B:66:0x01ba] A[DONT_GENERATE, DONT_INLINE]
  0x01c5: PHI (r20v4 int) = (r20v3 int), (r20v7 int) binds: [B:59:0x0186, B:66:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: measureLazyList-Hh3qtAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.lazy.LazyListMeasureResult m577measureLazyListHh3qtAg(int r32, androidx.compose.foundation.lazy.LazyListItemProvider r33, androidx.compose.foundation.lazy.LazyMeasuredItemProvider r34, int r35, int r36, int r37, int r38, int r39, int r40, float r41, long r42, boolean r44, java.util.List<java.lang.Integer> r45, androidx.compose.foundation.layout.Arrangement.Vertical r46, androidx.compose.foundation.layout.Arrangement.Horizontal r47, boolean r48, androidx.compose.ui.unit.Density r49, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator r50, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo r51, int r52, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r53, kj.q<? super java.lang.Integer, ? super java.lang.Integer, ? super kj.l<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.j>, ? extends androidx.compose.ui.layout.MeasureResult> r54) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureKt.m577measureLazyListHh3qtAg(int, androidx.compose.foundation.lazy.LazyListItemProvider, androidx.compose.foundation.lazy.LazyMeasuredItemProvider, int, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.foundation.lazy.LazyListItemPlacementAnimator, androidx.compose.foundation.lazy.LazyListBeyondBoundsInfo, int, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, kj.q):androidx.compose.foundation.lazy.LazyListMeasureResult");
    }
}
