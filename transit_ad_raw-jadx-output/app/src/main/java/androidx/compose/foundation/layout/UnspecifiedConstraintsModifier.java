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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kj.p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001a\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!ø\u0001\u0001¢\u0006\u0004\b%\u0010&J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0011\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0016R \u0010\u001b\u001a\u00020\u001a8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u00020\u001a8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "", "other", "", "equals", "hashCode", "Landroidx/compose/ui/unit/Dp;", "minWidth", "F", "getMinWidth-D9Ej5fM", "()F", "minHeight", "getMinHeight-D9Ej5fM", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectorInfo", "<init>", "(FFLkj/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class UnspecifiedConstraintsModifier extends InspectorValueInfo implements LayoutModifier {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsModifier(float f, float f2, kj.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, lVar);
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
        if (!(other instanceof UnspecifiedConstraintsModifier)) {
            return false;
        }
        UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier) other;
        return Dp.m5272equalsimpl0(this.minWidth, unspecifiedConstraintsModifier.minWidth) && Dp.m5272equalsimpl0(this.minHeight, unspecifiedConstraintsModifier.minHeight);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    public int hashCode() {
        return Dp.m5273hashCodeimpl(this.minHeight) + (Dp.m5273hashCodeimpl(this.minWidth) * 31);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i2);
        int iMo342roundToPx0680j_4 = !Dp.m5272equalsimpl0(this.minHeight, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo342roundToPx0680j_4(this.minHeight) : 0;
        return iMaxIntrinsicHeight < iMo342roundToPx0680j_4 ? iMo342roundToPx0680j_4 : iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i2);
        int iMo342roundToPx0680j_4 = !Dp.m5272equalsimpl0(this.minWidth, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo342roundToPx0680j_4(this.minWidth) : 0;
        return iMaxIntrinsicWidth < iMo342roundToPx0680j_4 ? iMo342roundToPx0680j_4 : iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int iM5237getMinWidthimpl;
        kotlin.jvm.internal.m.h(measureScope, "$this$measure");
        kotlin.jvm.internal.m.h(measurable, "measurable");
        float f = this.minWidth;
        Dp.Companion companion = Dp.INSTANCE;
        int iM5236getMinHeightimpl = 0;
        if (Dp.m5272equalsimpl0(f, companion.m5287getUnspecifiedD9Ej5fM()) || Constraints.m5237getMinWidthimpl(j) != 0) {
            iM5237getMinWidthimpl = Constraints.m5237getMinWidthimpl(j);
        } else {
            iM5237getMinWidthimpl = measureScope.mo342roundToPx0680j_4(this.minWidth);
            int iM5235getMaxWidthimpl = Constraints.m5235getMaxWidthimpl(j);
            if (iM5237getMinWidthimpl > iM5235getMaxWidthimpl) {
                iM5237getMinWidthimpl = iM5235getMaxWidthimpl;
            }
            if (iM5237getMinWidthimpl < 0) {
                iM5237getMinWidthimpl = 0;
            }
        }
        int iM5235getMaxWidthimpl2 = Constraints.m5235getMaxWidthimpl(j);
        if (Dp.m5272equalsimpl0(this.minHeight, companion.m5287getUnspecifiedD9Ej5fM()) || Constraints.m5236getMinHeightimpl(j) != 0) {
            iM5236getMinHeightimpl = Constraints.m5236getMinHeightimpl(j);
        } else {
            int iMo342roundToPx0680j_4 = measureScope.mo342roundToPx0680j_4(this.minHeight);
            int iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(j);
            if (iMo342roundToPx0680j_4 > iM5234getMaxHeightimpl) {
                iMo342roundToPx0680j_4 = iM5234getMaxHeightimpl;
            }
            if (iMo342roundToPx0680j_4 >= 0) {
                iM5236getMinHeightimpl = iMo342roundToPx0680j_4;
            }
        }
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(ConstraintsKt.Constraints(iM5237getMinWidthimpl, iM5235getMaxWidthimpl2, iM5236getMinHeightimpl, Constraints.m5234getMaxHeightimpl(j)));
        return MeasureScope.CC.p(measureScope, placeableMo4235measureBRTryo0.getWidth(), placeableMo4235measureBRTryo0.getHeight(), null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsModifier$measure$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return kotlin.j.a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                kotlin.jvm.internal.m.h(placementScope, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4235measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i2);
        int iMo342roundToPx0680j_4 = !Dp.m5272equalsimpl0(this.minHeight, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo342roundToPx0680j_4(this.minHeight) : 0;
        return iMinIntrinsicHeight < iMo342roundToPx0680j_4 ? iMo342roundToPx0680j_4 : iMinIntrinsicHeight;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i2);
        int iMo342roundToPx0680j_4 = !Dp.m5272equalsimpl0(this.minWidth, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo342roundToPx0680j_4(this.minWidth) : 0;
        return iMinIntrinsicWidth < iMo342roundToPx0680j_4 ? iMo342roundToPx0680j_4 : iMinIntrinsicWidth;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    public /* synthetic */ UnspecifiedConstraintsModifier(float f, float f2, kj.l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM() : f, (i2 & 2) != 0 ? Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM() : f2, lVar, null);
    }

    private UnspecifiedConstraintsModifier(float f, float f2, kj.l<? super InspectorInfo, kotlin.j> lVar) {
        super(lVar);
        this.minWidth = f;
        this.minHeight = f2;
    }
}
