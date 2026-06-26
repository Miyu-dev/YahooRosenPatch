package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.List;
import kj.l;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J4\u0010\t\u001a\u00020\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016J\u000f\u0010\f\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0012\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Lkotlin/Function1;", "", "Lkotlin/j;", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeNestedSnapshot", "writeObserver", "takeNestedMutableSnapshot", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "snapshot", "", "nestedDeactivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedDeactivated", "nestedActivated$runtime_release", "nestedActivated", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "dispose", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class GlobalSnapshot extends MutableSnapshot {
    public GlobalSnapshot(int i2, SnapshotIdSet snapshotIdSet) {
        l<Object, j> lVar;
        m.h(snapshotIdSet, "invalid");
        synchronized (SnapshotKt.getLock()) {
            final ArrayList arrayListY1 = SnapshotKt.globalWriteObservers.isEmpty() ^ true ? y.Y1(SnapshotKt.globalWriteObservers) : null;
            if (arrayListY1 != null) {
                lVar = (l) y.M1(arrayListY1);
                if (lVar == null) {
                    lVar = new l<Object, j>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m2466invoke(obj);
                            return j.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m2466invoke(Object obj) {
                            m.h(obj, "state");
                            List<l<Object, j>> list = arrayListY1;
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                list.get(i3).invoke(obj);
                            }
                        }
                    };
                }
            } else {
                lVar = null;
            }
        }
        super(i2, snapshotIdSet, null, lVar);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            j jVar = j.a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(final l<Object, j> lVar, final l<Object, j> lVar2) {
        return (MutableSnapshot) SnapshotKt.takeNewSnapshot(new l<SnapshotIdSet, MutableSnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot.takeNestedMutableSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final MutableSnapshot invoke(SnapshotIdSet snapshotIdSet) {
                int i2;
                m.h(snapshotIdSet, "invalid");
                synchronized (SnapshotKt.getLock()) {
                    i2 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i2 + 1;
                }
                return new MutableSnapshot(i2, snapshotIdSet, lVar, lVar2);
            }
        });
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(final l<Object, j> lVar) {
        return SnapshotKt.takeNewSnapshot(new l<SnapshotIdSet, ReadonlySnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot.takeNestedSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet) {
                int i2;
                m.h(snapshotIdSet, "invalid");
                synchronized (SnapshotKt.getLock()) {
                    i2 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i2 + 1;
                }
                return new ReadonlySnapshot(i2, snapshotIdSet, lVar);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2464nestedActivated$runtime_release(Snapshot snapshot) throws KotlinNothingValueException {
        m.h(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo2465nestedDeactivated$runtime_release(Snapshot snapshot) throws KotlinNothingValueException {
        m.h(snapshot, "snapshot");
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
