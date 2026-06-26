package android.view.contextaware;

import android.content.Context;
import kj.l;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CancellableContinuation;
import li.c;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "Landroid/content/Context;", "context", "Lkotlin/j;", "onContextAvailable", "activity_release"}, k = 1, mv = {1, 8, 0})
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ CancellableContinuation<R> $co;
    final /* synthetic */ l<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(CancellableContinuation<R> cancellableContinuation, l<Context, R> lVar) {
        this.$co = cancellableContinuation;
        this.$onContextAvailable = lVar;
    }

    @Override // android.view.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object obj;
        m.h(context, "context");
        CancellableContinuation<R> cancellableContinuation = this.$co;
        try {
            obj = Result.constructor-impl(this.$onContextAvailable.invoke(context));
        } catch (Throwable th) {
            obj = Result.constructor-impl(c.l(th));
        }
        cancellableContinuation.resumeWith(obj);
    }
}
