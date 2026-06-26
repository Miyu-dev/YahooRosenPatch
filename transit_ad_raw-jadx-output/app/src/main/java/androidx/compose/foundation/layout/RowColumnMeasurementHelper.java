package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kj.s;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RowColumnMeasurementHelper.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001Bt\u0012\u0006\u0010#\u001a\u00020\"\u0012*\u0010)\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0'\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010\u0013\u001a\u000202\u0012\u0006\u00107\u001a\u000206\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;\u0012\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0Aø\u0001\u0001¢\u0006\u0004\bH\u0010IJ(\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J2\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\n\u0010\u0012\u001a\u00020\u0002*\u00020\tJ\n\u0010\u0013\u001a\u00020\u0002*\u00020\tJ3\u0010\u001b\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R;\u0010)\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0'8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010.\u001a\u00020-8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0013\u001a\u0002028\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R\u0017\u00107\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001f\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/foundation/layout/RowColumnParentData;", "parentData", "crossAxisLayoutSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeCrossAxisAlignmentLine", "getCrossAxisPosition", "mainAxisSize", "crossAxisSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "startIndex", "endIndex", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "measureWithoutPlacing", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeableScope", "measureResult", "crossAxisOffset", "Lkotlin/j;", "placeHelper", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "Lkotlin/Function5;", "Landroidx/compose/ui/unit/Density;", "arrangement", "Lkj/s;", "getArrangement", "()Lkj/s;", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "F", "getArrangementSpacing-D9Ej5fM", "()F", "Landroidx/compose/foundation/layout/SizeMode;", "Landroidx/compose/foundation/layout/SizeMode;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Ljava/util/List;", "getMeasurables", "()Ljava/util/List;", "", "placeables", "[Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "[Landroidx/compose/foundation/layout/RowColumnParentData;", "<init>", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkj/s;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class RowColumnMeasurementHelper {
    private final s<Integer, int[], LayoutDirection, Density, int[], kotlin.j> arrangement;
    private final float arrangementSpacing;
    private final CrossAxisAlignment crossAxisAlignment;
    private final SizeMode crossAxisSize;
    private final List<Measurable> measurables;
    private final LayoutOrientation orientation;
    private final Placeable[] placeables;
    private final RowColumnParentData[] rowColumnParentData;

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, s sVar, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutOrientation, sVar, f, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData parentData, int crossAxisLayoutSize, LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
        CrossAxisAlignment crossAxisAlignment;
        if (parentData == null || (crossAxisAlignment = parentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int iCrossAxisSize = crossAxisLayoutSize - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(iCrossAxisSize, layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }

    private final int[] mainAxisPositions(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, MeasureScope measureScope) {
        this.arrangement.invoke(Integer.valueOf(mainAxisLayoutSize), childrenMainAxisSize, measureScope.getLayoutDirection(), measureScope, mainAxisPositions);
        return mainAxisPositions;
    }

    public final int crossAxisSize(Placeable placeable) {
        kotlin.jvm.internal.m.h(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    public final s<Integer, int[], LayoutDirection, Density, int[], kotlin.j> getArrangement() {
        return this.arrangement;
    }

    /* JADX INFO: renamed from: getArrangementSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getArrangementSpacing() {
        return this.arrangementSpacing;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    public final int mainAxisSize(Placeable placeable) {
        kotlin.jvm.internal.m.h(placeable, "<this>");
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    /* JADX INFO: renamed from: measureWithoutPlacing-_EkL_-Y, reason: not valid java name */
    public final RowColumnMeasureHelperResult m484measureWithoutPlacing_EkL_Y(MeasureScope measureScope, long constraints, int startIndex, int endIndex) {
        int i2;
        int iMax;
        int i3;
        float f;
        int i4;
        int iMax2;
        int i5;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.internal.m.h(measureScope, "measureScope");
        OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(constraints, this.orientation, null);
        int iMo342roundToPx0680j_4 = measureScope.mo342roundToPx0680j_4(this.arrangementSpacing);
        int i9 = endIndex - startIndex;
        float f2 = 0.0f;
        int i10 = startIndex;
        float f3 = 0.0f;
        int i11 = 0;
        int iMax3 = 0;
        int i12 = 0;
        int iMainAxisSize = 0;
        boolean z = false;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i10 >= endIndex) {
                break;
            }
            Measurable measurable = this.measurables.get(i10);
            RowColumnParentData rowColumnParentData = this.rowColumnParentData[i10];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > 0.0f) {
                f3 += weight;
                i12++;
                i8 = i10;
            } else {
                int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                Placeable placeableMo4235measureBRTryo0 = this.placeables[i10];
                if (placeableMo4235measureBRTryo0 == null) {
                    i6 = mainAxisMax;
                    i7 = iMax3;
                    i8 = i10;
                    placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, mainAxisMax == Integer.MAX_VALUE ? Integer.MAX_VALUE : mainAxisMax - iMainAxisSize, 0, 0, 8, null).m453toBoxConstraintsOenEA2s(this.orientation));
                } else {
                    i6 = mainAxisMax;
                    i7 = iMax3;
                    i8 = i10;
                }
                int iMin = Math.min(iMo342roundToPx0680j_4, (i6 - iMainAxisSize) - mainAxisSize(placeableMo4235measureBRTryo0));
                iMainAxisSize = mainAxisSize(placeableMo4235measureBRTryo0) + iMin + iMainAxisSize;
                iMax3 = Math.max(i7, crossAxisSize(placeableMo4235measureBRTryo0));
                z = z || RowColumnImplKt.isRelative(rowColumnParentData);
                this.placeables[i8] = placeableMo4235measureBRTryo0;
                i11 = iMin;
            }
            i10 = i8 + 1;
        }
        int i13 = iMax3;
        if (i12 == 0) {
            iMainAxisSize -= i11;
            iMax = i13;
            i3 = 0;
        } else {
            int i14 = (i12 - 1) * iMo342roundToPx0680j_4;
            int mainAxisMin = (((f3 <= 0.0f || orientationIndependentConstraints.getMainAxisMax() == Integer.MAX_VALUE) ? orientationIndependentConstraints.getMainAxisMin() : orientationIndependentConstraints.getMainAxisMax()) - iMainAxisSize) - i14;
            float f4 = f3 > 0.0f ? mainAxisMin / f3 : 0.0f;
            f0 it = a.l.C(startIndex, endIndex).iterator();
            int iF0 = 0;
            while (it.hasNext()) {
                iF0 += a.f.f0(RowColumnImplKt.getWeight(this.rowColumnParentData[it.nextInt()]) * f4);
            }
            int i15 = mainAxisMin - iF0;
            int i16 = startIndex;
            iMax = i13;
            int iMainAxisSize2 = 0;
            while (i16 < endIndex) {
                if (this.placeables[i16] == null) {
                    Measurable measurable2 = this.measurables.get(i16);
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i16];
                    float weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (!(weight2 > f2)) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int iO = a.f.O(i15);
                    i15 -= iO;
                    int iMax4 = Math.max(0, a.f.f0(weight2 * f4) + iO);
                    if (!RowColumnImplKt.getFill(rowColumnParentData2) || iMax4 == i2) {
                        f = f4;
                        i4 = 0;
                    } else {
                        f = f4;
                        i4 = iMax4;
                    }
                    Placeable placeableMo4235measureBRTryo02 = measurable2.mo4235measureBRTryo0(new OrientationIndependentConstraints(i4, iMax4, 0, orientationIndependentConstraints.getCrossAxisMax()).m453toBoxConstraintsOenEA2s(this.orientation));
                    iMainAxisSize2 += mainAxisSize(placeableMo4235measureBRTryo02);
                    iMax = Math.max(iMax, crossAxisSize(placeableMo4235measureBRTryo02));
                    z = z || RowColumnImplKt.isRelative(rowColumnParentData2);
                    this.placeables[i16] = placeableMo4235measureBRTryo02;
                } else {
                    f = f4;
                }
                i16++;
                f4 = f;
                i2 = Integer.MAX_VALUE;
                f2 = 0.0f;
            }
            int i17 = iMainAxisSize2 + i14;
            int mainAxisMax2 = orientationIndependentConstraints.getMainAxisMax() - iMainAxisSize;
            i3 = i17 > mainAxisMax2 ? mainAxisMax2 : i17;
        }
        if (z) {
            int iMax5 = 0;
            iMax2 = 0;
            for (int i18 = startIndex; i18 < endIndex; i18++) {
                Placeable placeable = this.placeables[i18];
                kotlin.jvm.internal.m.e(placeable);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(this.rowColumnParentData[i18]);
                Integer numCalculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                if (numCalculateAlignmentLinePosition$foundation_layout_release != null) {
                    int iIntValue = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = 0;
                    }
                    iMax5 = Math.max(iMax5, iIntValue);
                    int iCrossAxisSize = crossAxisSize(placeable);
                    int iIntValue2 = numCalculateAlignmentLinePosition$foundation_layout_release.intValue();
                    if (iIntValue2 == Integer.MIN_VALUE) {
                        iIntValue2 = crossAxisSize(placeable);
                    }
                    iMax2 = Math.max(iMax2, iCrossAxisSize - iIntValue2);
                }
            }
            i5 = iMax5;
        } else {
            iMax2 = 0;
            i5 = 0;
        }
        int iMax6 = Math.max(iMainAxisSize + i3, orientationIndependentConstraints.getMainAxisMin());
        int iMax7 = (orientationIndependentConstraints.getCrossAxisMax() == Integer.MAX_VALUE || this.crossAxisSize != SizeMode.Expand) ? Math.max(iMax, Math.max(orientationIndependentConstraints.getCrossAxisMin(), iMax2 + i5)) : orientationIndependentConstraints.getCrossAxisMax();
        int[] iArr = new int[i9];
        for (int i19 = 0; i19 < i9; i19++) {
            iArr[i19] = 0;
        }
        int[] iArr2 = new int[i9];
        for (int i20 = 0; i20 < i9; i20++) {
            Placeable placeable2 = this.placeables[i20 + startIndex];
            kotlin.jvm.internal.m.e(placeable2);
            iArr2[i20] = mainAxisSize(placeable2);
        }
        return new RowColumnMeasureHelperResult(iMax7, iMax6, startIndex, endIndex, i5, mainAxisPositions(iMax6, iArr2, iArr, measureScope));
    }

    public final void placeHelper(Placeable.PlacementScope placementScope, RowColumnMeasureHelperResult rowColumnMeasureHelperResult, int i2, LayoutDirection layoutDirection) {
        kotlin.jvm.internal.m.h(placementScope, "placeableScope");
        kotlin.jvm.internal.m.h(rowColumnMeasureHelperResult, "measureResult");
        kotlin.jvm.internal.m.h(layoutDirection, "layoutDirection");
        int endIndex = rowColumnMeasureHelperResult.getEndIndex();
        for (int startIndex = rowColumnMeasureHelperResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            kotlin.jvm.internal.m.e(placeable);
            int[] mainAxisPositions = rowColumnMeasureHelperResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            int crossAxisPosition = getCrossAxisPosition(placeable, parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null, rowColumnMeasureHelperResult.getCrossAxisSize(), layoutDirection, rowColumnMeasureHelperResult.getBeforeCrossAxisAlignmentLine()) + i2;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placementScope, placeable, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, s<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], kotlin.j> sVar, float f, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> list, Placeable[] placeableArr) {
        this.orientation = layoutOrientation;
        this.arrangement = sVar;
        this.arrangementSpacing = f;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = list;
        this.placeables = placeableArr;
        int size = list.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i2 = 0; i2 < size; i2++) {
            rowColumnParentDataArr[i2] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i2));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }
}
