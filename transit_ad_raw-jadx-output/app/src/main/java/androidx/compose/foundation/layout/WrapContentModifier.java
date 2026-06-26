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
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kj.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BP\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0017\u0012\u0006\u0010\u001d\u001a\u00020\f\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fø\u0001\u0001¢\u0006\u0004\b#\u0010$J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R)\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00178\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "other", "", "equals", "", "hashCode", "Landroidx/compose/foundation/layout/Direction;", "direction", "Landroidx/compose/foundation/layout/Direction;", "unbounded", "Z", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "alignmentCallback", "Lkj/p;", "align", "Ljava/lang/Object;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLkj/p;Ljava/lang/Object;Lkj/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class WrapContentModifier extends InspectorValueInfo implements LayoutModifier {
    private final Object align;
    private final p<IntSize, LayoutDirection, IntOffset> alignmentCallback;
    private final Direction direction;
    private final boolean unbounded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentModifier(Direction direction, boolean z, p<? super IntSize, ? super LayoutDirection, IntOffset> pVar, Object obj, kj.l<? super InspectorInfo, kotlin.j> lVar) {
        super(lVar);
        kotlin.jvm.internal.m.h(direction, "direction");
        kotlin.jvm.internal.m.h(pVar, "alignmentCallback");
        kotlin.jvm.internal.m.h(obj, "align");
        kotlin.jvm.internal.m.h(lVar, "inspectorInfo");
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = pVar;
        this.align = obj;
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
        if (!(other instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) other;
        return this.direction == wrapContentModifier.direction && this.unbounded == wrapContentModifier.unbounded && kotlin.jvm.internal.m.c(this.align, wrapContentModifier.align);
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
        return this.align.hashCode() + (((this.direction.hashCode() * 31) + (this.unbounded ? 1231 : 1237)) * 31);
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
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int iM5237getMinWidthimpl = direction != direction2 ? 0 : Constraints.m5237getMinWidthimpl(j);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(ConstraintsKt.Constraints(iM5237getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m5235getMaxWidthimpl(j) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m5236getMinHeightimpl(j) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m5234getMaxHeightimpl(j) : Integer.MAX_VALUE));
        final int i2 = a.l.i(placeableMo4235measureBRTryo0.getWidth(), Constraints.m5237getMinWidthimpl(j), Constraints.m5235getMaxWidthimpl(j));
        final int i3 = a.l.i(placeableMo4235measureBRTryo0.getHeight(), Constraints.m5236getMinHeightimpl(j), Constraints.m5234getMaxHeightimpl(j));
        return MeasureScope.CC.p(measureScope, i2, i3, null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.WrapContentModifier$measure$1
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
                Placeable.PlacementScope.m4272place70tqf50$default(placementScope, placeableMo4235measureBRTryo0, ((IntOffset) this.this$0.alignmentCallback.invoke(IntSize.m5419boximpl(IntSizeKt.IntSize(i2 - placeableMo4235measureBRTryo0.getWidth(), i3 - placeableMo4235measureBRTryo0.getHeight())), measureScope.getLayoutDirection())).getPackedValue(), 0.0f, 2, null);
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
