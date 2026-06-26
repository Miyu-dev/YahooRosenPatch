package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"ensureAtLeastOneChar", "Landroidx/compose/ui/text/TextRange;", "text", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "lastOffset", "isStartHandle", "", "previousHandlesCrossed", "(Ljava/lang/String;IIZZ)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SelectionAdjustmentKt {
    public static final long ensureAtLeastOneChar(String str, int i2, int i3, boolean z, boolean z2) {
        m.h(str, "text");
        return i3 == 0 ? TextRangeKt.TextRange(i2, i2) : i2 == 0 ? z ? TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(str, 0), 0) : TextRangeKt.TextRange(0, StringHelpers_androidKt.findFollowingBreak(str, 0)) : i2 == i3 ? z ? TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(str, i3), i3) : TextRangeKt.TextRange(i3, StringHelpers_androidKt.findPrecedingBreak(str, i3)) : z ? !z2 ? TextRangeKt.TextRange(StringHelpers_androidKt.findPrecedingBreak(str, i2), i2) : TextRangeKt.TextRange(StringHelpers_androidKt.findFollowingBreak(str, i2), i2) : !z2 ? TextRangeKt.TextRange(i2, StringHelpers_androidKt.findFollowingBreak(str, i2)) : TextRangeKt.TextRange(i2, StringHelpers_androidKt.findPrecedingBreak(str, i2));
    }
}
