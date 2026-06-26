package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@ej.c(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {439, 442}, m = "invokeSuspend")
public final class ClickableKt$handlePressInteraction$2$delayJob$1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
    final /* synthetic */ State<kj.a<Boolean>> $delayPressInteraction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2$delayJob$1(State<? extends kj.a<Boolean>> state, long j, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, dj.c<? super ClickableKt$handlePressInteraction$2$delayJob$1> cVar) {
        super(2, cVar);
        this.$delayPressInteraction = state;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        PressInteraction.Press press;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            if (((Boolean) this.$delayPressInteraction.getValue().invoke()).booleanValue()) {
                long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
                this.label = 1;
                if (DelayKt.delay(tapIndicationDelay, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                press = (PressInteraction.Press) this.L$0;
                li.c.O(obj);
                this.$pressedInteraction.setValue(press);
                return j.a;
            }
            li.c.O(obj);
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.$pressPoint, null);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        this.L$0 = press2;
        this.label = 2;
        if (mutableInteractionSource.emit(press2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        press = press2;
        this.$pressedInteraction.setValue(press);
        return j.a;
    }

    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
        return create(coroutineScope, cVar).invokeSuspend(j.a);
    }
}
