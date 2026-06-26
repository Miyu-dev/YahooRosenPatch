package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DelegatableNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a,\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001a\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a,\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001a\u001a\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u001a,\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001a,\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0006H\u0081\bø\u0001\u0000\u001a,\u0010\u0015\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001a,\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000\u001aG\u0010\u0015\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aG\u0010\u0016\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001b\u001a2\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0081\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a2\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0081\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010\u001e\u001aG\u0010\t\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010\u001b\u001a8\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0081\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"\u001a6\u0010\f\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0017\u0018\u0001*\u00020#*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0081\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010\u001e\u001a6\u0010\r\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0017\u0018\u0001*\u00020#*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0081\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010\u001e\u001aG\u0010\u000e\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b&\u0010\u001b\u001aG\u0010\u0012\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b'\u0010\u001b\u001aG\u0010\u0014\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0006H\u0081\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b(\u0010\u001b\u001a%\u0010+\u001a\u00020\u0013*\u00020\u00002\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b)\u0010*\u001a%\u00100\u001a\u00020-*\u00020\u00002\n\u0010,\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b.\u0010/\u001a\f\u00102\u001a\u000201*\u00020\u0000H\u0001\u001a\f\u00104\u001a\u000203*\u00020\u0000H\u0001\u001a\f\u00105\u001a\u00020\u0007*\u00020\u0000H\u0007\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "mask", "Landroidx/compose/ui/Modifier$Node;", "localChild", "localParent", "Lkotlin/Function1;", "Lkotlin/j;", "block", "visitAncestors", "", "ancestors", "nearestAncestor", "firstChild", "visitSubtree", "Landroidx/compose/runtime/collection/MutableVector;", "node", "addLayoutNodeChildren", "visitChildren", "", "visitSubtreeIf", "visitLocalChildren", "visitLocalParents", "T", "Landroidx/compose/ui/node/NodeKind;", "type", "visitLocalChildren-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkj/l;)V", "visitLocalParents-6rFNWt0", "localParent-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "localChild-64DMado", "visitAncestors-6rFNWt0", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "", "nearestAncestor-64DMado", "firstChild-64DMado", "visitSubtree-6rFNWt0", "visitChildren-6rFNWt0", "visitSubtreeIf-6rFNWt0", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "has", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator", "Landroidx/compose/ui/node/LayoutNode;", "requireLayoutNode", "Landroidx/compose/ui/node/Owner;", "requireOwner", "invalidateSubtree", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i2 = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i2].getNodes().getHead());
                i2--;
            } while (i2 >= 0);
        }
    }

    @ExperimentalComposeUiApi
    public static final List<Modifier.Node> ancestors(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes;
        m.h(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i2) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i2) != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return arrayList;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m4329ancestors64DMado(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "$this$ancestors");
        List<T> list = (List<T>) ancestors(delegatableNode, i2);
        if (list instanceof List) {
            return list;
        }
        return null;
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node firstChild(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (child2 != null) {
                    if ((child2.getKindSet() & i2) != 0) {
                        return child2;
                    }
                    child2 = child2.getChild();
                }
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: firstChild-64DMado, reason: not valid java name */
    public static final <T> T m4330firstChild64DMado(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "$this$firstChild");
        firstChild(delegatableNode, i2);
        m.n();
        throw null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m4331has64DMado(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "$this$has");
        return (delegatableNode.getNode().getAggregateChildKindSet() & i2) != 0;
    }

    @ExperimentalComposeUiApi
    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        m.h(delegatableNode, "<this>");
        if (delegatableNode.getNode().getIsAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node localChild(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "<this>");
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i2) == 0) {
            return null;
        }
        while (child != null) {
            if ((child.getKindSet() & i2) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: localChild-64DMado, reason: not valid java name */
    public static final <T> T m4332localChild64DMado(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "$this$localChild");
        localChild(delegatableNode, i2);
        m.n();
        throw null;
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node localParent(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "<this>");
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i2) != 0) {
                return parent;
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: localParent-64DMado, reason: not valid java name */
    public static final <T> T m4333localParent64DMado(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "$this$localParent");
        localParent(delegatableNode, i2);
        m.n();
        throw null;
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes;
        m.h(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i2) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i2) != 0) {
                        return parent;
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
    /* JADX INFO: renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final <T> T m4334nearestAncestor64DMado(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "$this$nearestAncestor");
        nearestAncestor(delegatableNode, i2);
        m.n();
        throw null;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m4335requireCoordinator64DMado(DelegatableNode delegatableNode, int i2) {
        m.h(delegatableNode, "$this$requireCoordinator");
        NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        m.e(coordinator);
        if (coordinator.getTail() != delegatableNode || !NodeKindKt.m4454getIncludeSelfInTraversalH91voCI(i2)) {
            return coordinator;
        }
        NodeCoordinator wrapped = coordinator.getWrapped();
        m.e(wrapped);
        return wrapped;
    }

    @ExperimentalComposeUiApi
    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        m.h(delegatableNode, "<this>");
        NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @ExperimentalComposeUiApi
    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        m.h(delegatableNode, "<this>");
        Owner owner = requireLayoutNode(delegatableNode).getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @ExperimentalComposeUiApi
    public static final void visitAncestors(DelegatableNode delegatableNode, int i2, l<? super Modifier.Node, j> lVar) {
        NodeChain nodes;
        m.h(delegatableNode, "<this>");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i2) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i2) != 0) {
                        lVar.invoke(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitAncestors-6rFNWt0, reason: not valid java name */
    public static final <T> void m4336visitAncestors6rFNWt0(DelegatableNode delegatableNode, int i2, l<? super T, j> lVar) {
        NodeChain nodes;
        m.h(delegatableNode, "$this$visitAncestors");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i2) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i2) != 0) {
                        m.n();
                        throw null;
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitChildren(DelegatableNode delegatableNode, int i2, l<? super Modifier.Node, j> lVar) {
        m.h(delegatableNode, "<this>");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & i2) != 0) {
                        lVar.invoke(child2);
                        break;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitChildren-6rFNWt0, reason: not valid java name */
    public static final <T> void m4337visitChildren6rFNWt0(DelegatableNode delegatableNode, int i2, l<? super T, j> lVar) {
        m.h(delegatableNode, "$this$visitChildren");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (child2 != null) {
                    if ((child2.getKindSet() & i2) != 0) {
                        m.n();
                        throw null;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitLocalChildren(DelegatableNode delegatableNode, int i2, l<? super Modifier.Node, j> lVar) {
        m.h(delegatableNode, "<this>");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i2) == 0) {
            return;
        }
        for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
            if ((child.getKindSet() & i2) != 0) {
                lVar.invoke(child);
            }
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitLocalChildren-6rFNWt0, reason: not valid java name */
    public static final <T> void m4338visitLocalChildren6rFNWt0(DelegatableNode delegatableNode, int i2, l<? super T, j> lVar) {
        m.h(delegatableNode, "$this$visitLocalChildren");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i2) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i2) != 0) {
                    m.n();
                    throw null;
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitLocalParents(DelegatableNode delegatableNode, int i2, l<? super Modifier.Node, j> lVar) {
        m.h(delegatableNode, "<this>");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i2) != 0) {
                lVar.invoke(parent);
            }
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitLocalParents-6rFNWt0, reason: not valid java name */
    public static final <T> void m4339visitLocalParents6rFNWt0(DelegatableNode delegatableNode, int i2, l<? super T, j> lVar) {
        m.h(delegatableNode, "$this$visitLocalParents");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i2) != 0) {
                m.n();
                throw null;
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitSubtree(DelegatableNode delegatableNode, int i2, l<? super Modifier.Node, j> lVar) {
        m.h(delegatableNode, "<this>");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node child = delegatableNode.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child == null) {
                child = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i2) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i2) != 0) {
                        lVar.invoke(child);
                    }
                    child = child.getChild();
                }
                child = null;
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitSubtree-6rFNWt0, reason: not valid java name */
    public static final <T> void m4340visitSubtree6rFNWt0(DelegatableNode delegatableNode, int i2, l<? super T, j> lVar) {
        m.h(delegatableNode, "$this$visitSubtree");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node child = delegatableNode.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child == null) {
                child = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i2) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i2) != 0) {
                        m.n();
                        throw null;
                    }
                    child = child.getChild();
                }
                child = null;
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i2, l<? super Modifier.Node, Boolean> lVar) {
        m.h(delegatableNode, "<this>");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i2) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i2) == 0 || ((Boolean) lVar.invoke(child2)).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: visitSubtreeIf-6rFNWt0, reason: not valid java name */
    public static final <T> void m4341visitSubtreeIf6rFNWt0(DelegatableNode delegatableNode, int i2, l<? super T, Boolean> lVar) {
        m.h(delegatableNode, "$this$visitSubtreeIf");
        m.h(lVar, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i2) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i2) != 0) {
                        m.n();
                        throw null;
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }
}
