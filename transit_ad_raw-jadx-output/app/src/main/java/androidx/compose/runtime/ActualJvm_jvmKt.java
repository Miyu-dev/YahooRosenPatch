package androidx.compose.runtime;

import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: ActualJvm.jvm.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0081\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0000H\u0000*\u001e\b\u0000\u0010\u0018\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u00028\u00000\u00172\b\u0012\u0004\u0012\u00028\u00000\u0017*\f\b\u0000\u0010\u0019\"\u00020\u00002\u00020\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"", "instance", "", "identityHashCode", "R", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lkj/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/Composer;", "composer", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "composable", "invokeComposable", "(Landroidx/compose/runtime/Composer;Lkj/p;)V", "T", "invokeComposableForResult", "(Landroidx/compose/runtime/Composer;Lkj/p;)Ljava/lang/Object;", "it", "ensureMutable", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "TestOnly", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class ActualJvm_jvmKt {
    public static final void ensureMutable(Object obj) {
        m.h(obj, "it");
    }

    public static final int identityHashCode(Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void invokeComposable(Composer composer, p<? super Composer, ? super Integer, j> pVar) {
        m.h(composer, "composer");
        m.h(pVar, "composable");
        v.e(2, pVar);
        pVar.invoke(composer, 1);
    }

    public static final <T> T invokeComposableForResult(Composer composer, p<? super Composer, ? super Integer, ? extends T> pVar) {
        m.h(composer, "composer");
        m.h(pVar, "composable");
        v.e(2, pVar);
        return (T) pVar.invoke(composer, 1);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m2398synchronized(Object obj, kj.a<? extends R> aVar) {
        R r;
        m.h(obj, "lock");
        m.h(aVar, "block");
        synchronized (obj) {
            r = (R) aVar.invoke();
        }
        return r;
    }
}
