package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusTraversal.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a)\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0001\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000\u001a\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002\"\u001e\u0010\u0013\u001a\u00020\n*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\" \u0010\u001a\u001a\u0004\u0018\u00010\u0000*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "Lkotlin/Function1;", "", "onFound", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILandroidx/compose/ui/unit/LayoutDirection;Lkj/l;)Z", "focusSearch", "Landroidx/compose/ui/geometry/Rect;", "focusRect", "findActiveFocusNode", "findNonDeactivatedParent", "isEligibleForFocusSearch", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Z", "isEligibleForFocusSearch$annotations", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "getActiveChild", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getActiveChild$annotations", "activeChild", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class FocusTraversalKt {

    /* JADX INFO: compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m2537customFocusSearchOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i2, LayoutDirection layoutDirection) throws NoWhenBranchMatchedException {
        FocusRequester end;
        m.h(focusTargetModifierNode, "$this$customFocusSearch");
        m.h(layoutDirection, "layoutDirection");
        FocusProperties focusPropertiesFetchFocusProperties$ui_release = focusTargetModifierNode.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2519getNextdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2521getPreviousdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                end = focusPropertiesFetchFocusProperties$ui_release.getStart();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            }
            if (m.c(end, FocusRequester.INSTANCE.getDefault())) {
                end = null;
            }
            if (end == null) {
                return focusPropertiesFetchFocusProperties$ui_release.getLeft();
            }
        } else {
            if (!FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s())) {
                if (FocusDirection.m2506equalsimpl0(i2, companion.m2515getEnterdhqQ8s())) {
                    return (FocusRequester) focusPropertiesFetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m2503boximpl(i2));
                }
                if (FocusDirection.m2506equalsimpl0(i2, companion.m2516getExitdhqQ8s())) {
                    return (FocusRequester) focusPropertiesFetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m2503boximpl(i2));
                }
                throw new IllegalStateException("invalid FocusDirection".toString());
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i4 == 1) {
                end = focusPropertiesFetchFocusProperties$ui_release.getEnd();
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = focusPropertiesFetchFocusProperties$ui_release.getStart();
            }
            if (m.c(end, FocusRequester.INSTANCE.getDefault())) {
                end = null;
            }
            if (end == null) {
                return focusPropertiesFetchFocusProperties$ui_release.getRight();
            }
        }
        return end;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetModifierNode findActiveFocusNode(androidx.compose.ui.focus.FocusTargetModifierNode r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.m.h(r6, r0)
            androidx.compose.ui.focus.FocusStateImpl r0 = r6.getFocusStateImpl()
            int[] r1 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L98
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto L98
            r6 = 4
            if (r0 != r6) goto L1f
            return r3
        L1f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L25:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m4446constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r6.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 == 0) goto L8c
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r4 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r4]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$Node r4 = r6.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            if (r4 != 0) goto L51
            androidx.compose.ui.Modifier$Node r6 = r6.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L54
        L51:
            r2.add(r4)
        L54:
            boolean r6 = r2.isNotEmpty()
            if (r6 == 0) goto L8b
            int r6 = r2.getSize()
            int r6 = r6 - r1
            java.lang.Object r6 = r2.removeAt(r6)
            androidx.compose.ui.Modifier$Node r6 = (androidx.compose.ui.Modifier.Node) r6
            int r4 = r6.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 != 0) goto L70
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L54
        L70:
            if (r6 == 0) goto L54
            int r4 = r6.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L86
            boolean r4 = r6 instanceof androidx.compose.ui.focus.FocusTargetModifierNode
            if (r4 == 0) goto L54
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = (androidx.compose.ui.focus.FocusTargetModifierNode) r6
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = findActiveFocusNode(r6)
            if (r6 == 0) goto L54
            return r6
        L86:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L70
        L8b:
            return r3
        L8c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L98:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetModifierNode):androidx.compose.ui.focus.FocusTargetModifierNode");
    }

    private static final FocusTargetModifierNode findNonDeactivatedParent(FocusTargetModifierNode focusTargetModifierNode) {
        NodeChain nodes;
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = focusTargetModifierNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM4446constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM4446constructorimpl) != 0 && (parent instanceof FocusTargetModifierNode)) {
                        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) parent;
                        if (focusTargetModifierNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                            return focusTargetModifierNode2;
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    public static final Rect focusRect(FocusTargetModifierNode focusTargetModifierNode) {
        Rect rectLocalBoundingBoxOf;
        m.h(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator = focusTargetModifierNode.getCoordinator();
        return (coordinator == null || (rectLocalBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator).localBoundingBoxOf(coordinator, false)) == null) ? Rect.INSTANCE.getZero() : rectLocalBoundingBoxOf;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: renamed from: focusSearch-sMXa3k8, reason: not valid java name */
    public static final boolean m2538focusSearchsMXa3k8(FocusTargetModifierNode focusTargetModifierNode, int i2, LayoutDirection layoutDirection, l<? super FocusTargetModifierNode, Boolean> lVar) throws NoWhenBranchMatchedException {
        int iM2522getRightdhqQ8s;
        Boolean boolM2550twoDimensionalFocusSearchOMvw8;
        m.h(focusTargetModifierNode, "$this$focusSearch");
        m.h(layoutDirection, "layoutDirection");
        m.h(lVar, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2519getNextdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion.m2521getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m2541oneDimensionalFocusSearchOMvw8(focusTargetModifierNode, i2, lVar);
        }
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s()) ? true : FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s())) {
            Boolean boolM2550twoDimensionalFocusSearchOMvw82 = TwoDimensionalFocusSearchKt.m2550twoDimensionalFocusSearchOMvw8(focusTargetModifierNode, i2, lVar);
            if (boolM2550twoDimensionalFocusSearchOMvw82 != null) {
                return boolM2550twoDimensionalFocusSearchOMvw82.booleanValue();
            }
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2515getEnterdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                iM2522getRightdhqQ8s = companion.m2522getRightdhqQ8s();
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iM2522getRightdhqQ8s = companion.m2518getLeftdhqQ8s();
            }
            FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode = findActiveFocusNode(focusTargetModifierNode);
            if (focusTargetModifierNodeFindActiveFocusNode != null && (boolM2550twoDimensionalFocusSearchOMvw8 = TwoDimensionalFocusSearchKt.m2550twoDimensionalFocusSearchOMvw8(focusTargetModifierNodeFindActiveFocusNode, iM2522getRightdhqQ8s, lVar)) != null) {
                return boolM2550twoDimensionalFocusSearchOMvw8.booleanValue();
            }
        } else {
            if (!FocusDirection.m2506equalsimpl0(i2, companion.m2516getExitdhqQ8s())) {
                throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m2508toStringimpl(i2))).toString());
            }
            FocusTargetModifierNode focusTargetModifierNodeFindActiveFocusNode2 = findActiveFocusNode(focusTargetModifierNode);
            FocusTargetModifierNode focusTargetModifierNodeFindNonDeactivatedParent = focusTargetModifierNodeFindActiveFocusNode2 != null ? findNonDeactivatedParent(focusTargetModifierNodeFindActiveFocusNode2) : null;
            if (focusTargetModifierNodeFindNonDeactivatedParent != null && !m.c(focusTargetModifierNodeFindNonDeactivatedParent, focusTargetModifierNode)) {
                return ((Boolean) lVar.invoke(focusTargetModifierNodeFindNonDeactivatedParent)).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0040, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetModifierNode getActiveChild(androidx.compose.ui.focus.FocusTargetModifierNode r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.m.h(r6, r0)
            androidx.compose.ui.Modifier$Node r0 = r6.getNode()
            boolean r0 = r0.getIsAttached()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m4446constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r6.getNode()
            boolean r2 = r2.getIsAttached()
            if (r2 == 0) goto L88
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r3]
            r4 = 0
            r2.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r6.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild()
            if (r3 != 0) goto L3d
            androidx.compose.ui.Modifier$Node r6 = r6.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L40
        L3d:
            r2.add(r3)
        L40:
            boolean r6 = r2.isNotEmpty()
            if (r6 == 0) goto L87
            int r6 = r2.getSize()
            r3 = 1
            int r6 = r6 - r3
            java.lang.Object r6 = r2.removeAt(r6)
            androidx.compose.ui.Modifier$Node r6 = (androidx.compose.ui.Modifier.Node) r6
            int r4 = r6.getAggregateChildKindSet()
            r4 = r4 & r0
            if (r4 != 0) goto L5d
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r6)
            goto L40
        L5d:
            if (r6 == 0) goto L40
            int r4 = r6.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L82
            boolean r4 = r6 instanceof androidx.compose.ui.focus.FocusTargetModifierNode
            if (r4 == 0) goto L40
            androidx.compose.ui.focus.FocusTargetModifierNode r6 = (androidx.compose.ui.focus.FocusTargetModifierNode) r6
            androidx.compose.ui.focus.FocusStateImpl r4 = r6.getFocusStateImpl()
            int[] r5 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 == r3) goto L81
            r3 = 2
            if (r4 == r3) goto L81
            r3 = 3
            if (r4 == r3) goto L81
            goto L40
        L81:
            return r6
        L82:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild()
            goto L5d
        L87:
            return r1
        L88:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetModifierNode):androidx.compose.ui.focus.FocusTargetModifierNode");
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        m.h(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator = focusTargetModifierNode.getCoordinator();
        if ((coordinator == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.getIsPlaced()) ? false : true) {
            NodeCoordinator coordinator2 = focusTargetModifierNode.getCoordinator();
            if ((coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.isAttached()) ? false : true) {
                return true;
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getActiveChild$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void isEligibleForFocusSearch$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }
}
