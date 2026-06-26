package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: VelocityTracker.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a3\u0010\t\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0012\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u001a2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0000\u001a,\u0010\u0017\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002\"\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "", "index", "", "time", "", "dataPoint", "Lkotlin/j;", "set", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "event", "addPointerInputChange", "", "x", "y", "degree", "polyFitLeastSquares", "dataPoints", "", "isDataDifferential", "calculateImpulseVelocity", "kineticEnergy", "kineticEnergyToVelocity", "AssumePointerMoveStoppedMilliseconds", "I", "HistorySize", "HorizonMilliseconds", "DefaultWeight", "F", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        m.h(velocityTracker, "<this>");
        m.h(pointerInputChange, "event");
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m4210setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.getPosition());
            velocityTracker.resetTracking();
        }
        long previousPosition = pointerInputChange.getPreviousPosition();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i2 = 0;
        while (i2 < size) {
            HistoricalChange historicalChange = historical.get(i2);
            long jM2589minusMKHz9U = Offset.m2589minusMKHz9U(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            velocityTracker.m4210setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2590plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), jM2589minusMKHz9U));
            velocityTracker.m4207addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
            i2++;
            previousPosition = position;
        }
        velocityTracker.m4210setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m2590plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), Offset.m2589minusMKHz9U(pointerInputChange.getPosition(), previousPosition)));
        velocityTracker.m4207addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(List<Float> list, List<Float> list2, boolean z) {
        int size = list.size();
        float f = 0.0f;
        if (size < 2) {
            return 0.0f;
        }
        if (size == 2) {
            if (list2.get(0).floatValue() == list2.get(1).floatValue()) {
                return 0.0f;
            }
            return (z ? list.get(0).floatValue() : list.get(0).floatValue() - list.get(1).floatValue()) / (list2.get(0).floatValue() - list2.get(1).floatValue());
        }
        int i2 = size - 1;
        for (int i3 = i2; i3 > 0; i3--) {
            int i4 = i3 - 1;
            if (!(list2.get(i3).floatValue() == list2.get(i4).floatValue())) {
                float fKineticEnergyToVelocity = kineticEnergyToVelocity(f);
                float fFloatValue = (z ? -list.get(i4).floatValue() : list.get(i3).floatValue() - list.get(i4).floatValue()) / (list2.get(i3).floatValue() - list2.get(i4).floatValue());
                float fAbs = (Math.abs(fFloatValue) * (fFloatValue - fKineticEnergyToVelocity)) + f;
                if (i3 == i2) {
                    fAbs *= 0.5f;
                }
                f = fAbs;
            }
        }
        return kineticEnergyToVelocity(f);
    }

    private static final float kineticEnergyToVelocity(float f) {
        return Math.signum(f) * ((float) Math.sqrt(Math.abs(f) * 2));
    }

    public static final List<Float> polyFitLeastSquares(List<Float> list, List<Float> list2, int i2) {
        m.h(list, "x");
        m.h(list2, "y");
        if (i2 < 1) {
            throw new IllegalArgumentException("The degree must be at positive integer");
        }
        if (list.size() != list2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = i2 >= list.size() ? list.size() - 1 : i2;
        int i3 = i2 + 1;
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        int size2 = list.size();
        int i5 = size + 1;
        Matrix matrix = new Matrix(i5, size2);
        for (int i6 = 0; i6 < size2; i6++) {
            matrix.set(0, i6, 1.0f);
            for (int i7 = 1; i7 < i5; i7++) {
                matrix.set(i7, i6, list.get(i6).floatValue() * matrix.get(i7 - 1, i6));
            }
        }
        Matrix matrix2 = new Matrix(i5, size2);
        Matrix matrix3 = new Matrix(i5, i5);
        int i8 = 0;
        while (i8 < i5) {
            for (int i9 = 0; i9 < size2; i9++) {
                matrix2.set(i8, i9, matrix.get(i8, i9));
            }
            for (int i10 = 0; i10 < i8; i10++) {
                float fTimes = matrix2.getRow(i8).times(matrix2.getRow(i10));
                for (int i11 = 0; i11 < size2; i11++) {
                    matrix2.set(i8, i11, matrix2.get(i8, i11) - (matrix2.get(i10, i11) * fTimes));
                }
            }
            float fNorm = matrix2.getRow(i8).norm();
            if (fNorm < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f = 1.0f / fNorm;
            for (int i12 = 0; i12 < size2; i12++) {
                matrix2.set(i8, i12, matrix2.get(i8, i12) * f);
            }
            int i13 = 0;
            while (i13 < i5) {
                matrix3.set(i8, i13, i13 < i8 ? 0.0f : matrix2.getRow(i8).times(matrix.getRow(i13)));
                i13++;
            }
            i8++;
        }
        Vector vector = new Vector(size2);
        for (int i14 = 0; i14 < size2; i14++) {
            vector.set(i14, list2.get(i14).floatValue() * 1.0f);
        }
        int i15 = i5 - 1;
        for (int i16 = i15; -1 < i16; i16--) {
            arrayList.set(i16, Float.valueOf(matrix2.getRow(i16).times(vector)));
            int i17 = i16 + 1;
            if (i17 <= i15) {
                int i18 = i15;
                while (true) {
                    arrayList.set(i16, Float.valueOf(((Number) arrayList.get(i16)).floatValue() - (((Number) arrayList.get(i18)).floatValue() * matrix3.get(i16, i18))));
                    if (i18 != i17) {
                        i18--;
                    }
                }
            }
            arrayList.set(i16, Float.valueOf(((Number) arrayList.get(i16)).floatValue() / matrix3.get(i16, i16)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i2, long j, float f) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i2] = new DataPointAtTime(j, f);
        } else {
            dataPointAtTime.setTime(j);
            dataPointAtTime.setDataPoint(f);
        }
    }
}
