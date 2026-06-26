package androidx.compose.animation.core;

import a.l;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "anim", "Landroidx/compose/animation/core/FloatAnimationSpec;", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "anims", "Landroidx/compose/animation/core/Animations;", "(Landroidx/compose/animation/core/Animations;)V", "endVelocityVector", "Landroidx/compose/animation/core/AnimationVector;", "valueVector", "velocityVector", "getDurationNanos", "", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final Animations anims;
    private V endVelocityVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatAnimationSpec(Animations animations) {
        m.h(animations, "anims");
        this.anims = animations;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V initialValue, V targetValue, V initialVelocity) {
        m.h(initialValue, "initialValue");
        m.h(targetValue, "targetValue");
        m.h(initialVelocity, "initialVelocity");
        f0 it = l.C(0, initialValue.getSize()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            jMax = Math.max(jMax, this.anims.get(iNextInt).getDurationNanos(initialValue.get$animation_core_release(iNextInt), targetValue.get$animation_core_release(iNextInt), initialVelocity.get$animation_core_release(iNextInt)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getEndVelocity(V initialValue, V targetValue, V initialVelocity) {
        m.h(initialValue, "initialValue");
        m.h(targetValue, "targetValue");
        m.h(initialVelocity, "initialVelocity");
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v = this.endVelocityVector;
        if (v == null) {
            m.o("endVelocityVector");
            throw null;
        }
        int size = v.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            V v2 = this.endVelocityVector;
            if (v2 == null) {
                m.o("endVelocityVector");
                throw null;
            }
            v2.set$animation_core_release(i2, this.anims.get(i2).getEndVelocity(initialValue.get$animation_core_release(i2), targetValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        V v3 = this.endVelocityVector;
        if (v3 != null) {
            return v3;
        }
        m.o("endVelocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        m.h(initialValue, "initialValue");
        m.h(targetValue, "targetValue");
        m.h(initialVelocity, "initialVelocity");
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v = this.valueVector;
        if (v == null) {
            m.o("valueVector");
            throw null;
        }
        int size = v.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            V v2 = this.valueVector;
            if (v2 == null) {
                m.o("valueVector");
                throw null;
            }
            v2.set$animation_core_release(i2, this.anims.get(i2).getValueFromNanos(playTimeNanos, initialValue.get$animation_core_release(i2), targetValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        V v3 = this.valueVector;
        if (v3 != null) {
            return v3;
        }
        m.o("valueVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        m.h(initialValue, "initialValue");
        m.h(targetValue, "targetValue");
        m.h(initialVelocity, "initialVelocity");
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v = this.velocityVector;
        if (v == null) {
            m.o("velocityVector");
            throw null;
        }
        int size = v.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            V v2 = this.velocityVector;
            if (v2 == null) {
                m.o("velocityVector");
                throw null;
            }
            v2.set$animation_core_release(i2, this.anims.get(i2).getVelocityFromNanos(playTimeNanos, initialValue.get$animation_core_release(i2), targetValue.get$animation_core_release(i2), initialVelocity.get$animation_core_release(i2)));
        }
        V v3 = this.velocityVector;
        if (v3 != null) {
            return v3;
        }
        m.o("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public final /* synthetic */ boolean isInfinite() {
        return f.a(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int index) {
                return floatAnimationSpec;
            }
        });
        m.h(floatAnimationSpec, "anim");
    }
}
