package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import dj.c;
import kj.l;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018JK\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/LowVelocityApproachAnimation;", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scope", TypedValues.CycleType.S_WAVE_OFFSET, "velocity", "Lkotlin/Function1;", "Lkotlin/j;", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "approachAnimation", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkj/l;Ldj/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "layoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/ui/unit/Density;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
final class LowVelocityApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final Density density;
    private final SnapLayoutInfoProvider layoutInfoProvider;
    private final AnimationSpec<Float> lowVelocityAnimationSpec;

    public LowVelocityApproachAnimation(AnimationSpec<Float> animationSpec, SnapLayoutInfoProvider snapLayoutInfoProvider, Density density) {
        m.h(animationSpec, "lowVelocityAnimationSpec");
        m.h(snapLayoutInfoProvider, "layoutInfoProvider");
        m.h(density, "density");
        this.lowVelocityAnimationSpec = animationSpec;
        this.layoutInfoProvider = snapLayoutInfoProvider;
        this.density = density;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f, Float f2, l<? super Float, j> lVar, c cVar) {
        return approachAnimation(scrollScope, f.floatValue(), f2.floatValue(), lVar, (c<? super AnimationResult<Float, AnimationVector1D>>) cVar);
    }

    public Object approachAnimation(ScrollScope scrollScope, float f, float f2, l<? super Float, j> lVar, c<? super AnimationResult<Float, AnimationVector1D>> cVar) {
        Object objAnimateSnap = SnapFlingBehaviorKt.animateSnap(scrollScope, Math.signum(f2) * (this.layoutInfoProvider.calculateSnapStepSize(this.density) + Math.abs(f)), f, AnimationStateKt.AnimationState$default(0.0f, f2, 0L, 0L, false, 28, null), this.lowVelocityAnimationSpec, lVar, cVar);
        return objAnimateSnap == CoroutineSingletons.COROUTINE_SUSPENDED ? objAnimateSnap : (AnimationResult) objAnimateSnap;
    }
}
