package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/unit/Velocity;", "velocity", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@ej.c(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", l = {406, 408, 410}, m = "invokeSuspend")
public final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements p<Velocity, dj.c<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, dj.c<? super ScrollingLogic$onDragStopped$performFling$1> cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, cVar);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m373invokesFctU(((Velocity) obj).getPackedValue(), (dj.c) obj2);
    }

    /* JADX INFO: renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m373invokesFctU(long j, dj.c<? super Velocity> cVar) {
        return create(Velocity.m5483boximpl(j), cVar).invokeSuspend(j.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L22
            if (r0 != r1) goto L1a
            long r0 = r13.J$1
            long r2 = r13.J$0
            li.c.O(r14)
            r9 = r0
            r0 = r14
            goto L93
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L22:
            long r2 = r13.J$1
            long r4 = r13.J$0
            li.c.O(r14)
            r0 = r14
            r7 = r4
            goto L6c
        L2c:
            long r3 = r13.J$0
            li.c.O(r14)
            r0 = r14
            goto L50
        L33:
            li.c.O(r14)
            long r4 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.State r0 = r0.getNestedScrollDispatcher()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r0
            r13.J$0 = r4
            r13.label = r3
            java.lang.Object r0 = r0.m4028dispatchPreFlingQWom1Mo(r4, r13)
            if (r0 != r6) goto L4f
            return r6
        L4f:
            r3 = r4
        L50:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r7 = r0.getPackedValue()
            long r7 = androidx.compose.ui.unit.Velocity.m5495minusAH228Gc(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m361doFlingAnimationQWom1Mo(r7, r13)
            if (r0 != r6) goto L69
            return r6
        L69:
            r11 = r3
            r2 = r7
            r7 = r11
        L6c:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r9 = r0.getPackedValue()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.runtime.State r0 = r0.getNestedScrollDispatcher()
            java.lang.Object r0 = r0.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher) r0
            long r2 = androidx.compose.ui.unit.Velocity.m5495minusAH228Gc(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r1 = r2
            r3 = r9
            r5 = r13
            java.lang.Object r0 = r0.m4026dispatchPostFlingRZ2iAVY(r1, r3, r5)
            if (r0 != r6) goto L92
            return r6
        L92:
            r2 = r7
        L93:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r0 = r0.getPackedValue()
            long r0 = androidx.compose.ui.unit.Velocity.m5495minusAH228Gc(r9, r0)
            long r0 = androidx.compose.ui.unit.Velocity.m5495minusAH228Gc(r2, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m5483boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
