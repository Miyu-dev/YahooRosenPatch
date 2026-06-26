package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ObserverNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverNode;", "T", "Lkotlin/Function0;", "Lkotlin/j;", "block", "observeReads", "(Landroidx/compose/ui/Modifier$Node;Lkj/a;)V", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class ObserverNodeKt {
    @ExperimentalComposeUiApi
    public static final <T extends Modifier.Node & ObserverNode> void observeReads(T t, kj.a<j> aVar) {
        m.h(t, "<this>");
        m.h(aVar, "block");
        ModifierNodeOwnerScope ownerScope = t.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new ModifierNodeOwnerScope(t);
            t.setOwnerScope$ui_release(ownerScope);
        }
        DelegatableNodeKt.requireOwner(t).getSnapshotObserver().observeReads$ui_release(ownerScope, ModifierNodeOwnerScope.INSTANCE.getOnObserveReadsChanged$ui_release(), aVar);
    }
}
