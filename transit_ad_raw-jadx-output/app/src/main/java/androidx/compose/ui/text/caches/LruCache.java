package androidx.compose.ui.text.caches;

import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kj.a;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0017\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\rJ1\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0019\u0010\bJ\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 J\b\u0010#\u001a\u00020\"H\u0016J'\u0010)\u001a\u00028\u0002\"\u0004\b\u0002\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00020%H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00103\u001a\u0012\u0012\u0004\u0012\u00028\u000001j\b\u0012\u0004\u0012\u00028\u0000`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00107R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00107R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00107R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"Landroidx/compose/ui/text/caches/LruCache;", "K", "V", "", "key", "value", "", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "maxSize", "Lkotlin/j;", "resize", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "evictAll", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "", "toString", "R", "Lkotlin/Function0;", "block", "synchronizedValue$ui_text_release", "(Lkj/a;)Ljava/lang/Object;", "synchronizedValue", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "monitor", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "keySet", "Ljava/util/LinkedHashSet;", "<set-?>", "size", "I", "()I", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashSet<K> keySet;
    private final HashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private final SynchronizedObject monitor = Synchronization_jvmKt.createSynchronizedObject();
    private int putCount;
    private int size;

    public LruCache(int i2) {
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.maxSize = i2;
        this.map = new HashMap<>(0, 0.75f);
        this.keySet = new LinkedHashSet<>();
    }

    private final int safeSizeOf(K key, V value) {
        int iSizeOf = sizeOf(key, value);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + key + '=' + value).toString());
    }

    public V create(K key) {
        return null;
    }

    public final int createCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.createCount;
        }
        return i2;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.evictionCount;
        }
        return i2;
    }

    public final V get(K key) {
        synchronized (this.monitor) {
            V v = this.map.get(key);
            if (v != null) {
                this.keySet.remove(key);
                this.keySet.add(key);
                this.hitCount++;
                return v;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.monitor) {
                this.createCount++;
                V vPut = this.map.put(key, vCreate);
                this.keySet.remove(key);
                this.keySet.add(key);
                if (vPut != null) {
                    this.map.put(key, vPut);
                    v = vPut;
                } else {
                    this.size = size() + safeSizeOf(key, vCreate);
                }
                j jVar = j.a;
            }
            if (v != null) {
                entryRemoved(false, key, vCreate, v);
                return v;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.missCount;
        }
        return i2;
    }

    public final V put(K key, V value) {
        V vPut;
        if (key == null || value == null) {
            throw null;
        }
        synchronized (this.monitor) {
            this.putCount++;
            this.size = size() + safeSizeOf(key, value);
            vPut = this.map.put(key, value);
            if (vPut != null) {
                this.size = size() - safeSizeOf(key, vPut);
            }
            if (this.keySet.contains(key)) {
                this.keySet.remove(key);
            }
            this.keySet.add(key);
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final int putCount() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.putCount;
        }
        return i2;
    }

    public final V remove(K key) {
        V vRemove;
        key.getClass();
        synchronized (this.monitor) {
            vRemove = this.map.remove(key);
            this.keySet.remove(key);
            if (vRemove != null) {
                this.size = size() - safeSizeOf(key, vRemove);
            }
            j jVar = j.a;
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i2) {
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        synchronized (this.monitor) {
            this.maxSize = i2;
            j jVar = j.a;
        }
        trimToSize(i2);
    }

    public final int size() {
        int i2;
        synchronized (this.monitor) {
            i2 = this.size;
        }
        return i2;
    }

    public int sizeOf(K key, V value) {
        return 1;
    }

    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            linkedHashMap = new LinkedHashMap();
            for (K k : this.keySet) {
                V v = this.map.get(k);
                m.e(v);
                linkedHashMap.put(k, v);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(a<? extends R> block) {
        R r;
        m.h(block, "block");
        synchronized (this.monitor) {
            r = (R) block.invoke();
        }
        return r;
    }

    public String toString() {
        String str;
        synchronized (this.monitor) {
            int i2 = this.hitCount;
            int i3 = this.missCount + i2;
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r7.monitor
            monitor-enter(r0)
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L8f
            if (r1 < 0) goto L86
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L17
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L86
        L17:
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8f
            java.util.LinkedHashSet<K> r2 = r7.keySet     // Catch: java.lang.Throwable -> L8f
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8f
            if (r1 != r2) goto L86
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L8f
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L71
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L71
            java.util.LinkedHashSet<K> r1 = r7.keySet     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r1 = kotlin.collections.y.q1(r1)     // Catch: java.lang.Throwable -> L8f
            java.util.HashMap<K, V> r4 = r7.map     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L68
            java.util.HashMap<K, V> r5 = r7.map     // Catch: java.lang.Throwable -> L8f
            kotlin.jvm.internal.v.c(r5)     // Catch: java.lang.Throwable -> L8f
            r5.remove(r1)     // Catch: java.lang.Throwable -> L8f
            java.util.LinkedHashSet<K> r5 = r7.keySet     // Catch: java.lang.Throwable -> L8f
            java.util.Collection r5 = kotlin.jvm.internal.v.a(r5)     // Catch: java.lang.Throwable -> L8f
            r5.remove(r1)     // Catch: java.lang.Throwable -> L8f
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L8f
            kotlin.jvm.internal.m.e(r1)     // Catch: java.lang.Throwable -> L8f
            int r6 = r7.safeSizeOf(r1, r4)     // Catch: java.lang.Throwable -> L8f
            int r5 = r5 - r6
            r7.size = r5     // Catch: java.lang.Throwable -> L8f
            int r5 = r7.evictionCount     // Catch: java.lang.Throwable -> L8f
            int r5 = r5 + r2
            r7.evictionCount = r5     // Catch: java.lang.Throwable -> L8f
            goto L73
        L68:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L8f
            throw r8     // Catch: java.lang.Throwable -> L8f
        L71:
            r1 = r3
            r4 = r1
        L73:
            kotlin.j r5 = kotlin.j.a     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r0)
            if (r1 != 0) goto L7b
            if (r4 != 0) goto L7b
            return
        L7b:
            kotlin.jvm.internal.m.e(r1)
            kotlin.jvm.internal.m.e(r4)
            r7.entryRemoved(r2, r1, r4, r3)
            goto L0
        L86:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L8f
            throw r8     // Catch: java.lang.Throwable -> L8f
        L8f:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.caches.LruCache.trimToSize(int):void");
    }

    public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
    }
}
