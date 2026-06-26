package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kj.q;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001av\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\n\u0010\u0007\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0002\b\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0007ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"S", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/runtime/Composable;", "transitionSpec", "", "label", "targetValueByState", "Landroidx/compose/runtime/State;", "animateColor", "(Landroidx/compose/animation/core/Transition;Lkj/q;Ljava/lang/String;Lkj/q;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animationSpec", "animateColor-DTcfvLk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 8, 0})
public final class TransitionKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Color> animateColor(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Color>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Color> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(-1939694975);
        if ((i3 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Color>>() { // from class: androidx.compose.animation.TransitionKt.animateColor.1
                @Composable
                public final SpringSpec<Color> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, -1457805428)) {
                        ComposerKt.traceEventStart(-1457805428, i4, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
                    }
                    SpringSpec<Color> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceableGroup();
                    return springSpecSpring$default;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        ColorSpace colorSpaceM2822getColorSpaceimpl = Color.m2822getColorSpaceimpl(((Color) qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf((i2 >> 6) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle))).m2828unboximpl());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(colorSpaceM2822getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM2822getColorSpaceimpl);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
        int i4 = (i2 & 14) | 64;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceableGroup(-142660079);
        S currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Color> stateCreateTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), twoWayConverter, str2, composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    /* JADX INFO: renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m103animateColorDTcfvLk(InfiniteTransition infiniteTransition, long j, long j2, InfiniteRepeatableSpec<Color> infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        m.h(infiniteTransition, "$this$animateColor");
        m.h(infiniteRepeatableSpec, "animationSpec");
        composer.startReplaceableGroup(1901963533);
        String str2 = (i3 & 8) != 0 ? "ColorAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i2, -1, "androidx.compose.animation.animateColor (Transition.kt:96)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(Color.m2822getColorSpaceimpl(j2));
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        int i4 = i2 << 3;
        State<Color> stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransition, Color.m2808boximpl(j), Color.m2808boximpl(j2), (TwoWayConverter) objRememberedValue, infiniteRepeatableSpec, str2, composer, InfiniteTransition.$stable | 4096 | (i2 & 14) | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & i4) | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAnimateValue;
    }

    @Composable
    /* JADX INFO: renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m104animateColorRIQooxk(InfiniteTransition infiniteTransition, long j, long j2, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i2) {
        m.h(infiniteTransition, "$this$animateColor");
        m.h(infiniteRepeatableSpec, "animationSpec");
        composer.startReplaceableGroup(1400583834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i2, -1, "androidx.compose.animation.animateColor (Transition.kt:113)");
        }
        State<Color> stateM103animateColorDTcfvLk = m103animateColorDTcfvLk(infiniteTransition, j, j2, infiniteRepeatableSpec, "ColorAnimation", composer, InfiniteTransition.$stable | 24576 | (i2 & 14) | (i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896) | (InfiniteRepeatableSpec.$stable << 9) | (i2 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM103animateColorDTcfvLk;
    }
}
