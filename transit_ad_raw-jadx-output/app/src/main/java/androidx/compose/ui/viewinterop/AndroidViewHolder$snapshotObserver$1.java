package androidx.compose.ui.viewinterop;

import android.os.Looper;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidViewHolder.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/j;", "command", "invoke", "(Lkj/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AndroidViewHolder$snapshotObserver$1 extends Lambda implements l<kj.a<? extends j>, j> {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$snapshotObserver$1(AndroidViewHolder androidViewHolder) {
        super(1);
        this.this$0 = androidViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(kj.a aVar) {
        m.h(aVar, "$tmp0");
        aVar.invoke();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((kj.a<j>) obj);
        return j.a;
    }

    public final void invoke(final kj.a<j> aVar) {
        m.h(aVar, "command");
        if (this.this$0.getHandler().getLooper() == Looper.myLooper()) {
            aVar.invoke();
        } else {
            this.this$0.getHandler().post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidViewHolder$snapshotObserver$1.invoke$lambda$0(aVar);
                }
            });
        }
    }
}
