package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SnapshotIdSet.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"lowestBitOf", "", "bits", "", "binarySearch", "", "value", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SnapshotIdSetKt {
    public static final int binarySearch(int[] iArr, int i2) {
        m.h(iArr, "<this>");
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) >>> 1;
            int i5 = iArr[i4];
            if (i2 > i5) {
                i3 = i4 + 1;
            } else {
                if (i2 >= i5) {
                    return i4;
                }
                length = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lowestBitOf(long j) {
        int i2;
        if ((4294967295L & j) == 0) {
            i2 = 32;
            j >>= 32;
        } else {
            i2 = 0;
        }
        if ((65535 & j) == 0) {
            i2 += 16;
            j >>= 16;
        }
        if ((255 & j) == 0) {
            i2 += 8;
            j >>= 8;
        }
        if ((15 & j) == 0) {
            i2 += 4;
            j >>= 4;
        }
        if ((1 & j) != 0) {
            return i2;
        }
        if ((2 & j) != 0) {
            return i2 + 1;
        }
        if ((4 & j) != 0) {
            return i2 + 2;
        }
        if ((j & 8) != 0) {
            return i2 + 3;
        }
        return -1;
    }
}
