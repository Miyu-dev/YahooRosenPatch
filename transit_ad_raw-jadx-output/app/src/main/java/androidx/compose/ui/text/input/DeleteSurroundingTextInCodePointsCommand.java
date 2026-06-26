package androidx.compose.ui.text.input;

import androidx.appcompat.widget.v;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: EditCommand.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "Lkotlin/j;", "applyTo", "", "other", "", "equals", "", "hashCode", "", "toString", "lengthBeforeCursor", "I", "getLengthBeforeCursor", "()I", "lengthAfterCursor", "getLengthAfterCursor", "<init>", "(II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i2, int i3) {
        this.lengthBeforeCursor = i2;
        this.lengthAfterCursor = i3;
        if (!(i2 >= 0 && i3 >= 0)) {
            throw new IllegalArgumentException(v.f("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i2, " and ", i3, " respectively.").toString());
        }
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer) {
        m.h(editingBuffer, "buffer");
        int i2 = this.lengthBeforeCursor;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3++;
            if (editingBuffer.getSelectionStart() > i3 && EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionStart() - i3) - 1), editingBuffer.get$ui_text_release(editingBuffer.getSelectionStart() - i3))) {
                i3++;
            }
            if (i3 == editingBuffer.getSelectionStart()) {
                break;
            }
        }
        int i5 = this.lengthAfterCursor;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6++;
            if (editingBuffer.getSelectionEnd() + i6 < editingBuffer.getLength$ui_text_release() && EditCommandKt.isSurrogatePair(editingBuffer.get$ui_text_release((editingBuffer.getSelectionEnd() + i6) - 1), editingBuffer.get$ui_text_release(editingBuffer.getSelectionEnd() + i6))) {
                i6++;
            }
            if (editingBuffer.getSelectionEnd() + i6 == editingBuffer.getLength$ui_text_release()) {
                break;
            }
        }
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionEnd(), editingBuffer.getSelectionEnd() + i6);
        editingBuffer.delete$ui_text_release(editingBuffer.getSelectionStart() - i3, editingBuffer.getSelectionStart());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) other;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return android.support.v4.media.a.f(sb, this.lengthAfterCursor, ')');
    }
}
