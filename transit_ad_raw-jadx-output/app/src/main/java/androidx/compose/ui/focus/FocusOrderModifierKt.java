package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusOrderModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u001a(\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "Lkotlin/j;", "focusOrderReceiver", "focusOrder", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class FocusOrderModifierKt {
    public static final Modifier focusOrder(Modifier modifier, l<? super FocusOrder, j> lVar) {
        m.h(modifier, "<this>");
        m.h(lVar, "focusOrderReceiver");
        return FocusPropertiesKt.focusProperties(modifier, new FocusOrderToProperties(lVar));
    }

    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester) {
        m.h(modifier, "<this>");
        m.h(focusRequester, "focusRequester");
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    public static final Modifier focusOrder(Modifier modifier, FocusRequester focusRequester, l<? super FocusOrder, j> lVar) {
        m.h(modifier, "<this>");
        m.h(focusRequester, "focusRequester");
        m.h(lVar, "focusOrderReceiver");
        return FocusPropertiesKt.focusProperties(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), new FocusOrderToProperties(lVar));
    }
}
