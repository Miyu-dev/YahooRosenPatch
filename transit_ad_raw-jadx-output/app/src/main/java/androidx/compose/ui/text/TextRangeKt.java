package androidx.compose.ui.text;

import a.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a)\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"TextRange", "Landroidx/compose/ui/text/TextRange;", "index", "", "(I)J", "start", "end", "(II)J", "packWithCheck", "", "constrain", "minimumValue", "maximumValue", "constrain-8ffj60Q", "(JII)J", "substring", "", "", "range", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class TextRangeKt {
    public static final long TextRange(int i2, int i3) {
        return TextRange.m4800constructorimpl(packWithCheck(i2, i3));
    }

    /* JADX INFO: renamed from: constrain-8ffj60Q, reason: not valid java name */
    public static final long m4817constrain8ffj60Q(long j, int i2, int i3) {
        int i4 = l.i(TextRange.m4811getStartimpl(j), i2, i3);
        int i5 = l.i(TextRange.m4806getEndimpl(j), i2, i3);
        return (i4 == TextRange.m4811getStartimpl(j) && i5 == TextRange.m4806getEndimpl(j)) ? j : TextRange(i4, i5);
    }

    private static final long packWithCheck(int i2, int i3) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i2 + ", end: " + i3 + ']').toString());
        }
        if (i3 >= 0) {
            return (((long) i3) & 4294967295L) | (((long) i2) << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i2 + ", end: " + i3 + ']').toString());
    }

    /* JADX INFO: renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m4818substringFDrldGo(CharSequence charSequence, long j) {
        m.h(charSequence, "$this$substring");
        return charSequence.subSequence(TextRange.m4809getMinimpl(j), TextRange.m4808getMaximpl(j)).toString();
    }

    public static final long TextRange(int i2) {
        return TextRange(i2, i2);
    }
}
