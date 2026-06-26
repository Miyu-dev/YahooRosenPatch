package androidx.compose.foundation.text.selection;

import a.l;
import androidx.appcompat.R;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0000\u001a!\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0018H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getCurrentSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "merge", "lhs", "rhs", "containsInclusive", "", "Landroidx/compose/ui/geometry/Rect;", TypedValues.CycleType.S_WAVE_OFFSET, "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "visibleBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SelectionManagerKt {

    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m970calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j) throws NoWhenBranchMatchedException {
        m.h(selectionManager, "manager");
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i2 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i2 == -1) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        if (i2 == 1) {
            return calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(selectionManager, j, selection.getStart(), true);
        }
        if (i2 == 2) {
            return calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(selectionManager, j, selection.getEnd(), false);
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
    }

    private static final long calculateSelectionMagnifierCenterAndroid_O0kMr_c$getMagnifierCenter(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo, boolean z) {
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release == null) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates();
        if (containerLayoutCoordinates == null) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        LayoutCoordinates layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        int offset = anchorInfo.getOffset();
        if (!z) {
            offset--;
        }
        if (offset > anchorSelectable$foundation_release.getLastVisibleOffset()) {
            return Offset.INSTANCE.m2600getUnspecifiedF1C5BW0();
        }
        Offset offsetM956getCurrentDragPosition_m7T9E = selectionManager.m956getCurrentDragPosition_m7T9E();
        m.e(offsetM956getCurrentDragPosition_m7T9E);
        float fM2585getXimpl = Offset.m2585getXimpl(layoutCoordinates.mo4240localPositionOfR5De75A(containerLayoutCoordinates, offsetM956getCurrentDragPosition_m7T9E.getPackedValue()));
        long jMo918getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo918getRangeOfLineContainingjx7JFs(offset);
        Rect boundingBox = anchorSelectable$foundation_release.getBoundingBox(TextRange.m4809getMinimpl(jMo918getRangeOfLineContainingjx7JFs));
        int iM4808getMaximpl = TextRange.m4808getMaximpl(jMo918getRangeOfLineContainingjx7JFs) - 1;
        int iM4809getMinimpl = TextRange.m4809getMinimpl(jMo918getRangeOfLineContainingjx7JFs);
        if (iM4808getMaximpl < iM4809getMinimpl) {
            iM4808getMaximpl = iM4809getMinimpl;
        }
        Rect boundingBox2 = anchorSelectable$foundation_release.getBoundingBox(iM4808getMaximpl);
        float fH = l.h(fM2585getXimpl, Math.min(boundingBox.getLeft(), boundingBox2.getLeft()), Math.max(boundingBox.getRight(), boundingBox2.getRight()));
        return Math.abs(fM2585getXimpl - fH) > ((float) (IntSize.m5427getWidthimpl(j) / 2)) ? Offset.INSTANCE.m2600getUnspecifiedF1C5BW0() : containerLayoutCoordinates.mo4240localPositionOfR5De75A(layoutCoordinates, OffsetKt.Offset(fH, Offset.m2586getYimpl(anchorSelectable$foundation_release.getBoundingBox(offset).m2615getCenterF1C5BW0())));
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m971containsInclusiveUv8p0NA(Rect rect, long j) {
        m.h(rect, "$this$containsInclusive");
        float left = rect.getLeft();
        float right = rect.getRight();
        float fM2585getXimpl = Offset.m2585getXimpl(j);
        if (left <= fM2585getXimpl && fM2585getXimpl <= right) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float fM2586getYimpl = Offset.m2586getYimpl(j);
            if (top <= fM2586getYimpl && fM2586getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }

    public static final AnnotatedString getCurrentSelectedText(Selectable selectable, Selection selection) {
        m.h(selectable, "selectable");
        m.h(selection, "selection");
        AnnotatedString text = selectable.getText();
        return (selectable.getSelectableId() == selection.getStart().getSelectableId() || selectable.getSelectableId() == selection.getEnd().getSelectableId()) ? (selectable.getSelectableId() == selection.getStart().getSelectableId() && selectable.getSelectableId() == selection.getEnd().getSelectableId()) ? selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset()) : selectable.getSelectableId() == selection.getStart().getSelectableId() ? selection.getHandlesCrossed() ? text.subSequence(0, selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), text.length()) : selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), text.length()) : text.subSequence(0, selection.getEnd().getOffset()) : text;
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection selectionMerge;
        return (selection == null || (selectionMerge = selection.merge(selection2)) == null) ? selection2 : selectionMerge;
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        m.h(layoutCoordinates, "<this>");
        Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m2623Rect0a9Yr6o(layoutCoordinates.mo4244windowToLocalMKHz9U(rectBoundsInWindow.m2620getTopLeftF1C5BW0()), layoutCoordinates.mo4244windowToLocalMKHz9U(rectBoundsInWindow.m2614getBottomRightF1C5BW0()));
    }
}
