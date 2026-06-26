package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import ej.c;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@c(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {134, 136}, m = "invokeSuspend")
public final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ l<Float, j> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehavior$fling$result$1(float f, SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, l<? super Float, j> lVar, dj.c<? super SnapFlingBehavior$fling$result$1> cVar) {
        super(2, cVar);
        this.$initialVelocity = f;
        this.this$0 = snapFlingBehavior;
        this.$this_fling = scrollScope;
        this.$onRemainingScrollOffsetUpdate = lVar;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        return new SnapFlingBehavior$fling$result$1(this.$initialVelocity, this.this$0, this.$this_fling, this.$onRemainingScrollOffsetUpdate, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 == 1) {
                li.c.O(obj);
                return (AnimationResult) obj;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            return (AnimationResult) obj;
        }
        li.c.O(obj);
        if (Math.abs(this.$initialVelocity) <= Math.abs(this.this$0.velocityThreshold)) {
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollScope scrollScope = this.$this_fling;
            float f = this.$initialVelocity;
            l<Float, j> lVar = this.$onRemainingScrollOffsetUpdate;
            this.label = 1;
            obj = snapFlingBehavior.shortSnap(scrollScope, f, lVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            return (AnimationResult) obj;
        }
        SnapFlingBehavior snapFlingBehavior2 = this.this$0;
        ScrollScope scrollScope2 = this.$this_fling;
        float f2 = this.$initialVelocity;
        l<Float, j> lVar2 = this.$onRemainingScrollOffsetUpdate;
        this.label = 2;
        obj = snapFlingBehavior2.longSnap(scrollScope2, f2, lVar2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        return (AnimationResult) obj;
    }

    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super AnimationResult<Float, AnimationVector1D>> cVar) {
        return create(coroutineScope, cVar).invokeSuspend(j.a);
    }
}
