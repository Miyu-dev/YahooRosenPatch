package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ColorVectorConverter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\"/\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"0\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t*\u00020\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"", "column", "", "x", "y", "z", "", "matrix", "multiplyColumn", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "ColorToVector", "Lkj/l;", "M1", "[F", "InverseM1", "Landroidx/compose/ui/graphics/Color$Companion;", "getVectorConverter", "(Landroidx/compose/ui/graphics/Color$Companion;)Lkj/l;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 8, 0})
public final class ColorVectorConverterKt {
    private static final l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> ColorToVector = new l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        public final TwoWayConverter<Color, AnimationVector4D> invoke(final ColorSpace colorSpace) {
            m.h(colorSpace, "colorSpace");
            return VectorConvertersKt.TwoWayConverter(new l<Color, AnimationVector4D>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m64invoke8_81llA(((Color) obj).m2828unboximpl());
                }

                /* JADX INFO: renamed from: invoke-8_81llA, reason: not valid java name */
                public final AnimationVector4D m64invoke8_81llA(long j) {
                    long jM2815convertvNxB06k = Color.m2815convertvNxB06k(j, ColorSpaces.INSTANCE.getCieXyz());
                    float fM2824getRedimpl = Color.m2824getRedimpl(jM2815convertvNxB06k);
                    float fM2823getGreenimpl = Color.m2823getGreenimpl(jM2815convertvNxB06k);
                    float fM2821getBlueimpl = Color.m2821getBlueimpl(jM2815convertvNxB06k);
                    double d = 0.33333334f;
                    return new AnimationVector4D(Color.m2820getAlphaimpl(j), (float) Math.pow(ColorVectorConverterKt.multiplyColumn(0, fM2824getRedimpl, fM2823getGreenimpl, fM2821getBlueimpl, ColorVectorConverterKt.M1), d), (float) Math.pow(ColorVectorConverterKt.multiplyColumn(1, fM2824getRedimpl, fM2823getGreenimpl, fM2821getBlueimpl, ColorVectorConverterKt.M1), d), (float) Math.pow(ColorVectorConverterKt.multiplyColumn(2, fM2824getRedimpl, fM2823getGreenimpl, fM2821getBlueimpl, ColorVectorConverterKt.M1), d));
                }
            }, new l<AnimationVector4D, Color>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return Color.m2808boximpl(m65invokevNxB06k((AnimationVector4D) obj));
                }

                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m65invokevNxB06k(AnimationVector4D animationVector4D) {
                    m.h(animationVector4D, "it");
                    double d = 3.0f;
                    float fPow = (float) Math.pow(animationVector4D.getV2(), d);
                    float fPow2 = (float) Math.pow(animationVector4D.getV3(), d);
                    float fPow3 = (float) Math.pow(animationVector4D.getV4(), d);
                    return Color.m2815convertvNxB06k(ColorKt.Color(a.l.h(ColorVectorConverterKt.multiplyColumn(0, fPow, fPow2, fPow3, ColorVectorConverterKt.InverseM1), -2.0f, 2.0f), a.l.h(ColorVectorConverterKt.multiplyColumn(1, fPow, fPow2, fPow3, ColorVectorConverterKt.InverseM1), -2.0f, 2.0f), a.l.h(ColorVectorConverterKt.multiplyColumn(2, fPow, fPow2, fPow3, ColorVectorConverterKt.InverseM1), -2.0f, 2.0f), a.l.h(animationVector4D.getV1(), 0.0f, 1.0f), ColorSpaces.INSTANCE.getCieXyz()), colorSpace);
                }
            });
        }
    };
    private static final float[] M1 = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};
    private static final float[] InverseM1 = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    public static final l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> getVectorConverter(Color.Companion companion) {
        m.h(companion, "<this>");
        return ColorToVector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float multiplyColumn(int i2, float f, float f2, float f3, float[] fArr) {
        return (f3 * fArr[i2 + 6]) + (f2 * fArr[i2 + 3]) + (f * fArr[i2]);
    }
}
