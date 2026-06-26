package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kj.l;
import kj.p;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.n;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b!\b\u0017\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010/\u001a\u00020\u001f\u0012\u0006\u0010h\u001a\u00020$\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\bi\u0010jJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J8\u0010\t\u001a\u00020\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u001e\u0010\r\u001a\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001d\u0010\u0015J5\u0010(\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J'\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0080\bø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0000¢\u0006\u0004\b,\u0010\u0015J\u0017\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001fH\u0000¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001fH\u0000¢\u0006\u0004\b3\u00101J\u0017\u00109\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010;\u001a\u00020\u0006H\u0000¢\u0006\u0004\b:\u0010\u0015J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010<\u001a\u00020$H\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010D\u001a\u00020\u00062\u0006\u0010A\u001a\u00020@H\u0010¢\u0006\u0004\bB\u0010CJ\b\u0010E\u001a\u00020\u0006H\u0002R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010HR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bI\u0010HR:\u0010L\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010J2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010J8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010R\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010>R\"\u0010W\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u00108R\u0016\u0010<\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010\\R\"\u0010]\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010`R\u0014\u0010g\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006k"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "hasPendingChanges", "Lkotlin/Function1;", "", "Lkotlin/j;", "readObserver", "writeObserver", "takeNestedMutableSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "dispose", "takeNestedSnapshot", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "closeLocked$runtime_release", "closeLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePinnedSnapshotsForCloseLocked", "validateNotApplied$runtime_release", "validateNotApplied", "validateNotAppliedOrPinned$runtime_release", "validateNotAppliedOrPinned", "", "snapshotId", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalidSnapshots", "innerApplyLocked$runtime_release", "(ILjava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "innerApplyLocked", "T", "Lkotlin/Function0;", "block", "advance$runtime_release", "(Lkj/a;)Ljava/lang/Object;", "advance", "id", "recordPrevious$runtime_release", "(I)V", "recordPrevious", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshot", "", "handles", "recordPreviousPinnedSnapshots$runtime_release", "([I)V", "recordPreviousPinnedSnapshots", "releasePreviouslyPinnedSnapshotsLocked$runtime_release", "releasePreviouslyPinnedSnapshotsLocked", "snapshots", "recordPreviousList$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "recordPreviousList", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "abandon", "Lkj/l;", "getReadObserver$runtime_release", "()Lkj/l;", "getWriteObserver$runtime_release", "", "<set-?>", "modified", "Ljava/util/Set;", "getModified$runtime_release", "()Ljava/util/Set;", "setModified", "(Ljava/util/Set;)V", "previousIds", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "previousPinnedSnapshots", "[I", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "I", "applied", "Z", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "invalid", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkj/l;Lkj/l;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public class MutableSnapshot extends Snapshot {
    public static final int $stable = 8;
    private boolean applied;
    private Set<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final l<Object, j> readObserver;
    private int snapshots;
    private final l<Object, j> writeObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSnapshot(int i2, SnapshotIdSet snapshotIdSet, l<Object, j> lVar, l<Object, j> lVar2) {
        super(i2, snapshotIdSet, null);
        m.h(snapshotIdSet, "invalid");
        this.readObserver = lVar;
        this.writeObserver = lVar2;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.previousPinnedSnapshots = new int[0];
        this.snapshots = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void abandon() {
        /*
            r5 = this;
            java.util.Set r0 = r5.getModified$runtime_release()
            if (r0 == 0) goto L46
            r5.validateNotApplied$runtime_release()
            r1 = 0
            r5.setModified(r1)
            int r1 = r5.getId()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r0.next()
            androidx.compose.runtime.snapshots.StateObject r2 = (androidx.compose.runtime.snapshots.StateObject) r2
            androidx.compose.runtime.snapshots.StateRecord r2 = r2.getFirstStateRecord()
        L25:
            if (r2 == 0) goto L15
            int r3 = r2.getSnapshotId()
            if (r3 == r1) goto L3d
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r5.previousIds
            int r4 = r2.getSnapshotId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.collections.y.k1(r4, r3)
            if (r3 == 0) goto L41
        L3d:
            r3 = 0
            r2.setSnapshotId$runtime_release(r3)
        L41:
            androidx.compose.runtime.snapshots.StateRecord r2 = r2.getNext()
            goto L25
        L46:
            r5.closeAndReleasePinning$runtime_release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.abandon():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, l lVar, l lVar2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i2 & 1) != 0) {
            lVar = null;
        }
        if ((i2 & 2) != 0) {
            lVar2 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(lVar, lVar2);
    }

    public final <T> T advance$runtime_release(kj.a<? extends T> block) {
        m.h(block, "block");
        recordPrevious$runtime_release(getId());
        T t = (T) block.invoke();
        if (!getApplied() && !getDisposed()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int i2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i2 + 1;
                setId$runtime_release(i2);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                j jVar = j.a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id + 1, getId()));
        }
        return t;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public SnapshotApplyResult apply() throws KotlinNothingValueException {
        Map<StateRecord, ? extends StateRecord> mapOptimisticMerges;
        Pair pair;
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release != null) {
            Object obj = SnapshotKt.currentGlobalSnapshot.get();
            m.g(obj, "currentGlobalSnapshot.get()");
            mapOptimisticMerges = SnapshotKt.optimisticMerges((MutableSnapshot) obj, this, SnapshotKt.openSnapshots.clear(((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getId()));
        } else {
            mapOptimisticMerges = null;
        }
        synchronized (SnapshotKt.getLock()) {
            SnapshotKt.validateOpen(this);
            boolean z = true;
            if (modified$runtime_release == null || modified$runtime_release.size() == 0) {
                closeLocked$runtime_release();
                GlobalSnapshot globalSnapshot = (GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get();
                m.g(globalSnapshot, "previousGlobalSnapshot");
                SnapshotKt.takeNewGlobalSnapshot(globalSnapshot, SnapshotKt.emptyLambda);
                Set<StateObject> modified$runtime_release2 = globalSnapshot.getModified$runtime_release();
                pair = (modified$runtime_release2 == null || !(modified$runtime_release2.isEmpty() ^ true)) ? new Pair(EmptyList.INSTANCE, (Object) null) : new Pair(y.Y1(SnapshotKt.applyObservers), modified$runtime_release2);
            } else {
                GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get();
                SnapshotApplyResult snapshotApplyResultInnerApplyLocked$runtime_release = innerApplyLocked$runtime_release(SnapshotKt.nextSnapshotId, mapOptimisticMerges, SnapshotKt.openSnapshots.clear(globalSnapshot2.getId()));
                if (!m.c(snapshotApplyResultInnerApplyLocked$runtime_release, SnapshotApplyResult.Success.INSTANCE)) {
                    return snapshotApplyResultInnerApplyLocked$runtime_release;
                }
                closeLocked$runtime_release();
                SnapshotKt.takeNewGlobalSnapshot(globalSnapshot2, SnapshotKt.emptyLambda);
                Set<StateObject> modified$runtime_release3 = globalSnapshot2.getModified$runtime_release();
                setModified(null);
                globalSnapshot2.setModified(null);
                pair = new Pair(y.Y1(SnapshotKt.applyObservers), modified$runtime_release3);
            }
            List list = (List) pair.component1();
            Set set = (Set) pair.component2();
            this.applied = true;
            if (!(set == null || set.isEmpty())) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((p) list.get(i2)).invoke(set, this);
                }
            }
            if (modified$runtime_release != null && !modified$runtime_release.isEmpty()) {
                z = false;
            }
            if (!z) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((p) list.get(i3)).invoke(modified$runtime_release, this);
                }
            }
            synchronized (SnapshotKt.getLock()) {
                releasePinnedSnapshotsForCloseLocked$runtime_release();
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        SnapshotKt.overwriteUnusedRecordsLocked((StateObject) it.next());
                    }
                }
                if (modified$runtime_release != null) {
                    Iterator<T> it2 = modified$runtime_release.iterator();
                    while (it2.hasNext()) {
                        SnapshotKt.overwriteUnusedRecordsLocked((StateObject) it2.next());
                    }
                    j jVar = j.a;
                }
            }
            return SnapshotApplyResult.Success.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed()) {
            return;
        }
        super.dispose();
        mo2465nestedDeactivated$runtime_release(this);
    }

    /* JADX INFO: renamed from: getApplied$runtime_release, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Set<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    /* JADX INFO: renamed from: getPreviousIds$runtime_release, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    /* JADX INFO: renamed from: getPreviousPinnedSnapshots$runtime_release, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public l<Object, j> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public l<Object, j> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && (modified$runtime_release.isEmpty() ^ true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final SnapshotApplyResult innerApplyLocked$runtime_release(int snapshotId, Map<StateRecord, ? extends StateRecord> optimisticMerges, SnapshotIdSet invalidSnapshots) throws KotlinNothingValueException {
        StateRecord stateRecord;
        StateRecord stateRecordMergeRecords;
        m.h(invalidSnapshots, "invalidSnapshots");
        SnapshotIdSet snapshotIdSetOr = getInvalid().set(getId()).or(this.previousIds);
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        m.e(modified$runtime_release);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord stateRecord2 = SnapshotKt.readable(firstStateRecord, snapshotId, invalidSnapshots);
            if (stateRecord2 != null && (stateRecord = SnapshotKt.readable(firstStateRecord, getId(), snapshotIdSetOr)) != null && !m.c(stateRecord2, stateRecord)) {
                StateRecord stateRecord3 = SnapshotKt.readable(firstStateRecord, getId(), getInvalid());
                if (stateRecord3 == null) {
                    SnapshotKt.readError();
                    throw new KotlinNothingValueException();
                }
                if (optimisticMerges == null || (stateRecordMergeRecords = optimisticMerges.get(stateRecord2)) == null) {
                    stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                }
                if (stateRecordMergeRecords == null) {
                    return new SnapshotApplyResult.Failure(this);
                }
                if (!m.c(stateRecordMergeRecords, stateRecord3)) {
                    if (m.c(stateRecordMergeRecords, stateRecord2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new Pair(stateObject, stateRecord2.create()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(stateObject);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!m.c(stateRecordMergeRecords, stateRecord) ? new Pair(stateObject, stateRecordMergeRecords) : new Pair(stateObject, stateRecord.create()));
                    }
                }
            }
        }
        if (arrayList != null) {
            advance$runtime_release();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) arrayList.get(i2);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord4 = (StateRecord) pair.component2();
                stateRecord4.setSnapshotId$runtime_release(getId());
                synchronized (SnapshotKt.getLock()) {
                    stateRecord4.setNext$runtime_release(stateObject2.getFirstStateRecord());
                    stateObject2.prependStateRecord(stateRecord4);
                    j jVar = j.a;
                }
            }
        }
        if (arrayList2 != null) {
            modified$runtime_release.removeAll(arrayList2);
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public void mo2464nestedActivated$runtime_release(Snapshot snapshot) {
        m.h(snapshot, "snapshot");
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public void mo2465nestedDeactivated$runtime_release(Snapshot snapshot) {
        m.h(snapshot, "snapshot");
        int i2 = this.snapshots;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = i2 - 1;
        this.snapshots = i3;
        if (i3 != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo2467recordModified$runtime_release(StateObject state) {
        m.h(state, "state");
        Set<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = new HashSet<>();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(state);
    }

    public final void recordPrevious$runtime_release(int id) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(id);
            j jVar = j.a;
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshots) {
        m.h(snapshots, "snapshots");
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshots);
            j jVar = j.a;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int id) {
        if (id >= 0) {
            int[] iArr = this.previousPinnedSnapshots;
            m.h(iArr, "<this>");
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
            iArrCopyOf[length] = id;
            this.previousPinnedSnapshots = iArrCopyOf;
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] handles) {
        m.h(handles, "handles");
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length == 0) {
            this.previousPinnedSnapshots = handles;
        } else {
            this.previousPinnedSnapshots = n.y0(iArr, handles);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked$runtime_release();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    public final void releasePreviouslyPinnedSnapshotsLocked$runtime_release() {
        int length = this.previousPinnedSnapshots.length;
        for (int i2 = 0; i2 < length; i2++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i2]);
        }
    }

    public final void setApplied$runtime_release(boolean z) {
        this.applied = z;
    }

    public void setModified(Set<StateObject> set) {
        this.modified = set;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet snapshotIdSet) {
        m.h(snapshotIdSet, "<set-?>");
        this.previousIds = snapshotIdSet;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        m.h(iArr, "<set-?>");
        this.previousPinnedSnapshots = iArr;
    }

    public MutableSnapshot takeNestedMutableSnapshot(l<Object, j> lVar, l<Object, j> lVar2) {
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i2);
            SnapshotIdSet invalid = getInvalid();
            setInvalid$runtime_release(invalid.set(i2));
            nestedMutableSnapshot = new NestedMutableSnapshot(i2, SnapshotKt.addRange(invalid, getId() + 1, i2), SnapshotKt.mergedReadObserver$default(lVar, getReadObserver$runtime_release(), false, 4, null), SnapshotKt.mergedWriteObserver(lVar2, getWriteObserver$runtime_release()), this);
        }
        if (!getApplied() && !getDisposed()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int i3 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i3 + 1;
                setId$runtime_release(i3);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                j jVar = j.a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(l<Object, j> lVar) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned$runtime_release();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i2);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i2, SnapshotKt.addRange(getInvalid(), id + 1, i2), lVar, this);
        }
        if (!getApplied() && !getDisposed()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                int i3 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i3 + 1;
                setId$runtime_release(i3);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                j jVar = j.a;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id2 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    public final void validateNotApplied$runtime_release() {
        if (!(!this.applied)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    public final void validateNotAppliedOrPinned$runtime_release() {
        boolean z = true;
        if (this.applied) {
            if (!(((Snapshot) this).pinningTrackingHandle >= 0)) {
                z = false;
            }
        }
        if (!z) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getId());
        j jVar = j.a;
        if (getApplied() || getDisposed()) {
            return;
        }
        int id = getId();
        synchronized (SnapshotKt.getLock()) {
            int i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
            setId$runtime_release(i2);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), id + 1, getId()));
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }
}
