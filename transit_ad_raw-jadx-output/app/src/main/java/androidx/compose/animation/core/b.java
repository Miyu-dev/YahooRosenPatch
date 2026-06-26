package androidx.compose.animation.core;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class b {
    public static float a(FloatAnimationSpec floatAnimationSpec, float f, float f2, float f3) {
        return floatAnimationSpec.getVelocityFromNanos(floatAnimationSpec.getDurationNanos(f, f2, f3), f, f2, f3);
    }

    public static VectorizedFloatAnimationSpec c(FloatAnimationSpec floatAnimationSpec, TwoWayConverter twoWayConverter) {
        m.h(twoWayConverter, "converter");
        return new VectorizedFloatAnimationSpec(floatAnimationSpec);
    }
}
