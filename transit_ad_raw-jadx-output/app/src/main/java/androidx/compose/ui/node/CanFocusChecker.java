package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusRequester;
import kj.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R$\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/CanFocusChecker;", "Landroidx/compose/ui/focus/FocusProperties;", "", "isCanFocusSet", "Lkotlin/j;", "reset", "canFocusValue", "Ljava/lang/Boolean;", "value", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocus", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
final class CanFocusChecker implements FocusProperties {
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getDown() {
        return FocusProperties.CC.a(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getEnd() {
        return FocusProperties.CC.b(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ l getEnter() {
        return FocusProperties.CC.c(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ l getExit() {
        return FocusProperties.CC.d(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getLeft() {
        return FocusProperties.CC.e(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getNext() {
        return FocusProperties.CC.f(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getPrevious() {
        return FocusProperties.CC.g(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getRight() {
        return FocusProperties.CC.h(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getStart() {
        return FocusProperties.CC.i(this);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ FocusRequester getUp() {
        return FocusProperties.CC.j(this);
    }

    public final boolean isCanFocusSet() {
        return canFocusValue != null;
    }

    public final void reset() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        canFocusValue = Boolean.valueOf(z);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setDown(FocusRequester focusRequester) {
        FocusProperties.CC.k(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setEnd(FocusRequester focusRequester) {
        FocusProperties.CC.l(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setEnter(l lVar) {
        FocusProperties.CC.m(this, lVar);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setExit(l lVar) {
        FocusProperties.CC.n(this, lVar);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setLeft(FocusRequester focusRequester) {
        FocusProperties.CC.o(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setNext(FocusRequester focusRequester) {
        FocusProperties.CC.p(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setPrevious(FocusRequester focusRequester) {
        FocusProperties.CC.q(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setRight(FocusRequester focusRequester) {
        FocusProperties.CC.r(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setStart(FocusRequester focusRequester) {
        FocusProperties.CC.s(this, focusRequester);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final /* synthetic */ void setUp(FocusRequester focusRequester) {
        FocusProperties.CC.t(this, focusRequester);
    }
}
