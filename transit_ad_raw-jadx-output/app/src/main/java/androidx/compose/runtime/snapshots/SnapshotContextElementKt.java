package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import androidx.compose.runtime.ExperimentalComposeApi;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SnapshotContextElement.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"asContextElement", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Landroidx/compose/runtime/snapshots/Snapshot;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SnapshotContextElementKt {
    @ExperimentalComposeApi
    public static final SnapshotContextElement asContextElement(Snapshot snapshot) {
        m.h(snapshot, "<this>");
        return new SnapshotContextElementImpl(snapshot);
    }
}
