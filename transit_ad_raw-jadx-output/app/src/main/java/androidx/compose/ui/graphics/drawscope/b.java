package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class b {
    static {
        DrawScope.Companion companion = DrawScope.INSTANCE;
    }

    public static /* synthetic */ void A(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo3240drawImagegbVJVH8(imageBitmap, (i3 & 2) != 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j, (i3 & 4) != 0 ? 1.0f : f, (i3 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 16) != 0 ? null : colorFilter, (i3 & 32) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void B(DrawScope drawScope, Brush brush, long j, long j2, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo3241drawLine1RTmtNc(brush, j, j2, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? Stroke.INSTANCE.m3343getDefaultCapKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : colorFilter, (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i3);
    }

    public static /* synthetic */ void C(DrawScope drawScope, long j, long j2, long j3, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo3242drawLineNGM6Ib0(j, j2, j3, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? Stroke.INSTANCE.m3343getDefaultCapKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : colorFilter, (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i3);
    }

    public static /* synthetic */ void D(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM2601getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j;
        drawScope.mo3243drawOvalAsUm42w(brush, jM2601getZeroF1C5BW0, (i3 & 4) != 0 ? d(drawScope, drawScope.mo3254getSizeNHjbRc(), jM2601getZeroF1C5BW0) : j2, (i3 & 8) != 0 ? 1.0f : f, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void E(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM2601getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j2;
        drawScope.mo3244drawOvalnJ9OG0(j, jM2601getZeroF1C5BW0, (i3 & 4) != 0 ? d(drawScope, drawScope.mo3254getSizeNHjbRc(), jM2601getZeroF1C5BW0) : j3, (i3 & 8) != 0 ? 1.0f : f, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void F(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i3 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i3 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i3 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i3 & 32) != 0) {
            i2 = DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo3245drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i2);
    }

    public static /* synthetic */ void G(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        drawScope.mo3246drawPathLG529CI(path, j, (i3 & 4) != 0 ? 1.0f : f, (i3 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 16) != 0 ? null : colorFilter, (i3 & 32) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void H(DrawScope drawScope, List list, int i2, long j, float f, int i3, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo3247drawPointsF8ZwMP8(list, i2, j, (i5 & 8) != 0 ? 0.0f : f, (i5 & 16) != 0 ? StrokeCap.INSTANCE.m3141getButtKaPHkGw() : i3, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f2, (i5 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : colorFilter, (i5 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i4);
    }

    public static /* synthetic */ void I(DrawScope drawScope, List list, int i2, Brush brush, float f, int i3, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo3248drawPointsGsft0Ws(list, i2, brush, (i5 & 8) != 0 ? 0.0f : f, (i5 & 16) != 0 ? StrokeCap.INSTANCE.m3141getButtKaPHkGw() : i3, (i5 & 32) != 0 ? null : pathEffect, (i5 & 64) != 0 ? 1.0f : f2, (i5 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : colorFilter, (i5 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i4);
    }

    public static /* synthetic */ void J(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM2601getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j;
        drawScope.mo3249drawRectAsUm42w(brush, jM2601getZeroF1C5BW0, (i3 & 4) != 0 ? d(drawScope, drawScope.mo3254getSizeNHjbRc(), jM2601getZeroF1C5BW0) : j2, (i3 & 8) != 0 ? 1.0f : f, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void K(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM2601getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j2;
        drawScope.mo3250drawRectnJ9OG0(j, jM2601getZeroF1C5BW0, (i3 & 4) != 0 ? d(drawScope, drawScope.mo3254getSizeNHjbRc(), jM2601getZeroF1C5BW0) : j3, (i3 & 8) != 0 ? 1.0f : f, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void L(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM2601getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j;
        drawScope.mo3251drawRoundRectZuiqVtQ(brush, jM2601getZeroF1C5BW0, (i3 & 4) != 0 ? d(drawScope, drawScope.mo3254getSizeNHjbRc(), jM2601getZeroF1C5BW0) : j2, (i3 & 8) != 0 ? CornerRadius.INSTANCE.m2570getZerokKHJgLs() : j3, (i3 & 16) != 0 ? 1.0f : f, (i3 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 64) != 0 ? null : colorFilter, (i3 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void M(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM2601getZeroF1C5BW0 = (i3 & 2) != 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j2;
        drawScope.mo3252drawRoundRectuAw5IA(j, jM2601getZeroF1C5BW0, (i3 & 4) != 0 ? d(drawScope, drawScope.mo3254getSizeNHjbRc(), jM2601getZeroF1C5BW0) : j3, (i3 & 8) != 0 ? CornerRadius.INSTANCE.m2570getZerokKHJgLs() : j4, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? null : colorFilter, (i3 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static void a(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
        m.h(imageBitmap, "image");
        m.h(drawStyle, "style");
        z(drawScope, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i2, 0, Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING, null);
    }

    public static long b(DrawScope drawScope) {
        return SizeKt.m2664getCenteruvyYCjk(drawScope.getDrawContext().mo3260getSizeNHjbRc());
    }

    public static long c(DrawScope drawScope) {
        return drawScope.getDrawContext().mo3260getSizeNHjbRc();
    }

    public static long d(DrawScope drawScope, long j, long j2) {
        return SizeKt.Size(Size.m2654getWidthimpl(j) - Offset.m2585getXimpl(j2), Size.m2651getHeightimpl(j) - Offset.m2586getYimpl(j2));
    }

    public static /* synthetic */ void u(DrawScope drawScope, Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jM2601getZeroF1C5BW0 = (i3 & 16) != 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j;
        drawScope.mo3234drawArcillE91I(brush, f, f2, z, jM2601getZeroF1C5BW0, (i3 & 32) != 0 ? d(drawScope, drawScope.mo3254getSizeNHjbRc(), jM2601getZeroF1C5BW0) : j2, (i3 & 64) != 0 ? 1.0f : f3, (i3 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Fill.INSTANCE : drawStyle, (i3 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? null : colorFilter, (i3 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void v(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM2601getZeroF1C5BW0 = (i3 & 16) != 0 ? Offset.INSTANCE.m2601getZeroF1C5BW0() : j2;
        drawScope.mo3235drawArcyD3GUKo(j, f, f2, z, jM2601getZeroF1C5BW0, (i3 & 32) != 0 ? d(drawScope, drawScope.mo3254getSizeNHjbRc(), jM2601getZeroF1C5BW0) : j3, (i3 & 64) != 0 ? 1.0f : f3, (i3 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Fill.INSTANCE : drawStyle, (i3 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? null : colorFilter, (i3 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void w(DrawScope drawScope, Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo3236drawCircleV9BoPsw(brush, (i3 & 2) != 0 ? Size.m2653getMinDimensionimpl(drawScope.mo3254getSizeNHjbRc()) / 2.0f : f, (i3 & 4) != 0 ? drawScope.mo3253getCenterF1C5BW0() : j, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void x(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        drawScope.mo3237drawCircleVaOC9Bg(j, (i3 & 2) != 0 ? Size.m2653getMinDimensionimpl(drawScope.mo3254getSizeNHjbRc()) / 2.0f : f, (i3 & 4) != 0 ? drawScope.mo3253getCenterF1C5BW0() : j2, (i3 & 8) != 0 ? 1.0f : f2, (i3 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 32) != 0 ? null : colorFilter, (i3 & 64) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void y(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM5395getZeronOccac = (i3 & 2) != 0 ? IntOffset.INSTANCE.m5395getZeronOccac() : j;
        long jIntSize = (i3 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
        drawScope.mo3238drawImage9jGpkUE(imageBitmap, jM5395getZeronOccac, jIntSize, (i3 & 8) != 0 ? IntOffset.INSTANCE.m5395getZeronOccac() : j3, (i3 & 16) != 0 ? jIntSize : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i3 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : colorFilter, (i3 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void z(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM5395getZeronOccac = (i4 & 2) != 0 ? IntOffset.INSTANCE.m5395getZeronOccac() : j;
        long jIntSize = (i4 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
        drawScope.mo3239drawImageAZ2fEMs(imageBitmap, jM5395getZeronOccac, jIntSize, (i4 & 8) != 0 ? IntOffset.INSTANCE.m5395getZeronOccac() : j3, (i4 & 16) != 0 ? jIntSize : j4, (i4 & 32) != 0 ? 1.0f : f, (i4 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : colorFilter, (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2, (i4 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? DrawScope.INSTANCE.m3285getDefaultFilterQualityfv9h1I() : i3);
    }
}
