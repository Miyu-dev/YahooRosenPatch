package androidx.compose.ui.focus;

/* JADX INFO: compiled from: FocusManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ void a(FocusManager focusManager, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        focusManager.clearFocus(z);
    }
}
