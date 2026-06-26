package androidx.compose.ui.input.key;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyInputModifier.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002ø\u0001\u0000\u001a!\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"onKeyEvent", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "onPreviewKeyEvent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KeyInputModifierKt {
    public static final Modifier onKeyEvent(Modifier modifier, l<? super KeyEvent, Boolean> lVar) {
        m.h(modifier, "<this>");
        m.h(lVar, "onKeyEvent");
        return modifier.then(new OnKeyEventElement(lVar));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, l<? super KeyEvent, Boolean> lVar) {
        m.h(modifier, "<this>");
        m.h(lVar, "onPreviewKeyEvent");
        return modifier.then(new OnPreviewKeyEvent(lVar));
    }
}
