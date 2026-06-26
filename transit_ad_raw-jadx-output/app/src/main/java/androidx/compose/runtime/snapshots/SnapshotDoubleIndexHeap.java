package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.collections.n;

/* JADX INFO: compiled from: SnapshotDoubleIndexHeap.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002R$\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006\""}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "", "index", "Lkotlin/j;", "shiftUp", "shiftDown", "a", "b", "swap", "atLeast", "ensure", "allocateHandle", "handle", "freeHandle", "default", "lowestOrDefault", "value", "add", "remove", "validate", "validateHandle", "<set-?>", "size", "I", "getSize", "()I", "", "values", "[I", "handles", "firstFreeHandle", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class SnapshotDoubleIndexHeap {
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private int[] values = new int[16];
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i2 = length * 2;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                iArr[i3] = i4;
                i3 = i4;
            }
            n.q0(this.handles, iArr, 0, 0, 14);
            this.handles = iArr;
        }
        int i5 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i5];
        return i5;
    }

    private final void ensure(int i2) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (i2 <= length) {
            return;
        }
        int i3 = length * 2;
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        n.q0(iArr, iArr2, 0, 0, 14);
        n.q0(this.index, iArr3, 0, 0, 14);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final void freeHandle(int i2) {
        this.handles[i2] = this.firstFreeHandle;
        this.firstFreeHandle = i2;
    }

    public static /* synthetic */ int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(i2);
    }

    private final void shiftDown(int i2) {
        int i3;
        int[] iArr = this.values;
        int i4 = this.size >> 1;
        while (i2 < i4) {
            int i5 = (i2 + 1) << 1;
            int i6 = i5 - 1;
            if (i5 >= this.size || (i3 = iArr[i5]) >= iArr[i6]) {
                if (iArr[i6] >= iArr[i2]) {
                    return;
                }
                swap(i6, i2);
                i2 = i6;
            } else {
                if (i3 >= iArr[i2]) {
                    return;
                }
                swap(i5, i2);
                i2 = i5;
            }
        }
    }

    private final void shiftUp(int i2) {
        int[] iArr = this.values;
        int i3 = iArr[i2];
        while (i2 > 0) {
            int i4 = ((i2 + 1) >> 1) - 1;
            if (iArr[i4] <= i3) {
                return;
            }
            swap(i4, i2);
            i2 = i4;
        }
    }

    private final void swap(int i2, int i3) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
        int i5 = iArr2[i2];
        iArr2[i2] = iArr2[i3];
        iArr2[i3] = i5;
        iArr3[iArr2[i2]] = i2;
        iArr3[iArr2[i3]] = i3;
    }

    public final int add(int value) {
        ensure(this.size + 1);
        int i2 = this.size;
        this.size = i2 + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i2] = value;
        this.index[i2] = iAllocateHandle;
        this.handles[iAllocateHandle] = i2;
        shiftUp(i2);
        return iAllocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final int lowestOrDefault(int i2) {
        return this.size > 0 ? this.values[0] : i2;
    }

    public final void remove(int i2) {
        int i3 = this.handles[i2];
        swap(i3, this.size - 1);
        this.size--;
        shiftUp(i3);
        shiftDown(i3);
        freeHandle(i2);
    }

    public final void validate() {
        int i2 = this.size;
        int i3 = 1;
        while (i3 < i2) {
            int i4 = i3 + 1;
            int[] iArr = this.values;
            if (iArr[(i4 >> 1) - 1] > iArr[i3]) {
                throw new IllegalStateException(("Index " + i3 + " is out of place").toString());
            }
            i3 = i4;
        }
    }

    public final void validateHandle(int i2, int i3) {
        int i4 = this.handles[i2];
        if (this.index[i4] != i2) {
            throw new IllegalStateException(("Index for handle " + i2 + " is corrupted").toString());
        }
        if (this.values[i4] == i3) {
            return;
        }
        StringBuilder sbG = androidx.appcompat.view.menu.a.g("Value for handle ", i2, " was ");
        sbG.append(this.values[i4]);
        sbG.append(" but was supposed to be ");
        sbG.append(i3);
        throw new IllegalStateException(sbG.toString().toString());
    }
}
