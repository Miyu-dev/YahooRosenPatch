package androidx.compose.ui.unit;

import a.f;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a {
    @Stable
    public static int a(Density density, long j) {
        return f.f0(density.mo347toPxR2X_6o(j));
    }

    @Stable
    public static int b(Density density, float f) {
        float fMo348toPx0680j_4 = density.mo348toPx0680j_4(f);
        if (Float.isInfinite(fMo348toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return f.f0(fMo348toPx0680j_4);
    }

    @Stable
    public static float c(Density density, long j) {
        if (!TextUnitType.m5476equalsimpl0(TextUnit.m5447getTypeUIouoOA(j), TextUnitType.INSTANCE.m5481getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return Dp.m5267constructorimpl(density.getFontScale() * TextUnit.m5448getValueimpl(j));
    }

    @Stable
    public static float d(Density density, float f) {
        return Dp.m5267constructorimpl(f / density.getDensity());
    }

    @Stable
    public static float e(Density density, int i2) {
        return Dp.m5267constructorimpl(i2 / density.getDensity());
    }

    @Stable
    public static long f(Density density, long j) {
        return (j > Size.INSTANCE.m2662getUnspecifiedNHjbRc() ? 1 : (j == Size.INSTANCE.m2662getUnspecifiedNHjbRc() ? 0 : -1)) != 0 ? DpKt.m5289DpSizeYgX7TsA(density.mo344toDpu2uoSUM(Size.m2654getWidthimpl(j)), density.mo344toDpu2uoSUM(Size.m2651getHeightimpl(j))) : DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ();
    }

    @Stable
    public static float g(Density density, long j) {
        if (!TextUnitType.m5476equalsimpl0(TextUnit.m5447getTypeUIouoOA(j), TextUnitType.INSTANCE.m5481getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return density.getDensity() * density.getFontScale() * TextUnit.m5448getValueimpl(j);
    }

    @Stable
    public static float h(Density density, float f) {
        return density.getDensity() * f;
    }

    @Stable
    public static Rect i(Density density, DpRect dpRect) {
        m.h(dpRect, "<this>");
        return new Rect(density.mo348toPx0680j_4(dpRect.m5350getLeftD9Ej5fM()), density.mo348toPx0680j_4(dpRect.m5352getTopD9Ej5fM()), density.mo348toPx0680j_4(dpRect.m5351getRightD9Ej5fM()), density.mo348toPx0680j_4(dpRect.m5349getBottomD9Ej5fM()));
    }

    @Stable
    public static long j(Density density, long j) {
        return (j > DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ() ? 1 : (j == DpSize.INSTANCE.m5374getUnspecifiedMYxV2XQ() ? 0 : -1)) != 0 ? SizeKt.Size(density.mo348toPx0680j_4(DpSize.m5365getWidthD9Ej5fM(j)), density.mo348toPx0680j_4(DpSize.m5363getHeightD9Ej5fM(j))) : Size.INSTANCE.m2662getUnspecifiedNHjbRc();
    }

    @Stable
    public static long k(Density density, float f) {
        return TextUnitKt.getSp(f / density.getFontScale());
    }

    @Stable
    public static long l(Density density, float f) {
        return TextUnitKt.getSp(f / (density.getDensity() * density.getFontScale()));
    }

    @Stable
    public static long m(Density density, int i2) {
        return TextUnitKt.getSp(i2 / (density.getDensity() * density.getFontScale()));
    }
}
