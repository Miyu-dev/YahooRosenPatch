package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextInputSession;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyboardActionRunner.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Lkotlin/j;", "runAction-KlQnJC8", "(I)V", "runAction", "defaultKeyboardAction-KlQnJC8", "defaultKeyboardAction", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "Landroidx/compose/ui/text/input/TextInputSession;", "inputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class KeyboardActionRunner implements KeyboardActionScope {
    public FocusManager focusManager;
    private TextInputSession inputSession;
    public KeyboardActions keyboardActions;

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* JADX INFO: renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public void mo820defaultKeyboardActionKlQnJC8(int imeAction) {
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.m4946equalsimpl0(imeAction, companion.m4961getNexteUduSuo())) {
            getFocusManager().mo2525moveFocus3ESFkO8(FocusDirection.INSTANCE.m2519getNextdhqQ8s());
            return;
        }
        if (ImeAction.m4946equalsimpl0(imeAction, companion.m4963getPreviouseUduSuo())) {
            getFocusManager().mo2525moveFocus3ESFkO8(FocusDirection.INSTANCE.m2521getPreviousdhqQ8s());
            return;
        }
        if (!ImeAction.m4946equalsimpl0(imeAction, companion.m4959getDoneeUduSuo())) {
            if (ImeAction.m4946equalsimpl0(imeAction, companion.m4960getGoeUduSuo()) ? true : ImeAction.m4946equalsimpl0(imeAction, companion.m4964getSearcheUduSuo()) ? true : ImeAction.m4946equalsimpl0(imeAction, companion.m4965getSendeUduSuo()) ? true : ImeAction.m4946equalsimpl0(imeAction, companion.m4958getDefaulteUduSuo())) {
                return;
            }
            ImeAction.m4946equalsimpl0(imeAction, companion.m4962getNoneeUduSuo());
        } else {
            TextInputSession textInputSession = this.inputSession;
            if (textInputSession != null) {
                textInputSession.hideSoftwareKeyboard();
            }
        }
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        m.o("focusManager");
        throw null;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        m.o("keyboardActions");
        throw null;
    }

    /* JADX INFO: renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m821runActionKlQnJC8(int imeAction) {
        l<KeyboardActionScope, j> onSend;
        ImeAction.Companion companion = ImeAction.INSTANCE;
        j jVar = null;
        if (ImeAction.m4946equalsimpl0(imeAction, companion.m4959getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (ImeAction.m4946equalsimpl0(imeAction, companion.m4960getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (ImeAction.m4946equalsimpl0(imeAction, companion.m4961getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (ImeAction.m4946equalsimpl0(imeAction, companion.m4963getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m4946equalsimpl0(imeAction, companion.m4964getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m4946equalsimpl0(imeAction, companion.m4965getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!(ImeAction.m4946equalsimpl0(imeAction, companion.m4958getDefaulteUduSuo()) ? true : ImeAction.m4946equalsimpl0(imeAction, companion.m4962getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            jVar = j.a;
        }
        if (jVar == null) {
            mo820defaultKeyboardActionKlQnJC8(imeAction);
        }
    }

    public final void setFocusManager(FocusManager focusManager) {
        m.h(focusManager, "<set-?>");
        this.focusManager = focusManager;
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        m.h(keyboardActions, "<set-?>");
        this.keyboardActions = keyboardActions;
    }
}
