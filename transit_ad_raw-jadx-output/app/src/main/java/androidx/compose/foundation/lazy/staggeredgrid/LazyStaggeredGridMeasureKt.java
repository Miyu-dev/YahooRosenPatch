package androidx.compose.foundation.lazy.staggeredgrid;

import a.f;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.List;
import kj.a;
import kj.l;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.k;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a2\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003H\u0083\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\n*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0082\b\u001ay\u0010'\u001a\u00020$*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a,\u0010-\u001a\u00020$*\u00020(2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0019H\u0003\u001a=\u00103\u001a\b\u0012\u0004\u0012\u00020201*\u00020(2\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u001eH\u0002¢\u0006\u0004\b3\u00104\u001a;\u00107\u001a\b\u0012\u0004\u0012\u00020201*\u00020(2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u0002020\u00032\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00190\u0003H\u0083\b\u001a.\u0010;\u001a\u00020\u000f*\u0002082\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u0003H\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001a\u0014\u0010=\u001a\u00020\u000f*\u00020\u00152\u0006\u0010<\u001a\u00020\u001eH\u0002\u001a!\u0010A\u001a\u00020\u001e*\u00020\u00152\u0006\u0010>\u001a\u000208H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@\u001a\u0016\u0010C\u001a\u00020\u001e*\u00020\u00152\b\b\u0002\u0010B\u001a\u00020\u001eH\u0000\u001a4\u0010D\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0\u0003H\u0082\b¢\u0006\u0004\bD\u0010E\u001a\f\u0010F\u001a\u00020\u001e*\u00020\u0015H\u0002\u001a!\u0010G\u001a\u00020\u0015*\u00020\u00152\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u0003H\u0082\b\u001a\u001c\u0010J\u001a\u00020\u000f*\u00020(2\u0006\u0010H\u001a\u00020\u00152\u0006\u0010I\u001a\u00020\u001eH\u0002\u001a\u001c\u0010M\u001a\u00020\u001e*\u00020(2\u0006\u0010K\u001a\u00020\u001e2\u0006\u0010L\u001a\u00020\u001eH\u0002\"\u0014\u0010N\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006P"}, d2 = {"T", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "scope", "Lkotlin/Function1;", "block", "withDebugLogging", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkj/l;)Ljava/lang/Object;", "", "Lkotlin/collections/k;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "", "debugRender", "([Lkotlin/collections/k;)Ljava/lang/String;", "Lkotlin/Function0;", "message", "Lkotlin/j;", "debugLog", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "", "resolvedSlotSums", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "reverseLayout", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "", "mainAxisAvailableSize", "mainAxisSpacing", "crossAxisSpacing", "beforeContentPadding", "afterContentPadding", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid-BTfHGGE", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;[IJZZJIIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureStaggeredGrid", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measure", "measuredItems", "itemScrollOffsets", "mainAxisLayoutSize", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;", "calculatePositionedItems", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/k;[II)Ljava/util/List;", "position", "filter", "calculateExtraItems", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkj/l;)V", "forEach", "delta", "offsetBy", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "maxInRange", "minBound", "indexOfMinValue", "indexOfMinBy", "([Ljava/lang/Object;Lkj/l;)I", "indexOfMaxValue", "transform", "indices", "itemCount", "ensureIndicesInRange", "item", "lane", "findPreviousItemIndex", "DebugLoggingEnabled", "Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;

    @ExperimentalFoundationApi
    private static final List<LazyStaggeredGridPositionedItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, l<? super LazyStaggeredGridMeasuredItem, LazyStaggeredGridPositionedItem> lVar, l<? super Integer, Boolean> lVar2) {
        LazyLayoutPinnedItemList pinnedItems = lazyStaggeredGridMeasureContext.getState().getPinnedItems();
        int size = pinnedItems.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutPinnedItemList.PinnedItem pinnedItem = pinnedItems.get(i2);
            int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyStaggeredGridMeasureContext.getItemProvider(), pinnedItem.getKey(), pinnedItem.getIndex());
            if (((Boolean) lVar2.invoke(Integer.valueOf(iFindIndexByKey))).booleanValue()) {
                long jM707getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m707getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iFindIndexByKey, 0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lVar.invoke(lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m715getAndMeasurejy6DScQ(iFindIndexByKey, jM707getSpanRangelOCCd4c)));
            }
        }
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    private static final List<LazyStaggeredGridPositionedItem> calculatePositionedItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, k<LazyStaggeredGridMeasuredItem>[] kVarArr, int[] iArr, int i2) {
        boolean z;
        int size = 0;
        for (k<LazyStaggeredGridMeasuredItem> kVar : kVarArr) {
            size += kVar.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            int length = kVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = false;
                    break;
                }
                z = true;
                if (!kVarArr[i3].isEmpty()) {
                    break;
                }
                i3++;
            }
            if (!z) {
                return arrayList;
            }
            int length2 = kVarArr.length;
            int i4 = -1;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < length2; i6++) {
                k<LazyStaggeredGridMeasuredItem> kVar2 = kVarArr[i6];
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) (kVar2.isEmpty() ? null : kVar2.b[kVar2.a]);
                int index = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getIndex() : Integer.MAX_VALUE;
                if (i5 > index) {
                    i4 = i6;
                    i5 = index;
                }
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) kVarArr[i4].removeFirst();
            if (lazyStaggeredGridMeasuredItem2.getLane() == i4) {
                long jM721constructorimpl = SpanRange.m721constructorimpl(lazyStaggeredGridMeasuredItem2.getLane(), lazyStaggeredGridMeasuredItem2.getSpan());
                int iM710maxInRangejy6DScQ = m710maxInRangejy6DScQ(iArr, jM721constructorimpl);
                int crossAxisSpacing = i4 == 0 ? 0 : (lazyStaggeredGridMeasureContext.getCrossAxisSpacing() * i4) + lazyStaggeredGridMeasureContext.getResolvedSlotSums()[i4 - 1];
                if (!lazyStaggeredGridMeasuredItem2.getPlaceables().isEmpty()) {
                    arrayList.add(lazyStaggeredGridMeasuredItem2.position(i4, iM710maxInRangejy6DScQ, crossAxisSpacing, i2));
                    int i7 = (int) (jM721constructorimpl & 4294967295L);
                    for (int i8 = (int) (jM721constructorimpl >> 32); i8 < i7; i8++) {
                        iArr[i8] = lazyStaggeredGridMeasuredItem2.getSizeWithSpacings() + iM710maxInRangejy6DScQ;
                    }
                }
            }
        }
    }

    private static final String debugRender(k<LazyStaggeredGridMeasuredItem>[] kVarArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i2) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            while (true) {
                if (iArr[length] < i2 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i2, int i3) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i2, i3);
    }

    /* JADX INFO: renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m709forEachnIS5qE8(long j, l<? super Integer, j> lVar) {
        int i2 = (int) (j & 4294967295L);
        for (int i3 = (int) (j >> 32); i3 < i2; i3++) {
            lVar.invoke(Integer.valueOf(i3));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i3 < i5) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, l<? super T, Integer> lVar) {
        int length = tArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int iIntValue = ((Number) lVar.invoke(tArr[i4])).intValue();
            if (i3 > iIntValue) {
                i2 = i4;
                i3 = iIntValue;
            }
        }
        return i2;
    }

    public static final int indexOfMinValue(int[] iArr, int i2) {
        m.h(iArr, "<this>");
        int length = iArr.length;
        int i3 = -1;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i2 + 1;
            int i7 = iArr[i5];
            if (i6 <= i7 && i7 < i4) {
                i3 = i5;
                i4 = i7;
            }
        }
        return i3;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i2);
    }

    /* JADX INFO: renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m710maxInRangejy6DScQ(int[] iArr, long j) {
        int i2 = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i2; i3++) {
            iMax = Math.max(iMax, iArr[i3]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:326:0x062b, code lost:
    
        if (r3[r11] < r9) goto L327;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06c4  */
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r30, int r31, int[] r32, int[] r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 2063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$37$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (iArr2[i2] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i3 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$37$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) == -1 && iArr2[i3] != iArr2[i2]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i4], i4) != -1 && iArr2[i4] >= iArr2[i2]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    @ExperimentalFoundationApi
    /* JADX INFO: renamed from: measureStaggeredGrid-BTfHGGE, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m711measureStaggeredGridBTfHGGE(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int[] iArr, long j, boolean z, boolean z2, long j2, int i2, int i3, int i4, int i5, int i6) {
        int iM710maxInRangejy6DScQ;
        m.h(lazyLayoutMeasureScope, "$this$measureStaggeredGrid");
        m.h(lazyStaggeredGridState, "state");
        m.h(lazyStaggeredGridItemProvider, "itemProvider");
        m.h(iArr, "resolvedSlotSums");
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, lazyStaggeredGridItemProvider, iArr, j, z, lazyLayoutMeasureScope, i2, j2, i5, i6, z2, i3, i4, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                int[] indices = lazyStaggeredGridState.getScrollPosition().getIndices();
                int[] offsets = lazyStaggeredGridState.getScrollPosition().getOffsets();
                if (indices.length != iArr.length) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    int length = iArr.length;
                    int[] iArr2 = new int[length];
                    int i7 = 0;
                    while (i7 < length) {
                        if (i7 >= indices.length || (iM710maxInRangejy6DScQ = indices[i7]) == -1) {
                            iM710maxInRangejy6DScQ = i7 == 0 ? 0 : m710maxInRangejy6DScQ(iArr2, SpanRange.m721constructorimpl(0, i7)) + 1;
                        }
                        iArr2[i7] = iM710maxInRangejy6DScQ;
                        lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr2[i7], i7);
                        i7++;
                    }
                    indices = iArr2;
                }
                objectRef.element = indices;
                if (offsets.length != iArr.length) {
                    int length2 = iArr.length;
                    int[] iArr3 = new int[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        iArr3[i8] = i8 < offsets.length ? offsets[i8] : i8 == 0 ? 0 : iArr3[i8 - 1];
                        i8++;
                    }
                    offsets = iArr3;
                }
                objectRef2.element = offsets;
                j jVar = j.a;
                snapshotCreateNonObservableSnapshot.dispose();
                return measure(lazyStaggeredGridMeasureContext, f.f0(lazyStaggeredGridState.getScrollToBeConsumed()), (int[]) objectRef.element, (int[]) objectRef2.element, true);
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } catch (Throwable th) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th;
        }
    }

    private static final void offsetBy(int[] iArr, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = iArr[i3] + i2;
        }
    }

    private static final int[] transform(int[] iArr, l<? super Integer, Integer> lVar) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = ((Number) lVar.invoke(Integer.valueOf(iArr[i2]))).intValue();
        }
        return iArr;
    }

    @ExperimentalFoundationApi
    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, l<? super LazyLayoutMeasureScope, ? extends T> lVar) {
        return (T) lVar.invoke(lazyLayoutMeasureScope);
    }

    private static final void debugLog(a<String> aVar) {
    }
}
