package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SemanticsModifierNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000\"\u001e\u0010\f\u001a\u00020\u0007*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/SemanticsModifierNode;", "Lkotlin/j;", "invalidateSemantics", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "collapsedSemanticsConfiguration", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "", "getUseMinimumTouchTarget", "(Landroidx/compose/ui/node/SemanticsModifierNode;)Z", "getUseMinimumTouchTarget$annotations", "(Landroidx/compose/ui/node/SemanticsModifierNode;)V", "useMinimumTouchTarget", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class SemanticsModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final SemanticsConfiguration collapsedSemanticsConfiguration(SemanticsModifierNode semanticsModifierNode) {
        m.h(semanticsModifierNode, "<this>");
        Object objLocalChild = DelegatableNodeKt.localChild(semanticsModifierNode, NodeKind.m4446constructorimpl(8));
        if (!(objLocalChild instanceof SemanticsModifierNode)) {
            objLocalChild = null;
        }
        SemanticsModifierNode semanticsModifierNode2 = (SemanticsModifierNode) objLocalChild;
        if (semanticsModifierNode2 == null || semanticsModifierNode.getSemanticsConfiguration().getIsClearingSemantics()) {
            return semanticsModifierNode.getSemanticsConfiguration();
        }
        SemanticsConfiguration semanticsConfigurationCopy = semanticsModifierNode.getSemanticsConfiguration().copy();
        semanticsConfigurationCopy.collapsePeer$ui_release(collapsedSemanticsConfiguration(semanticsModifierNode2));
        return semanticsConfigurationCopy;
    }

    public static final boolean getUseMinimumTouchTarget(SemanticsModifierNode semanticsModifierNode) {
        m.h(semanticsModifierNode, "<this>");
        return SemanticsConfigurationKt.getOrNull(semanticsModifierNode.getSemanticsConfiguration(), SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    @ExperimentalComposeUiApi
    public static final void invalidateSemantics(SemanticsModifierNode semanticsModifierNode) {
        m.h(semanticsModifierNode, "<this>");
        DelegatableNodeKt.requireOwner(semanticsModifierNode).onSemanticsChange();
    }

    public static final Rect touchBoundsInRoot(SemanticsModifierNode semanticsModifierNode) {
        m.h(semanticsModifierNode, "<this>");
        return !semanticsModifierNode.getNode().getIsAttached() ? Rect.INSTANCE.getZero() : !getUseMinimumTouchTarget(semanticsModifierNode) ? LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m4335requireCoordinator64DMado(semanticsModifierNode, NodeKind.m4446constructorimpl(8))) : DelegatableNodeKt.m4335requireCoordinator64DMado(semanticsModifierNode, NodeKind.m4446constructorimpl(8)).touchBoundsInRoot();
    }

    public static /* synthetic */ void getUseMinimumTouchTarget$annotations(SemanticsModifierNode semanticsModifierNode) {
    }
}
