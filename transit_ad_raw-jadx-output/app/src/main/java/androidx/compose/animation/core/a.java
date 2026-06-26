package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a<T, V extends AnimationVector> {
    public static boolean a(Animation animation, long j) {
        return j >= animation.getDurationNanos();
    }
}
