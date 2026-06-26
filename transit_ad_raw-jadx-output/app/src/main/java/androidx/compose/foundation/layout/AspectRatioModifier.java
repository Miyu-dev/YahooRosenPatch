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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kj.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010/\u001a\u00020\b\u0012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503¢\u0006\u0004\b7\u00108J\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0010\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ)\u0010\u001a\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001f\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001c\u0010 \u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u001c\u0010\"\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u001c\u0010#\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001dH\u0016J\u0013\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010'\u001a\u00020\u001dH\u0016J\b\u0010)\u001a\u00020(H\u0016R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00069"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "findSize-ToXhtMw", "(J)J", "findSize", "", "enforceConstraints", "tryMaxWidth-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxHeight-JN-0ABg", "tryMaxHeight", "tryMinWidth-JN-0ABg", "tryMinWidth", "tryMinHeight-JN-0ABg", "tryMinHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "", "other", "equals", "hashCode", "", "toString", "", "aspectRatio", "F", "getAspectRatio", "()F", "matchHeightConstraintsFirst", "Z", "getMatchHeightConstraintsFirst", "()Z", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectorInfo", "<init>", "(FZLkj/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f, boolean z, kj.l<? super InspectorInfo, kotlin.j> lVar) {
        super(lVar);
        kotlin.jvm.internal.m.h(lVar, "inspectorInfo");
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
        if (f > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f + " must be > 0").toString());
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m422findSizeToXhtMw(long j) {
        if (this.matchHeightConstraintsFirst) {
            long jM424tryMaxHeightJN0ABg$default = m424tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m5425equalsimpl0(jM424tryMaxHeightJN0ABg$default, companion.m5432getZeroYbymL2g())) {
                return jM424tryMaxHeightJN0ABg$default;
            }
            long jM426tryMaxWidthJN0ABg$default = m426tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5425equalsimpl0(jM426tryMaxWidthJN0ABg$default, companion.m5432getZeroYbymL2g())) {
                return jM426tryMaxWidthJN0ABg$default;
            }
            long jM428tryMinHeightJN0ABg$default = m428tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5425equalsimpl0(jM428tryMinHeightJN0ABg$default, companion.m5432getZeroYbymL2g())) {
                return jM428tryMinHeightJN0ABg$default;
            }
            long jM430tryMinWidthJN0ABg$default = m430tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5425equalsimpl0(jM430tryMinWidthJN0ABg$default, companion.m5432getZeroYbymL2g())) {
                return jM430tryMinWidthJN0ABg$default;
            }
            long jM423tryMaxHeightJN0ABg = m423tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m5425equalsimpl0(jM423tryMaxHeightJN0ABg, companion.m5432getZeroYbymL2g())) {
                return jM423tryMaxHeightJN0ABg;
            }
            long jM425tryMaxWidthJN0ABg = m425tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m5425equalsimpl0(jM425tryMaxWidthJN0ABg, companion.m5432getZeroYbymL2g())) {
                return jM425tryMaxWidthJN0ABg;
            }
            long jM427tryMinHeightJN0ABg = m427tryMinHeightJN0ABg(j, false);
            if (!IntSize.m5425equalsimpl0(jM427tryMinHeightJN0ABg, companion.m5432getZeroYbymL2g())) {
                return jM427tryMinHeightJN0ABg;
            }
            long jM429tryMinWidthJN0ABg = m429tryMinWidthJN0ABg(j, false);
            if (!IntSize.m5425equalsimpl0(jM429tryMinWidthJN0ABg, companion.m5432getZeroYbymL2g())) {
                return jM429tryMinWidthJN0ABg;
            }
        } else {
            long jM426tryMaxWidthJN0ABg$default2 = m426tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m5425equalsimpl0(jM426tryMaxWidthJN0ABg$default2, companion2.m5432getZeroYbymL2g())) {
                return jM426tryMaxWidthJN0ABg$default2;
            }
            long jM424tryMaxHeightJN0ABg$default2 = m424tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5425equalsimpl0(jM424tryMaxHeightJN0ABg$default2, companion2.m5432getZeroYbymL2g())) {
                return jM424tryMaxHeightJN0ABg$default2;
            }
            long jM430tryMinWidthJN0ABg$default2 = m430tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5425equalsimpl0(jM430tryMinWidthJN0ABg$default2, companion2.m5432getZeroYbymL2g())) {
                return jM430tryMinWidthJN0ABg$default2;
            }
            long jM428tryMinHeightJN0ABg$default2 = m428tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m5425equalsimpl0(jM428tryMinHeightJN0ABg$default2, companion2.m5432getZeroYbymL2g())) {
                return jM428tryMinHeightJN0ABg$default2;
            }
            long jM425tryMaxWidthJN0ABg2 = m425tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m5425equalsimpl0(jM425tryMaxWidthJN0ABg2, companion2.m5432getZeroYbymL2g())) {
                return jM425tryMaxWidthJN0ABg2;
            }
            long jM423tryMaxHeightJN0ABg2 = m423tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m5425equalsimpl0(jM423tryMaxHeightJN0ABg2, companion2.m5432getZeroYbymL2g())) {
                return jM423tryMaxHeightJN0ABg2;
            }
            long jM429tryMinWidthJN0ABg2 = m429tryMinWidthJN0ABg(j, false);
            if (!IntSize.m5425equalsimpl0(jM429tryMinWidthJN0ABg2, companion2.m5432getZeroYbymL2g())) {
                return jM429tryMinWidthJN0ABg2;
            }
            long jM427tryMinHeightJN0ABg2 = m427tryMinHeightJN0ABg(j, false);
            if (!IntSize.m5425equalsimpl0(jM427tryMinHeightJN0ABg2, companion2.m5432getZeroYbymL2g())) {
                return jM427tryMinHeightJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m5432getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m423tryMaxHeightJN0ABg(long j, boolean z) {
        int iF0;
        int iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(j);
        if (iM5234getMaxHeightimpl != Integer.MAX_VALUE && (iF0 = a.f.f0(iM5234getMaxHeightimpl * this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iF0, iM5234getMaxHeightimpl);
            if (!z || ConstraintsKt.m5250isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m5432getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m424tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m423tryMaxHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m425tryMaxWidthJN0ABg(long j, boolean z) {
        int iF0;
        int iM5235getMaxWidthimpl = Constraints.m5235getMaxWidthimpl(j);
        if (iM5235getMaxWidthimpl != Integer.MAX_VALUE && (iF0 = a.f.f0(iM5235getMaxWidthimpl / this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM5235getMaxWidthimpl, iF0);
            if (!z || ConstraintsKt.m5250isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m5432getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m426tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m425tryMaxWidthJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m427tryMinHeightJN0ABg(long j, boolean z) {
        int iM5236getMinHeightimpl = Constraints.m5236getMinHeightimpl(j);
        int iF0 = a.f.f0(iM5236getMinHeightimpl * this.aspectRatio);
        if (iF0 > 0) {
            long jIntSize = IntSizeKt.IntSize(iF0, iM5236getMinHeightimpl);
            if (!z || ConstraintsKt.m5250isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m5432getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m428tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m427tryMinHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m429tryMinWidthJN0ABg(long j, boolean z) {
        int iM5237getMinWidthimpl = Constraints.m5237getMinWidthimpl(j);
        int iF0 = a.f.f0(iM5237getMinWidthimpl / this.aspectRatio);
        if (iF0 > 0) {
            long jIntSize = IntSizeKt.IntSize(iM5237getMinWidthimpl, iF0);
            if (!z || ConstraintsKt.m5250isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m5432getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m430tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m429tryMinWidthJN0ABg(j, z);
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
        if (this == other) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = other instanceof AspectRatioModifier ? (AspectRatioModifier) other : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        return ((this.aspectRatio > aspectRatioModifier.aspectRatio ? 1 : (this.aspectRatio == aspectRatioModifier.aspectRatio ? 0 : -1)) == 0) && this.matchHeightConstraintsFirst == ((AspectRatioModifier) other).matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.aspectRatio) * 31) + (this.matchHeightConstraintsFirst ? 1231 : 1237);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        return i2 != Integer.MAX_VALUE ? a.f.f0(i2 / this.aspectRatio) : intrinsicMeasurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        return i2 != Integer.MAX_VALUE ? a.f.f0(i2 * this.aspectRatio) : intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        kotlin.jvm.internal.m.h(measureScope, "$this$measure");
        kotlin.jvm.internal.m.h(measurable, "measurable");
        long jM422findSizeToXhtMw = m422findSizeToXhtMw(j);
        if (!IntSize.m5425equalsimpl0(jM422findSizeToXhtMw, IntSize.INSTANCE.m5432getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m5243fixedJhjzzOo(IntSize.m5427getWidthimpl(jM422findSizeToXhtMw), IntSize.m5426getHeightimpl(jM422findSizeToXhtMw));
        }
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(j);
        return MeasureScope.CC.p(measureScope, placeableMo4235measureBRTryo0.getWidth(), placeableMo4235measureBRTryo0.getHeight(), null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.AspectRatioModifier$measure$1
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
        return i2 != Integer.MAX_VALUE ? a.f.f0(i2 / this.aspectRatio) : intrinsicMeasurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        return i2 != Integer.MAX_VALUE ? a.f.f0(i2 * this.aspectRatio) : intrinsicMeasurable.minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    public String toString() {
        return a6.h.g(new StringBuilder("AspectRatioModifier(aspectRatio="), this.aspectRatio, ')');
    }
}
