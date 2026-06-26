package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J;\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R3\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR3\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u001e8\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u0014\u0010#\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u0014\u0010%\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u001d\u0010'\u001a\u00020\u00048DX\u0084\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "Lkotlin/j;", "recalculateWidthAndHeight", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeAt-f8xVGno", "(JFLkj/l;)V", "placeAt", "", "<set-?>", "width", "I", "getWidth", "()I", "height", "getHeight", "Landroidx/compose/ui/unit/IntSize;", "value", "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "getApparentToRealOffset-nOcc-ac", "apparentToRealOffset", "<init>", "()V", "PlacementScope", "ui_release"}, k = 1, mv = {1, 8, 0})
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private int width;

    private final void recalculateWidthAndHeight() {
        this.width = a.l.i(IntSize.m5427getWidthimpl(this.measuredSize), Constraints.m5237getMinWidthimpl(this.measurementConstraints), Constraints.m5235getMaxWidthimpl(this.measurementConstraints));
        this.height = a.l.i(IntSize.m5426getHeightimpl(this.measuredSize), Constraints.m5236getMinHeightimpl(this.measurementConstraints), Constraints.m5234getMaxHeightimpl(this.measurementConstraints));
    }

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m4267getApparentToRealOffsetnOccac() {
        return IntOffsetKt.IntOffset((this.width - IntSize.m5427getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m5426getHeightimpl(this.measuredSize)) / 2);
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m5426getHeightimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m5427getWidthimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    @Override // androidx.compose.ui.layout.Measured
    public /* synthetic */ Object getParentData() {
        return f.a(this);
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo4236placeAtf8xVGno(long position, float zIndex, kj.l<? super GraphicsLayerScope, kotlin.j> layerBlock);

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m4270setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m5425equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        recalculateWidthAndHeight();
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m4271setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m5228equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        recalculateWidthAndHeight();
    }

    /* JADX INFO: compiled from: Placeable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b)\u0010'J)\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J$\u0010\u000e\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0005J)\u0010\u000e\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\tJ?\u0010\u0015\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010J:\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010J?\u0010\u0016\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00070\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0014JE\u0010\u0019\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\b\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0014JE\u0010\u001b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\b\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u000b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010#8WX\u0097\u0004¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/j;", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", "x", "y", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLkj/l;)V", "placeRelativeWithLayer", "placeWithLayer", "placeWithLayer-aW-9-wM", "placeAutoMirrored-aW-9-wM$ui_release", "placeAutoMirrored", "placeApparentToRealOffset-aW-9-wM$ui_release", "placeApparentToRealOffset", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates$annotations", "()V", "coordinates", "<init>", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class PlacementScope {
        public static final int $stable = 0;
        private static LayoutCoordinates _coordinates;
        private static LayoutNodeLayoutDelegate layoutDelegate;
        private static int parentWidth;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static LayoutDirection parentLayoutDirection = LayoutDirection.Ltr;

        /* JADX INFO: compiled from: Placeable.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J<\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0014\b\u0004\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000bH\u0086\bø\u0001\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00168VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "scope", "", "configureForPlacingForAlignment", "", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "lookaheadCapablePlaceable", "Lkotlin/Function1;", "Lkotlin/j;", "block", "executeWithRtlMirroringValues", "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "I", "getParentWidth", "()I", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates$annotations", "()V", "coordinates", "_coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion extends PlacementScope {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean configureForPlacingForAlignment(LookaheadCapablePlaceable scope) {
                boolean z = false;
                if (scope == null) {
                    PlacementScope._coordinates = null;
                    PlacementScope.layoutDelegate = null;
                    return false;
                }
                boolean zIsPlacingForAlignment$ui_release = scope.getIsPlacingForAlignment();
                LookaheadCapablePlaceable parent = scope.getParent();
                if (parent != null && parent.getIsPlacingForAlignment()) {
                    z = true;
                }
                if (z) {
                    scope.setPlacingForAlignment$ui_release(true);
                }
                PlacementScope.layoutDelegate = scope.getLayoutNode().getLayoutDelegate();
                if (scope.getIsPlacingForAlignment() || scope.getIsShallowPlacing()) {
                    PlacementScope._coordinates = null;
                } else {
                    PlacementScope._coordinates = scope.getCoordinates();
                }
                return zIsPlacingForAlignment$ui_release;
            }

            public final void executeWithRtlMirroringValues(int i2, LayoutDirection layoutDirection, LookaheadCapablePlaceable lookaheadCapablePlaceable, kj.l<? super PlacementScope, kotlin.j> lVar) {
                kotlin.jvm.internal.m.h(layoutDirection, "parentLayoutDirection");
                kotlin.jvm.internal.m.h(lVar, "block");
                LayoutCoordinates layoutCoordinates = PlacementScope._coordinates;
                Companion companion = PlacementScope.INSTANCE;
                int parentWidth = companion.getParentWidth();
                LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = PlacementScope.layoutDelegate;
                PlacementScope.parentWidth = i2;
                PlacementScope.parentLayoutDirection = layoutDirection;
                boolean zConfigureForPlacingForAlignment = configureForPlacingForAlignment(lookaheadCapablePlaceable);
                lVar.invoke(this);
                if (lookaheadCapablePlaceable != null) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(zConfigureForPlacingForAlignment);
                }
                PlacementScope.parentWidth = parentWidth;
                PlacementScope.parentLayoutDirection = parentLayoutDirection;
                PlacementScope._coordinates = layoutCoordinates;
                PlacementScope.layoutDelegate = layoutNodeLayoutDelegate;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public LayoutCoordinates getCoordinates() {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = PlacementScope.layoutDelegate;
                if (layoutNodeLayoutDelegate != null) {
                    layoutNodeLayoutDelegate.setCoordinatesAccessedDuringPlacement(true);
                }
                return PlacementScope._coordinates;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.parentWidth;
            }

            private Companion() {
            }

            @ExperimentalComposeUiApi
            public static /* synthetic */ void getCoordinates$annotations() {
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i4 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i2, i3, f);
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m4272place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m4276place70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i4 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i2, i3, f);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m4273placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m4279placeRelative70tqf50(placeable, j, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f, kj.l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i4 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i4 & 8) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i2, i3, f2, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m4274placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, kj.l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i2 & 4) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m4280placeRelativeWithLayeraW9wM(placeable, j, f2, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f, kj.l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i4 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i4 & 8) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i2, i3, f2, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m4275placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, kj.l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i2 & 4) != 0) {
                lVar = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m4281placeWithLayeraW9wM(placeable, j, f2, lVar);
        }

        @ExperimentalComposeUiApi
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i2, int i3, float f) {
            kotlin.jvm.internal.m.h(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(jIntOffset), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(jIntOffset)), f, null);
        }

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m4276place70tqf50(Placeable placeable, long j, float f) {
            kotlin.jvm.internal.m.h(placeable, "$this$place");
            long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(j)), f, null);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m4277placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j, float f, kj.l<? super GraphicsLayerScope, kotlin.j> lVar) {
            kotlin.jvm.internal.m.h(placeable, "$this$placeApparentToRealOffset");
            long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(j)), f, lVar);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m4278placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j, float f, kj.l<? super GraphicsLayerScope, kotlin.j> lVar) {
            kotlin.jvm.internal.m.h(placeable, "$this$placeAutoMirrored");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
                placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(j)), f, lVar);
                return;
            }
            long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(j));
            long jM4267getApparentToRealOffsetnOccac2 = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5385getXimpl(jIntOffset), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5386getYimpl(jIntOffset)), f, lVar);
        }

        public final void placeRelative(Placeable placeable, int i2, int i3, float f) {
            kotlin.jvm.internal.m.h(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
                placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(jIntOffset), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(jIntOffset)), f, null);
                return;
            }
            long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5385getXimpl(jIntOffset), IntOffset.m5386getYimpl(jIntOffset));
            long jM4267getApparentToRealOffsetnOccac2 = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5385getXimpl(jIntOffset2), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5386getYimpl(jIntOffset2)), f, null);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m4279placeRelative70tqf50(Placeable placeable, long j, float f) {
            kotlin.jvm.internal.m.h(placeable, "$this$placeRelative");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
                placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(j)), f, null);
                return;
            }
            long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(j));
            long jM4267getApparentToRealOffsetnOccac2 = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5385getXimpl(jIntOffset), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5386getYimpl(jIntOffset)), f, null);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i2, int i3, float f, kj.l<? super GraphicsLayerScope, kotlin.j> lVar) {
            kotlin.jvm.internal.m.h(placeable, "<this>");
            kotlin.jvm.internal.m.h(lVar, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
                placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(jIntOffset), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(jIntOffset)), f, lVar);
                return;
            }
            long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5385getXimpl(jIntOffset), IntOffset.m5386getYimpl(jIntOffset));
            long jM4267getApparentToRealOffsetnOccac2 = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5385getXimpl(jIntOffset2), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5386getYimpl(jIntOffset2)), f, lVar);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m4280placeRelativeWithLayeraW9wM(Placeable placeable, long j, float f, kj.l<? super GraphicsLayerScope, kotlin.j> lVar) {
            kotlin.jvm.internal.m.h(placeable, "$this$placeRelativeWithLayer");
            kotlin.jvm.internal.m.h(lVar, "layerBlock");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
                placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(j)), f, lVar);
                return;
            }
            long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(j));
            long jM4267getApparentToRealOffsetnOccac2 = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5385getXimpl(jIntOffset), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac2) + IntOffset.m5386getYimpl(jIntOffset)), f, lVar);
        }

        public final void placeWithLayer(Placeable placeable, int i2, int i3, float f, kj.l<? super GraphicsLayerScope, kotlin.j> lVar) {
            kotlin.jvm.internal.m.h(placeable, "<this>");
            kotlin.jvm.internal.m.h(lVar, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(jIntOffset), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(jIntOffset)), f, lVar);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m4281placeWithLayeraW9wM(Placeable placeable, long j, float f, kj.l<? super GraphicsLayerScope, kotlin.j> lVar) {
            kotlin.jvm.internal.m.h(placeable, "$this$placeWithLayer");
            kotlin.jvm.internal.m.h(lVar, "layerBlock");
            long jM4267getApparentToRealOffsetnOccac = placeable.m4267getApparentToRealOffsetnOccac();
            placeable.mo4236placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5385getXimpl(j), IntOffset.m5386getYimpl(jM4267getApparentToRealOffsetnOccac) + IntOffset.m5386getYimpl(j)), f, lVar);
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCoordinates$annotations() {
        }
    }
}
