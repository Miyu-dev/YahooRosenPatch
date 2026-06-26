package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DelegatingNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u001d\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005H\u0082\bJ\u0019\u0010\f\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/Modifier$Node;", "node", "Lkotlin/j;", "addDelegate", "Lkotlin/Function1;", "block", "forEachDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "updateCoordinator$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "updateCoordinator", "T", "Lkotlin/Function0;", "fn", "delegated", "(Lkj/a;)Landroidx/compose/ui/Modifier$Node;", "attach$ui_release", "()V", "attach", "detach$ui_release", "detach", "reset$ui_release", "reset", "delegate", "Landroidx/compose/ui/Modifier$Node;", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;
    private Modifier.Node delegate;

    private final void addDelegate(Modifier.Node node) {
        Modifier.Node node2 = this.delegate;
        if (node2 != null) {
            node.setParent$ui_release(node2);
        }
        this.delegate = node;
    }

    private final void forEachDelegate(l<? super Modifier.Node, j> lVar) {
        for (Modifier.Node parent = this.delegate; parent != null; parent = parent.getParent()) {
            lVar.invoke(parent);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void attach$ui_release() {
        super.attach$ui_release();
        for (Modifier.Node parent = this.delegate; parent != null; parent = parent.getParent()) {
            parent.updateCoordinator$ui_release(getCoordinator());
            parent.attach$ui_release();
        }
    }

    public final <T extends Modifier.Node> T delegated(kj.a<? extends T> fn) {
        m.h(fn, "fn");
        Modifier.Node node = getNode();
        T t = (T) fn.invoke();
        t.setAsDelegateTo$ui_release(node);
        if (getIsAttached()) {
            updateCoordinator$ui_release(node.getCoordinator());
            t.attach$ui_release();
        }
        addDelegate(t);
        return t;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void detach$ui_release() {
        for (Modifier.Node parent = this.delegate; parent != null; parent = parent.getParent()) {
            parent.detach$ui_release();
        }
        super.detach$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui_release() {
        super.reset$ui_release();
        for (Modifier.Node parent = this.delegate; parent != null; parent = parent.getParent()) {
            parent.reset$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui_release(NodeCoordinator coordinator) {
        super.updateCoordinator$ui_release(coordinator);
        for (Modifier.Node parent = this.delegate; parent != null; parent = parent.getParent()) {
            parent.updateCoordinator$ui_release(coordinator);
        }
    }
}
