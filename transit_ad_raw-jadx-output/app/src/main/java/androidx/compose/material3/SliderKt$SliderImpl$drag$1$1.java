package androidx.compose.material3;

import androidx.compose.runtime.State;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
public final class SliderKt$SliderImpl$drag$1$1 extends SuspendLambda implements q<CoroutineScope, Float, dj.c<? super j>, Object> {
    final /* synthetic */ State<kj.a<j>> $gestureEndAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderImpl$drag$1$1(State<? extends kj.a<j>> state, dj.c<? super SliderKt$SliderImpl$drag$1$1> cVar) {
        super(3, cVar);
        this.$gestureEndAction = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((CoroutineScope) obj, ((Number) obj2).floatValue(), (dj.c<? super j>) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        li.c.O(obj);
        this.$gestureEndAction.getValue().invoke();
        return j.a;
    }

    public final Object invoke(CoroutineScope coroutineScope, float f, dj.c<? super j> cVar) {
        return new SliderKt$SliderImpl$drag$1$1(this.$gestureEndAction, cVar).invokeSuspend(j.a);
    }
}
