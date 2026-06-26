package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0002J&\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u001e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\u000eJ\u0006\u0010\u001b\u001a\u00020\u0006R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Landroidx/compose/ui/node/IntStack;", "", "", "start", "end", "elSize", "Lkotlin/j;", "quickSort", "partition", "i", "j", "swapDiagonal", "a", "b", "", "compareDiagonal", "oldStart", "oldEnd", "newStart", "newEnd", "pushRange", "x", "y", "size", "pushDiagonal", "pop", "isNotEmpty", "sortDiagonals", "", "stack", "[I", "lastIndex", "I", "initialCapacity", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i2) {
        this.stack = new int[i2];
    }

    private final boolean compareDiagonal(int a2, int b) {
        int[] iArr = this.stack;
        int i2 = iArr[a2];
        int i3 = iArr[b];
        if (i2 >= i3) {
            return i2 == i3 && iArr[a2 + 1] <= iArr[b + 1];
        }
        return true;
    }

    private final int partition(int start, int end, int elSize) {
        int i2 = start - elSize;
        while (start < end) {
            if (compareDiagonal(start, end)) {
                i2 += elSize;
                swapDiagonal(i2, start);
            }
            start += elSize;
        }
        int i3 = i2 + elSize;
        swapDiagonal(i3, end);
        return i3;
    }

    private final void quickSort(int i2, int i3, int i4) {
        if (i2 < i3) {
            int iPartition = partition(i2, i3, i4);
            quickSort(i2, iPartition - i4, i4);
            quickSort(iPartition + i4, i3, i4);
        }
    }

    private final void swapDiagonal(int i2, int i3) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i2, i3);
        MyersDiffKt.swap(iArr, i2 + 1, i3 + 1);
        MyersDiffKt.swap(iArr, i2 + 2, i3 + 2);
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i2 = this.lastIndex - 1;
        this.lastIndex = i2;
        return iArr[i2];
    }

    public final void pushDiagonal(int i2, int i3, int i4) {
        int i5 = this.lastIndex;
        int i6 = i5 + 3;
        int[] iArr = this.stack;
        if (i6 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            m.g(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i5 + 0] = i2 + i4;
        iArr2[i5 + 1] = i3 + i4;
        iArr2[i5 + 2] = i4;
        this.lastIndex = i6;
    }

    public final void pushRange(int i2, int i3, int i4, int i5) {
        int i6 = this.lastIndex;
        int i7 = i6 + 4;
        int[] iArr = this.stack;
        if (i7 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            m.g(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i6 + 0] = i2;
        iArr2[i6 + 1] = i3;
        iArr2[i6 + 2] = i4;
        iArr2[i6 + 3] = i5;
        this.lastIndex = i7;
    }

    public final void sortDiagonals() {
        int i2 = this.lastIndex;
        if (!(i2 % 3 == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 > 3) {
            quickSort(0, i2 - 3, 3);
        }
    }
}
