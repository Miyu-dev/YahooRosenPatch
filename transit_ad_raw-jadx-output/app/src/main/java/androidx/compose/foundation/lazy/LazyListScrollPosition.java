package androidx.compose.foundation.lazy;

import androidx.appcompat.app.m;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazyListScrollPosition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\bJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007R4\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "Landroidx/compose/foundation/lazy/DataIndex;", "index", "", "scrollOffset", "Lkotlin/j;", "update-AhXoVpI", "(II)V", "update", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureResult", "updateFromMeasureResult", "requestPosition-AhXoVpI", "requestPosition", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableState;", "getIndex-jQJCoq8", "()I", "setIndex-ZjPyQlc", "(I)V", "scrollOffset$delegate", "getScrollOffset", "setScrollOffset", "", "hadFirstNotEmptyLayout", "Z", "lastKnownFirstItemKey", "Ljava/lang/Object;", "initialIndex", "initialScrollOffset", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyListScrollPosition {
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: index$delegate, reason: from kotlin metadata */
    private final MutableState index;
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    private final MutableState scrollOffset;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyListScrollPosition() {
        int i2 = 0;
        this(i2, i2, 3, null);
    }

    private final void setScrollOffset(int i2) {
        this.scrollOffset.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: update-AhXoVpI, reason: not valid java name */
    private final void m581updateAhXoVpI(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            throw new IllegalArgumentException(m.h("Index should be non-negative (", index, ')').toString());
        }
        if (!DataIndex.m553equalsimpl0(index, m582getIndexjQJCoq8())) {
            m584setIndexZjPyQlc(index);
        }
        if (scrollOffset != getScrollOffset()) {
            setScrollOffset(scrollOffset);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getIndex-jQJCoq8, reason: not valid java name */
    public final int m582getIndexjQJCoq8() {
        return ((DataIndex) this.index.getValue()).m560unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getScrollOffset() {
        return ((Number) this.scrollOffset.getValue()).intValue();
    }

    /* JADX INFO: renamed from: requestPosition-AhXoVpI, reason: not valid java name */
    public final void m583requestPositionAhXoVpI(int index, int scrollOffset) {
        m581updateAhXoVpI(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    /* JADX INFO: renamed from: setIndex-ZjPyQlc, reason: not valid java name */
    public final void m584setIndexZjPyQlc(int i2) {
        this.index.setValue(DataIndex.m548boximpl(i2));
    }

    public final void updateFromMeasureResult(LazyListMeasureResult lazyListMeasureResult) {
        kotlin.jvm.internal.m.h(lazyListMeasureResult, "measureResult");
        LazyMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem != null ? firstVisibleItem.getKey() : null;
        if (this.hadFirstNotEmptyLayout || lazyListMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = lazyListMeasureResult.getFirstVisibleItemScrollOffset();
            if (!(((float) firstVisibleItemScrollOffset) >= 0.0f)) {
                throw new IllegalStateException(m.h("scrollOffset should be non-negative (", firstVisibleItemScrollOffset, ')').toString());
            }
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    LazyMeasuredItem firstVisibleItem2 = lazyListMeasureResult.getFirstVisibleItem();
                    m581updateAhXoVpI(DataIndex.m550constructorimpl(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0), firstVisibleItemScrollOffset);
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
    public final void updateScrollPositionIfTheFirstItemWasMoved(LazyListItemProvider lazyListItemProvider) {
        kotlin.jvm.internal.m.h(lazyListItemProvider, "itemProvider");
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                m581updateAhXoVpI(DataIndex.m550constructorimpl(LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider, this.lastKnownFirstItemKey, m582getIndexjQJCoq8())), getScrollOffset());
                j jVar = j.a;
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            snapshotCreateNonObservableSnapshot.dispose();
        }
    }

    public LazyListScrollPosition(int i2, int i3) {
        this.index = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DataIndex.m548boximpl(DataIndex.m550constructorimpl(i2)), null, 2, null);
        this.scrollOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i3), null, 2, null);
    }

    public /* synthetic */ LazyListScrollPosition(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
