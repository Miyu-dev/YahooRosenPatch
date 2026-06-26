package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class f {
    public static float a(SideCalculator sideCalculator, float f, float f2) {
        float fMotionOf = sideCalculator.motionOf(f, f2);
        if (fMotionOf > 0.0f) {
            return 0.0f;
        }
        return fMotionOf;
    }

    public static float b(SideCalculator sideCalculator, float f, float f2) {
        float fMotionOf = sideCalculator.motionOf(f, f2);
        if (fMotionOf < 0.0f) {
            return 0.0f;
        }
        return fMotionOf;
    }
}
