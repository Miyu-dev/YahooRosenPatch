package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kj.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0016J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "getPaddingValues", "()Landroidx/compose/foundation/layout/PaddingValues;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;Lkj/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class PaddingValuesModifier extends InspectorValueInfo implements LayoutModifier {
    private final PaddingValues paddingValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(PaddingValues paddingValues, kj.l<? super InspectorInfo, kotlin.j> lVar) {
        super(lVar);
        kotlin.jvm.internal.m.h(paddingValues, "paddingValues");
        kotlin.jvm.internal.m.h(lVar, "inspectorInfo");
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(kj.l lVar) {
        return androidx.compose.ui.b.a(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(kj.l lVar) {
        return androidx.compose.ui.b.b(this, lVar);
    }

    public boolean equals(Object other) {
        PaddingValuesModifier paddingValuesModifier = other instanceof PaddingValuesModifier ? (PaddingValuesModifier) other : null;
        if (paddingValuesModifier == null) {
            return false;
        }
        return kotlin.jvm.internal.m.c(this.paddingValues, paddingValuesModifier.paddingValues);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return androidx.compose.ui.layout.c.a(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return androidx.compose.ui.layout.c.b(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo47measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j) {
        kotlin.jvm.internal.m.h(measureScope, "$this$measure");
        kotlin.jvm.internal.m.h(measurable, "measurable");
        boolean z = false;
        float f = 0;
        if (Dp.m5266compareTo0680j_4(this.paddingValues.mo442calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m5267constructorimpl(f)) >= 0 && Dp.m5266compareTo0680j_4(this.paddingValues.getTop(), Dp.m5267constructorimpl(f)) >= 0 && Dp.m5266compareTo0680j_4(this.paddingValues.mo443calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()), Dp.m5267constructorimpl(f)) >= 0 && Dp.m5266compareTo0680j_4(this.paddingValues.getBottom(), Dp.m5267constructorimpl(f)) >= 0) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iMo342roundToPx0680j_4 = measureScope.mo342roundToPx0680j_4(this.paddingValues.mo443calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo342roundToPx0680j_4(this.paddingValues.mo442calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int iMo342roundToPx0680j_42 = measureScope.mo342roundToPx0680j_4(this.paddingValues.getBottom()) + measureScope.mo342roundToPx0680j_4(this.paddingValues.getTop());
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(ConstraintsKt.m5251offsetNN6EwU(j, -iMo342roundToPx0680j_4, -iMo342roundToPx0680j_42));
        return MeasureScope.CC.p(measureScope, ConstraintsKt.m5249constrainWidthK40F9xA(j, placeableMo4235measureBRTryo0.getWidth() + iMo342roundToPx0680j_4), ConstraintsKt.m5248constrainHeightK40F9xA(j, placeableMo4235measureBRTryo0.getHeight() + iMo342roundToPx0680j_42), null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return kotlin.j.a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                kotlin.jvm.internal.m.h(placementScope, "$this$layout");
                Placeable.PlacementScope.place$default(placementScope, placeableMo4235measureBRTryo0, measureScope.mo342roundToPx0680j_4(this.getPaddingValues().mo442calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())), measureScope.mo342roundToPx0680j_4(this.getPaddingValues().getTop()), 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return androidx.compose.ui.layout.c.c(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return androidx.compose.ui.layout.c.d(this, intrinsicMeasureScope, intrinsicMeasurable, i2);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }
}
