package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u008e\u0001\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u0003*\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a^\u0010\u0015\u001a\u00020\u0003*\u00020\u00002*\b\u0002\u0010\n\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a!\u0010\u0019\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u0019\u001a\u00020\u0011*\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u0011*\u00020\u000eH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0010\u001a#\u0010\u001e\u001a\u0004\u0018\u00010\u0011*\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"<\u0010 \u001a$\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/j;", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Ldj/c;", "", "onPress", "onTap", "detectTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkj/l;Lkj/l;Lkj/q;Lkj/l;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "consumeUntilUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "firstUp", "awaitSecondDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Ldj/c;)Ljava/lang/Object;", "detectTapAndPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkj/q;Lkj/l;Ldj/c;)Ljava/lang/Object;", "", "requireUnconsumed", "awaitFirstDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLdj/c;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Ldj/c;)Ljava/lang/Object;", "waitForUpOrCancellation", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Ldj/c;)Ljava/lang/Object;", "NoPressGesture", "Lkj/q;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TapGestureDetectorKt {
    private static final q<PressGestureScope, Offset, dj.c<? super j>, Object> NoPressGesture = new TapGestureDetectorKt$NoPressGesture$1(null);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2, reason: invalid class name */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {279}, m = "awaitFirstDown")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass2 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(dj.c<? super AnonymousClass2> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {212}, m = "invokeSuspend")
    public static final class C01902 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super PointerInputChange>, Object> {
        final /* synthetic */ PointerInputChange $firstUp;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01902(PointerInputChange pointerInputChange, dj.c<? super C01902> cVar) {
            super(2, cVar);
            this.$firstUp = pointerInputChange;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01902 c01902 = new C01902(this.$firstUp, cVar);
            c01902.L$0 = obj;
            return c01902;
        }

        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super PointerInputChange> cVar) {
            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:13:0x0050). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.label
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                long r3 = r12.J$0
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                li.c.O(r13)
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                goto L50
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                li.c.O(r13)
                java.lang.Object r13 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                androidx.compose.ui.input.pointer.PointerInputChange r1 = r12.$firstUp
                long r3 = r1.getUptimeMillis()
                androidx.compose.ui.platform.ViewConfiguration r1 = r13.getViewConfiguration()
                long r5 = r1.getDoubleTapMinTimeMillis()
                long r5 = r5 + r3
                r1 = r13
                r9 = r5
                r13 = r12
            L38:
                r4 = 0
                r5 = 0
                r7 = 3
                r8 = 0
                r13.L$0 = r1
                r13.J$0 = r9
                r13.label = r2
                r3 = r1
                r6 = r13
                java.lang.Object r3 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r3, r4, r5, r6, r7, r8)
                if (r3 != r0) goto L4b
                return r0
            L4b:
                r11 = r0
                r0 = r13
                r13 = r3
                r3 = r1
                r1 = r11
            L50:
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                long r4 = r13.getUptimeMillis()
                int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r4 < 0) goto L5b
                return r13
            L5b:
                r13 = r0
                r0 = r1
                r1 = r3
                goto L38
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C01902.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1, reason: invalid class name */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {195}, m = "consumeUntilUp")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
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
            return TapGestureDetectorKt.consumeUntilUp(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
    public static final class C01912 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ q<PressGestureScope, Offset, dj.c<? super j>, Object> $onPress;
        final /* synthetic */ l<Offset, j> $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        final /* synthetic */ PointerInputScope $this_detectTapAndPress;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ q<PressGestureScope, Offset, dj.c<? super j>, Object> $onPress;
            final /* synthetic */ l<Offset, j> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
            public static final class C00291 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00291(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super C00291> cVar) {
                    super(2, cVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new C00291(this.$pressScope, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        this.label = 1;
                        if (pressGestureScopeImpl.reset(this) == coroutineSingletons) {
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

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
            public static final class C00302 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ q<PressGestureScope, Offset, dj.c<? super j>, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00302(q<? super PressGestureScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, dj.c<? super C00302> cVar) {
                    super(2, cVar);
                    this.$onPress = qVar;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new C00302(this.$onPress, this.$pressScope, this.$down, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        q<PressGestureScope, Offset, dj.c<? super j>, Object> qVar = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM2574boximpl = Offset.m2574boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (qVar.invoke(pressGestureScopeImpl, offsetM2574boximpl, this) == coroutineSingletons) {
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

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass3 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass3(this.$pressScope, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                    this.$pressScope.cancel();
                    return j.a;
                }

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass4 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass4> cVar) {
                    super(2, cVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass4(this.$pressScope, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                    this.$pressScope.release();
                    return j.a;
                }

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(CoroutineScope coroutineScope, q<? super PressGestureScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, l<? super Offset, j> lVar, PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$$this$coroutineScope = coroutineScope;
                this.$onPress = qVar;
                this.$onTap = lVar;
                this.$pressScope = pressGestureScopeImpl;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                /*
                    r23 = this;
                    r6 = r23
                    kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r0 = r6.label
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    if (r0 == 0) goto L28
                    if (r0 == r9) goto L1d
                    if (r0 != r8) goto L15
                    li.c.O(r24)
                    r0 = r24
                    goto L7b
                L15:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L1d:
                    java.lang.Object r0 = r6.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                    li.c.O(r24)
                    r11 = r0
                    r0 = r24
                    goto L4f
                L28:
                    li.c.O(r24)
                    java.lang.Object r0 = r6.L$0
                    r11 = r0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                    kotlinx.coroutines.CoroutineScope r0 = r6.$$this$coroutineScope
                    r1 = 0
                    r2 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r4 = r6.$pressScope
                    r3.<init>(r4, r10)
                    r4 = 3
                    r5 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
                    r1 = 0
                    r6.L$0 = r11
                    r6.label = r9
                    r0 = r11
                    r3 = r23
                    java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                    if (r0 != r7) goto L4f
                    return r7
                L4f:
                    androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                    r0.consume()
                    kj.q<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, dj.c<? super kotlin.j>, java.lang.Object> r1 = r6.$onPress
                    kj.q r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getNoPressGesture$p()
                    if (r1 == r2) goto L70
                    kotlinx.coroutines.CoroutineScope r12 = r6.$$this$coroutineScope
                    r13 = 0
                    r14 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r15 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                    kj.q<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, dj.c<? super kotlin.j>, java.lang.Object> r1 = r6.$onPress
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r6.$pressScope
                    r15.<init>(r1, r2, r0, r10)
                    r16 = 3
                    r17 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r12, r13, r14, r15, r16, r17)
                L70:
                    r6.L$0 = r10
                    r6.label = r8
                    java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r11, r10, r6, r9, r10)
                    if (r0 != r7) goto L7b
                    return r7
                L7b:
                    androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                    if (r0 != 0) goto L91
                    kotlinx.coroutines.CoroutineScope r11 = r6.$$this$coroutineScope
                    r12 = 0
                    r13 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r14 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r6.$pressScope
                    r14.<init>(r0, r10)
                    r15 = 3
                    r16 = 0
                    kotlinx.coroutines.BuildersKt.launch$default(r11, r12, r13, r14, r15, r16)
                    goto Lbb
                L91:
                    r0.consume()
                    kotlinx.coroutines.CoroutineScope r1 = r6.$$this$coroutineScope
                    r18 = 0
                    r19 = 0
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                    androidx.compose.foundation.gestures.PressGestureScopeImpl r3 = r6.$pressScope
                    r2.<init>(r3, r10)
                    r21 = 3
                    r22 = 0
                    r17 = r1
                    r20 = r2
                    kotlinx.coroutines.BuildersKt.launch$default(r17, r18, r19, r20, r21, r22)
                    kj.l<androidx.compose.ui.geometry.Offset, kotlin.j> r1 = r6.$onTap
                    if (r1 == 0) goto Lbb
                    long r2 = r0.getPosition()
                    androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m2574boximpl(r2)
                    r1.invoke(r0)
                Lbb:
                    kotlin.j r0 = kotlin.j.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C01912.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01912(PointerInputScope pointerInputScope, q<? super PressGestureScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, l<? super Offset, j> lVar, PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super C01912> cVar) {
            super(2, cVar);
            this.$this_detectTapAndPress = pointerInputScope;
            this.$onPress = qVar;
            this.$onTap = lVar;
            this.$pressScope = pressGestureScopeImpl;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01912 c01912 = new C01912(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, cVar);
            c01912.L$0 = obj;
            return c01912;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.$onPress, this.$onTap, this.$pressScope, null);
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

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_spinnerDropDownItemStyle}, m = "invokeSuspend")
    public static final class C01922 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ l<Offset, j> $onDoubleTap;
        final /* synthetic */ l<Offset, j> $onLongPress;
        final /* synthetic */ q<PressGestureScope, Offset, dj.c<? super j>, Object> $onPress;
        final /* synthetic */ l<Offset, j> $onTap;
        final /* synthetic */ PointerInputScope $this_detectTapGestures;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100, R.styleable.AppCompatTheme_tooltipForegroundColor, 129, 141, 156, 178}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ l<Offset, j> $onDoubleTap;
            final /* synthetic */ l<Offset, j> $onLongPress;
            final /* synthetic */ q<PressGestureScope, Offset, dj.c<? super j>, Object> $onPress;
            final /* synthetic */ l<Offset, j> $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_textAppearanceListItem}, m = "invokeSuspend")
            public static final class C00311 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00311(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super C00311> cVar) {
                    super(2, cVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new C00311(this.$pressScope, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        this.label = 1;
                        if (pressGestureScopeImpl.reset(this) == coroutineSingletons) {
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

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass10 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass10(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass10> cVar) {
                    super(2, cVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass10(this.$pressScope, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                    this.$pressScope.release();
                    return j.a;
                }

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_textAppearancePopupMenuHeader}, m = "invokeSuspend")
            public static final class C00322 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PointerInputChange $down;
                final /* synthetic */ q<PressGestureScope, Offset, dj.c<? super j>, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00322(q<? super PressGestureScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, dj.c<? super C00322> cVar) {
                    super(2, cVar);
                    this.$onPress = qVar;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$down = pointerInputChange;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new C00322(this.$onPress, this.$pressScope, this.$down, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        q<PressGestureScope, Offset, dj.c<? super j>, Object> qVar = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM2574boximpl = Offset.m2574boximpl(this.$down.getPosition());
                        this.label = 1;
                        if (qVar.invoke(pressGestureScopeImpl, offsetM2574boximpl, this) == coroutineSingletons) {
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

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
            public static final class AnonymousClass3 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super PointerInputChange>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                public AnonymousClass3(dj.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(cVar);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
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
                        this.label = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
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

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass4 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass4> cVar) {
                    super(2, cVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass4(this.$pressScope, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                    this.$pressScope.cancel();
                    return j.a;
                }

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass5 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass5> cVar) {
                    super(2, cVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass5(this.$pressScope, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                    this.$pressScope.release();
                    return j.a;
                }

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            public static final class AnonymousClass6 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass6> cVar) {
                    super(2, cVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass6(this.$pressScope, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                    this.$pressScope.release();
                    return j.a;
                }

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {148}, m = "invokeSuspend")
            public static final class AnonymousClass7 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass7> cVar) {
                    super(2, cVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass7(this.$pressScope, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        this.label = 1;
                        if (pressGestureScopeImpl.reset(this) == coroutineSingletons) {
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

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {151}, m = "invokeSuspend")
            public static final class AnonymousClass8 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ q<PressGestureScope, Offset, dj.c<? super j>, Object> $onPress;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ PointerInputChange $secondDown;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass8(q<? super PressGestureScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, dj.c<? super AnonymousClass8> cVar) {
                    super(2, cVar);
                    this.$onPress = qVar;
                    this.$pressScope = pressGestureScopeImpl;
                    this.$secondDown = pointerInputChange;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    return new AnonymousClass8(this.$onPress, this.$pressScope, this.$secondDown, cVar);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        q<PressGestureScope, Offset, dj.c<? super j>, Object> qVar = this.$onPress;
                        PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                        Offset offsetM2574boximpl = Offset.m2574boximpl(this.$secondDown.getPosition());
                        this.label = 1;
                        if (qVar.invoke(pressGestureScopeImpl, offsetM2574boximpl, this) == coroutineSingletons) {
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

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9, reason: invalid class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", l = {157}, m = "invokeSuspend")
            public static final class AnonymousClass9 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ l<Offset, j> $onDoubleTap;
                final /* synthetic */ l<Offset, j> $onTap;
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                final /* synthetic */ Ref.ObjectRef<PointerInputChange> $upOrCancel;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: TapGestureDetector.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                public static final class C00331 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ PressGestureScopeImpl $pressScope;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00331(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super C00331> cVar) {
                        super(2, cVar);
                        this.$pressScope = pressGestureScopeImpl;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new C00331(this.$pressScope, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        li.c.O(obj);
                        this.$pressScope.release();
                        return j.a;
                    }

                    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                        return create(coroutineScope, cVar).invokeSuspend(j.a);
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: TapGestureDetector.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
                public static final class C00342 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ PressGestureScopeImpl $pressScope;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00342(PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super C00342> cVar) {
                        super(2, cVar);
                        this.$pressScope = pressGestureScopeImpl;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        return new C00342(this.$pressScope, cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        li.c.O(obj);
                        this.$pressScope.cancel();
                        return j.a;
                    }

                    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                        return create(coroutineScope, cVar).invokeSuspend(j.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass9(CoroutineScope coroutineScope, l<? super Offset, j> lVar, l<? super Offset, j> lVar2, Ref.ObjectRef<PointerInputChange> objectRef, PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass9> cVar) {
                    super(2, cVar);
                    this.$$this$coroutineScope = coroutineScope;
                    this.$onDoubleTap = lVar;
                    this.$onTap = lVar2;
                    this.$upOrCancel = objectRef;
                    this.$pressScope = pressGestureScopeImpl;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$$this$coroutineScope, this.$onDoubleTap, this.$onTap, this.$upOrCancel, this.$pressScope, cVar);
                    anonymousClass9.L$0 = obj;
                    return anonymousClass9;
                }

                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                    return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
                }

                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        li.c.O(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        this.label = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        li.c.O(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        pointerInputChange.consume();
                        BuildersKt.launch$default(this.$$this$coroutineScope, (dj.e) null, (CoroutineStart) null, new C00331(this.$pressScope, null), 3, (Object) null);
                        this.$onDoubleTap.invoke(Offset.m2574boximpl(pointerInputChange.getPosition()));
                        return j.a;
                    }
                    BuildersKt.launch$default(this.$$this$coroutineScope, (dj.e) null, (CoroutineStart) null, new C00342(this.$pressScope, null), 3, (Object) null);
                    l<Offset, j> lVar = this.$onTap;
                    if (lVar == null) {
                        return null;
                    }
                    lVar.invoke(Offset.m2574boximpl(((PointerInputChange) this.$upOrCancel.element).getPosition()));
                    return j.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(CoroutineScope coroutineScope, q<? super PressGestureScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, l<? super Offset, j> lVar, l<? super Offset, j> lVar2, l<? super Offset, j> lVar3, PressGestureScopeImpl pressGestureScopeImpl, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$$this$coroutineScope = coroutineScope;
                this.$onPress = qVar;
                this.$onLongPress = lVar;
                this.$onDoubleTap = lVar2;
                this.$onTap = lVar3;
                this.$pressScope = pressGestureScopeImpl;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00ef A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00f9 A[Catch: PointerEventTimeoutCancellationException -> 0x0120, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0120, blocks: (B:34:0x00f3, B:36:0x00f9, B:37:0x010a), top: B:89:0x00f3 }] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x010a A[Catch: PointerEventTimeoutCancellationException -> 0x0120, TRY_LEAVE, TryCatch #2 {PointerEventTimeoutCancellationException -> 0x0120, blocks: (B:34:0x00f3, B:36:0x00f9, B:37:0x010a), top: B:89:0x00f3 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0145 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x018e  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01a3  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x01f4  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0207  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0221 A[RETURN] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                /*
                    Method dump skipped, instruction units count: 584
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.C01922.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C01922(PointerInputScope pointerInputScope, q<? super PressGestureScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, l<? super Offset, j> lVar, l<? super Offset, j> lVar2, l<? super Offset, j> lVar3, dj.c<? super C01922> cVar) {
            super(2, cVar);
            this.$this_detectTapGestures = pointerInputScope;
            this.$onPress = qVar;
            this.$onLongPress = lVar;
            this.$onDoubleTap = lVar2;
            this.$onTap = lVar3;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C01922 c01922 = new C01922(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, cVar);
            c01922.L$0 = obj;
            return c01922;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
                PointerInputScope pointerInputScope = this.$this_detectTapGestures;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null);
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

        public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
            return create(coroutineScope, cVar).invokeSuspend(j.a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", l = {305, 320}, m = "waitForUpOrCancellation")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C01932 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01932(dj.c<? super C01932> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:18:0x004f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, boolean r10, androidx.compose.ui.input.pointer.PointerEventPass r11, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            boolean r9 = r0.Z$0
            java.lang.Object r10 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r10 = (androidx.compose.ui.input.pointer.PointerEventPass) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
            li.c.O(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4f
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            li.c.O(r12)
        L40:
            r0.L$0 = r9
            r0.L$1 = r11
            r0.Z$0 = r10
            r0.label = r3
            java.lang.Object r12 = r9.awaitPointerEvent(r11, r0)
            if (r12 != r1) goto L4f
            return r1
        L4f:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
            java.util.List r2 = r12.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5b:
            if (r6 >= r4) goto L75
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r10 == 0) goto L6a
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r7)
            goto L6e
        L6a:
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r7)
        L6e:
            if (r7 != 0) goto L72
            r2 = r5
            goto L76
        L72:
            int r6 = r6 + 1
            goto L5b
        L75:
            r2 = r3
        L76:
            if (r2 == 0) goto L40
            java.util.List r9 = r12.getChanges()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, dj.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, dj.c<? super PointerInputChange> cVar) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new C01902(pointerInputChange, null), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[LOOP:0: B:19:0x004e->B:20:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[EDGE_INSN: B:31:0x0078->B:27:0x0078 BREAK  A[LOOP:1: B:22:0x0065->B:26:0x0075], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, dj.c<? super kotlin.j> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            li.c.O(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            li.c.O(r9)
        L36:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.a.t(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            return r1
        L42:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4e:
            if (r6 >= r4) goto L5c
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L4e
        L5c:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
            r4 = r5
        L65:
            if (r4 >= r2) goto L78
            java.lang.Object r6 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.getPressed()
            if (r6 == 0) goto L75
            r5 = r3
            goto L78
        L75:
            int r4 = r4 + 1
            goto L65
        L78:
            if (r5 != 0) goto L36
            kotlin.j r8 = kotlin.j.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, dj.c):java.lang.Object");
    }

    public static final Object detectTapAndPress(PointerInputScope pointerInputScope, q<? super PressGestureScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, l<? super Offset, j> lVar, dj.c<? super j> cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C01912(pointerInputScope, qVar, lVar, new PressGestureScopeImpl(pointerInputScope), null), cVar);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : j.a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, q qVar, l lVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            qVar = NoPressGesture;
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        return detectTapAndPress(pointerInputScope, qVar, lVar, cVar);
    }

    public static final Object detectTapGestures(PointerInputScope pointerInputScope, l<? super Offset, j> lVar, l<? super Offset, j> lVar2, q<? super PressGestureScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, l<? super Offset, j> lVar3, dj.c<? super j> cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C01922(pointerInputScope, qVar, lVar2, lVar, lVar3, null), cVar);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : j.a;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, l lVar, l lVar2, q qVar, l lVar3, dj.c cVar, int i2, Object obj) {
        l lVar4 = (i2 & 1) != 0 ? null : lVar;
        l lVar5 = (i2 & 2) != 0 ? null : lVar2;
        if ((i2 & 4) != 0) {
            qVar = NoPressGesture;
        }
        return detectTapGestures(pointerInputScope, lVar4, lVar5, qVar, (i2 & 8) != 0 ? null : lVar3, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00dc -> B:13:0x0035). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.ui.input.pointer.PointerEventPass r19, dj.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, dj.c):java.lang.Object");
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, cVar);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z, PointerEventPass pointerEventPass, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z, pointerEventPass, cVar);
    }

    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z, dj.c cVar) {
        return awaitFirstDown(awaitPointerEventScope, z, PointerEventPass.Main, cVar);
    }
}
