package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0011¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/StaticProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "value", "Landroidx/compose/runtime/State;", "provided$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "provided", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkj/a;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class StaticProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticProvidableCompositionLocal(kj.a<? extends T> aVar) {
        super(aVar);
        m.h(aVar, "defaultFactory");
    }

    @Override // androidx.compose.runtime.CompositionLocal
    @Composable
    public State<T> provided$runtime_release(T t, Composer composer, int i2) {
        composer.startReplaceableGroup(-1121811719);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1121811719, i2, -1, "androidx.compose.runtime.StaticProvidableCompositionLocal.provided (CompositionLocal.kt:139)");
        }
        StaticValueHolder staticValueHolder = new StaticValueHolder(t);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return staticValueHolder;
    }
}
