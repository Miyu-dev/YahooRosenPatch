package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/j;", "command", "invoke", "(Lkj/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AndroidComposeView$snapshotObserver$1 extends Lambda implements kj.l<kj.a<? extends kotlin.j>, kotlin.j> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$snapshotObserver$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(kj.a aVar) {
        kotlin.jvm.internal.m.h(aVar, "$tmp0");
        aVar.invoke();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((kj.a<kotlin.j>) obj);
        return kotlin.j.a;
    }

    public final void invoke(final kj.a<kotlin.j> aVar) {
        kotlin.jvm.internal.m.h(aVar, "command");
        Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            aVar.invoke();
            return;
        }
        Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.f
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidComposeView$snapshotObserver$1.invoke$lambda$0(aVar);
                }
            });
        }
    }
}
