package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: compiled from: DrawTransform.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class c {
    public static long a(DrawTransform drawTransform) {
        float f = 2;
        return OffsetKt.Offset(Size.m2654getWidthimpl(drawTransform.mo3265getSizeNHjbRc()) / f, Size.m2651getHeightimpl(drawTransform.mo3265getSizeNHjbRc()) / f);
    }

    public static /* synthetic */ void c(DrawTransform drawTransform, Path path, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i3 & 2) != 0) {
            i2 = ClipOp.INSTANCE.m2807getIntersectrtfAjoo();
        }
        drawTransform.mo3262clipPathmtrdDE(path, i2);
    }

    public static /* synthetic */ void d(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i3 & 1) != 0) {
            f = 0.0f;
        }
        if ((i3 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i3 & 4) != 0) {
            f3 = Size.m2654getWidthimpl(drawTransform.mo3265getSizeNHjbRc());
        }
        if ((i3 & 8) != 0) {
            f4 = Size.m2651getHeightimpl(drawTransform.mo3265getSizeNHjbRc());
        }
        if ((i3 & 16) != 0) {
            i2 = ClipOp.INSTANCE.m2807getIntersectrtfAjoo();
        }
        drawTransform.mo3263clipRectN_I0leg(f, f2, f3, f4, i2);
    }

    public static /* synthetic */ void e(DrawTransform drawTransform, float f, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i2 & 2) != 0) {
            j = drawTransform.mo3264getCenterF1C5BW0();
        }
        drawTransform.mo3266rotateUv8p0NA(f, j);
    }

    public static /* synthetic */ void f(DrawTransform drawTransform, float f, float f2, long j, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i2 & 4) != 0) {
            j = drawTransform.mo3264getCenterF1C5BW0();
        }
        drawTransform.mo3267scale0AR0LA0(f, f2, j);
    }

    public static /* synthetic */ void g(DrawTransform drawTransform, float f, float f2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.translate(f, f2);
    }
}
