package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class f {
    static {
        Path.Companion companion = Path.INSTANCE;
    }

    public static void a(Path path, Rect rect, float f, float f2, boolean z) {
        m.h(rect, "rect");
        path.arcTo(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z);
    }

    public static /* synthetic */ void c(Path path, Path path2, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i2 & 2) != 0) {
            j = Offset.INSTANCE.m2601getZeroF1C5BW0();
        }
        path.mo2717addPathUv8p0NA(path2, j);
    }
}
