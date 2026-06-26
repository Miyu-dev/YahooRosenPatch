package androidx.compose.ui.text.input;

import a6.h;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 G2\u00020\u0001:\u0001GB\u001a\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010>\u001a\u000208ø\u0001\u0000¢\u0006\u0004\bD\u0010EB\u001c\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0014\u0012\u0006\u0010>\u001a\u000208ø\u0001\u0000¢\u0006\u0004\bD\u0010FJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0011\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010!\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u001eJ\b\u0010\"\u001a\u00020\u0014H\u0016J\u000f\u0010%\u001a\u00020\u000eH\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R$\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R$\u00106\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u001f\u0010;\u001a\u0004\u0018\u0001088@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001d\u0010>\u001a\u0002088@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b<\u0010=R$\u0010?\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b@\u0010-\"\u0004\bA\u0010/R\u0014\u0010C\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "", "hasComposition$ui_text_release", "()Z", "hasComposition", "", "index", "", "get$ui_text_release", "(I)C", "get", "start", "end", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lkotlin/j;", "replace$ui_text_release", "(IILandroidx/compose/ui/text/AnnotatedString;)V", "replace", "", "(IILjava/lang/String;)V", "delete$ui_text_release", "(II)V", "delete", "setSelection$ui_text_release", "setSelection", "setComposition$ui_text_release", "setComposition", "cancelComposition$ui_text_release", "()V", "cancelComposition", "commitComposition$ui_text_release", "commitComposition", "toString", "toAnnotatedString$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString;", "toAnnotatedString", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "value", "selectionStart", "I", "getSelectionStart$ui_text_release", "()I", "setSelectionStart", "(I)V", "selectionEnd", "getSelectionEnd$ui_text_release", "setSelectionEnd", "<set-?>", "compositionStart", "getCompositionStart$ui_text_release", "compositionEnd", "getCompositionEnd$ui_text_release", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA$ui_text_release", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text_release", "()J", "selection", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "getLength$ui_text_release", "length", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    private final void setSelectionEnd(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.c("Cannot set selectionEnd to a negative value: ", i2).toString());
        }
        this.selectionEnd = i2;
    }

    private final void setSelectionStart(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.c("Cannot set selectionStart to a negative value: ", i2).toString());
        }
        this.selectionStart = i2;
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int start, int end) {
        long jTextRange = TextRangeKt.TextRange(start, end);
        this.gapBuffer.replace(start, end, "");
        long jM4942updateRangeAfterDeletepWDy79M = EditingBufferKt.m4942updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m4809getMinimpl(jM4942updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m4808getMaximpl(jM4942updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text_release()) {
            long jM4942updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m4942updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m4805getCollapsedimpl(jM4942updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.compositionStart = TextRange.m4809getMinimpl(jM4942updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m4808getMaximpl(jM4942updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int index) {
        return this.gapBuffer.get(index);
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final TextRange m4940getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return TextRange.m4799boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: getCompositionEnd$ui_text_release, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    /* JADX INFO: renamed from: getCompositionStart$ui_text_release, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i2 = this.selectionStart;
        int i3 = this.selectionEnd;
        if (i2 == i3) {
            return i3;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m4941getSelectiond9O1mEE$ui_text_release() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    /* JADX INFO: renamed from: getSelectionEnd$ui_text_release, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* JADX INFO: renamed from: getSelectionStart$ui_text_release, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int start, int end, AnnotatedString text) {
        m.h(text, "text");
        replace$ui_text_release(start, end, text.getText());
    }

    public final void setComposition$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbG = androidx.appcompat.view.menu.a.g("start (", start, ") offset is outside of text region ");
            sbG.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbG.toString());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            StringBuilder sbG2 = androidx.appcompat.view.menu.a.g("end (", end, ") offset is outside of text region ");
            sbG2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbG2.toString());
        }
        if (start >= end) {
            throw new IllegalArgumentException(h.d("Do not set reversed or empty range: ", start, " > ", end));
        }
        this.compositionStart = start;
        this.compositionEnd = end;
    }

    public final void setCursor$ui_text_release(int i2) {
        setSelection$ui_text_release(i2, i2);
    }

    public final void setSelection$ui_text_release(int start, int end) {
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbG = androidx.appcompat.view.menu.a.g("start (", start, ") offset is outside of text region ");
            sbG.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbG.toString());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            StringBuilder sbG2 = androidx.appcompat.view.menu.a.g("end (", end, ") offset is outside of text region ");
            sbG2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbG2.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(h.d("Do not set reversed range: ", start, " > ", end));
        }
        setSelectionStart(start);
        setSelectionEnd(end);
    }

    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.gapBuffer.toString();
    }

    public /* synthetic */ EditingBuffer(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    public final void replace$ui_text_release(int start, int end, String text) {
        m.h(text, "text");
        if (start < 0 || start > this.gapBuffer.getLength()) {
            StringBuilder sbG = androidx.appcompat.view.menu.a.g("start (", start, ") offset is outside of text region ");
            sbG.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbG.toString());
        }
        if (end < 0 || end > this.gapBuffer.getLength()) {
            StringBuilder sbG2 = androidx.appcompat.view.menu.a.g("end (", end, ") offset is outside of text region ");
            sbG2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sbG2.toString());
        }
        if (start > end) {
            throw new IllegalArgumentException(h.d("Do not set reversed range: ", start, " > ", end));
        }
        this.gapBuffer.replace(start, end, text);
        setSelectionStart(text.length() + start);
        setSelectionEnd(text.length() + start);
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m4809getMinimpl(j);
        this.selectionEnd = TextRange.m4808getMaximpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM4809getMinimpl = TextRange.m4809getMinimpl(j);
        int iM4808getMaximpl = TextRange.m4808getMaximpl(j);
        if (iM4809getMinimpl >= 0 && iM4809getMinimpl <= annotatedString.length()) {
            if (iM4808getMaximpl < 0 || iM4808getMaximpl > annotatedString.length()) {
                StringBuilder sbG = androidx.appcompat.view.menu.a.g("end (", iM4808getMaximpl, ") offset is outside of text region ");
                sbG.append(annotatedString.length());
                throw new IndexOutOfBoundsException(sbG.toString());
            }
            if (iM4809getMinimpl > iM4808getMaximpl) {
                throw new IllegalArgumentException(h.d("Do not set reversed range: ", iM4809getMinimpl, " > ", iM4808getMaximpl));
            }
            return;
        }
        StringBuilder sbG2 = androidx.appcompat.view.menu.a.g("start (", iM4809getMinimpl, ") offset is outside of text region ");
        sbG2.append(annotatedString.length());
        throw new IndexOutOfBoundsException(sbG2.toString());
    }

    private EditingBuffer(String str, long j) {
        this(new AnnotatedString(str, null, null, 6, null), j, (DefaultConstructorMarker) null);
    }
}
