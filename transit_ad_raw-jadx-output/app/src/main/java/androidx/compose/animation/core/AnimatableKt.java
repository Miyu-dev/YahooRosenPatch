package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Animatable", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "initialValue", "visibilityThreshold", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
public final class AnimatableKt {
    public static final Animatable<Float, AnimationVector1D> Animatable(float f, float f2) {
        return new Animatable<>(Float.valueOf(f), VectorConvertersKt.getVectorConverter(i.a), Float.valueOf(f2), null, 8, null);
    }

    public static /* synthetic */ Animatable Animatable$default(float f, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 0.01f;
        }
        return Animatable(f, f2);
    }
}
