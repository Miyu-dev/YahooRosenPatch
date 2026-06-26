package androidx.compose.foundation.interaction;

import androidx.appcompat.R;
import kotlin.Metadata;

/* JADX INFO: compiled from: InteractionSource.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"MutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class InteractionSourceKt {
    public static final MutableInteractionSource MutableInteractionSource() {
        return new MutableInteractionSourceImpl();
    }
}
