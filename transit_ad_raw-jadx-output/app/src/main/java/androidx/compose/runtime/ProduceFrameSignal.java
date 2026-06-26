package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "lock", "Lkotlin/j;", "awaitFrameRequest", "(Ljava/lang/Object;Ldj/c;)Ljava/lang/Object;", "takeFrameRequestLocked", "Ldj/c;", "requestFrameLocked", "pendingFrameContinuation", "Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object obj, dj.c<? super j> cVar) {
        dj.c cVar2;
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                this.pendingFrameContinuation = RecomposerKt.FramePending;
                return j.a;
            }
            j jVar = j.a;
            dj.c cancellableContinuationImpl = new CancellableContinuationImpl(li.c.D(cVar), 1);
            cancellableContinuationImpl.initCancellability();
            synchronized (obj) {
                if (this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                    this.pendingFrameContinuation = RecomposerKt.FramePending;
                    cVar2 = cancellableContinuationImpl;
                } else {
                    this.pendingFrameContinuation = cancellableContinuationImpl;
                    cVar2 = null;
                }
            }
            if (cVar2 != null) {
                cVar2.resumeWith(Result.constructor-impl(j.a));
            }
            Object result = cancellableContinuationImpl.getResult();
            return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : j.a;
        }
    }

    public final dj.c<j> requestFrameLocked() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof dj.c) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (dj.c) obj;
        }
        if (!(m.c(obj, RecomposerKt.ProduceAnotherFrame) ? true : m.c(obj, RecomposerKt.FramePending))) {
            if (obj != null) {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
            }
            this.pendingFrameContinuation = RecomposerKt.ProduceAnotherFrame;
        }
        return null;
    }

    public final void takeFrameRequestLocked() {
        if (!(this.pendingFrameContinuation == RecomposerKt.FramePending)) {
            throw new IllegalStateException("frame not pending".toString());
        }
        this.pendingFrameContinuation = null;
    }
}
