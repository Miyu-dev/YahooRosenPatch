package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kj.p;
import kj.q;
import kj.s;
import kotlin.Metadata;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aa\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a.\u0010\u0019\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001aj\u0010\"\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0002\u001a@\u0010$\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\u001aZ\u0010&\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002\"\u001a\u0010*\u001a\u0004\u0018\u00010'*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u001a\u0010.\u001a\u00020+*\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u001a\u00102\u001a\u00020/*\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\"\u001a\u00105\u001a\u00020/*\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/j;", "arrangement", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy-TDGSqEk", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkj/s;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "MinIntrinsicWidthMeasureBlock", "MinIntrinsicHeightMeasureBlock", "MaxIntrinsicWidthMeasureBlock", "MaxIntrinsicHeightMeasureBlock", "children", "Lkotlin/Function2;", "intrinsicMainSize", "intrinsicCrossSize", "crossAxisAvailable", "mainAxisSpacing", "layoutOrientation", "intrinsicOrientation", "intrinsicSize", "mainAxisSize", "intrinsicMainAxisSize", "mainAxisAvailable", "intrinsicCrossAxisSize", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getRowColumnParentData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "rowColumnParentData", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "weight", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "fill", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final RowColumnParentData getRowColumnParentData(IntrinsicMeasurable intrinsicMeasurable) {
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar2, int i2, int i3) {
        int iMin = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(((Number) pVar.invoke(intrinsicMeasurable, Integer.MAX_VALUE)).intValue(), i2 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, ((Number) pVar2.invoke(intrinsicMeasurable, Integer.valueOf(iMin2))).intValue());
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        int iF0 = f == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : a.f.f0(Math.max(i2 - iMin, 0) / f);
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i5);
            float weight2 = getWeight(getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, ((Number) pVar2.invoke(intrinsicMeasurable2, Integer.valueOf(iF0 != Integer.MAX_VALUE ? a.f.f0(iF0 * weight2) : Integer.MAX_VALUE))).intValue());
            }
        }
        return iMax;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int iMax = 0;
        int i5 = 0;
        float f = 0.0f;
        while (true) {
            if (i4 >= size) {
                return ((list.size() - 1) * i3) + a.f.f0(iMax * f) + i5;
            }
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = getWeight(getRowColumnParentData(intrinsicMeasurable));
            int iIntValue = ((Number) pVar.invoke(intrinsicMeasurable, Integer.valueOf(i2))).intValue();
            if (weight == 0.0f) {
                i5 += iIntValue;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, a.f.f0(iIntValue / weight));
            }
            i4++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar2, int i2, int i3, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return layoutOrientation == layoutOrientation2 ? intrinsicMainAxisSize(list, pVar, i2, i3) : intrinsicCrossAxisSize(list, pVar2, pVar, i2, i3);
    }

    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    /* JADX INFO: renamed from: rowColumnMeasurePolicy-TDGSqEk, reason: not valid java name */
    public static final MeasurePolicy m482rowColumnMeasurePolicyTDGSqEk(final LayoutOrientation layoutOrientation, final s<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], kotlin.j> sVar, final float f, final SizeMode sizeMode, final CrossAxisAlignment crossAxisAlignment) {
        kotlin.jvm.internal.m.h(layoutOrientation, "orientation");
        kotlin.jvm.internal.m.h(sVar, "arrangement");
        kotlin.jvm.internal.m.h(sizeMode, "crossAxisSize");
        kotlin.jvm.internal.m.h(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
                kotlin.jvm.internal.m.h(list, "measurables");
                return ((Number) RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo342roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
                kotlin.jvm.internal.m.h(list, "measurables");
                return ((Number) RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo342roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo34measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
                int crossAxisSize;
                int mainAxisSize;
                kotlin.jvm.internal.m.h(measureScope, "$this$measure");
                kotlin.jvm.internal.m.h(list, "measurables");
                final RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(layoutOrientation, sVar, f, sizeMode, crossAxisAlignment, list, new Placeable[list.size()], null);
                final RowColumnMeasureHelperResult rowColumnMeasureHelperResultM484measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m484measureWithoutPlacing_EkL_Y(measureScope, j, 0, list.size());
                if (layoutOrientation == LayoutOrientation.Horizontal) {
                    crossAxisSize = rowColumnMeasureHelperResultM484measureWithoutPlacing_EkL_Y.getMainAxisSize();
                    mainAxisSize = rowColumnMeasureHelperResultM484measureWithoutPlacing_EkL_Y.getCrossAxisSize();
                } else {
                    crossAxisSize = rowColumnMeasureHelperResultM484measureWithoutPlacing_EkL_Y.getCrossAxisSize();
                    mainAxisSize = rowColumnMeasureHelperResultM484measureWithoutPlacing_EkL_Y.getMainAxisSize();
                }
                return MeasureScope.CC.p(measureScope, crossAxisSize, mainAxisSize, null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return kotlin.j.a;
                    }

                    public final void invoke(Placeable.PlacementScope placementScope) {
                        kotlin.jvm.internal.m.h(placementScope, "$this$layout");
                        rowColumnMeasurementHelper.placeHelper(placementScope, rowColumnMeasureHelperResultM484measureWithoutPlacing_EkL_Y, 0, measureScope.getLayoutDirection());
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
                kotlin.jvm.internal.m.h(list, "measurables");
                return ((Number) RowColumnImplKt.MinIntrinsicHeightMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo342roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
                kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
                kotlin.jvm.internal.m.h(list, "measurables");
                return ((Number) RowColumnImplKt.MinIntrinsicWidthMeasureBlock(layoutOrientation).invoke(list, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo342roundToPx0680j_4(f)))).intValue();
            }
        };
    }
}
