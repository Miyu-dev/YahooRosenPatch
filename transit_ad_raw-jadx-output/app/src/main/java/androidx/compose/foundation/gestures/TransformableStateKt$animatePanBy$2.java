package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@ej.c(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", l = {182}, m = "invokeSuspend")
public final class TransformableStateKt$animatePanBy$2 extends SuspendLambda implements p<TransformScope, dj.c<? super j>, Object> {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref.LongRef $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(Ref.LongRef longRef, long j, AnimationSpec<Offset> animationSpec, dj.c<? super TransformableStateKt$animatePanBy$2> cVar) {
        super(2, cVar);
        this.$previous = longRef;
        this.$offset = j;
        this.$animationSpec = animationSpec;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, cVar);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
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
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.INSTANCE), Offset.m2574boximpl(this.$previous.element), null, 0L, 0L, false, 60, null);
            Offset offsetM2574boximpl = Offset.m2574boximpl(this.$offset);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            final Ref.LongRef longRef = this.$previous;
            l<AnimationScope<Offset, AnimationVector2D>, j> lVar = new l<AnimationScope<Offset, AnimationVector2D>, j>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope<Offset, AnimationVector2D>) obj2);
                    return j.a;
                }

                public final void invoke(AnimationScope<Offset, AnimationVector2D> animationScope) {
                    m.h(animationScope, "$this$animateTo");
                    d.a(transformScope, 0.0f, Offset.m2589minusMKHz9U(animationScope.getValue().getPackedValue(), longRef.element), 0.0f, 5, null);
                    longRef.element = animationScope.getValue().getPackedValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, offsetM2574boximpl, animationSpec, false, lVar, this, 4, null) == coroutineSingletons) {
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
