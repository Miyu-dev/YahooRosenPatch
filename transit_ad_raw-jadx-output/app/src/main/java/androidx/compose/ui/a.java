package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a {
    static {
        Modifier.Companion companion = Modifier.Companion;
    }

    public static Modifier a(Modifier modifier, Modifier modifier2) {
        m.h(modifier2, "other");
        return modifier2 == Modifier.Companion ? modifier : new CombinedModifier(modifier, modifier2);
    }
}
