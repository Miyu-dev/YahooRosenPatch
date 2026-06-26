package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "Lkotlin/j;", "scope", "focusProperties", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class FocusPropertiesKt {
    public static final Modifier focusProperties(Modifier modifier, l<? super FocusProperties, j> lVar) {
        m.h(modifier, "<this>");
        m.h(lVar, "scope");
        return modifier.then(new FocusPropertiesElement(lVar));
    }
}
