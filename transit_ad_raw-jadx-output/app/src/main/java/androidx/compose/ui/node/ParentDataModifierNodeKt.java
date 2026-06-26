package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ParentDataModifierNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/ParentDataModifierNode;", "Lkotlin/j;", "invalidateParentData", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class ParentDataModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final void invalidateParentData(ParentDataModifierNode parentDataModifierNode) {
        m.h(parentDataModifierNode, "<this>");
        DelegatableNodeKt.requireLayoutNode(parentDataModifierNode).invalidateParentData$ui_release();
    }
}
