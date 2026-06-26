package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kj.l;
import kj.p;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u001c\u0010\u0016\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001c\u0010\u001b\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J)\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001c\u0010%\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001c\u0010&\u001a\u00020\u0013*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "scrollerState", "Landroidx/compose/foundation/ScrollState;", "isReversed", "", "isVertical", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "()Z", "getScrollerState", "()Landroidx/compose/foundation/ScrollState;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
final /* data */ class ScrollingLayoutModifier implements LayoutModifier {
    private final boolean isReversed;
    private final boolean isVertical;
    private final ScrollState scrollerState;

    public ScrollingLayoutModifier(ScrollState scrollState, boolean z, boolean z2) {
        m.h(scrollState, "scrollerState");
        this.scrollerState = scrollState;
        this.isReversed = z;
        this.isVertical = z2;
    }

    public static /* synthetic */ ScrollingLayoutModifier copy$default(ScrollingLayoutModifier scrollingLayoutModifier, ScrollState scrollState, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            scrollState = scrollingLayoutModifier.scrollerState;
        }
        if ((i2 & 2) != 0) {
            z = scrollingLayoutModifier.isReversed;
        }
        if ((i2 & 4) != 0) {
            z2 = scrollingLayoutModifier.isVertical;
        }
        return scrollingLayoutModifier.copy(scrollState, z, z2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(l lVar) {
        return androidx.compose.ui.b.a(this, lVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(l lVar) {
        return androidx.compose.ui.b.b(this, lVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final ScrollingLayoutModifier copy(ScrollState scrollerState, boolean isReversed, boolean isVertical) {
        m.h(scrollerState, "scrollerState");
        return new ScrollingLayoutModifier(scrollerState, isReversed, isVertical);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollingLayoutModifier)) {
            return false;
        }
        ScrollingLayoutModifier scrollingLayoutModifier = (ScrollingLayoutModifier) other;
        return m.c(this.scrollerState, scrollingLayoutModifier.scrollerState) && this.isReversed == scrollingLayoutModifier.isReversed && this.isVertical == scrollingLayoutModifier.isVertical;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.scrollerState.hashCode() * 31;
        boolean z = this.isReversed;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (iHashCode + r1) * 31;
        boolean z2 = this.isVertical;
        return i2 + (z2 ? 1 : z2);
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(intrinsicMeasurable, "measurable");
        return this.isVertical ? intrinsicMeasurable.maxIntrinsicHeight(i2) : intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(intrinsicMeasurable, "measurable");
        return this.isVertical ? intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE) : intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        m.h(measureScope, "$this$measure");
        m.h(measurable, "measurable");
        CheckScrollableContainerConstraintsKt.m202checkScrollableContainerConstraintsK40F9xA(j, this.isVertical ? Orientation.Vertical : Orientation.Horizontal);
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(Constraints.m5226copyZbe2FdA$default(j, 0, this.isVertical ? Constraints.m5235getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.m5234getMaxHeightimpl(j), 5, null));
        int width = placeableMo4235measureBRTryo0.getWidth();
        int iM5235getMaxWidthimpl = Constraints.m5235getMaxWidthimpl(j);
        int i2 = width > iM5235getMaxWidthimpl ? iM5235getMaxWidthimpl : width;
        int height = placeableMo4235measureBRTryo0.getHeight();
        int iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(j);
        int i3 = height > iM5234getMaxHeightimpl ? iM5234getMaxHeightimpl : height;
        final int height2 = placeableMo4235measureBRTryo0.getHeight() - i3;
        int width2 = placeableMo4235measureBRTryo0.getWidth() - i2;
        if (!this.isVertical) {
            height2 = width2;
        }
        this.scrollerState.setMaxValue$foundation_release(height2);
        this.scrollerState.setViewportSize$foundation_release(this.isVertical ? i3 : i2);
        return MeasureScope.CC.p(measureScope, i2, i3, null, new l<Placeable.PlacementScope, j>() { // from class: androidx.compose.foundation.ScrollingLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return j.a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                m.h(placementScope, "$this$layout");
                int i4 = a.l.i(this.this$0.getScrollerState().getValue(), 0, height2);
                int i5 = this.this$0.isReversed() ? i4 - height2 : -i4;
                Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeableMo4235measureBRTryo0, this.this$0.isVertical() ? 0 : i5, this.this$0.isVertical() ? i5 : 0, 0.0f, null, 12, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(intrinsicMeasurable, "measurable");
        return this.isVertical ? intrinsicMeasurable.minIntrinsicHeight(i2) : intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        m.h(intrinsicMeasureScope, "<this>");
        m.h(intrinsicMeasurable, "measurable");
        return this.isVertical ? intrinsicMeasurable.minIntrinsicWidth(Integer.MAX_VALUE) : intrinsicMeasurable.minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return androidx.compose.ui.a.a(this, modifier);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScrollingLayoutModifier(scrollerState=");
        sb.append(this.scrollerState);
        sb.append(", isReversed=");
        sb.append(this.isReversed);
        sb.append(", isVertical=");
        return androidx.compose.animation.a.d(sb, this.isVertical, ')');
    }
}
