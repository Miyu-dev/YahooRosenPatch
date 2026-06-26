package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import dj.e;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: compiled from: SnapshotContextElement.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElementImpl;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlinx/coroutines/ThreadContextElement;", "Landroidx/compose/runtime/snapshots/Snapshot;", "Ldj/e;", "context", "updateThreadContext", "oldState", "Lkotlin/j;", "restoreThreadContext", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "Ldj/e$c;", "getKey", "()Ldj/e$c;", "key", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalComposeApi
final class SnapshotContextElementImpl implements SnapshotContextElement, ThreadContextElement<Snapshot> {
    private final Snapshot snapshot;

    public SnapshotContextElementImpl(Snapshot snapshot) {
        m.h(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement
    public <R> R fold(R r, p<? super R, ? super e.b, ? extends R> pVar) {
        return (R) SnapshotContextElement.DefaultImpls.fold(this, r, pVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement
    public <E extends e.b> E get(e.c<E> cVar) {
        return (E) SnapshotContextElement.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement
    public e.c<?> getKey() {
        return SnapshotContextElement.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement
    public e minusKey(e.c<?> cVar) {
        return SnapshotContextElement.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotContextElement
    public e plus(e eVar) {
        return SnapshotContextElement.DefaultImpls.plus(this, eVar);
    }

    public void restoreThreadContext(e eVar, Snapshot snapshot) {
        m.h(eVar, "context");
        this.snapshot.unsafeLeave(snapshot);
    }

    /* JADX INFO: renamed from: updateThreadContext, reason: merged with bridge method [inline-methods] */
    public Snapshot m2469updateThreadContext(e context) {
        m.h(context, "context");
        return this.snapshot.unsafeEnter();
    }
}
