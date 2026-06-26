package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J/\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues) {
        m.h(paddingValues, "paddingValues");
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj2 : list2) {
            if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TextFieldId)) {
                int iIntValue = ((Number) pVar.invoke(obj2, Integer.valueOf(i2))).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable != null ? ((Number) pVar.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next2), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) pVar.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next3), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) pVar.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next4), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) next4;
                int iIntValue5 = intrinsicMeasurable4 != null ? ((Number) pVar.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it5 = list2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it5.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next5), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) next5;
                int iIntValue6 = intrinsicMeasurable5 != null ? ((Number) pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it6.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next6), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) next6;
                int iIntValue7 = intrinsicMeasurable6 != null ? ((Number) pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    Object next7 = it7.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next7), TextFieldImplKt.SupportingId)) {
                        obj = next7;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable7 = (IntrinsicMeasurable) obj;
                return TextFieldKt.m1681calculateHeightmKXJcVc(iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue7, intrinsicMeasurable7 != null ? ((Number) pVar.invoke(intrinsicMeasurable7, Integer.valueOf(i2))).intValue() : 0, this.animationProgress == 1.0f, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i2, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj2 : list2) {
            if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.TextFieldId)) {
                int iIntValue = ((Number) pVar.invoke(obj2, Integer.valueOf(i2))).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.LabelId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) next;
                int iIntValue2 = intrinsicMeasurable != null ? ((Number) pVar.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next2), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) next2;
                int iIntValue3 = intrinsicMeasurable2 != null ? ((Number) pVar.invoke(intrinsicMeasurable2, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next3), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) next3;
                int iIntValue4 = intrinsicMeasurable3 != null ? ((Number) pVar.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next4), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) next4;
                int iIntValue5 = intrinsicMeasurable4 != null ? ((Number) pVar.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it5 = list2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it5.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next5), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) next5;
                int iIntValue6 = intrinsicMeasurable5 != null ? ((Number) pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i2))).intValue() : 0;
                Iterator<T> it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next6 = it6.next();
                    if (m.c(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next6), TextFieldImplKt.PlaceholderId)) {
                        obj = next6;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                return TextFieldKt.m1682calculateWidthyeHjK3Y(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, intrinsicMeasurable6 != null ? ((Number) pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i2))).intValue() : 0, TextFieldImplKt.getZeroConstraints());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicHeight.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                m.h(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        return intrinsicWidth(list, i2, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicWidth.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                m.h(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo34measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Object next;
        Object next2;
        Object next3;
        Placeable placeable;
        Placeable placeableMo4235measureBRTryo0;
        Object next4;
        Object next5;
        Object obj;
        Object next6;
        m.h(measureScope, "$this$measure");
        m.h(list, "measurables");
        int iMo342roundToPx0680j_4 = measureScope.mo342roundToPx0680j_4(this.paddingValues.getTop());
        int iMo342roundToPx0680j_42 = measureScope.mo342roundToPx0680j_4(this.paddingValues.getBottom());
        long jM5226copyZbe2FdA$default = Constraints.m5226copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m.c(LayoutIdKt.getLayoutId((Measurable) next), TextFieldImplKt.LeadingId)) {
                break;
            }
        }
        Measurable measurable = (Measurable) next;
        Placeable placeableMo4235measureBRTryo02 = measurable != null ? measurable.mo4235measureBRTryo0(jM5226copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo4235measureBRTryo02) + 0;
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo02));
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (m.c(LayoutIdKt.getLayoutId((Measurable) next2), TextFieldImplKt.TrailingId)) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) next2;
        Placeable placeableMo4235measureBRTryo03 = measurable2 != null ? measurable2.mo4235measureBRTryo0(ConstraintsKt.m5252offsetNN6EwU$default(jM5226copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo4235measureBRTryo03) + iWidthOrZero;
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo03));
        Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (m.c(LayoutIdKt.getLayoutId((Measurable) next3), TextFieldImplKt.PrefixId)) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) next3;
        if (measurable3 != null) {
            placeable = placeableMo4235measureBRTryo02;
            placeableMo4235measureBRTryo0 = measurable3.mo4235measureBRTryo0(ConstraintsKt.m5252offsetNN6EwU$default(jM5226copyZbe2FdA$default, -iWidthOrZero2, 0, 2, null));
        } else {
            placeable = placeableMo4235measureBRTryo02;
            placeableMo4235measureBRTryo0 = null;
        }
        int iWidthOrZero3 = TextFieldImplKt.widthOrZero(placeableMo4235measureBRTryo0) + iWidthOrZero2;
        int iMax3 = Math.max(iMax2, TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo0));
        Iterator<T> it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
            if (m.c(LayoutIdKt.getLayoutId((Measurable) next4), TextFieldImplKt.SuffixId)) {
                break;
            }
        }
        Measurable measurable4 = (Measurable) next4;
        Placeable placeableMo4235measureBRTryo04 = measurable4 != null ? measurable4.mo4235measureBRTryo0(ConstraintsKt.m5252offsetNN6EwU$default(jM5226copyZbe2FdA$default, -iWidthOrZero3, 0, 2, null)) : null;
        int iWidthOrZero4 = TextFieldImplKt.widthOrZero(placeableMo4235measureBRTryo04) + iWidthOrZero3;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo04));
        int i2 = -iWidthOrZero4;
        long jM5251offsetNN6EwU = ConstraintsKt.m5251offsetNN6EwU(jM5226copyZbe2FdA$default, i2, -iMo342roundToPx0680j_42);
        Iterator it5 = list2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it5.next();
            Iterator it6 = it5;
            if (m.c(LayoutIdKt.getLayoutId((Measurable) next5), TextFieldImplKt.LabelId)) {
                break;
            }
            it5 = it6;
        }
        Measurable measurable5 = (Measurable) next5;
        Placeable placeableMo4235measureBRTryo05 = measurable5 != null ? measurable5.mo4235measureBRTryo0(jM5251offsetNN6EwU) : null;
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo05) + iMo342roundToPx0680j_4;
        long jM5251offsetNN6EwU2 = ConstraintsKt.m5251offsetNN6EwU(Constraints.m5226copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i2, (-iHeightOrZero) - iMo342roundToPx0680j_42);
        Iterator it7 = list2.iterator();
        while (true) {
            final int i3 = iMo342roundToPx0680j_4;
            if (!it7.hasNext()) {
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            Measurable measurable6 = (Measurable) it7.next();
            Iterator it8 = it7;
            if (m.c(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.TextFieldId)) {
                final Placeable placeableMo4235measureBRTryo06 = measurable6.mo4235measureBRTryo0(jM5251offsetNN6EwU2);
                long jM5226copyZbe2FdA$default2 = Constraints.m5226copyZbe2FdA$default(jM5251offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next7 = it9.next();
                    Iterator it10 = it9;
                    if (m.c(LayoutIdKt.getLayoutId((Measurable) next7), TextFieldImplKt.PlaceholderId)) {
                        obj = next7;
                        break;
                    }
                    it9 = it10;
                }
                Measurable measurable7 = (Measurable) obj;
                Placeable placeableMo4235measureBRTryo07 = measurable7 != null ? measurable7.mo4235measureBRTryo0(jM5226copyZbe2FdA$default2) : null;
                long jM5226copyZbe2FdA$default3 = Constraints.m5226copyZbe2FdA$default(ConstraintsKt.m5252offsetNN6EwU$default(jM5226copyZbe2FdA$default, 0, -Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo06), TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo07)) + iHeightOrZero + iMo342roundToPx0680j_42), 1, null), 0, 0, 0, 0, 11, null);
                Iterator<T> it11 = list2.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it11.next();
                    if (m.c(LayoutIdKt.getLayoutId((Measurable) next6), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                }
                Measurable measurable8 = (Measurable) next6;
                Placeable placeableMo4235measureBRTryo08 = measurable8 != null ? measurable8.mo4235measureBRTryo0(jM5226copyZbe2FdA$default3) : null;
                int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo08);
                final int iM1682calculateWidthyeHjK3Y = TextFieldKt.m1682calculateWidthyeHjK3Y(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeableMo4235measureBRTryo03), TextFieldImplKt.widthOrZero(placeableMo4235measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo4235measureBRTryo04), placeableMo4235measureBRTryo06.getWidth(), TextFieldImplKt.widthOrZero(placeableMo4235measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo4235measureBRTryo07), j);
                final int iM1681calculateHeightmKXJcVc = TextFieldKt.m1681calculateHeightmKXJcVc(placeableMo4235measureBRTryo06.getHeight(), TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo05), TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo03), TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo04), TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo07), TextFieldImplKt.heightOrZero(placeableMo4235measureBRTryo08), this.animationProgress == 1.0f, j, measureScope.getDensity(), this.paddingValues);
                int i4 = iM1681calculateHeightmKXJcVc - iHeightOrZero2;
                for (Measurable measurable9 : list2) {
                    if (m.c(LayoutIdKt.getLayoutId(measurable9), TextFieldImplKt.ContainerId)) {
                        final Placeable placeableMo4235measureBRTryo09 = measurable9.mo4235measureBRTryo0(ConstraintsKt.Constraints(iM1682calculateWidthyeHjK3Y != Integer.MAX_VALUE ? iM1682calculateWidthyeHjK3Y : 0, iM1682calculateWidthyeHjK3Y, i4 != Integer.MAX_VALUE ? i4 : 0, i4));
                        final Placeable placeable2 = placeableMo4235measureBRTryo05;
                        final Placeable placeable3 = placeableMo4235measureBRTryo07;
                        final Placeable placeable4 = placeable;
                        final Placeable placeable5 = placeableMo4235measureBRTryo03;
                        final Placeable placeable6 = placeableMo4235measureBRTryo0;
                        final Placeable placeable7 = placeableMo4235measureBRTryo04;
                        final Placeable placeable8 = placeableMo4235measureBRTryo08;
                        return MeasureScope.CC.p(measureScope, iM1682calculateWidthyeHjK3Y, iM1681calculateHeightmKXJcVc, null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Placeable.PlacementScope) obj2);
                                return j.a;
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                m.h(placementScope, "$this$layout");
                                Placeable placeable9 = placeable2;
                                if (placeable9 == null) {
                                    TextFieldKt.placeWithoutLabel(placementScope, iM1682calculateWidthyeHjK3Y, iM1681calculateHeightmKXJcVc, placeableMo4235measureBRTryo06, placeable3, placeable4, placeable5, placeable6, placeable7, placeableMo4235measureBRTryo09, placeable8, this.singleLine, measureScope.getDensity(), this.paddingValues);
                                    return;
                                }
                                int i5 = iM1682calculateWidthyeHjK3Y;
                                int i6 = iM1681calculateHeightmKXJcVc;
                                Placeable placeable10 = placeableMo4235measureBRTryo06;
                                Placeable placeable11 = placeable3;
                                Placeable placeable12 = placeable4;
                                Placeable placeable13 = placeable5;
                                Placeable placeable14 = placeable6;
                                Placeable placeable15 = placeable7;
                                Placeable placeable16 = placeableMo4235measureBRTryo09;
                                Placeable placeable17 = placeable8;
                                boolean z = this.singleLine;
                                int i7 = i3;
                                TextFieldKt.placeWithLabel(placementScope, i5, i6, placeable10, placeable9, placeable11, placeable12, placeable13, placeable14, placeable15, placeable16, placeable17, z, i7, placeable2.getHeight() + i7, this.animationProgress, measureScope.getDensity());
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it7 = it8;
            iMo342roundToPx0680j_4 = i3;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicHeight.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                m.h(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(list, "measurables");
        return intrinsicWidth(list, i2, new p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicWidth.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                m.h(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
            }
        });
    }
}
