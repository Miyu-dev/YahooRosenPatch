package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusEventModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusEventModifierNodeImpl;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusState;", "focusState", "Lkotlin/j;", "onFocusEvent", "Lkotlin/Function1;", "Lkj/l;", "getOnFocusEvent", "()Lkj/l;", "setOnFocusEvent", "(Lkj/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
final class FocusEventModifierNodeImpl extends Modifier.Node implements FocusEventModifierNode {
    private l<? super FocusState, j> onFocusEvent;

    public FocusEventModifierNodeImpl(l<? super FocusState, j> lVar) {
        m.h(lVar, "onFocusEvent");
        this.onFocusEvent = lVar;
    }

    public final l<FocusState, j> getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        m.h(focusState, "focusState");
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(l<? super FocusState, j> lVar) {
        m.h(lVar, "<set-?>");
        this.onFocusEvent = lVar;
    }
}
