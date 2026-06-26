package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.j;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SuspendAnimation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aW\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000b2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a}\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0013\u001aw\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010\f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u001c\u001as\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010!\u001aM\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u000e\"\b\b\u0002\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a<\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0000\u001a\u0080\u0001\u0010+\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00002\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0002\u001a\u0080\u0001\u0010-\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0010*\u00020\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0004\u0012\u00020\u00070\u0017H\u0002\"\u0018\u0010)\u001a\u00020\u0000*\u00020.8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/j;", "block", "animate", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkj/p;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animateDecay", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkj/p;Ldj/c;)Ljava/lang/Object;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkj/p;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkj/l;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkj/l;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkj/l;Ldj/c;)Ljava/lang/Object;", "R", "onFrame", "callWithFrameNanos", "(Landroidx/compose/animation/core/Animation;Lkj/l;Ldj/c;)Ljava/lang/Object;", "state", "updateState", "frameTimeNanos", "durationScale", "anim", "doAnimationFrameWithScale", "playTimeNanos", "doAnimationFrame", "Ldj/e;", "getDurationScale", "(Ldj/e;)F", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class SuspendAnimationKt {

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$4, reason: invalid class name */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @ej.c(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {239, 278}, m = "animate")
    public static final class AnonymousClass4<T, V extends AnimationVector> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass4(dj.c<? super AnonymousClass4> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SuspendAnimationKt.animate(null, null, 0L, null, this);
        }
    }

    public static final Object animate(float f, float f2, float f3, AnimationSpec<Float> animationSpec, p<? super Float, ? super Float, j> pVar, dj.c<? super j> cVar) {
        Object objAnimate = animate(VectorConvertersKt.getVectorConverter(i.a), new Float(f), new Float(f2), new Float(f3), animationSpec, pVar, cVar);
        return objAnimate == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate : j.a;
    }

    public static /* synthetic */ Object animate$default(float f, float f2, float f3, AnimationSpec animationSpec, p pVar, dj.c cVar, int i2, Object obj) {
        float f4 = (i2 & 4) != 0 ? 0.0f : f3;
        if ((i2 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f, f2, f4, animationSpec, pVar, cVar);
    }

    public static final Object animateDecay(float f, float f2, FloatDecayAnimationSpec floatDecayAnimationSpec, final p<? super Float, ? super Float, j> pVar, dj.c<? super j> cVar) {
        Object objAnimate$default = animate$default(AnimationStateKt.AnimationState$default(f, f2, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f, f2), 0L, new l<AnimationScope<Float, AnimationVector1D>, j>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope<Float, AnimationVector1D>) obj);
                return j.a;
            }

            public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                m.h(animationScope, "$this$animate");
                pVar.invoke(animationScope.getValue(), Float.valueOf(((AnimationVector1D) animationScope.getVelocityVector()).getValue()));
            }
        }, cVar, 2, null);
        return objAnimate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate$default : j.a;
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z, l lVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            lVar = new l() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.4
                public final void invoke(AnimationScope animationScope) {
                    m.h(animationScope, "$this$null");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return j.a;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z, lVar, (dj.c<? super j>) cVar);
    }

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> animationState, T t, AnimationSpec<T> animationSpec, boolean z, l<? super AnimationScope<T, V>, j> lVar, dj.c<? super j> cVar) {
        Object objAnimate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t, animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, cVar);
        return objAnimate == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate : j.a;
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z, l lVar, dj.c cVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            lVar = new l() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateTo.2
                public final void invoke(AnimationScope animationScope) {
                    m.h(animationScope, "$this$null");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((AnimationScope) obj3);
                    return j.a;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z2, lVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, final l<? super Long, ? extends R> lVar, dj.c<? super R> cVar) {
        return animation.getIsInfinite() ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(lVar, cVar) : MonotonicFrameClockKt.withFrameNanos(new l<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.callWithFrameNanos.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).longValue());
            }

            public final R invoke(long j) {
                return (R) lVar.invoke(Long.valueOf(j / 1));
            }
        }, cVar);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j, long j2, Animation<T, V> animation, AnimationState<T, V> animationState, l<? super AnimationScope<T, V>, j> lVar) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j2));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j2));
        if (animation.isFinishedFromNanos(j2)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        lVar.invoke(animationScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j, float f, Animation<T, V> animation, AnimationState<T, V> animationState, l<? super AnimationScope<T, V>, j> lVar) {
        doAnimationFrame(animationScope, j, (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? animation.getDurationNanos() : (long) ((j - animationScope.getStartTimeNanos()) / f), animation, animationState, lVar);
    }

    public static final float getDurationScale(dj.e eVar) {
        m.h(eVar, "<this>");
        MotionDurationScale motionDurationScale = (MotionDurationScale) eVar.get(MotionDurationScale.INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends AnimationVector> void updateState(AnimationScope<T, V> animationScope, AnimationState<T, V> animationState) {
        m.h(animationScope, "<this>");
        m.h(animationState, "state");
        animationState.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationScope.isRunning());
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j, l lVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            lVar = new l() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.5
                public final void invoke(AnimationScope animationScope) {
                    m.h(animationScope, "$this$null");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope) obj2);
                    return j.a;
                }
            };
        }
        return animate(animationState, animation, j2, lVar, cVar);
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z, l<? super AnimationScope<T, V>, j> lVar, dj.c<? super j> cVar) {
        Object objAnimate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) animationState.getTypeConverter(), (Object) animationState.getValue(), animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, lVar, cVar);
        return objAnimate == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate : j.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(final androidx.compose.animation.core.AnimationState<T, V> r25, final androidx.compose.animation.core.Animation<T, V> r26, long r27, final kj.l<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.j> r29, dj.c<? super kotlin.j> r30) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, kj.l, dj.c):java.lang.Object");
    }

    public static final <T, V extends AnimationVector> Object animate(final TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3, AnimationSpec<T> animationSpec, final p<? super T, ? super T, j> pVar, dj.c<? super j> cVar) {
        AnimationVector animationVectorNewInstance;
        if (t3 == null || (animationVectorNewInstance = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t3)) == null) {
            animationVectorNewInstance = AnimationVectorsKt.newInstance((AnimationVector) twoWayConverter.getConvertToVector().invoke(t));
        }
        Object objAnimate$default = animate$default(new AnimationState(twoWayConverter, t, animationVectorNewInstance, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t, t2, animationVectorNewInstance), 0L, new l<AnimationScope<T, V>, j>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AnimationScope) obj);
                return j.a;
            }

            public final void invoke(AnimationScope<T, V> animationScope) {
                m.h(animationScope, "$this$animate");
                pVar.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
            }
        }, cVar, 2, null);
        return objAnimate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimate$default : j.a;
    }
}
