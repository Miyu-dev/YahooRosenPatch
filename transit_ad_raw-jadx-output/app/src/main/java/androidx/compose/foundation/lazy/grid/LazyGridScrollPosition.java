package androidx.compose.foundation.lazy.grid;

import androidx.appcompat.app.m;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazyGridScrollPosition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\bJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ#\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fR4\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028F@BX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "index", "", "scrollOffset", "Lkotlin/j;", "update-yO3Fmg4", "(II)V", "update", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureResult", "updateFromMeasureResult", "requestPosition-yO3Fmg4", "requestPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "<set-?>", "index$delegate", "Landroidx/compose/runtime/MutableState;", "getIndex-VZbfaAc", "()I", "setIndex-YGsSkvE", "(I)V", "scrollOffset$delegate", "getScrollOffset", "setScrollOffset", "", "hadFirstNotEmptyLayout", "Z", "lastKnownFirstItemKey", "Ljava/lang/Object;", "initialIndex", "initialScrollOffset", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyGridScrollPosition {
    private boolean hadFirstNotEmptyLayout;

    /* JADX INFO: renamed from: index$delegate, reason: from kotlin metadata */
    private final MutableState index;
    private Object lastKnownFirstItemKey;

    /* JADX INFO: renamed from: scrollOffset$delegate, reason: from kotlin metadata */
    private final MutableState scrollOffset;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyGridScrollPosition() {
        int i2 = 0;
        this(i2, i2, 3, null);
    }

    /* JADX INFO: renamed from: setIndex-YGsSkvE, reason: not valid java name */
    private final void m644setIndexYGsSkvE(int i2) {
        this.index.setValue(ItemIndex.m601boximpl(i2));
    }

    private final void setScrollOffset(int i2) {
        this.scrollOffset.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: update-yO3Fmg4, reason: not valid java name */
    private final void m645updateyO3Fmg4(int index, int scrollOffset) {
        if (!(((float) index) >= 0.0f)) {
            throw new IllegalArgumentException(m.h("Index should be non-negative (", index, ')').toString());
        }
        if (!ItemIndex.m606equalsimpl0(index, m646getIndexVZbfaAc())) {
            m644setIndexYGsSkvE(index);
        }
        if (scrollOffset != getScrollOffset()) {
            setScrollOffset(scrollOffset);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getIndex-VZbfaAc, reason: not valid java name */
    public final int m646getIndexVZbfaAc() {
        return ((ItemIndex) this.index.getValue()).m613unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getScrollOffset() {
        return ((Number) this.scrollOffset.getValue()).intValue();
    }

    /* JADX INFO: renamed from: requestPosition-yO3Fmg4, reason: not valid java name */
    public final void m647requestPositionyO3Fmg4(int index, int scrollOffset) {
        m645updateyO3Fmg4(index, scrollOffset);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(LazyGridMeasureResult lazyGridMeasureResult) {
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] items2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        kotlin.jvm.internal.m.h(lazyGridMeasureResult, "measureResult");
        LazyGridMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        this.lastKnownFirstItemKey = (firstVisibleLine == null || (items2 = firstVisibleLine.getItems()) == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) p.F0(items2)) == null) ? null : lazyGridMeasuredItem2.getKey();
        if (this.hadFirstNotEmptyLayout || lazyGridMeasureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleLineScrollOffset = lazyGridMeasureResult.getFirstVisibleLineScrollOffset();
            int index = 0;
            if (!(((float) firstVisibleLineScrollOffset) >= 0.0f)) {
                throw new IllegalStateException(m.h("scrollOffset should be non-negative (", firstVisibleLineScrollOffset, ')').toString());
            }
            Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                try {
                    LazyGridMeasuredLine firstVisibleLine2 = lazyGridMeasureResult.getFirstVisibleLine();
                    if (firstVisibleLine2 != null && (items = firstVisibleLine2.getItems()) != null && (lazyGridMeasuredItem = (LazyGridMeasuredItem) p.F0(items)) != null) {
                        index = lazyGridMeasuredItem.getIndex();
                    }
                    m645updateyO3Fmg4(ItemIndex.m603constructorimpl(index), firstVisibleLineScrollOffset);
                    j jVar = j.a;
                } finally {
                    snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                }
            } finally {
                snapshotCreateNonObservableSnapshot.dispose();
            }
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved(LazyGridItemProvider lazyGridItemProvider) {
        kotlin.jvm.internal.m.h(lazyGridItemProvider, "itemProvider");
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                m645updateyO3Fmg4(ItemIndex.m603constructorimpl(LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider, this.lastKnownFirstItemKey, m646getIndexVZbfaAc())), getScrollOffset());
                j jVar = j.a;
            } finally {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            snapshotCreateNonObservableSnapshot.dispose();
        }
    }

    public LazyGridScrollPosition(int i2, int i3) {
        this.index = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ItemIndex.m601boximpl(ItemIndex.m603constructorimpl(i2)), null, 2, null);
        this.scrollOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i3), null, 2, null);
    }

    public /* synthetic */ LazyGridScrollPosition(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
