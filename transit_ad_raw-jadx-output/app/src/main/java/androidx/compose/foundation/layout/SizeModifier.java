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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BN\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&ø\u0001\u0001¢\u0006\u0004\b*\u0010+J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0016R\u001d\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001d\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R!\u0010%\u001a\u00020\u0006*\u00020\"8BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/foundation/layout/SizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "", "other", "", "equals", "hashCode", "Landroidx/compose/ui/unit/Dp;", "minWidth", "F", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "Z", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "targetConstraints", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectorInfo", "<init>", "(FFFFZLkj/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean enforceIncoming;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, kj.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX INFO: renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m515getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density r9) {
        /*
            r8 = this;
            float r0 = r8.maxWidth
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.ui.unit.Dp.INSTANCE
            float r2 = r1.m5287getUnspecifiedD9Ej5fM()
            boolean r0 = androidx.compose.ui.unit.Dp.m5272equalsimpl0(r0, r2)
            java.lang.String r2 = "minimumValue"
            java.lang.String r3 = "<this>"
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            if (r0 != 0) goto L3c
            float r0 = r8.maxWidth
            androidx.compose.ui.unit.Dp r0 = androidx.compose.ui.unit.Dp.m5265boximpl(r0)
            float r6 = (float) r5
            float r6 = androidx.compose.ui.unit.Dp.m5267constructorimpl(r6)
            androidx.compose.ui.unit.Dp r6 = androidx.compose.ui.unit.Dp.m5265boximpl(r6)
            kotlin.jvm.internal.m.h(r0, r3)
            kotlin.jvm.internal.m.h(r6, r2)
            int r7 = r0.compareTo(r6)
            if (r7 >= 0) goto L33
            r0 = r6
        L33:
            float r0 = r0.m5281unboximpl()
            int r0 = r9.mo342roundToPx0680j_4(r0)
            goto L3d
        L3c:
            r0 = r4
        L3d:
            float r6 = r8.maxHeight
            float r7 = r1.m5287getUnspecifiedD9Ej5fM()
            boolean r6 = androidx.compose.ui.unit.Dp.m5272equalsimpl0(r6, r7)
            if (r6 != 0) goto L6e
            float r6 = r8.maxHeight
            androidx.compose.ui.unit.Dp r6 = androidx.compose.ui.unit.Dp.m5265boximpl(r6)
            float r7 = (float) r5
            float r7 = androidx.compose.ui.unit.Dp.m5267constructorimpl(r7)
            androidx.compose.ui.unit.Dp r7 = androidx.compose.ui.unit.Dp.m5265boximpl(r7)
            kotlin.jvm.internal.m.h(r6, r3)
            kotlin.jvm.internal.m.h(r7, r2)
            int r2 = r6.compareTo(r7)
            if (r2 >= 0) goto L65
            r6 = r7
        L65:
            float r2 = r6.m5281unboximpl()
            int r2 = r9.mo342roundToPx0680j_4(r2)
            goto L6f
        L6e:
            r2 = r4
        L6f:
            float r3 = r8.minWidth
            float r6 = r1.m5287getUnspecifiedD9Ej5fM()
            boolean r3 = androidx.compose.ui.unit.Dp.m5272equalsimpl0(r3, r6)
            if (r3 != 0) goto L8a
            float r3 = r8.minWidth
            int r3 = r9.mo342roundToPx0680j_4(r3)
            if (r3 <= r0) goto L84
            r3 = r0
        L84:
            if (r3 >= 0) goto L87
            r3 = r5
        L87:
            if (r3 == r4) goto L8a
            goto L8b
        L8a:
            r3 = r5
        L8b:
            float r6 = r8.minHeight
            float r1 = r1.m5287getUnspecifiedD9Ej5fM()
            boolean r1 = androidx.compose.ui.unit.Dp.m5272equalsimpl0(r6, r1)
            if (r1 != 0) goto La6
            float r1 = r8.minHeight
            int r9 = r9.mo342roundToPx0680j_4(r1)
            if (r9 <= r2) goto La0
            r9 = r2
        La0:
            if (r9 >= 0) goto La3
            r9 = r5
        La3:
            if (r9 == r4) goto La6
            r5 = r9
        La6:
            long r0 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r3, r0, r5, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeModifier.m515getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
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
        if (!(other instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) other;
        return Dp.m5272equalsimpl0(this.minWidth, sizeModifier.minWidth) && Dp.m5272equalsimpl0(this.minHeight, sizeModifier.minHeight) && Dp.m5272equalsimpl0(this.maxWidth, sizeModifier.maxWidth) && Dp.m5272equalsimpl0(this.maxHeight, sizeModifier.maxHeight) && this.enforceIncoming == sizeModifier.enforceIncoming;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    public int hashCode() {
        return androidx.browser.browseractions.a.a(this.maxHeight, androidx.browser.browseractions.a.a(this.maxWidth, androidx.browser.browseractions.a.a(this.minHeight, Dp.m5273hashCodeimpl(this.minWidth) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        long jM515getTargetConstraintsOenEA2s = m515getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m5232getHasFixedHeightimpl(jM515getTargetConstraintsOenEA2s) ? Constraints.m5234getMaxHeightimpl(jM515getTargetConstraintsOenEA2s) : ConstraintsKt.m5248constrainHeightK40F9xA(jM515getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        long jM515getTargetConstraintsOenEA2s = m515getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m5233getHasFixedWidthimpl(jM515getTargetConstraintsOenEA2s) ? Constraints.m5235getMaxWidthimpl(jM515getTargetConstraintsOenEA2s) : ConstraintsKt.m5249constrainWidthK40F9xA(jM515getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        int iM5237getMinWidthimpl;
        int iM5235getMaxWidthimpl;
        int iM5236getMinHeightimpl;
        int iM5234getMaxHeightimpl;
        long jConstraints;
        kotlin.jvm.internal.m.h(measureScope, "$this$measure");
        kotlin.jvm.internal.m.h(measurable, "measurable");
        long jM515getTargetConstraintsOenEA2s = m515getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m5247constrainN9IONVI(j, jM515getTargetConstraintsOenEA2s);
        } else {
            float f = this.minWidth;
            Dp.Companion companion = Dp.INSTANCE;
            if (Dp.m5272equalsimpl0(f, companion.m5287getUnspecifiedD9Ej5fM())) {
                iM5237getMinWidthimpl = Constraints.m5237getMinWidthimpl(j);
                int iM5235getMaxWidthimpl2 = Constraints.m5235getMaxWidthimpl(jM515getTargetConstraintsOenEA2s);
                if (iM5237getMinWidthimpl > iM5235getMaxWidthimpl2) {
                    iM5237getMinWidthimpl = iM5235getMaxWidthimpl2;
                }
            } else {
                iM5237getMinWidthimpl = Constraints.m5237getMinWidthimpl(jM515getTargetConstraintsOenEA2s);
            }
            if (Dp.m5272equalsimpl0(this.maxWidth, companion.m5287getUnspecifiedD9Ej5fM())) {
                iM5235getMaxWidthimpl = Constraints.m5235getMaxWidthimpl(j);
                int iM5237getMinWidthimpl2 = Constraints.m5237getMinWidthimpl(jM515getTargetConstraintsOenEA2s);
                if (iM5235getMaxWidthimpl < iM5237getMinWidthimpl2) {
                    iM5235getMaxWidthimpl = iM5237getMinWidthimpl2;
                }
            } else {
                iM5235getMaxWidthimpl = Constraints.m5235getMaxWidthimpl(jM515getTargetConstraintsOenEA2s);
            }
            if (Dp.m5272equalsimpl0(this.minHeight, companion.m5287getUnspecifiedD9Ej5fM())) {
                iM5236getMinHeightimpl = Constraints.m5236getMinHeightimpl(j);
                int iM5234getMaxHeightimpl2 = Constraints.m5234getMaxHeightimpl(jM515getTargetConstraintsOenEA2s);
                if (iM5236getMinHeightimpl > iM5234getMaxHeightimpl2) {
                    iM5236getMinHeightimpl = iM5234getMaxHeightimpl2;
                }
            } else {
                iM5236getMinHeightimpl = Constraints.m5236getMinHeightimpl(jM515getTargetConstraintsOenEA2s);
            }
            if (Dp.m5272equalsimpl0(this.maxHeight, companion.m5287getUnspecifiedD9Ej5fM())) {
                iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(j);
                int iM5236getMinHeightimpl2 = Constraints.m5236getMinHeightimpl(jM515getTargetConstraintsOenEA2s);
                if (iM5234getMaxHeightimpl < iM5236getMinHeightimpl2) {
                    iM5234getMaxHeightimpl = iM5236getMinHeightimpl2;
                }
            } else {
                iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(jM515getTargetConstraintsOenEA2s);
            }
            jConstraints = ConstraintsKt.Constraints(iM5237getMinWidthimpl, iM5235getMaxWidthimpl, iM5236getMinHeightimpl, iM5234getMaxHeightimpl);
        }
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(jConstraints);
        return MeasureScope.CC.p(measureScope, placeableMo4235measureBRTryo0.getWidth(), placeableMo4235measureBRTryo0.getHeight(), null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.SizeModifier$measure$1
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
        long jM515getTargetConstraintsOenEA2s = m515getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m5232getHasFixedHeightimpl(jM515getTargetConstraintsOenEA2s) ? Constraints.m5234getMaxHeightimpl(jM515getTargetConstraintsOenEA2s) : ConstraintsKt.m5248constrainHeightK40F9xA(jM515getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
        kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
        long jM515getTargetConstraintsOenEA2s = m515getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m5233getHasFixedWidthimpl(jM515getTargetConstraintsOenEA2s) ? Constraints.m5235getMaxWidthimpl(jM515getTargetConstraintsOenEA2s) : ConstraintsKt.m5249constrainWidthK40F9xA(jM515getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    public /* synthetic */ SizeModifier(float f, float f2, float f3, float f4, boolean z, kj.l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM() : f, (i2 & 2) != 0 ? Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM() : f2, (i2 & 4) != 0 ? Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM() : f3, (i2 & 8) != 0 ? Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM() : f4, z, lVar, null);
    }

    private SizeModifier(float f, float f2, float f3, float f4, boolean z, kj.l<? super InspectorInfo, kotlin.j> lVar) {
        super(lVar);
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
    }
}
