package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kj.q;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\t\u001ac\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000fR\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\f*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aR\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aC\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0097\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\f*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r2%\b\n\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001ao\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\f*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010#\u001a\u00028\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b%\u0010&\u001as\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00042%\b\n\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u001c0\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'0\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001av\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00042%\b\n\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001c0\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*0\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010)\u001av\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u001f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00042%\b\n\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001c0\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020,0\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010)\u001av\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00042%\b\n\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u001c0\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020.0\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010)\u001av\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00042%\b\n\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u001c0\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002000\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010)\u001as\u00103\u001a\b\u0012\u0004\u0012\u0002020\u001f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00042%\b\n\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u001c0\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002020\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b3\u0010)\u001av\u00105\u001a\b\u0012\u0004\u0012\u0002040\u001f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00042%\b\n\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u001c0\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002040\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010)\u001as\u00107\u001a\b\u0012\u0004\u0012\u0002060\u001f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00042%\b\n\u0010\u001d\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u001c0\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002060\u0012¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u0010)\"\u0014\u00108\u001a\u0002028\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006:"}, d2 = {"T", "targetState", "", "label", "Landroidx/compose/animation/core/Transition;", "updateTransition", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "transitionState", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "S", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createDeferredAnimation", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "transformToChildState", "createChildTransition", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkj/q;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "initialState", "childLabel", "createChildTransitionInternal", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "targetValueByState", "Landroidx/compose/runtime/State;", "animateValue", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkj/q;Ljava/lang/String;Lkj/q;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "initialValue", "targetValue", "animationSpec", "createTransitionAnimation", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "", "animateFloat", "(Landroidx/compose/animation/core/Transition;Lkj/q;Ljava/lang/String;Lkj/q;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDp", "Landroidx/compose/ui/geometry/Offset;", "animateOffset", "Landroidx/compose/ui/geometry/Size;", "animateSize", "Landroidx/compose/ui/unit/IntOffset;", "animateIntOffset", "", "animateInt", "Landroidx/compose/ui/unit/IntSize;", "animateIntSize", "Landroidx/compose/ui/geometry/Rect;", "animateRect", "AnimationDebugDurationScale", "I", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class TransitionKt {
    public static final int AnimationDebugDurationScale = 1;

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Dp> animateDp(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Dp>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Dp> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(184732935);
        if ((i3 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Dp>>() { // from class: androidx.compose.animation.core.TransitionKt.animateDp.1
                @Composable
                public final SpringSpec<Dp> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, -575880366)) {
                        ComposerKt.traceEventStart(-575880366, i4, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:963)");
                    }
                    SpringSpec<Dp> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m5265boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.INSTANCE)), 3, null);
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
            str = "DpAnimation";
        }
        String str2 = str;
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(Dp.INSTANCE);
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceableGroup(-142660079);
        S currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Dp> stateCreateTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str2, composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Float> animateFloat(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Float>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Float> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(-1338768149);
        if ((i3 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Float>>() { // from class: androidx.compose.animation.core.TransitionKt.animateFloat.1
                @Composable
                public final SpringSpec<Float> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, -522164544)) {
                        ComposerKt.traceEventStart(-522164544, i4, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:934)");
                    }
                    SpringSpec<Float> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
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
            str = "FloatAnimation";
        }
        String str2 = str;
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(i.a);
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceableGroup(-142660079);
        S currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Float> stateCreateTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str2, composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Integer> animateInt(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Integer>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Integer> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(1318902782);
        if ((i3 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Integer>>() { // from class: androidx.compose.animation.core.TransitionKt.animateInt.1
                @Composable
                public final SpringSpec<Integer> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, -785273069)) {
                        ComposerKt.traceEventStart(-785273069, i4, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:1087)");
                    }
                    SpringSpec<Integer> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, 1, 3, null);
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
            str = "IntAnimation";
        }
        String str2 = str;
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(l.a);
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceableGroup(-142660079);
        S currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Integer> stateCreateTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str2, composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntOffset> animateIntOffset(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntOffset>> qVar, String str, q<? super S, ? super Composer, ? super Integer, IntOffset> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(776131825);
        if ((i3 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntOffset.1
                @Composable
                public final SpringSpec<IntOffset> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, -1953479610)) {
                        ComposerKt.traceEventStart(-1953479610, i4, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1058)");
                    }
                    SpringSpec<IntOffset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m5376boximpl(IntOffsetKt.IntOffset(1, 1)), 3, null);
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
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE);
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceableGroup(-142660079);
        S currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<IntOffset> stateCreateTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str2, composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<IntSize> animateIntSize(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<IntSize>> qVar, String str, q<? super S, ? super Composer, ? super Integer, IntSize> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(-2104123233);
        if ((i3 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.core.TransitionKt.animateIntSize.1
                @Composable
                public final SpringSpec<IntSize> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, 967893300)) {
                        ComposerKt.traceEventStart(967893300, i4, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1119)");
                    }
                    SpringSpec<IntSize> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m5419boximpl(IntSizeKt.IntSize(1, 1)), 3, null);
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
            str = "IntSizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<IntSize, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntSize.INSTANCE);
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceableGroup(-142660079);
        S currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<IntSize> stateCreateTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str2, composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Offset> animateOffset(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Offset>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Offset> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(2078477582);
        if ((i3 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>>() { // from class: androidx.compose.animation.core.TransitionKt.animateOffset.1
                @Composable
                public final SpringSpec<Offset> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, 1623385561)) {
                        ComposerKt.traceEventStart(1623385561, i4, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:994)");
                    }
                    SpringSpec<Offset> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m2574boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);
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
            str = "OffsetAnimation";
        }
        String str2 = str;
        TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.INSTANCE);
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceableGroup(-142660079);
        S currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Offset> stateCreateTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str2, composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Rect> animateRect(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Rect>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Rect> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(1496278239);
        if ((i3 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>>() { // from class: androidx.compose.animation.core.TransitionKt.animateRect.1
                @Composable
                public final SpringSpec<Rect> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, 691336298)) {
                        ComposerKt.traceEventStart(691336298, i4, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1149)");
                    }
                    SpringSpec<Rect> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);
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
            str = "RectAnimation";
        }
        String str2 = str;
        TwoWayConverter<Rect, AnimationVector4D> vectorConverter = VectorConvertersKt.getVectorConverter(Rect.INSTANCE);
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceableGroup(-142660079);
        S currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Rect> stateCreateTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str2, composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Size> animateSize(Transition<S> transition, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Size>> qVar, String str, q<? super S, ? super Composer, ? super Integer, Size> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(-802210820);
        if ((i3 & 1) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<Size>>() { // from class: androidx.compose.animation.core.TransitionKt.animateSize.1
                @Composable
                public final SpringSpec<Size> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, -1607152761)) {
                        ComposerKt.traceEventStart(-1607152761, i4, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:1025)");
                    }
                    SpringSpec<Size> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m2642boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);
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
            str = "SizeAnimation";
        }
        String str2 = str;
        TwoWayConverter<Size, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Size.INSTANCE);
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        composer.startReplaceableGroup(-142660079);
        S currentState = transition.getCurrentState();
        int i7 = (i6 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<Size> stateCreateTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i7)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), vectorConverter, str2, composer, (i6 & 14) | ((i6 << 9) & 57344) | ((i6 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S, T, V extends AnimationVector> State<T> animateValue(Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<T>> qVar, String str, q<? super S, ? super Composer, ? super Integer, ? extends T> qVar2, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(twoWayConverter, "typeConverter");
        m.h(qVar2, "targetValueByState");
        composer.startReplaceableGroup(-142660079);
        if ((i3 & 2) != 0) {
            qVar = new q<Transition.Segment<S>, Composer, Integer, SpringSpec<T>>() { // from class: androidx.compose.animation.core.TransitionKt.animateValue.1
                @Composable
                public final SpringSpec<T> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    if (androidx.browser.browseractions.a.o(segment, "$this$null", composer2, -895531546)) {
                        ComposerKt.traceEventStart(-895531546, i4, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:851)");
                    }
                    SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
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
        if ((i3 & 4) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        S currentState = transition.getCurrentState();
        int i4 = (i2 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        State<T> stateCreateTransitionAnimation = createTransitionAnimation(transition, qVar2.invoke(currentState, composer, Integer.valueOf(i4)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i4)), (FiniteAnimationSpec) qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i2 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), twoWayConverter, str2, composer, (i2 & 14) | (57344 & (i2 << 9)) | ((i2 << 6) & 458752));
        composer.endReplaceableGroup();
        return stateCreateTransitionAnimation;
    }

    @ExperimentalTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <S, T> Transition<T> createChildTransition(Transition<S> transition, String str, q<? super S, ? super Composer, ? super Integer, ? extends T> qVar, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(qVar, "transformToChildState");
        composer.startReplaceableGroup(1215497572);
        if ((i3 & 1) != 0) {
            str = "ChildTransition";
        }
        String str2 = str;
        int i4 = i2 & 14;
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = transition.getCurrentState();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        if (transition.isSeeking()) {
            objRememberedValue = transition.getCurrentState();
        }
        int i5 = (i2 >> 3) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        Transition<T> transitionCreateChildTransitionInternal = createChildTransitionInternal(transition, qVar.invoke(objRememberedValue, composer, Integer.valueOf(i5)), qVar.invoke(transition.getTargetState(), composer, Integer.valueOf(i5)), str2, composer, i4 | ((i2 << 6) & 7168));
        composer.endReplaceableGroup();
        return transitionCreateChildTransitionInternal;
    }

    @Composable
    public static final <S, T> Transition<T> createChildTransitionInternal(final Transition<S> transition, T t, T t2, String str, Composer composer, int i2) {
        m.h(transition, "<this>");
        m.h(str, "childLabel");
        composer.startReplaceableGroup(-198307638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198307638, i2, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:793)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition(new MutableTransitionState(t), transition.getLabel() + " > " + str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<T> transition2 = (Transition) objRememberedValue;
        composer.startReplaceableGroup(511388516);
        boolean zChanged2 = composer.changed(transition) | composer.changed(transition2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new kj.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    m.h(disposableEffectScope, "$this$DisposableEffect");
                    transition.addTransition$animation_core_release(transition2);
                    final Transition<S> transition3 = transition;
                    final Transition<T> transition4 = transition2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition3.removeTransition$animation_core_release(transition4);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition2, (kj.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (transition.isSeeking()) {
            transition2.seek(t, t2, transition.getLastSeekedTimeNanos());
        } else {
            transition2.updateTarget$animation_core_release(t2, composer, ((i2 >> 3) & 8) | ((i2 >> 6) & 14));
            transition2.setSeeking$animation_core_release(false);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition2;
    }

    @Composable
    @InternalAnimationApi
    public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(final Transition<S> transition, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i2, int i3) {
        m.h(transition, "<this>");
        m.h(twoWayConverter, "typeConverter");
        composer.startReplaceableGroup(-1714122528);
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1714122528, i2, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:748)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition.DeferredAnimation(transition, twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<S>.DeferredAnimation<T, V> deferredAnimation = (Transition.DeferredAnimation) objRememberedValue;
        EffectsKt.DisposableEffect(deferredAnimation, new kj.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt.createDeferredAnimation.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                m.h(disposableEffectScope, "$this$DisposableEffect");
                final Transition<S> transition2 = transition;
                final Transition<S>.DeferredAnimation<T, V> deferredAnimation2 = deferredAnimation;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        transition2.removeAnimation$animation_core_release(deferredAnimation2);
                    }
                };
            }
        }, composer, 0);
        if (transition.isSeeking()) {
            deferredAnimation.setupSeeking$animation_core_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return deferredAnimation;
    }

    @Composable
    public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(final Transition<S> transition, T t, T t2, FiniteAnimationSpec<T> finiteAnimationSpec, TwoWayConverter<T, V> twoWayConverter, String str, Composer composer, int i2) {
        m.h(transition, "<this>");
        m.h(finiteAnimationSpec, "animationSpec");
        m.h(twoWayConverter, "typeConverter");
        m.h(str, "label");
        composer.startReplaceableGroup(-304821198);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304821198, i2, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:865)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition.TransitionAnimationState(transition, t, AnimationStateKt.createZeroVectorFrom(twoWayConverter, t2), twoWayConverter, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition.TransitionAnimationState transitionAnimationState = (Transition.TransitionAnimationState) objRememberedValue;
        if (transition.isSeeking()) {
            transitionAnimationState.updateInitialAndTargetValue$animation_core_release(t, t2, finiteAnimationSpec);
        } else {
            transitionAnimationState.updateTargetValue$animation_core_release(t2, finiteAnimationSpec);
        }
        composer.startReplaceableGroup(511388516);
        boolean zChanged2 = composer.changed(transition) | composer.changed(transitionAnimationState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new kj.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    m.h(disposableEffectScope, "$this$DisposableEffect");
                    transition.addAnimation$animation_core_release(transitionAnimationState);
                    final Transition<S> transition2 = transition;
                    final Transition<S>.TransitionAnimationState<T, V> transitionAnimationState2 = transitionAnimationState;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.removeAnimation$animation_core_release(transitionAnimationState2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transitionAnimationState, (kj.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }

    @Composable
    public static final <T> Transition<T> updateTransition(T t, String str, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(2029166765);
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2029166765, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:66)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Transition(t, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core_release(t, composer, (i2 & 8) | 48 | (i2 & 14));
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(transition);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new kj.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    m.h(disposableEffectScope, "$this$DisposableEffect");
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onTransitionEnd$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (kj.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }

    @Composable
    public static final <T> Transition<T> updateTransition(MutableTransitionState<T> mutableTransitionState, String str, Composer composer, int i2, int i3) {
        m.h(mutableTransitionState, "transitionState");
        composer.startReplaceableGroup(882913843);
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(882913843, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:149)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(mutableTransitionState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Transition((MutableTransitionState) mutableTransitionState, str);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final Transition<T> transition = (Transition) objRememberedValue;
        transition.animateTo$animation_core_release(mutableTransitionState.getTargetState(), composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged2 = composer.changed(transition);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new kj.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    m.h(disposableEffectScope, "$this$DisposableEffect");
                    final Transition<T> transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            transition2.onTransitionEnd$animation_core_release();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(transition, (kj.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transition;
    }
}
