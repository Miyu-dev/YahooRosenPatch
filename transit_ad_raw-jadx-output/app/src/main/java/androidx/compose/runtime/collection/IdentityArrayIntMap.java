package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import kj.p;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: IdentityArrayIntMap.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010\u001bJ\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002J\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001J&\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rH\u0086\bø\u0001\u0000J&\u0010\u0011\u001a\u00020\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rH\u0086\bø\u0001\u0000J&\u0010\u0013\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\rH\u0086\bø\u0001\u0000R(\u0010\u0014\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u001b\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010%\u001a\u00020$8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010\u001b\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "key", "", "find", "midIndex", "value", "valueHash", "findExactIndex", "get", "add", "", "remove", "Lkotlin/Function2;", "predicate", "Lkotlin/j;", "removeValueIf", "any", "block", "forEach", "size", "I", "getSize", "()I", "setSize", "(I)V", "getSize$annotations", "()V", "", "keys", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "setKeys", "([Ljava/lang/Object;)V", "getKeys$annotations", "", "values", "[I", "getValues", "()[I", "setValues", "([I)V", "getValues$annotations", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class IdentityArrayIntMap {
    private int size;
    private Object[] keys = new Object[4];
    private int[] values = new int[4];

    private final int find(Object key) {
        int i2 = this.size - 1;
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(key);
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            Object obj = this.keys[i4];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i3 = i4 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    return obj == key ? i4 : findExactIndex(i4, key, iIdentityHashCode);
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        return -(r3 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findExactIndex(int r3, java.lang.Object r4, int r5) {
        /*
            r2 = this;
            int r0 = r3 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L16
            java.lang.Object[] r1 = r2.keys
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return r0
        Lc:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r5) goto L13
            goto L16
        L13:
            int r0 = r0 + (-1)
            goto L2
        L16:
            int r3 = r3 + 1
            int r0 = r2.size
        L1a:
            if (r3 >= r0) goto L30
            java.lang.Object[] r1 = r2.keys
            r1 = r1[r3]
            if (r1 != r4) goto L23
            return r3
        L23:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r5) goto L2d
        L29:
            int r3 = r3 + 1
            int r3 = -r3
            return r3
        L2d:
            int r3 = r3 + 1
            goto L1a
        L30:
            int r3 = r2.size
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayIntMap.findExactIndex(int, java.lang.Object, int):int");
    }

    public final int add(Object key, int value) {
        int iFind;
        m.h(key, "key");
        if (this.size > 0) {
            iFind = find(key);
            if (iFind >= 0) {
                int[] iArr = this.values;
                int i2 = iArr[iFind];
                iArr[iFind] = value;
                return i2;
            }
        } else {
            iFind = -1;
        }
        int i3 = -(iFind + 1);
        int i4 = this.size;
        Object[] objArr = this.keys;
        if (i4 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i5 = i3 + 1;
            n.o0(objArr, objArr2, i5, i3, i4);
            n.l0(i5, i3, this.size, this.values, iArr2);
            n.r0(this.keys, objArr2, 0, 0, i3, 6);
            n.q0(this.values, iArr2, 0, i3, 6);
            this.keys = objArr2;
            this.values = iArr2;
        } else {
            int i6 = i3 + 1;
            n.o0(objArr, objArr, i6, i3, i4);
            int[] iArr3 = this.values;
            n.l0(i6, i3, this.size, iArr3, iArr3);
        }
        this.keys[i3] = key;
        this.values[i3] = value;
        this.size++;
        return -1;
    }

    public final boolean any(p<Object, ? super Integer, Boolean> pVar) {
        m.h(pVar, "predicate");
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = getKeys()[i2];
            m.f(obj, "null cannot be cast to non-null type kotlin.Any");
            if (((Boolean) pVar.invoke(obj, Integer.valueOf(getValues()[i2]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void forEach(p<Object, ? super Integer, j> pVar) {
        m.h(pVar, "block");
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = getKeys()[i2];
            m.f(obj, "null cannot be cast to non-null type kotlin.Any");
            pVar.invoke(obj, Integer.valueOf(getValues()[i2]));
        }
    }

    public final int get(Object key) {
        m.h(key, "key");
        int iFind = find(key);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    public final int[] getValues() {
        return this.values;
    }

    public final boolean remove(Object key) {
        m.h(key, "key");
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        int i2 = this.size;
        if (iFind < i2 - 1) {
            Object[] objArr = this.keys;
            int i3 = iFind + 1;
            n.o0(objArr, objArr, iFind, i3, i2);
            int[] iArr = this.values;
            n.l0(iFind, i3, this.size, iArr, iArr);
        }
        int i4 = this.size - 1;
        this.size = i4;
        this.keys[i4] = null;
        return true;
    }

    public final void removeValueIf(p<Object, ? super Integer, Boolean> pVar) {
        m.h(pVar, "predicate");
        int size = getSize();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = getKeys()[i3];
            m.f(obj, "null cannot be cast to non-null type kotlin.Any");
            int i4 = getValues()[i3];
            if (!((Boolean) pVar.invoke(obj, Integer.valueOf(i4))).booleanValue()) {
                if (i2 != i3) {
                    getKeys()[i2] = obj;
                    getValues()[i2] = i4;
                }
                i2++;
            }
        }
        int size2 = getSize();
        for (int i5 = i2; i5 < size2; i5++) {
            getKeys()[i5] = null;
        }
        setSize(i2);
    }

    public final void setKeys(Object[] objArr) {
        m.h(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize(int i2) {
        this.size = i2;
    }

    public final void setValues(int[] iArr) {
        m.h(iArr, "<set-?>");
        this.values = iArr;
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }
}
