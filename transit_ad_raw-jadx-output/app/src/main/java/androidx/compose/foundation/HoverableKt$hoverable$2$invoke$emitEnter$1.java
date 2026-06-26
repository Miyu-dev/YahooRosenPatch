package androidx.compose.foundation;

import androidx.compose.foundation.HoverableKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ej.c(c = "androidx.compose.foundation.HoverableKt$hoverable$2", f = "Hoverable.kt", l = {androidx.appcompat.R.styleable.AppCompatTheme_dialogPreferredPadding}, m = "invoke$emitEnter")
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class HoverableKt$hoverable$2$invoke$emitEnter$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public HoverableKt$hoverable$2$invoke$emitEnter$1(dj.c<? super HoverableKt$hoverable$2$invoke$emitEnter$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt.AnonymousClass2.invoke$emitEnter(null, null, this);
    }
}
