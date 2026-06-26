package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kj.l;
import kj.p;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a4\u0010\u0010\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002\u001aL\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002\u001aB\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002\u001a'\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a1\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u001b\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a)\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\b\u0010\u001e\u001a\u00020\u0006H\u0002\u001a-\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b \u0010!\u001a\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bH\u0002\u001a \u0010%\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010%\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a3\u0010)\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020&2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*\u001a#\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b)\u0010-\u001a+\u0010)\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b)\u0010.\u001a\b\u00100\u001a\u00020/H\u0002\u001a\u0012\u00101\u001a\u0004\u0018\u00010&2\u0006\u0010,\u001a\u00020+H\u0002\u001a\u0010\u00102\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002\u001a-\u00103\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\bH\u0001¢\u0006\u0004\b3\u0010.\u001a5\u00105\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\b2\u0006\u00104\u001a\u00028\u0000H\u0000¢\u0006\u0004\b5\u00106\u001a-\u00107\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\bH\u0000¢\u0006\u0004\b7\u0010.\u001a-\u00108\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010.\u001a%\u00109\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&*\u00028\u00002\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b9\u0010-\u001a\u0018\u0010:\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0001\u001aK\u0010<\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020&\"\u0004\b\u0001\u0010;*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010\"\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aC\u0010<\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020&\"\u0004\b\u0001\u0010;*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010>\u001aK\u0010?\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020&\"\u0004\b\u0001\u0010;*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u00104\u001a\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a.\u0010E\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0018\u00010D2\u0006\u0010\t\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u0002H\u0002\u001a\b\u0010F\u001a\u00020/H\u0002\u001a)\u0010G\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\bH\u0001¢\u0006\u0004\bG\u0010H\u001a!\u0010G\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020&2\u0006\u0010(\u001a\u00028\u0000H\u0001¢\u0006\u0004\bG\u0010I\u001a;\u0010J\u001a\u00028\u0001\"\b\b\u0000\u0010\u0016*\u00020&\"\u0004\b\u0001\u0010;*\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001a\u001c\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0000H\u0000\" \u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P\"\u0014\u0010Q\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010R\"\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\b0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010U\" \u0010V\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010[\u001a\u0004\bX\u0010Y\"\u0016\u0010\\\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]\"\u0016\u0010^\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010R\"\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a\"2\u0010e\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0d\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060c0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f\"&\u0010g\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010f\"4\u0010l\u001a\"\u0012\f\u0012\n j*\u0004\u0018\u00010i0i0hj\u0010\u0012\f\u0012\n j*\u0004\u0018\u00010i0i`k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010m\" \u0010n\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bn\u0010o\u0012\u0004\br\u0010[\u001a\u0004\bp\u0010q\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006s"}, d2 = {"", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "trackPinning", "handle", "Lkotlin/j;", "releasePinningLocked", "Landroidx/compose/runtime/snapshots/Snapshot;", "currentSnapshot", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "createTransparentSnapshotWithNoParentReadObserver", "parentObserver", "mergeReadObserver", "mergedReadObserver", "writeObserver", "mergedWriteObserver", "T", "Lkotlin/Function0;", "block", "sync", "(Lkj/a;)Ljava/lang/Object;", "previousGlobalSnapshot", "takeNewGlobalSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkj/l;)Ljava/lang/Object;", "advanceGlobalSnapshot", "(Lkj/l;)Ljava/lang/Object;", "takeNewSnapshot", "(Lkj/l;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "validateOpen", "candidateSnapshot", "valid", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "r", "readable", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "readError", "usedLocked", "overwriteUnusedRecordsLocked", "writableRecord", "candidate", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "newWritableRecordLocked", "newOverwritableRecordLocked", "notifyWrite", "R", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkj/l;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkj/l;)Ljava/lang/Object;", "overwritable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkj/l;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", "optimisticMerges", "reportReadonlySnapshotWrite", "current", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkj/l;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, "until", "addRange", "emptyLambda", "Lkj/l;", "INVALID_SNAPSHOT", "I", "Landroidx/compose/runtime/SnapshotThreadLocal;", "threadSnapshot", "Landroidx/compose/runtime/SnapshotThreadLocal;", "lock", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "getLock$annotations", "()V", "openSnapshots", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "Lkotlin/Function2;", "", "applyObservers", "Ljava/util/List;", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "currentGlobalSnapshot", "Ljava/util/concurrent/atomic/AtomicReference;", "snapshotInitializer", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer$annotations", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;
    private static final List<p<Set<? extends Object>, Snapshot, j>> applyObservers;
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;
    private static final List<l<Object, j>> globalWriteObservers;
    private static int nextSnapshotId;
    private static SnapshotIdSet openSnapshots;
    private static final SnapshotDoubleIndexHeap pinningTable;
    private static final Snapshot snapshotInitializer;
    private static final l<SnapshotIdSet, j> emptyLambda = new l<SnapshotIdSet, j>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        public final void invoke(SnapshotIdSet snapshotIdSet) {
            m.h(snapshotIdSet, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SnapshotIdSet) obj);
            return j.a;
        }
    };
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        applyObservers = new ArrayList();
        globalWriteObservers = new ArrayList();
        int i2 = nextSnapshotId;
        nextSnapshotId = i2 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i2, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        m.g(globalSnapshot2, "currentGlobalSnapshot.get()");
        snapshotInitializer = globalSnapshot2;
    }

    public static final SnapshotIdSet addRange(SnapshotIdSet snapshotIdSet, int i2, int i3) {
        m.h(snapshotIdSet, "<this>");
        while (i2 < i3) {
            snapshotIdSet = snapshotIdSet.set(i2);
            i2++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T advanceGlobalSnapshot(l<? super SnapshotIdSet, ? extends T> lVar) {
        GlobalSnapshot globalSnapshot;
        T t;
        ArrayList arrayListY1;
        Snapshot snapshot = snapshotInitializer;
        m.f(snapshot, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (getLock()) {
            globalSnapshot = currentGlobalSnapshot.get();
            m.g(globalSnapshot, "currentGlobalSnapshot.get()");
            t = (T) takeNewGlobalSnapshot(globalSnapshot, lVar);
        }
        Set<StateObject> modified$runtime_release = globalSnapshot.getModified$runtime_release();
        if (modified$runtime_release != null) {
            synchronized (getLock()) {
                arrayListY1 = y.Y1(applyObservers);
            }
            int size = arrayListY1.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((p) arrayListY1.get(i2)).invoke(modified$runtime_release, globalSnapshot);
            }
        }
        synchronized (getLock()) {
            if (modified$runtime_release != null) {
                Iterator<T> it = modified$runtime_release.iterator();
                while (it.hasNext()) {
                    overwriteUnusedRecordsLocked((StateObject) it.next());
                }
                j jVar = j.a;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, l<Object, j> lVar, boolean z) {
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (z2 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z2 ? (MutableSnapshot) snapshot : null, lVar, null, false, z);
        }
        return new TransparentObserverSnapshot(snapshot, lVar, false, z);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, l lVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, lVar, z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T extends StateRecord> T current(T t, Snapshot snapshot) throws KotlinNothingValueException {
        m.h(t, "r");
        m.h(snapshot, "snapshot");
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid());
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        if (snapshot != null) {
            return snapshot;
        }
        GlobalSnapshot globalSnapshot = currentGlobalSnapshot.get();
        m.g(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    public static final Object getLock() {
        return lock;
    }

    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<Object, j> mergedReadObserver(final l<Object, j> lVar, final l<Object, j> lVar2, boolean z) {
        if (!z) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || m.c(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new l<Object, j>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m2470invoke(obj);
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2470invoke(Object obj) {
                m.h(obj, "state");
                lVar.invoke(obj);
                lVar2.invoke(obj);
            }
        };
    }

    public static /* synthetic */ l mergedReadObserver$default(l lVar, l lVar2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return mergedReadObserver(lVar, lVar2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<Object, j> mergedWriteObserver(final l<Object, j> lVar, final l<Object, j> lVar2) {
        return (lVar == null || lVar2 == null || m.c(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new l<Object, j>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.mergedWriteObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m2471invoke(obj);
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2471invoke(Object obj) {
                m.h(obj, "state");
                lVar.invoke(obj);
                lVar2.invoke(obj);
            }
        };
    }

    public static final <T extends StateRecord> T newOverwritableRecordLocked(T t, StateObject stateObject) {
        m.h(t, "<this>");
        m.h(stateObject, "state");
        T t2 = (T) usedLocked(stateObject);
        if (t2 != null) {
            t2.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.create();
        t3.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t3.setNext$runtime_release(stateObject.getFirstStateRecord());
        stateObject.prependStateRecord(t3);
        return t3;
    }

    public static final <T extends StateRecord> T newWritableRecord(T t, StateObject stateObject, Snapshot snapshot) {
        T t2;
        m.h(t, "<this>");
        m.h(stateObject, "state");
        m.h(snapshot, "snapshot");
        synchronized (getLock()) {
            t2 = (T) newWritableRecordLocked(t, stateObject, snapshot);
        }
        return t2;
    }

    private static final <T extends StateRecord> T newWritableRecordLocked(T t, StateObject stateObject, Snapshot snapshot) {
        T t2 = (T) newOverwritableRecordLocked(t, stateObject);
        t2.assign(t);
        t2.setSnapshotId$runtime_release(snapshot.getId());
        return t2;
    }

    public static final void notifyWrite(Snapshot snapshot, StateObject stateObject) {
        m.h(snapshot, "snapshot");
        m.h(stateObject, "state");
        l<Object, j> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(stateObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) throws KotlinNothingValueException {
        StateRecord stateRecord;
        Set<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetOr = mutableSnapshot2.getInvalid().set(mutableSnapshot2.getId()).or(mutableSnapshot2.getPreviousIds$runtime_release());
        HashMap map = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord stateRecord2 = readable(firstStateRecord, id, snapshotIdSet);
            if (stateRecord2 != null && (stateRecord = readable(firstStateRecord, id, snapshotIdSetOr)) != null && !m.c(stateRecord2, stateRecord)) {
                StateRecord stateRecord3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid());
                if (stateRecord3 == null) {
                    readError();
                    throw new KotlinNothingValueException();
                }
                StateRecord stateRecordMergeRecords = stateObject.mergeRecords(stateRecord, stateRecord2, stateRecord3);
                if (stateRecordMergeRecords == null) {
                    return null;
                }
                if (map == null) {
                    map = new HashMap();
                }
                map.put(stateRecord2, stateRecordMergeRecords);
                map = map;
            }
        }
        return map;
    }

    public static final <T extends StateRecord, R> R overwritable(T t, StateObject stateObject, T t2, l<? super T, ? extends R> lVar) {
        Snapshot current;
        R r;
        m.h(t, "<this>");
        m.h(stateObject, "state");
        m.h(t2, "candidate");
        m.h(lVar, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            r = (R) lVar.invoke(overwritableRecord(t, stateObject, current, t2));
        }
        notifyWrite(current, stateObject);
        return r;
    }

    public static final <T extends StateRecord> T overwritableRecord(T t, StateObject stateObject, Snapshot snapshot, T t2) {
        T t3;
        m.h(t, "<this>");
        m.h(stateObject, "state");
        m.h(snapshot, "snapshot");
        m.h(t2, "candidate");
        if (snapshot.getReadOnly()) {
            snapshot.mo2467recordModified$runtime_release(stateObject);
        }
        int id = snapshot.getId();
        if (t2.getSnapshotId() == id) {
            return t2;
        }
        synchronized (getLock()) {
            t3 = (T) newOverwritableRecordLocked(t, stateObject);
        }
        t3.setSnapshotId$runtime_release(id);
        snapshot.mo2467recordModified$runtime_release(stateObject);
        return t3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean overwriteUnusedRecordsLocked(StateObject stateObject) {
        StateRecord stateRecord;
        int iLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        StateRecord stateRecord2 = null;
        int i2 = 0;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            int snapshotId$runtime_release = firstStateRecord.getSnapshotId();
            if (snapshotId$runtime_release != 0) {
                if (snapshotId$runtime_release > iLowestOrDefault) {
                    i2++;
                } else if (stateRecord2 == null) {
                    stateRecord2 = firstStateRecord;
                } else {
                    if (firstStateRecord.getSnapshotId() < stateRecord2.getSnapshotId()) {
                        stateRecord = stateRecord2;
                        stateRecord2 = firstStateRecord;
                    } else {
                        stateRecord = firstStateRecord;
                    }
                    stateRecord2.setSnapshotId$runtime_release(0);
                    stateRecord2.assign(stateRecord);
                    stateRecord2 = stateRecord;
                }
            }
        }
        return i2 < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends StateRecord> T readable(T t, int i2, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (valid(t, i2, snapshotIdSet) && (t2 == null || t2.getSnapshotId() < t.getSnapshotId())) {
                t2 = t;
            }
            t = (T) t.getNext();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final void releasePinningLocked(int i2) {
        pinningTable.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T> T sync(kj.a<? extends T> aVar) {
        T t;
        m.h(aVar, "block");
        synchronized (getLock()) {
            t = (T) aVar.invoke();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, l<? super SnapshotIdSet, ? extends T> lVar) {
        T t = (T) lVar.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i2 = nextSnapshotId;
            nextSnapshotId = i2 + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i2, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i2);
            j jVar = j.a;
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Snapshot> T takeNewSnapshot(final l<? super SnapshotIdSet, ? extends T> lVar) {
        return (T) advanceGlobalSnapshot(new l<SnapshotIdSet, T>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
            public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
                m.h(snapshotIdSet, "invalid");
                Snapshot snapshot = (Snapshot) lVar.invoke(snapshotIdSet);
                synchronized (SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot.getId());
                    j jVar = j.a;
                }
                return snapshot;
            }
        });
    }

    public static final int trackPinning(int i2, SnapshotIdSet snapshotIdSet) {
        int iAdd;
        m.h(snapshotIdSet, "invalid");
        int iLowest = snapshotIdSet.lowest(i2);
        synchronized (getLock()) {
            iAdd = pinningTable.add(iLowest);
        }
        return iAdd;
    }

    private static final StateRecord usedLocked(StateObject stateObject) {
        int iLowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.INSTANCE.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
            if (firstStateRecord.getSnapshotId() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, iLowestOrDefault, empty)) {
                if (stateRecord != null) {
                    return firstStateRecord.getSnapshotId() < stateRecord.getSnapshotId() ? firstStateRecord : stateRecord;
                }
                stateRecord = firstStateRecord;
            }
        }
        return null;
    }

    private static final boolean valid(int i2, int i3, SnapshotIdSet snapshotIdSet) {
        return (i3 == 0 || i3 > i2 || snapshotIdSet.get(i3)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateOpen(Snapshot snapshot) {
        if (!openSnapshots.get(snapshot.getId())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final <T extends StateRecord, R> R withCurrent(T t, l<? super T, ? extends R> lVar) {
        m.h(t, "<this>");
        m.h(lVar, "block");
        return (R) lVar.invoke(current(t));
    }

    public static final <T extends StateRecord, R> R writable(T t, StateObject stateObject, l<? super T, ? extends R> lVar) {
        Snapshot current;
        R r;
        m.h(t, "<this>");
        m.h(stateObject, "state");
        m.h(lVar, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            r = (R) lVar.invoke(writableRecord(t, stateObject, current));
        }
        notifyWrite(current, stateObject);
        return r;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T extends StateRecord> T writableRecord(T t, StateObject stateObject, Snapshot snapshot) throws KotlinNothingValueException {
        m.h(t, "<this>");
        m.h(stateObject, "state");
        m.h(snapshot, "snapshot");
        if (snapshot.getReadOnly()) {
            snapshot.mo2467recordModified$runtime_release(stateObject);
        }
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid());
        if (t2 == null) {
            readError();
            throw new KotlinNothingValueException();
        }
        if (t2.getSnapshotId() == snapshot.getId()) {
            return t2;
        }
        T t3 = (T) newWritableRecord(t2, stateObject, snapshot);
        snapshot.mo2467recordModified$runtime_release(stateObject);
        return t3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T extends StateRecord> T current(T t) throws KotlinNothingValueException {
        T t2;
        m.h(t, "r");
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        T t3 = (T) readable(t, current.getId(), current.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            t2 = (T) readable(t, current2.getId(), current2.getInvalid());
        }
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    private static final boolean valid(StateRecord stateRecord, int i2, SnapshotIdSet snapshotIdSet) {
        return valid(i2, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    public static final <T extends StateRecord> T readable(T t, StateObject stateObject) {
        T t2;
        m.h(t, "<this>");
        m.h(stateObject, "state");
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot current = companion.getCurrent();
        l<Object, j> readObserver$runtime_release = current.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t3 = (T) readable(t, current.getId(), current.getInvalid());
        if (t3 != null) {
            return t3;
        }
        synchronized (getLock()) {
            Snapshot current2 = companion.getCurrent();
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            m.f(firstStateRecord, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$7");
            t2 = (T) readable(firstStateRecord, current2.getId(), current2.getInvalid());
            if (t2 == null) {
                readError();
                throw new KotlinNothingValueException();
            }
        }
        return t2;
    }

    public static final <T extends StateRecord, R> R writable(T t, StateObject stateObject, Snapshot snapshot, l<? super T, ? extends R> lVar) {
        R r;
        m.h(t, "<this>");
        m.h(stateObject, "state");
        m.h(snapshot, "snapshot");
        m.h(lVar, "block");
        synchronized (getLock()) {
            r = (R) lVar.invoke(writableRecord(t, stateObject, snapshot));
        }
        notifyWrite(snapshot, stateObject);
        return r;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T extends StateRecord> T readable(T t, StateObject stateObject, Snapshot snapshot) throws KotlinNothingValueException {
        m.h(t, "<this>");
        m.h(stateObject, "state");
        m.h(snapshot, "snapshot");
        l<Object, j> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(stateObject);
        }
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid());
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(new l<SnapshotIdSet, j>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.3
            public final void invoke(SnapshotIdSet snapshotIdSet) {
                m.h(snapshotIdSet, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SnapshotIdSet) obj);
                return j.a;
            }
        });
    }
}
