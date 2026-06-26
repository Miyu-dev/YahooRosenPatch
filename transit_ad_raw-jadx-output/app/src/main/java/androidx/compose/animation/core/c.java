package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class c<S> {
    public static boolean a(Transition.Segment segment, Object obj, Object obj2) {
        return m.c(obj, segment.getInitialState()) && m.c(obj2, segment.getTargetState());
    }
}
