package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragScope;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@ej.c(c = "androidx.compose.material3.SwipeableV2State$swipeDraggableState$1$drag$2", f = "SwipeableV2.kt", l = {188}, m = "invokeSuspend")
public final class SwipeableV2State$swipeDraggableState$1$drag$2 extends SuspendLambda implements l<dj.c<? super j>, Object> {
    final /* synthetic */ p<DragScope, dj.c<? super j>, Object> $block;
    int label;
    final /* synthetic */ SwipeableV2State$swipeDraggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$swipeDraggableState$1$drag$2(p pVar, SwipeableV2State$swipeDraggableState$1 swipeableV2State$swipeDraggableState$1, dj.c cVar) {
        super(1, cVar);
        this.$block = pVar;
        this.this$0 = swipeableV2State$swipeDraggableState$1;
    }

    public final dj.c<j> create(dj.c<?> cVar) {
        return new SwipeableV2State$swipeDraggableState$1$drag$2(this.$block, this.this$0, cVar);
    }

    public final Object invoke(dj.c<? super j> cVar) {
        return create(cVar).invokeSuspend(j.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            p<DragScope, dj.c<? super j>, Object> pVar = this.$block;
            SwipeableV2State$swipeDraggableState$1$dragScope$1 swipeableV2State$swipeDraggableState$1$dragScope$1 = this.this$0.dragScope;
            this.label = 1;
            if (pVar.invoke(swipeableV2State$swipeDraggableState$1$dragScope$1, this) == coroutineSingletons) {
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
