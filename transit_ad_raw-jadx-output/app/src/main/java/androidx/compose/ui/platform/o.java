package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;

/* JADX INFO: compiled from: TextToolbar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class o {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(TextToolbar textToolbar, Rect rect, kj.a aVar, kj.a aVar2, kj.a aVar3, kj.a aVar4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        textToolbar.showMenu(rect, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : aVar2, (i2 & 8) != 0 ? null : aVar3, (i2 & 16) != 0 ? null : aVar4);
    }
}
