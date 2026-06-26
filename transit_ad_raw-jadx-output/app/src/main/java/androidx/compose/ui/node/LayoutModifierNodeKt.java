package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LayoutModifierNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0001¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNode;", "Lkotlin/j;", "invalidateLayer", "invalidateLayout", "invalidateMeasurements", "requestRemeasure", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class LayoutModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final void invalidateLayer(LayoutModifierNode layoutModifierNode) {
        m.h(layoutModifierNode, "<this>");
        DelegatableNodeKt.m4335requireCoordinator64DMado(layoutModifierNode, NodeKind.m4446constructorimpl(2)).invalidateLayer();
    }

    @ExperimentalComposeUiApi
    public static final void invalidateLayout(LayoutModifierNode layoutModifierNode) {
        m.h(layoutModifierNode, "<this>");
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    @ExperimentalComposeUiApi
    public static final void invalidateMeasurements(LayoutModifierNode layoutModifierNode) {
        m.h(layoutModifierNode, "<this>");
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }

    @ExperimentalComposeUiApi
    public static final void requestRemeasure(LayoutModifierNode layoutModifierNode) {
        m.h(layoutModifierNode, "<this>");
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }
}
