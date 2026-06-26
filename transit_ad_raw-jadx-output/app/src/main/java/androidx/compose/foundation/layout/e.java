package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;

/* JADX INFO: compiled from: Row.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class e {
    public static /* synthetic */ Modifier a(RowScope rowScope, Modifier modifier, float f, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        return rowScope.weight(modifier, f, z);
    }
}
