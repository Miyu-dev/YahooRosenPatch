package android.view;

import ej.c;
import kj.l;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.j;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "Lkotlin/Function1;", "Ldj/c;", "Lkotlin/j;", "", "reporter", "reportWhenComplete", "(Landroidx/activity/FullyDrawnReporter;Lkj/l;Ldj/c;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0})
public final class FullyDrawnReporterKt {

    /* JADX INFO: renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1, reason: invalid class name */
    /* JADX INFO: compiled from: FullyDrawnReporter.kt */
    @c(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", l = {188}, m = "reportWhenComplete")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object reportWhenComplete(android.view.FullyDrawnReporter r4, kj.l<? super dj.c<? super kotlin.j>, ? extends java.lang.Object> r5, dj.c<? super kotlin.j> r6) {
        /*
            boolean r0 = r6 instanceof android.view.FullyDrawnReporterKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (android.view.FullyDrawnReporterKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            androidx.activity.FullyDrawnReporter r4 = (android.view.FullyDrawnReporter) r4
            li.c.O(r6)     // Catch: java.lang.Throwable -> L53
            goto L4d
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            li.c.O(r6)
            r4.addReporter()
            boolean r6 = r4.isFullyDrawnReported()
            if (r6 == 0) goto L42
            kotlin.j r4 = kotlin.j.a
            return r4
        L42:
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L53
            r0.label = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L53
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r4.removeReporter()
            kotlin.j r4 = kotlin.j.a
            return r4
        L53:
            r5 = move-exception
            r4.removeReporter()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.view.FullyDrawnReporterKt.reportWhenComplete(androidx.activity.FullyDrawnReporter, kj.l, dj.c):java.lang.Object");
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, l<? super dj.c<? super j>, ? extends Object> lVar, dj.c<? super j> cVar) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return j.a;
        }
        try {
            lVar.invoke(cVar);
            fullyDrawnReporter.removeReporter();
            return j.a;
        } catch (Throwable th) {
            fullyDrawnReporter.removeReporter();
            throw th;
        }
    }
}
