package androidx.compose.animation.core;

import kj.l;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: SpringEstimation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b\u001a4\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a<\u0010\u0012\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0014\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0015\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a9\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019H\u0082\b\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0003H\u0082\b¨\u0006\u001d"}, d2 = {"estimateAnimationDurationMillis", "", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "roots", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "p0", "v0", "estimateDurationInternal", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        return estimateAnimationDurationMillis(f, f2, f3, f4, f5);
    }

    private static final double estimateCriticallyDamped(Pair<ComplexDouble, ComplexDouble> pair, final double d, double d2, double d3) {
        double d4;
        final double d5;
        final double real = ((ComplexDouble) pair.getFirst()).getReal();
        double d6 = real * d;
        final double d7 = d2 - d6;
        double dLog = Math.log(Math.abs(d3 / d)) / real;
        double dEstimateCriticallyDamped$t2Iterate = estimateCriticallyDamped$t2Iterate(Math.log(Math.abs(d3 / d7)), real) / real;
        int i2 = 0;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            d4 = dEstimateCriticallyDamped$t2Iterate;
        } else {
            if (!(!((Double.isInfinite(dEstimateCriticallyDamped$t2Iterate) || Double.isNaN(dEstimateCriticallyDamped$t2Iterate)) ? false : true))) {
                dLog = Math.max(dLog, dEstimateCriticallyDamped$t2Iterate);
            }
            d4 = dLog;
        }
        double d8 = (-(d6 + d7)) / (real * d7);
        if (Double.isNaN(d8) || d8 <= 0.0d) {
            d5 = -d3;
        } else if (d8 <= 0.0d || (-estimateCriticallyDamped$xInflection(d, real, d8, d7)) >= d3) {
            d4 = (-(2.0d / real)) - (d / d7);
            d5 = d3;
        } else {
            if (d7 < 0.0d && d > 0.0d) {
                d4 = 0.0d;
            }
            d5 = -d3;
        }
        l<Double, Double> lVar = new l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Double invoke(double d9) {
                return Double.valueOf((Math.exp(real * d9) * ((d7 * d9) + d)) + d5);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        l<Double, Double> lVar2 = new l<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Double invoke(double d9) {
                double d10 = d7;
                double d11 = real;
                return Double.valueOf(Math.exp(d11 * d9) * ((d * d11) + (((d11 * d9) + ((double) 1)) * d10)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).doubleValue());
            }
        };
        double d9 = Double.MAX_VALUE;
        while (d9 > 0.001d && i2 < 100) {
            i2++;
            double dDoubleValue = d4 - (((Number) lVar.invoke(Double.valueOf(d4))).doubleValue() / ((Number) lVar2.invoke(Double.valueOf(d4))).doubleValue());
            double dAbs = Math.abs(d4 - dDoubleValue);
            d4 = dDoubleValue;
            d9 = dAbs;
        }
        return d4;
    }

    private static final double estimateCriticallyDamped$t2Iterate(double d, double d2) {
        double dLog = d;
        for (int i2 = 0; i2 < 6; i2++) {
            dLog = d - Math.log(Math.abs(dLog / d2));
        }
        return dLog;
    }

    private static final double estimateCriticallyDamped$xInflection(double d, double d2, double d3, double d4) {
        double d5 = d2 * d3;
        return (Math.exp(d5) * d4 * d3) + (Math.exp(d5) * d);
    }

    private static final long estimateDurationInternal(Pair<ComplexDouble, ComplexDouble> pair, double d, double d2, double d3, double d4) {
        if (d3 == 0.0d) {
            if (d2 == 0.0d) {
                return 0L;
            }
        }
        if (d3 < 0.0d) {
            d2 = -d2;
        }
        double d5 = d2;
        double dAbs = Math.abs(d3);
        return (long) ((d > 1.0d ? estimateOverDamped(pair, dAbs, d5, d4) : d < 1.0d ? estimateUnderDamped(pair, dAbs, d5, d4) : estimateCriticallyDamped(pair, dAbs, d5, d4)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final double estimateOverDamped(kotlin.Pair<androidx.compose.animation.core.ComplexDouble, androidx.compose.animation.core.ComplexDouble> r31, double r32, double r34, double r36) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped(kotlin.Pair, double, double, double):double");
    }

    private static final double estimateOverDamped$xInflection$0(double d, double d2, double d3, double d4, double d5) {
        return (Math.exp(d5 * d3) * d4) + (Math.exp(d2 * d3) * d);
    }

    private static final double estimateUnderDamped(Pair<ComplexDouble, ComplexDouble> pair, double d, double d2, double d3) {
        double real = ((ComplexDouble) pair.getFirst()).getReal();
        double imaginary = (d2 - (real * d)) / ((ComplexDouble) pair.getFirst()).getImaginary();
        return Math.log(d3 / Math.sqrt((imaginary * imaginary) + (d * d))) / real;
    }

    private static final boolean isNotFinite(double d) {
        return !((Double.isInfinite(d) || Double.isNaN(d)) ? false : true);
    }

    private static final double iterateNewtonsMethod(double d, l<? super Double, Double> lVar, l<? super Double, Double> lVar2) {
        return d - (((Number) lVar.invoke(Double.valueOf(d))).doubleValue() / ((Number) lVar2.invoke(Double.valueOf(d))).doubleValue());
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(1.0d, Math.sqrt(d) * 2.0d * d2, d), d2, d3, d4, d5);
    }

    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5, double d6) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(d3, d2, d), d2 / (Math.sqrt(d * d3) * 2.0d), d4, d5, d6);
    }
}
