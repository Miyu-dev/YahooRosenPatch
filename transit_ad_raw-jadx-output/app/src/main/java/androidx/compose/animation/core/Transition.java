package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004rstuB#\b\u0001\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\bo\u0010pB\u001b\b\u0010\u0012\u0006\u0010\u0011\u001a\u00028\u0000\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\bo\u0010qJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u001b\u001a\u00020\u00182\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00182\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ)\u0010\"\u001a\u00020\u00182\u0018\u0010\u001f\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b \u0010!J)\u0010%\u001a\u00020\u00072\u0018\u0010\u001f\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u0000H\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u0000H\u0001¢\u0006\u0004\b)\u0010'J)\u0010%\u001a\u00020\u00072\u0018\u0010,\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030+R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b#\u0010-J\b\u0010.\u001a\u00020\u0007H\u0002R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0019\u00103\u001a\u0004\u0018\u0001028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R+\u0010\u0012\u001a\u00028\u00002\u0006\u00107\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R7\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000>2\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000>8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR1\u0010\u0013\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00038F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bE\u00109\u0012\u0004\bI\u0010\u000f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010\fR+\u0010M\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u00109\u001a\u0004\bK\u0010G\"\u0004\bL\u0010\fR+\u0010S\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u00188@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u00109\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR,\u0010U\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eR\b\u0012\u0004\u0012\u00028\u00000\u00000T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001e\u0010W\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR1\u0010Y\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u00188F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bX\u00109\u0012\u0004\b[\u0010\u000f\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR\"\u0010\\\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010G\"\u0004\b_\u0010\fR\u001b\u0010c\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010GR$\u0010g\u001a\u00028\u00002\u0006\u0010d\u001a\u00028\u00008F@@X\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010;\"\u0004\bf\u0010=R\u0011\u0010h\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bh\u0010PR\u001b\u0010l\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000i8F¢\u0006\u0006\u001a\u0004\bj\u0010kR)\u0010n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001eR\b\u0012\u0004\u0012\u00028\u00000\u00000i8F¢\u0006\u0006\u001a\u0004\bm\u0010k¨\u0006v"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "", "frameTimeNanos", "", "durationScale", "Lkotlin/j;", "onFrame$animation_core_release", "(JF)V", "onFrame", "onTransitionStart$animation_core_release", "(J)V", "onTransitionStart", "onTransitionEnd$animation_core_release", "()V", "onTransitionEnd", "initialState", "targetState", "playTimeNanos", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "setPlaytimeAfterInitialAndTargetStateEstablished", "transition", "", "addTransition$animation_core_release", "(Landroidx/compose/animation/core/Transition;)Z", "addTransition", "removeTransition$animation_core_release", "removeTransition", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "animation", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)Z", "addAnimation", "removeAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)V", "removeAnimation", "updateTarget$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "updateTarget", "animateTo$animation_core_release", "animateTo", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "deferredAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "onChildAnimationUpdated", "Landroidx/compose/animation/core/MutableTransitionState;", "transitionState", "Landroidx/compose/animation/core/MutableTransitionState;", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "targetState$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition$Segment;", "segment$delegate", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment", "playTimeNanos$delegate", "getPlayTimeNanos", "()J", "setPlayTimeNanos", "getPlayTimeNanos$annotations", "startTimeNanos$delegate", "getStartTimeNanos", "setStartTimeNanos", "startTimeNanos", "updateChildrenNeeded$delegate", "getUpdateChildrenNeeded$animation_core_release", "()Z", "setUpdateChildrenNeeded$animation_core_release", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_animations", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_transitions", "isSeeking$delegate", "isSeeking", "setSeeking$animation_core_release", "isSeeking$annotations", "lastSeekedTimeNanos", "J", "getLastSeekedTimeNanos$animation_core_release", "setLastSeekedTimeNanos$animation_core_release", "totalDurationNanos$delegate", "Landroidx/compose/runtime/State;", "getTotalDurationNanos", "totalDurationNanos", "value", "getCurrentState", "setCurrentState$animation_core_release", "currentState", "isRunning", "", "getTransitions", "()Ljava/util/List;", "transitions", "getAnimations", "animations", "<init>", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "(Ljava/lang/Object;Ljava/lang/String;)V", "DeferredAnimation", "Segment", "SegmentImpl", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class Transition<S> {
    public static final int $stable = 0;
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    private final SnapshotStateList<Transition<?>> _transitions;

    /* JADX INFO: renamed from: isSeeking$delegate, reason: from kotlin metadata */
    private final MutableState isSeeking;
    private final String label;
    private long lastSeekedTimeNanos;

    /* JADX INFO: renamed from: playTimeNanos$delegate, reason: from kotlin metadata */
    private final MutableState playTimeNanos;

    /* JADX INFO: renamed from: segment$delegate, reason: from kotlin metadata */
    private final MutableState segment;

    /* JADX INFO: renamed from: startTimeNanos$delegate, reason: from kotlin metadata */
    private final MutableState startTimeNanos;

    /* JADX INFO: renamed from: targetState$delegate, reason: from kotlin metadata */
    private final MutableState targetState;

    /* JADX INFO: renamed from: totalDurationNanos$delegate, reason: from kotlin metadata */
    private final State totalDurationNanos;
    private final MutableTransitionState<S> transitionState;

    /* JADX INFO: renamed from: updateChildrenNeeded$delegate, reason: from kotlin metadata */
    private final MutableState updateChildrenNeeded;

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001&B%\b\u0000\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%J@\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005J\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R{\u0010#\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001aR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001b2.\u0010\u001c\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001aR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "targetValueByState", "Landroidx/compose/runtime/State;", "animate", "Lkotlin/j;", "setupSeeking$animation_core_release", "()V", "setupSeeking", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "<set-?>", "data$delegate", "Landroidx/compose/runtime/MutableState;", "getData$animation_core_release", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core_release", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "data", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    @InternalAnimationApi
    public final class DeferredAnimation<T, V extends AnimationVector> {

        /* JADX INFO: renamed from: data$delegate, reason: from kotlin metadata */
        private final MutableState data;
        private final String label;
        final /* synthetic */ Transition<S> this$0;
        private final TwoWayConverter<T, V> typeConverter;

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004BY\u0012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u001e\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00100\u000f\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005R-\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\tR\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR:\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001c\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$Segment;", "segment", "Lkotlin/j;", "updateAnimationStates", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "animation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "Lkj/l;", "getTransitionSpec", "()Lkj/l;", "setTransitionSpec", "(Lkj/l;)V", "targetValueByState", "getTargetValueByState", "setTargetValueByState", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkj/l;Lkj/l;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            private l<? super S, ? extends T> targetValueByState;
            final /* synthetic */ Transition<S>.DeferredAnimation<T, V> this$0;
            private l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(DeferredAnimation deferredAnimation, Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, l<? super S, ? extends T> lVar2) {
                m.h(transitionAnimationState, "animation");
                m.h(lVar, "transitionSpec");
                m.h(lVar2, "targetValueByState");
                this.this$0 = deferredAnimation;
                this.animation = transitionAnimationState;
                this.transitionSpec = lVar;
                this.targetValueByState = lVar2;
            }

            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final l<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            public final l<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(this.this$0.this$0.getSegment());
                return this.animation.getValue();
            }

            public final void setTargetValueByState(l<? super S, ? extends T> lVar) {
                m.h(lVar, "<set-?>");
                this.targetValueByState = lVar;
            }

            public final void setTransitionSpec(l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar) {
                m.h(lVar, "<set-?>");
                this.transitionSpec = lVar;
            }

            public final void updateAnimationStates(Segment<S> segment) {
                m.h(segment, "segment");
                Object objInvoke = this.targetValueByState.invoke(segment.getTargetState());
                if (!this.this$0.this$0.isSeeking()) {
                    this.animation.updateTargetValue$animation_core_release((T) objInvoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateInitialAndTargetValue$animation_core_release((T) this.targetValueByState.invoke(segment.getInitialState()), (T) objInvoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                }
            }
        }

        public DeferredAnimation(Transition transition, TwoWayConverter<T, V> twoWayConverter, String str) {
            m.h(twoWayConverter, "typeConverter");
            m.h(str, "label");
            this.this$0 = transition;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.data = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        }

        public final State<T> animate(l<? super Segment<S>, ? extends FiniteAnimationSpec<T>> lVar, l<? super S, ? extends T> lVar2) {
            m.h(lVar, "transitionSpec");
            m.h(lVar2, "targetValueByState");
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release == null) {
                Transition<S> transition = this.this$0;
                data$animation_core_release = new DeferredAnimationData<>(this, new TransitionAnimationState(transition, lVar2.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, lVar2.invoke(this.this$0.getCurrentState())), this.typeConverter, this.label), lVar, lVar2);
                Transition<S> transition2 = this.this$0;
                setData$animation_core_release(data$animation_core_release);
                transition2.addAnimation$animation_core_release(data$animation_core_release.getAnimation());
            }
            Transition<S> transition3 = this.this$0;
            data$animation_core_release.setTargetValueByState(lVar2);
            data$animation_core_release.setTransitionSpec(lVar);
            data$animation_core_release.updateAnimationStates(transition3.getSegment());
            return data$animation_core_release;
        }

        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return (DeferredAnimationData) this.data.getValue();
        }

        public final String getLabel() {
            return this.label;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final void setData$animation_core_release(Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data.setValue(deferredAnimationData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release != null) {
                Transition<S> transition = this.this$0;
                data$animation_core_release.getAnimation().updateInitialAndTargetValue$animation_core_release(data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getTargetState()), (FiniteAnimationSpec) data$animation_core_release.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001a\u0010\b\u001a\u00020\t*\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "isTransitioningTo", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public interface Segment<S> {

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(Segment<S> segment, S s, S s2) {
                return c.a(segment, s, s2);
            }
        }

        S getInitialState();

        S getTargetState();

        boolean isTransitioningTo(S s, S s2);
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "initialState", "targetState", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getInitialState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTargetState", "equals", "", "other", "", "hashCode", "", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    public static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s, S s2) {
            this.initialState = s;
            this.targetState = s2;
        }

        public boolean equals(Object other) {
            if (other instanceof Segment) {
                Segment segment = (Segment) other;
                if (m.c(getInitialState(), segment.getInitialState()) && m.c(getTargetState(), segment.getTargetState())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int iHashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            S targetState = getTargetState();
            return iHashCode + (targetState != null ? targetState.hashCode() : 0);
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public final /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
            return c.a(this, obj, obj2);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010W\u001a\u00028\u0002\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\bX\u0010YJ#\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R+\u0010\u0018\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R7\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u00198F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u00104\"\u0004\b5\u00106RC\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002072\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010-\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010C\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010-\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR+\u0010H\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010-\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\u0013R+\u0010L\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010-\u001a\u0004\bJ\u0010@\"\u0004\bK\u0010BR+\u0010P\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010-\u001a\u0004\bN\u0010/\"\u0004\bO\u00101R\u0016\u0010Q\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010F¨\u0006Z"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "", "isInterrupted", "Lkotlin/j;", "updateAnimation", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "", "durationScale", "onPlayTimeChanged$animation_core_release", "(JF)V", "onPlayTimeChanged", "seekTo$animation_core_release", "(J)V", "seekTo", "resetAnimation$animation_core_release", "()V", "resetAnimation", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTargetValue$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateTargetValue", "updateInitialAndTargetValue$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialAndTargetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "targetValue$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "animationSpec$delegate", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation$delegate", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "isFinished$delegate", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "offsetTimeNanos$delegate", "getOffsetTimeNanos", "()J", "setOffsetTimeNanos", "offsetTimeNanos", "needsReset$delegate", "getNeedsReset", "setNeedsReset", "needsReset", "value$delegate", "getValue", "setValue$animation_core_release", "value", "velocityVector", "Landroidx/compose/animation/core/AnimationVector;", "interruptionSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getDurationNanos$animation_core_release", "durationNanos", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    @Stable
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* JADX INFO: renamed from: animation$delegate, reason: from kotlin metadata */
        private final MutableState animation;

        /* JADX INFO: renamed from: animationSpec$delegate, reason: from kotlin metadata */
        private final MutableState animationSpec;
        private final FiniteAnimationSpec<T> interruptionSpec;

        /* JADX INFO: renamed from: isFinished$delegate, reason: from kotlin metadata */
        private final MutableState isFinished;
        private final String label;

        /* JADX INFO: renamed from: needsReset$delegate, reason: from kotlin metadata */
        private final MutableState needsReset;

        /* JADX INFO: renamed from: offsetTimeNanos$delegate, reason: from kotlin metadata */
        private final MutableState offsetTimeNanos;

        /* JADX INFO: renamed from: targetValue$delegate, reason: from kotlin metadata */
        private final MutableState targetValue;
        final /* synthetic */ Transition<S> this$0;
        private final TwoWayConverter<T, V> typeConverter;

        /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
        private final MutableState value;
        private V velocityVector;

        public TransitionAnimationState(Transition transition, T t, V v, TwoWayConverter<T, V> twoWayConverter, String str) {
            Object objInvoke;
            m.h(v, "initialVelocityVector");
            m.h(twoWayConverter, "typeConverter");
            m.h(str, "label");
            this.this$0 = transition;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.targetValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.animationSpec = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animation = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t, getTargetValue(), v), null, 2, null);
            this.isFinished = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.offsetTimeNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            this.needsReset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.velocityVector = v;
            Float f = VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f != null) {
                float fFloatValue = f.floatValue();
                AnimationVector animationVector = (AnimationVector) twoWayConverter.getConvertToVector().invoke(t);
                int size = animationVector.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    animationVector.set$animation_core_release(i2, fFloatValue);
                }
                objInvoke = this.typeConverter.getConvertFromVector().invoke(animationVector);
            } else {
                objInvoke = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, objInvoke, 3, null);
        }

        private final boolean getNeedsReset() {
            return ((Boolean) this.needsReset.getValue()).booleanValue();
        }

        private final long getOffsetTimeNanos() {
            return ((Number) this.offsetTimeNanos.getValue()).longValue();
        }

        private final T getTargetValue() {
            return this.targetValue.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation.setValue(targetBasedAnimation);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec.setValue(finiteAnimationSpec);
        }

        private final void setNeedsReset(boolean z) {
            this.needsReset.setValue(Boolean.valueOf(z));
        }

        private final void setOffsetTimeNanos(long j) {
            this.offsetTimeNanos.setValue(Long.valueOf(j));
        }

        private final void setTargetValue(T t) {
            this.targetValue.setValue(t);
        }

        private final void updateAnimation(T initialValue, boolean isInterrupted) {
            FiniteAnimationSpec<T> animationSpec = (!isInterrupted || (getAnimationSpec() instanceof SpringSpec)) ? getAnimationSpec() : this.interruptionSpec;
            setAnimation(new TargetBasedAnimation<>(animationSpec, this.typeConverter, initialValue, getTargetValue(), this.velocityVector));
            this.this$0.onChildAnimationUpdated();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            transitionAnimationState.updateAnimation(obj, z);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation.getValue();
        }

        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        public final String getLabel() {
            return this.label;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long playTimeNanos, float durationScale) {
            long durationNanos;
            if (durationScale > 0.0f) {
                float offsetTimeNanos = (playTimeNanos - getOffsetTimeNanos()) / durationScale;
                if (!(!Float.isNaN(offsetTimeNanos))) {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + durationScale + ",playTimeNanos: " + playTimeNanos + ", offsetTimeNanos: " + getOffsetTimeNanos()).toString());
                }
                durationNanos = (long) offsetTimeNanos;
            } else {
                durationNanos = getAnimation().getDurationNanos();
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(durationNanos));
            this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(durationNanos);
            TargetBasedAnimation<T, V> animation = getAnimation();
            animation.getClass();
            if (a.a(animation, durationNanos)) {
                setFinished$animation_core_release(true);
                setOffsetTimeNanos(0L);
            }
        }

        public final void resetAnimation$animation_core_release() {
            setNeedsReset(true);
        }

        public final void seekTo$animation_core_release(long playTimeNanos) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(playTimeNanos));
            this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(playTimeNanos);
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.isFinished.setValue(Boolean.valueOf(z));
        }

        public void setValue$animation_core_release(T t) {
            this.value.setValue(t);
        }

        public final void updateInitialAndTargetValue$animation_core_release(T initialValue, T targetValue, FiniteAnimationSpec<T> animationSpec) {
            m.h(animationSpec, "animationSpec");
            setTargetValue(targetValue);
            setAnimationSpec(animationSpec);
            if (m.c(getAnimation().getInitialValue(), initialValue) && m.c(getAnimation().getTargetValue(), targetValue)) {
                return;
            }
            updateAnimation$default(this, initialValue, false, 2, null);
        }

        public final void updateTargetValue$animation_core_release(T targetValue, FiniteAnimationSpec<T> animationSpec) {
            m.h(animationSpec, "animationSpec");
            if (!m.c(getTargetValue(), targetValue) || getNeedsReset()) {
                setTargetValue(targetValue);
                setAnimationSpec(animationSpec);
                updateAnimation$default(this, null, !isFinished$animation_core_release(), 1, null);
                setFinished$animation_core_release(false);
                setOffsetTimeNanos(this.this$0.getPlayTimeNanos());
                setNeedsReset(false);
            }
        }
    }

    public Transition(MutableTransitionState<S> mutableTransitionState, String str) {
        m.h(mutableTransitionState, "transitionState");
        this.transitionState = mutableTransitionState;
        this.label = str;
        this.targetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.segment = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this.playTimeNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.startTimeNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.updateChildrenNeeded = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.totalDurationNanos = SnapshotStateKt.derivedStateOf(new kj.a<Long>(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            final /* synthetic */ Transition<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Long m158invoke() {
                Iterator<T> it = ((Transition) this.this$0)._animations.iterator();
                long jMax = 0;
                while (it.hasNext()) {
                    jMax = Math.max(jMax, ((Transition.TransitionAnimationState) it.next()).getDurationNanos$animation_core_release());
                }
                Iterator<T> it2 = ((Transition) this.this$0)._transitions.iterator();
                while (it2.hasNext()) {
                    jMax = Math.max(jMax, ((Transition) it2.next()).getTotalDurationNanos());
                }
                return Long.valueOf(jMax);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long getStartTimeNanos() {
        return ((Number) this.startTimeNanos.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded$animation_core_release(true);
        if (isSeeking()) {
            long jMax = 0;
            for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
                jMax = Math.max(jMax, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    private final void setSegment(Segment<S> segment) {
        this.segment.setValue(segment);
    }

    private final void setStartTimeNanos(long j) {
        this.startTimeNanos.setValue(Long.valueOf(j));
    }

    public final boolean addAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> animation) {
        m.h(animation, "animation");
        return this._animations.add(animation);
    }

    public final boolean addTransition$animation_core_release(Transition<?> transition) {
        m.h(transition, "transition");
        return this._transitions.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(final S s, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(s) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i3, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:424)");
            }
            if (!isSeeking()) {
                updateTarget$animation_core_release(s, composerStartRestartGroup, (i3 & 14) | (i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                if (!m.c(s, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                    int i4 = (i3 >> 3) & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    boolean zChanged = composerStartRestartGroup.changed(this);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Transition$animateTo$1$1(this, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(this, (p<? super CoroutineScope, ? super dj.c<? super j>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i4 | 64);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2
            final /* synthetic */ Transition<S> $tmp0_rcvr;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.$tmp0_rcvr = this;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void invoke(Composer composer2, int i5) {
                this.$tmp0_rcvr.animateTo$animation_core_release(s, composer2, i2 | 1);
            }
        });
    }

    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: getLastSeekedTimeNanos$animation_core_release, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getPlayTimeNanos() {
        return ((Number) this.playTimeNanos.getValue()).longValue();
    }

    public final Segment<S> getSegment() {
        return (Segment) this.segment.getValue();
    }

    public final S getTargetState() {
        return (S) this.targetState.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    public final boolean isRunning() {
        return getStartTimeNanos() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void onFrame$animation_core_release(long frameTimeNanos, float durationScale) {
        if (getStartTimeNanos() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(frameTimeNanos);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(frameTimeNanos - getStartTimeNanos());
        boolean z = true;
        for (Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState : this._animations) {
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), durationScale);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z = false;
            }
        }
        for (Transition<?> transition : this._transitions) {
            if (!m.c(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(getPlayTimeNanos(), durationScale);
            }
            if (!m.c(transition.getTargetState(), transition.getCurrentState())) {
                z = false;
            }
        }
        if (z) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos(Long.MIN_VALUE);
        setCurrentState$animation_core_release(getTargetState());
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
    }

    public final void onTransitionStart$animation_core_release(long frameTimeNanos) {
        setStartTimeNanos(frameTimeNanos);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> animation) {
        m.h(animation, "animation");
        this._animations.remove(animation);
    }

    public final boolean removeTransition$animation_core_release(Transition<?> transition) {
        m.h(transition, "transition");
        return this._transitions.remove(transition);
    }

    public final void seek(S initialState, S targetState, long playTimeNanos) {
        setStartTimeNanos(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !m.c(getCurrentState(), initialState) || !m.c(getTargetState(), targetState)) {
            setCurrentState$animation_core_release(initialState);
            setTargetState$animation_core_release(targetState);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(initialState, targetState));
        }
        for (Transition<?> transition : this._transitions) {
            m.f(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), playTimeNanos);
            }
        }
        Iterator<Transition<S>.TransitionAnimationState<?, ?>> it = this._animations.iterator();
        while (it.hasNext()) {
            it.next().seekTo$animation_core_release(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final void setCurrentState$animation_core_release(S s) {
        this.transitionState.setCurrentState$animation_core_release(s);
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j) {
        this.lastSeekedTimeNanos = j;
    }

    public final void setPlayTimeNanos(long j) {
        this.playTimeNanos.setValue(Long.valueOf(j));
    }

    public final void setSeeking$animation_core_release(boolean z) {
        this.isSeeking.setValue(Boolean.valueOf(z));
    }

    public final void setTargetState$animation_core_release(S s) {
        this.targetState.setValue(s);
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z));
    }

    @Composable
    public final void updateTarget$animation_core_release(final S s, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-583974681);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(s) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583974681, i2, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:399)");
            }
            if (!isSeeking() && !m.c(getTargetState(), s)) {
                setSegment(new SegmentImpl(getTargetState(), s));
                setCurrentState$animation_core_release(getTargetState());
                setTargetState$animation_core_release(s);
                if (!isRunning()) {
                    setUpdateChildrenNeeded$animation_core_release(true);
                }
                Iterator<Transition<S>.TransitionAnimationState<?, ?>> it = this._animations.iterator();
                while (it.hasNext()) {
                    it.next().resetAnimation$animation_core_release();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>(this) { // from class: androidx.compose.animation.core.Transition$updateTarget$2
            final /* synthetic */ Transition<S> $tmp0_rcvr;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.$tmp0_rcvr = this;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void invoke(Composer composer2, int i4) {
                this.$tmp0_rcvr.updateTarget$animation_core_release(s, composer2, i2 | 1);
            }
        });
    }

    public final void removeAnimation$animation_core_release(Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        m.h(deferredAnimation, "deferredAnimation");
        Transition<S>.DeferredAnimationData<?, ?>.DeferredAnimationData<?, V> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == 0 || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableTransitionState, (i2 & 2) != 0 ? null : str);
    }

    public Transition(S s, String str) {
        this(new MutableTransitionState(s), str);
    }

    @InternalAnimationApi
    public static /* synthetic */ void getPlayTimeNanos$annotations() {
    }

    @InternalAnimationApi
    public static /* synthetic */ void isSeeking$annotations() {
    }
}
