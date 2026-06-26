package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class c {
    public static void a(Canvas canvas, Rect rect, int i2) {
        m.h(rect, "rect");
        canvas.mo2680clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i2);
    }

    public static void b(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
        m.h(rect, "rect");
        m.h(paint, "paint");
        canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2, z, paint);
    }

    public static void c(Canvas canvas, Rect rect, float f, float f2, boolean z, Paint paint) {
        m.h(rect, "rect");
        m.h(paint, "paint");
        canvas.drawArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2), z, paint);
    }

    public static void d(Canvas canvas, Rect rect, Paint paint) {
        m.h(rect, "rect");
        m.h(paint, "paint");
        canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    public static void e(Canvas canvas, Rect rect, Paint paint) {
        m.h(rect, "rect");
        m.h(paint, "paint");
        canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    public static void f(Canvas canvas, float f, float f2) {
        canvas.skew(DegreesKt.degrees(f), DegreesKt.degrees(f2));
    }

    public static /* synthetic */ void m(Canvas canvas, Path path, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i3 & 2) != 0) {
            i2 = ClipOp.INSTANCE.m2807getIntersectrtfAjoo();
        }
        canvas.mo2679clipPathmtrdDE(path, i2);
    }

    public static /* synthetic */ void n(Canvas canvas, float f, float f2, float f3, float f4, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i3 & 16) != 0) {
            i2 = ClipOp.INSTANCE.m2807getIntersectrtfAjoo();
        }
        canvas.mo2680clipRectN_I0leg(f, f2, f3, f4, i2);
    }

    public static /* synthetic */ void o(Canvas canvas, Rect rect, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i3 & 2) != 0) {
            i2 = ClipOp.INSTANCE.m2807getIntersectrtfAjoo();
        }
        canvas.mo2681clipRectmtrdDE(rect, i2);
    }

    public static /* synthetic */ void p(Canvas canvas, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, Paint paint, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jM5395getZeronOccac = (i2 & 2) != 0 ? IntOffset.INSTANCE.m5395getZeronOccac() : j;
        long jIntSize = (i2 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
        canvas.mo2685drawImageRectHPBpro0(imageBitmap, jM5395getZeronOccac, jIntSize, (i2 & 8) != 0 ? IntOffset.INSTANCE.m5395getZeronOccac() : j3, (i2 & 16) != 0 ? jIntSize : j4, paint);
    }

    public static /* synthetic */ void q(Canvas canvas, float f, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i2 & 2) != 0) {
            f2 = f;
        }
        canvas.scale(f, f2);
    }
}
