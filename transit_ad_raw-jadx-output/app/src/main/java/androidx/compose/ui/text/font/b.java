package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ State a(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }
        if ((i4 & 1) != 0) {
            fontFamily = null;
        }
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.INSTANCE.m4902getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontSynthesis.INSTANCE.m4912getAllGVVA2EU();
        }
        return resolver.mo4872resolveDPcqOEQ(fontFamily, fontWeight, i2, i3);
    }
}
