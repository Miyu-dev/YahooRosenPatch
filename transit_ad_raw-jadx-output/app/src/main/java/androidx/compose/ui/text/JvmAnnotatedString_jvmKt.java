package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kj.l;
import kj.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.n0;
import kotlin.collections.p;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: JvmAnnotatedString.jvm.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a*\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "", "transform", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ranges", "Ljava/util/SortedSet;", TypedValues.AttributesType.S_TARGET, "Lkotlin/j;", "collectRangeTransitions", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class JvmAnnotatedString_jvmKt {
    private static final void collectRangeTransitions(List<? extends AnnotatedString.Range<?>> list, SortedSet<Integer> sortedSet) {
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnnotatedString.Range<?> range = list.get(i2);
                sortedSet.add(Integer.valueOf(range.getStart()));
                sortedSet.add(Integer.valueOf(range.getEnd()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AnnotatedString transform(final AnnotatedString annotatedString, final q<? super String, ? super Integer, ? super Integer, String> qVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        m.h(annotatedString, "<this>");
        m.h(qVar, "transform");
        Integer[] numArr = {0, Integer.valueOf(annotatedString.getText().length())};
        TreeSet treeSet = new TreeSet();
        p.S0(treeSet, numArr);
        collectRangeTransitions(annotatedString.getSpanStylesOrNull$ui_text_release(), treeSet);
        collectRangeTransitions(annotatedString.getParagraphStylesOrNull$ui_text_release(), treeSet);
        collectRangeTransitions(annotatedString.getAnnotations$ui_text_release(), treeSet);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final LinkedHashMap linkedHashMapO = i0.O(new Pair[]{new Pair(0, 0)});
        l<List<? extends Integer>, Integer> lVar = new l<List<? extends Integer>, Integer>() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final Integer invoke(List<Integer> list) {
                m.h(list, "<name for destructuring parameter 0>");
                int iIntValue = list.get(0).intValue();
                int iIntValue2 = list.get(1).intValue();
                objectRef.element = ((String) objectRef.element) + ((String) qVar.invoke(annotatedString.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
                return linkedHashMapO.put(Integer.valueOf(iIntValue2), Integer.valueOf(((String) objectRef.element).length()));
            }
        };
        n0.a(2, 1);
        if ((treeSet instanceof RandomAccess) && (treeSet instanceof List)) {
            List list = (List) treeSet;
            int size = list.size();
            ArrayList arrayList3 = new ArrayList((size / 1) + (size % 1 == 0 ? 0 : 1));
            j0 j0Var = new j0(list);
            int i2 = 0;
            while (true) {
                if (!(i2 >= 0 && i2 < size)) {
                    break;
                }
                int i3 = size - i2;
                if (2 <= i3) {
                    i3 = 2;
                }
                if (i3 < 2) {
                    break;
                }
                int i4 = i3 + i2;
                c.a aVar = c.Companion;
                int size2 = j0Var.a.size();
                aVar.getClass();
                c.a.c(i2, i4, size2);
                j0Var.b = i2;
                j0Var.c = i4 - i2;
                arrayList3.add(lVar.invoke(j0Var));
                i2++;
            }
        } else {
            ArrayList arrayList4 = new ArrayList();
            Iterator itB = n0.b(treeSet.iterator(), 2, 1, false, true);
            while (itB.hasNext()) {
                arrayList4.add(lVar.invoke((List) itB.next()));
            }
        }
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        ArrayList arrayList5 = null;
        if (spanStylesOrNull$ui_text_release != null) {
            arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
            int size3 = spanStylesOrNull$ui_text_release.size();
            for (int i5 = 0; i5 < size3; i5++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i5);
                SpanStyle item = range.getItem();
                Object obj = linkedHashMapO.get(Integer.valueOf(range.getStart()));
                m.e(obj);
                int iIntValue = ((Number) obj).intValue();
                Object obj2 = linkedHashMapO.get(Integer.valueOf(range.getEnd()));
                m.e(obj2);
                arrayList.add(new AnnotatedString.Range(item, iIntValue, ((Number) obj2).intValue()));
            }
        } else {
            arrayList = null;
        }
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release != null) {
            arrayList2 = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
            int size4 = paragraphStylesOrNull$ui_text_release.size();
            for (int i6 = 0; i6 < size4; i6++) {
                AnnotatedString.Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i6);
                ParagraphStyle item2 = range2.getItem();
                Object obj3 = linkedHashMapO.get(Integer.valueOf(range2.getStart()));
                m.e(obj3);
                int iIntValue2 = ((Number) obj3).intValue();
                Object obj4 = linkedHashMapO.get(Integer.valueOf(range2.getEnd()));
                m.e(obj4);
                arrayList2.add(new AnnotatedString.Range(item2, iIntValue2, ((Number) obj4).intValue()));
            }
        } else {
            arrayList2 = null;
        }
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        if (annotations$ui_text_release != null) {
            arrayList5 = new ArrayList(annotations$ui_text_release.size());
            int size5 = annotations$ui_text_release.size();
            for (int i7 = 0; i7 < size5; i7++) {
                AnnotatedString.Range<? extends Object> range3 = annotations$ui_text_release.get(i7);
                Object item3 = range3.getItem();
                Object obj5 = linkedHashMapO.get(Integer.valueOf(range3.getStart()));
                m.e(obj5);
                int iIntValue3 = ((Number) obj5).intValue();
                Object obj6 = linkedHashMapO.get(Integer.valueOf(range3.getEnd()));
                m.e(obj6);
                arrayList5.add(new AnnotatedString.Range(item3, iIntValue3, ((Number) obj6).intValue()));
            }
        }
        return new AnnotatedString((String) objectRef.element, arrayList, arrayList2, arrayList5);
    }
}
