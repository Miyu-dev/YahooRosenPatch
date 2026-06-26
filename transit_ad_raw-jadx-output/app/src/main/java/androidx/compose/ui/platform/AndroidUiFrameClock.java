package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import dj.d;
import dj.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: AndroidUiFrameClock.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lkj/l;Ldj/c;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "<init>", "(Landroid/view/Choreographer;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final Choreographer choreographer;

    public AndroidUiFrameClock(Choreographer choreographer) {
        kotlin.jvm.internal.m.h(choreographer, "choreographer");
        this.choreographer = choreographer;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> R fold(R r, kj.p<? super R, ? super e.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, pVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <E extends e.b> E get(e.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final /* synthetic */ e.c getKey() {
        return androidx.compose.runtime.c.a(this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public dj.e minusKey(e.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public dj.e plus(dj.e eVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, eVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(final kj.l<? super Long, ? extends R> lVar, dj.c<? super R> cVar) {
        dj.e context = cVar.getContext();
        int i2 = dj.d.G;
        AndroidUiDispatcher androidUiDispatcher = context.get(d.a.a);
        final AndroidUiDispatcher androidUiDispatcher2 = androidUiDispatcher instanceof AndroidUiDispatcher ? androidUiDispatcher : null;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(li.c.D(cVar), 1);
        cancellableContinuationImpl.initCancellability();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object obj;
                CancellableContinuation<R> cancellableContinuation = cancellableContinuationImpl;
                try {
                    obj = Result.constructor-impl(lVar.invoke(Long.valueOf(j)));
                } catch (Throwable th) {
                    obj = Result.constructor-impl(li.c.l(th));
                }
                cancellableContinuation.resumeWith(obj);
            }
        };
        if (androidUiDispatcher2 == null || !kotlin.jvm.internal.m.c(androidUiDispatcher2.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(frameCallback);
            cancellableContinuationImpl.invokeOnCancellation(new kj.l<Throwable, kotlin.j>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return kotlin.j.a;
                }

                public final void invoke(Throwable th) {
                    this.this$0.getChoreographer().removeFrameCallback(frameCallback);
                }
            });
        } else {
            androidUiDispatcher2.postFrameCallback$ui_release(frameCallback);
            cancellableContinuationImpl.invokeOnCancellation(new kj.l<Throwable, kotlin.j>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return kotlin.j.a;
                }

                public final void invoke(Throwable th) {
                    androidUiDispatcher2.removeFrameCallback$ui_release(frameCallback);
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }
}
