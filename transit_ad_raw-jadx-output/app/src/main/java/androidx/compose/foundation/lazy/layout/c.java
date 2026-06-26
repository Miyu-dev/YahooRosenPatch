package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;

/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class c {
    @Stable
    public static float a(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        if (!TextUnitType.m5476equalsimpl0(TextUnit.m5447getTypeUIouoOA(j), TextUnitType.INSTANCE.m5481getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m5267constructorimpl(lazyLayoutMeasureScope.getFontScale() * TextUnit.m5448getValueimpl(j));
    }

    @Stable
    public static float b(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return Dp.m5267constructorimpl(f / lazyLayoutMeasureScope.getDensity());
    }

    @Stable
    public static float c(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2) {
        return Dp.m5267constructorimpl(i2 / lazyLayoutMeasureScope.getDensity());
    }

    @Stable
    public static long d(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        return (j > Size.INSTANCE.m2662getUnspecifiedNHjbRc() ? 1 : (j == Size.INSTANCE.m2662getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m5289DpSizeYgX7TsA(lazyLayoutMeasureScope.mo344toDpu2uoSUM(Size.m2654getWidthimpl(j)), lazyLayoutMeasureScope.mo344toDpu2uoSUM(Size.m2651getHeightimpl(j))) : DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ();
    }

    @Stable
    public static long e(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        return (j > DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ() ? 1 : (j == DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(lazyLayoutMeasureScope.mo348toPx0680j_4(DpSize.m5365getWidthD9Ej5fM(j)), lazyLayoutMeasureScope.mo348toPx0680j_4(DpSize.m5363getHeightD9Ej5fM(j))) : Size.INSTANCE.m2662getUnspecifiedNHjbRc();
    }

    @Stable
    public static long f(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return TextUnitKt.getSp(f / lazyLayoutMeasureScope.getFontScale());
    }

    @Stable
    public static long g(LazyLayoutMeasureScope lazyLayoutMeasureScope, float f) {
        return TextUnitKt.getSp(f / (lazyLayoutMeasureScope.getDensity() * lazyLayoutMeasureScope.getFontScale()));
    }

    @Stable
    public static long h(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2) {
        return TextUnitKt.getSp(i2 / (lazyLayoutMeasureScope.getDensity() * lazyLayoutMeasureScope.getFontScale()));
    }
}
