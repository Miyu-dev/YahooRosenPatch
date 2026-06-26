package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u001e\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000\u001a&\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001a\u001d\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n*\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a%\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u000b*\u00020\n*\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "v1", "Landroidx/compose/animation/core/AnimationVector1D;", "AnimationVector", "v2", "Landroidx/compose/animation/core/AnimationVector2D;", "v3", "Landroidx/compose/animation/core/AnimationVector3D;", "v4", "Landroidx/compose/animation/core/AnimationVector4D;", "Landroidx/compose/animation/core/AnimationVector;", "T", "newInstance", "(Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "copy", "source", "Lkotlin/j;", "copyFrom", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f) {
        return new AnimationVector1D(f);
    }

    public static final <T extends AnimationVector> T copy(T t) {
        m.h(t, "<this>");
        T t2 = (T) newInstance(t);
        int size = t2.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            t2.set$animation_core_release(i2, t.get$animation_core_release(i2));
        }
        return t2;
    }

    public static final <T extends AnimationVector> void copyFrom(T t, T t2) {
        m.h(t, "<this>");
        m.h(t2, "source");
        int size = t.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            t.set$animation_core_release(i2, t2.get$animation_core_release(i2));
        }
    }

    public static final <T extends AnimationVector> T newInstance(T t) {
        m.h(t, "<this>");
        T t2 = (T) t.newVector$animation_core_release();
        m.f(t2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t2;
    }

    public static final AnimationVector2D AnimationVector(float f, float f2) {
        return new AnimationVector2D(f, f2);
    }

    public static final AnimationVector3D AnimationVector(float f, float f2, float f3) {
        return new AnimationVector3D(f, f2, f3);
    }

    public static final AnimationVector4D AnimationVector(float f, float f2, float f3, float f4) {
        return new AnimationVector4D(f, f2, f3, f4);
    }
}
