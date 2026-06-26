package androidx.compose.foundation.text.selection;

import a.l;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MultiWidgetSelectionDelegate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010$\u001a\u00020#\u0012\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0(\u0012\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0(¢\u0006\u0004\b3\u00104J_\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016J(\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J \u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\b\u0010\"\u001a\u00020\u001aH\u0016R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u00020\u001a*\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u00101\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/ui/geometry/Offset;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "", "isStartHandle", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Lkotlin/Pair;", "updateSelection-qCDeeow", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "updateSelection", "getSelectAllSelection", "selection", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "getLayoutCoordinates", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getLastVisibleOffset", "", "selectableId", "J", "getSelectableId", "()J", "Lkotlin/Function0;", "coordinatesCallback", "Lkj/a;", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResultCallback", "_previousTextLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "_previousLastVisibleOffset", "I", "(Landroidx/compose/ui/text/TextLayoutResult;)I", "lastVisibleOffset", "<init>", "(JLkj/a;Lkj/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class MultiWidgetSelectionDelegate implements Selectable {
    private int _previousLastVisibleOffset;
    private TextLayoutResult _previousTextLayoutResult;
    private final kj.a<LayoutCoordinates> coordinatesCallback;
    private final kj.a<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j, kj.a<? extends LayoutCoordinates> aVar, kj.a<TextLayoutResult> aVar2) {
        m.h(aVar, "coordinatesCallback");
        m.h(aVar2, "layoutResultCallback");
        this.selectableId = j;
        this.coordinatesCallback = aVar;
        this.layoutResultCallback = aVar2;
        this._previousLastVisibleOffset = -1;
    }

    private final synchronized int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int lineCount;
        if (this._previousTextLayoutResult != textLayoutResult) {
            if (!textLayoutResult.getDidOverflowHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                lineCount = textLayoutResult.getLineCount() - 1;
            } else {
                lineCount = textLayoutResult.getLineForVerticalPosition(IntSize.m5426getHeightimpl(textLayoutResult.getSize()));
                int lineCount2 = textLayoutResult.getLineCount() - 1;
                if (lineCount > lineCount2) {
                    lineCount = lineCount2;
                }
                while (textLayoutResult.getLineTop(lineCount) >= IntSize.m5426getHeightimpl(textLayoutResult.getSize())) {
                    lineCount--;
                }
            }
            this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
            this._previousTextLayoutResult = textLayoutResult;
        }
        return this._previousLastVisibleOffset;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Rect getBoundingBox(int offset) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Rect.INSTANCE.getZero();
        }
        int length = textLayoutResult.getLayoutInput().getText().length();
        return length < 1 ? Rect.INSTANCE.getZero() : textLayoutResult.getBoundingBox(l.i(offset, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo917getHandlePositiondBAh8RU(Selection selection, boolean isStartHandle) {
        m.h(selection, "selection");
        if ((isStartHandle && selection.getStart().getSelectableId() != getSelectableId()) || (!isStartHandle && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.INSTANCE.m2601getZeroF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.INSTANCE.m2601getZeroF1C5BW0();
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return Offset.INSTANCE.m2601getZeroF1C5BW0();
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(textLayoutResult, l.i((isStartHandle ? selection.getStart() : selection.getEnd()).getOffset(), 0, getLastVisibleOffset(textLayoutResult)), isStartHandle, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.coordinatesCallback.invoke();
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo918getRangeOfLineContainingjx7JFs(int offset) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return TextRange.INSTANCE.m4816getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(textLayoutResult);
        if (lastVisibleOffset < 1) {
            return TextRange.INSTANCE.m4816getZerod9O1mEE();
        }
        int lineForOffset = textLayoutResult.getLineForOffset(l.i(offset, 0, lastVisibleOffset - 1));
        return TextRangeKt.TextRange(textLayoutResult.getLineStart(lineForOffset), textLayoutResult.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Selection getSelectAllSelection() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return null;
        }
        return MultiWidgetSelectionDelegateKt.m921getAssembledSelectionInfovJH6DeI(TextRangeKt.TextRange(0, textLayoutResult.getLayoutInput().getText().length()), false, getSelectableId(), textLayoutResult);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public AnnotatedString getText() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        return textLayoutResult == null ? new AnnotatedString("", null, null, 6, null) : textLayoutResult.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* JADX INFO: renamed from: updateSelection-qCDeeow, reason: not valid java name */
    public Pair<Selection, Boolean> mo919updateSelectionqCDeeow(long startHandlePosition, long endHandlePosition, Offset previousHandlePosition, boolean isStartHandle, LayoutCoordinates containerLayoutCoordinates, SelectionAdjustment adjustment, Selection previousSelection) {
        m.h(containerLayoutCoordinates, "containerLayoutCoordinates");
        m.h(adjustment, "adjustment");
        if (!(previousSelection == null || (getSelectableId() == previousSelection.getStart().getSelectableId() && getSelectableId() == previousSelection.getEnd().getSelectableId()))) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
        }
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null) {
            return new Pair<>((Object) null, Boolean.FALSE);
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return new Pair<>((Object) null, Boolean.FALSE);
        }
        long jMo4240localPositionOfR5De75A = containerLayoutCoordinates.mo4240localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m2601getZeroF1C5BW0());
        return MultiWidgetSelectionDelegateKt.m923getTextSelectionInfoyM0VcXU(textLayoutResult, Offset.m2589minusMKHz9U(startHandlePosition, jMo4240localPositionOfR5De75A), Offset.m2589minusMKHz9U(endHandlePosition, jMo4240localPositionOfR5De75A), previousHandlePosition != null ? Offset.m2574boximpl(Offset.m2589minusMKHz9U(previousHandlePosition.getPackedValue(), jMo4240localPositionOfR5De75A)) : null, getSelectableId(), adjustment, previousSelection, isStartHandle);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return getLastVisibleOffset(textLayoutResult);
    }
}
