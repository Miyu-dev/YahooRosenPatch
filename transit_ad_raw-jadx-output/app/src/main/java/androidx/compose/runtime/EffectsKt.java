package androidx.compose.runtime;

import dj.e;
import java.util.Arrays;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\b\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\b\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\f\u001a7\u0010\b\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000e\u001aA\u0010\b\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0010\u001a;\u0010\b\u001a\u00020\u00012\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0011\"\u0004\u0018\u00010\n2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\b\u0010\u0013\u001a6\u0010\u0018\u001a\u00020\u00012\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a@\u0010\u0018\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001a\u001aJ\u0010\u0018\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001b\u001aT\u0010\u0018\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001c\u001aN\u0010\u0018\u001a\u00020\u00012\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0011\"\u0004\u0018\u00010\n2\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001d\u001a\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001\u001a(\u0010%\u001a\u00020\u00152\u0013\b\u0006\u0010$\u001a\r\u0012\u0004\u0012\u00020\u001e0\u0000¢\u0006\u0002\b#H\u0087\bø\u0001\u0001¢\u0006\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Lkotlin/Function0;", "Lkotlin/j;", "effect", "SideEffect", "(Lkj/a;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "DisposableEffect", "(Lkj/l;Landroidx/compose/runtime/Composer;I)V", "", "key1", "(Ljava/lang/Object;Lkj/l;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkj/l;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkj/l;Landroidx/compose/runtime/Composer;I)V", "", "keys", "([Ljava/lang/Object;Lkj/l;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Ldj/c;", "block", "LaunchedEffect", "(Lkj/p;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lkj/p;Landroidx/compose/runtime/Composer;I)V", "Ldj/e;", "coroutineContext", "Landroidx/compose/runtime/Composer;", "composer", "createCompositionCoroutineScope", "Landroidx/compose/runtime/DisallowComposableCalls;", "getContext", "rememberCoroutineScope", "(Lkj/a;Landroidx/compose/runtime/Composer;II)Lkotlinx/coroutines/CoroutineScope;", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "", "DisposableEffectNoParamError", "Ljava/lang/String;", "LaunchedEffectNoParamError", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @Composable
    public static final void DisposableEffect(l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        m.h(lVar, "effect");
        composer.startReplaceableGroup(-904483903);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:115)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError.toString());
    }

    @Composable
    public static final void LaunchedEffect(final p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, final int i2) {
        m.h(pVar, "block");
        Composer composerStartRestartGroup = composer.startRestartGroup(-805415771);
        if ((i2 & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:313)");
            }
            throw new IllegalStateException(LaunchedEffectNoParamError.toString());
        }
        composerStartRestartGroup.skipToGroupEnd();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.runtime.EffectsKt.LaunchedEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i3) {
                EffectsKt.LaunchedEffect(pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }

    @Composable
    public static final void SideEffect(kj.a<j> aVar, Composer composer, int i2) {
        m.h(aVar, "effect");
        composer.startReplaceableGroup(-1288466761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i2, -1, "androidx.compose.runtime.SideEffect (Effects.kt:44)");
        }
        composer.recordSideEffect(aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final CoroutineScope createCompositionCoroutineScope(e eVar, Composer composer) {
        m.h(eVar, "coroutineContext");
        m.h(composer, "composer");
        Job.Key key = Job.Key;
        if (eVar.get(key) == null) {
            e applyCoroutineContext = composer.getApplyCoroutineContext();
            return CoroutineScopeKt.CoroutineScope(applyCoroutineContext.plus(JobKt.Job(applyCoroutineContext.get(key))).plus(eVar));
        }
        CompletableJob completableJobJob$default = JobKt.Job$default((Job) null, 1, (Object) null);
        completableJobJob$default.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return CoroutineScopeKt.CoroutineScope(completableJobJob$default);
    }

    @Composable
    public static final CoroutineScope rememberCoroutineScope(kj.a<? extends e> aVar, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(773894976);
        if ((i3 & 1) != 0) {
            aVar = new kj.a<EmptyCoroutineContext>() { // from class: androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1
                public final EmptyCoroutineContext invoke() {
                    return EmptyCoroutineContext.INSTANCE;
                }
            };
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CompositionScopedCoroutineScopeCanceller(createCompositionCoroutineScope((e) aVar.invoke(), composer));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        return coroutineScope;
    }

    @Composable
    public static final void DisposableEffect(Object obj, l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        m.h(lVar, "effect");
        composer.startReplaceableGroup(-1371986847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:150)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object obj, p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, int i2) {
        m.h(pVar, "block");
        composer.startReplaceableGroup(1179185413);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:331)");
        }
        e applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        m.h(lVar, "effect");
        composer.startReplaceableGroup(1429097729);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:189)");
        }
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, int i2) {
        m.h(pVar, "block");
        composer.startReplaceableGroup(590241125);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:353)");
        }
        e applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(511388516);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        m.h(lVar, "effect");
        composer.startReplaceableGroup(-1239538271);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:229)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, int i2) {
        m.h(pVar, "block");
        composer.startReplaceableGroup(-54093371);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:376)");
        }
        e applyCoroutineContext = composer.getApplyCoroutineContext();
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void DisposableEffect(Object[] objArr, l<? super DisposableEffectScope, ? extends DisposableEffectResult> lVar, Composer composer, int i2) {
        m.h(objArr, "keys");
        m.h(lVar, "effect");
        composer.startReplaceableGroup(-1307627122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i2, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:271)");
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (Object obj : objArrCopyOf) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(lVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void LaunchedEffect(Object[] objArr, p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object> pVar, Composer composer, int i2) {
        m.h(objArr, "keys");
        m.h(pVar, "block");
        composer.startReplaceableGroup(-139560008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i2, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:401)");
        }
        e applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (Object obj : objArrCopyOf) {
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, pVar));
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
