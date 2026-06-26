package androidx.compose.ui.input.key;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyInputModifierNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B6\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0007R3\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R3\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputInputModifierNodeImpl;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "Lkotlin/Function1;", "onEvent", "Lkj/l;", "getOnEvent", "()Lkj/l;", "setOnEvent", "(Lkj/l;)V", "onPreEvent", "getOnPreEvent", "setOnPreEvent", "<init>", "(Lkj/l;Lkj/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class KeyInputInputModifierNodeImpl extends Modifier.Node implements KeyInputModifierNode {
    private l<? super KeyEvent, Boolean> onEvent;
    private l<? super KeyEvent, Boolean> onPreEvent;

    public KeyInputInputModifierNodeImpl(l<? super KeyEvent, Boolean> lVar, l<? super KeyEvent, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    public final l<KeyEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    public final l<KeyEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public boolean mo4019onKeyEventZmokQxo(android.view.KeyEvent event) {
        m.h(event, "event");
        l<? super KeyEvent, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(KeyEvent.m3995boximpl(event))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public boolean mo4020onPreKeyEventZmokQxo(android.view.KeyEvent event) {
        m.h(event, "event");
        l<? super KeyEvent, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(KeyEvent.m3995boximpl(event))).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(l<? super KeyEvent, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void setOnPreEvent(l<? super KeyEvent, Boolean> lVar) {
        this.onPreEvent = lVar;
    }
}
