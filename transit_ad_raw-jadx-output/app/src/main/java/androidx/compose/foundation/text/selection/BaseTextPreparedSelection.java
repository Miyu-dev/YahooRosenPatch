package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u0000 g*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001gB4\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010K\u001a\u0004\u0018\u000103\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010U\u001a\u00020Tø\u0001\u0001¢\u0006\u0004\be\u0010fJ;\u0010\t\u001a\u00028\u0000\"\u0004\b\u0001\u0010\u0003*\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0084\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0004J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0004J\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0012J!\u0010\u0017\u001a\u00028\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00028\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0019\u0010\u0018J\u0006\u0010\u001a\u001a\u00020\u000bJ\u0006\u0010\u001b\u001a\u00020\u000bJ\r\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u0012J\r\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u0012J\r\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u0012J\r\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00028\u0000¢\u0006\u0004\b#\u0010\u0012J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010\u0012J\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u0012J\r\u0010&\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010'\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b'\u0010!J\r\u0010(\u001a\u00028\u0000¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b)\u0010!J\r\u0010*\u001a\u00028\u0000¢\u0006\u0004\b*\u0010\u0012J\r\u0010+\u001a\u00028\u0000¢\u0006\u0004\b+\u0010\u0012J\r\u0010,\u001a\u00028\u0000¢\u0006\u0004\b,\u0010\u0012J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010\u0012J\u000f\u0010.\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010\u0012J\u000f\u0010/\u001a\u00028\u0000H\u0002¢\u0006\u0004\b/\u0010\u0012J\u000f\u00100\u001a\u00028\u0000H\u0002¢\u0006\u0004\b0\u0010\u0012J\u000f\u00101\u001a\u00028\u0000H\u0002¢\u0006\u0004\b1\u0010\u0012J\b\u00102\u001a\u00020\u0004H\u0002J\u0017\u00105\u001a\u00020\u000b*\u0002032\b\b\u0002\u00104\u001a\u00020\u000bH\u0082\u0010J\u0017\u00106\u001a\u00020\u000b*\u0002032\b\b\u0002\u00104\u001a\u00020\u000bH\u0082\u0010J\u0016\u00107\u001a\u00020\u000b*\u0002032\b\b\u0002\u00104\u001a\u00020\u000bH\u0002J\u0016\u00108\u001a\u00020\u000b*\u0002032\b\b\u0002\u00104\u001a\u00020\u000bH\u0002J\u0014\u0010:\u001a\u00020\u000b*\u0002032\u0006\u00109\u001a\u00020\u000bH\u0002J\b\u0010;\u001a\u00020\u000bH\u0002J\b\u0010<\u001a\u00020\u000bH\u0002J\b\u0010=\u001a\u00020\u000bH\u0002J\u0010\u0010>\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010?\u001a\u00020\u000bH\u0002J\b\u0010@\u001a\u00020\u000bH\u0002R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010G\u001a\u00020F8\u0006ø\u0001\u0001ø\u0001\u0002ø\u0001\u0003¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010K\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010P\u001a\u00020O8\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010U\u001a\u00020T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR+\u0010Y\u001a\u00020F8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0002ø\u0001\u0003¢\u0006\u0012\n\u0004\bY\u0010H\u001a\u0004\bZ\u0010J\"\u0004\b[\u0010\\R\"\u0010]\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010C\u001a\u0004\b^\u0010E\"\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0002\u0016\n\u0005\b\u009920\u0001\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "T", "", "U", "", "resetCachedX", "Lkotlin/Function1;", "Lkotlin/j;", "block", "apply", "(Ljava/lang/Object;ZLkj/l;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "", TypedValues.CycleType.S_WAVE_OFFSET, "setCursor", "start", "end", "setSelection", "selectAll", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "deselect", "moveCursorLeft", "moveCursorRight", "or", "collapseLeftOr", "(Lkj/l;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "getPrecedingCharacterIndex", "getNextCharacterIndex", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "()Ljava/lang/Integer;", "getPreviousWordOffset", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "moveCursorPrev", "moveCursorNext", "moveCursorNextByWord", "moveCursorPrevByWord", "isLtr", "Landroidx/compose/ui/text/TextLayoutResult;", "currentOffset", "getNextWordOffsetForLayout", "getPrevWordOffset", "getLineStartByOffsetForLayout", "getLineEndByOffsetForLayout", "linesAmount", "jumpByLinesOffset", "transformedEndOffset", "transformedMinOffset", "transformedMaxOffset", "charOffset", "getParagraphStart", "getParagraphEnd", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "J", "getOriginalSelection-d9O1mEE", "()J", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "selection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "annotatedString", "getAnnotatedString", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "getText$foundation_release", "()Ljava/lang/String;", "text", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final int NoCharacterFound = -1;
    private AnnotatedString annotatedString;
    private final TextLayoutResult layoutResult;
    private final OffsetMapping offsetMapping;
    private final long originalSelection;
    private final AnnotatedString originalText;
    private long selection;
    private final TextPreparedSelectionState state;

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z, l lVar, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i2 & 1) != 0) {
            z = true;
        }
        m.h(lVar, "block");
        if (z) {
            baseTextPreparedSelection.getState().resetCachedX();
        }
        if (baseTextPreparedSelection.getText$foundation_release().length() > 0) {
            lVar.invoke(obj);
        }
        m.f(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (BaseTextPreparedSelection) obj;
    }

    private final int charOffset(int offset) {
        int length = getText$foundation_release().length() - 1;
        return offset > length ? length : offset;
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i2), true));
    }

    public static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.transformedMaxOffset();
        }
        return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i2);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i2)));
    }

    public static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.transformedMinOffset();
        }
        return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i2);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i2) {
        while (i2 < this.originalText.length()) {
            long jM4785getWordBoundaryjx7JFs = textLayoutResult.m4785getWordBoundaryjx7JFs(charOffset(i2));
            if (TextRange.m4806getEndimpl(jM4785getWordBoundaryjx7JFs) > i2) {
                return this.offsetMapping.transformedToOriginal(TextRange.m4806getEndimpl(jM4785getWordBoundaryjx7JFs));
            }
            i2++;
        }
        return this.originalText.length();
    }

    public static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i2);
    }

    private final int getParagraphEnd() {
        return StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m4808getMaximpl(this.selection));
    }

    private final int getParagraphStart() {
        return StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m4809getMinimpl(this.selection));
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i2) {
        while (i2 > 0) {
            long jM4785getWordBoundaryjx7JFs = textLayoutResult.m4785getWordBoundaryjx7JFs(charOffset(i2));
            if (TextRange.m4811getStartimpl(jM4785getWordBoundaryjx7JFs) < i2) {
                return this.offsetMapping.transformedToOriginal(TextRange.m4811getStartimpl(jM4785getWordBoundaryjx7JFs));
            }
            i2--;
        }
        return 0;
    }

    public static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i3 & 1) != 0) {
            i2 = baseTextPreparedSelection.transformedEndOffset();
        }
        return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i2);
    }

    private final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.getParagraphDirection(transformedEndOffset()) : null) != ResolvedTextDirection.Rtl;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i2) {
        int iTransformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(iTransformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iTransformedEndOffset) + i2;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        m.e(cachedX);
        float fFloatValue = cachedX.floatValue();
        if ((isLtr() && fFloatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && fFloatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m4783getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom)));
    }

    private final T moveCursorNext() {
        int nextCharacterIndex;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        return this;
    }

    private final T moveCursorNextByWord() {
        Integer nextWordOffset;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        return this;
    }

    private final T moveCursorPrev() {
        int precedingCharacterIndex;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        return this;
    }

    private final T moveCursorPrevByWord() {
        Integer previousWordOffset;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        return this;
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m4806getEndimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m4808getMaximpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m4809getMinimpl(this.selection));
    }

    public final <U> T apply(U u, boolean z, l<? super U, j> lVar) {
        m.h(lVar, "block");
        if (z) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            lVar.invoke(u);
        }
        m.f(u, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u;
    }

    public final T collapseLeftOr(l<? super T, j> or) {
        m.h(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m4805getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m4809getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m4808getMaximpl(this.selection));
            }
        }
        return this;
    }

    public final T collapseRightOr(l<? super T, j> or) {
        m.h(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m4805getCollapsedimpl(this.selection)) {
                or.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m4808getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m4809getMinimpl(this.selection));
            }
        }
        return this;
    }

    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(TextRange.m4806getEndimpl(this.selection));
        }
        return this;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m4806getEndimpl(this.selection));
    }

    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getOriginalSelection() {
        return this.originalSelection;
    }

    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m4806getEndimpl(this.selection));
    }

    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    public final T moveCursorDownByLine() {
        TextLayoutResult textLayoutResult;
        if ((getText$foundation_release().length() > 0) && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        return this;
    }

    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphEnd());
        }
        return this;
    }

    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphStart());
        }
        return this;
    }

    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getText$foundation_release().length());
        }
        return this;
    }

    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(0);
        }
        return this;
    }

    public final T moveCursorToLineEnd() {
        Integer lineEndByOffset;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        return this;
    }

    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    public final T moveCursorToLineStart() {
        Integer lineStartByOffset;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        return this;
    }

    public final T moveCursorUpByLine() {
        TextLayoutResult textLayoutResult;
        if ((getText$foundation_release().length() > 0) && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        return this;
    }

    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        return this;
    }

    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m4811getStartimpl(this.originalSelection), TextRange.m4806getEndimpl(this.selection));
        }
        return this;
    }

    public final void setAnnotatedString(AnnotatedString annotatedString) {
        m.h(annotatedString, "<set-?>");
        this.annotatedString = annotatedString;
    }

    public final void setCursor(int i2) {
        setSelection(i2, i2);
    }

    public final void setSelection(int i2, int i3) {
        this.selection = TextRangeKt.TextRange(i2, i3);
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m915setSelection5zctL8(long j) {
        this.selection = j;
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j;
        this.annotatedString = annotatedString;
    }
}
