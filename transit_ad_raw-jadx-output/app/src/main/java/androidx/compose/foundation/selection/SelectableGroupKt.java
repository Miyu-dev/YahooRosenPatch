package androidx.compose.foundation.selection;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SelectableGroup.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"selectableGroup", "Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SelectableGroupKt {
    public static final Modifier selectableGroup(Modifier modifier) {
        m.h(modifier, "<this>");
        return SemanticsModifierKt.semantics$default(modifier, false, new l<SemanticsPropertyReceiver, j>() { // from class: androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return j.a;
            }

            public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                m.h(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.selectableGroup(semanticsPropertyReceiver);
            }
        }, 1, null);
    }
}
