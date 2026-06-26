package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.appcompat.R;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LazyStaggeredGrid.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "slotSizesSums", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/j;", "content", "LazyStaggeredGrid-LJWHXA8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Lkj/p;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLkj/l;Landroidx/compose/runtime/Composer;III)V", "LazyStaggeredGrid", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "ScrollPositionUpdater", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyStaggeredGridKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalFoundationApi
    /* JADX INFO: renamed from: LazyStaggeredGrid-LJWHXA8, reason: not valid java name */
    public static final void m701LazyStaggeredGridLJWHXA8(final LazyStaggeredGridState lazyStaggeredGridState, final Orientation orientation, final p<? super Density, ? super Constraints, int[]> pVar, Modifier modifier, PaddingValues paddingValues, boolean z, FlingBehavior flingBehavior, boolean z2, float f, float f2, final l<? super LazyStaggeredGridScope, j> lVar, Composer composer, final int i2, final int i3, final int i4) {
        FlingBehavior flingBehavior2;
        int i5;
        m.h(lazyStaggeredGridState, "state");
        m.h(orientation, "orientation");
        m.h(pVar, "slotSizesSums");
        m.h(lVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1320541636);
        Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        PaddingValues paddingValuesM454PaddingValues0680j_4 = (i4 & 16) != 0 ? PaddingKt.m454PaddingValues0680j_4(Dp.m5267constructorimpl(0)) : paddingValues;
        boolean z3 = (i4 & 32) != 0 ? false : z;
        if ((i4 & 64) != 0) {
            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
            i5 = i2 & (-3670017);
        } else {
            flingBehavior2 = flingBehavior;
            i5 = i2;
        }
        boolean z4 = (i4 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? true : z2;
        float fM5267constructorimpl = (i4 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? Dp.m5267constructorimpl(0) : f;
        float fM5267constructorimpl2 = (i4 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? Dp.m5267constructorimpl(0) : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1320541636, i5, i3, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:39)");
        }
        ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
        OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composerStartRestartGroup, 6);
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProvider(lazyStaggeredGridState, lVar, composerStartRestartGroup, ((i3 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        int i6 = i5 >> 6;
        int i7 = i5 >> 9;
        int i8 = i5;
        final boolean z5 = z3;
        final Modifier modifier3 = modifier2;
        p<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> pVarM712rememberStaggeredGridMeasurePolicynbWgWpA = LazyStaggeredGridMeasurePolicyKt.m712rememberStaggeredGridMeasurePolicynbWgWpA(lazyStaggeredGridState, lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider, paddingValuesM454PaddingValues0680j_4, z3, orientation, fM5267constructorimpl, fM5267constructorimpl2, pVar, composerStartRestartGroup, (i6 & 7168) | (i6 & 896) | 8 | ((i5 << 9) & 57344) | (i7 & 458752) | (i7 & 3670016) | ((i5 << 15) & 29360128));
        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyStaggeredGridSemanticState = LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState, z5, composerStartRestartGroup, ((i8 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        ScrollPositionUpdater(lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider, lazyStaggeredGridState, composerStartRestartGroup, 64);
        boolean z6 = z4;
        LazyLayoutKt.LazyLayout(lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider, LazyLayoutSemanticsKt.lazyLayoutSemantics(ScrollableKt.scrollable(OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(modifier3.then(lazyStaggeredGridState.getRemeasurementModifier()), orientation), overscrollEffect), lazyStaggeredGridState, orientation, overscrollEffect, z6, scrollableDefaults.reverseDirection((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z5), flingBehavior2, lazyStaggeredGridState.getMutableInteractionSource()), lazyStaggeredGridItemProviderRememberStaggeredGridItemProvider, lazyLayoutSemanticStateRememberLazyStaggeredGridSemanticState, orientation, z6, z5, composerStartRestartGroup, ((i8 << 6) & 7168) | (i7 & 57344) | (i8 & 458752)), lazyStaggeredGridState.getPrefetchState(), pVarM712rememberStaggeredGridMeasurePolicynbWgWpA, composerStartRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final PaddingValues paddingValues2 = paddingValuesM454PaddingValues0680j_4;
        final FlingBehavior flingBehavior3 = flingBehavior2;
        final boolean z7 = z4;
        final float f3 = fM5267constructorimpl;
        final float f4 = fM5267constructorimpl2;
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i9) {
                LazyStaggeredGridKt.m701LazyStaggeredGridLJWHXA8(lazyStaggeredGridState, orientation, pVar, modifier3, paddingValues2, z5, flingBehavior3, z7, f3, f4, lVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ScrollPositionUpdater(final LazyLayoutItemProvider lazyLayoutItemProvider, final LazyStaggeredGridState lazyStaggeredGridState, Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(231106410);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231106410, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.ScrollPositionUpdater (LazyStaggeredGrid.kt:114)");
        }
        if (lazyLayoutItemProvider.getItemCount() > 0) {
            lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyLayoutItemProvider);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new p<Composer, Integer, j>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.ScrollPositionUpdater.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return j.a;
            }

            public final void invoke(Composer composer2, int i3) {
                LazyStaggeredGridKt.ScrollPositionUpdater(lazyLayoutItemProvider, lazyStaggeredGridState, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            }
        });
    }
}
