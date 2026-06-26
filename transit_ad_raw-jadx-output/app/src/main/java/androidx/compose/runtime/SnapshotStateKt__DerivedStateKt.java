package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import kj.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a0\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0082\b¢\u0006\u0004\b\u000b\u0010\f\u001aL\u0010\u0012\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00072\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u000f0\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"P\u0010\u001a\u001a>\u0012:\u00128\u00124\u00122\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0018j\u0002`\u00190\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016*d\b\u0002\u0010\u001b\".\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00182.\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0018¨\u0006\u001c"}, d2 = {"T", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/State;", "derivedStateOf", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "R", "Landroidx/compose/runtime/DerivedState;", "derivedState", "block", "notifyObservers$SnapshotStateKt__DerivedStateKt", "(Landroidx/compose/runtime/DerivedState;Lkj/a;)Ljava/lang/Object;", "notifyObservers", "Lkotlin/Function1;", "Lkotlin/j;", "start", "done", "observeDerivedStateRecalculations", "Landroidx/compose/runtime/SnapshotThreadLocal;", "", "calculationBlockNestedLevel", "Landroidx/compose/runtime/SnapshotThreadLocal;", "Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Pair;", "Landroidx/compose/runtime/DerivedStateObservers;", "derivedStateObservers", "DerivedStateObservers", "runtime_release"}, k = 5, mv = {1, 8, 0}, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final SnapshotThreadLocal<Integer> calculationBlockNestedLevel = new SnapshotThreadLocal<>();
    private static final SnapshotThreadLocal<MutableVector<Pair<l<DerivedState<?>, j>, l<DerivedState<?>, j>>>> derivedStateObservers = new SnapshotThreadLocal<>();

    public static final <T> State<T> derivedStateOf(kj.a<? extends T> aVar) {
        m.h(aVar, "calculation");
        return new DerivedSnapshotState(aVar, null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, kj.a<? extends R> aVar) {
        MutableVector mutableVector = (MutableVector) derivedStateObservers.get();
        int i2 = 0;
        if (mutableVector == null) {
            mutableVector = new MutableVector(new Pair[0], 0);
        }
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i3 = 0;
            do {
                ((l) ((Pair) content[i3]).component1()).invoke(derivedState);
                i3++;
            } while (i3 < size);
        }
        try {
            R r = (R) aVar.invoke();
            int size2 = mutableVector.getSize();
            if (size2 > 0) {
                Object[] content2 = mutableVector.getContent();
                do {
                    ((l) ((Pair) content2[i2]).component2()).invoke(derivedState);
                    i2++;
                } while (i2 < size2);
            }
            return r;
        } catch (Throwable th) {
            int size3 = mutableVector.getSize();
            if (size3 > 0) {
                Object[] content3 = mutableVector.getContent();
                do {
                    ((l) ((Pair) content3[i2]).component2()).invoke(derivedState);
                    i2++;
                } while (i2 < size3);
            }
            throw th;
        }
    }

    public static final <R> void observeDerivedStateRecalculations(l<? super State<?>, j> lVar, l<? super State<?>, j> lVar2, kj.a<? extends R> aVar) {
        m.h(lVar, "start");
        m.h(lVar2, "done");
        m.h(aVar, "block");
        SnapshotThreadLocal<MutableVector<Pair<l<DerivedState<?>, j>, l<DerivedState<?>, j>>>> snapshotThreadLocal = derivedStateObservers;
        MutableVector<Pair<l<DerivedState<?>, j>, l<DerivedState<?>, j>>> mutableVector = snapshotThreadLocal.get();
        if (mutableVector == null) {
            mutableVector = new MutableVector<>(new Pair[16], 0);
            snapshotThreadLocal.set(mutableVector);
        }
        try {
            mutableVector.add(new Pair<>(lVar, lVar2));
            aVar.invoke();
        } finally {
            mutableVector.removeAt(mutableVector.getSize() - 1);
        }
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, kj.a<? extends T> aVar) {
        m.h(snapshotMutationPolicy, "policy");
        m.h(aVar, "calculation");
        return new DerivedSnapshotState(aVar, snapshotMutationPolicy);
    }
}
