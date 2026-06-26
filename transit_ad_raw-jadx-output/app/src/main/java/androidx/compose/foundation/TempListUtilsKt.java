package androidx.compose.foundation;

import java.util.ArrayList;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TempListUtils.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aV\u0010\n\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\n\u0010\u000b\u001aO\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aT\u0010\u0011\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"T", "", "Lkotlin/Function1;", "", "predicate", "fastFilter", "R", "initial", "Lkotlin/Function2;", "operation", "fastFold", "(Ljava/util/List;Ljava/lang/Object;Lkj/p;)Ljava/lang/Object;", "", "transform", "fastMapIndexedNotNull", "", "selector", "fastMaxOfOrNull", "(Ljava/util/List;Lkj/l;)Ljava/lang/Comparable;", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class TempListUtilsKt {
    public static final <T> List<T> fastFilter(List<? extends T> list, l<? super T, Boolean> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (((Boolean) lVar.invoke(t)).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r, p<? super R, ? super T, ? extends R> pVar) {
        m.h(list, "<this>");
        m.h(pVar, "operation");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            r = (R) pVar.invoke(r, list.get(i2));
        }
        return r;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, p<? super Integer, ? super T, ? extends R> pVar) {
        m.h(list, "<this>");
        m.h(pVar, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object objInvoke = pVar.invoke(Integer.valueOf(i2), list.get(i2));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, l<? super T, ? extends R> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "selector");
        if (list.isEmpty()) {
            return null;
        }
        R r = (R) lVar.invoke(list.get(0));
        int I = a.f.I(list);
        int i2 = 1;
        if (1 <= I) {
            while (true) {
                Comparable comparable = (Comparable) lVar.invoke(list.get(i2));
                if (comparable.compareTo(r) > 0) {
                    r = (R) comparable;
                }
                if (i2 == I) {
                    break;
                }
                i2++;
            }
        }
        return (R) r;
    }
}
