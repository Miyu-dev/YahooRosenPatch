package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverNodeKt;
import androidx.compose.ui.node.Owner;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusTransactions.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0001\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\r"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "requestFocus", "requestFocusForChild", "childNode", "requestFocusForOwner", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FocusTransactionsKt {

    /* JADX INFO: compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @ExperimentalComposeUiApi
    public static final boolean captureFocus(FocusTargetModifierNode focusTargetModifierNode) throws NoWhenBranchMatchedException {
        m.h(focusTargetModifierNode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i2 == 1) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Captured);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ExperimentalComposeUiApi
    private static final boolean clearChildFocus(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2) {
        FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    public static /* synthetic */ boolean clearChildFocus$default(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetModifierNode, z, z2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @ExperimentalComposeUiApi
    public static final boolean clearFocus(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2) throws NoWhenBranchMatchedException {
        m.h(focusTargetModifierNode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i2 == 1) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
            if (z2) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            }
        } else {
            if (i2 == 2) {
                if (!z) {
                    return z;
                }
                focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
                if (!z2) {
                    return z;
                }
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                return z;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!clearChildFocus(focusTargetModifierNode, z, z2)) {
                    return false;
                }
                focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
                if (z2) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetModifierNode, z, z2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @ExperimentalComposeUiApi
    public static final boolean freeFocus(FocusTargetModifierNode focusTargetModifierNode) throws NoWhenBranchMatchedException {
        m.h(focusTargetModifierNode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        }
        if (i2 == 3 || i2 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean grantFocus(final FocusTargetModifierNode focusTargetModifierNode) {
        ObserverNodeKt.observeReads(focusTargetModifierNode, new kj.a<j>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m2536invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2536invoke() {
                focusTargetModifierNode.fetchFocusProperties$ui_release();
            }
        });
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i2 != 3 && i2 != 4) {
            return true;
        }
        focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @ExperimentalComposeUiApi
    public static final boolean requestFocus(FocusTargetModifierNode focusTargetModifierNode) throws NoWhenBranchMatchedException {
        boolean z;
        m.h(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
            return TwoDimensionalFocusSearchKt.m2546findChildCorrespondingToFocusEnterOMvw8(focusTargetModifierNode, FocusDirection.INSTANCE.m2515getEnterdhqQ8s(), new l<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1
                public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode2) {
                    m.h(focusTargetModifierNode2, "it");
                    return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetModifierNode2));
                }
            });
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i2 == 1 || i2 == 2) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        }
        if (i2 == 3) {
            z = clearChildFocus$default(focusTargetModifierNode, false, false, 3, null) && grantFocus(focusTargetModifierNode);
            if (z) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            }
            return z;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING));
        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) (nodeNearestAncestor instanceof FocusTargetModifierNode ? nodeNearestAncestor : null);
        if (focusTargetModifierNode2 != null) {
            return requestFocusForChild(focusTargetModifierNode2, focusTargetModifierNode);
        }
        z = requestFocusForOwner(focusTargetModifierNode) && grantFocus(focusTargetModifierNode);
        if (z) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
        }
        return z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean requestFocusForChild(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) throws NoWhenBranchMatchedException {
        Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode2, NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING));
        if (!(nodeNearestAncestor instanceof FocusTargetModifierNode)) {
            nodeNearestAncestor = null;
        }
        if (!m.c((FocusTargetModifierNode) nodeNearestAncestor, focusTargetModifierNode)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i2 == 1) {
            boolean zGrantFocus = grantFocus(focusTargetModifierNode2);
            if (!zGrantFocus) {
                return zGrantFocus;
            }
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.ActiveParent);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode2);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return zGrantFocus;
        }
        if (i2 == 2) {
            return false;
        }
        if (i2 == 3) {
            if (FocusTraversalKt.getActiveChild(focusTargetModifierNode) == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            boolean z = clearChildFocus$default(focusTargetModifierNode, false, false, 3, null) && grantFocus(focusTargetModifierNode2);
            if (z) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode2);
            }
            return z;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Modifier.Node nodeNearestAncestor2 = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING));
        FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) (nodeNearestAncestor2 instanceof FocusTargetModifierNode ? nodeNearestAncestor2 : null);
        if (focusTargetModifierNode3 == null && requestFocusForOwner(focusTargetModifierNode)) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return requestFocusForChild(focusTargetModifierNode, focusTargetModifierNode2);
        }
        if (focusTargetModifierNode3 == null || !requestFocusForChild(focusTargetModifierNode3, focusTargetModifierNode)) {
            return false;
        }
        boolean zRequestFocusForChild = requestFocusForChild(focusTargetModifierNode, focusTargetModifierNode2);
        if (focusTargetModifierNode.getFocusState() == FocusStateImpl.ActiveParent) {
            return zRequestFocusForChild;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final boolean requestFocusForOwner(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        Owner owner;
        NodeCoordinator coordinator = focusTargetModifierNode.getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return owner.requestFocus();
    }
}
