package android.view.compose;

import android.view.FullyDrawnReporter;
import android.view.FullyDrawnReporterOwner;
import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import ej.c;
import kj.a;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\f\u001a\u00020\u00032\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/Function0;", "", "predicate", "Lkotlin/j;", "ReportDrawnWhen", "(Lkj/a;Landroidx/compose/runtime/Composer;I)V", "ReportDrawn", "(Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Ldj/c;", "", "block", "ReportDrawnAfter", "(Lkj/l;Landroidx/compose/runtime/Composer;I)V", "activity-compose_release"}, k = 2, mv = {1, 8, 0})
public final class ReportDrawnKt {

    /* JADX INFO: renamed from: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @c(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1", f = "ReportDrawn.kt", l = {182}, m = "invokeSuspend")
    public static final class C01151 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ l<dj.c<? super j>, Object> $block;
        final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01151(FullyDrawnReporter fullyDrawnReporter, l<? super dj.c<? super j>, ? extends Object> lVar, dj.c<? super C01151> cVar) {
            super(2, cVar);
            this.$fullyDrawnReporter = fullyDrawnReporter;
            this.$block = lVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return new C01151(this.$fullyDrawnReporter, this.$block, cVar);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            FullyDrawnReporter fullyDrawnReporter;
            Throwable th;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
                l<dj.c<? super j>, Object> lVar = this.$block;
                fullyDrawnReporter2.addReporter();
                if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                    try {
                        this.L$0 = fullyDrawnReporter2;
                        this.label = 1;
                        if (lVar.invoke(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        fullyDrawnReporter = fullyDrawnReporter2;
                        fullyDrawnReporter.removeReporter();
                    } catch (Throwable th2) {
                        fullyDrawnReporter = fullyDrawnReporter2;
                        th = th2;
                        fullyDrawnReporter.removeReporter();
                        throw th;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
                try {
                    li.c.O(obj);
                    fullyDrawnReporter.removeReporter();
                } catch (Throwable th3) {
                    th = th3;
                    fullyDrawnReporter.removeReporter();
                    throw th;
                }
            }
            return j.a;
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    @Composable
    public static final void ReportDrawn(Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357012904);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            ReportDrawnWhen(new a<Boolean>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawn.1
                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final Boolean m16invoke() {
                    return Boolean.TRUE;
                }
            }, composerStartRestartGroup, 6);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawn.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i3) {
                ReportDrawnKt.ReportDrawn(composer2, i2 | 1);
            }
        });
    }

    @Composable
    public static final void ReportDrawnAfter(final l<? super dj.c<? super j>, ? extends Object> lVar, Composer composer, final int i2) {
        FullyDrawnReporter fullyDrawnReporter;
        m.h(lVar, "block");
        Composer composerStartRestartGroup = composer.startRestartGroup(945311272);
        FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    ReportDrawnKt.ReportDrawnAfter(lVar, composer2, i2 | 1);
                }
            });
            return;
        }
        EffectsKt.LaunchedEffect(lVar, fullyDrawnReporter, new C01151(fullyDrawnReporter, lVar, null), composerStartRestartGroup, 584);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new p<Composer, Integer, j>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnAfter.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i3) {
                ReportDrawnKt.ReportDrawnAfter(lVar, composer2, i2 | 1);
            }
        });
    }

    @Composable
    public static final void ReportDrawnWhen(final a<Boolean> aVar, Composer composer, final int i2) {
        int i3;
        final FullyDrawnReporter fullyDrawnReporter;
        m.h(aVar, "predicate");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null || (fullyDrawnReporter = current.getFullyDrawnReporter()) == null) {
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return j.a;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ReportDrawnKt.ReportDrawnWhen(aVar, composer2, i2 | 1);
                    }
                });
                return;
            }
            EffectsKt.DisposableEffect(fullyDrawnReporter, aVar, new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnWhen.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    m.h(disposableEffectScope, "$this$DisposableEffect");
                    if (fullyDrawnReporter.isFullyDrawnReported()) {
                        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        };
                    }
                    final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(fullyDrawnReporter, aVar);
                    return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$invoke$$inlined$onDispose$2
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            reportDrawnComposition.removeReporter();
                        }
                    };
                }
            }, composerStartRestartGroup, ((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new p<Composer, Integer, j>() { // from class: androidx.activity.compose.ReportDrawnKt.ReportDrawnWhen.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                ReportDrawnKt.ReportDrawnWhen(aVar, composer2, i2 | 1);
            }
        });
    }
}
