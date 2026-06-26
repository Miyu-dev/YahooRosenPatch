package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m4942updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM4807getLengthimpl;
        int iM4809getMinimpl = TextRange.m4809getMinimpl(j);
        int iM4808getMaximpl = TextRange.m4808getMaximpl(j);
        if (TextRange.m4813intersects5zctL8(j2, j)) {
            if (TextRange.m4801contains5zctL8(j2, j)) {
                iM4809getMinimpl = TextRange.m4809getMinimpl(j2);
                iM4808getMaximpl = iM4809getMinimpl;
            } else {
                if (TextRange.m4801contains5zctL8(j, j2)) {
                    iM4807getLengthimpl = TextRange.m4807getLengthimpl(j2);
                } else if (TextRange.m4802containsimpl(j2, iM4809getMinimpl)) {
                    iM4809getMinimpl = TextRange.m4809getMinimpl(j2);
                    iM4807getLengthimpl = TextRange.m4807getLengthimpl(j2);
                } else {
                    iM4808getMaximpl = TextRange.m4809getMinimpl(j2);
                }
                iM4808getMaximpl -= iM4807getLengthimpl;
            }
        } else if (iM4808getMaximpl > TextRange.m4809getMinimpl(j2)) {
            iM4809getMinimpl -= TextRange.m4807getLengthimpl(j2);
            iM4807getLengthimpl = TextRange.m4807getLengthimpl(j2);
            iM4808getMaximpl -= iM4807getLengthimpl;
        }
        return TextRangeKt.TextRange(iM4809getMinimpl, iM4808getMaximpl);
    }
}
