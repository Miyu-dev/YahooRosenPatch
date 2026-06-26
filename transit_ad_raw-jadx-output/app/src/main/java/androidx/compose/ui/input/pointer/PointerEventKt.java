package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\b*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a \u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\f\u0010\u0013\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\f\u0010\u0014\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a!\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "changedToDown", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "positionChanged", "positionChangedIgnoreConsumed", "Landroidx/compose/ui/geometry/Offset;", "positionChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeIgnoreConsumed", "ignoreConsumed", "positionChangeInternal", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChangeConsumed", "anyChangeConsumed", "Lkotlin/j;", "consumeDownChange", "consumePositionChange", "consumeAllChanges", "Landroidx/compose/ui/unit/IntSize;", "size", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "isOutOfBounds", "Landroidx/compose/ui/geometry/Size;", "extendedTouchPadding", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class PointerEventKt {
    public static final boolean anyChangeConsumed(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    public static final void consumeAllChanges(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        pointerInputChange.consume();
    }

    public static final void consumeDownChange(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    public static final void consumePositionChange(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        if (Offset.m2582equalsimpl0(positionChange(pointerInputChange), Offset.INSTANCE.m2601getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    /* JADX INFO: renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m4076isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j) {
        m.h(pointerInputChange, "$this$isOutOfBounds");
        long jM4129getPositionF1C5BW0 = pointerInputChange.getPosition();
        float fM2585getXimpl = Offset.m2585getXimpl(jM4129getPositionF1C5BW0);
        float fM2586getYimpl = Offset.m2586getYimpl(jM4129getPositionF1C5BW0);
        return fM2585getXimpl < 0.0f || fM2585getXimpl > ((float) IntSize.m5427getWidthimpl(j)) || fM2586getYimpl < 0.0f || fM2586getYimpl > ((float) IntSize.m5426getHeightimpl(j));
    }

    /* JADX INFO: renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m4077isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j, long j2) {
        m.h(pointerInputChange, "$this$isOutOfBounds");
        if (!PointerType.m4187equalsimpl0(pointerInputChange.getType(), PointerType.INSTANCE.m4194getTouchT8wyACA())) {
            return m4076isOutOfBoundsO0kMr_c(pointerInputChange, j);
        }
        long jM4129getPositionF1C5BW0 = pointerInputChange.getPosition();
        float fM2585getXimpl = Offset.m2585getXimpl(jM4129getPositionF1C5BW0);
        float fM2586getYimpl = Offset.m2586getYimpl(jM4129getPositionF1C5BW0);
        return fM2585getXimpl < (-Size.m2654getWidthimpl(j2)) || fM2585getXimpl > Size.m2654getWidthimpl(j2) + ((float) IntSize.m5427getWidthimpl(j)) || fM2586getYimpl < (-Size.m2651getHeightimpl(j2)) || fM2586getYimpl > Size.m2651getHeightimpl(j2) + ((float) IntSize.m5426getHeightimpl(j));
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final boolean positionChangeConsumed(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z) {
        long jM2589minusMKHz9U = Offset.m2589minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition());
        return (z || !pointerInputChange.isConsumed()) ? jM2589minusMKHz9U : Offset.INSTANCE.m2601getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return positionChangeInternal(pointerInputChange, z);
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return !Offset.m2582equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.INSTANCE.m2601getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        m.h(pointerInputChange, "<this>");
        return !Offset.m2582equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.INSTANCE.m2601getZeroF1C5BW0());
    }
}
