package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: compiled from: BeyondBoundsState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/BeyondBoundsState;", "", "Lkotlin/j;", "remeasure", "", "getItemCount", "()I", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstVisibleIndex", "firstVisibleIndex", "getLastVisibleIndex", "lastVisibleIndex", "foundation_release"}, k = 1, mv = {1, 8, 0})
public interface BeyondBoundsState {
    int getFirstVisibleIndex();

    boolean getHasVisibleItems();

    int getItemCount();

    int getLastVisibleIndex();

    void remeasure();
}
