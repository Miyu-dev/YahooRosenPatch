package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b$\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J0\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R$\u0010#\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "Lkotlin/j;", "init", "", "lastDisplacement", "lastVelocity", "getAcceleration", "", "timeElapsed", "Landroidx/compose/animation/core/Motion;", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "updateValues", "finalPosition", "F", "getFinalPosition", "()F", "setFinalPosition", "(F)V", "", "naturalFreq", "D", "", "initialized", "Z", "gammaPlus", "gammaMinus", "dampedFreq", "value", "dampingRatio", "getDampingRatio", "setDampingRatio", "getStiffness", "setStiffness", "stiffness", "<init>", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class SpringSimulation {
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f = this.dampingRatio;
        double d = ((double) f) * ((double) f);
        if (f > 1.0f) {
            double d2 = this.naturalFreq;
            double d3 = d - ((double) 1);
            this.gammaPlus = (Math.sqrt(d3) * d2) + (((double) (-f)) * d2);
            double d4 = -this.dampingRatio;
            double d5 = this.naturalFreq;
            this.gammaMinus = (d4 * d5) - (Math.sqrt(d3) * d5);
        } else if (f >= 0.0f && f < 1.0f) {
            this.dampedFreq = Math.sqrt(((double) 1) - d) * this.naturalFreq;
        }
        this.initialized = true;
    }

    public final float getAcceleration(float lastDisplacement, float lastVelocity) {
        float f = lastDisplacement - this.finalPosition;
        double d = this.naturalFreq;
        return (float) (((-(d * d)) * ((double) f)) - (((d * 2.0d) * ((double) this.dampingRatio)) * ((double) lastVelocity)));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d = this.naturalFreq;
        return (float) (d * d);
    }

    public final void setDampingRatio(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f;
        this.initialized = false;
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f);
        this.initialized = false;
    }

    /* JADX INFO: renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m135updateValuesIJZedt4$animation_core_release(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dCos;
        double dExp;
        double dExp2;
        double dExp3;
        init();
        float f = lastDisplacement - this.finalPosition;
        double d = timeElapsed / 1000.0d;
        float f2 = this.dampingRatio;
        if (f2 > 1.0f) {
            double d2 = f;
            double d3 = this.gammaMinus;
            double d4 = lastVelocity;
            double d5 = this.gammaPlus;
            double d6 = d2 - (((d3 * d2) - d4) / (d3 - d5));
            double d7 = ((d2 * d3) - d4) / (d3 - d5);
            dExp = (Math.exp(this.gammaPlus * d) * d7) + (Math.exp(d3 * d) * d6);
            double d8 = this.gammaMinus;
            dExp2 = Math.exp(d8 * d) * d6 * d8;
            double d9 = this.gammaPlus;
            dExp3 = Math.exp(d9 * d) * d7 * d9;
        } else {
            if (!(f2 == 1.0f)) {
                double d10 = ((double) 1) / this.dampedFreq;
                double d11 = this.naturalFreq;
                double d12 = f;
                double d13 = ((((double) f2) * d11 * d12) + ((double) lastVelocity)) * d10;
                double dExp4 = Math.exp(((double) (-f2)) * d11 * d) * ((Math.sin(this.dampedFreq * d) * d13) + (Math.cos(this.dampedFreq * d) * d12));
                double d14 = this.naturalFreq;
                float f3 = this.dampingRatio;
                double d15 = (-d14) * dExp4 * ((double) f3);
                double dExp5 = Math.exp(((double) (-f3)) * d14 * d);
                double d16 = this.dampedFreq;
                double dSin = Math.sin(d16 * d) * (-d16) * d12;
                double d17 = this.dampedFreq;
                dCos = (((Math.cos(d17 * d) * d13 * d17) + dSin) * dExp5) + d15;
                dExp = dExp4;
                return SpringSimulationKt.Motion((float) (dExp + ((double) this.finalPosition)), (float) dCos);
            }
            double d18 = this.naturalFreq;
            double d19 = f;
            double d20 = (d18 * d19) + ((double) lastVelocity);
            double d21 = (d20 * d) + d19;
            dExp = Math.exp((-d18) * d) * d21;
            double dExp6 = Math.exp((-this.naturalFreq) * d) * d21;
            double d22 = this.naturalFreq;
            dExp2 = dExp6 * (-d22);
            dExp3 = Math.exp((-d22) * d) * d20;
        }
        dCos = dExp3 + dExp2;
        return SpringSimulationKt.Motion((float) (dExp + ((double) this.finalPosition)), (float) dCos);
    }
}
