package androidx.compose.foundation.text;

import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyboardActions.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Lkotlin/j;", "onAny", "Landroidx/compose/foundation/text/KeyboardActions;", "KeyboardActions", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class KeyboardActionsKt {
    public static final KeyboardActions KeyboardActions(l<? super KeyboardActionScope, j> lVar) {
        m.h(lVar, "onAny");
        return new KeyboardActions(lVar, lVar, lVar, lVar, lVar, lVar);
    }
}
