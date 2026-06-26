package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J)\u0010\u0015\u001a\u00020\u0016*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u001a\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "enforceIncoming", "", "getEnforceIncoming", "()Z", "calculateContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
interface IntrinsicSizeModifier extends LayoutModifier {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.IntrinsicSizeModifier$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: Intrinsic.kt */
    public final /* synthetic */ class CC {
        public static boolean a(IntrinsicSizeModifier intrinsicSizeModifier) {
            return true;
        }

        public static int b(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
            kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
            return intrinsicMeasurable.maxIntrinsicHeight(i2);
        }

        public static int c(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
            kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
            return intrinsicMeasurable.maxIntrinsicWidth(i2);
        }

        public static MeasureResult d(IntrinsicSizeModifier intrinsicSizeModifier, MeasureScope measureScope, Measurable measurable, long j) {
            kotlin.jvm.internal.m.h(measureScope, "$this$measure");
            kotlin.jvm.internal.m.h(measurable, "measurable");
            long jMo445calculateContentConstraintsl58MMJ0 = intrinsicSizeModifier.mo445calculateContentConstraintsl58MMJ0(measureScope, measurable, j);
            if (intrinsicSizeModifier.getEnforceIncoming()) {
                jMo445calculateContentConstraintsl58MMJ0 = ConstraintsKt.m5247constrainN9IONVI(j, jMo445calculateContentConstraintsl58MMJ0);
            }
            final Placeable placeableMo4235measureBRTryo0 = measurable.mo4235measureBRTryo0(jMo445calculateContentConstraintsl58MMJ0);
            return MeasureScope.CC.p(measureScope, placeableMo4235measureBRTryo0.getWidth(), placeableMo4235measureBRTryo0.getHeight(), null, new kj.l<Placeable.PlacementScope, kotlin.j>() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return kotlin.j.a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    kotlin.jvm.internal.m.h(placementScope, "$this$layout");
                    Placeable.PlacementScope.m4273placeRelative70tqf50$default(placementScope, placeableMo4235measureBRTryo0, IntOffset.INSTANCE.m5395getZeronOccac(), 0.0f, 2, null);
                }
            }, 4, null);
        }

        public static int e(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
            kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
            return intrinsicMeasurable.minIntrinsicHeight(i2);
        }

        public static int f(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            kotlin.jvm.internal.m.h(intrinsicMeasureScope, "<this>");
            kotlin.jvm.internal.m.h(intrinsicMeasurable, "measurable");
            return intrinsicMeasurable.minIntrinsicWidth(i2);
        }
    }

    /* JADX INFO: renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    long mo445calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j);

    boolean getEnforceIncoming();

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    MeasureResult mo47measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2);
}
