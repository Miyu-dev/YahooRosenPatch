package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;

/* JADX INFO: compiled from: LazyItemScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Modifier a(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
        }
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5376boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 1, null);
        }
        return lazyItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
    }

    public static /* synthetic */ Modifier b(LazyItemScope lazyItemScope, Modifier modifier, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxHeight(modifier, f);
    }

    public static /* synthetic */ Modifier c(LazyItemScope lazyItemScope, Modifier modifier, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxSize(modifier, f);
    }

    public static /* synthetic */ Modifier d(LazyItemScope lazyItemScope, Modifier modifier, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i2 & 1) != 0) {
            f = 1.0f;
        }
        return lazyItemScope.fillParentMaxWidth(modifier, f);
    }
}
