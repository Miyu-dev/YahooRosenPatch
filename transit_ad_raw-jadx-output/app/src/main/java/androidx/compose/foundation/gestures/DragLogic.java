package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kj.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.j;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B{\u0012(\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012(\u0010\u0015\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR?\u0010\u0010\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R?\u0010\u0015\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/foundation/gestures/DragLogic;", "", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "event", "Lkotlin/j;", "processDragStart", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "processDragStop", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Ldj/c;)Ljava/lang/Object;", "processDragCancel", "(Lkotlinx/coroutines/CoroutineScope;Ldj/c;)Ljava/lang/Object;", "Lkotlin/Function3;", "Landroidx/compose/ui/geometry/Offset;", "Ldj/c;", "onDragStarted", "Lkj/q;", "getOnDragStarted", "()Lkj/q;", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped", "getOnDragStopped", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "dragStartInteraction", "Landroidx/compose/runtime/MutableState;", "getDragStartInteraction", "()Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<init>", "(Lkj/q;Lkj/q;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class DragLogic {
    private final MutableState<DragInteraction.Start> dragStartInteraction;
    private final MutableInteractionSource interactionSource;
    private final q<CoroutineScope, Offset, dj.c<? super j>, Object> onDragStarted;
    private final q<CoroutineScope, Velocity, dj.c<? super j>, Object> onDragStopped;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragLogic$processDragCancel$1, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, TypedValues.CycleType.TYPE_WAVE_PHASE}, m = "processDragCancel")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragLogic.this.processDragCancel(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragLogic$processDragStart$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Draggable.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {404, 407, 409}, m = "processDragStart")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C01781 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C01781(dj.c<? super C01781> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragLogic.this.processDragStart(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragLogic$processDragStop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Draggable.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {414, 417}, m = "processDragStop")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C01791 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C01791(dj.c<? super C01791> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragLogic.this.processDragStop(null, null, this);
        }
    }

    public DragLogic(q<? super CoroutineScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, q<? super CoroutineScope, ? super Velocity, ? super dj.c<? super j>, ? extends Object> qVar2, MutableState<DragInteraction.Start> mutableState, MutableInteractionSource mutableInteractionSource) {
        m.h(qVar, "onDragStarted");
        m.h(qVar2, "onDragStopped");
        m.h(mutableState, "dragStartInteraction");
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.dragStartInteraction = mutableState;
        this.interactionSource = mutableInteractionSource;
    }

    public final MutableState<DragInteraction.Start> getDragStartInteraction() {
        return this.dragStartInteraction;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final q<CoroutineScope, Offset, dj.c<? super j>, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    public final q<CoroutineScope, Velocity, dj.c<? super j>, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragCancel(kotlinx.coroutines.CoroutineScope r9, dj.c<? super kotlin.j> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.DragLogic.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragLogic.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            li.c.O(r10)
            goto L83
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            li.c.O(r10)
            goto L63
        L3f:
            li.c.O(r10)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r10 = r8.dragStartInteraction
            java.lang.Object r10 = r10.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = (androidx.compose.foundation.interaction.DragInteraction.Start) r10
            if (r10 == 0) goto L69
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L62
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L62
            return r1
        L62:
            r2 = r8
        L63:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r10 = r2.dragStartInteraction
            r10.setValue(r5)
            goto L6a
        L69:
            r2 = r8
        L6a:
            kj.q<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.unit.Velocity, dj.c<? super kotlin.j>, java.lang.Object> r10 = r2.onDragStopped
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.INSTANCE
            long r6 = r2.m5503getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r2 = androidx.compose.ui.unit.Velocity.m5483boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r10.invoke(r9, r2, r0)
            if (r9 != r1) goto L83
            return r1
        L83:
            kotlin.j r9 = kotlin.j.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragCancel(kotlinx.coroutines.CoroutineScope, dj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStart(kotlinx.coroutines.CoroutineScope r9, androidx.compose.foundation.gestures.DragEvent.DragStarted r10, dj.c<? super kotlin.j> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic.C01781
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragLogic.C01781) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5d
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            li.c.O(r11)
            goto Lc4
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r9 = r0.L$3
            androidx.compose.foundation.interaction.DragInteraction$Start r9 = (androidx.compose.foundation.interaction.DragInteraction.Start) r9
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStarted r10 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r10
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r4 = (androidx.compose.foundation.gestures.DragLogic) r4
            li.c.O(r11)
            goto La0
        L4a:
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r9
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            li.c.O(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L83
        L5d:
            li.c.O(r11)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r11 = r8.dragStartInteraction
            java.lang.Object r11 = r11.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = (androidx.compose.foundation.interaction.DragInteraction.Start) r11
            if (r11 == 0) goto L82
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L82
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r11 = r2.emit(r6, r0)
            if (r11 != r1) goto L82
            return r1
        L82:
            r2 = r8
        L83:
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r11.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r2.interactionSource
            if (r5 == 0) goto La3
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.label = r4
            java.lang.Object r4 = r5.emit(r11, r0)
            if (r4 != r1) goto L9d
            return r1
        L9d:
            r4 = r2
            r2 = r9
            r9 = r11
        La0:
            r11 = r9
            r9 = r2
            r2 = r4
        La3:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r4 = r2.dragStartInteraction
            r4.setValue(r11)
            kj.q<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.geometry.Offset, dj.c<? super kotlin.j>, java.lang.Object> r11 = r2.onDragStarted
            long r4 = r10.getStartPoint()
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m2574boximpl(r4)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto Lc4
            return r1
        Lc4:
            kotlin.j r9 = kotlin.j.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStart(kotlinx.coroutines.CoroutineScope, androidx.compose.foundation.gestures.DragEvent$DragStarted, dj.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStop(kotlinx.coroutines.CoroutineScope r10, androidx.compose.foundation.gestures.DragEvent.DragStopped r11, dj.c<? super kotlin.j> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragLogic.C01791
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragLogic.C01791) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            li.c.O(r12)
            goto L8c
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStopped r10 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r10
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.DragLogic r2 = (androidx.compose.foundation.gestures.DragLogic) r2
            li.c.O(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L6c
        L46:
            li.c.O(r12)
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r12 = r9.dragStartInteraction
            java.lang.Object r12 = r12.getValue()
            androidx.compose.foundation.interaction.DragInteraction$Start r12 = (androidx.compose.foundation.interaction.DragInteraction.Start) r12
            if (r12 == 0) goto L72
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r9.interactionSource
            if (r2 == 0) goto L6b
            androidx.compose.foundation.interaction.DragInteraction$Stop r6 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r6.<init>(r12)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r12 = r2.emit(r6, r0)
            if (r12 != r1) goto L6b
            return r1
        L6b:
            r2 = r9
        L6c:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.DragInteraction$Start> r12 = r2.dragStartInteraction
            r12.setValue(r5)
            goto L73
        L72:
            r2 = r9
        L73:
            kj.q<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.unit.Velocity, dj.c<? super kotlin.j>, java.lang.Object> r12 = r2.onDragStopped
            long r6 = r11.getVelocity()
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.m5483boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r10 = r12.invoke(r10, r11, r0)
            if (r10 != r1) goto L8c
            return r1
        L8c:
            kotlin.j r10 = kotlin.j.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.processDragStop(kotlinx.coroutines.CoroutineScope, androidx.compose.foundation.gestures.DragEvent$DragStopped, dj.c):java.lang.Object");
    }
}
