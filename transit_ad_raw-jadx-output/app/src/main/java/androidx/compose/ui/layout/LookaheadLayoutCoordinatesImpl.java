package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: LookaheadLayoutCoordinates.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b;\u0010<J%\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\nJ%\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J%\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0096\u0002R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001d\u0010/\u001a\u00020,8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001f008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00106\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00105R\u0014\u00109\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutCoordinatesImpl;", "Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;", "sourceCoordinates", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "localLookaheadPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LookaheadLayoutCoordinates;J)J", "localLookaheadPositionOf", "relativeToWindow", "windowToLocal-MK-Hz9U", "(J)J", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "Landroidx/compose/ui/layout/LayoutCoordinates;", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "Lkotlin/j;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformFrom", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "Landroidx/compose/ui/node/LookaheadDelegate;", "lookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getLookaheadDelegate", "()Landroidx/compose/ui/node/LookaheadDelegate;", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "", "getProvidedAlignmentLines", "()Ljava/util/Set;", "providedAlignmentLines", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentCoordinates", "parentCoordinates", "isAttached", "()Z", "<init>", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class LookaheadLayoutCoordinatesImpl implements LookaheadLayoutCoordinates {
    private final LookaheadDelegate lookaheadDelegate;

    public LookaheadLayoutCoordinatesImpl(LookaheadDelegate lookaheadDelegate) {
        kotlin.jvm.internal.m.h(lookaheadDelegate, "lookaheadDelegate");
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public int get(AlignmentLine alignmentLine) {
        kotlin.jvm.internal.m.h(alignmentLine, "alignmentLine");
        return getCoordinator().get(alignmentLine);
    }

    public final NodeCoordinator getCoordinator() {
        return this.lookaheadDelegate.getCoordinator();
    }

    public final LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentCoordinates() {
        return getCoordinator().getParentCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public LayoutCoordinates getParentLayoutCoordinates() {
        return getCoordinator().getParentLayoutCoordinates();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo4239getSizeYbymL2g() {
        return getCoordinator().mo4239getSizeYbymL2g();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        kotlin.jvm.internal.m.h(sourceCoordinates, "sourceCoordinates");
        return getCoordinator().localBoundingBoxOf(sourceCoordinates, clipBounds);
    }

    @Override // androidx.compose.ui.layout.LookaheadLayoutCoordinates
    /* JADX INFO: renamed from: localLookaheadPositionOf-R5De75A */
    public long mo4248localLookaheadPositionOfR5De75A(LookaheadLayoutCoordinates sourceCoordinates, long relativeToSource) {
        kotlin.jvm.internal.m.h(sourceCoordinates, "sourceCoordinates");
        LookaheadDelegate lookaheadDelegate = ((LookaheadLayoutCoordinatesImpl) sourceCoordinates).lookaheadDelegate;
        LookaheadDelegate lookaheadDelegate2 = getCoordinator().findCommonAncestor$ui_release(lookaheadDelegate.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            long jM4392positionInBjo55l4$ui_release = lookaheadDelegate.m4392positionInBjo55l4$ui_release(lookaheadDelegate2);
            long jIntOffset = IntOffsetKt.IntOffset(a.f.f0(Offset.m2585getXimpl(relativeToSource)), a.f.f0(Offset.m2586getYimpl(relativeToSource)));
            long jC = androidx.browser.browseractions.a.c(jIntOffset, IntOffset.m5386getYimpl(jM4392positionInBjo55l4$ui_release), IntOffset.m5385getXimpl(jIntOffset) + IntOffset.m5385getXimpl(jM4392positionInBjo55l4$ui_release));
            long jM4392positionInBjo55l4$ui_release2 = this.lookaheadDelegate.m4392positionInBjo55l4$ui_release(lookaheadDelegate2);
            long jIntOffset2 = IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jC) - IntOffset.m5385getXimpl(jM4392positionInBjo55l4$ui_release2), IntOffset.m5386getYimpl(jC) - IntOffset.m5386getYimpl(jM4392positionInBjo55l4$ui_release2));
            return OffsetKt.Offset(IntOffset.m5385getXimpl(jIntOffset2), IntOffset.m5386getYimpl(jIntOffset2));
        }
        LookaheadDelegate rootLookaheadDelegate = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate);
        long jM4392positionInBjo55l4$ui_release3 = lookaheadDelegate.m4392positionInBjo55l4$ui_release(rootLookaheadDelegate);
        long position = rootLookaheadDelegate.getPosition();
        long jC2 = androidx.browser.browseractions.a.c(position, IntOffset.m5386getYimpl(jM4392positionInBjo55l4$ui_release3), IntOffset.m5385getXimpl(position) + IntOffset.m5385getXimpl(jM4392positionInBjo55l4$ui_release3));
        long jIntOffset3 = IntOffsetKt.IntOffset(a.f.f0(Offset.m2585getXimpl(relativeToSource)), a.f.f0(Offset.m2586getYimpl(relativeToSource)));
        long jC3 = androidx.browser.browseractions.a.c(jIntOffset3, IntOffset.m5386getYimpl(jC2), IntOffset.m5385getXimpl(jIntOffset3) + IntOffset.m5385getXimpl(jC2));
        LookaheadDelegate lookaheadDelegate3 = this.lookaheadDelegate;
        long jM4392positionInBjo55l4$ui_release4 = lookaheadDelegate3.m4392positionInBjo55l4$ui_release(LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3));
        long position2 = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(lookaheadDelegate3).getPosition();
        long jC4 = androidx.browser.browseractions.a.c(position2, IntOffset.m5386getYimpl(jM4392positionInBjo55l4$ui_release4), IntOffset.m5385getXimpl(position2) + IntOffset.m5385getXimpl(jM4392positionInBjo55l4$ui_release4));
        long jIntOffset4 = IntOffsetKt.IntOffset(IntOffset.m5385getXimpl(jC3) - IntOffset.m5385getXimpl(jC4), IntOffset.m5386getYimpl(jC3) - IntOffset.m5386getYimpl(jC4));
        NodeCoordinator wrappedBy = LookaheadLayoutCoordinatesKt.getRootLookaheadDelegate(this.lookaheadDelegate).getCoordinator().getWrappedBy();
        kotlin.jvm.internal.m.e(wrappedBy);
        NodeCoordinator wrappedBy2 = rootLookaheadDelegate.getCoordinator().getWrappedBy();
        kotlin.jvm.internal.m.e(wrappedBy2);
        return wrappedBy.mo4240localPositionOfR5De75A(wrappedBy2, OffsetKt.Offset(IntOffset.m5385getXimpl(jIntOffset4), IntOffset.m5386getYimpl(jIntOffset4)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo4240localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        kotlin.jvm.internal.m.h(sourceCoordinates, "sourceCoordinates");
        return getCoordinator().mo4240localPositionOfR5De75A(sourceCoordinates, relativeToSource);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo4241localToRootMKHz9U(long relativeToLocal) {
        return getCoordinator().mo4241localToRootMKHz9U(relativeToLocal);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo4242localToWindowMKHz9U(long relativeToLocal) {
        return getCoordinator().mo4242localToWindowMKHz9U(relativeToLocal);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo4243transformFromEL8BTi8(LayoutCoordinates sourceCoordinates, float[] matrix) {
        kotlin.jvm.internal.m.h(sourceCoordinates, "sourceCoordinates");
        kotlin.jvm.internal.m.h(matrix, "matrix");
        getCoordinator().mo4243transformFromEL8BTi8(sourceCoordinates, matrix);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo4244windowToLocalMKHz9U(long relativeToWindow) {
        return getCoordinator().mo4244windowToLocalMKHz9U(relativeToWindow);
    }
}
