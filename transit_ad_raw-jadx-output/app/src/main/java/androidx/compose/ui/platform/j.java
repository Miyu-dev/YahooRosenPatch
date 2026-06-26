package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;

/* JADX INFO: compiled from: ClipboardManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class j {
    public static boolean a(ClipboardManager clipboardManager) {
        AnnotatedString text = clipboardManager.getText();
        if (text != null) {
            return text.length() > 0;
        }
        return false;
    }
}
