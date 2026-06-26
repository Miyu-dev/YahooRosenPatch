package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ void a(TransformScope transformScope, float f, long j, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        if ((i2 & 2) != 0) {
            j = Offset.INSTANCE.m2601getZeroF1C5BW0();
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        transformScope.mo275transformByd4ec7I(f, j, f2);
    }
}
