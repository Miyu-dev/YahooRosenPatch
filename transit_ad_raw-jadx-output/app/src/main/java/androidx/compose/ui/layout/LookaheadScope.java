package androidx.compose.ui.layout;

import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: LookaheadScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScope;", "", "T", "Lkotlin/Function0;", "block", "withDisposableSnapshot", "(Lkj/a;)Ljava/lang/Object;", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "disposableSnapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class LookaheadScope {
    private MutableSnapshot disposableSnapshot;
    private final LayoutNode root;

    public LookaheadScope(LayoutNode layoutNode) {
        kotlin.jvm.internal.m.h(layoutNode, "root");
        this.root = layoutNode;
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    public final <T> T withDisposableSnapshot(kj.a<? extends T> block) {
        kotlin.jvm.internal.m.h(block, "block");
        if (!(this.disposableSnapshot == null)) {
            throw new IllegalStateException("Disposable snapshot is already active".toString());
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.INSTANCE, null, null, 3, null);
        this.disposableSnapshot = mutableSnapshotTakeMutableSnapshot$default;
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot$default.makeCurrent();
            try {
                return (T) block.invoke();
            } finally {
                mutableSnapshotTakeMutableSnapshot$default.restoreCurrent(snapshotMakeCurrent);
            }
        } finally {
            mutableSnapshotTakeMutableSnapshot$default.dispose();
            this.disposableSnapshot = null;
        }
    }
}
