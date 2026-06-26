package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Latch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0013\u0010\n\u001a\u00020\u0007H\u0086@ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "R", "Lkotlin/Function0;", "block", "withClosed", "(Lkj/a;)Ljava/lang/Object;", "Lkotlin/j;", "closeLatch", "openLatch", "await", "(Ldj/c;)Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "", "Ldj/c;", "awaiters", "Ljava/util/List;", "spareList", "", "_isOpen", "Z", "isOpen", "()Z", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class Latch {
    private final Object lock = new Object();
    private List<dj.c<j>> awaiters = new ArrayList();
    private List<dj.c<j>> spareList = new ArrayList();
    private boolean _isOpen = true;

    public final Object await(dj.c<? super j> cVar) {
        if (isOpen()) {
            return j.a;
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(li.c.D(cVar), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this.lock) {
            this.awaiters.add(cancellableContinuationImpl);
        }
        cancellableContinuationImpl.invokeOnCancellation(new l<Throwable, j>() { // from class: androidx.compose.runtime.Latch$await$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return j.a;
            }

            public final void invoke(Throwable th) {
                Object obj = this.this$0.lock;
                Latch latch = this.this$0;
                CancellableContinuation<j> cancellableContinuation = cancellableContinuationImpl;
                synchronized (obj) {
                    latch.awaiters.remove(cancellableContinuation);
                    j jVar = j.a;
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : j.a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            j jVar = j.a;
        }
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.lock) {
            z = this._isOpen;
        }
        return z;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            if (isOpen()) {
                return;
            }
            List<dj.c<j>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            this._isOpen = true;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).resumeWith(Result.constructor-impl(j.a));
            }
            list.clear();
            j jVar = j.a;
        }
    }

    public final <R> R withClosed(kj.a<? extends R> block) {
        m.h(block, "block");
        closeLatch();
        try {
            return (R) block.invoke();
        } finally {
            openLatch();
        }
    }
}
