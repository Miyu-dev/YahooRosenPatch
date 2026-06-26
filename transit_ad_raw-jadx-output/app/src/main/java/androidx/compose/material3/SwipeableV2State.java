package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.collections.a0;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\b\u0001\u0018\u0000 v*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001vB^\u0012\u0006\u0010s\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030*\u0012\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070#\u0012\u001a\b\u0002\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000303\u0012\b\b\u0002\u00109\u001a\u000208ø\u0001\u0000¢\u0006\u0004\bt\u0010uJ\u0006\u0010\u0004\u001a\u00020\u0003J#\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\rJ'\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010 \u001a\u00020\u001fH\u0002J;\u0010&\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020!2\u001c\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020#H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R,\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R#\u00109\u001a\u0002088\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR+\u0010\u001c\u001a\u00028\u00002\u0006\u0010E\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010)R\u001b\u0010\u000e\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010IR/\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\u0010E\u001a\u0004\u0018\u00010\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010G\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001b\u0010U\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bT\u0010<R+\u0010Z\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010G\u001a\u0004\bW\u0010<\"\u0004\bX\u0010YR\u001b\u0010]\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b[\u0010L\u001a\u0004\b\\\u0010<R\u001b\u0010`\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b^\u0010L\u001a\u0004\b_\u0010<R/\u0010d\u001a\u0004\u0018\u00018\u00002\b\u0010E\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010G\u001a\u0004\bb\u0010I\"\u0004\bc\u0010)RC\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010G\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010k\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0011\u0010q\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bq\u0010r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006w"}, d2 = {"Landroidx/compose/material3/SwipeableV2State;", "T", "", "", "requireOffset", "", "newAnchors", "", "updateAnchors$material3_release", "(Ljava/util/Map;)Z", "updateAnchors", "value", "hasAnchorForValue", "(Ljava/lang/Object;)Z", "targetValue", "Lkotlin/j;", "snapTo", "(Ljava/lang/Object;Ldj/c;)Ljava/lang/Object;", "velocity", "animateTo", "(Ljava/lang/Object;FLdj/c;)Ljava/lang/Object;", "settle", "(FLdj/c;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "trySnapTo$material3_release", "trySnapTo", TypedValues.CycleType.S_WAVE_OFFSET, "currentValue", "computeTarget", "(FLjava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/ui/unit/Density;", "requireDensity", "Landroidx/compose/foundation/MutatePriority;", "swipePriority", "Lkotlin/Function1;", "Ldj/c;", "action", "swipe", "(Landroidx/compose/foundation/MutatePriority;Lkj/l;Ldj/c;)Ljava/lang/Object;", "snap", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material3_release", "()Landroidx/compose/animation/core/AnimationSpec;", "confirmValueChange", "Lkj/l;", "getConfirmValueChange$material3_release", "()Lkj/l;", "Lkotlin/Function2;", "positionalThreshold", "Lkj/p;", "getPositionalThreshold$material3_release", "()Lkj/p;", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "F", "getVelocityThreshold-D9Ej5fM$material3_release", "()F", "Landroidx/compose/material3/InternalMutatorMutex;", "swipeMutex", "Landroidx/compose/material3/InternalMutatorMutex;", "Landroidx/compose/foundation/gestures/DraggableState;", "swipeDraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getSwipeDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "targetValue$delegate", "Landroidx/compose/runtime/State;", "getTargetValue", "offset$delegate", "getOffset", "()Ljava/lang/Float;", "setOffset", "(Ljava/lang/Float;)V", "progress$delegate", "getProgress", "progress", "lastVelocity$delegate", "getLastVelocity", "setLastVelocity", "(F)V", "lastVelocity", "minOffset$delegate", "getMinOffset", "minOffset", "maxOffset$delegate", "getMaxOffset", "maxOffset", "animationTarget$delegate", "getAnimationTarget", "setAnimationTarget", "animationTarget", "anchors$delegate", "getAnchors$material3_release", "()Ljava/util/Map;", "setAnchors$material3_release", "(Ljava/util/Map;)V", "anchors", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$material3_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$material3_release", "(Landroidx/compose/ui/unit/Density;)V", "isAnimationRunning", "()Z", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkj/l;Lkj/p;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
public final class SwipeableV2State<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: anchors$delegate, reason: from kotlin metadata */
    private final MutableState anchors;
    private final AnimationSpec<Float> animationSpec;

    /* JADX INFO: renamed from: animationTarget$delegate, reason: from kotlin metadata */
    private final MutableState animationTarget;
    private final l<T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final MutableState currentValue;
    private Density density;

    /* JADX INFO: renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    private final MutableState lastVelocity;

    /* JADX INFO: renamed from: maxOffset$delegate, reason: from kotlin metadata */
    private final State maxOffset;

    /* JADX INFO: renamed from: minOffset$delegate, reason: from kotlin metadata */
    private final State minOffset;

    /* JADX INFO: renamed from: offset$delegate, reason: from kotlin metadata */
    private final MutableState offset;
    private final p<Density, Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: progress$delegate, reason: from kotlin metadata */
    private final State progress;
    private final DraggableState swipeDraggableState;
    private final InternalMutatorMutex swipeMutex;

    /* JADX INFO: renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final State targetValue;
    private final float velocityThreshold;

    /* JADX INFO: compiled from: SwipeableV2.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014Ju\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/SwipeableV2State$Companion;", "", "T", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "positionalThreshold", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SwipeableV2State;", "Saver-eqLRuRQ", "(Landroidx/compose/animation/core/AnimationSpec;Lkj/l;Lkj/p;F)Landroidx/compose/runtime/saveable/Saver;", "Saver", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalMaterial3Api
        /* JADX INFO: renamed from: Saver-eqLRuRQ, reason: not valid java name */
        public final <T> Saver<SwipeableV2State<T>, T> m1620SavereqLRuRQ(final AnimationSpec<Float> animationSpec, final l<? super T, Boolean> confirmValueChange, final p<? super Density, ? super Float, Float> positionalThreshold, final float velocityThreshold) {
            m.h(animationSpec, "animationSpec");
            m.h(confirmValueChange, "confirmValueChange");
            m.h(positionalThreshold, "positionalThreshold");
            return SaverKt.Saver(new p<SaverScope, SwipeableV2State<T>, T>() { // from class: androidx.compose.material3.SwipeableV2State$Companion$Saver$1
                public final T invoke(SaverScope saverScope, SwipeableV2State<T> swipeableV2State) {
                    m.h(saverScope, "$this$Saver");
                    m.h(swipeableV2State, "it");
                    return swipeableV2State.getCurrentValue();
                }
            }, new l<T, SwipeableV2State<T>>() { // from class: androidx.compose.material3.SwipeableV2State$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final SwipeableV2State<T> m1621invoke(T t) {
                    m.h(t, "it");
                    return new SwipeableV2State<>(t, animationSpec, confirmValueChange, positionalThreshold, velocityThreshold, null);
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeableV2State$animateTo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SwipeableV2.kt */
    @ej.c(c = "androidx.compose.material3.SwipeableV2State", f = "SwipeableV2.kt", l = {350}, m = "animateTo")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class C03901 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03901(SwipeableV2State<T> swipeableV2State, dj.c<? super C03901> cVar) {
            super(cVar);
            this.this$0 = swipeableV2State;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.animateTo(null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeableV2State$animateTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: SwipeableV2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.SwipeableV2State$animateTo$2", f = "SwipeableV2.kt", l = {353}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements l<dj.c<? super j>, Object> {
        final /* synthetic */ Float $targetOffset;
        final /* synthetic */ T $targetValue;
        final /* synthetic */ float $velocity;
        int label;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SwipeableV2State<T> swipeableV2State, T t, Float f, float f2, dj.c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.this$0 = swipeableV2State;
            this.$targetValue = t;
            this.$targetOffset = f;
            this.$velocity = f2;
        }

        public final dj.c<j> create(dj.c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$targetValue, this.$targetOffset, this.$velocity, cVar);
        }

        public final Object invoke(dj.c<? super j> cVar) {
            return create(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                this.this$0.setAnimationTarget(this.$targetValue);
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                Float offset = this.this$0.getOffset();
                float fFloatValue = offset != null ? offset.floatValue() : 0.0f;
                floatRef.element = fFloatValue;
                float fFloatValue2 = this.$targetOffset.floatValue();
                float f = this.$velocity;
                AnimationSpec<Float> animationSpec$material3_release = this.this$0.getAnimationSpec$material3_release();
                final SwipeableV2State<T> swipeableV2State = this.this$0;
                p<Float, Float, j> pVar = new p<Float, Float, j>() { // from class: androidx.compose.material3.SwipeableV2State.animateTo.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                        return j.a;
                    }

                    public final void invoke(float f2, float f3) {
                        swipeableV2State.setOffset(Float.valueOf(f2));
                        floatRef.element = f2;
                        swipeableV2State.setLastVelocity(f3);
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animate(fFloatValue, fFloatValue2, f, animationSpec$material3_release, pVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                li.c.O(obj);
            }
            this.this$0.setLastVelocity(0.0f);
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeableV2State$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SwipeableV2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.SwipeableV2State$snapTo$2", f = "SwipeableV2.kt", l = {}, m = "invokeSuspend")
    public static final class C03912 extends SuspendLambda implements l<dj.c<? super j>, Object> {
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03912(SwipeableV2State<T> swipeableV2State, T t, dj.c<? super C03912> cVar) {
            super(1, cVar);
            this.this$0 = swipeableV2State;
            this.$targetValue = t;
        }

        public final dj.c<j> create(dj.c<?> cVar) {
            return new C03912(this.this$0, this.$targetValue, cVar);
        }

        public final Object invoke(dj.c<? super j> cVar) {
            return create(cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            this.this$0.snap(this.$targetValue);
            return j.a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeableV2State$swipe$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SwipeableV2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.SwipeableV2State$swipe$2", f = "SwipeableV2.kt", l = {462}, m = "invokeSuspend")
    public static final class C03922 extends SuspendLambda implements p<CoroutineScope, dj.c<? super j>, Object> {
        final /* synthetic */ l<dj.c<? super j>, Object> $action;
        final /* synthetic */ MutatePriority $swipePriority;
        int label;
        final /* synthetic */ SwipeableV2State<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03922(SwipeableV2State<T> swipeableV2State, MutatePriority mutatePriority, l<? super dj.c<? super j>, ? extends Object> lVar, dj.c<? super C03922> cVar) {
            super(2, cVar);
            this.this$0 = swipeableV2State;
            this.$swipePriority = mutatePriority;
            this.$action = lVar;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            return new C03922(this.this$0, this.$swipePriority, this.$action, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                li.c.O(obj);
                InternalMutatorMutex internalMutatorMutex = ((SwipeableV2State) this.this$0).swipeMutex;
                MutatePriority mutatePriority = this.$swipePriority;
                l<dj.c<? super j>, Object> lVar = this.$action;
                this.label = 1;
                if (internalMutatorMutex.mutate(mutatePriority, lVar, this) == coroutineSingletons) {
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

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec, l lVar, p pVar, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, animationSpec, lVar, pVar, f);
    }

    public static /* synthetic */ Object animateTo$default(SwipeableV2State swipeableV2State, Object obj, float f, dj.c cVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            f = swipeableV2State.getLastVelocity();
        }
        return swipeableV2State.animateTo(obj, f, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float offset, T currentValue, float velocity) {
        Object objClosestAnchor;
        Map<T, Float> anchors$material3_release = getAnchors$material3_release();
        Float f = anchors$material3_release.get(currentValue);
        Density densityRequireDensity = requireDensity();
        float fMo348toPx0680j_4 = densityRequireDensity.mo348toPx0680j_4(this.velocityThreshold);
        if (m.b(f, offset) || f == null) {
            return currentValue;
        }
        if (f.floatValue() < offset) {
            if (velocity >= fMo348toPx0680j_4) {
                return (T) SwipeableV2Kt.closestAnchor(anchors$material3_release, offset, true);
            }
            objClosestAnchor = SwipeableV2Kt.closestAnchor(anchors$material3_release, offset, true);
            if (offset < Math.abs(f.floatValue() + Math.abs(((Number) this.positionalThreshold.invoke(densityRequireDensity, Float.valueOf(Math.abs(((Number) i0.L(objClosestAnchor, anchors$material3_release)).floatValue() - f.floatValue())))).floatValue()))) {
                return currentValue;
            }
        } else {
            if (velocity <= (-fMo348toPx0680j_4)) {
                return (T) SwipeableV2Kt.closestAnchor(anchors$material3_release, offset, false);
            }
            objClosestAnchor = SwipeableV2Kt.closestAnchor(anchors$material3_release, offset, false);
            float fAbs = Math.abs(f.floatValue() - Math.abs(((Number) this.positionalThreshold.invoke(densityRequireDensity, Float.valueOf(Math.abs(f.floatValue() - ((Number) i0.L(objClosestAnchor, anchors$material3_release)).floatValue())))).floatValue()));
            if (offset < 0.0f) {
                if (Math.abs(offset) < fAbs) {
                    return currentValue;
                }
            } else if (offset > fAbs) {
                return currentValue;
            }
        }
        return (T) objClosestAnchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getAnimationTarget() {
        return this.animationTarget.getValue();
    }

    private final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationTarget(T t) {
        this.animationTarget.setValue(t);
    }

    private final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(Float f) {
        this.offset.setValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void snap(T targetValue) {
        Float f = getAnchors$material3_release().get(targetValue);
        if (f == null) {
            setCurrentValue(targetValue);
            return;
        }
        float fFloatValue = f.floatValue();
        Float offset = getOffset();
        dispatchRawDelta(fFloatValue - (offset != null ? offset.floatValue() : 0.0f));
        setCurrentValue(targetValue);
        setAnimationTarget(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object swipe(MutatePriority mutatePriority, l<? super dj.c<? super j>, ? extends Object> lVar, dj.c<? super j> cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new C03922(this, mutatePriority, lVar, null), cVar);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : j.a;
    }

    public static /* synthetic */ Object swipe$default(SwipeableV2State swipeableV2State, MutatePriority mutatePriority, l lVar, dj.c cVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return swipeableV2State.swipe(mutatePriority, lVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateTo(T r16, float r17, dj.c<? super kotlin.j> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableV2State.animateTo(java.lang.Object, float, dj.c):java.lang.Object");
    }

    public final float dispatchRawDelta(float delta) {
        Float offset = getOffset();
        float fFloatValue = offset != null ? offset.floatValue() : 0.0f;
        float fH = a.l.h(delta + fFloatValue, getMinOffset(), getMaxOffset()) - fFloatValue;
        if (Math.abs(fH) >= 0.0f) {
            Float offset2 = getOffset();
            setOffset(Float.valueOf(a.l.h((offset2 != null ? offset2.floatValue() : 0.0f) + fH, getMinOffset(), getMaxOffset())));
        }
        return fH;
    }

    public final Map<T, Float> getAnchors$material3_release() {
        return (Map) this.anchors.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec$material3_release() {
        return this.animationSpec;
    }

    public final l<T, Boolean> getConfirmValueChange$material3_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: renamed from: getDensity$material3_release, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final float getLastVelocity() {
        return ((Number) this.lastVelocity.getValue()).floatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.maxOffset.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.minOffset.getValue()).floatValue();
    }

    public final Float getOffset() {
        return (Float) this.offset.getValue();
    }

    public final p<Density, Float, Float> getPositionalThreshold$material3_release() {
        return this.positionalThreshold;
    }

    public final float getProgress() {
        return ((Number) this.progress.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: getSwipeDraggableState$material3_release, reason: from getter */
    public final DraggableState getSwipeDraggableState() {
        return this.swipeDraggableState;
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM$material3_release, reason: not valid java name and from getter */
    public final float getVelocityThreshold() {
        return this.velocityThreshold;
    }

    public final boolean hasAnchorForValue(T value) {
        return getAnchors$material3_release().containsKey(value);
    }

    public final boolean isAnimationRunning() {
        return getAnimationTarget() != null;
    }

    public final float requireOffset() {
        Float offset = getOffset();
        if (offset != null) {
            return offset.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void setAnchors$material3_release(Map<T, Float> map) {
        m.h(map, "<set-?>");
        this.anchors.setValue(map);
    }

    public final void setDensity$material3_release(Density density) {
        this.density = density;
    }

    public final Object settle(float f, dj.c<? super j> cVar) throws Throwable {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f);
        if (((Boolean) this.confirmValueChange.invoke(tComputeTarget)).booleanValue()) {
            Object objAnimateTo = animateTo(tComputeTarget, f, cVar);
            return objAnimateTo == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo : j.a;
        }
        Object objAnimateTo2 = animateTo(currentValue, f, cVar);
        return objAnimateTo2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo2 : j.a;
    }

    public final Object snapTo(T t, dj.c<? super j> cVar) {
        Object objSwipe$default = swipe$default(this, null, new C03912(this, t, null), cVar, 1, null);
        return objSwipe$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objSwipe$default : j.a;
    }

    public final boolean trySnapTo$material3_release(final T targetValue) {
        return this.swipeMutex.tryMutate(new kj.a<j>(this) { // from class: androidx.compose.material3.SwipeableV2State$trySnapTo$1
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m1625invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1625invoke() {
                this.this$0.snap(targetValue);
            }
        });
    }

    public final boolean updateAnchors$material3_release(Map<T, Float> newAnchors) {
        boolean z;
        m.h(newAnchors, "newAnchors");
        boolean zIsEmpty = getAnchors$material3_release().isEmpty();
        setAnchors$material3_release(newAnchors);
        if (zIsEmpty) {
            T currentValue = getCurrentValue();
            z = getAnchors$material3_release().get(currentValue) != null;
            if (z) {
                trySnapTo$material3_release(currentValue);
            }
        } else {
            z = true;
        }
        return (z && zIsEmpty) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SwipeableV2State(T t, AnimationSpec<Float> animationSpec, l<? super T, Boolean> lVar, p<? super Density, ? super Float, Float> pVar, float f) {
        m.h(animationSpec, "animationSpec");
        m.h(lVar, "confirmValueChange");
        m.h(pVar, "positionalThreshold");
        this.animationSpec = animationSpec;
        this.confirmValueChange = lVar;
        this.positionalThreshold = pVar;
        this.velocityThreshold = f;
        this.swipeMutex = new InternalMutatorMutex();
        this.swipeDraggableState = new SwipeableV2State$swipeDraggableState$1(this);
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue = SnapshotStateKt.derivedStateOf(new kj.a<T>(this) { // from class: androidx.compose.material3.SwipeableV2State$targetValue$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            public final T invoke() {
                T t2 = (T) this.this$0.getAnimationTarget();
                if (t2 != null) {
                    return t2;
                }
                SwipeableV2State<T> swipeableV2State = this.this$0;
                Float offset = swipeableV2State.getOffset();
                return offset != null ? (T) swipeableV2State.computeTarget(offset.floatValue(), swipeableV2State.getCurrentValue(), 0.0f) : swipeableV2State.getCurrentValue();
            }
        });
        this.offset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.progress = SnapshotStateKt.derivedStateOf(new kj.a<Float>(this) { // from class: androidx.compose.material3.SwipeableV2State$progress$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Float m1624invoke() {
                /*
                    r6 = this;
                    androidx.compose.material3.SwipeableV2State<T> r0 = r6.this$0
                    java.util.Map r0 = r0.getAnchors$material3_release()
                    androidx.compose.material3.SwipeableV2State<T> r1 = r6.this$0
                    java.lang.Object r1 = r1.getCurrentValue()
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Float r0 = (java.lang.Float) r0
                    r1 = 0
                    if (r0 == 0) goto L1a
                    float r0 = r0.floatValue()
                    goto L1b
                L1a:
                    r0 = r1
                L1b:
                    androidx.compose.material3.SwipeableV2State<T> r2 = r6.this$0
                    java.util.Map r2 = r2.getAnchors$material3_release()
                    androidx.compose.material3.SwipeableV2State<T> r3 = r6.this$0
                    java.lang.Object r3 = r3.getTargetValue()
                    java.lang.Object r2 = r2.get(r3)
                    java.lang.Float r2 = (java.lang.Float) r2
                    if (r2 == 0) goto L34
                    float r2 = r2.floatValue()
                    goto L35
                L34:
                    r2 = r1
                L35:
                    float r2 = r2 - r0
                    float r3 = java.lang.Math.abs(r2)
                    r4 = 897988541(0x358637bd, float:1.0E-6)
                    int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                    r5 = 1065353216(0x3f800000, float:1.0)
                    if (r3 <= 0) goto L5a
                    androidx.compose.material3.SwipeableV2State<T> r3 = r6.this$0
                    float r3 = r3.requireOffset()
                    float r3 = r3 - r0
                    float r3 = r3 / r2
                    int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L50
                    goto L5b
                L50:
                    r0 = 1065353199(0x3f7fffef, float:0.999999)
                    int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L58
                    goto L5a
                L58:
                    r1 = r3
                    goto L5b
                L5a:
                    r1 = r5
                L5b:
                    java.lang.Float r0 = java.lang.Float.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableV2State$progress$2.m1624invoke():java.lang.Float");
            }
        });
        this.lastVelocity = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.minOffset = SnapshotStateKt.derivedStateOf(new kj.a<Float>(this) { // from class: androidx.compose.material3.SwipeableV2State$minOffset$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Float m1623invoke() {
                Float fMinOrNull = SwipeableV2Kt.minOrNull(this.this$0.getAnchors$material3_release());
                return Float.valueOf(fMinOrNull != null ? fMinOrNull.floatValue() : Float.NEGATIVE_INFINITY);
            }
        });
        this.maxOffset = SnapshotStateKt.derivedStateOf(new kj.a<Float>(this) { // from class: androidx.compose.material3.SwipeableV2State$maxOffset$2
            final /* synthetic */ SwipeableV2State<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Float m1622invoke() {
                Float fMaxOrNull = SwipeableV2Kt.maxOrNull(this.this$0.getAnchors$material3_release());
                return Float.valueOf(fMaxOrNull != null ? fMaxOrNull.floatValue() : Float.POSITIVE_INFINITY);
            }
        });
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(a0.a, null, 2, null);
    }

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec, l lVar, p pVar, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? SwipeableV2Defaults.INSTANCE.getAnimationSpec() : animationSpec, (i2 & 4) != 0 ? new l<T, Boolean>() { // from class: androidx.compose.material3.SwipeableV2State.1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m1619invoke(T t) {
                return Boolean.TRUE;
            }
        } : lVar, (i2 & 8) != 0 ? SwipeableV2Defaults.INSTANCE.getPositionalThreshold() : pVar, (i2 & 16) != 0 ? SwipeableV2Defaults.INSTANCE.m1613getVelocityThresholdD9Ej5fM() : f, null);
    }
}
