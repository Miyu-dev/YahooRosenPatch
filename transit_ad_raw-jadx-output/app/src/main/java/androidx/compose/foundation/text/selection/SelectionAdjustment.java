package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.text.r;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "newRawSelectionRange", "previousHandleOffset", "", "isStartHandle", "", "previousSelectionRange", "adjust-ZXO7KMw", "(Landroidx/compose/ui/text/TextLayoutResult;JIZLandroidx/compose/ui/text/TextRange;)J", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public interface SelectionAdjustment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: SelectionAdjustment.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/text/TextRange;", "newRawSelection", "Lkotlin/Function1;", "", "boundaryFun", "adjustByBoundary--Dv-ylE", "(Landroidx/compose/ui/text/TextLayoutResult;JLkj/l;)J", "adjustByBoundary", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "None", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getNone", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "Character", "getCharacter", "Word", "getWord", "Paragraph", "getParagraph", "CharacterWithWordAccelerate", "getCharacterWithWordAccelerate", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$None$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo926adjustZXO7KMw(TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, TextRange previousSelectionRange) {
                m.h(textLayoutResult, "textLayoutResult");
                return newRawSelectionRange;
            }
        };
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Character$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo926adjustZXO7KMw(TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, TextRange previousSelectionRange) {
                m.h(textLayoutResult, "textLayoutResult");
                if (TextRange.m4805getCollapsedimpl(newRawSelectionRange)) {
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m4811getStartimpl(newRawSelectionRange), r.j1(textLayoutResult.getLayoutInput().getText()), isStartHandle, previousSelectionRange != null ? TextRange.m4810getReversedimpl(previousSelectionRange.getPackedValue()) : false);
                }
                return newRawSelectionRange;
            }
        };
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo926adjustZXO7KMw(TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, TextRange previousSelectionRange) {
                m.h(textLayoutResult, "textLayoutResult");
                return SelectionAdjustment.Companion.$$INSTANCE.m928adjustByBoundaryDvylE(textLayoutResult, newRawSelectionRange, new SelectionAdjustment$Companion$Word$1$adjust$1(textLayoutResult));
            }
        };
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo926adjustZXO7KMw(TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, TextRange previousSelectionRange) {
                m.h(textLayoutResult, "textLayoutResult");
                return SelectionAdjustment.Companion.$$INSTANCE.m928adjustByBoundaryDvylE(textLayoutResult, newRawSelectionRange, new SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(textLayoutResult.getLayoutInput().getText()));
            }
        };
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$CharacterWithWordAccelerate$1
            private final boolean isAtWordBoundary(TextLayoutResult textLayoutResult, int i2) {
                long jM4785getWordBoundaryjx7JFs = textLayoutResult.m4785getWordBoundaryjx7JFs(i2);
                return i2 == TextRange.m4811getStartimpl(jM4785getWordBoundaryjx7JFs) || i2 == TextRange.m4806getEndimpl(jM4785getWordBoundaryjx7JFs);
            }

            private final boolean isExpanding(int newRawOffset, int previousRawOffset, boolean isStart, boolean previousReversed) {
                if (previousRawOffset == -1) {
                    return true;
                }
                if (newRawOffset == previousRawOffset) {
                    return false;
                }
                if (isStart ^ previousReversed) {
                    if (newRawOffset < previousRawOffset) {
                        return true;
                    }
                } else if (newRawOffset > previousRawOffset) {
                    return true;
                }
                return false;
            }

            private final int snapToWordBoundary(TextLayoutResult textLayoutResult, int newRawOffset, int currentLine, int otherBoundaryOffset, boolean isStart, boolean isReversed) {
                long jM4785getWordBoundaryjx7JFs = textLayoutResult.m4785getWordBoundaryjx7JFs(newRawOffset);
                int iM4811getStartimpl = textLayoutResult.getLineForOffset(TextRange.m4811getStartimpl(jM4785getWordBoundaryjx7JFs)) == currentLine ? TextRange.m4811getStartimpl(jM4785getWordBoundaryjx7JFs) : textLayoutResult.getLineStart(currentLine);
                int iM4806getEndimpl = textLayoutResult.getLineForOffset(TextRange.m4806getEndimpl(jM4785getWordBoundaryjx7JFs)) == currentLine ? TextRange.m4806getEndimpl(jM4785getWordBoundaryjx7JFs) : TextLayoutResult.getLineEnd$default(textLayoutResult, currentLine, false, 2, null);
                if (iM4811getStartimpl == otherBoundaryOffset) {
                    return iM4806getEndimpl;
                }
                if (iM4806getEndimpl == otherBoundaryOffset) {
                    return iM4811getStartimpl;
                }
                int i2 = (iM4811getStartimpl + iM4806getEndimpl) / 2;
                if (isStart ^ isReversed) {
                    if (newRawOffset <= i2) {
                        return iM4811getStartimpl;
                    }
                } else if (newRawOffset < i2) {
                    return iM4811getStartimpl;
                }
                return iM4806getEndimpl;
            }

            private final int updateSelectionBoundary(TextLayoutResult textLayoutResult, int newRawOffset, int previousRawOffset, int previousAdjustedOffset, int otherBoundaryOffset, boolean isStart, boolean isReversed) {
                if (newRawOffset == previousRawOffset) {
                    return previousAdjustedOffset;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(newRawOffset);
                return lineForOffset != textLayoutResult.getLineForOffset(previousAdjustedOffset) ? snapToWordBoundary(textLayoutResult, newRawOffset, lineForOffset, otherBoundaryOffset, isStart, isReversed) : (isExpanding(newRawOffset, previousRawOffset, isStart, isReversed) && isAtWordBoundary(textLayoutResult, previousAdjustedOffset)) ? snapToWordBoundary(textLayoutResult, newRawOffset, lineForOffset, otherBoundaryOffset, isStart, isReversed) : newRawOffset;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* JADX INFO: renamed from: adjust-ZXO7KMw */
            public long mo926adjustZXO7KMw(TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, TextRange previousSelectionRange) {
                int iUpdateSelectionBoundary;
                int iUpdateSelectionBoundary2;
                m.h(textLayoutResult, "textLayoutResult");
                if (previousSelectionRange == null) {
                    return SelectionAdjustment.Companion.$$INSTANCE.getWord().mo926adjustZXO7KMw(textLayoutResult, newRawSelectionRange, previousHandleOffset, isStartHandle, previousSelectionRange);
                }
                if (TextRange.m4805getCollapsedimpl(newRawSelectionRange)) {
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(textLayoutResult.getLayoutInput().getText().getText(), TextRange.m4811getStartimpl(newRawSelectionRange), r.j1(textLayoutResult.getLayoutInput().getText()), isStartHandle, TextRange.m4810getReversedimpl(previousSelectionRange.getPackedValue()));
                }
                if (isStartHandle) {
                    iUpdateSelectionBoundary2 = updateSelectionBoundary(textLayoutResult, TextRange.m4811getStartimpl(newRawSelectionRange), previousHandleOffset, TextRange.m4811getStartimpl(previousSelectionRange.getPackedValue()), TextRange.m4806getEndimpl(newRawSelectionRange), true, TextRange.m4810getReversedimpl(newRawSelectionRange));
                    iUpdateSelectionBoundary = TextRange.m4806getEndimpl(newRawSelectionRange);
                } else {
                    int iM4811getStartimpl = TextRange.m4811getStartimpl(newRawSelectionRange);
                    iUpdateSelectionBoundary = updateSelectionBoundary(textLayoutResult, TextRange.m4806getEndimpl(newRawSelectionRange), previousHandleOffset, TextRange.m4806getEndimpl(previousSelectionRange.getPackedValue()), TextRange.m4811getStartimpl(newRawSelectionRange), false, TextRange.m4810getReversedimpl(newRawSelectionRange));
                    iUpdateSelectionBoundary2 = iM4811getStartimpl;
                }
                return TextRangeKt.TextRange(iUpdateSelectionBoundary2, iUpdateSelectionBoundary);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: adjustByBoundary--Dv-ylE, reason: not valid java name */
        public final long m928adjustByBoundaryDvylE(TextLayoutResult textLayoutResult, long newRawSelection, l<? super Integer, TextRange> boundaryFun) {
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                return TextRange.INSTANCE.m4816getZerod9O1mEE();
            }
            int iJ1 = r.j1(textLayoutResult.getLayoutInput().getText());
            long packedValue = ((TextRange) boundaryFun.invoke(Integer.valueOf(a.l.i(TextRange.m4811getStartimpl(newRawSelection), 0, iJ1)))).getPackedValue();
            long packedValue2 = ((TextRange) boundaryFun.invoke(Integer.valueOf(a.l.i(TextRange.m4806getEndimpl(newRawSelection), 0, iJ1)))).getPackedValue();
            return TextRangeKt.TextRange(TextRange.m4810getReversedimpl(newRawSelection) ? TextRange.m4806getEndimpl(packedValue) : TextRange.m4811getStartimpl(packedValue), TextRange.m4810getReversedimpl(newRawSelection) ? TextRange.m4811getStartimpl(packedValue2) : TextRange.m4806getEndimpl(packedValue2));
        }

        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        public final SelectionAdjustment getNone() {
            return None;
        }

        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    /* JADX INFO: renamed from: adjust-ZXO7KMw, reason: not valid java name */
    long mo926adjustZXO7KMw(TextLayoutResult textLayoutResult, long newRawSelectionRange, int previousHandleOffset, boolean isStartHandle, TextRange previousSelectionRange);
}
