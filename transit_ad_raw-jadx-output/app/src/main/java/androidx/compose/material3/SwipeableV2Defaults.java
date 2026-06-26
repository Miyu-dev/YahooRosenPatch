package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SwipeableV2.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010\u0015JW\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\f\u0010\rR&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR2\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/material3/SwipeableV2Defaults;", "", "T", "Landroidx/compose/material3/SwipeableV2State;", "state", "Lkotlin/Function2;", "", "Lkotlin/j;", "animate", "Lkotlin/Function1;", "snap", "Landroidx/compose/material3/AnchorChangeHandler;", "ReconcileAnimationOnAnchorChangeHandler$material3_release", "(Landroidx/compose/material3/SwipeableV2State;Lkj/p;Lkj/l;)Landroidx/compose/material3/AnchorChangeHandler;", "ReconcileAnimationOnAnchorChangeHandler", "Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec$annotations", "()V", "Landroidx/compose/ui/unit/Dp;", "VelocityThreshold", "F", "getVelocityThreshold-D9Ej5fM", "()F", "getVelocityThreshold-D9Ej5fM$annotations", "Landroidx/compose/ui/unit/Density;", "PositionalThreshold", "Lkj/p;", "getPositionalThreshold", "()Lkj/p;", "getPositionalThreshold$annotations", "<init>", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SwipeableV2Defaults {
    public static final SwipeableV2Defaults INSTANCE = new SwipeableV2Defaults();
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);
    private static final float VelocityThreshold = Dp.m5267constructorimpl(125);
    private static final p<Density, Float, Float> PositionalThreshold = SwipeableV2Kt.m1614fixedPositionalThreshold0680j_4(Dp.m5267constructorimpl(56));

    private SwipeableV2Defaults() {
    }

    @ExperimentalMaterial3Api
    public final <T> AnchorChangeHandler<T> ReconcileAnimationOnAnchorChangeHandler$material3_release(final SwipeableV2State<T> state, final p<? super T, ? super Float, j> animate, final l<? super T, j> snap) {
        m.h(state, "state");
        m.h(animate, "animate");
        m.h(snap, "snap");
        return new AnchorChangeHandler<T>() { // from class: androidx.compose.material3.SwipeableV2Defaults$ReconcileAnimationOnAnchorChangeHandler$1
            @Override // androidx.compose.material3.AnchorChangeHandler
            public final void onAnchorsChanged(T t, Map<T, Float> map, Map<T, Float> map2) {
                m.h(map, "previousAnchors");
                m.h(map2, "newAnchors");
                Float f = map.get(t);
                Float f2 = map2.get(t);
                if (f != null ? !(f2 == null || f.floatValue() != f2.floatValue()) : f2 == null) {
                    return;
                }
                if (f2 != null) {
                    animate.invoke(t, Float.valueOf(state.getLastVelocity()));
                } else {
                    snap.invoke(SwipeableV2Kt.closestAnchor$default(map2, state.requireOffset(), false, 2, null));
                }
            }
        };
    }

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    public final p<Density, Float, Float> getPositionalThreshold() {
        return PositionalThreshold;
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1613getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getPositionalThreshold$annotations() {
    }

    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m1612getVelocityThresholdD9Ej5fM$annotations() {
    }
}
