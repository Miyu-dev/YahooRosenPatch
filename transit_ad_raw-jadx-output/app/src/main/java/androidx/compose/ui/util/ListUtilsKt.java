package androidx.compose.ui.util;

import a.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ListUtils.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0005\u001a;\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a;\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aA\u0010\t\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a;\u0010\f\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a;\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aD\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aT\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u000f\u001ab\u0010\u001a\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0012\"\u0010\b\u0002\u0010\u0018*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0019\u001a\u00028\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"T", "", "Lkotlin/Function1;", "Lkotlin/j;", "action", "fastForEach", "fastForEachReversed", "Lkotlin/Function2;", "", "fastForEachIndexed", "", "predicate", "fastAll", "fastAny", "fastFirstOrNull", "(Ljava/util/List;Lkj/l;)Ljava/lang/Object;", "selector", "fastSumBy", "R", "transform", "fastMap", "", "fastMaxBy", "", "C", "destination", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lkj/l;)Ljava/util/Collection;", "ui-util_release"}, k = 2, mv = {1, 8, 0})
public final class ListUtilsKt {
    public static final <T> boolean fastAll(List<? extends T> list, l<? super T, Boolean> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "predicate");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((Boolean) lVar.invoke(list.get(i2))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, l<? super T, Boolean> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "predicate");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Boolean) lVar.invoke(list.get(i2))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> T fastFirstOrNull(List<? extends T> list, l<? super T, Boolean> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "predicate");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (((Boolean) lVar.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <T> void fastForEach(List<? extends T> list, l<? super T, j> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "action");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(list.get(i2));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, p<? super Integer, ? super T, j> pVar) {
        m.h(list, "<this>");
        m.h(pVar, "action");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(i2), list.get(i2));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, l<? super T, j> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "action");
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            lVar.invoke(list.get(size));
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, l<? super T, ? extends R> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(lVar.invoke(list.get(i2)));
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c2, l<? super T, ? extends R> lVar) {
        m.h(list, "<this>");
        m.h(c2, "destination");
        m.h(lVar, "transform");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c2.add(lVar.invoke(list.get(i2)));
        }
        return c2;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> list, l<? super T, ? extends R> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "selector");
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        Comparable comparable = (Comparable) lVar.invoke(t);
        int I = f.I(list);
        int i2 = 1;
        if (1 <= I) {
            while (true) {
                T t2 = list.get(i2);
                Comparable comparable2 = (Comparable) lVar.invoke(t2);
                if (comparable.compareTo(comparable2) < 0) {
                    t = t2;
                    comparable = comparable2;
                }
                if (i2 == I) {
                    break;
                }
                i2++;
            }
        }
        return t;
    }

    public static final <T> int fastSumBy(List<? extends T> list, l<? super T, Integer> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "selector");
        int size = list.size();
        int iIntValue = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iIntValue += ((Number) lVar.invoke(list.get(i2))).intValue();
        }
        return iIntValue;
    }
}
