package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: IdentityArrayMap.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0012\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010-\u001a\u00020\u0005¢\u0006\u0004\b.\u0010,J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0010J\u0006\u0010\u0016\u001a\u00020\u0012J&\u0010\u0019\u001a\u00020\u00122\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u0017H\u0086\bø\u0001\u0000J \u0010\u001b\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\u001aH\u0086\bø\u0001\u0000J&\u0010\u001c\u001a\u00020\u00122\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00120\u0017H\u0086\bø\u0001\u0000R*\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayMap;", "", "Key", "Value", "key", "", "find", "midIndex", "keyHash", "findExactIndex", "", "isEmpty", "isNotEmpty", "contains", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Lkotlin/j;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "remove", "clear", "Lkotlin/Function2;", "block", "removeIf", "Lkotlin/Function1;", "removeValueIf", "forEach", "", "keys", "[Ljava/lang/Object;", "getKeys$runtime_release", "()[Ljava/lang/Object;", "setKeys$runtime_release", "([Ljava/lang/Object;)V", "values", "getValues$runtime_release", "setValues$runtime_release", "size", "I", "getSize$runtime_release", "()I", "setSize$runtime_release", "(I)V", "capacity", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class IdentityArrayMap<Key, Value> {
    private Object[] keys;
    private int size;
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    private final int find(Object key) {
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(key);
        int i2 = this.size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            Object obj = this.keys[i4];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i3 = i4 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    return key == obj ? i4 : findExactIndex(i4, key, iIdentityHashCode);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayMap.findExactIndex(int, java.lang.Object, int):int");
    }

    public final void clear() {
        this.size = 0;
        n.x0(this.keys, (Symbol) null);
        n.x0(this.values, (Symbol) null);
    }

    public final boolean contains(Key key) {
        m.h(key, "key");
        return find(key) >= 0;
    }

    public final void forEach(p<? super Key, ? super Value, j> pVar) {
        m.h(pVar, "block");
        int size = getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = getKeys()[i2];
            m.f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            pVar.invoke(obj, getValues()[i2]);
        }
    }

    public final Value get(Key key) {
        m.h(key, "key");
        int iFind = find(key);
        if (iFind >= 0) {
            return (Value) this.values[iFind];
        }
        return null;
    }

    /* JADX INFO: renamed from: getKeys$runtime_release, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    /* JADX INFO: renamed from: getSize$runtime_release, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getValues$runtime_release, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final Value remove(Key key) {
        m.h(key, "key");
        int iFind = find(key);
        if (iFind < 0) {
            return null;
        }
        Object[] objArr = this.values;
        Value value = (Value) objArr[iFind];
        int i2 = this.size;
        Object[] objArr2 = this.keys;
        int i3 = iFind + 1;
        n.o0(objArr2, objArr2, iFind, i3, i2);
        n.o0(objArr, objArr, iFind, i3, i2);
        int i4 = i2 - 1;
        objArr2[i4] = null;
        objArr[i4] = null;
        this.size = i4;
        return value;
    }

    public final void removeIf(p<? super Key, ? super Value, Boolean> pVar) {
        m.h(pVar, "block");
        int size = getSize();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = getKeys()[i3];
            m.f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!((Boolean) pVar.invoke(obj, getValues()[i3])).booleanValue()) {
                if (i2 != i3) {
                    getKeys()[i2] = obj;
                    getValues()[i2] = getValues()[i3];
                }
                i2++;
            }
        }
        if (getSize() > i2) {
            int size2 = getSize();
            for (int i4 = i2; i4 < size2; i4++) {
                getKeys()[i4] = null;
                getValues()[i4] = null;
            }
            setSize$runtime_release(i2);
        }
    }

    public final void removeValueIf(l<? super Value, Boolean> lVar) {
        m.h(lVar, "block");
        int size = getSize();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = getKeys()[i3];
            m.f(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!((Boolean) lVar.invoke(getValues()[i3])).booleanValue()) {
                if (i2 != i3) {
                    getKeys()[i2] = obj;
                    getValues()[i2] = getValues()[i3];
                }
                i2++;
            }
        }
        if (getSize() > i2) {
            int size2 = getSize();
            for (int i4 = i2; i4 < size2; i4++) {
                getKeys()[i4] = null;
                getValues()[i4] = null;
            }
            setSize$runtime_release(i2);
        }
    }

    public final void set(Key key, Value value) {
        m.h(key, "key");
        int iFind = find(key);
        if (iFind >= 0) {
            this.values[iFind] = value;
            return;
        }
        int i2 = -(iFind + 1);
        int i3 = this.size;
        Object[] objArr = this.keys;
        boolean z = i3 == objArr.length;
        Object[] objArr2 = z ? new Object[i3 * 2] : objArr;
        int i4 = i2 + 1;
        n.o0(objArr, objArr2, i4, i2, i3);
        if (z) {
            n.r0(this.keys, objArr2, 0, 0, i2, 6);
        }
        objArr2[i2] = key;
        this.keys = objArr2;
        Object[] objArr3 = z ? new Object[this.size * 2] : this.values;
        n.o0(this.values, objArr3, i4, i2, this.size);
        if (z) {
            n.r0(this.values, objArr3, 0, 0, i2, 6);
        }
        objArr3[i2] = value;
        this.values = objArr3;
        this.size++;
    }

    public final void setKeys$runtime_release(Object[] objArr) {
        m.h(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize$runtime_release(int i2) {
        this.size = i2;
    }

    public final void setValues$runtime_release(Object[] objArr) {
        m.h(objArr, "<set-?>");
        this.values = objArr;
    }

    public IdentityArrayMap(int i2) {
        this.keys = new Object[i2];
        this.values = new Object[i2];
    }

    public /* synthetic */ IdentityArrayMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 16 : i2);
    }
}
