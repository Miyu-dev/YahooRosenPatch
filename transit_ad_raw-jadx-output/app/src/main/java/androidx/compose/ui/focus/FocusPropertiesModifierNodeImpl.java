package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesModifierNodeImpl;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "Lkotlin/j;", "modifyFocusProperties", "Lkotlin/Function1;", "focusPropertiesScope", "Lkj/l;", "getFocusPropertiesScope", "()Lkj/l;", "setFocusPropertiesScope", "(Lkj/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
final class FocusPropertiesModifierNodeImpl extends Modifier.Node implements FocusPropertiesModifierNode {
    private l<? super FocusProperties, j> focusPropertiesScope;

    public FocusPropertiesModifierNodeImpl(l<? super FocusProperties, j> lVar) {
        m.h(lVar, "focusPropertiesScope");
        this.focusPropertiesScope = lVar;
    }

    public final l<FocusProperties, j> getFocusPropertiesScope() {
        return this.focusPropertiesScope;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void modifyFocusProperties(FocusProperties focusProperties) {
        m.h(focusProperties, "focusProperties");
        this.focusPropertiesScope.invoke(focusProperties);
    }

    public final void setFocusPropertiesScope(l<? super FocusProperties, j> lVar) {
        m.h(lVar, "<set-?>");
        this.focusPropertiesScope = lVar;
    }
}
