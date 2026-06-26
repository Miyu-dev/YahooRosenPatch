package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidScrollable.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"platformScrollConfig", "Landroidx/compose/foundation/gestures/ScrollConfig;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/ScrollConfig;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AndroidScrollable_androidKt {
    @Composable
    public static final ScrollConfig platformScrollConfig(Composer composer, int i2) {
        composer.startReplaceableGroup(-1485272842);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485272842, i2, -1, "androidx.compose.foundation.gestures.platformScrollConfig (AndroidScrollable.android.kt:27)");
        }
        AndroidConfig androidConfig = AndroidConfig.INSTANCE;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidConfig;
    }
}
