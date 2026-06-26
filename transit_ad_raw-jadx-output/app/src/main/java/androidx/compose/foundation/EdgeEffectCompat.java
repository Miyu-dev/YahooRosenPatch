package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: EdgeEffectCompat.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000b\u001a\u00020\b*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0012\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u0011\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bR\u0015\u0010\u0014\u001a\u00020\b*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/EdgeEffectCompat;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/widget/EdgeEffect;", "create", "", "deltaDistance", "displacement", "onPullDistanceCompat", "", "velocity", "Lkotlin/j;", "onAbsorbCompat", "delta", "onReleaseWithOppositeDelta", "getDistanceCompat", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class EdgeEffectCompat {
    public static final EdgeEffectCompat INSTANCE = new EdgeEffectCompat();

    private EdgeEffectCompat() {
    }

    public final EdgeEffect create(Context context, AttributeSet attrs) {
        m.h(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.INSTANCE.create(context, attrs) : new GlowEdgeEffectCompat(context);
    }

    public final float getDistanceCompat(EdgeEffect edgeEffect) {
        m.h(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public final void onAbsorbCompat(EdgeEffect edgeEffect, int i2) {
        m.h(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i2);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i2);
        }
    }

    public final float onPullDistanceCompat(EdgeEffect edgeEffect, float f, float f2) {
        m.h(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.onPullDistance(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public final void onReleaseWithOppositeDelta(EdgeEffect edgeEffect, float f) {
        m.h(edgeEffect, "<this>");
        if (edgeEffect instanceof GlowEdgeEffectCompat) {
            ((GlowEdgeEffectCompat) edgeEffect).releaseWithOppositeDelta(f);
        } else {
            edgeEffect.onRelease();
        }
    }
}
