package androidx.compose.foundation.text.selection;

import a.l;
import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001ak\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"getAssembledSelectionInfo", "Landroidx/compose/foundation/text/selection/Selection;", "newSelectionRange", "Landroidx/compose/ui/text/TextRange;", "handlesCrossed", "", "selectableId", "", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getAssembledSelectionInfo-vJH6DeI", "(JZJLandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/Selection;", "getOffsetForPosition", "", "bounds", "Landroidx/compose/ui/geometry/Rect;", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-0AR0LA0", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;J)I", "getTextSelectionInfo", "Lkotlin/Pair;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "previousSelection", "isStartHandle", "getTextSelectionInfo-yM0VcXU", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/geometry/Offset;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;Z)Lkotlin/Pair;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MultiWidgetSelectionDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAssembledSelectionInfo-vJH6DeI, reason: not valid java name */
    public static final Selection m921getAssembledSelectionInfovJH6DeI(long j, boolean z, long j2, TextLayoutResult textLayoutResult) {
        return new Selection(new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(TextRange.m4811getStartimpl(j)), TextRange.m4811getStartimpl(j), j2), new Selection.AnchorInfo(textLayoutResult.getBidiRunDirection(Math.max(TextRange.m4806getEndimpl(j) - 1, 0)), TextRange.m4806getEndimpl(j), j2), z);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-0AR0LA0, reason: not valid java name */
    public static final int m922getOffsetForPosition0AR0LA0(TextLayoutResult textLayoutResult, Rect rect, long j) {
        m.h(textLayoutResult, "textLayoutResult");
        m.h(rect, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (rect.m2611containsk4lQ0M(j)) {
            return l.i(textLayoutResult.m4783getOffsetForPositionk4lQ0M(j), 0, length);
        }
        if (SelectionMode.Vertical.mo976compare3MmeM6k$foundation_release(j, rect) < 0) {
            return 0;
        }
        return length;
    }

    /* JADX INFO: renamed from: getTextSelectionInfo-yM0VcXU, reason: not valid java name */
    public static final Pair<Selection, Boolean> m923getTextSelectionInfoyM0VcXU(TextLayoutResult textLayoutResult, long j, long j2, Offset offset, long j3, SelectionAdjustment selectionAdjustment, Selection selection, boolean z) {
        m.h(textLayoutResult, "textLayoutResult");
        m.h(selectionAdjustment, "adjustment");
        Rect rect = new Rect(0.0f, 0.0f, IntSize.m5427getWidthimpl(textLayoutResult.getSize()), IntSize.m5426getHeightimpl(textLayoutResult.getSize()));
        if (!SelectionMode.Vertical.m977isSelected2x9bVx0$foundation_release(rect, j, j2)) {
            return new Pair<>((Object) null, Boolean.FALSE);
        }
        int iM922getOffsetForPosition0AR0LA0 = m922getOffsetForPosition0AR0LA0(textLayoutResult, rect, j);
        int iM922getOffsetForPosition0AR0LA02 = m922getOffsetForPosition0AR0LA0(textLayoutResult, rect, j2);
        int iM922getOffsetForPosition0AR0LA03 = offset != null ? m922getOffsetForPosition0AR0LA0(textLayoutResult, rect, offset.getPackedValue()) : -1;
        long jMo926adjustZXO7KMw = selectionAdjustment.mo926adjustZXO7KMw(textLayoutResult, TextRangeKt.TextRange(iM922getOffsetForPosition0AR0LA0, iM922getOffsetForPosition0AR0LA02), iM922getOffsetForPosition0AR0LA03, z, selection != null ? TextRange.m4799boximpl(selection.m925toTextRanged9O1mEE()) : null);
        Selection selectionM921getAssembledSelectionInfovJH6DeI = m921getAssembledSelectionInfovJH6DeI(jMo926adjustZXO7KMw, TextRange.m4810getReversedimpl(jMo926adjustZXO7KMw), j3, textLayoutResult);
        boolean z2 = true;
        boolean z3 = !m.c(selectionM921getAssembledSelectionInfovJH6DeI, selection);
        if (!(!z ? iM922getOffsetForPosition0AR0LA02 == iM922getOffsetForPosition0AR0LA03 : iM922getOffsetForPosition0AR0LA0 == iM922getOffsetForPosition0AR0LA03) && !z3) {
            z2 = false;
        }
        return new Pair<>(selectionM921getAssembledSelectionInfovJH6DeI, Boolean.valueOf(z2));
    }
}
