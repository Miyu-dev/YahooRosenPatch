package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import dj.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: BroadcastFrameClock.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0019\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J-\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0011\u001a\u00020\u00042\f\b\u0002\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fR\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "", "cause", "Lkotlin/j;", "fail", "", "timeNanos", "sendFrame", "R", "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lkj/l;Ldj/c;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellationException", "cancel", "Lkotlin/Function0;", "onNewAwaiters", "Lkj/a;", "", "lock", "Ljava/lang/Object;", "failureCause", "Ljava/lang/Throwable;", "", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "awaiters", "Ljava/util/List;", "spareList", "", "getHasAwaiters", "()Z", "hasAwaiters", "<init>", "(Lkj/a;)V", "FrameAwaiter", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private List<FrameAwaiter<?>> awaiters;
    private Throwable failureCause;
    private final Object lock;
    private final kj.a<j> onNewAwaiters;
    private List<FrameAwaiter<?>> spareList;

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "", "timeNanos", "Lkotlin/j;", "resume", "Lkotlin/Function1;", "onFrame", "Lkj/l;", "getOnFrame", "()Lkj/l;", "Ldj/c;", "continuation", "Ldj/c;", "getContinuation", "()Ldj/c;", "<init>", "(Lkj/l;Ldj/c;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class FrameAwaiter<R> {
        private final dj.c<R> continuation;
        private final l<Long, R> onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(l<? super Long, ? extends R> lVar, dj.c<? super R> cVar) {
            m.h(lVar, "onFrame");
            m.h(cVar, "continuation");
            this.onFrame = lVar;
            this.continuation = cVar;
        }

        public final dj.c<R> getContinuation() {
            return this.continuation;
        }

        public final l<Long, R> getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j) {
            Object obj;
            dj.c<R> cVar = this.continuation;
            try {
                obj = Result.constructor-impl(this.onFrame.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                obj = Result.constructor-impl(li.c.l(th));
            }
            cVar.resumeWith(obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BroadcastFrameClock() {
        kj.a aVar = null;
        this(aVar, 1, aVar);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.lock) {
            if (this.failureCause != null) {
                return;
            }
            this.failureCause = th;
            List<FrameAwaiter<?>> list = this.awaiters;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).getContinuation().resumeWith(Result.constructor-impl(li.c.l(th)));
            }
            this.awaiters.clear();
            j jVar = j.a;
        }
    }

    public final void cancel(CancellationException cancellationException) {
        m.h(cancellationException, "cancellationException");
        fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> R fold(R r, p<? super R, ? super e.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, pVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <E extends e.b> E get(e.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean getHasAwaiters() {
        boolean z;
        synchronized (this.lock) {
            z = !this.awaiters.isEmpty();
        }
        return z;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final /* synthetic */ e.c getKey() {
        return c.a(this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public e minusKey(e.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public e plus(e eVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, eVar);
    }

    public final void sendFrame(long j) {
        synchronized (this.lock) {
            List<FrameAwaiter<?>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).resume(j);
            }
            list.clear();
            j jVar = j.a;
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(l<? super Long, ? extends R> lVar, dj.c<? super R> cVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(li.c.D(cVar), 1);
        cancellableContinuationImpl.initCancellability();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(li.c.l(th)));
            } else {
                objectRef.element = new FrameAwaiter(lVar, cancellableContinuationImpl);
                boolean z = !this.awaiters.isEmpty();
                List list = this.awaiters;
                Object obj = objectRef.element;
                if (obj == null) {
                    m.o("awaiter");
                    throw null;
                }
                list.add((FrameAwaiter) obj);
                boolean z2 = !z;
                cancellableContinuationImpl.invokeOnCancellation(new l<Throwable, j>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return j.a;
                    }

                    public final void invoke(Throwable th2) {
                        Object obj2 = this.this$0.lock;
                        BroadcastFrameClock broadcastFrameClock = this.this$0;
                        Ref.ObjectRef<BroadcastFrameClock.FrameAwaiter<R>> objectRef2 = objectRef;
                        synchronized (obj2) {
                            List list2 = broadcastFrameClock.awaiters;
                            Object obj3 = objectRef2.element;
                            if (obj3 == null) {
                                m.o("awaiter");
                                throw null;
                            }
                            list2.remove((BroadcastFrameClock.FrameAwaiter) obj3);
                            j jVar = j.a;
                        }
                    }
                });
                if (z2 && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public BroadcastFrameClock(kj.a<j> aVar) {
        this.onNewAwaiters = aVar;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public /* synthetic */ BroadcastFrameClock(kj.a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : aVar);
    }
}
