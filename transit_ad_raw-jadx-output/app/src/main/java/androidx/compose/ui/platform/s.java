package androidx.compose.ui.platform;

import androidx.compose.ui.ExperimentalComposeUiApi;

/* JADX INFO: compiled from: WindowInfo.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class s {
    @ExperimentalComposeUiApi
    public static int a(WindowInfo windowInfo) {
        return WindowInfoImpl.INSTANCE.getGlobalKeyboardModifiers$ui_release().getValue().getPackedValue();
    }

    public static /* synthetic */ void b() {
    }
}
