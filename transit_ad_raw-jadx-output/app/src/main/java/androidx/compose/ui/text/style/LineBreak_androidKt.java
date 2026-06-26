package androidx.compose.ui.text.style;

import androidx.appcompat.R;
import androidx.compose.ui.text.input.PartialGapBuffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: LineBreak.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¨\u0006\t"}, d2 = {"packBytes", "", "i1", "i2", "i3", "unpackByte1", "mask", "unpackByte2", "unpackByte3", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LineBreak_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int packBytes(int i2, int i3, int i4) {
        return i2 | (i3 << 8) | (i4 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte1(int i2) {
        return i2 & PartialGapBuffer.BUF_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte2(int i2) {
        return (i2 >> 8) & PartialGapBuffer.BUF_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte3(int i2) {
        return (i2 >> 16) & PartialGapBuffer.BUF_SIZE;
    }
}
