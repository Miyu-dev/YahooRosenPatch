package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\b\u0087@\u0018\u0000 H2\u00020\u0001:\u0001HB\u0014\u0012\b\b\u0002\u0010B\u001a\u00020Aø\u0001\u0001¢\u0006\u0004\bF\u0010GJ \u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0086\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0018J\u001e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\r\u0010%\u001a\u00020\n¢\u0006\u0004\b$\u0010\"J\u001b\u0010(\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u001bJ\u0015\u0010,\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b-\u0010+J\u0015\u00100\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b/\u0010+J+\u00106\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0005¢\u0006\u0004\b4\u00105J+\u00108\u001a\u00020\n2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0005¢\u0006\u0004\b7\u00105J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010@\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\u0088\u0001B\u0092\u0001\u00020Aø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006I"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "", "row", "column", "", "get-impl", "([FII)F", "get", "v", "Lkotlin/j;", "set-impl", "([FIIF)V", "set", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "map", "Landroidx/compose/ui/geometry/Rect;", "rect", "map-impl", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "m", "timesAssign-58bKbWc", "([F[F)V", "timesAssign", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "invert-impl", "([F)V", "invert", "reset-impl", "reset", "matrix", "setFrom-58bKbWc", "setFrom", "degrees", "rotateX-impl", "([FF)V", "rotateX", "rotateY-impl", "rotateY", "rotateZ-impl", "rotateZ", "x", "y", "z", "scale-impl", "([FFFF)V", "scale", "translate-impl", "translate", "hashCode-impl", "([F)I", "hashCode", "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "", "values", "[F", "getValues", "()[F", "constructor-impl", "([F)[F", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class Matrix {
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m3021boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m3022constructorimpl(float[] fArr) {
        m.h(fArr, "values");
        return fArr;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m3023constructorimpl$default(float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m3022constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3024equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && m.c(fArr, ((Matrix) obj).m3044unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3025equalsimpl0(float[] fArr, float[] fArr2) {
        return m.c(fArr, fArr2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m3026getimpl(float[] fArr, int i2, int i3) {
        return fArr[(i2 * 4) + i3];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3027hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: invert-impl, reason: not valid java name */
    public static final void m3028invertimpl(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 == 0.0f) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr[0] = androidx.compose.animation.a.a(f8, f26, (f6 * f28) - (f7 * f27), f30);
        fArr[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
        fArr[2] = androidx.compose.animation.a.a(f16, f20, (f14 * f22) - (f15 * f21), f30);
        fArr[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
        fArr[5] = androidx.compose.animation.a.a(f4, f24, (f28 * f) - (f3 * f25), f30);
        float f32 = -f13;
        fArr[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
        fArr[7] = androidx.compose.animation.a.a(f12, f18, (f22 * f9) - (f11 * f19), f30);
        fArr[8] = androidx.compose.animation.a.a(f8, f23, (f5 * f27) - (f6 * f25), f30);
        fArr[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
        fArr[10] = androidx.compose.animation.a.a(f16, f17, (f13 * f21) - (f14 * f19), f30);
        fArr[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
        fArr[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
        fArr[13] = androidx.compose.animation.a.a(f3, f23, (f * f26) - (f2 * f24), f30);
        fArr[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
        fArr[15] = androidx.compose.animation.a.a(f11, f17, (f9 * f20) - (f10 * f18), f30);
    }

    /* JADX INFO: renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m3029mapMKHz9U(float[] fArr, long j) {
        float fM2585getXimpl = Offset.m2585getXimpl(j);
        float fM2586getYimpl = Offset.m2586getYimpl(j);
        float f = 1 / (((fArr[7] * fM2586getYimpl) + (fArr[3] * fM2585getXimpl)) + fArr[15]);
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            f = 0.0f;
        }
        return OffsetKt.Offset(((fArr[4] * fM2586getYimpl) + (fArr[0] * fM2585getXimpl) + fArr[12]) * f, ((fArr[5] * fM2586getYimpl) + (fArr[1] * fM2585getXimpl) + fArr[13]) * f);
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final Rect m3030mapimpl(float[] fArr, Rect rect) {
        m.h(rect, "rect");
        long jM3029mapMKHz9U = m3029mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long jM3029mapMKHz9U2 = m3029mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long jM3029mapMKHz9U3 = m3029mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long jM3029mapMKHz9U4 = m3029mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m2585getXimpl(jM3029mapMKHz9U), Offset.m2585getXimpl(jM3029mapMKHz9U2)), Math.min(Offset.m2585getXimpl(jM3029mapMKHz9U3), Offset.m2585getXimpl(jM3029mapMKHz9U4))), Math.min(Math.min(Offset.m2586getYimpl(jM3029mapMKHz9U), Offset.m2586getYimpl(jM3029mapMKHz9U2)), Math.min(Offset.m2586getYimpl(jM3029mapMKHz9U3), Offset.m2586getYimpl(jM3029mapMKHz9U4))), Math.max(Math.max(Offset.m2585getXimpl(jM3029mapMKHz9U), Offset.m2585getXimpl(jM3029mapMKHz9U2)), Math.max(Offset.m2585getXimpl(jM3029mapMKHz9U3), Offset.m2585getXimpl(jM3029mapMKHz9U4))), Math.max(Math.max(Offset.m2586getYimpl(jM3029mapMKHz9U), Offset.m2586getYimpl(jM3029mapMKHz9U2)), Math.max(Offset.m2586getYimpl(jM3029mapMKHz9U3), Offset.m2586getYimpl(jM3029mapMKHz9U4))));
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m3032resetimpl(float[] fArr) {
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < 4) {
                fArr[(i3 * 4) + i2] = i2 == i3 ? 1.0f : 0.0f;
                i3++;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: rotateX-impl, reason: not valid java name */
    public static final void m3033rotateXimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = (f2 * fCos) - (f3 * fSin);
        float f5 = fArr[5];
        float f6 = fArr[6];
        float f7 = (f5 * fCos) - (f6 * fSin);
        float f8 = fArr[9];
        float f9 = fArr[10];
        float f10 = (f8 * fCos) - (f9 * fSin);
        float f11 = fArr[13];
        float f12 = fArr[14];
        float f13 = (f11 * fCos) - (f12 * fSin);
        fArr[1] = f4;
        fArr[2] = (f3 * fCos) + (f2 * fSin);
        fArr[5] = f7;
        fArr[6] = (f6 * fCos) + (f5 * fSin);
        fArr[9] = f10;
        fArr[10] = (f9 * fCos) + (f8 * fSin);
        fArr[13] = f13;
        fArr[14] = (f12 * fCos) + (f11 * fSin);
    }

    /* JADX INFO: renamed from: rotateY-impl, reason: not valid java name */
    public static final void m3034rotateYimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = (f3 * fSin) + (f2 * fCos);
        float f5 = fArr[4];
        float f6 = fArr[6];
        float f7 = (f6 * fSin) + (f5 * fCos);
        float f8 = fArr[8];
        float f9 = fArr[10];
        float f10 = (f9 * fSin) + (f8 * fCos);
        float f11 = fArr[12];
        float f12 = fArr[14];
        float f13 = (f12 * fSin) + (f11 * fCos);
        fArr[0] = f4;
        fArr[2] = (f3 * fCos) + ((-f2) * fSin);
        fArr[4] = f7;
        fArr[6] = (f6 * fCos) + ((-f5) * fSin);
        fArr[8] = f10;
        fArr[10] = (f9 * fCos) + ((-f8) * fSin);
        fArr[12] = f13;
        fArr[14] = (f12 * fCos) + ((-f11) * fSin);
    }

    /* JADX INFO: renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m3035rotateZimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = (fSin * f3) + (fCos * f2);
        float f5 = -fSin;
        float f6 = (f3 * fCos) + (f2 * f5);
        float f7 = fArr[1];
        float f8 = fArr[5];
        float f9 = (fSin * f8) + (fCos * f7);
        float f10 = (f8 * fCos) + (f7 * f5);
        float f11 = fArr[2];
        float f12 = fArr[6];
        float f13 = (fSin * f12) + (fCos * f11);
        float f14 = (f12 * fCos) + (f11 * f5);
        float f15 = fArr[3];
        float f16 = fArr[7];
        float f17 = (fSin * f16) + (fCos * f15);
        fArr[0] = f4;
        fArr[1] = f9;
        fArr[2] = f13;
        fArr[3] = f17;
        fArr[4] = f6;
        fArr[5] = f10;
        fArr[6] = f14;
        fArr[7] = (fCos * f16) + (f5 * f15);
    }

    /* JADX INFO: renamed from: scale-impl, reason: not valid java name */
    public static final void m3036scaleimpl(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* JADX INFO: renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m3037scaleimpl$default(float[] fArr, float f, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 1.0f;
        }
        m3036scaleimpl(fArr, f, f2, f3);
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m3038setimpl(float[] fArr, int i2, int i3, float f) {
        fArr[(i2 * 4) + i3] = f;
    }

    /* JADX INFO: renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m3039setFrom58bKbWc(float[] fArr, float[] fArr2) {
        m.h(fArr2, "matrix");
        for (int i2 = 0; i2 < 16; i2++) {
            fArr[i2] = fArr2[i2];
        }
    }

    /* JADX INFO: renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m3040timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        m.h(fArr2, "m");
        float fM3046dotp89u6pk = MatrixKt.m3046dotp89u6pk(fArr, 0, fArr2, 0);
        float fM3046dotp89u6pk2 = MatrixKt.m3046dotp89u6pk(fArr, 0, fArr2, 1);
        float fM3046dotp89u6pk3 = MatrixKt.m3046dotp89u6pk(fArr, 0, fArr2, 2);
        float fM3046dotp89u6pk4 = MatrixKt.m3046dotp89u6pk(fArr, 0, fArr2, 3);
        float fM3046dotp89u6pk5 = MatrixKt.m3046dotp89u6pk(fArr, 1, fArr2, 0);
        float fM3046dotp89u6pk6 = MatrixKt.m3046dotp89u6pk(fArr, 1, fArr2, 1);
        float fM3046dotp89u6pk7 = MatrixKt.m3046dotp89u6pk(fArr, 1, fArr2, 2);
        float fM3046dotp89u6pk8 = MatrixKt.m3046dotp89u6pk(fArr, 1, fArr2, 3);
        float fM3046dotp89u6pk9 = MatrixKt.m3046dotp89u6pk(fArr, 2, fArr2, 0);
        float fM3046dotp89u6pk10 = MatrixKt.m3046dotp89u6pk(fArr, 2, fArr2, 1);
        float fM3046dotp89u6pk11 = MatrixKt.m3046dotp89u6pk(fArr, 2, fArr2, 2);
        float fM3046dotp89u6pk12 = MatrixKt.m3046dotp89u6pk(fArr, 2, fArr2, 3);
        float fM3046dotp89u6pk13 = MatrixKt.m3046dotp89u6pk(fArr, 3, fArr2, 0);
        float fM3046dotp89u6pk14 = MatrixKt.m3046dotp89u6pk(fArr, 3, fArr2, 1);
        float fM3046dotp89u6pk15 = MatrixKt.m3046dotp89u6pk(fArr, 3, fArr2, 2);
        float fM3046dotp89u6pk16 = MatrixKt.m3046dotp89u6pk(fArr, 3, fArr2, 3);
        fArr[0] = fM3046dotp89u6pk;
        fArr[1] = fM3046dotp89u6pk2;
        fArr[2] = fM3046dotp89u6pk3;
        fArr[3] = fM3046dotp89u6pk4;
        fArr[4] = fM3046dotp89u6pk5;
        fArr[5] = fM3046dotp89u6pk6;
        fArr[6] = fM3046dotp89u6pk7;
        fArr[7] = fM3046dotp89u6pk8;
        fArr[8] = fM3046dotp89u6pk9;
        fArr[9] = fM3046dotp89u6pk10;
        fArr[10] = fM3046dotp89u6pk11;
        fArr[11] = fM3046dotp89u6pk12;
        fArr[12] = fM3046dotp89u6pk13;
        fArr[13] = fM3046dotp89u6pk14;
        fArr[14] = fM3046dotp89u6pk15;
        fArr[15] = fM3046dotp89u6pk16;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3041toStringimpl(float[] fArr) {
        return kotlin.text.i.Q0("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* JADX INFO: renamed from: translate-impl, reason: not valid java name */
    public static final void m3042translateimpl(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[8] * f3) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f5 = (fArr[9] * f3) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f6 = (fArr[10] * f3) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f7 = (fArr[11] * f3) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    /* JADX INFO: renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m3043translateimpl$default(float[] fArr, float f, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        m3042translateimpl(fArr, f, f2, f3);
    }

    public boolean equals(Object obj) {
        return m3024equalsimpl(this.values, obj);
    }

    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m3027hashCodeimpl(this.values);
    }

    public String toString() {
        return m3041toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m3044unboximpl() {
        return this.values;
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final void m3031mapimpl(float[] fArr, MutableRect mutableRect) {
        m.h(mutableRect, "rect");
        long jM3029mapMKHz9U = m3029mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getTop()));
        long jM3029mapMKHz9U2 = m3029mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getBottom()));
        long jM3029mapMKHz9U3 = m3029mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getTop()));
        long jM3029mapMKHz9U4 = m3029mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getBottom()));
        mutableRect.setLeft(Math.min(Math.min(Offset.m2585getXimpl(jM3029mapMKHz9U), Offset.m2585getXimpl(jM3029mapMKHz9U2)), Math.min(Offset.m2585getXimpl(jM3029mapMKHz9U3), Offset.m2585getXimpl(jM3029mapMKHz9U4))));
        mutableRect.setTop(Math.min(Math.min(Offset.m2586getYimpl(jM3029mapMKHz9U), Offset.m2586getYimpl(jM3029mapMKHz9U2)), Math.min(Offset.m2586getYimpl(jM3029mapMKHz9U3), Offset.m2586getYimpl(jM3029mapMKHz9U4))));
        mutableRect.setRight(Math.max(Math.max(Offset.m2585getXimpl(jM3029mapMKHz9U), Offset.m2585getXimpl(jM3029mapMKHz9U2)), Math.max(Offset.m2585getXimpl(jM3029mapMKHz9U3), Offset.m2585getXimpl(jM3029mapMKHz9U4))));
        mutableRect.setBottom(Math.max(Math.max(Offset.m2586getYimpl(jM3029mapMKHz9U), Offset.m2586getYimpl(jM3029mapMKHz9U2)), Math.max(Offset.m2586getYimpl(jM3029mapMKHz9U3), Offset.m2586getYimpl(jM3029mapMKHz9U4))));
    }
}
