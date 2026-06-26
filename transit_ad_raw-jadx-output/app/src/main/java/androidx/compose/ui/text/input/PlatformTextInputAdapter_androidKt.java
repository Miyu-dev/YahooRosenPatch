package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PlatformTextInputAdapter.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Lkotlin/j;", "dispose", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class PlatformTextInputAdapter_androidKt {
    public static final void dispose(PlatformTextInputAdapter platformTextInputAdapter) {
        m.h(platformTextInputAdapter, "<this>");
        platformTextInputAdapter.onDisposed();
    }
}
