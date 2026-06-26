package androidx.compose.ui.text.android;

import a.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TempListUtils.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001ab\u0010\u000b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006\"\u0010\b\u0002\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\t\u001a\u00028\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"T", "", "Lkotlin/Function1;", "Lkotlin/j;", "action", "fastForEach", "R", "", "C", "destination", "transform", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lkj/l;)Ljava/util/Collection;", "Lkotlin/Function2;", "fastZipWithNext", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class TempListUtilsKt {
    public static final <T> void fastForEach(List<? extends T> list, l<? super T, j> lVar) {
        m.h(list, "<this>");
        m.h(lVar, "action");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(list.get(i2));
        }
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

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, p<? super T, ? super T, ? extends R> pVar) {
        m.h(list, "<this>");
        m.h(pVar, "transform");
        if (list.size() == 0 || list.size() == 1) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        T t = list.get(0);
        int I = f.I(list);
        while (i2 < I) {
            i2++;
            T t2 = list.get(i2);
            arrayList.add(pVar.invoke(t, t2));
            t = t2;
        }
        return arrayList;
    }
}
