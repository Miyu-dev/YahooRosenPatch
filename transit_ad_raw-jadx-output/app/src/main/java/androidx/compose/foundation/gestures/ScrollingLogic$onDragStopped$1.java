package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ej.c(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {419, TypedValues.CycleType.TYPE_WAVE_SHAPE}, m = "onDragStopped-sF-c-tU")
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScrollingLogic$onDragStopped$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$1(ScrollingLogic scrollingLogic, dj.c<? super ScrollingLogic$onDragStopped$1> cVar) {
        super(cVar);
        this.this$0 = scrollingLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m362onDragStoppedsFctU(0L, this);
    }
}
