package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyEventHelpers.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\b\u0010\u0006\u001a\u00020\u0005H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "cancelsTextSelection-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "cancelsTextSelection", "Lkotlin/j;", "showCharacterPalette", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class KeyEventHelpers_androidKt {
    /* JADX INFO: renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m818cancelsTextSelectionZmokQxo(KeyEvent keyEvent) {
        m.h(keyEvent, "$this$cancelsTextSelection");
        return keyEvent.getKeyCode() == 4 && KeyEventType.m4005equalsimpl0(KeyEvent_androidKt.m4013getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m4010getKeyUpCS__XNY());
    }

    public static final void showCharacterPalette() {
    }
}
