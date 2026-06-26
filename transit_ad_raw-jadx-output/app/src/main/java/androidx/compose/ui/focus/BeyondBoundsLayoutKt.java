package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "block", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;ILkj/l;)Ljava/lang/Object;", "searchBeyondBounds", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class BeyondBoundsLayoutKt {
    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m2502searchBeyondBoundsOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i2, l<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> lVar) {
        int iM4220getBeforehoxUOeE;
        m.h(focusTargetModifierNode, "$this$searchBeyondBounds");
        m.h(lVar, "block");
        BeyondBoundsLayout beyondBoundsLayoutParent$ui_release = focusTargetModifierNode.getBeyondBoundsLayoutParent$ui_release();
        if (beyondBoundsLayoutParent$ui_release == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2506equalsimpl0(i2, companion.m2523getUpdhqQ8s())) {
            iM4220getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4218getAbovehoxUOeE();
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2514getDowndhqQ8s())) {
            iM4220getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4221getBelowhoxUOeE();
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2518getLeftdhqQ8s())) {
            iM4220getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4222getLefthoxUOeE();
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2522getRightdhqQ8s())) {
            iM4220getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4223getRighthoxUOeE();
        } else if (FocusDirection.m2506equalsimpl0(i2, companion.m2519getNextdhqQ8s())) {
            iM4220getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4219getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m2506equalsimpl0(i2, companion.m2521getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            iM4220getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.INSTANCE.m4220getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent$ui_release.mo675layouto7g1Pn8(iM4220getBeforehoxUOeE, lVar);
    }
}
