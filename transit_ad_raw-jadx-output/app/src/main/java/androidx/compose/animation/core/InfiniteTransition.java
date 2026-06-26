package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: InfiniteTransition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J#\u0010\n\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R+\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R+\u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR#\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006R\u00020\u00000&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006-"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "", "playTimeNanos", "Lkotlin/j;", "onFrame", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "animation", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;)V", "addAnimation", "removeAnimation$animation_core_release", "removeAnimation", "run$animation_core_release", "(Landroidx/compose/runtime/Composer;I)V", "run", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/runtime/collection/MutableVector;", "_animations", "Landroidx/compose/runtime/collection/MutableVector;", "", "<set-?>", "refreshChildNeeded$delegate", "Landroidx/compose/runtime/MutableState;", "getRefreshChildNeeded", "()Z", "setRefreshChildNeeded", "(Z)V", "refreshChildNeeded", "startTimeNanos", "J", "isRunning$delegate", "isRunning", "setRunning", "", "getAnimations", "()Ljava/util/List;", "animations", "<init>", "(Ljava/lang/String;)V", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class InfiniteTransition {
    public static final int $stable = 8;
    private final MutableVector<TransitionAnimationState<?, ?>> _animations;

    /* JADX INFO: renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final MutableState isRunning;
    private final String label;

    /* JADX INFO: renamed from: refreshChildNeeded$delegate, reason: from kotlin metadata */
    private final MutableState refreshChildNeeded;
    private long startTimeNanos;

    /* JADX INFO: compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bB\u0010CJ-\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0013R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R+\u0010-\u001a\u00028\u00002\u0006\u0010(\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR0\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100RB\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0016\u0010?\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010:R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/j;", "updateValues$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V", "updateValues", "", "playTimeNanos", "onPlayTimeChanged$animation_core_release", "(J)V", "onPlayTimeChanged", "skipToEnd$animation_core_release", "()V", "skipToEnd", "reset$animation_core_release", "reset", "Ljava/lang/Object;", "getInitialValue$animation_core_release", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "getTargetValue$animation_core_release", "setTargetValue$animation_core_release", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "", "label", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core_release", "value", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation", "Landroidx/compose/animation/core/TargetBasedAnimation;", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation$animation_core_release", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "", "isFinished", "Z", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "startOnTheNextFrame", "playTimeNanosOffset", "J", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private TargetBasedAnimation<T, V> animation;
        private AnimationSpec<T> animationSpec;
        private T initialValue;
        private boolean isFinished;
        private final String label;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private T targetValue;
        final /* synthetic */ InfiniteTransition this$0;
        private final TwoWayConverter<T, V> typeConverter;

        /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
        private final MutableState value;

        public TransitionAnimationState(InfiniteTransition infiniteTransition, T t, T t2, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, String str) {
            m.h(twoWayConverter, "typeConverter");
            m.h(animationSpec, "animationSpec");
            m.h(str, "label");
            this.this$0 = infiniteTransition;
            this.initialValue = t;
            this.targetValue = t2;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, twoWayConverter, this.initialValue, this.targetValue, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return this.animation;
        }

        public final AnimationSpec<T> getAnimationSpec() {
            return this.animationSpec;
        }

        public final T getInitialValue$animation_core_release() {
            return this.initialValue;
        }

        public final String getLabel() {
            return this.label;
        }

        public final T getTargetValue$animation_core_release() {
            return this.targetValue;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value.getValue();
        }

        /* JADX INFO: renamed from: isFinished$animation_core_release, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void onPlayTimeChanged$animation_core_release(long playTimeNanos) {
            this.this$0.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = playTimeNanos;
            }
            long j = playTimeNanos - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(j));
            TargetBasedAnimation<T, V> targetBasedAnimation = this.animation;
            targetBasedAnimation.getClass();
            this.isFinished = a.a(targetBasedAnimation, j);
        }

        public final void reset$animation_core_release() {
            this.startOnTheNextFrame = true;
        }

        public final void setAnimation$animation_core_release(TargetBasedAnimation<T, V> targetBasedAnimation) {
            m.h(targetBasedAnimation, "<set-?>");
            this.animation = targetBasedAnimation;
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.isFinished = z;
        }

        public final void setInitialValue$animation_core_release(T t) {
            this.initialValue = t;
        }

        public final void setTargetValue$animation_core_release(T t) {
            this.targetValue = t;
        }

        public void setValue$animation_core_release(T t) {
            this.value.setValue(t);
        }

        public final void skipToEnd$animation_core_release() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void updateValues$animation_core_release(T initialValue, T targetValue, AnimationSpec<T> animationSpec) {
            m.h(animationSpec, "animationSpec");
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, initialValue, targetValue, (AnimationVector) null, 16, (DefaultConstructorMarker) null);
            this.this$0.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }
    }

    public InfiniteTransition(String str) {
        m.h(str, "label");
        this.label = str;
        this._animations = new MutableVector<>(new TransitionAnimationState[16], 0);
        this.refreshChildNeeded = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.startTimeNanos = Long.MIN_VALUE;
        this.isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long j) {
        boolean z;
        MutableVector<TransitionAnimationState<?, ?>> mutableVector = this._animations;
        int size = mutableVector.getSize();
        if (size > 0) {
            TransitionAnimationState<?, ?>[] content = mutableVector.getContent();
            z = true;
            int i2 = 0;
            do {
                TransitionAnimationState<?, ?> transitionAnimationState = content[i2];
                if (!transitionAnimationState.getIsFinished()) {
                    transitionAnimationState.onPlayTimeChanged$animation_core_release(j);
                }
                if (!transitionAnimationState.getIsFinished()) {
                    z = false;
                }
                i2++;
            } while (i2 < size);
        } else {
            z = true;
        }
        setRunning(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z));
    }

    private final void setRunning(boolean z) {
        this.isRunning.setValue(Boolean.valueOf(z));
    }

    public final void addAnimation$animation_core_release(TransitionAnimationState<?, ?> animation) {
        m.h(animation, "animation");
        this._animations.add(animation);
        setRefreshChildNeeded(true);
    }

    public final List<TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations.asMutableList();
    }

    public final String getLabel() {
        return this.label;
    }

    public final void removeAnimation$animation_core_release(TransitionAnimationState<?, ?> animation) {
        m.h(animation, "animation");
        this._animations.remove(animation);
    }

    @Composable
    public final void run$animation_core_release(Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-318043801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-318043801, i2, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        if (isRunning() || getRefreshChildNeeded()) {
            EffectsKt.LaunchedEffect(this, new InfiniteTransition$run$1(mutableState, this, null), composerStartRestartGroup, 72);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i3) {
                this.$tmp0_rcvr.run$animation_core_release(composer2, i2 | 1);
            }
        });
    }
}
