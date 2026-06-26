package androidx.compose.material3;

import androidx.compose.ui.focus.FocusManager;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.material3.SearchBarKt$DockedSearchBar$3", f = "SearchBar.kt", l = {411}, m = "invokeSuspend")
public final class SearchBarKt$DockedSearchBar$3 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ FocusManager $focusManager;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$DockedSearchBar$3(boolean z, FocusManager focusManager, dj.c<? super SearchBarKt$DockedSearchBar$3> cVar) {
        super(2, cVar);
        this.$active = z;
        this.$focusManager = focusManager;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        return new SearchBarKt$DockedSearchBar$3(this.$active, this.$focusManager, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            if (!this.$active) {
                this.label = 1;
                if (DelayKt.delay(100L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return j.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        li.c.O(obj);
        androidx.compose.ui.focus.b.a(this.$focusManager, false, 1, null);
        return j.a;
    }

    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
        return create(coroutineScope, cVar).invokeSuspend(j.a);
    }
}
