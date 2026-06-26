package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ForEachOneBit.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0005"}, d2 = {"", "Lkotlin/Function2;", "Lkotlin/j;", "body", "forEachOneBit", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i2, p<? super Integer, ? super Integer, j> pVar) {
        m.h(pVar, "body");
        int i3 = 0;
        while (i2 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i2);
            pVar.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i3));
            i3++;
            i2 ^= iLowestOneBit;
        }
    }
}
