package androidx.compose.foundation.text;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: StringHelpers.jvm.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"appendCodePointX", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "codePoint", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StringHelpers_jvmKt {
    public static final StringBuilder appendCodePointX(StringBuilder sb, int i2) {
        m.h(sb, "<this>");
        StringBuilder sbAppendCodePoint = sb.appendCodePoint(i2);
        m.g(sbAppendCodePoint, "appendCodePointX");
        return sbAppendCodePoint;
    }
}
