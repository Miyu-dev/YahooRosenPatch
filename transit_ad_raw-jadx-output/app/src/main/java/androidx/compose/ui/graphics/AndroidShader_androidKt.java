package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidShader.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0013\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u001d\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0001\u001a!\u0010\"\u001a\u00020!2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u001eH\u0001ø\u0001\u0001\u001a3\u0010%\u001a\u0004\u0018\u00010$2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u001eH\u0001ø\u0001\u0001\u001a)\u0010'\u001a\u00020&2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002ø\u0001\u0001*\n\u0010(\"\u00020\n2\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualLinearGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ActualSweepGradientShader", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "tileModeX", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualImageShader", "", "countTransparentColors", "numTransparentColors", "", "makeTransparentColors", "stops", "", "makeTransparentStops", "Lkotlin/j;", "validateColorStops", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidShader_androidKt {
    /* JADX INFO: renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m2726ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i2, int i3) {
        m.h(imageBitmap, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m2731toAndroidTileMode0vamqd0(i2), AndroidTileMode_androidKt.m2731toAndroidTileMode0vamqd0(i3));
    }

    /* JADX INFO: renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m2727ActualLinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i2) {
        m.h(list, "colors");
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Offset.m2585getXimpl(j), Offset.m2586getYimpl(j), Offset.m2585getXimpl(j2), Offset.m2586getYimpl(j2), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m2731toAndroidTileMode0vamqd0(i2));
    }

    /* JADX INFO: renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m2728ActualRadialGradientShader8uybcMk(long j, float f, List<Color> list, List<Float> list2, int i2) {
        m.h(list, "colors");
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Offset.m2585getXimpl(j), Offset.m2586getYimpl(j), f, makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m2731toAndroidTileMode0vamqd0(i2));
    }

    /* JADX INFO: renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m2729ActualSweepGradientShader9KIMszo(long j, List<Color> list, List<Float> list2) {
        m.h(list, "colors");
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Offset.m2585getXimpl(j), Offset.m2586getYimpl(j), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors));
    }

    @VisibleForTesting
    public static final int countTransparentColors(List<Color> list) {
        m.h(list, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int I = a.f.I(list);
        int i2 = 0;
        for (int i3 = 1; i3 < I; i3++) {
            if (Color.m2820getAlphaimpl(list.get(i3).m2828unboximpl()) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    @VisibleForTesting
    public static final int[] makeTransparentColors(List<Color> list, int i2) {
        int i3;
        m.h(list, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                iArr[i4] = ColorKt.m2872toArgb8_81llA(list.get(i4).m2828unboximpl());
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i2];
        int I = a.f.I(list);
        int size2 = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size2; i6++) {
            long jM2828unboximpl = list.get(i6).m2828unboximpl();
            if (Color.m2820getAlphaimpl(jM2828unboximpl) == 0.0f) {
                if (i6 == 0) {
                    i3 = i5 + 1;
                    iArr2[i5] = ColorKt.m2872toArgb8_81llA(Color.m2817copywmQWz5c$default(list.get(1).m2828unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i6 == I) {
                    i3 = i5 + 1;
                    iArr2[i5] = ColorKt.m2872toArgb8_81llA(Color.m2817copywmQWz5c$default(list.get(i6 - 1).m2828unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i7 = i5 + 1;
                    iArr2[i5] = ColorKt.m2872toArgb8_81llA(Color.m2817copywmQWz5c$default(list.get(i6 - 1).m2828unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i5 = i7 + 1;
                    iArr2[i7] = ColorKt.m2872toArgb8_81llA(Color.m2817copywmQWz5c$default(list.get(i6 + 1).m2828unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i5 = i3;
            } else {
                iArr2[i5] = ColorKt.m2872toArgb8_81llA(jM2828unboximpl);
                i5++;
            }
        }
        return iArr2;
    }

    @VisibleForTesting
    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i2) {
        m.h(list2, "colors");
        if (i2 == 0) {
            if (list != null) {
                return y.V1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int I = a.f.I(list2);
        int i3 = 1;
        for (int i4 = 1; i4 < I; i4++) {
            long jM2828unboximpl = list2.get(i4).m2828unboximpl();
            float fFloatValue = list != null ? list.get(i4).floatValue() : i4 / a.f.I(list2);
            int i5 = i3 + 1;
            fArr[i3] = fFloatValue;
            if (Color.m2820getAlphaimpl(jM2828unboximpl) == 0.0f) {
                i3 = i5 + 1;
                fArr[i5] = fFloatValue;
            } else {
                i3 = i5;
            }
        }
        fArr[i3] = list != null ? list.get(a.f.I(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
