package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.text.input.PartialGapBuffer;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a>\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000e\u001a4\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\u001a-\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0019\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0082\b\u001a\u0019\u0010#\u001a\u00020 *\u00020\u0007H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010&\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002\u001a\u0019\u0010+\u001a\u00020\n*\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a+\u00100\u001a\u00020\u0007*\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070,H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\"\u00106\u001a\u000201*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103\"\"\u00109\u001a\u000201*\u00020\u00078Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u00103\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "", TypedValues.Custom.S_COLOR, "(I)J", "", "(J)J", "(IIII)J", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", "background", "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "fgC", "bgC", "fgA", "bgA", "a", "compositeComponent", "", "getComponents-8_81llA", "(J)[F", "getComponents", "luminance-8_81llA", "(J)F", "luminance", "v", "saturate", "toArgb-8_81llA", "(J)I", "toArgb", "Lkotlin/Function0;", "block", "takeOrElse-DxMtmZc", "(JLkj/a;)J", "takeOrElse", "", "isSpecified-8_81llA", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "isUnspecified-8_81llA", "isUnspecified-8_81llA$annotations", "isUnspecified", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r9, float r10, float r11, float r12, androidx.compose.ui.graphics.colorspace.ColorSpace r13) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i2 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f3) * (f2 * f4)) + (f * f3)) / f5;
    }

    @Stable
    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m2863compositeOverOWjLjI(long j, long j2) {
        long jM2815convertvNxB06k = Color.m2815convertvNxB06k(j, Color.m2822getColorSpaceimpl(j2));
        float fM2820getAlphaimpl = Color.m2820getAlphaimpl(j2);
        float fM2820getAlphaimpl2 = Color.m2820getAlphaimpl(jM2815convertvNxB06k);
        float f = 1.0f - fM2820getAlphaimpl2;
        float f2 = (fM2820getAlphaimpl * f) + fM2820getAlphaimpl2;
        return Color((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (((Color.m2824getRedimpl(j2) * fM2820getAlphaimpl) * f) + (Color.m2824getRedimpl(jM2815convertvNxB06k) * fM2820getAlphaimpl2)) / f2, (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (((Color.m2823getGreenimpl(j2) * fM2820getAlphaimpl) * f) + (Color.m2823getGreenimpl(jM2815convertvNxB06k) * fM2820getAlphaimpl2)) / f2, f2 == 0.0f ? 0.0f : (((Color.m2821getBlueimpl(j2) * fM2820getAlphaimpl) * f) + (Color.m2821getBlueimpl(jM2815convertvNxB06k) * fM2820getAlphaimpl2)) / f2, f2, Color.m2822getColorSpaceimpl(j2));
    }

    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m2864getComponents8_81llA(long j) {
        return new float[]{Color.m2824getRedimpl(j), Color.m2823getGreenimpl(j), Color.m2821getBlueimpl(j), Color.m2820getAlphaimpl(j)};
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m2865isSpecified8_81llA(long j) {
        return j != Color.INSTANCE.m2854getUnspecified0d7_KjU();
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m2867isUnspecified8_81llA(long j) {
        return j == Color.INSTANCE.m2854getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m2869lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM2815convertvNxB06k = Color.m2815convertvNxB06k(j, oklab);
        long jM2815convertvNxB06k2 = Color.m2815convertvNxB06k(j2, oklab);
        float fM2820getAlphaimpl = Color.m2820getAlphaimpl(jM2815convertvNxB06k);
        float fM2824getRedimpl = Color.m2824getRedimpl(jM2815convertvNxB06k);
        float fM2823getGreenimpl = Color.m2823getGreenimpl(jM2815convertvNxB06k);
        float fM2821getBlueimpl = Color.m2821getBlueimpl(jM2815convertvNxB06k);
        float fM2820getAlphaimpl2 = Color.m2820getAlphaimpl(jM2815convertvNxB06k2);
        float fM2824getRedimpl2 = Color.m2824getRedimpl(jM2815convertvNxB06k2);
        float fM2823getGreenimpl2 = Color.m2823getGreenimpl(jM2815convertvNxB06k2);
        float fM2821getBlueimpl2 = Color.m2821getBlueimpl(jM2815convertvNxB06k2);
        return Color.m2815convertvNxB06k(Color(MathHelpersKt.lerp(fM2824getRedimpl, fM2824getRedimpl2, f), MathHelpersKt.lerp(fM2823getGreenimpl, fM2823getGreenimpl2, f), MathHelpersKt.lerp(fM2821getBlueimpl, fM2821getBlueimpl2, f), MathHelpersKt.lerp(fM2820getAlphaimpl, fM2820getAlphaimpl2, f), oklab), Color.m2822getColorSpaceimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m2870luminance8_81llA(long j) {
        ColorSpace colorSpaceM2822getColorSpaceimpl = Color.m2822getColorSpaceimpl(j);
        if (!ColorModel.m3195equalsimpl0(colorSpaceM2822getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m3202getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m3198toStringimpl(colorSpaceM2822getColorSpaceimpl.getModel()))).toString());
        }
        DoubleFunction eotfFunc = ((Rgb) colorSpaceM2822getColorSpaceimpl).getEotfFunc();
        double dInvoke = eotfFunc.invoke(Color.m2824getRedimpl(j));
        return saturate((float) ((eotfFunc.invoke(Color.m2821getBlueimpl(j)) * 0.0722d) + (eotfFunc.invoke(Color.m2823getGreenimpl(j)) * 0.7152d) + (dInvoke * 0.2126d)));
    }

    private static final float saturate(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m2871takeOrElseDxMtmZc(long j, kj.a<Color> aVar) {
        m.h(aVar, "block");
        return (j > Color.INSTANCE.m2854getUnspecified0d7_KjU() ? 1 : (j == Color.INSTANCE.m2854getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j : ((Color) aVar.invoke()).m2828unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m2872toArgb8_81llA(long j) {
        return (int) (Color.m2815convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            i5 = PartialGapBuffer.BUF_SIZE;
        }
        return Color(i2, i3, i4, i5);
    }

    @Stable
    public static final long Color(int i2) {
        return Color.m2814constructorimpl(((long) i2) << 32);
    }

    @Stable
    public static final long Color(long j) {
        return Color.m2814constructorimpl((j & 4294967295L) << 32);
    }

    @Stable
    public static final long Color(int i2, int i3, int i4, int i5) {
        return Color(((i2 & PartialGapBuffer.BUF_SIZE) << 16) | ((i5 & PartialGapBuffer.BUF_SIZE) << 24) | ((i3 & PartialGapBuffer.BUF_SIZE) << 8) | (i4 & PartialGapBuffer.BUF_SIZE));
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m2866isSpecified8_81llA$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m2868isUnspecified8_81llA$annotations(long j) {
    }
}
