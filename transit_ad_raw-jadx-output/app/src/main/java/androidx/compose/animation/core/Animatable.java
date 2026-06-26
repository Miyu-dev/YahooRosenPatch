package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kj.l;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010Z\u001a\u00028\u0000\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010/\u001a\u00020.¢\u0006\u0004\b[\u0010\\B1\b\u0017\u0012\u0006\u0010Z\u001a\u00028\u0000\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b[\u0010]J%\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJe\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\n\u001a\u00028\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\r\u001a\u00028\u00002\"\b\u0002\u0010\u000f\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JY\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\r\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\"\b\u0002\u0010\u000f\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u001b\u0010\u001e\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ]\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\r\u001a\u00028\u00002 \u0010\u000f\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b$\u0010%J\b\u0010&\u001a\u00020\u0007H\u0002R#\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R+\u0010<\u001a\u0002082\u0006\u00109\u001a\u0002088F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R+\u0010\n\u001a\u00028\u00002\u0006\u00109\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u00109\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\bE\u0010BR(\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\u00109\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\bF\u0010BR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010O\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010R\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0016\u0010S\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010PR\u0011\u0010\u001d\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bT\u0010BR\u0011\u0010W\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010Y\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bX\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "lowerBound", "upperBound", "Lkotlin/j;", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "initialVelocity", "Lkotlin/Function1;", "block", "Landroidx/compose/animation/core/AnimationResult;", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkj/l;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkj/l;Ldj/c;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Ldj/c;)Ljava/lang/Object;", "stop", "(Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "", "value", "createVector", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "animation", "runAnimation", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkj/l;Ldj/c;)Ljava/lang/Object;", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThreshold", "Ljava/lang/Object;", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "targetValue$delegate", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "getLowerBound", "getUpperBound", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "negativeInfinityBounds", "Landroidx/compose/animation/core/AnimationVector;", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "getValue", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private final SpringSpec<T> defaultSpringSpec;
    private final AnimationState<T, V> internalState;

    /* JADX INFO: renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final MutableState isRunning;
    private final String label;
    private T lowerBound;
    private V lowerBoundVector;
    private final MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;

    /* JADX INFO: renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final MutableState targetValue;
    private final TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$runAnimation$2, reason: invalid class name */
    /* JADX INFO: compiled from: Animatable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/AnimationResult;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements l<dj.c<? super AnimationResult<T, V>>, Object> {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ l<Animatable<T, V>, j> $block;
        final /* synthetic */ T $initialVelocity;
        final /* synthetic */ long $startTime;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Animatable<T, V> animatable, T t, Animation<T, V> animation, long j, l<? super Animatable<T, V>, j> lVar, dj.c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.this$0 = animatable;
            this.$initialVelocity = t;
            this.$animation = animation;
            this.$startTime = j;
            this.$block = lVar;
        }

        public final dj.c<j> create(dj.c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, cVar);
        }

        public final Object invoke(dj.c<? super AnimationResult<T, V>> cVar) {
            return create(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            AnimationState animationState;
            Ref.BooleanRef booleanRef;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    li.c.O(obj);
                    this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                    this.this$0.setTargetValue(this.$animation.getTargetValue());
                    this.this$0.setRunning(true);
                    final AnimationState animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                    final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Animation<T, V> animation = this.$animation;
                    long j = this.$startTime;
                    final Animatable<T, V> animatable = this.this$0;
                    final l<Animatable<T, V>, j> lVar = this.$block;
                    l<AnimationScope<T, V>, j> lVar2 = new l<AnimationScope<T, V>, j>() { // from class: androidx.compose.animation.core.Animatable.runAnimation.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((AnimationScope) obj2);
                            return j.a;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(AnimationScope<T, V> animationScope) {
                            m.h(animationScope, "$this$animate");
                            SuspendAnimationKt.updateState(animationScope, animatable.getInternalState$animation_core_release());
                            Object objClampToBounds = animatable.clampToBounds(animationScope.getValue());
                            if (m.c(objClampToBounds, animationScope.getValue())) {
                                l<Animatable<T, V>, j> lVar3 = lVar;
                                if (lVar3 != null) {
                                    lVar3.invoke(animatable);
                                    return;
                                }
                                return;
                            }
                            animatable.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
                            animationStateCopy$default.setValue$animation_core_release((T) objClampToBounds);
                            l<Animatable<T, V>, j> lVar4 = lVar;
                            if (lVar4 != null) {
                                lVar4.invoke(animatable);
                            }
                            animationScope.cancelAnimation();
                            booleanRef2.element = true;
                        }
                    };
                    this.L$0 = animationStateCopy$default;
                    this.L$1 = booleanRef2;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(animationStateCopy$default, animation, j, lVar2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    animationState = animationStateCopy$default;
                    booleanRef = booleanRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    li.c.O(obj);
                }
                AnimationEndReason animationEndReason = booleanRef.element ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
                this.this$0.endAnimation();
                return new AnimationResult(animationState, animationEndReason);
            } catch (CancellationException e) {
                this.this$0.endAnimation();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Animatable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    public static final class C01472 extends SuspendLambda implements l<dj.c<? super j>, Object> {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01472(Animatable<T, V> animatable, T t, dj.c<? super C01472> cVar) {
            super(1, cVar);
            this.this$0 = animatable;
            this.$targetValue = t;
        }

        public final dj.c<j> create(dj.c<?> cVar) {
            return new C01472(this.this$0, this.$targetValue, cVar);
        }

        public final Object invoke(dj.c<? super j> cVar) {
            return create(cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            this.this$0.endAnimation();
            Object objClampToBounds = this.this$0.clampToBounds(this.$targetValue);
            this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(objClampToBounds);
            this.this$0.setTargetValue(objClampToBounds);
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Animatable$stop$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Animatable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
    public static final class C01482 extends SuspendLambda implements l<dj.c<? super j>, Object> {
        int label;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01482(Animatable<T, V> animatable, dj.c<? super C01482> cVar) {
            super(1, cVar);
            this.this$0 = animatable;
        }

        public final dj.c<j> create(dj.c<?> cVar) {
            return new C01482(this.this$0, cVar);
        }

        public final Object invoke(dj.c<? super j> cVar) {
            return create(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            this.this$0.endAnimation();
            return j.a;
        }
    }

    public Animatable(T t, TwoWayConverter<T, V> twoWayConverter, T t2, String str) {
        m.h(twoWayConverter, "typeConverter");
        m.h(str, "label");
        this.typeConverter = twoWayConverter;
        this.visibilityThreshold = t2;
        this.label = str;
        this.internalState = new AnimationState<>(twoWayConverter, t, null, 0L, 0L, false, 60, null);
        this.isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.targetValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t2, 3, null);
        V v = (V) createVector(t, Float.NEGATIVE_INFINITY);
        this.negativeInfinityBounds = v;
        V v2 = (V) createVector(t, Float.POSITIVE_INFINITY);
        this.positiveInfinityBounds = v2;
        this.lowerBoundVector = v;
        this.upperBoundVector = v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, l lVar, dj.c cVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, lVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, l lVar, dj.c cVar, int i2, Object obj3) {
        if ((i2 & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            obj2 = animatable.getVelocity();
        }
        Object obj4 = obj2;
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        return animatable.animateTo(obj, animationSpec2, obj4, lVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T value) {
        if (m.c(this.lowerBoundVector, this.negativeInfinityBounds) && m.c(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        AnimationVector animationVector = (AnimationVector) this.typeConverter.getConvertToVector().invoke(value);
        int size = animationVector.getSize();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (animationVector.get$animation_core_release(i2) < this.lowerBoundVector.get$animation_core_release(i2) || animationVector.get$animation_core_release(i2) > this.upperBoundVector.get$animation_core_release(i2)) {
                animationVector.set$animation_core_release(i2, a.l.h(animationVector.get$animation_core_release(i2), this.lowerBoundVector.get$animation_core_release(i2), this.upperBoundVector.get$animation_core_release(i2)));
                z = true;
            }
        }
        return z ? (T) this.typeConverter.getConvertFromVector().invoke(animationVector) : value;
    }

    private final V createVector(T t, float f) {
        V v = (V) this.typeConverter.getConvertToVector().invoke(t);
        int size = v.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            v.set$animation_core_release(i2, f);
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t, l<? super Animatable<T, V>, j> lVar, dj.c<? super AnimationResult<T, V>> cVar) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new AnonymousClass2(this, t, animation, this.internalState.getLastFrameTimeNanos(), lVar, null), cVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.isRunning.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t) {
        this.targetValue.setValue(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i2 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    public final Object animateDecay(T t, DecayAnimationSpec<T> decayAnimationSpec, l<? super Animatable<T, V>, j> lVar, dj.c<? super AnimationResult<T, V>> cVar) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) this.typeConverter, (Object) getValue(), (AnimationVector) this.typeConverter.getConvertToVector().invoke(t)), t, lVar, cVar);
    }

    public final Object animateTo(T t, AnimationSpec<T> animationSpec, T t2, l<? super Animatable<T, V>, j> lVar, dj.c<? super AnimationResult<T, V>> cVar) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t, t2), t2, lVar, cVar);
    }

    public final State<T> asState() {
        return this.internalState;
    }

    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    public final String getLabel() {
        return this.label;
    }

    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue.getValue();
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    public final V getVelocityVector() {
        return (V) this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final Object snapTo(T t, dj.c<? super j> cVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C01472(this, t, null), cVar, 1, null);
        return objMutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate$default : j.a;
    }

    public final Object stop(dj.c<? super j> cVar) {
        Object objMutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new C01482(this, null), cVar, 1, null);
        return objMutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objMutate$default : j.a;
    }

    public final void updateBounds(T lowerBound, T upperBound) {
        V v;
        V v2;
        if (lowerBound == null || (v = (V) this.typeConverter.getConvertToVector().invoke(lowerBound)) == null) {
            v = this.negativeInfinityBounds;
        }
        if (upperBound == null || (v2 = (V) this.typeConverter.getConvertToVector().invoke(upperBound)) == null) {
            v2 = this.positiveInfinityBounds;
        }
        int size = v.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            if (!(v.get$animation_core_release(i2) <= v2.get$animation_core_release(i2))) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v + " is greater than upper bound " + v2 + " on index " + i2).toString());
            }
        }
        this.lowerBoundVector = v;
        this.upperBoundVector = v2;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (isRunning()) {
            return;
        }
        T tClampToBounds = clampToBounds(getValue());
        if (m.c(tClampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(tClampToBounds);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i2 & 4) != 0 ? null : obj2, (i2 & 8) != 0 ? "Animatable" : str);
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i2 & 4) != 0 ? null : obj2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
        m.h(twoWayConverter, "typeConverter");
    }
}
