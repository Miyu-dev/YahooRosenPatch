package androidx.compose.foundation.pager;

import androidx.appcompat.R;
import androidx.compose.ui.unit.Density;
import ej.c;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@c(c = "androidx.compose.foundation.pager.PagerKt$Pager$2$1", f = "Pager.kt", l = {}, m = "invokeSuspend")
public final class PagerKt$Pager$2$1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ PagerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$Pager$2$1(Density density, PagerState pagerState, float f, dj.c<? super PagerKt$Pager$2$1> cVar) {
        super(2, cVar);
        this.$density = density;
        this.$state = pagerState;
        this.$pageSpacing = f;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        return new PagerKt$Pager$2$1(this.$density, this.$state, this.$pageSpacing, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        li.c.O(obj);
        this.$state.setPageSpacing$foundation_release(this.$density.mo342roundToPx0680j_4(this.$pageSpacing));
        return j.a;
    }

    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
        return create(coroutineScope, cVar).invokeSuspend(j.a);
    }
}
