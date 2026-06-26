package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.BeyondBoundsState;
import androidx.compose.ui.layout.Remeasurement;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyListBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/BeyondBoundsState;", "Lkotlin/j;", "remeasure", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "getState", "()Landroidx/compose/foundation/lazy/LazyListState;", "", "getItemCount", "()I", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstVisibleIndex", "firstVisibleIndex", "getLastVisibleIndex", "lastVisibleIndex", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyListBeyondBoundsState implements BeyondBoundsState {
    private final LazyListState state;

    public LazyListBeyondBoundsState(LazyListState lazyListState) {
        m.h(lazyListState, "state");
        this.state = lazyListState;
    }

    @Override // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public int getFirstVisibleIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public int getLastVisibleIndex() {
        return ((LazyListItemInfo) y.z1(this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    public final LazyListState getState() {
        return this.state;
    }

    @Override // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public void remeasure() {
        Remeasurement remeasurement$foundation_release = this.state.getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }
}
