package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ModifierLocalNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class b {
    public static Object a(ModifierLocalNode modifierLocalNode, ModifierLocal modifierLocal) {
        NodeChain nodes;
        m.h(modifierLocal, "<this>");
        if (!modifierLocalNode.getNode().getIsAttached()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(32);
        if (!modifierLocalNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = modifierLocalNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(modifierLocalNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM4446constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM4446constructorimpl) != 0 && (parent instanceof ModifierLocalNode)) {
                        ModifierLocalNode modifierLocalNode2 = (ModifierLocalNode) parent;
                        if (modifierLocalNode2.getProvidedValues().contains$ui_release(modifierLocal)) {
                            return modifierLocalNode2.getProvidedValues().get$ui_release(modifierLocal);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return modifierLocal.getDefaultFactory$ui_release().invoke();
    }

    public static ModifierLocalMap b(ModifierLocalNode modifierLocalNode) {
        return EmptyMap.INSTANCE;
    }

    public static void c(ModifierLocalNode modifierLocalNode, ModifierLocal modifierLocal, Object obj) {
        m.h(modifierLocal, "key");
        if (!(modifierLocalNode.getProvidedValues() != EmptyMap.INSTANCE)) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
        }
        if (modifierLocalNode.getProvidedValues().contains$ui_release(modifierLocal)) {
            modifierLocalNode.getProvidedValues().mo4309set$ui_release(modifierLocal, obj);
            return;
        }
        throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.").toString());
    }
}
