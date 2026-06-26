package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeKind;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusInvalidationManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\tJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\nR&\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "T", "", "node", "Lkotlin/j;", "scheduleInvalidation", "(Ljava/util/Set;Ljava/lang/Object;)V", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Lkotlin/Function1;", "Lkotlin/Function0;", "onRequestApplyChangesListener", "Lkj/l;", "focusTargetNodes", "Ljava/util/Set;", "focusEventNodes", "focusPropertiesNodes", "invalidateNodes", "Lkj/a;", "<init>", "(Lkj/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class FocusInvalidationManager {
    private Set<FocusEventModifierNode> focusEventNodes;
    private Set<FocusPropertiesModifierNode> focusPropertiesNodes;
    private Set<FocusTargetModifierNode> focusTargetNodes;
    private final kj.a<j> invalidateNodes;
    private final l<kj.a<j>, j> onRequestApplyChangesListener;

    public FocusInvalidationManager(l<? super kj.a<j>, j> lVar) {
        m.h(lVar, "onRequestApplyChangesListener");
        this.onRequestApplyChangesListener = lVar;
        this.focusTargetNodes = new LinkedHashSet();
        this.focusEventNodes = new LinkedHashSet();
        this.focusPropertiesNodes = new LinkedHashSet();
        this.invalidateNodes = new kj.a<j>() { // from class: androidx.compose.ui.focus.FocusInvalidationManager$invalidateNodes$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m2524invoke();
                return j.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2524invoke() {
                FocusState focusState;
                Set set = this.this$0.focusPropertiesNodes;
                FocusInvalidationManager focusInvalidationManager = this.this$0;
                Iterator it = set.iterator();
                while (true) {
                    int i2 = 16;
                    if (!it.hasNext()) {
                        this.this$0.focusPropertiesNodes.clear();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Set<FocusEventModifierNode> set2 = this.this$0.focusEventNodes;
                        FocusInvalidationManager focusInvalidationManager2 = this.this$0;
                        for (FocusEventModifierNode focusEventModifierNode : set2) {
                            if (focusEventModifierNode.getNode().getIsAttached()) {
                                int iM4446constructorimpl = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING);
                                if (!focusEventModifierNode.getNode().getIsAttached()) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                MutableVector mutableVector = new MutableVector(new Modifier.Node[i2], 0);
                                Modifier.Node child = focusEventModifierNode.getNode().getChild();
                                if (child == null) {
                                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusEventModifierNode.getNode());
                                } else {
                                    mutableVector.add(child);
                                }
                                FocusTargetModifierNode focusTargetModifierNode = null;
                                boolean z = true;
                                boolean z2 = false;
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
                                                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) child2;
                                                if (focusTargetModifierNode != null) {
                                                    z2 = true;
                                                }
                                                if (focusInvalidationManager2.focusTargetNodes.contains(focusTargetModifierNode2)) {
                                                    linkedHashSet.add(focusTargetModifierNode2);
                                                    z = false;
                                                }
                                                focusTargetModifierNode = focusTargetModifierNode2;
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    if (z2) {
                                        focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                    } else if (focusTargetModifierNode == null || (focusState = focusTargetModifierNode.getFocusState()) == null) {
                                        focusState = FocusStateImpl.Inactive;
                                    }
                                    focusEventModifierNode.onFocusEvent(focusState);
                                }
                            } else {
                                focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                            }
                            i2 = 16;
                        }
                        this.this$0.focusEventNodes.clear();
                        for (FocusTargetModifierNode focusTargetModifierNode3 : this.this$0.focusTargetNodes) {
                            if (focusTargetModifierNode3.getIsAttached()) {
                                FocusState focusState2 = focusTargetModifierNode3.getFocusState();
                                focusTargetModifierNode3.invalidateFocus$ui_release();
                                if (!m.c(focusState2, focusTargetModifierNode3.getFocusState()) || linkedHashSet.contains(focusTargetModifierNode3)) {
                                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode3);
                                }
                            }
                        }
                        this.this$0.focusTargetNodes.clear();
                        linkedHashSet.clear();
                        if (!this.this$0.focusPropertiesNodes.isEmpty()) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        if (!this.this$0.focusEventNodes.isEmpty()) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        if (!this.this$0.focusTargetNodes.isEmpty()) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        return;
                    }
                    FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) it.next();
                    int iM4446constructorimpl2 = NodeKind.m4446constructorimpl(Optimizer.OPTIMIZATION_GROUPING);
                    if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                    Modifier.Node child3 = focusPropertiesModifierNode.getNode().getChild();
                    if (child3 == null) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusPropertiesModifierNode.getNode());
                    } else {
                        mutableVector2.add(child3);
                    }
                    while (mutableVector2.isNotEmpty()) {
                        Modifier.Node child4 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                        if ((child4.getAggregateChildKindSet() & iM4446constructorimpl2) == 0) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, child4);
                        } else {
                            while (true) {
                                if (child4 == null) {
                                    break;
                                }
                                if ((child4.getKindSet() & iM4446constructorimpl2) == 0) {
                                    child4 = child4.getChild();
                                } else if (child4 instanceof FocusTargetModifierNode) {
                                    focusInvalidationManager.focusTargetNodes.add((FocusTargetModifierNode) child4);
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    public final void scheduleInvalidation(FocusTargetModifierNode focusTargetModifierNode) {
        m.h(focusTargetModifierNode, "node");
        scheduleInvalidation(this.focusTargetNodes, focusTargetModifierNode);
    }

    public final void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        m.h(focusEventModifierNode, "node");
        scheduleInvalidation(this.focusEventNodes, focusEventModifierNode);
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        m.h(focusPropertiesModifierNode, "node");
        scheduleInvalidation(this.focusPropertiesNodes, focusPropertiesModifierNode);
    }

    private final <T> void scheduleInvalidation(Set<T> set, T t) {
        if (set.contains(t)) {
            return;
        }
        set.add(t);
        if (this.focusPropertiesNodes.size() + this.focusEventNodes.size() + this.focusTargetNodes.size() == 1) {
            this.onRequestApplyChangesListener.invoke(this.invalidateNodes);
        }
    }
}
