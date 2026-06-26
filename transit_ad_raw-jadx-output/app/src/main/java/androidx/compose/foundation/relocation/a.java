package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import dj.c;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ Object a(BringIntoViewRequester bringIntoViewRequester, Rect rect, c cVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i2 & 1) != 0) {
            rect = null;
        }
        return bringIntoViewRequester.bringIntoView(rect, cVar);
    }
}
