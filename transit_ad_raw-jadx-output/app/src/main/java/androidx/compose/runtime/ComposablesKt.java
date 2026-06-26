package androidx.compose.runtime;

import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Composables.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u001a.\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\b\u001aB\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\n\u001aL\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\f\u001aF\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000f\u001aD\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a0\u0010\u0016\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a0\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0013\b\u0004\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a_\u0010\"\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a_\u0010$\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010#\u001an\u0010\"\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010%\u001an\u0010$\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u008f\u0001\u0010\"\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u001f\b\b\u0010'\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00102\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010(\u001a\u008f\u0001\u0010$\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u001d\u0018\u0001*\u0006\u0012\u0002\b\u00030\u001c2\u000e\b\b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u001d\u0010!\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00022\u001f\b\b\u0010'\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0002\b\u00102\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010(\u001a\b\u0010)\u001a\u00020\u0014H\u0001\u001a\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,\"\u0011\u00100\u001a\u00020-8G¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0011\u00104\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0017\u0010:\u001a\u0002058G¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107\"\u0011\u0010>\u001a\u00020;8G¢\u0006\u0006\u001a\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006?"}, d2 = {"T", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "calculation", "remember", "(Lkj/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "key1", "(Ljava/lang/Object;Lkj/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkj/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkj/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "keys", "([Ljava/lang/Object;Lkj/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/Composable;", "block", "key", "([Ljava/lang/Object;Lkj/p;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Lkotlin/j;", "content", "ReusableContent", "(Ljava/lang/Object;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "", "active", "ReusableContentHost", "(ZLkj/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Applier;", "E", "factory", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "update", "ComposeNode", "(Lkj/a;Lkj/l;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "(Lkj/a;Lkj/l;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/SkippableUpdater;", "skippableUpdate", "(Lkj/a;Lkj/l;Lkj/q;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "Landroidx/compose/runtime/CompositionContext;", "rememberCompositionContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentComposer", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "()V", "currentCompositionLocalContext", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class ComposablesKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.runtime.ComposablesKt$ComposeNode$1, reason: invalid class name */
    /* JADX INFO: compiled from: Composables.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass1<T> extends Lambda implements kj.a<T> {
        final /* synthetic */ kj.a<T> $factory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kj.a<? extends T> aVar) {
            super(0);
            this.$factory = aVar;
        }

        public final T invoke() {
            return (T) this.$factory.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.runtime.ComposablesKt$ReusableComposeNode$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Composables.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class C04291<T> extends Lambda implements kj.a<T> {
        final /* synthetic */ kj.a<T> $factory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04291(kj.a<? extends T> aVar) {
            super(0);
            this.$factory = aVar;
        }

        public final T invoke() {
            return (T) this.$factory.invoke();
        }
    }

    @Composable
    public static final <T, E extends Applier<?>> void ComposeNode(kj.a<? extends T> aVar, l<? super Updater<T>, j> lVar, Composer composer, int i2) {
        m.h(aVar, "factory");
        m.h(lVar, "update");
        composer.startReplaceableGroup(1886828752);
        composer.getApplier();
        m.n();
        throw null;
    }

    @Composable
    public static final <T, E extends Applier<?>> void ReusableComposeNode(kj.a<? extends T> aVar, l<? super Updater<T>, j> lVar, Composer composer, int i2) {
        m.h(aVar, "factory");
        m.h(lVar, "update");
        composer.startReplaceableGroup(1405779621);
        composer.getApplier();
        m.n();
        throw null;
    }

    @Composable
    public static final void ReusableContent(Object obj, p<? super Composer, ? super Integer, j> pVar, Composer composer, int i2) {
        m.h(pVar, "content");
        composer.startReplaceableGroup(444418301);
        composer.startReusableGroup(ComposerKt.reuseKey, obj);
        pVar.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        composer.endReusableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ReusableContentHost(boolean z, p<? super Composer, ? super Integer, j> pVar, Composer composer, int i2) {
        m.h(pVar, "content");
        composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(z));
        boolean zChanged = composer.changed(z);
        if (z) {
            pVar.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        } else {
            composer.deactivateToEndGroup(zChanged);
        }
        composer.endReusableGroup();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
    @Composable
    @ReadOnlyComposable
    public static final Composer getCurrentComposer(Composer composer, int i2) throws NotImplementedError {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554250212, i2, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @Composable
    public static final int getCurrentCompositeKeyHash(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i2, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    @Composable
    public static final CompositionLocalContext getCurrentCompositionLocalContext(Composer composer, int i2) {
        composer.startReplaceableGroup(-43352356);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43352356, i2, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        CompositionLocalContext compositionLocalContext = new CompositionLocalContext(composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return compositionLocalContext;
    }

    @Composable
    @ReadOnlyComposable
    public static final RecomposeScope getCurrentRecomposeScope(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i2, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found".toString());
        }
        composer.recordUsed(recomposeScope);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return recomposeScope;
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> T key(Object[] objArr, p<? super Composer, ? super Integer, ? extends T> pVar, Composer composer, int i2) {
        m.h(objArr, "keys");
        m.h(pVar, "block");
        composer.startReplaceableGroup(-11941951);
        T t = (T) pVar.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
        composer.endReplaceableGroup();
        return t;
    }

    @Composable
    public static final <T> T remember(Object obj, kj.a<? extends T> aVar, Composer composer, int i2) {
        m.h(aVar, "calculation");
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(obj);
        T t = (T) composer.rememberedValue();
        if (zChanged || t == Composer.INSTANCE.getEmpty()) {
            t = (T) aVar.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }

    @Composable
    public static final CompositionContext rememberCompositionContext(Composer composer, int i2) {
        composer.startReplaceableGroup(-1165786124);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i2, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        CompositionContext compositionContextBuildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return compositionContextBuildContext;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T, E extends Applier<?>> void ComposeNode(kj.a<? extends T> aVar, l<? super Updater<T>, j> lVar, p<? super Composer, ? super Integer, j> pVar, Composer composer, int i2) {
        m.h(aVar, "factory");
        m.h(lVar, "update");
        m.h(pVar, "content");
        composer.startReplaceableGroup(-548224868);
        composer.getApplier();
        m.n();
        throw null;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T, E extends Applier<?>> void ReusableComposeNode(kj.a<? extends T> aVar, l<? super Updater<T>, j> lVar, p<? super Composer, ? super Integer, j> pVar, Composer composer, int i2) {
        m.h(aVar, "factory");
        m.h(lVar, "update");
        m.h(pVar, "content");
        composer.startReplaceableGroup(-692256719);
        composer.getApplier();
        m.n();
        throw null;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <T, E extends Applier<?>> void ComposeNode(kj.a<? extends T> aVar, l<? super Updater<T>, j> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, j> qVar, p<? super Composer, ? super Integer, j> pVar, Composer composer, int i2) {
        m.h(aVar, "factory");
        m.h(lVar, "update");
        m.h(qVar, "skippableUpdate");
        m.h(pVar, "content");
        composer.getApplier();
        m.n();
        throw null;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <T, E extends Applier<?>> void ReusableComposeNode(kj.a<? extends T> aVar, l<? super Updater<T>, j> lVar, q<? super SkippableUpdater<T>, ? super Composer, ? super Integer, j> qVar, p<? super Composer, ? super Integer, j> pVar, Composer composer, int i2) {
        m.h(aVar, "factory");
        m.h(lVar, "update");
        m.h(qVar, "skippableUpdate");
        m.h(pVar, "content");
        composer.getApplier();
        m.n();
        throw null;
    }

    @Composable
    public static final <T> T remember(Object obj, Object obj2, kj.a<? extends T> aVar, Composer composer, int i2) {
        m.h(aVar, "calculation");
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        T t = (T) composer.rememberedValue();
        if (zChanged || t == Composer.INSTANCE.getEmpty()) {
            t = (T) aVar.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }

    @Composable
    public static final <T> T remember(Object obj, Object obj2, Object obj3, kj.a<? extends T> aVar, Composer composer, int i2) {
        m.h(aVar, "calculation");
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T t = (T) composer.rememberedValue();
        if (zChanged || t == Composer.INSTANCE.getEmpty()) {
            t = (T) aVar.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }

    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    @Composable
    public static final <T> T remember(Object[] objArr, kj.a<? extends T> aVar, Composer composer, int i2) {
        m.h(objArr, "keys");
        m.h(aVar, "calculation");
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (Object obj : objArr) {
            zChanged |= composer.changed(obj);
        }
        T t = (T) composer.rememberedValue();
        if (zChanged || t == Composer.INSTANCE.getEmpty()) {
            t = (T) aVar.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }

    @Composable
    public static final <T> T remember(kj.a<? extends T> aVar, Composer composer, int i2) {
        m.h(aVar, "calculation");
        composer.startReplaceableGroup(-492369756);
        T t = (T) composer.rememberedValue();
        if (t == Composer.INSTANCE.getEmpty()) {
            t = (T) aVar.invoke();
            composer.updateRememberedValue(t);
        }
        composer.endReplaceableGroup();
        return t;
    }
}
