package androidx.compose.foundation.lazy.layout;

import kj.l;

/* JADX INFO: compiled from: IntervalList.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a<T> {
    public static /* synthetic */ void a(IntervalList intervalList, int i2, int i3, l lVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = intervalList.getSize() - 1;
        }
        intervalList.forEach(i2, i3, lVar);
    }
}
