package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: GapBuffer.jvm.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"", "", "destination", "", "destinationOffset", "startIndex", "endIndex", "Lkotlin/j;", "toCharArray", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class GapBuffer_jvmKt {
    public static final void toCharArray(String str, char[] cArr, int i2, int i3, int i4) {
        m.h(str, "<this>");
        m.h(cArr, "destination");
        str.getChars(i3, i4, cArr, i2);
    }
}
