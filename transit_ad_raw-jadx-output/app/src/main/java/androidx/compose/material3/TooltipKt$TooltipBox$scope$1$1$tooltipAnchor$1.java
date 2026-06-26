package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@ej.c(c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1", f = "Tooltip.kt", l = {212}, m = "invokeSuspend")
public final class TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
    final /* synthetic */ kj.a<Job> $onLongPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Tooltip.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @ej.c(c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1", f = "Tooltip.kt", l = {217, 221, 229}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
        final /* synthetic */ kj.a<Job> $onLongPress;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Tooltip.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        @ej.c(c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1$1", f = "Tooltip.kt", l = {222}, m = "invokeSuspend")
        public static final class C01021 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super PointerInputChange>, Object> {
            final /* synthetic */ PointerEventPass $pass;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01021(PointerEventPass pointerEventPass, dj.c<? super C01021> cVar) {
                super(2, cVar);
                this.$pass = pointerEventPass;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                C01021 c01021 = new C01021(this.$pass, cVar);
                c01021.L$0 = obj;
                return c01021;
            }

            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super PointerInputChange> cVar) {
                return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
            }

            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    li.c.O(obj);
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    PointerEventPass pointerEventPass = this.$pass;
                    this.label = 1;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kj.a<? extends Job> aVar, dj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$onLongPress = aVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onLongPress, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(1:(6:7|25|(2:28|26)|36|29|30)(2:8|9))(5:10|32|11|29|30))(1:13))(2:14|(1:16)(1:17))|34|18|(1:20)|29|30) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
        
            r3 = r15;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[LOOP:0: B:26:0x0091->B:28:0x0097, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r14.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L39
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                li.c.O(r15)
                goto L85
            L15:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1d:
                java.lang.Object r1 = r14.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                java.lang.Object r3 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                li.c.O(r15)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L73
                goto La1
            L2a:
                long r6 = r14.J$0
                java.lang.Object r1 = r14.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                java.lang.Object r4 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                li.c.O(r15)
                r15 = r4
                goto L60
            L39:
                li.c.O(r15)
                java.lang.Object r15 = r14.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r15 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r15
                androidx.compose.ui.platform.ViewConfiguration r1 = r15.getViewConfiguration()
                long r12 = r1.getLongPressTimeoutMillis()
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r7 = 0
                r10 = 1
                r11 = 0
                r14.L$0 = r15
                r14.L$1 = r1
                r14.J$0 = r12
                r14.label = r4
                r6 = r15
                r8 = r1
                r9 = r14
                java.lang.Object r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r6, r7, r8, r9, r10, r11)
                if (r4 != r0) goto L5f
                return r0
            L5f:
                r6 = r12
            L60:
                androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1$1 r4 = new androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1$1     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L72
                r4.<init>(r1, r5)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L72
                r14.L$0 = r15     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L72
                r14.L$1 = r1     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L72
                r14.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L72
                java.lang.Object r15 = r15.withTimeout(r6, r4, r14)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L72
                if (r15 != r0) goto La1
                return r0
            L72:
                r3 = r15
            L73:
                kj.a<kotlinx.coroutines.Job> r15 = r14.$onLongPress
                r15.invoke()
                r14.L$0 = r5
                r14.L$1 = r5
                r14.label = r2
                java.lang.Object r15 = r3.awaitPointerEvent(r1, r14)
                if (r15 != r0) goto L85
                return r0
            L85:
                androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
                java.util.List r15 = r15.getChanges()
                java.lang.Iterable r15 = (java.lang.Iterable) r15
                java.util.Iterator r15 = r15.iterator()
            L91:
                boolean r0 = r15.hasNext()
                if (r0 == 0) goto La1
                java.lang.Object r0 = r15.next()
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                r0.consume()
                goto L91
            La1:
                kotlin.j r15 = kotlin.j.a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(kj.a<? extends Job> aVar, dj.c<? super TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1> cVar) {
        super(2, cVar);
        this.$onLongPress = aVar;
    }

    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
        TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1 tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1 = new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(this.$onLongPress, cVar);
        tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1.L$0 = obj;
        return tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, dj.c<? super j> cVar) {
        return create(pointerInputScope, cVar).invokeSuspend(j.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            li.c.O(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onLongPress, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
        }
        return j.a;
    }
}
