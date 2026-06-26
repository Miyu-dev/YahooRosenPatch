package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
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
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a©\u0001\u0010\u0019\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2*\b\u0002\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112*\b\u0002\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112\b\b\u0002\u0010\u0018\u001a\u00020\fø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aÃ\u0001\u0010\u0019\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2*\b\u0002\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112*\b\u0002\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00112\b\b\u0002\u0010\u0018\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001f\u001af\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0013\u0018\u00010$*\u00020 2\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u00000!2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001d0!2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aS\u0010.\u001a\u00020\f*\u00020 2\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aA\u00104\u001a\u00020\f*\u00020 2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00100\u001a\u00020/2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u0000H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a!\u00107\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a!\u00107\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00106\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lkotlin/Function1;", "", "Lkotlin/j;", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "rememberDraggableState", "(Lkj/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Ldj/c;", "", "onDragStarted", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkj/q;Lkj/q;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/Velocity;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Lkj/l;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkj/a;Lkj/q;Lkj/q;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "velocityTracker", "Lkotlin/Pair;", "awaitDownAndSlop", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Ldj/c;)Ljava/lang/Object;", "startEvent", "initialDelta", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Ldj/c;)Ljava/lang/Object;", "awaitDrag", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/Orientation;JLkj/l;Ldj/c;)Ljava/lang/Object;", "onDragOrUp", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class DraggableKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {TypedValues.AttributesType.TYPE_PATH_ROTATE, 325, 478, 528}, m = "awaitDownAndSlop")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(dj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DraggableKt.awaitDownAndSlop(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class C01801 extends SuspendLambda implements q<CoroutineScope, Offset, dj.c<? super j>, Object> {
        int label;

        public C01801(dj.c<? super C01801> cVar) {
            super(3, cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m324invoked4ec7I((CoroutineScope) obj, ((Offset) obj2).getPackedValue(), (dj.c) obj3);
        }

        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m324invoked4ec7I(CoroutineScope coroutineScope, long j, dj.c<? super j> cVar) {
            return new C01801(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$2, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "it", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements q<CoroutineScope, Float, dj.c<? super j>, Object> {
        int label;

        public AnonymousClass2(dj.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((CoroutineScope) obj, ((Number) obj2).floatValue(), (dj.c<? super j>) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            return j.a;
        }

        public final Object invoke(CoroutineScope coroutineScope, float f, dj.c<? super j> cVar) {
            return new AnonymousClass2(cVar).invokeSuspend(j.a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$5, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", l = {193}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends SuspendLambda implements q<CoroutineScope, Velocity, dj.c<? super j>, Object> {
        final /* synthetic */ q<CoroutineScope, Float, dj.c<? super j>, Object> $onDragStopped;
        final /* synthetic */ Orientation $orientation;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(q<? super CoroutineScope, ? super Float, ? super dj.c<? super j>, ? extends Object> qVar, Orientation orientation, dj.c<? super AnonymousClass5> cVar) {
            super(3, cVar);
            this.$onDragStopped = qVar;
            this.$orientation = orientation;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m326invokeLuvzFrg((CoroutineScope) obj, ((Velocity) obj2).getPackedValue(), (dj.c) obj3);
        }

        /* JADX INFO: renamed from: invoke-LuvzFrg, reason: not valid java name */
        public final Object m326invokeLuvzFrg(CoroutineScope coroutineScope, long j, dj.c<? super j> cVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$onDragStopped, this.$orientation, cVar);
            anonymousClass5.L$0 = coroutineScope;
            anonymousClass5.J$0 = j;
            return anonymousClass5.invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                long j = this.J$0;
                q<CoroutineScope, Float, dj.c<? super j>, Object> qVar = this.$onDragStopped;
                Float f = new Float(DraggableKt.m322toFloatsFctU(j, this.$orientation));
                this.label = 1;
                if (qVar.invoke(coroutineScope, f, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$6, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$6", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends SuspendLambda implements q<CoroutineScope, Offset, dj.c<? super j>, Object> {
        int label;

        public AnonymousClass6(dj.c<? super AnonymousClass6> cVar) {
            super(3, cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m327invoked4ec7I((CoroutineScope) obj, ((Offset) obj2).getPackedValue(), (dj.c) obj3);
        }

        /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m327invoked4ec7I(CoroutineScope coroutineScope, long j, dj.c<? super j> cVar) {
            return new AnonymousClass6(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$7, reason: invalid class name */
    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/unit/Velocity;", "it", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends SuspendLambda implements q<CoroutineScope, Velocity, dj.c<? super j>, Object> {
        int label;

        public AnonymousClass7(dj.c<? super AnonymousClass7> cVar) {
            super(3, cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m328invokeLuvzFrg((CoroutineScope) obj, ((Velocity) obj2).getPackedValue(), (dj.c) obj3);
        }

        /* JADX INFO: renamed from: invoke-LuvzFrg, reason: not valid java name */
        public final Object m328invokeLuvzFrg(CoroutineScope coroutineScope, long j, dj.c<? super j> cVar) {
            return new AnonymousClass7(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            return j.a;
        }
    }

    public static final DraggableState DraggableState(l<? super Float, j> lVar) {
        m.h(lVar, "onDelta");
        return new DefaultDraggableState(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ed A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0233 -> B:81:0x02a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0299 -> B:77:0x029e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x02ef -> B:81:0x02a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, androidx.compose.runtime.State<? extends kj.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r21, androidx.compose.runtime.State<? extends kj.a<java.lang.Boolean>> r22, androidx.compose.ui.input.pointer.util.VelocityTracker r23, androidx.compose.foundation.gestures.Orientation r24, dj.c<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset>> r25) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, dj.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: awaitDrag-Su4bsnU, reason: not valid java name */
    public static final Object m319awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j, final VelocityTracker velocityTracker, final SendChannel<? super DragEvent> sendChannel, final boolean z, Orientation orientation, dj.c<? super Boolean> cVar) {
        sendChannel.trySend-JP2dKIU(new DragEvent.DragStarted(Offset.m2589minusMKHz9U(pointerInputChange.getPosition(), OffsetKt.Offset(Offset.m2585getXimpl(j) * Math.signum(Offset.m2585getXimpl(pointerInputChange.getPosition())), Offset.m2586getYimpl(j) * Math.signum(Offset.m2586getYimpl(pointerInputChange.getPosition())))), null));
        sendChannel.trySend-JP2dKIU(new DragEvent.DragDelta(z ? Offset.m2592timestuRUvjQ(j, -1.0f) : j, null));
        return m320onDragOrUpAxegvzg(awaitPointerEventScope, orientation, pointerInputChange.getId(), new l<PointerInputChange, j>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PointerInputChange) obj);
                return j.a;
            }

            public final void invoke(PointerInputChange pointerInputChange2) {
                m.h(pointerInputChange2, "event");
                VelocityTrackerKt.addPointerInputChange(velocityTracker, pointerInputChange2);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    return;
                }
                long jPositionChange = PointerEventKt.positionChange(pointerInputChange2);
                pointerInputChange2.consume();
                SendChannel<DragEvent> sendChannel2 = sendChannel;
                if (z) {
                    jPositionChange = Offset.m2592timestuRUvjQ(jPositionChange, -1.0f);
                }
                sendChannel2.trySend-JP2dKIU(new DragEvent.DragDelta(jPositionChange, null));
            }
        }, cVar);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, final boolean z2, q<? super CoroutineScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, q<? super CoroutineScope, ? super Float, ? super dj.c<? super j>, ? extends Object> qVar2, boolean z3) {
        m.h(modifier, "<this>");
        m.h(draggableState, "state");
        m.h(orientation, "orientation");
        m.h(qVar, "onDragStarted");
        m.h(qVar2, "onDragStopped");
        return draggable(modifier, draggableState, new l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.3
            public final Boolean invoke(PointerInputChange pointerInputChange) {
                m.h(pointerInputChange, "it");
                return Boolean.TRUE;
            }
        }, orientation, z, mutableInteractionSource, new kj.a<Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m325invoke() {
                return Boolean.valueOf(z2);
            }
        }, qVar, new AnonymousClass5(qVar2, orientation, null), z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0111, code lost:
    
        if ((!(((java.lang.Number) r9.invoke(r14)).floatValue() == 0.0f)) != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:50:0x00fd, B:39:0x00d2], limit reached: 73 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0093 -> B:27:0x0098). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: onDragOrUp-Axegvzg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m320onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, androidx.compose.foundation.gestures.Orientation r18, long r19, kj.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.j> r21, dj.c<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m320onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.Orientation, long, kj.l, dj.c):java.lang.Object");
    }

    @Composable
    public static final DraggableState rememberDraggableState(l<? super Float, j> lVar, Composer composer, int i2) {
        m.h(lVar, "onDelta");
        composer.startReplaceableGroup(-183245213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i2, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:138)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = DraggableState(new l<Float, j>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).floatValue());
                    return j.a;
                }

                public final void invoke(float f) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m321toFloat3MmeM6k(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m2586getYimpl(j) : Offset.m2585getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m322toFloatsFctU(long j, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m5493getYimpl(j) : Velocity.m5492getXimpl(j);
    }

    public static final Modifier draggable(Modifier modifier, final DraggableState draggableState, final l<? super PointerInputChange, Boolean> lVar, final Orientation orientation, final boolean z, final MutableInteractionSource mutableInteractionSource, final kj.a<Boolean> aVar, final q<? super CoroutineScope, ? super Offset, ? super dj.c<? super j>, ? extends Object> qVar, final q<? super CoroutineScope, ? super Velocity, ? super dj.c<? super j>, ? extends Object> qVar2, final boolean z2) {
        m.h(modifier, "<this>");
        m.h(draggableState, "state");
        m.h(lVar, "canDrag");
        m.h(orientation, "orientation");
        m.h(aVar, "startDragImmediately");
        m.h(qVar, "onDragStarted");
        m.h(qVar2, "onDragStopped");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, j>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                a.b.d(inspectorInfo, "$this$null", "draggable").set("canDrag", lVar);
                inspectorInfo.getProperties().set("orientation", orientation);
                androidx.compose.animation.b.c(z2, androidx.compose.animation.b.c(z, inspectorInfo.getProperties(), "enabled", inspectorInfo), "reverseDirection", inspectorInfo).set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("startDragImmediately", aVar);
                inspectorInfo.getProperties().set("onDragStarted", qVar);
                inspectorInfo.getProperties().set("onDragStopped", qVar2);
                inspectorInfo.getProperties().set("state", draggableState);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return j.a;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.gestures.DraggableKt.draggable.9

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2, reason: invalid class name */
            /* JADX INFO: compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", f = "Draggable.kt", l = {239, 241, 243, 251, 253, Optimizer.OPTIMIZATION_STANDARD}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                final /* synthetic */ Channel<DragEvent> $channel;
                final /* synthetic */ State<DragLogic> $dragLogic$delegate;
                final /* synthetic */ Orientation $orientation;
                final /* synthetic */ DraggableState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", f = "Draggable.kt", l = {246}, m = "invokeSuspend")
                public static final class C00262 extends SuspendLambda implements p<DragScope, dj.c<? super j>, Object> {
                    final /* synthetic */ Channel<DragEvent> $channel;
                    final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
                    final /* synthetic */ Orientation $orientation;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00262(Ref.ObjectRef<DragEvent> objectRef, Channel<DragEvent> channel, Orientation orientation, dj.c<? super C00262> cVar) {
                        super(2, cVar);
                        this.$event = objectRef;
                        this.$channel = channel;
                        this.$orientation = orientation;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        C00262 c00262 = new C00262(this.$event, this.$channel, this.$orientation, cVar);
                        c00262.L$0 = obj;
                        return c00262;
                    }

                    public final Object invoke(DragScope dragScope, dj.c<? super j> cVar) {
                        return create(dragScope, cVar).invokeSuspend(j.a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005e -> B:23:0x0064). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        /*
                            r8 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r8.label
                            r2 = 1
                            if (r1 == 0) goto L21
                            if (r1 != r2) goto L19
                            java.lang.Object r1 = r8.L$1
                            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                            java.lang.Object r3 = r8.L$0
                            androidx.compose.foundation.gestures.DragScope r3 = (androidx.compose.foundation.gestures.DragScope) r3
                            li.c.O(r9)
                            r4 = r3
                            r3 = r1
                            r1 = r0
                            r0 = r8
                            goto L64
                        L19:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L21:
                            li.c.O(r9)
                            java.lang.Object r9 = r8.L$0
                            androidx.compose.foundation.gestures.DragScope r9 = (androidx.compose.foundation.gestures.DragScope) r9
                            r3 = r9
                            r9 = r8
                        L2a:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r9.$event
                            java.lang.Object r1 = r1.element
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                            if (r4 != 0) goto L6a
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                            if (r4 != 0) goto L6a
                            boolean r4 = r1 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                            if (r4 == 0) goto L3d
                            androidx.compose.foundation.gestures.DragEvent$DragDelta r1 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r1
                            goto L3e
                        L3d:
                            r1 = 0
                        L3e:
                            if (r1 == 0) goto L4d
                            androidx.compose.foundation.gestures.Orientation r4 = r9.$orientation
                            long r5 = r1.getDelta()
                            float r1 = androidx.compose.foundation.gestures.DraggableKt.m317access$toFloat3MmeM6k(r5, r4)
                            r3.dragBy(r1)
                        L4d:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r9.$event
                            kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.DragEvent> r4 = r9.$channel
                            r9.L$0 = r3
                            r9.L$1 = r1
                            r9.label = r2
                            java.lang.Object r4 = r4.receive(r9)
                            if (r4 != r0) goto L5e
                            return r0
                        L5e:
                            r7 = r0
                            r0 = r9
                            r9 = r4
                            r4 = r3
                            r3 = r1
                            r1 = r7
                        L64:
                            r3.element = r9
                            r9 = r0
                            r0 = r1
                            r3 = r4
                            goto L2a
                        L6a:
                            kotlin.j r9 = kotlin.j.a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass2.C00262.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Channel<DragEvent> channel, DraggableState draggableState, State<DragLogic> state, Orientation orientation, dj.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.$channel = channel;
                    this.$state = draggableState;
                    this.$dragLogic$delegate = state;
                    this.$orientation = orientation;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$channel, this.$state, this.$dragLogic$delegate, this.$orientation, cVar);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00db A[Catch: CancellationException -> 0x010d, TryCatch #1 {CancellationException -> 0x010d, blocks: (B:38:0x00cf, B:40:0x00db, B:45:0x00f7, B:47:0x00fb), top: B:63:0x00cf }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00f7 A[Catch: CancellationException -> 0x010d, TryCatch #1 {CancellationException -> 0x010d, blocks: (B:38:0x00cf, B:40:0x00db, B:45:0x00f7, B:47:0x00fb), top: B:63:0x00cf }] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0124 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
                /* JADX WARN: Type inference failed for: r11v14 */
                /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
                /* JADX WARN: Type inference failed for: r11v2, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r11v25 */
                /* JADX WARN: Type inference failed for: r11v26 */
                /* JADX WARN: Type inference failed for: r11v27 */
                /* JADX WARN: Type inference failed for: r11v29 */
                /* JADX WARN: Type inference failed for: r11v4 */
                /* JADX WARN: Type inference failed for: r11v6 */
                /* JADX WARN: Type inference failed for: r11v7 */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v12 */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v2 */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
                /* JADX WARN: Type inference failed for: r1v31 */
                /* JADX WARN: Type inference failed for: r1v34 */
                /* JADX WARN: Type inference failed for: r1v41 */
                /* JADX WARN: Type inference failed for: r1v42 */
                /* JADX WARN: Type inference failed for: r1v43 */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r3v18 */
                /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
                /* JADX WARN: Type inference failed for: r3v5 */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v12 */
                /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.foundation.gestures.DragLogic] */
                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
                /* JADX WARN: Type inference failed for: r4v7 */
                /* JADX WARN: Type inference failed for: r9v2 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0109 -> B:22:0x0066). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0125 -> B:22:0x0066). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0129 -> B:22:0x0066). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        Method dump skipped, instruction units count: 322
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                    return create(coroutineScope, cVar).invokeSuspend(j.a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3, reason: invalid class name */
            /* JADX INFO: compiled from: Draggable.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
            @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", l = {263}, m = "invokeSuspend")
            public static final class AnonymousClass3 extends SuspendLambda implements p<PointerInputScope, dj.c<? super j>, Object> {
                final /* synthetic */ State<l<PointerInputChange, Boolean>> $canDragState;
                final /* synthetic */ Channel<DragEvent> $channel;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ Orientation $orientation;
                final /* synthetic */ boolean $reverseDirection;
                final /* synthetic */ State<kj.a<Boolean>> $startImmediatelyState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1, reason: invalid class name */
                /* JADX INFO: compiled from: Draggable.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", f = "Draggable.kt", l = {265}, m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
                    final /* synthetic */ PointerInputScope $$this$pointerInput;
                    final /* synthetic */ State<l<PointerInputChange, Boolean>> $canDragState;
                    final /* synthetic */ Channel<DragEvent> $channel;
                    final /* synthetic */ Orientation $orientation;
                    final /* synthetic */ boolean $reverseDirection;
                    final /* synthetic */ State<kj.a<Boolean>> $startImmediatelyState;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1, reason: invalid class name and collision with other inner class name */
                    /* JADX INFO: compiled from: Draggable.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
                    @ej.c(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", f = "Draggable.kt", l = {268, 276}, m = "invokeSuspend")
                    public static final class C00271 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, dj.c<? super j>, Object> {
                        final /* synthetic */ CoroutineScope $$this$coroutineScope;
                        final /* synthetic */ State<l<PointerInputChange, Boolean>> $canDragState;
                        final /* synthetic */ Channel<DragEvent> $channel;
                        final /* synthetic */ Orientation $orientation;
                        final /* synthetic */ boolean $reverseDirection;
                        final /* synthetic */ State<kj.a<Boolean>> $startImmediatelyState;
                        int I$0;
                        private /* synthetic */ Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        boolean Z$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00271(CoroutineScope coroutineScope, State<? extends l<? super PointerInputChange, Boolean>> state, State<? extends kj.a<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z, dj.c<? super C00271> cVar) {
                            super(2, cVar);
                            this.$$this$coroutineScope = coroutineScope;
                            this.$canDragState = state;
                            this.$startImmediatelyState = state2;
                            this.$orientation = orientation;
                            this.$channel = channel;
                            this.$reverseDirection = z;
                        }

                        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                            C00271 c00271 = new C00271(this.$$this$coroutineScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, cVar);
                            c00271.L$0 = obj;
                            return c00271;
                        }

                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, dj.c<? super j> cVar) {
                            return create(awaitPointerEventScope, cVar).invokeSuspend(j.a);
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(9:25|(1:83)|26|(1:28)(1:29)|30|31|81|32|(1:34)(8:35|85|36|(0)(0)|44|62|17|(2:75|76)(0))) */
                        /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
                        
                            r0 = th;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
                        
                            r0 = e;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:55:0x011e, code lost:
                        
                            r10 = r20;
                            r12 = r22;
                            r13 = r23;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
                        
                            r14 = r2;
                            r2 = r3;
                            r11 = r19;
                            r10 = r20;
                            r12 = r22;
                            r13 = r23;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
                        /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
                        /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x014c A[Catch: all -> 0x014d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x014d, blocks: (B:59:0x013b, B:63:0x014c), top: B:77:0x013b }] */
                        /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
                        /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
                        /* JADX WARN: Removed duplicated region for block: B:74:0x016b  */
                        /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d8 -> B:85:0x00e5). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0141 -> B:62:0x0146). Please report as a decompilation issue!!! */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x016b -> B:17:0x005c). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 375
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass3.AnonymousClass1.C00271.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(PointerInputScope pointerInputScope, State<? extends l<? super PointerInputChange, Boolean>> state, State<? extends kj.a<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z, dj.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$$this$pointerInput = pointerInputScope;
                        this.$canDragState = state;
                        this.$startImmediatelyState = state2;
                        this.$orientation = orientation;
                        this.$channel = channel;
                        this.$reverseDirection = z;
                    }

                    public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, cVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                        /*
                            r13 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r13.label
                            r2 = 1
                            if (r1 == 0) goto L1b
                            if (r1 != r2) goto L13
                            java.lang.Object r0 = r13.L$0
                            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                            li.c.O(r14)     // Catch: java.util.concurrent.CancellationException -> L11
                            goto L4b
                        L11:
                            r14 = move-exception
                            goto L45
                        L13:
                            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r14.<init>(r0)
                            throw r14
                        L1b:
                            li.c.O(r14)
                            java.lang.Object r14 = r13.L$0
                            kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
                            androidx.compose.ui.input.pointer.PointerInputScope r1 = r13.$$this$pointerInput     // Catch: java.util.concurrent.CancellationException -> L41
                            androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1 r11 = new androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1     // Catch: java.util.concurrent.CancellationException -> L41
                            androidx.compose.runtime.State<kj.l<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>> r5 = r13.$canDragState     // Catch: java.util.concurrent.CancellationException -> L41
                            androidx.compose.runtime.State<kj.a<java.lang.Boolean>> r6 = r13.$startImmediatelyState     // Catch: java.util.concurrent.CancellationException -> L41
                            androidx.compose.foundation.gestures.Orientation r7 = r13.$orientation     // Catch: java.util.concurrent.CancellationException -> L41
                            kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.DragEvent> r8 = r13.$channel     // Catch: java.util.concurrent.CancellationException -> L41
                            boolean r9 = r13.$reverseDirection     // Catch: java.util.concurrent.CancellationException -> L41
                            r10 = 0
                            r3 = r11
                            r4 = r14
                            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L41
                            r13.L$0 = r14     // Catch: java.util.concurrent.CancellationException -> L41
                            r13.label = r2     // Catch: java.util.concurrent.CancellationException -> L41
                            java.lang.Object r14 = r1.awaitPointerEventScope(r11, r13)     // Catch: java.util.concurrent.CancellationException -> L41
                            if (r14 != r0) goto L4b
                            return r0
                        L41:
                            r0 = move-exception
                            r12 = r0
                            r0 = r14
                            r14 = r12
                        L45:
                            boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
                            if (r0 == 0) goto L4e
                        L4b:
                            kotlin.j r14 = kotlin.j.a
                            return r14
                        L4e:
                            throw r14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.AnonymousClass9.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    public final Object invoke(CoroutineScope coroutineScope, dj.c<? super j> cVar) {
                        return create(coroutineScope, cVar).invokeSuspend(j.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(boolean z, State<? extends l<? super PointerInputChange, Boolean>> state, State<? extends kj.a<Boolean>> state2, Orientation orientation, Channel<DragEvent> channel, boolean z2, dj.c<? super AnonymousClass3> cVar) {
                    super(2, cVar);
                    this.$enabled = z;
                    this.$canDragState = state;
                    this.$startImmediatelyState = state2;
                    this.$orientation = orientation;
                    this.$channel = channel;
                    this.$reverseDirection = z2;
                }

                public final dj.c<j> create(Object obj, dj.c<?> cVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$enabled, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, cVar);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
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
                        if (!this.$enabled) {
                            return j.a;
                        }
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.$canDragState, this.$startImmediatelyState, this.$orientation, this.$channel, this.$reverseDirection, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutineSingletons) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DragLogic invoke$lambda$3(State<DragLogic> state) {
                return state.getValue();
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                if (androidx.compose.animation.b.n(modifier2, "$this$composed", composer, 597193710)) {
                    ComposerKt.traceEventStart(597193710, i2, -1, "androidx.compose.foundation.gestures.draggable.<anonymous> (Draggable.kt:220)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final MutableState mutableState = (MutableState) objRememberedValue;
                final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(mutableState) | composer.changed(mutableInteractionSource2);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                            m.h(disposableEffectScope, "$this$DisposableEffect");
                            final MutableState<DragInteraction.Start> mutableState2 = mutableState;
                            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$9$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    DragInteraction.Start start = (DragInteraction.Start) mutableState2.getValue();
                                    if (start != null) {
                                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                                        if (mutableInteractionSource4 != null) {
                                            mutableInteractionSource4.tryEmit(new DragInteraction.Cancel(start));
                                        }
                                        mutableState2.setValue(null);
                                    }
                                }
                            };
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                EffectsKt.DisposableEffect(mutableInteractionSource2, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = ChannelKt.Channel$default(Integer.MAX_VALUE, (BufferOverflow) null, (l) null, 6, (Object) null);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                Channel channel = (Channel) objRememberedValue3;
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composer, 0);
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(lVar, composer, 0);
                State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(new DragLogic(qVar, qVar2, mutableState, mutableInteractionSource), composer, 8);
                DraggableState draggableState2 = draggableState;
                EffectsKt.LaunchedEffect(draggableState2, new AnonymousClass2(channel, draggableState2, stateRememberUpdatedState3, orientation, null), composer, 64);
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.INSTANCE, new Object[]{orientation, Boolean.valueOf(z), Boolean.valueOf(z2)}, (p<? super PointerInputScope, ? super dj.c<? super j>, ? extends Object>) new AnonymousClass3(z, stateRememberUpdatedState2, stateRememberUpdatedState, orientation, channel, z2, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierPointerInput;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }
        });
    }
}
