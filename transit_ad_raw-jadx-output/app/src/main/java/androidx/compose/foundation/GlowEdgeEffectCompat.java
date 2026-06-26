package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: EdgeEffectCompat.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/GlowEdgeEffectCompat;", "Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "Lkotlin/j;", "onPull", "onRelease", "", "velocity", "onAbsorb", "delta", "releaseWithOppositeDelta", "oppositeReleaseDeltaThreshold", "F", "oppositeReleaseDelta", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class GlowEdgeEffectCompat extends EdgeEffect {
    private float oppositeReleaseDelta;
    private final float oppositeReleaseDeltaThreshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlowEdgeEffectCompat(Context context) {
        super(context);
        m.h(context, "context");
        this.oppositeReleaseDeltaThreshold = AndroidDensity_androidKt.Density(context).mo348toPx0680j_4(Dp.m5267constructorimpl(1));
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i2) {
        this.oppositeReleaseDelta = 0.0f;
        super.onAbsorb(i2);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f, float f2) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.oppositeReleaseDelta = 0.0f;
        super.onRelease();
    }

    public final void releaseWithOppositeDelta(float f) {
        float f2 = this.oppositeReleaseDelta + f;
        this.oppositeReleaseDelta = f2;
        if (Math.abs(f2) > this.oppositeReleaseDeltaThreshold) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f) {
        this.oppositeReleaseDelta = 0.0f;
        super.onPull(f);
    }
}
