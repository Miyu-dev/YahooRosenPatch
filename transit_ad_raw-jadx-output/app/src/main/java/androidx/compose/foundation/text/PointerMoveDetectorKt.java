package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import dj.e;
import ej.c;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: PointerMoveDetector.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pointerEventPass", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/j;", "onMove", "detectMoves", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkj/l;Ldj/c;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class PointerMoveDetectorKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2, reason: invalid class name */
    /* JADX INFO: compiled from: PointerMoveDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @c(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", l = {R.styleable.AppCompatTheme_buttonBarButtonStyle}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ l<Offset, j> $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        final /* synthetic */ PointerInputScope $this_detectMoves;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: PointerMoveDetector.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @c(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", l = {R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
            final /* synthetic */ e $currentContext;
            final /* synthetic */ l<Offset, j> $onMove;
            final /* synthetic */ PointerEventPass $pointerEventPass;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(e eVar, PointerEventPass pointerEventPass, l<? super Offset, j> lVar, dj.c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.$currentContext = eVar;
                this.$pointerEventPass = pointerEventPass;
                this.$onMove = lVar;
            }

            public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, cVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0046 -> B:15:0x004c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r9.label
                    r2 = 1
                    if (r1 == 0) goto L21
                    if (r1 != r2) goto L19
                    java.lang.Object r1 = r9.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    java.lang.Object r3 = r9.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                    li.c.O(r10)
                    r4 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r9
                    goto L4c
                L19:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L21:
                    li.c.O(r10)
                    java.lang.Object r10 = r9.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    r3 = r10
                    r10 = r9
                L2f:
                    dj.e r4 = r10.$currentContext
                    boolean r4 = kotlinx.coroutines.JobKt.isActive(r4)
                    if (r4 == 0) goto Lb1
                    androidx.compose.ui.input.pointer.PointerEventPass r4 = r10.$pointerEventPass
                    r10.L$0 = r3
                    r10.L$1 = r1
                    r10.label = r2
                    java.lang.Object r4 = r3.awaitPointerEvent(r4, r10)
                    if (r4 != r0) goto L46
                    return r0
                L46:
                    r8 = r0
                    r0 = r10
                    r10 = r4
                    r4 = r3
                    r3 = r1
                    r1 = r8
                L4c:
                    androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
                    int r5 = r10.getType()
                    androidx.compose.ui.input.pointer.PointerEventType$Companion r6 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                    int r7 = r6.m4087getMove7fucELk()
                    boolean r7 = androidx.compose.ui.input.pointer.PointerEventType.m4081equalsimpl0(r5, r7)
                    if (r7 == 0) goto L60
                    r7 = r2
                    goto L68
                L60:
                    int r7 = r6.m4085getEnter7fucELk()
                    boolean r7 = androidx.compose.ui.input.pointer.PointerEventType.m4081equalsimpl0(r5, r7)
                L68:
                    if (r7 == 0) goto L6c
                    r5 = r2
                    goto L74
                L6c:
                    int r6 = r6.m4086getExit7fucELk()
                    boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m4081equalsimpl0(r5, r6)
                L74:
                    if (r5 == 0) goto Lab
                    java.util.List r10 = r10.getChanges()
                    java.lang.Object r10 = kotlin.collections.y.r1(r10)
                    androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
                    long r5 = r10.getPosition()
                    androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2574boximpl(r5)
                    long r5 = r10.getPackedValue()
                    java.lang.Object r7 = r3.element
                    boolean r5 = androidx.compose.ui.geometry.Offset.m2581equalsimpl(r5, r7)
                    if (r5 != 0) goto L95
                    goto L96
                L95:
                    r10 = 0
                L96:
                    if (r10 == 0) goto Lab
                    kj.l<androidx.compose.ui.geometry.Offset, kotlin.j> r5 = r0.$onMove
                    long r6 = r10.getPackedValue()
                    androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2574boximpl(r6)
                    r3.element = r10
                    androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2574boximpl(r6)
                    r5.invoke(r10)
                Lab:
                    r10 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L2f
                Lb1:
                    kotlin.j r10 = kotlin.j.a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, l<? super Offset, j> lVar, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_detectMoves = pointerInputScope;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = lVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return new AnonymousClass2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                e context = getContext();
                PointerInputScope pointerInputScope = this.$this_detectMoves;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
                this.label = 1;
                if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == coroutineSingletons) {
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

    public static final Object detectMoves(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, l<? super Offset, j> lVar, dj.c<? super j> cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(pointerInputScope, pointerEventPass, lVar, null), cVar);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : j.a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, l lVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, lVar, cVar);
    }
}
