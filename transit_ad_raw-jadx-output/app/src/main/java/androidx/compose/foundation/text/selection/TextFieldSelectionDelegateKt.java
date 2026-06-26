package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldSelectionDelegate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"getTextFieldSelection", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "rawStartOffset", "", "rawEndOffset", "previousSelection", "isStartHandle", "", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getTextFieldSelection-bb3KNj8", "(Landroidx/compose/ui/text/TextLayoutResult;IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TextFieldSelectionDelegateKt {
    /* JADX INFO: renamed from: getTextFieldSelection-bb3KNj8, reason: not valid java name */
    public static final long m981getTextFieldSelectionbb3KNj8(TextLayoutResult textLayoutResult, int i2, int i3, TextRange textRange, boolean z, SelectionAdjustment selectionAdjustment) {
        m.h(selectionAdjustment, "adjustment");
        if (textLayoutResult == null) {
            return TextRangeKt.TextRange(0, 0);
        }
        long jTextRange = TextRangeKt.TextRange(i2, i3);
        return (textRange == null && m.c(selectionAdjustment, SelectionAdjustment.INSTANCE.getCharacter())) ? jTextRange : selectionAdjustment.mo926adjustZXO7KMw(textLayoutResult, jTextRange, -1, z, textRange);
    }
}
