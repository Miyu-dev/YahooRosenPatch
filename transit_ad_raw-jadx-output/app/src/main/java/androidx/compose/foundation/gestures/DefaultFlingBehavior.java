package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.MotionDurationScale;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLdj/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "flingDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "Landroidx/compose/ui/MotionDurationScale;", "motionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "", "lastAnimationCycleCount", "I", "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V", "<init>", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class DefaultFlingBehavior implements FlingBehavior {
    private final DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2, reason: invalid class name */
    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {545}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super Float>, Object> {
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ ScrollScope $this_performFling;
        Object L$0;
        int label;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$initialVelocity = f;
            this.this$0 = defaultFlingBehavior;
            this.$this_performFling = scrollScope;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return new AnonymousClass2(this.$initialVelocity, this.this$0, this.$this_performFling, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            float f;
            Ref.FloatRef floatRef;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                if (Math.abs(this.$initialVelocity) <= 1.0f) {
                    f = this.$initialVelocity;
                    return new Float(f);
                }
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.element = this.$initialVelocity;
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                DecayAnimationSpec decayAnimationSpec = this.this$0.flingDecay;
                final ScrollScope scrollScope = this.$this_performFling;
                final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                l<AnimationScope<Float, AnimationVector1D>, j> lVar = new l<AnimationScope<Float, AnimationVector1D>, j>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                        return j.a;
                    }

                    public final void invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        m.h(animationScope, "$this$animateDecay");
                        float fFloatValue = animationScope.getValue().floatValue() - floatRef3.element;
                        float fScrollBy = scrollScope.scrollBy(fFloatValue);
                        floatRef3.element = animationScope.getValue().floatValue();
                        floatRef2.element = animationScope.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                            animationScope.cancelAnimation();
                        }
                        DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
                        defaultFlingBehavior2.setLastAnimationCycleCount(defaultFlingBehavior2.getLastAnimationCycleCount() + 1);
                    }
                };
                this.L$0 = floatRef2;
                this.label = 1;
                if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, lVar, this, 2, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                floatRef = floatRef2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef = (Ref.FloatRef) this.L$0;
                li.c.O(obj);
            }
            f = floatRef.element;
            return new Float(f);
        }

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super Float> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    public DefaultFlingBehavior(DecayAnimationSpec<Float> decayAnimationSpec, MotionDurationScale motionDurationScale) {
        m.h(decayAnimationSpec, "flingDecay");
        m.h(motionDurationScale, "motionDurationScale");
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f, dj.c<? super Float> cVar) {
        this.lastAnimationCycleCount = 0;
        return BuildersKt.withContext(this.motionDurationScale, new AnonymousClass2(f, this, scrollScope, null), cVar);
    }

    public final void setLastAnimationCycleCount(int i2) {
        this.lastAnimationCycleCount = i2;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i2 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}
