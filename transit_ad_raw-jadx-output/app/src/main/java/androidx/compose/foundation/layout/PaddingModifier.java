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
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BN\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!ø\u0001\u0001¢\u0006\u0004\b%\u0010&J)\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0016J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R \u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R \u0010\u0019\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R \u0010\u001b\u001a\u00020\u00128\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/PaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/unit/Dp;", "start", "F", "getStart-D9Ej5fM", "()F", "top", "getTop-D9Ej5fM", "end", "getEnd-D9Ej5fM", "bottom", "getBottom-D9Ej5fM", "rtlAware", "Z", "getRtlAware", "()Z", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/j;", "inspectorInfo", "<init>", "(FFFFZLkj/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
final class PaddingModifier extends InspectorValueInfo implements LayoutModifier {
    private final float bottom;
    private final float end;
    private final boolean rtlAware;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingModifier(float f, float f2, float f3, float f4, boolean z, kj.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, lVar);
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
        PaddingModifier paddingModifier = other instanceof PaddingModifier ? (PaddingModifier) other : null;
        return paddingModifier != null && Dp.m5272equalsimpl0(this.start, paddingModifier.start) && Dp.m5272equalsimpl0(this.top, paddingModifier.top) && Dp.m5272equalsimpl0(this.end, paddingModifier.end) && Dp.m5272equalsimpl0(this.bottom, paddingModifier.bottom) && this.rtlAware == paddingModifier.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, p pVar) {
        return androidx.compose.ui.b.c(this, obj, pVar);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, p pVar) {
        return androidx.compose.ui.b.d(this, obj, pVar);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return androidx.browser.browseractions.a.a(this.bottom, androidx.browser.browseractions.a.a(this.end, androidx.browser.browseractions.a.a(this.top, Dp.m5273hashCodeimpl(this.start) * 31, 31), 31), 31) + (this.rtlAware ? 1231 : 1237);
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
        int iMo342roundToPx0680j_4 = measureScope.mo342roundToPx0680j_4(this.end) + measureScope.mo342roundToPx0680j_4(this.start);
        int iMo342roundToPx0680j_42 = measureScope.mo342roundToPx0680j_4(this.bottom) + measureScope.mo342roundToPx0680j_4(this.top);
        final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(ConstraintsKt.m5251offsetNN6EwU(j, -iMo342roundToPx0680j_4, -iMo342roundToPx0680j_42));
        return MeasureScope.CC.p(measureScope, ConstraintsKt.m5249constrainWidthK40F9xA(j, placeableMo4235measureBRTryo0.getWidth() + iMo342roundToPx0680j_4), ConstraintsKt.m5248constrainHeightK40F9xA(j, placeableMo4235measureBRTryo0.getHeight() + iMo342roundToPx0680j_42), null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.PaddingModifier$measure$1
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
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4235measureBRTryo0, measureScope.mo342roundToPx0680j_4(this.this$0.getStart()), measureScope.mo342roundToPx0680j_4(this.this$0.getTop()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo4235measureBRTryo0, measureScope.mo342roundToPx0680j_4(this.this$0.getStart()), measureScope.mo342roundToPx0680j_4(this.this$0.getTop()), 0.0f, 4, null);
                }
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

    private PaddingModifier(float f, float f2, float f3, float f4, boolean z, kj.l<? super InspectorInfo, kotlin.j> lVar) {
        super(lVar);
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.rtlAware = z;
        if (!((f >= 0.0f || Dp.m5272equalsimpl0(f, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM())) && (f2 >= 0.0f || Dp.m5272equalsimpl0(f2, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM())) && ((f3 >= 0.0f || Dp.m5272equalsimpl0(f3, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM())) && (f4 >= 0.0f || Dp.m5272equalsimpl0(f4, Dp.INSTANCE.m5287getUnspecifiedD9Ej5fM()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public /* synthetic */ PaddingModifier(float f, float f2, float f3, float f4, boolean z, kj.l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.m5267constructorimpl(0) : f, (i2 & 2) != 0 ? Dp.m5267constructorimpl(0) : f2, (i2 & 4) != 0 ? Dp.m5267constructorimpl(0) : f3, (i2 & 8) != 0 ? Dp.m5267constructorimpl(0) : f4, z, lVar, null);
    }
}
