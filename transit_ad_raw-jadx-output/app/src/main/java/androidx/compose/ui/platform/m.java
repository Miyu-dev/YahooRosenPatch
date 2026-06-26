package androidx.compose.ui.platform;

import java.lang.Comparable;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class m<T extends Comparable<? super T>> {
    public static boolean a(OpenEndRange openEndRange, Comparable comparable) {
        kotlin.jvm.internal.m.h(comparable, "value");
        return comparable.compareTo(openEndRange.getStart()) >= 0 && comparable.compareTo(openEndRange.getEndExclusive()) < 0;
    }

    public static boolean b(OpenEndRange openEndRange) {
        return openEndRange.getStart().compareTo(openEndRange.getEndExclusive()) >= 0;
    }
}
