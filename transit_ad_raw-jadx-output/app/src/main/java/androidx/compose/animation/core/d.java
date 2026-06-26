package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class d<V extends AnimationVector> {
    public static AnimationVector a(VectorizedAnimationSpec vectorizedAnimationSpec, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        m.h(animationVector, "initialValue");
        m.h(animationVector2, "targetValue");
        m.h(animationVector3, "initialVelocity");
        return vectorizedAnimationSpec.getVelocityFromNanos(vectorizedAnimationSpec.getDurationNanos(animationVector, animationVector2, animationVector3), animationVector, animationVector2, animationVector3);
    }
}
