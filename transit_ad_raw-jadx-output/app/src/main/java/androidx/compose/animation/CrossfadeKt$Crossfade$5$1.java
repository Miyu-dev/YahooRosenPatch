package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class CrossfadeKt$Crossfade$5$1 extends Lambda implements p<Composer, Integer, j> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ FiniteAnimationSpec<Float> $animationSpec;
    final /* synthetic */ q<T, Composer, Integer, j> $content;
    final /* synthetic */ T $stateForContent;
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CrossfadeKt$Crossfade$5$1(Transition<T> transition, int i2, FiniteAnimationSpec<Float> finiteAnimationSpec, T t, q<? super T, ? super Composer, ? super Integer, j> qVar) {
        super(2);
        this.$this_Crossfade = transition;
        this.$$dirty = i2;
        this.$animationSpec = finiteAnimationSpec;
        this.$stateForContent = t;
        this.$content = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return j.a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i2) {
        if ((i2 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1426421288, i2, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
        }
        Transition<T> transition = this.$this_Crossfade;
        final FiniteAnimationSpec<Float> finiteAnimationSpec = this.$animationSpec;
        q<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>> qVar = new q<Transition.Segment<T>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<T> segment, Composer composer2, int i3) {
                if (androidx.browser.browseractions.a.o(segment, "$this$animateFloat", composer2, 438406499)) {
                    ComposerKt.traceEventStart(438406499, i3, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
                }
                FiniteAnimationSpec<Float> finiteAnimationSpec2 = finiteAnimationSpec;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer2.endReplaceableGroup();
                return finiteAnimationSpec2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        };
        T t = this.$stateForContent;
        int i3 = this.$$dirty & 14;
        composer.startReplaceableGroup(-1338768149);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(i.a);
        int i4 = i3 & 14;
        int i5 = i3 << 3;
        int i6 = (i5 & 57344) | i4 | (i5 & 896) | (i5 & 7168);
        composer.startReplaceableGroup(-142660079);
        Object currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        composer.startReplaceableGroup(-438678252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-438678252, i7, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
        }
        float f = m.c(currentState, t) ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        Float fValueOf = Float.valueOf(f);
        Object targetState = transition.getTargetState();
        composer.startReplaceableGroup(-438678252);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-438678252, i7, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
        }
        float f2 = m.c(targetState, t) ? 1.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        final State stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, fValueOf, Float.valueOf(f2), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, "FloatAnimation", composer, (i6 & 14) | (57344 & (i6 << 9)) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(stateCreateTransitionAnimation);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new l<GraphicsLayerScope, j>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((GraphicsLayerScope) obj);
                    return j.a;
                }

                public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                    m.h(graphicsLayerScope, "$this$graphicsLayer");
                    graphicsLayerScope.setAlpha(CrossfadeKt$Crossfade$5$1.invoke$lambda$1(stateCreateTransitionAnimation));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (l) objRememberedValue);
        q<T, Composer, Integer, j> qVar2 = this.$content;
        T t2 = this.$stateForContent;
        int i8 = this.$$dirty;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyB = android.support.v4.media.a.b(Alignment.INSTANCE, false, composer, 0, -1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        kj.a<ComposeUiNode> constructor = companion2.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, j> qVarMaterializerOf = LayoutKt.materializerOf(modifierGraphicsLayer);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer composerM2437constructorimpl = Updater.m2437constructorimpl(composer);
        qVarMaterializerOf.invoke(androidx.appcompat.app.m.d(companion2, composerM2437constructorimpl, measurePolicyB, composerM2437constructorimpl, density, composerM2437constructorimpl, layoutDirection, composerM2437constructorimpl, viewConfiguration, composer, composer), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        qVar2.invoke(t2, composer, Integer.valueOf((i8 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
