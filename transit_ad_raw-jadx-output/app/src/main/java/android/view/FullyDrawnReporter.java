package android.view;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kj.a;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u0014\u0010\t\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\b\u0010\n\u001a\u00020\u0002H\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "Lkotlin/j;", "postWhenReportersAreDone", "addReporter", "removeReporter", "Lkotlin/Function0;", "callback", "addOnReportDrawnListener", "removeOnReportDrawnListener", "fullyDrawnReported", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "reportFullyDrawn", "Lkj/a;", "lock", "Ljava/lang/Object;", "", "reporterCount", "I", "", "reportPosted", "Z", "reportedFullyDrawn", "", "onReportCallbacks", "Ljava/util/List;", "Ljava/lang/Runnable;", "reportRunnable", "Ljava/lang/Runnable;", "isFullyDrawnReported", "()Z", "<init>", "(Ljava/util/concurrent/Executor;Lkj/a;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;

    @GuardedBy("lock")
    private final List<a<j>> onReportCallbacks;
    private final a<j> reportFullyDrawn;

    @GuardedBy("lock")
    private boolean reportPosted;
    private final Runnable reportRunnable;

    @GuardedBy("lock")
    private boolean reportedFullyDrawn;

    @GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, a<j> aVar) {
        m.h(executor, "executor");
        m.h(aVar, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = aVar;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new g(this, 0);
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        m.h(fullyDrawnReporter, "this$0");
        synchronized (fullyDrawnReporter.lock) {
            fullyDrawnReporter.reportPosted = false;
            if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                fullyDrawnReporter.reportFullyDrawn.invoke();
                fullyDrawnReporter.fullyDrawnReported();
            }
            j jVar = j.a;
        }
    }

    public final void addOnReportDrawnListener(a<j> aVar) {
        boolean z;
        m.h(aVar, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z = true;
            } else {
                this.onReportCallbacks.add(aVar);
                z = false;
            }
        }
        if (z) {
            aVar.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.reporterCount++;
            }
            j jVar = j.a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            this.reportedFullyDrawn = true;
            Iterator<T> it = this.onReportCallbacks.iterator();
            while (it.hasNext()) {
                ((a) it.next()).invoke();
            }
            this.onReportCallbacks.clear();
            j jVar = j.a;
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.lock) {
            z = this.reportedFullyDrawn;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(a<j> aVar) {
        m.h(aVar, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(aVar);
            j jVar = j.a;
        }
    }

    public final void removeReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                int i2 = this.reporterCount;
                if (!(i2 > 0)) {
                    throw new IllegalStateException("removeReporter() called when all reporters have already been removed.".toString());
                }
                this.reporterCount = i2 - 1;
                postWhenReportersAreDone();
            }
            j jVar = j.a;
        }
    }
}
