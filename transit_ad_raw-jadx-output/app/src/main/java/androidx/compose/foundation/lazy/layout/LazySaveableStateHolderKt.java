package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazySaveableStateHolder.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "content", "LazySaveableStateHolderProvider", "(Lkj/q;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazySaveableStateHolderKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void LazySaveableStateHolderProvider(final q<? super SaveableStateHolder, ? super Composer, ? super Integer, j> qVar, Composer composer, final int i2) {
        final int i3;
        m.h(qVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(674185128);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(qVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674185128, i3, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composerStartRestartGroup.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
            final LazySaveableStateHolder lazySaveableStateHolder = (LazySaveableStateHolder) RememberSaveableKt.m2460rememberSaveable(new Object[]{saveableStateRegistry}, (Saver) LazySaveableStateHolder.INSTANCE.saver(saveableStateRegistry), (String) null, (kj.a) new kj.a<LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final LazySaveableStateHolder m687invoke() {
                    return new LazySaveableStateHolder(saveableStateRegistry, a0.a);
                }
            }, composerStartRestartGroup, 72, 4);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(lazySaveableStateHolder)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1863926504, true, new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt.LazySaveableStateHolderProvider.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return j.a;
                }

                @Composable
                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1863926504, i4, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:48)");
                    }
                    lazySaveableStateHolder.setWrappedHolder(SaveableStateHolderKt.rememberSaveableStateHolder(composer2, 0));
                    qVar.invoke(lazySaveableStateHolder, composer2, Integer.valueOf(((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt.LazySaveableStateHolderProvider.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i4) {
                LazySaveableStateHolderKt.LazySaveableStateHolderProvider(qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }
}
