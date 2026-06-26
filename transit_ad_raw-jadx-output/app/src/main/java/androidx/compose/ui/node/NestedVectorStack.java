package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NestedVectorStack.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/NestedVectorStack;", "T", "", "", "value", "Lkotlin/j;", "pushIndex", "", "isNotEmpty", "pop", "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "push", "current", "I", "lastIndex", "", "indexes", "[I", "vectors", "Landroidx/compose/runtime/collection/MutableVector;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class NestedVectorStack<T> {
    private int lastIndex;
    private int current = -1;
    private int[] indexes = new int[16];
    private final MutableVector<MutableVector<T>> vectors = new MutableVector<>(new MutableVector[16], 0);

    private final void pushIndex(int i2) {
        int i3 = this.lastIndex;
        int[] iArr = this.indexes;
        if (i3 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            m.g(iArrCopyOf, "copyOf(this, newSize)");
            this.indexes = iArrCopyOf;
        }
        int[] iArr2 = this.indexes;
        int i4 = this.lastIndex;
        this.lastIndex = i4 + 1;
        iArr2[i4] = i2;
    }

    public final boolean isNotEmpty() {
        int i2 = this.current;
        return i2 >= 0 && this.indexes[i2] >= 0;
    }

    public final T pop() {
        int i2 = this.current;
        int i3 = this.indexes[i2];
        MutableVector<T> mutableVector = this.vectors.getContent()[i2];
        if (i3 > 0) {
            this.indexes[i2] = r3[i2] - 1;
        } else if (i3 == 0) {
            this.vectors.removeAt(i2);
            this.current--;
        }
        return mutableVector.getContent()[i3];
    }

    public final void push(MutableVector<T> mutableVector) {
        m.h(mutableVector, "vector");
        if (mutableVector.isNotEmpty()) {
            this.vectors.add(mutableVector);
            pushIndex(mutableVector.getSize() - 1);
            this.current++;
        }
    }
}
