package androidx.compose.runtime.collection;

import android.util.SparseArray;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ActualIntMap.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0017\u0010\u0018B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u001aJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/collection/IntMap;", "E", "", "", "key", "", "contains", "get", "(I)Ljava/lang/Object;", "valueIfAbsent", "(ILjava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlin/j;", "set", "(ILjava/lang/Object;)V", "remove", "clear", "Landroid/util/SparseArray;", "sparseArray", "Landroid/util/SparseArray;", "getSize", "()I", "size", "<init>", "(Landroid/util/SparseArray;)V", "initialCapacity", "(I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class IntMap<E> {
    private final SparseArray<E> sparseArray;

    private IntMap(SparseArray<E> sparseArray) {
        this.sparseArray = sparseArray;
    }

    public final void clear() {
        this.sparseArray.clear();
    }

    public final boolean contains(int key) {
        return this.sparseArray.indexOfKey(key) >= 0;
    }

    public final E get(int key) {
        return this.sparseArray.get(key);
    }

    public final int getSize() {
        return this.sparseArray.size();
    }

    public final void remove(int i2) {
        this.sparseArray.remove(i2);
    }

    public final void set(int key, E value) {
        this.sparseArray.put(key, value);
    }

    public final E get(int key, E valueIfAbsent) {
        return this.sparseArray.get(key, valueIfAbsent);
    }

    public IntMap(int i2) {
        this(new SparseArray(i2));
    }

    public /* synthetic */ IntMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i2);
    }
}
