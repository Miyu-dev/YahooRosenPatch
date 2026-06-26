package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutNodeDrawScope.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"nextDrawNode", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DrawModifierNode nextDrawNode(DelegatableNode delegatableNode) {
        int iM4446constructorimpl = NodeKind.m4446constructorimpl(4);
        int iM4446constructorimpl2 = NodeKind.m4446constructorimpl(2);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            return null;
        }
        int aggregateChildKindSet = child.getAggregateChildKindSet() & iM4446constructorimpl;
        if (aggregateChildKindSet == 0) {
            return null;
        }
        for (Modifier.Node child2 = child; child2 != 0 && (child2.getKindSet() & iM4446constructorimpl2) == 0; child2 = child2.getChild()) {
            if ((child2.getKindSet() & iM4446constructorimpl) != 0) {
                return (DrawModifierNode) child2;
            }
        }
        return null;
    }
}
