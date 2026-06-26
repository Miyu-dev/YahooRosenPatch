package androidx.compose.runtime.internal;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ThreadMap.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ThreadMap {
    private final long[] keys;
    private final int size;
    private final Object[] values;

    public ThreadMap(int i2, long[] jArr, Object[] objArr) {
        m.h(jArr, "keys");
        m.h(objArr, "values");
        this.size = i2;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int find(long key) {
        int i2 = this.size - 1;
        if (i2 == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 0) {
            long j = this.keys[0];
            if (j == key) {
                return 0;
            }
            return j > key ? -2 : -1;
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = this.keys[i4] - key;
            if (j2 < 0) {
                i3 = i4 + 1;
            } else {
                if (j2 <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public final Object get(long key) {
        int iFind = find(key);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        return null;
    }

    public final ThreadMap newWith(long key, Object value) {
        int i2 = this.size;
        Object[] objArr = this.values;
        int length = objArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            if (objArr[i4] != null) {
                i5++;
            }
            i4++;
        }
        int i6 = i5 + 1;
        long[] jArr = new long[i6];
        Object[] objArr2 = new Object[i6];
        if (i6 > 1) {
            int i7 = 0;
            while (true) {
                if (i3 >= i6 || i7 >= i2) {
                    break;
                }
                long j = this.keys[i7];
                Object obj = this.values[i7];
                if (j > key) {
                    jArr[i3] = key;
                    objArr2[i3] = value;
                    i3++;
                    break;
                }
                if (obj != null) {
                    jArr[i3] = j;
                    objArr2[i3] = obj;
                    i3++;
                }
                i7++;
            }
            if (i7 == i2) {
                int i8 = i6 - 1;
                jArr[i8] = key;
                objArr2[i8] = value;
            } else {
                while (i3 < i6) {
                    long j2 = this.keys[i7];
                    Object obj2 = this.values[i7];
                    if (obj2 != null) {
                        jArr[i3] = j2;
                        objArr2[i3] = obj2;
                        i3++;
                    }
                    i7++;
                }
            }
        } else {
            jArr[0] = key;
            objArr2[0] = value;
        }
        return new ThreadMap(i6, jArr, objArr2);
    }

    public final boolean trySet(long key, Object value) {
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        this.values[iFind] = value;
        return true;
    }
}
