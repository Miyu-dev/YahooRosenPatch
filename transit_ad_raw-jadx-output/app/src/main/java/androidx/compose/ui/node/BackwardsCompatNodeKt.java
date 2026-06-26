package androidx.compose.ui.node;

import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\" \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\" \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"androidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1", "DetachedModifierLocalReadScope", "Landroidx/compose/ui/node/BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/BackwardsCompatNode;", "Lkotlin/j;", "onDrawCacheReadsChanged", "Lkj/l;", "updateModifierLocalConsumer", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class BackwardsCompatNodeKt {
    private static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 DetachedModifierLocalReadScope = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
            m.h(modifierLocal, "<this>");
            return (T) modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };
    private static final l<BackwardsCompatNode, j> onDrawCacheReadsChanged = new l<BackwardsCompatNode, j>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackwardsCompatNode) obj);
            return j.a;
        }

        public final void invoke(BackwardsCompatNode backwardsCompatNode) {
            m.h(backwardsCompatNode, "it");
            backwardsCompatNode.onDrawCacheReadsChanged$ui_release();
        }
    };
    private static final l<BackwardsCompatNode, j> updateModifierLocalConsumer = new l<BackwardsCompatNode, j>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackwardsCompatNode) obj);
            return j.a;
        }

        public final void invoke(BackwardsCompatNode backwardsCompatNode) {
            m.h(backwardsCompatNode, "it");
            backwardsCompatNode.updateModifierLocalConsumer();
        }
    };
}
