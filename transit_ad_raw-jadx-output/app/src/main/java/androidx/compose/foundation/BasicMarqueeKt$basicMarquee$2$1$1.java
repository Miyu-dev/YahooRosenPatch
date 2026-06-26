package androidx.compose.foundation;

import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2$1$1", f = "BasicMarquee.kt", l = {174}, m = "invokeSuspend")
public final class BasicMarqueeKt$basicMarquee$2$1$1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
    final /* synthetic */ MarqueeModifier $modifier;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicMarqueeKt$basicMarquee$2$1$1(MarqueeModifier marqueeModifier, dj.c<? super BasicMarqueeKt$basicMarquee$2$1$1> cVar) {
        super(2, cVar);
        this.$modifier = marqueeModifier;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        return new BasicMarqueeKt$basicMarquee$2$1$1(this.$modifier, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            MarqueeModifier marqueeModifier = this.$modifier;
            this.label = 1;
            if (marqueeModifier.runAnimation(this) == coroutineSingletons) {
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

    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
        return create(coroutineScope, cVar).invokeSuspend(j.a);
    }
}
