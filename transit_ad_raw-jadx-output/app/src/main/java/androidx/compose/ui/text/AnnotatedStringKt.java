package androidx.compose.ui.text;

import a.f;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kj.p;
import kj.q;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u001a \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a*\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a*\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a,\u0010\r\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001aF\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012 \b\u0004\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0080\bø\u0001\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u001a\u0014\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u001a\u0014\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u001a=\u0010\u001d\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\f*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010\u001d\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\f*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001f\u001aG\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\f*\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u001cH\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a?\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\f*\u00020\u001a2\u0006\u0010&\u001a\u00020%2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u001cH\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010'\u001a?\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\f*\u00020\u001a2\u0006\u0010)\u001a\u00020(2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00028\u00000\u001cH\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010*\u001aD\u0010,\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u000f2\u0016\u0010+\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\"\u00100\u001a\u00020\u00002\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\t2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u00100\u001a\u00020\u00002\u0006\u0010-\u001a\u00020 2\u0006\u0010/\u001a\u00020\u0001\u001a \u00103\u001a\u00020\u00002\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u0002010\u001cH\u0086\bø\u0001\u0000\u001a(\u00109\u001a\u0002082\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0000\u001a(\u0010>\u001a\u0002082\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0000\u001a\b\u0010?\u001a\u00020\u0000H\u0000\"\u0014\u0010@\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006B"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultParagraphStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "normalizedParagraphStyles", "", "start", "end", "Landroidx/compose/ui/text/SpanStyle;", "getLocalSpanStyles", "getLocalParagraphStyles", "", "getLocalAnnotations", "substringWithoutParagraphStyles", "T", "Lkotlin/Function2;", "block", "mapEachParagraphStyle", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "toUpperCase", "toLowerCase", "capitalize", "decapitalize", "R", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "style", "Lkotlin/Function1;", "withStyle", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkj/l;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkj/l;)Ljava/lang/Object;", "", "tag", "annotation", "withAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkj/l;)Ljava/lang/Object;", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkj/l;)Ljava/lang/Object;", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkj/l;)Ljava/lang/Object;", "ranges", "filterRanges", "text", "spanStyle", "paragraphStyle", "AnnotatedString", "Lkotlin/j;", "builder", "buildAnnotatedString", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "contains", "lStart", "lEnd", "rStart", "rEnd", "intersect", "emptyAnnotatedString", "EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        m.h(str, "text");
        m.h(spanStyle, "spanStyle");
        return new AnnotatedString(str, f.U(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? EmptyList.INSTANCE : f.U(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString buildAnnotatedString(l<? super AnnotatedString.Builder, j> lVar) {
        m.h(lVar, "builder");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        lVar.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        m.h(annotatedString, "<this>");
        m.h(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.capitalize.1
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                m.h(str, "str");
                if (i2 == 0) {
                    String strSubstring = str.substring(i2, i3);
                    m.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.capitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i2, i3);
                m.g(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i2, int i3, int i4, int i5) {
        if (i2 > i4 || i5 > i3) {
            return false;
        }
        if (i3 == i5) {
            if ((i4 == i5) != (i2 == i3)) {
                return false;
            }
        }
        return true;
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        m.h(annotatedString, "<this>");
        m.h(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.decapitalize.1
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                m.h(str, "str");
                if (i2 == 0) {
                    String strSubstring = str.substring(i2, i3);
                    m.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.decapitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i2, i3);
                m.g(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i2, int i3) {
        if (!(i2 <= i3)) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less than or equal to end (" + i3 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<? extends T> range = list.get(i4);
            AnnotatedString.Range<? extends T> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), Math.max(i2, range3.getStart()) - i2, Math.min(i3, range3.getEnd()) - i2, range3.getTag()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends Object>> getLocalAnnotations(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release;
        if (i2 == i3 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.getText().length()) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
        int size = annotations$ui_text_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<? extends Object> range = annotations$ui_text_release.get(i4);
            AnnotatedString.Range<? extends Object> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), a.l.i(range3.getStart(), i2, i3) - i2, a.l.i(range3.getEnd(), i2, i3) - i2, range3.getTag()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i2 == i3 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i4);
            AnnotatedString.Range<ParagraphStyle> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), a.l.i(range3.getStart(), i2, i3) - i2, a.l.i(range3.getEnd(), i2, i3) - i2));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<SpanStyle>> getLocalSpanStyles(AnnotatedString annotatedString, int i2, int i3) {
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release;
        if (i2 == i3 || (spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i2 == 0 && i3 >= annotatedString.getText().length()) {
            return spanStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
        int size = spanStylesOrNull$ui_text_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i4);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), a.l.i(range3.getStart(), i2, i3) - i2, a.l.i(range3.getEnd(), i2, i3) - i2));
        }
        return arrayList2;
    }

    public static final boolean intersect(int i2, int i3, int i4, int i5) {
        return Math.max(i2, i4) < Math.min(i3, i5) || contains(i2, i3, i4, i5) || contains(i4, i5, i2, i3);
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, p<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> pVar) {
        m.h(annotatedString, "<this>");
        m.h(paragraphStyle, "defaultParagraphStyle");
        m.h(pVar, "block");
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i2);
            arrayList.add(pVar.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        m.h(annotatedString, "<this>");
        m.h(paragraphStyle, "defaultParagraphStyle");
        int length = annotatedString.getText().length();
        EmptyList paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i2);
            ParagraphStyle paragraphStyleComponent1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            if (start != i3) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i3, start));
            }
            arrayList.add(new AnnotatedString.Range(paragraphStyle.merge(paragraphStyleComponent1), start, end));
            i2++;
            i3 = end;
        }
        if (i3 != length) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i3, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i2, int i3) {
        String strSubstring;
        if (i2 != i3) {
            strSubstring = annotatedString.getText().substring(i2, i3);
            m.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new AnnotatedString(strSubstring, getLocalSpanStyles(annotatedString, i2, i3), null, null, 12, null);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, final LocaleList localeList) {
        m.h(annotatedString, "<this>");
        m.h(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toLowerCase.1
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                m.h(str, "str");
                String strSubstring = str.substring(i2, i3);
                m.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toLowerCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, final LocaleList localeList) {
        m.h(annotatedString, "<this>");
        m.h(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toUpperCase.1
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i2, int i3) {
                m.h(str, "str");
                String strSubstring = str.substring(i2, i3);
                m.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toUpperCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        m.h(builder, "<this>");
        m.h(str, "tag");
        m.h(str2, "annotation");
        m.h(lVar, "block");
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return (R) lVar.invoke(builder);
        } finally {
            builder.pop(iPushStringAnnotation);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        m.h(builder, "<this>");
        m.h(spanStyle, "style");
        m.h(lVar, "block");
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return (R) lVar.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        m.h(builder, "<this>");
        m.h(ttsAnnotation, "ttsAnnotation");
        m.h(lVar, "block");
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return (R) lVar.invoke(builder);
        } finally {
            builder.pop(iPushTtsAnnotation);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        m.h(builder, "<this>");
        m.h(paragraphStyle, "style");
        m.h(lVar, "block");
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return (R) lVar.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        m.h(str, "text");
        m.h(paragraphStyle, "paragraphStyle");
        return new AnnotatedString(str, EmptyList.INSTANCE, f.U(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, l<? super AnnotatedString.Builder, ? extends R> lVar) {
        m.h(builder, "<this>");
        m.h(urlAnnotation, "urlAnnotation");
        m.h(lVar, "block");
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return (R) lVar.invoke(builder);
        } finally {
            builder.pop(iPushUrlAnnotation);
        }
    }
}
