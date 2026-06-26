package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.layout.IntermediateLayoutModifier;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.LookaheadOnPlacedModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a&\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0080\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002\u001a\f\u0010\u0012\u001a\u00020\u000b*\u00020\u0011H\u0003\u001a\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0011H\u0003\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"%\u0010\u001d\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00018@X\u0080\u0004ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"", "Landroidx/compose/ui/node/NodeKind;", "other", "or-64DMado", "(II)I", "or", "Landroidx/compose/ui/Modifier$Element;", "element", "calculateNodeKindSetFrom", "Landroidx/compose/ui/Modifier$Node;", "node", "Lkotlin/j;", "autoInvalidateRemovedNode", "autoInvalidateInsertedNode", "autoInvalidateUpdatedNode", TypedValues.CycleType.S_WAVE_PHASE, "autoInvalidateNode", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "scheduleInvalidationOfAssociatedFocusTargets", "", "specifiesCanFocusProperty", "Updated", "I", "Inserted", "Removed", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "getIncludeSelfInTraversal-H91voCI$annotations", "(I)V", "includeSelfInTraversal", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        m.h(node, "node");
        autoInvalidateNode(node, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNode(Modifier.Node node, int i2) {
        if (!node.getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (((NodeKind.m4446constructorimpl(2) & node.getKindSet()) != 0) && (node instanceof LayoutModifierNode)) {
            LayoutModifierNodeKt.invalidateMeasurements((LayoutModifierNode) node);
            if (i2 == 2) {
                DelegatableNodeKt.m4335requireCoordinator64DMado(node, NodeKind.m4446constructorimpl(2)).onRelease();
            }
        }
        if (((NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_CACHE_MEASURES) & node.getKindSet()) != 0) && (node instanceof GlobalPositionAwareModifierNode)) {
            DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
        }
        if (((NodeKind.m4446constructorimpl(4) & node.getKindSet()) != 0) && (node instanceof DrawModifierNode)) {
            DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
        }
        if (((NodeKind.m4446constructorimpl(8) & node.getKindSet()) != 0) && (node instanceof SemanticsModifierNode)) {
            SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
        }
        if (((NodeKind.m4446constructorimpl(64) & node.getKindSet()) != 0) && (node instanceof ParentDataModifierNode)) {
            ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
        }
        if (((NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING) & node.getKindSet()) != 0) && (node instanceof FocusTargetModifierNode)) {
            if (i2 == 2) {
                node.onReset();
            } else {
                DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) node);
            }
        }
        if (((NodeKind.m4446constructorimpl(2048) & node.getKindSet()) != 0) && (node instanceof FocusPropertiesModifierNode)) {
            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
            if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                if (i2 == 2) {
                    scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                } else {
                    DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation(focusPropertiesModifierNode);
                }
            }
        }
        if (((NodeKind.m4446constructorimpl(4096) & node.getKindSet()) != 0) && (node instanceof FocusEventModifierNode) && i2 != 2) {
            DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusEventModifierNode) node);
        }
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        m.h(node, "node");
        autoInvalidateNode(node, 2);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        m.h(node, "node");
        autoInvalidateNode(node, 0);
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        m.h(element, "element");
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(2);
        }
        if (element instanceof IntermediateLayoutModifier) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING);
        }
        if (element instanceof DrawModifier) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_CACHE_MEASURES);
        }
        if (element instanceof ParentDataModifier) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier) || (element instanceof LookaheadOnPlacedModifier)) ? iM4446constructorimpl | NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GRAPH_WRAP) : iM4446constructorimpl;
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m4454getIncludeSelfInTraversalH91voCI(int i2) {
        return (i2 & NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GRAPH_WRAP)) != 0;
    }

    /* JADX INFO: renamed from: or-64DMado, reason: not valid java name */
    public static final int m4456or64DMado(int i2, int i3) {
        return i2 | i3;
    }

    @ExperimentalComposeUiApi
    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING);
        if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM4446constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM4446constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        DelegatableNodeKt.requireOwner(focusPropertiesModifierNode).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.modifyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        m.h(node, "node");
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(16);
        }
        if (node instanceof ModifierLocalNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GRAPH_WRAP);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_CACHE_MEASURES);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING);
        }
        if (node instanceof FocusTargetModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            iM4446constructorimpl |= NodeKind.m4446constructorimpl(8192);
        }
        return node instanceof RotaryInputModifierNode ? iM4446constructorimpl | NodeKind.m4446constructorimpl(16384) : iM4446constructorimpl;
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI$annotations, reason: not valid java name */
    public static /* synthetic */ void m4455getIncludeSelfInTraversalH91voCI$annotations(int i2) {
    }
}
