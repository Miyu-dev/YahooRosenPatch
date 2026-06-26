package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000ø\u0001\u0000\u001a2\u0010\u0007\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\f\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\t\u001a\u00020\u00012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000f\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\r\u001a5\u0010\u0013\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0014\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0016\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015\u001a%\u0010\u0019\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001c\u001a\u00020\u0003*\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlin/Function3;", "", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/j;", "onTransformation", "Landroidx/compose/foundation/gestures/TransformableState;", "TransformableState", "rememberTransformableState", "(Lkj/q;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TransformableState;", "zoomFactor", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateZoomBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLandroidx/compose/animation/core/AnimationSpec;Ldj/c;)Ljava/lang/Object;", "degrees", "animateRotateBy", TypedValues.CycleType.S_WAVE_OFFSET, "animatePanBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/TransformableState;JLandroidx/compose/animation/core/AnimationSpec;Ldj/c;)Ljava/lang/Object;", "animatePanBy", "zoomBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLdj/c;)Ljava/lang/Object;", "rotateBy", "panBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/TransformableState;JLdj/c;)Ljava/lang/Object;", "panBy", "Landroidx/compose/foundation/MutatePriority;", "terminationPriority", "stopTransformation", "(Landroidx/compose/foundation/gestures/TransformableState;Landroidx/compose/foundation/MutatePriority;Ldj/c;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TransformableStateKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", l = {158}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<TransformScope, dj.c<? super j>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $degrees;
        final /* synthetic */ Ref.FloatRef $previous;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.FloatRef floatRef, float f, AnimationSpec<Float> animationSpec, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$previous = floatRef;
            this.$degrees = f;
            this.$animationSpec = animationSpec;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$previous, this.$degrees, this.$animationSpec, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(TransformScope transformScope, dj.c<? super j> cVar) {
            return create(transformScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
                Float f = new Float(this.$degrees);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref.FloatRef floatRef = this.$previous;
                l<AnimationScope<Float, AnimationVector1D>, j> lVar = new l<AnimationScope<Float, AnimationVector1D>, j>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                        return j.a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        m.h(animationScope, "$this$animateTo");
                        d.a(transformScope, 0.0f, 0L, animationScope.getValue().floatValue() - floatRef.element, 3, null);
                        floatRef.element = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, f, animationSpec, false, lVar, this, 4, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3, reason: invalid class name */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", l = {138}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<TransformScope, dj.c<? super j>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref.FloatRef $previous;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Ref.FloatRef floatRef, float f, AnimationSpec<Float> animationSpec, dj.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$previous = floatRef;
            this.$zoomFactor = f;
            this.$animationSpec = animationSpec;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$previous, this.$zoomFactor, this.$animationSpec, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(TransformScope transformScope, dj.c<? super j> cVar) {
            return create(transformScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
                Float f = new Float(this.$zoomFactor);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref.FloatRef floatRef = this.$previous;
                l<AnimationScope<Float, AnimationVector1D>, j> lVar = new l<AnimationScope<Float, AnimationVector1D>, j>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                        return j.a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        m.h(animationScope, "$this$animateTo");
                        d.a(transformScope, (floatRef.element > 0.0f ? 1 : (floatRef.element == 0.0f ? 0 : -1)) == 0 ? 1.0f : animationScope.getValue().floatValue() / floatRef.element, 0L, 0.0f, 6, null);
                        floatRef.element = animationScope.getValue().floatValue();
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, f, animationSpec, false, lVar, this, 4, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
    public static final class C01942 extends SuspendLambda implements p<TransformScope, dj.c<? super j>, Object> {
        final /* synthetic */ float $degrees;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01942(float f, dj.c<? super C01942> cVar) {
            super(2, cVar);
            this.$degrees = f;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01942 c01942 = new C01942(this.$degrees, cVar);
            c01942.L$0 = obj;
            return c01942;
        }

        public final Object invoke(TransformScope transformScope, dj.c<? super j> cVar) {
            return create(transformScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            ((TransformScope) this.L$0).mo275transformByd4ec7I(1.0f, Offset.INSTANCE.m2601getZeroF1C5BW0(), this.$degrees);
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
    public static final class C01952 extends SuspendLambda implements p<TransformScope, dj.c<? super j>, Object> {
        int label;

        public C01952(dj.c<? super C01952> cVar) {
            super(2, cVar);
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return new C01952(cVar);
        }

        public final Object invoke(TransformScope transformScope, dj.c<? super j> cVar) {
            return create(transformScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2", f = "TransformableState.kt", l = {}, m = "invokeSuspend")
    public static final class C01962 extends SuspendLambda implements p<TransformScope, dj.c<? super j>, Object> {
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01962(float f, dj.c<? super C01962> cVar) {
            super(2, cVar);
            this.$zoomFactor = f;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01962 c01962 = new C01962(this.$zoomFactor, cVar);
            c01962.L$0 = obj;
            return c01962;
        }

        public final Object invoke(TransformScope transformScope, dj.c<? super j> cVar) {
            return create(transformScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            ((TransformScope) this.L$0).mo275transformByd4ec7I(this.$zoomFactor, Offset.INSTANCE.m2601getZeroF1C5BW0(), 0.0f);
            return j.a;
        }
    }

    public static final TransformableState TransformableState(q<? super Float, ? super Offset, ? super Float, j> qVar) {
        m.h(qVar, "onTransformation");
        return new DefaultTransformableState(qVar);
    }

    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m378animatePanByubNVwUQ(TransformableState transformableState, long j, AnimationSpec<Offset> animationSpec, dj.c<? super j> cVar) {
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = Offset.INSTANCE.m2601getZeroF1C5BW0();
        Object objA = e.a(transformableState, null, new TransformableStateKt$animatePanBy$2(longRef, j, animationSpec, null), cVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : j.a;
    }

    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m379animatePanByubNVwUQ$default(TransformableState transformableState, long j, AnimationSpec animationSpec, dj.c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m378animatePanByubNVwUQ(transformableState, j, animationSpec, cVar);
    }

    public static final Object animateRotateBy(TransformableState transformableState, float f, AnimationSpec<Float> animationSpec, dj.c<? super j> cVar) {
        Object objA = e.a(transformableState, null, new AnonymousClass2(new Ref.FloatRef(), f, animationSpec, null), cVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : j.a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f, AnimationSpec animationSpec, dj.c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f, animationSpec, cVar);
    }

    public static final Object animateZoomBy(TransformableState transformableState, float f, AnimationSpec<Float> animationSpec, dj.c<? super j> cVar) {
        if (!(f > 0.0f)) {
            throw new IllegalArgumentException("zoom value should be greater than 0".toString());
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 1.0f;
        Object objA = e.a(transformableState, null, new AnonymousClass3(floatRef, f, animationSpec, null), cVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : j.a;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f, AnimationSpec animationSpec, dj.c cVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f, animationSpec, cVar);
    }

    /* JADX INFO: renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m380panByd4ec7I(TransformableState transformableState, long j, dj.c<? super j> cVar) {
        Object objA = e.a(transformableState, null, new TransformableStateKt$panBy$2(j, null), cVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : j.a;
    }

    @Composable
    public static final TransformableState rememberTransformableState(q<? super Float, ? super Offset, ? super Float, j> qVar, Composer composer, int i2) {
        m.h(qVar, "onTransformation");
        composer.startReplaceableGroup(1681419281);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i2, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:114)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(qVar, composer, i2 & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = TransformableState(new q<Float, Offset, Float, j>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m381invoked4ec7I(((Number) obj).floatValue(), ((Offset) obj2).getPackedValue(), ((Number) obj3).floatValue());
                    return j.a;
                }

                /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m381invoked4ec7I(float f, long j, float f2) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f), Offset.m2574boximpl(j), Float.valueOf(f2));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TransformableState transformableState = (TransformableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transformableState;
    }

    public static final Object rotateBy(TransformableState transformableState, float f, dj.c<? super j> cVar) {
        Object objA = e.a(transformableState, null, new C01942(f, null), cVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : j.a;
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, dj.c<? super j> cVar) {
        Object objTransform = transformableState.transform(mutatePriority, new C01952(null), cVar);
        return objTransform == CoroutineSingletons.COROUTINE_SUSPENDED ? objTransform : j.a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, cVar);
    }

    public static final Object zoomBy(TransformableState transformableState, float f, dj.c<? super j> cVar) {
        Object objA = e.a(transformableState, null, new C01962(f, null), cVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : j.a;
    }
}
