package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.p;
import kj.q;
import kotlin.Metadata;

/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Alignment;", "contentAlignment", "", "propagateMinConstraints", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Lkotlin/j;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "content", "BoxWithConstraints", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkj/q;Landroidx/compose/runtime/Composer;II)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
public final class BoxWithConstraintsKt {
    @Composable
    @UiComposable
    public static final void BoxWithConstraints(Modifier modifier, Alignment alignment, boolean z, final q<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, kotlin.j> qVar, Composer composer, final int i2, final int i3) {
        final int i4;
        kotlin.jvm.internal.m.h(qVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1781813501);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= composerStartRestartGroup.changed(alignment) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? Optimizer.OPTIMIZATION_CACHE_MEASURES : Optimizer.OPTIMIZATION_GRAPH_WRAP;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 7168) == 0) {
            i4 |= composerStartRestartGroup.changed(qVar) ? 2048 : Optimizer.OPTIMIZATION_GROUPING;
        }
        if ((i4 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i6 != 0) {
                alignment = Alignment.INSTANCE.getTopStart();
            }
            if (i7 != 0) {
                z = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781813501, i4, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:58)");
            }
            int i8 = i4 >> 3;
            final MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment, z, composerStartRestartGroup, (i8 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i8 & 14));
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(qVar) | composerStartRestartGroup.changed(measurePolicyRememberBoxMeasurePolicy);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m431invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                    }

                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m431invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
                        kotlin.jvm.internal.m.h(subcomposeMeasureScope, "$this$SubcomposeLayout");
                        final BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = new BoxWithConstraintsScopeImpl(subcomposeMeasureScope, j, null);
                        kotlin.j jVar = kotlin.j.a;
                        final q<BoxWithConstraintsScope, Composer, Integer, kotlin.j> qVar2 = qVar;
                        final int i9 = i4;
                        return measurePolicyRememberBoxMeasurePolicy.mo34measure3p2s80s(subcomposeMeasureScope, subcomposeMeasureScope.subcompose(jVar, ComposableLambdaKt.composableLambdaInstance(-1945019079, true, new p<Composer, Integer, kotlin.j>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return kotlin.j.a;
                            }

                            @Composable
                            public final void invoke(Composer composer2, int i10) {
                                if ((i10 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1945019079, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                                }
                                qVar2.invoke(boxWithConstraintsScopeImpl, composer2, Integer.valueOf((i9 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })), j);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (p) objRememberedValue, composerStartRestartGroup, i4 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final Alignment alignment2 = alignment;
        final boolean z2 = z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, kotlin.j>() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return kotlin.j.a;
            }

            public final void invoke(Composer composer2, int i9) {
                BoxWithConstraintsKt.BoxWithConstraints(modifier2, alignment2, z2, qVar, composer2, i2 | 1, i3);
            }
        });
    }
}
