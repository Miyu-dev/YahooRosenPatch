package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/FocusOrderModifierToProperties;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "Lkotlin/j;", "focusProperties", "invoke", "Landroidx/compose/ui/focus/FocusOrderModifier;", "modifier", "Landroidx/compose/ui/focus/FocusOrderModifier;", "getModifier", "()Landroidx/compose/ui/focus/FocusOrderModifier;", "<init>", "(Landroidx/compose/ui/focus/FocusOrderModifier;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final class FocusOrderModifierToProperties implements l<FocusProperties, j> {
    private final FocusOrderModifier modifier;

    public FocusOrderModifierToProperties(FocusOrderModifier focusOrderModifier) {
        m.h(focusOrderModifier, "modifier");
        this.modifier = focusOrderModifier;
    }

    public final FocusOrderModifier getModifier() {
        return this.modifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusProperties) obj);
        return j.a;
    }

    public void invoke(FocusProperties focusProperties) {
        m.h(focusProperties, "focusProperties");
        this.modifier.populateFocusOrder(new FocusOrder(focusProperties));
    }
}
