package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectC;
        kotlin.jvm.internal.m.h(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectC = b.c(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m5427getWidthimpl(layoutCoordinates.mo4239getSizeYbymL2g()), IntSize.m5426getHeightimpl(layoutCoordinates.mo4239getSizeYbymL2g())) : rectC;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.m.h(layoutCoordinates, "<this>");
        return b.c(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.m.h(layoutCoordinates, "<this>");
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        float fM5427getWidthimpl = IntSize.m5427getWidthimpl(layoutCoordinatesFindRootCoordinates.mo4239getSizeYbymL2g());
        float fM5426getHeightimpl = IntSize.m5426getHeightimpl(layoutCoordinatesFindRootCoordinates.mo4239getSizeYbymL2g());
        float fH = a.l.h(rectBoundsInRoot.getLeft(), 0.0f, fM5427getWidthimpl);
        float fH2 = a.l.h(rectBoundsInRoot.getTop(), 0.0f, fM5426getHeightimpl);
        float fH3 = a.l.h(rectBoundsInRoot.getRight(), 0.0f, fM5427getWidthimpl);
        float fH4 = a.l.h(rectBoundsInRoot.getBottom(), 0.0f, fM5426getHeightimpl);
        if (!(fH == fH3)) {
            if (!(fH2 == fH4)) {
                long jMo4242localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo4242localToWindowMKHz9U(OffsetKt.Offset(fH, fH2));
                long jMo4242localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo4242localToWindowMKHz9U(OffsetKt.Offset(fH3, fH2));
                long jMo4242localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo4242localToWindowMKHz9U(OffsetKt.Offset(fH3, fH4));
                long jMo4242localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo4242localToWindowMKHz9U(OffsetKt.Offset(fH, fH4));
                return new Rect(bk.f.r(Offset.m2585getXimpl(jMo4242localToWindowMKHz9U), new float[]{Offset.m2585getXimpl(jMo4242localToWindowMKHz9U2), Offset.m2585getXimpl(jMo4242localToWindowMKHz9U4), Offset.m2585getXimpl(jMo4242localToWindowMKHz9U3)}), bk.f.r(Offset.m2586getYimpl(jMo4242localToWindowMKHz9U), new float[]{Offset.m2586getYimpl(jMo4242localToWindowMKHz9U2), Offset.m2586getYimpl(jMo4242localToWindowMKHz9U4), Offset.m2586getYimpl(jMo4242localToWindowMKHz9U3)}), bk.f.q(Offset.m2585getXimpl(jMo4242localToWindowMKHz9U), new float[]{Offset.m2585getXimpl(jMo4242localToWindowMKHz9U2), Offset.m2585getXimpl(jMo4242localToWindowMKHz9U4), Offset.m2585getXimpl(jMo4242localToWindowMKHz9U3)}), bk.f.q(Offset.m2586getYimpl(jMo4242localToWindowMKHz9U), new float[]{Offset.m2586getYimpl(jMo4242localToWindowMKHz9U2), Offset.m2586getYimpl(jMo4242localToWindowMKHz9U4), Offset.m2586getYimpl(jMo4242localToWindowMKHz9U3)}));
            }
        }
        return Rect.INSTANCE.getZero();
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        kotlin.jvm.internal.m.h(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.m.h(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo4240localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m2601getZeroF1C5BW0()) : Offset.INSTANCE.m2601getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.m.h(layoutCoordinates, "<this>");
        return layoutCoordinates.mo4241localToRootMKHz9U(Offset.INSTANCE.m2601getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        kotlin.jvm.internal.m.h(layoutCoordinates, "<this>");
        return layoutCoordinates.mo4242localToWindowMKHz9U(Offset.INSTANCE.m2601getZeroF1C5BW0());
    }
}
