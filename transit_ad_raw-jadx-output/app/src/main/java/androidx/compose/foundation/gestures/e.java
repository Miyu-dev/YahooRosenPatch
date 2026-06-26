package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kj.p;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class e {
    public static /* synthetic */ Object a(TransformableState transformableState, MutatePriority mutatePriority, p pVar, dj.c cVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
        }
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return transformableState.transform(mutatePriority, pVar, cVar);
    }
}
