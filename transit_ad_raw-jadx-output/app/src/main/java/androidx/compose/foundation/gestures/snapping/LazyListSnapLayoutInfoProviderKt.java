package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kj.q;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qj.a;
import qj.b;

/* JADX INFO: compiled from: LazyListSnapLayoutInfoProvider.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u000f\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0002H\u0000\"\u0018\u0010\u0013\u001a\u00020\u0010*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Lkotlin/Function3;", "Landroidx/compose/ui/unit/Density;", "", "positionInLayout", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "item", "calculateDistanceToDesiredSnapPosition", "", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "singleAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class LazyListSnapLayoutInfoProviderKt {
    @ExperimentalFoundationApi
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final LazyListState lazyListState, final q<? super Density, ? super Float, ? super Float, Float> qVar) {
        m.h(lazyListState, "lazyListState");
        m.h(qVar, "positionInLayout");
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.2
            private final LazyListLayoutInfo getLayoutInfo() {
                return lazyListState.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(Density density, float f) {
                m.h(density, "<this>");
                float fAbs = Math.abs(DecayAnimationSpecKt.calculateTargetValue(SplineBasedDecayKt.splineBasedDecay(density), 0.0f, f)) - calculateSnapStepSize(density);
                if (fAbs < 0.0f) {
                    fAbs = 0.0f;
                }
                return (fAbs > 0.0f ? 1 : (fAbs == 0.0f ? 0 : -1)) == 0 ? fAbs : fAbs * Math.signum(f);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapStepSize(Density density) {
                m.h(density, "<this>");
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                if (!(!layoutInfo.getVisibleItemsInfo().isEmpty())) {
                    return 0.0f;
                }
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                int size = visibleItemsInfo.size();
                int size2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    size2 += visibleItemsInfo.get(i2).getSize();
                }
                return size2 / layoutInfo.getVisibleItemsInfo().size();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public b<Float> calculateSnappingOffsetBounds(Density density) {
                m.h(density, "<this>");
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                q<Density, Float, Float, Float> qVar2 = qVar;
                int size = visibleItemsInfo.size();
                float f = Float.NEGATIVE_INFINITY;
                float f2 = Float.POSITIVE_INFINITY;
                for (int i2 = 0; i2 < size; i2++) {
                    float fCalculateDistanceToDesiredSnapPosition = LazyListSnapLayoutInfoProviderKt.calculateDistanceToDesiredSnapPosition(density, getLayoutInfo(), visibleItemsInfo.get(i2), qVar2);
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f) {
                        f = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f2) {
                        f2 = fCalculateDistanceToDesiredSnapPosition;
                    }
                }
                return new a(f, f2);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, q qVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qVar = new q<Density, Float, Float, Float>() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
                public final Float invoke(Density density, float f, float f2) {
                    m.h(density, "$this$null");
                    return Float.valueOf((f / 2.0f) - (f2 / 2.0f));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                    return invoke((Density) obj2, ((Number) obj3).floatValue(), ((Number) obj4).floatValue());
                }
            };
        }
        return SnapLayoutInfoProvider(lazyListState, qVar);
    }

    public static final float calculateDistanceToDesiredSnapPosition(Density density, LazyListLayoutInfo lazyListLayoutInfo, LazyListItemInfo lazyListItemInfo, q<? super Density, ? super Float, ? super Float, Float> qVar) {
        m.h(density, "<this>");
        m.h(lazyListLayoutInfo, "layoutInfo");
        m.h(lazyListItemInfo, "item");
        m.h(qVar, "positionInLayout");
        return lazyListItemInfo.getOffset() - ((Number) qVar.invoke(density, Float.valueOf((getSingleAxisViewportSize(lazyListLayoutInfo) - lazyListLayoutInfo.getBeforeContentPadding()) - lazyListLayoutInfo.getAfterContentPadding()), Float.valueOf(lazyListItemInfo.getSize()))).floatValue();
    }

    private static final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m5426getHeightimpl(lazyListLayoutInfo.mo561getViewportSizeYbymL2g()) : IntSize.m5427getWidthimpl(lazyListLayoutInfo.mo561getViewportSizeYbymL2g());
    }

    @Composable
    @ExperimentalFoundationApi
    public static final FlingBehavior rememberSnapFlingBehavior(LazyListState lazyListState, Composer composer, int i2) {
        m.h(lazyListState, "lazyListState");
        composer.startReplaceableGroup(1148456277);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1148456277, i2, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:108)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(lazyListState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapLayoutInfoProvider$default(lazyListState, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehaviorRememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehaviorRememberSnapFlingBehavior;
    }
}
