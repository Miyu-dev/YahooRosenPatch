package androidx.compose.runtime.collection;

import a.b;
import androidx.appcompat.widget.v;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a \u0010\u0007\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b\u001aC\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\f\u001a\u00020\u00012\u0014\b\b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086\b\u001a2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u00012\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"", "", "index", "Lkotlin/j;", "checkIndex", "fromIndex", "toIndex", "checkSubIndex", "T", "capacity", "Landroidx/compose/runtime/collection/MutableVector;", "MutableVector", "size", "Lkotlin/Function1;", "init", "mutableVectorOf", "", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class MutableVectorKt {
    public static final <T> MutableVector<T> MutableVector(int i2) {
        m.n();
        throw null;
    }

    public static MutableVector MutableVector$default(int i2, int i3, Object obj) {
        m.n();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i2) {
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            throw new IndexOutOfBoundsException(v.f("Index ", i2, " is out of bounds. The list has ", size, " elements."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i2, int i3) {
        int size = list.size();
        if (i2 > i3) {
            throw new IllegalArgumentException(v.f("Indices are out of order. fromIndex (", i2, ") is greater than toIndex (", i3, ")."));
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(b.e("fromIndex (", i2, ") is less than 0."));
        }
        if (i3 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is more than than the list size (" + size + ')');
    }

    public static final <T> MutableVector<T> mutableVectorOf() {
        m.n();
        throw null;
    }

    public static final <T> MutableVector<T> MutableVector(int i2, l<? super Integer, ? extends T> lVar) {
        m.h(lVar, "init");
        m.n();
        throw null;
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        m.h(tArr, "elements");
        return new MutableVector<>(tArr, tArr.length);
    }
}
