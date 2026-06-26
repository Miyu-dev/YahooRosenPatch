package androidx.compose.foundation;

import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", f = "Hoverable.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_panelMenuListWidth}, m = "invokeSuspend")
public final class HoverableKt$hoverable$2$2$1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableKt$hoverable$2$2$1(boolean z, MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, dj.c<? super HoverableKt$hoverable$2$2$1> cVar) {
        super(2, cVar);
        this.$enabled = z;
        this.$hoverInteraction$delegate = mutableState;
        this.$interactionSource = mutableInteractionSource;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        return new HoverableKt$hoverable$2$2$1(this.$enabled, this.$hoverInteraction$delegate, this.$interactionSource, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            if (!this.$enabled) {
                MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                this.label = 1;
                if (HoverableKt.AnonymousClass2.invoke$emitExit(mutableState, mutableInteractionSource, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
