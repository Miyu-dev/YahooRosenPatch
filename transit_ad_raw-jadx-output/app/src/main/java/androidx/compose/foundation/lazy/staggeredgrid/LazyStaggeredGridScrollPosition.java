package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.e;
import qj.f;

/* JADX INFO: compiled from: LazyStaggeredGridScrollPosition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "", "", "indices", "offsets", "Lkotlin/j;", "update", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "measureResult", "updateFromMeasureResult", "", "index", "scrollOffset", "requestPosition", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "Lkotlin/Function2;", "fillIndices", "Lkj/p;", "<set-?>", "indices$delegate", "Landroidx/compose/runtime/MutableState;", "getIndices", "()[I", "setIndices", "([I)V", "offsets$delegate", "getOffsets", "setOffsets", "", "hadFirstNotEmptyLayout", "Z", "lastKnownFirstItemKey", "Ljava/lang/Object;", "initialIndices", "initialOffsets", "<init>", "([I[ILkj/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyStaggeredGridScrollPosition {
    private final p<Integer, Integer, int[]> fillIndices;
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: indices$delegate, reason: from kotlin metadata */
    private final MutableState indices;
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: offsets$delegate, reason: from kotlin metadata */
    private final MutableState offsets;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, p<? super Integer, ? super Integer, int[]> pVar) {
        m.h(iArr, "initialIndices");
        m.h(iArr2, "initialOffsets");
        m.h(pVar, "fillIndices");
        this.fillIndices = pVar;
        this.indices = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(iArr, null, 2, null);
        this.offsets = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(iArr2, null, 2, null);
    }

    private final void update(int[] iArr, int[] iArr2) {
        if (!Arrays.equals(iArr, getIndices())) {
            setIndices(iArr);
        }
        if (Arrays.equals(iArr2, getOffsets())) {
            return;
        }
        setOffsets(iArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] getIndices() {
        return (int[]) this.indices.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] getOffsets() {
        return (int[]) this.offsets.getValue();
    }

    public final void requestPosition(int i2, int i3) {
        int[] iArr = (int[]) this.fillIndices.invoke(Integer.valueOf(i2), Integer.valueOf(getIndices().length));
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = i3;
        }
        update(iArr, iArr2);
        this.lastKnownFirstItemKey = null;
    }

    public final void setIndices(int[] iArr) {
        m.h(iArr, "<set-?>");
        this.indices.setValue(iArr);
    }

    public final void setOffsets(int[] iArr) {
        m.h(iArr, "<set-?>");
        this.offsets.setValue(iArr);
    }

    public final void updateFromMeasureResult(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo;
        m.h(lazyStaggeredGridMeasureResult, "measureResult");
        int[] firstVisibleItemIndices = lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices();
        if (firstVisibleItemIndices.length == 0) {
            throw new NoSuchElementException();
        }
        int i2 = firstVisibleItemIndices[0];
        int length = firstVisibleItemIndices.length - 1;
        if (length != 0) {
            int i3 = i2 == -1 ? Integer.MAX_VALUE : i2;
            e eVarD = new f(1, length).d();
            while (eVarD.c) {
                int i4 = firstVisibleItemIndices[eVarD.nextInt()];
                int i5 = i4 == -1 ? Integer.MAX_VALUE : i4;
                if (i3 > i5) {
                    i2 = i4;
                    i3 = i5;
                }
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = 0;
        }
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridMeasureResult.getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                lazyStaggeredGridItemInfo = null;
                break;
            }
            lazyStaggeredGridItemInfo = visibleItemsInfo.get(i6);
            if (lazyStaggeredGridItemInfo.getIndex() == i2) {
                break;
            } else {
                i6++;
            }
        }
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo2 = lazyStaggeredGridItemInfo;
        this.lastKnownFirstItemKey = lazyStaggeredGridItemInfo2 != null ? lazyStaggeredGridItemInfo2.getKey() : null;
        if (this.hadFirstNotEmptyLayout || lazyStaggeredGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    update(lazyStaggeredGridMeasureResult.getFirstVisibleItemIndices(), lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
                    j jVar = j.a;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                snapshotCreateNonObservableSnapshot.dispose();
            }
        }
    }

    @ExperimentalFoundationApi
    public final void updateScrollPositionIfTheFirstItemWasMoved(LazyLayoutItemProvider lazyLayoutItemProvider) {
        m.h(lazyLayoutItemProvider, "itemProvider");
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                Object obj = this.lastKnownFirstItemKey;
                Integer numG0 = kotlin.collections.p.G0(0, getIndices());
                int iFindIndexByKey = LazyLayoutItemProviderKt.findIndexByKey(lazyLayoutItemProvider, obj, numG0 != null ? numG0.intValue() : 0);
                int[] indices = getIndices();
                m.h(indices, "<this>");
                if (!(kotlin.collections.p.I0(iFindIndexByKey, indices) >= 0)) {
                    update((int[]) this.fillIndices.invoke(Integer.valueOf(iFindIndexByKey), Integer.valueOf(getIndices().length)), getOffsets());
                }
                j jVar = j.a;
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            snapshotCreateNonObservableSnapshot.dispose();
        }
    }
}
