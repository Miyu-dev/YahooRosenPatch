package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import dj.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001a\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007\u001a$\u0010\u0007\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007\u001a\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n\u001a\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u001c\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\u00150\u00120\u0011\u001a\u0006\u0010\u0017\u001a\u00020\f\u001aK\u0010\u001d\u001a\u00020\f\"\b\b\u0000\u0010\u0018*\u00020\n\"\b\b\u0001\u0010\u0019*\u00020\n*\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001b0\u001a2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a7\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\u001f*\u0012\u0012\u0004\u0012\u00028\u00000 j\b\u0012\u0004\u0012\u00028\u0000`!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\"H\u0082\b\"\u0014\u0010%\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\"\u001e\u0010\t\u001a\u00020\b*\u00020\u00068GX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Composition;", "Composition", "Landroidx/compose/runtime/ControlledComposition;", "ControlledComposition", "Ldj/e;", "recomposeCoroutineContext", "", "context", "Lkotlin/j;", "simulateHotReload", "", "key", "invalidateGroupsWithKey", "", "Lkotlin/Pair;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "currentCompositionErrors", "clearCompositionErrors", "K", "V", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "value", "addValue", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Ljava/lang/Object;Ljava/lang/Object;)V", "E", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Lkotlin/Function1;", "predicate", "removeValueIf", "PendingApplyNoModifications", "Ljava/lang/Object;", "getRecomposeCoroutineContext", "(Landroidx/compose/runtime/ControlledComposition;)Ldj/e;", "getRecomposeCoroutineContext$annotations", "(Landroidx/compose/runtime/ControlledComposition;)V", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class CompositionKt {
    private static final Object PendingApplyNoModifications = new Object();

    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext) {
        m.h(applier, "applier");
        m.h(compositionContext, "parent");
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext) {
        m.h(applier, "applier");
        m.h(compositionContext, "parent");
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> void addValue(IdentityArrayMap<K, IdentityArraySet<V>> identityArrayMap, K k, V v) {
        if (identityArrayMap.contains(k)) {
            IdentityArraySet<V> identityArraySet = identityArrayMap.get(k);
            if (identityArraySet != null) {
                identityArraySet.add(v);
                return;
            }
            return;
        }
        IdentityArraySet<V> identityArraySet2 = new IdentityArraySet<>();
        identityArraySet2.add(v);
        j jVar = j.a;
        identityArrayMap.set(k, identityArraySet2);
    }

    public static final void clearCompositionErrors() {
        HotReloader.INSTANCE.clearErrors$runtime_release();
    }

    public static final List<Pair<Exception, Boolean>> currentCompositionErrors() {
        List<RecomposerErrorInfo> currentErrors$runtime_release = HotReloader.INSTANCE.getCurrentErrors$runtime_release();
        ArrayList arrayList = new ArrayList(jj.a.Q0(currentErrors$runtime_release, 10));
        for (RecomposerErrorInfo recomposerErrorInfo : currentErrors$runtime_release) {
            arrayList.add(new Pair(recomposerErrorInfo.getCause(), Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
        }
        return arrayList;
    }

    @ExperimentalComposeApi
    public static final e getRecomposeCoroutineContext(ControlledComposition controlledComposition) {
        e recomposeContext;
        m.h(controlledComposition, "<this>");
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? EmptyCoroutineContext.INSTANCE : recomposeContext;
    }

    public static final void invalidateGroupsWithKey(int i2) {
        HotReloader.INSTANCE.invalidateGroupsWithKey$runtime_release(i2);
    }

    private static final <E> void removeValueIf(HashSet<E> hashSet, l<? super E, Boolean> lVar) {
        Iterator<E> it = hashSet.iterator();
        m.g(it, "iterator()");
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public static final void simulateHotReload(Object obj) {
        m.h(obj, "context");
        HotReloader.INSTANCE.simulateHotReload$runtime_release(obj);
    }

    @ExperimentalComposeApi
    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext, e eVar) {
        m.h(applier, "applier");
        m.h(compositionContext, "parent");
        m.h(eVar, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext, applier, eVar);
    }

    @ExperimentalComposeApi
    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext, e eVar) {
        m.h(applier, "applier");
        m.h(compositionContext, "parent");
        m.h(eVar, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext, applier, eVar);
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }
}
