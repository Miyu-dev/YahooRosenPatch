package androidx.compose.material3;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bá\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J?\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/AnchorChangeHandler;", "T", "", "previousTargetValue", "", "", "previousAnchors", "newAnchors", "Lkotlin/j;", "onAnchorsChanged", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/Map;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public interface AnchorChangeHandler<T> {
    void onAnchorsChanged(T previousTargetValue, Map<T, Float> previousAnchors, Map<T, Float> newAnchors);
}
