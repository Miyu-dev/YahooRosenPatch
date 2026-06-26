package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import dj.e;
import java.util.Collection;
import kj.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.j;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import rj.l;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, k = 4, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class SnapshotStateKt {
    @Composable
    public static final <T extends R, R> State<R> collectAsState(Flow<? extends T> flow, R r, e eVar, Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(flow, r, eVar, composer, i2, i3);
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, kj.a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, aVar);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, l<?> lVar) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, lVar);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final <T> MutableState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t, snapshotMutationPolicy);
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(kj.l<? super State<?>, j> lVar, kj.l<? super State<?>, j> lVar2, kj.a<? extends R> aVar) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(lVar, lVar2, aVar);
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object obj, Object obj2, Object obj3, p<? super ProduceStateScope<T>, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, obj3, pVar, composer, i2);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    public static final <T> State<T> rememberUpdatedState(T t, Composer composer, int i2) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t, composer, i2);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, l<?> lVar, T t) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, lVar, t);
    }

    public static final <T> Flow<T> snapshotFlow(kj.a<? extends T> aVar) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(aVar);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    @Composable
    public static final <T> State<T> collectAsState(StateFlow<? extends T> stateFlow, e eVar, Composer composer, int i2, int i3) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(stateFlow, eVar, composer, i2, i3);
    }

    public static final <T> State<T> derivedStateOf(kj.a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(aVar);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(Pair<? extends K, ? extends V>... pairArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(pairArr);
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object obj, Object obj2, p<? super ProduceStateScope<T>, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, pVar, composer, i2);
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object obj, p<? super ProduceStateScope<T>, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, pVar, composer, i2);
    }

    @Composable
    public static final <T> State<T> produceState(T t, p<? super ProduceStateScope<T>, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, pVar, composer, i2);
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object[] objArr, p<? super ProduceStateScope<T>, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, int i2) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t, objArr, (p) pVar, composer, i2);
    }
}
