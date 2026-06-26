package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B9\u0012\u001e\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00120\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "value", "Lkotlin/j;", "init", "(Landroidx/compose/animation/core/AnimationVector;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "Ljava/util/Map;", "durationMillis", "I", "getDurationMillis", "()I", "delayMillis", "getDelayMillis", "valueVector", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "<init>", "(Ljava/util/Map;II)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final Map<Integer, Pair<V, Easing>> keyframes;
    private V valueVector;
    private V velocityVector;

    public VectorizedKeyframesSpec(Map<Integer, ? extends Pair<? extends V, ? extends Easing>> map, int i2, int i3) {
        m.h(map, "keyframes");
        this.keyframes = map;
        this.durationMillis = i2;
        this.delayMillis = i3;
    }

    private final void init(V value) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(value);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(value);
        }
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public final /* synthetic */ long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return e.a(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return d.a(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        m.h(initialValue, "initialValue");
        m.h(targetValue, "targetValue");
        m.h(initialVelocity, "initialVelocity");
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / AnimationKt.MillisToNanos);
        if (this.keyframes.containsKey(Integer.valueOf(iClampPlayTime))) {
            return (V) ((Pair) i0.L(Integer.valueOf(iClampPlayTime), this.keyframes)).getFirst();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (iClampPlayTime <= 0) {
            return initialValue;
        }
        int durationMillis = getDurationMillis();
        Easing linearEasing = EasingKt.getLinearEasing();
        AnimationVector animationVector = initialValue;
        int i2 = 0;
        for (Map.Entry<Integer, Pair<V, Easing>> entry : this.keyframes.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<V, Easing> value = entry.getValue();
            if (iClampPlayTime > iIntValue && iIntValue >= i2) {
                animationVector = (AnimationVector) value.getFirst();
                linearEasing = (Easing) value.getSecond();
                i2 = iIntValue;
            } else if (iClampPlayTime < iIntValue && iIntValue <= durationMillis) {
                targetValue = (V) value.getFirst();
                durationMillis = iIntValue;
            }
        }
        float fTransform = linearEasing.transform((iClampPlayTime - i2) / (durationMillis - i2));
        init(initialValue);
        int size = animationVector.getSize();
        for (int i3 = 0; i3 < size; i3++) {
            V v = this.valueVector;
            if (v == null) {
                m.o("valueVector");
                throw null;
            }
            v.set$animation_core_release(i3, VectorConvertersKt.lerp(animationVector.get$animation_core_release(i3), targetValue.get$animation_core_release(i3), fTransform));
        }
        V v2 = this.valueVector;
        if (v2 != null) {
            return v2;
        }
        m.o("valueVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        m.h(initialValue, "initialValue");
        m.h(targetValue, "targetValue");
        m.h(initialVelocity, "initialVelocity");
        long jClampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / AnimationKt.MillisToNanos);
        if (jClampPlayTime <= 0) {
            return initialVelocity;
        }
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, jClampPlayTime - 1, initialValue, targetValue, initialVelocity);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, jClampPlayTime, initialValue, targetValue, initialVelocity);
        init(initialValue);
        int size = valueFromMillis.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            V v = this.velocityVector;
            if (v == null) {
                m.o("velocityVector");
                throw null;
            }
            v.set$animation_core_release(i2, (valueFromMillis.get$animation_core_release(i2) - valueFromMillis2.get$animation_core_release(i2)) * 1000.0f);
        }
        V v2 = this.velocityVector;
        if (v2 != null) {
            return v2;
        }
        m.o("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public final /* synthetic */ boolean isInfinite() {
        return f.a(this);
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
