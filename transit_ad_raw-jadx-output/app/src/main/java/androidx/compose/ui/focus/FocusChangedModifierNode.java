package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusChangedModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusState;", "focusState", "Lkotlin/j;", "onFocusEvent", "Lkotlin/Function1;", "onFocusChanged", "Lkj/l;", "getOnFocusChanged", "()Lkj/l;", "setOnFocusChanged", "(Lkj/l;)V", "Landroidx/compose/ui/focus/FocusState;", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
final class FocusChangedModifierNode extends Modifier.Node implements FocusEventModifierNode {
    private FocusState focusState;
    private l<? super FocusState, j> onFocusChanged;

    public FocusChangedModifierNode(l<? super FocusState, j> lVar) {
        m.h(lVar, "onFocusChanged");
        this.onFocusChanged = lVar;
    }

    public final l<FocusState, j> getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        m.h(focusState, "focusState");
        if (m.c(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    public final void setOnFocusChanged(l<? super FocusState, j> lVar) {
        m.h(lVar, "<set-?>");
        this.onFocusChanged = lVar;
    }
}
