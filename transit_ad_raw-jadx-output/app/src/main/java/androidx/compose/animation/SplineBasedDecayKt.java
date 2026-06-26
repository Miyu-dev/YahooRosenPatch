package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SplineBasedDecay.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "Lkotlin/j;", "computeSplineInfo", "T", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/DecayAnimationSpec;", "splineBasedDecay", "", "Inflection", "F", "StartTension", "EndTension", "P1", "P2", "animation_release"}, k = 2, mv = {1, 8, 0})
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float f11 = i3 / i2;
            float f12 = 1.0f;
            while (true) {
                f = ((f12 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = 3.0f * f * f2;
                f4 = f * f * f;
                float fA = a.a(f, P2, f2 * P1, f3) + f4;
                if (Math.abs(fA - f11) < 1.0E-5d) {
                    break;
                } else if (fA > f11) {
                    f12 = f;
                } else {
                    f9 = f;
                }
            }
            float f13 = 0.5f;
            fArr[i3] = (((f2 * 0.5f) + f) * f3) + f4;
            float f14 = 1.0f;
            while (true) {
                f5 = ((f14 - f10) / 2.0f) + f10;
                f6 = 1.0f - f5;
                f7 = 3.0f * f5 * f6;
                f8 = f5 * f5 * f5;
                float fA2 = a.a(f6, f13, f5, f7) + f8;
                if (Math.abs(fA2 - f11) >= 1.0E-5d) {
                    if (fA2 > f11) {
                        f14 = f5;
                    } else {
                        f10 = f5;
                    }
                    f13 = 0.5f;
                }
            }
            fArr2[i3] = (((f5 * P2) + (f6 * P1)) * f7) + f8;
        }
        fArr2[i2] = 1.0f;
        fArr[i2] = 1.0f;
    }

    public static final <T> DecayAnimationSpec<T> splineBasedDecay(Density density) {
        m.h(density, "density");
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
