package androidx.compose.runtime;

import dj.e;
import java.util.concurrent.CancellationException;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: Effects.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R3\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/j;", "onRemembered", "onForgotten", "onAbandoned", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Ldj/c;", "", "task", "Lkj/p;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "Ldj/e;", "parentCoroutineContext", "<init>", "(Ldj/e;Lkj/p;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class LaunchedEffectImpl implements RememberObserver {
    private Job job;
    private final CoroutineScope scope;
    private final p<CoroutineScope, dj.c<? super j>, Object> task;

    public LaunchedEffectImpl(e eVar, p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object> pVar) {
        m.h(eVar, "parentCoroutineContext");
        m.h(pVar, "task");
        this.task = pVar;
        this.scope = CoroutineScopeKt.CoroutineScope(eVar);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        Job job = this.job;
        if (job != null) {
            JobKt.cancel$default(job, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.job = BuildersKt.launch$default(this.scope, (e) null, (CoroutineStart) null, this.task, 3, (Object) null);
    }
}
