package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import java.util.Map;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a0;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0011\u0018\u0000 |*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001|B5\u0012\u0006\u0010y\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\bz\u0010{J#\u0010\t\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\r\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u00002\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010\u0019J)\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020)0(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R+\u00105\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u00107\u001a\u00020)2\u0006\u0010.\u001a\u00020)8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00100R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00100R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00100R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00100RC\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b@\u00100\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\bR&\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00030E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010H\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MRO\u0010W\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040Q2\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040Q8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bR\u00100\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010[\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bX\u00100\u001a\u0004\bY\u0010K\"\u0004\bZ\u0010MR/\u0010b\u001a\u0004\u0018\u00010\\2\b\u0010.\u001a\u0004\u0018\u00010\\8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b]\u00100\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010d\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00040h8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00040h8F¢\u0006\u0006\u001a\u0004\bl\u0010jR\u001a\u0010\u000e\u001a\u00028\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\bo\u0010p\u001a\u0004\bn\u00102R \u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000q8@X\u0081\u0004¢\u0006\f\u0012\u0004\bt\u0010p\u001a\u0004\br\u0010sR\u001a\u0010x\u001a\u00020\u00048@X\u0081\u0004¢\u0006\f\u0012\u0004\bw\u0010p\u001a\u0004\bv\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006}"}, d2 = {"Landroidx/compose/material3/SwipeableState;", "T", "", "", "", "newAnchors", "Lkotlin/j;", "ensureInit$material3_release", "(Ljava/util/Map;)V", "ensureInit", "oldAnchors", "processNewAnchors$material3_release", "(Ljava/util/Map;Ljava/util/Map;Ldj/c;)Ljava/lang/Object;", "processNewAnchors", "targetValue", "snapTo$material3_release", "(Ljava/lang/Object;Ldj/c;)Ljava/lang/Object;", "snapTo", "Landroidx/compose/animation/core/AnimationSpec;", "anim", "animateTo$material3_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ldj/c;)Ljava/lang/Object;", "animateTo", "velocity", "performFling$material3_release", "(FLdj/c;)Ljava/lang/Object;", "performFling", "delta", "performDrag$material3_release", "(F)F", "performDrag", TypedValues.AttributesType.S_TARGET, "snapInternalToOffset", "spec", "animateInternalToOffset", "(FLandroidx/compose/animation/core/AnimationSpec;Ldj/c;)Ljava/lang/Object;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material3_release", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/Function1;", "", "confirmStateChange", "Lkj/l;", "getConfirmStateChange$material3_release", "()Lkj/l;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "isAnimationRunning$delegate", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "Landroidx/compose/runtime/MutableState;", "offsetState", "overflowState", "absoluteOffset", "animationTarget", "anchors$delegate", "getAnchors$material3_release", "()Ljava/util/Map;", "setAnchors$material3_release", "anchors", "Lkotlinx/coroutines/flow/Flow;", "latestNonEmptyAnchorsFlow", "Lkotlinx/coroutines/flow/Flow;", "minBound", "F", "getMinBound$material3_release", "()F", "setMinBound$material3_release", "(F)V", "maxBound", "getMaxBound$material3_release", "setMaxBound$material3_release", "Lkotlin/Function2;", "thresholds$delegate", "getThresholds$material3_release", "()Lkj/p;", "setThresholds$material3_release", "(Lkj/p;)V", "thresholds", "velocityThreshold$delegate", "getVelocityThreshold$material3_release", "setVelocityThreshold$material3_release", "velocityThreshold", "Landroidx/compose/material3/ResistanceConfig;", "resistance$delegate", "getResistance$material3_release", "()Landroidx/compose/material3/ResistanceConfig;", "setResistance$material3_release", "(Landroidx/compose/material3/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material3_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", TypedValues.CycleType.S_WAVE_OFFSET, "getOverflow", "overflow", "getTargetValue$material3_release", "getTargetValue$material3_release$annotations", "()V", "Landroidx/compose/material3/SwipeProgress;", "getProgress$material3_release", "()Landroidx/compose/material3/SwipeProgress;", "getProgress$material3_release$annotations", "progress", "getDirection$material3_release", "getDirection$material3_release$annotations", "direction", "initialValue", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkj/l;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
public class SwipeableState<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final MutableState<Float> absoluteOffset;

    /* JADX INFO: renamed from: anchors$delegate, reason: from kotlin metadata */
    private final MutableState anchors;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState<Float> animationTarget;
    private final l<T, Boolean> confirmStateChange;

    /* JADX INFO: renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final MutableState currentValue;
    private final DraggableState draggableState;

    /* JADX INFO: renamed from: isAnimationRunning$delegate, reason: from kotlin metadata */
    private final MutableState isAnimationRunning;
    private final Flow<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final MutableState<Float> offsetState;
    private final MutableState<Float> overflowState;

    /* JADX INFO: renamed from: resistance$delegate, reason: from kotlin metadata */
    private final MutableState resistance;

    /* JADX INFO: renamed from: thresholds$delegate, reason: from kotlin metadata */
    private final MutableState thresholds;

    /* JADX INFO: renamed from: velocityThreshold$delegate, reason: from kotlin metadata */
    private final MutableState velocityThreshold;

    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/material3/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SwipeableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> Saver<SwipeableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final l<? super T, Boolean> lVar) {
            m.h(animationSpec, "animationSpec");
            m.h(lVar, "confirmStateChange");
            return SaverKt.Saver(new p<SaverScope, SwipeableState<T>, T>() { // from class: androidx.compose.material3.SwipeableState$Companion$Saver$1
                public final T invoke(SaverScope saverScope, SwipeableState<T> swipeableState) {
                    m.h(saverScope, "$this$Saver");
                    m.h(swipeableState, "it");
                    return swipeableState.getCurrentValue();
                }
            }, new l<T, SwipeableState<T>>() { // from class: androidx.compose.material3.SwipeableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final SwipeableState<T> m1610invoke(T t) {
                    m.h(t, "it");
                    return new SwipeableState<>(t, animationSpec, lVar);
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeableState$animateInternalToOffset$2, reason: invalid class name */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {223}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<DragScope, dj.c<? super j>, Object> {
        final /* synthetic */ AnimationSpec<Float> $spec;
        final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SwipeableState<T> swipeableState, float f, AnimationSpec<Float> animationSpec, dj.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = swipeableState;
            this.$target = f;
            this.$spec = animationSpec;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$target, this.$spec, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(DragScope dragScope, dj.c<? super j> cVar) {
            return create(dragScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    li.c.O(obj);
                    final DragScope dragScope = (DragScope) this.L$0;
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    floatRef.element = ((Number) ((SwipeableState) this.this$0).absoluteOffset.getValue()).floatValue();
                    ((SwipeableState) this.this$0).animationTarget.setValue(new Float(this.$target));
                    this.this$0.setAnimationRunning(true);
                    Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(floatRef.element, 0.0f, 2, null);
                    Float f = new Float(this.$target);
                    AnimationSpec<Float> animationSpec = this.$spec;
                    l<Animatable<Float, AnimationVector1D>, j> lVar = new l<Animatable<Float, AnimationVector1D>, j>() { // from class: androidx.compose.material3.SwipeableState.animateInternalToOffset.2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((Animatable<Float, AnimationVector1D>) obj2);
                            return j.a;
                        }

                        public final void invoke(Animatable<Float, AnimationVector1D> animatable) {
                            m.h(animatable, "$this$animateTo");
                            dragScope.dragBy(animatable.getValue().floatValue() - floatRef.element);
                            floatRef.element = animatable.getValue().floatValue();
                        }
                    };
                    this.label = 1;
                    if (Animatable.animateTo$default(animatableAnimatable$default, f, animationSpec, null, lVar, this, 4, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    li.c.O(obj);
                }
                ((SwipeableState) this.this$0).animationTarget.setValue(null);
                this.this$0.setAnimationRunning(false);
                return j.a;
            } catch (Throwable th) {
                ((SwipeableState) this.this$0).animationTarget.setValue(null);
                this.this$0.setAnimationRunning(false);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SwipeableState$snapInternalToOffset$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Swipeable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/j;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @ej.c(c = "androidx.compose.material3.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
    public static final class C03852 extends SuspendLambda implements p<DragScope, dj.c<? super j>, Object> {
        final /* synthetic */ float $target;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SwipeableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03852(float f, SwipeableState<T> swipeableState, dj.c<? super C03852> cVar) {
            super(2, cVar);
            this.$target = f;
            this.this$0 = swipeableState;
        }

        public final dj.c<j> create(Object obj, dj.c<?> cVar) {
            C03852 c03852 = new C03852(this.$target, this.this$0, cVar);
            c03852.L$0 = obj;
            return c03852;
        }

        public final Object invoke(DragScope dragScope, dj.c<? super j> cVar) {
            return create(dragScope, cVar).invokeSuspend(j.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            li.c.O(obj);
            ((DragScope) this.L$0).dragBy(this.$target - ((Number) ((SwipeableState) this.this$0).absoluteOffset.getValue()).floatValue());
            return j.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t, AnimationSpec<Float> animationSpec, l<? super T, Boolean> lVar) {
        m.h(animationSpec, "animationSpec");
        m.h(lVar, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = lVar;
        this.currentValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.isAnimationRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.offsetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.overflowState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.absoluteOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(a0.a, null, 2, null);
        final Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new kj.a<Map<Float, ? extends T>>(this) { // from class: androidx.compose.material3.SwipeableState$latestNonEmptyAnchorsFlow$1
            final /* synthetic */ SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            public final Map<Float, T> invoke() {
                return this.this$0.getAnchors$material3_release();
            }
        });
        this.latestNonEmptyAnchorsFlow = FlowKt.take(new Flow<Map<Float, ? extends T>>() { // from class: androidx.compose.material3.SwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/j;", "emit", "(Ljava/lang/Object;Ldj/c;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @ej.c(c = "androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(dj.c cVar) {
                        super(cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, dj.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material3.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material3.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material3.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        li.c.O(r6)
                        goto L47
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        li.c.O(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r2 = r2.isEmpty()
                        r2 = r2 ^ r3
                        if (r2 == 0) goto L47
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.j r5 = kotlin.j.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, dj.c):java.lang.Object");
                }
            }

            public Object collect(FlowCollector flowCollector, dj.c cVar) {
                Object objCollect = flowSnapshotFlow.collect(new AnonymousClass2(flowCollector), cVar);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : j.a;
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new p<Float, Float, Float>() { // from class: androidx.compose.material3.SwipeableState$thresholds$2
            public final Float invoke(float f, float f2) {
                return Float.valueOf(0.0f);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            }
        }, null, 2, null);
        this.velocityThreshold = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(fValueOf, null, 2, null);
        this.resistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = DraggableKt.DraggableState(new l<Float, j>(this) { // from class: androidx.compose.material3.SwipeableState$draggableState$1
            final /* synthetic */ SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).floatValue());
                return j.a;
            }

            public final void invoke(float f) {
                float fFloatValue = ((Number) ((SwipeableState) this.this$0).absoluteOffset.getValue()).floatValue() + f;
                float fH = a.l.h(fFloatValue, this.this$0.getMinBound(), this.this$0.getMaxBound());
                float f2 = fFloatValue - fH;
                ResistanceConfig resistance$material3_release = this.this$0.getResistance$material3_release();
                ((SwipeableState) this.this$0).offsetState.setValue(Float.valueOf(fH + (resistance$material3_release != null ? resistance$material3_release.computeResistance(f2) : 0.0f)));
                ((SwipeableState) this.this$0).overflowState.setValue(Float.valueOf(f2));
                ((SwipeableState) this.this$0).absoluteOffset.setValue(Float.valueOf(fFloatValue));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateInternalToOffset(float f, AnimationSpec<Float> animationSpec, dj.c<? super j> cVar) {
        Object objA = androidx.compose.foundation.gestures.a.a(this.draggableState, null, new AnonymousClass2(this, f, animationSpec, null), cVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : j.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateTo$material3_release$default(SwipeableState swipeableState, Object obj, AnimationSpec animationSpec, dj.c cVar, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i2 & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.animateTo$material3_release(obj, animationSpec, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapInternalToOffset(float f, dj.c<? super j> cVar) {
        Object objA = androidx.compose.foundation.gestures.a.a(this.draggableState, null, new C03852(f, this, null), cVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : j.a;
    }

    @ExperimentalMaterial3Api
    public final Object animateTo$material3_release(T t, AnimationSpec<Float> animationSpec, dj.c<? super j> cVar) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$2(t, this, animationSpec), cVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : j.a;
    }

    public final void ensureInit$material3_release(Map<Float, ? extends T> newAnchors) {
        m.h(newAnchors, "newAnchors");
        if (getAnchors$material3_release().isEmpty()) {
            Float offset = SwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.offsetState.setValue(offset);
            this.absoluteOffset.setValue(offset);
        }
    }

    public final Map<Float, T> getAnchors$material3_release() {
        return (Map) this.anchors.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec$material3_release() {
        return this.animationSpec;
    }

    public final l<T, Boolean> getConfirmStateChange$material3_release() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    public final float getDirection$material3_release() {
        Float offset = SwipeableKt.getOffset(getAnchors$material3_release(), getCurrentValue());
        if (offset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
    }

    /* JADX INFO: renamed from: getDraggableState$material3_release, reason: from getter */
    public final DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: renamed from: getMaxBound$material3_release, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    /* JADX INFO: renamed from: getMinBound$material3_release, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    public final State<Float> getOffset() {
        return this.offsetState;
    }

    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    public final SwipeProgress<T> getProgress$material3_release() {
        Object currentValue;
        Object objL;
        float fFloatValue;
        List listFindBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material3_release().keySet());
        int size = listFindBounds.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            objL = currentValue2;
            fFloatValue = 1.0f;
        } else if (size != 1) {
            Pair pair = getDirection$material3_release() > 0.0f ? new Pair(listFindBounds.get(0), listFindBounds.get(1)) : new Pair(listFindBounds.get(1), listFindBounds.get(0));
            float fFloatValue2 = ((Number) pair.component1()).floatValue();
            float fFloatValue3 = ((Number) pair.component2()).floatValue();
            objL = i0.L(Float.valueOf(fFloatValue2), getAnchors$material3_release());
            currentValue = i0.L(Float.valueOf(fFloatValue3), getAnchors$material3_release());
            fFloatValue = (getOffset().getValue().floatValue() - fFloatValue2) / (fFloatValue3 - fFloatValue2);
        } else {
            Object objL2 = i0.L(listFindBounds.get(0), getAnchors$material3_release());
            currentValue = i0.L(listFindBounds.get(0), getAnchors$material3_release());
            fFloatValue = 1.0f;
            objL = objL2;
        }
        return new SwipeProgress<>(objL, currentValue, fFloatValue);
    }

    public final ResistanceConfig getResistance$material3_release() {
        return (ResistanceConfig) this.resistance.getValue();
    }

    public final T getTargetValue$material3_release() {
        float fComputeTarget;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            fComputeTarget = value.floatValue();
        } else {
            float fFloatValue = getOffset().getValue().floatValue();
            Float offset = SwipeableKt.getOffset(getAnchors$material3_release(), getCurrentValue());
            fComputeTarget = SwipeableKt.computeTarget(fFloatValue, offset != null ? offset.floatValue() : getOffset().getValue().floatValue(), getAnchors$material3_release().keySet(), getThresholds$material3_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$material3_release().get(Float.valueOf(fComputeTarget));
        return t == null ? getCurrentValue() : t;
    }

    public final p<Float, Float, Float> getThresholds$material3_release() {
        return (p) this.thresholds.getValue();
    }

    public final float getVelocityThreshold$material3_release() {
        return ((Number) this.velocityThreshold.getValue()).floatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final float performDrag$material3_release(float delta) {
        float fH = a.l.h(this.absoluteOffset.getValue().floatValue() + delta, this.minBound, this.maxBound) - this.absoluteOffset.getValue().floatValue();
        if (Math.abs(fH) > 0.0f) {
            this.draggableState.dispatchRawDelta(fH);
        }
        return fH;
    }

    public final Object performFling$material3_release(final float f, dj.c<? super j> cVar) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new FlowCollector<Map<Float, ? extends T>>(this) { // from class: androidx.compose.material3.SwipeableState$performFling$2
            final /* synthetic */ SwipeableState<T> this$0;

            {
                this.this$0 = this;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, dj.c cVar2) {
                return emit((Map) obj, (dj.c<? super j>) cVar2);
            }

            public final Object emit(Map<Float, ? extends T> map, dj.c<? super j> cVar2) {
                Float offset = SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                m.e(offset);
                float fFloatValue = offset.floatValue();
                T t = map.get(new Float(SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), fFloatValue, map.keySet(), this.this$0.getThresholds$material3_release(), f, this.this$0.getVelocityThreshold$material3_release())));
                if (t != null && ((Boolean) this.this$0.getConfirmStateChange$material3_release().invoke(t)).booleanValue()) {
                    Object objAnimateTo$material3_release$default = SwipeableState.animateTo$material3_release$default(this.this$0, t, null, cVar2, 2, null);
                    return objAnimateTo$material3_release$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateTo$material3_release$default : j.a;
                }
                SwipeableState<T> swipeableState = this.this$0;
                Object objAnimateInternalToOffset = swipeableState.animateInternalToOffset(fFloatValue, swipeableState.getAnimationSpec$material3_release(), cVar2);
                return objAnimateInternalToOffset == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateInternalToOffset : j.a;
            }
        }, cVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : j.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processNewAnchors$material3_release(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, dj.c<? super kotlin.j> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState.processNewAnchors$material3_release(java.util.Map, java.util.Map, dj.c):java.lang.Object");
    }

    public final void setAnchors$material3_release(Map<Float, ? extends T> map) {
        m.h(map, "<set-?>");
        this.anchors.setValue(map);
    }

    public final void setMaxBound$material3_release(float f) {
        this.maxBound = f;
    }

    public final void setMinBound$material3_release(float f) {
        this.minBound = f;
    }

    public final void setResistance$material3_release(ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    public final void setThresholds$material3_release(p<? super Float, ? super Float, Float> pVar) {
        m.h(pVar, "<set-?>");
        this.thresholds.setValue(pVar);
    }

    public final void setVelocityThreshold$material3_release(float f) {
        this.velocityThreshold.setValue(Float.valueOf(f));
    }

    @ExperimentalMaterial3Api
    public final Object snapTo$material3_release(T t, dj.c<? super j> cVar) {
        Object objCollect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$snapTo$2(t, this), cVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : j.a;
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getDirection$material3_release$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getProgress$material3_release$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getTargetValue$material3_release$annotations() {
    }

    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec, l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec$material3_release() : animationSpec, (i2 & 4) != 0 ? new l<T, Boolean>() { // from class: androidx.compose.material3.SwipeableState.1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m1609invoke(T t) {
                return Boolean.TRUE;
            }
        } : lVar);
    }
}
