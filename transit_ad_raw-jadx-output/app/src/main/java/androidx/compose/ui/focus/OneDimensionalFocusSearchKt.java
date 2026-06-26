package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.constraintlayout.core.widgets.Optimizer;
import kj.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.j;
import kotlin.jvm.internal.m;
import qj.f;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a \u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u001a \u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u001a=\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\r\u001a \u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u001a \u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0003\u001a\f\u0010\u0013\u001a\u00020\u0004*\u00020\u0000H\u0002\u001aG\u0010\u0019\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aG\u0010\u001b\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkj/l;)Z", "oneDimensionalFocusSearch", "forwardFocusSearch", "backwardFocusSearch", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkj/l;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "pickChildForForwardSearch", "pickChildForBackwardSearch", "isRoot", "T", "Landroidx/compose/runtime/collection/MutableVector;", "item", "Lkotlin/j;", "action", "forEachItemAfter", "(Landroidx/compose/runtime/collection/MutableVector;Ljava/lang/Object;Lkj/l;)V", "forEachItemBefore", "", "InvalidFocusDirection", "Ljava/lang/String;", "NoActiveChild", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
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
    private static final boolean backwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, l<? super FocusTargetModifierNode, Boolean> lVar) throws NoWhenBranchMatchedException {
        FocusStateImpl focusStateImpl = focusTargetModifierNode.getFocusStateImpl();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[focusStateImpl.ordinal()];
        if (i2 == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild == null) {
                throw new IllegalStateException(NoActiveChild.toString());
            }
            int i3 = iArr[activeChild.getFocusStateImpl().ordinal()];
            if (i3 != 1) {
                if (i3 == 2 || i3 == 3) {
                    return m2540generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.INSTANCE.m2521getPreviousdhqQ8s(), lVar);
                }
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(NoActiveChild.toString());
            }
            if (!backwardFocusSearch(activeChild, lVar) && !m2540generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.INSTANCE.m2521getPreviousdhqQ8s(), lVar) && (!activeChild.fetchFocusProperties$ui_release().getCanFocus() || !((Boolean) lVar.invoke(activeChild)).booleanValue())) {
                return false;
            }
        } else {
            if (i2 == 2 || i2 == 3) {
                return pickChildForBackwardSearch(focusTargetModifierNode, lVar);
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!pickChildForBackwardSearch(focusTargetModifierNode, lVar)) {
                if (!(focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() ? ((Boolean) lVar.invoke(focusTargetModifierNode)).booleanValue() : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t, l<? super T, j> lVar) {
        boolean z = false;
        int i2 = ((qj.d) new f(0, mutableVector.getSize() - 1)).b;
        if (i2 < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (z) {
                lVar.invoke(mutableVector.getContent()[i3]);
            }
            if (m.c(mutableVector.getContent()[i3], t)) {
                z = true;
            }
            if (i3 == i2) {
                return;
            } else {
                i3++;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t, l<? super T, j> lVar) {
        boolean z = false;
        int i2 = ((qj.d) new f(0, mutableVector.getSize() - 1)).b;
        if (i2 < 0) {
            return;
        }
        while (true) {
            if (z) {
                lVar.invoke(mutableVector.getContent()[i2]);
            }
            if (m.c(mutableVector.getContent()[i2], t)) {
                z = true;
            }
            if (i2 == 0) {
                return;
            } else {
                i2--;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @ExperimentalComposeUiApi
    private static final boolean forwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, l<? super FocusTargetModifierNode, Boolean> lVar) throws NoWhenBranchMatchedException {
        int i2 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i2 == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, lVar) || m2540generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.INSTANCE.m2519getNextdhqQ8s(), lVar);
            }
            throw new IllegalStateException(NoActiveChild.toString());
        }
        if (i2 == 2 || i2 == 3) {
            return pickChildForForwardSearch(focusTargetModifierNode, lVar);
        }
        if (i2 == 4) {
            return focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() ? ((Boolean) lVar.invoke(focusTargetModifierNode)).booleanValue() : pickChildForForwardSearch(focusTargetModifierNode, lVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m2540generateAndSearchChildren4C6V_qg(final FocusTargetModifierNode focusTargetModifierNode, final FocusTargetModifierNode focusTargetModifierNode2, final int i2, final l<? super FocusTargetModifierNode, Boolean> lVar) {
        if (m2542searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i2, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2502searchBeyondBoundsOMvw8(focusTargetModifierNode, i2, new l<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                m.h(beyondBoundsScope, "$this$searchBeyondBounds");
                Boolean boolValueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.m2542searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i2, lVar));
                if (boolValueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean isRoot(FocusTargetModifierNode focusTargetModifierNode) {
        Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING));
        if (!(nodeNearestAncestor instanceof FocusTargetModifierNode)) {
            nodeNearestAncestor = null;
        }
        return ((FocusTargetModifierNode) nodeNearestAncestor) == null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m2541oneDimensionalFocusSearchOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i2, l<? super FocusTargetModifierNode, Boolean> lVar) {
        m.h(focusTargetModifierNode, "$this$oneDimensionalFocusSearch");
        m.h(lVar, "onFound");
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2519getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetModifierNode, lVar);
        }
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2521getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetModifierNode, lVar);
        }
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    @ExperimentalComposeUiApi
    private static final boolean pickChildForBackwardSearch(FocusTargetModifierNode focusTargetModifierNode, l<? super FocusTargetModifierNode, Boolean> lVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM4446constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM4446constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        mutableVector.add((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) && backwardFocusSearch(focusTargetModifierNode2, lVar)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
        }
        return false;
    }

    @ExperimentalComposeUiApi
    private static final boolean pickChildForForwardSearch(FocusTargetModifierNode focusTargetModifierNode, l<? super FocusTargetModifierNode, Boolean> lVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM4446constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM4446constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        mutableVector.add((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] content = mutableVector.getContent();
        int i2 = 0;
        do {
            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i2];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) && forwardFocusSearch(focusTargetModifierNode2, lVar)) {
                return true;
            }
            i2++;
        } while (i2 < size);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m2542searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i2, l<? super FocusTargetModifierNode, Boolean> lVar) {
        if (!(focusTargetModifierNode.getFocusStateImpl() == FocusStateImpl.ActiveParent)) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM4446constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM4446constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        mutableVector.add((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2519getNextdhqQ8s())) {
            int i3 = ((qj.d) new f(0, mutableVector.getSize() - 1)).b;
            if (i3 >= 0) {
                boolean z = false;
                int i4 = 0;
                while (true) {
                    if (z) {
                        FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) mutableVector.getContent()[i4];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode3) && forwardFocusSearch(focusTargetModifierNode3, lVar)) {
                            return true;
                        }
                    }
                    if (m.c(mutableVector.getContent()[i4], focusTargetModifierNode2)) {
                        z = true;
                    }
                    if (i4 == i3) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            if (!FocusDirection.m2506equalsimpl0(i2, companion.m2521getPreviousdhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            int i5 = ((qj.d) new f(0, mutableVector.getSize() - 1)).b;
            if (i5 >= 0) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        FocusTargetModifierNode focusTargetModifierNode4 = (FocusTargetModifierNode) mutableVector.getContent()[i5];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode4) && backwardFocusSearch(focusTargetModifierNode4, lVar)) {
                            return true;
                        }
                    }
                    if (m.c(mutableVector.getContent()[i5], focusTargetModifierNode2)) {
                        z2 = true;
                    }
                    if (i5 == 0) {
                        break;
                    }
                    i5--;
                }
            }
        }
        if (FocusDirection.m2506equalsimpl0(i2, FocusDirection.INSTANCE.m2519getNextdhqQ8s()) || !focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetModifierNode)) {
            return false;
        }
        return ((Boolean) lVar.invoke(focusTargetModifierNode)).booleanValue();
    }
}
