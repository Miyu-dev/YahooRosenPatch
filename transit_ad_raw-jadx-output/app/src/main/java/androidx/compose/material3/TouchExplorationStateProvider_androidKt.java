package androidx.compose.material3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/State;", "", "touchExplorationState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/lifecycle/Lifecycle;", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "Lkotlin/j;", "handleEvent", "Lkotlin/Function0;", "onDispose", "ObserveState", "(Landroidx/lifecycle/Lifecycle;Lkj/l;Lkj/a;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class TouchExplorationStateProvider_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ObserveState(final Lifecycle lifecycle, l<? super Lifecycle.Event, j> lVar, kj.a<j> aVar, Composer composer, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1703772404);
        if ((i3 & 1) != 0) {
            lVar = new l<Lifecycle.Event, j>() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt.ObserveState.1
                public final void invoke(Lifecycle.Event event) {
                    m.h(event, "it");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Lifecycle.Event) obj);
                    return j.a;
                }
            };
        }
        final l<? super Lifecycle.Event, j> lVar2 = lVar;
        if ((i3 & 2) != 0) {
            aVar = new kj.a<j>() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt.ObserveState.2
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m1829invoke() {
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m1829invoke();
                    return j.a;
                }
            };
        }
        final kj.a<j> aVar2 = aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703772404, i2, -1, "androidx.compose.material3.ObserveState (TouchExplorationStateProvider.android.kt:63)");
        }
        EffectsKt.DisposableEffect(lifecycle, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt.ObserveState.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                m.h(disposableEffectScope, "$this$DisposableEffect");
                final l<Lifecycle.Event, j> lVar3 = lVar2;
                final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt$ObserveState$3$observer$1
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        m.h(lifecycleOwner, "<anonymous parameter 0>");
                        m.h(event, "event");
                        lVar3.invoke(event);
                    }
                };
                lifecycle.addObserver(lifecycleEventObserver);
                final kj.a<j> aVar3 = aVar2;
                final Lifecycle lifecycle2 = lifecycle;
                return new DisposableEffectResult() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt$ObserveState$3$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        aVar3.invoke();
                        lifecycle2.removeObserver(lifecycleEventObserver);
                    }
                };
            }
        }, composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt.ObserveState.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                TouchExplorationStateProvider_androidKt.ObserveState(lifecycle, lVar2, aVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            }
        });
    }

    @Composable
    public static final State<Boolean> touchExplorationState(Composer composer, int i2) {
        composer.startReplaceableGroup(-906157724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-906157724, i2, -1, "androidx.compose.material3.touchExplorationState (TouchExplorationStateProvider.android.kt:40)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            Object systemService = context.getSystemService("accessibility");
            m.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            objRememberedValue = (AccessibilityManager) systemService;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final AccessibilityManager accessibilityManager = (AccessibilityManager) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Listener();
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        final Listener listener = (Listener) objRememberedValue2;
        ObserveState(((LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), new l<Lifecycle.Event, j>() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt.touchExplorationState.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Lifecycle.Event) obj);
                return j.a;
            }

            public final void invoke(Lifecycle.Event event) {
                m.h(event, "event");
                if (event == Lifecycle.Event.ON_RESUME) {
                    listener.register(accessibilityManager);
                }
            }
        }, new kj.a<j>() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt.touchExplorationState.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m1830invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1830invoke() {
                listener.unregister(accessibilityManager);
            }
        }, composer, 8, 0);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new kj.a<Boolean>() { // from class: androidx.compose.material3.TouchExplorationStateProvider_androidKt$touchExplorationState$3$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Boolean m1831invoke() {
                    return Boolean.valueOf(listener.isEnabled());
                }
            });
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceableGroup();
        State<Boolean> state = (State) objRememberedValue3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return state;
    }
}
