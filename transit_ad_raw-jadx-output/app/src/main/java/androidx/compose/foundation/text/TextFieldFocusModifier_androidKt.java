package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.text.input.TextInputSession;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldFocusModifier.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"interceptDPadAndMoveFocus", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, final TextFieldState textFieldState, final FocusManager focusManager) {
        m.h(modifier, "<this>");
        m.h(textFieldState, "state");
        m.h(focusManager, "focusManager");
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m880invokeZmokQxo(((KeyEvent) obj).m4001unboximpl());
            }

            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m880invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean zMo2525moveFocus3ESFkO8;
                m.h(keyEvent, "keyEvent");
                InputDevice device = keyEvent.getDevice();
                if (device == null) {
                    return Boolean.FALSE;
                }
                if (device.getKeyboardType() == 2 && device.isVirtual()) {
                    return Boolean.FALSE;
                }
                if (!KeyEventType.m4005equalsimpl0(KeyEvent_androidKt.m4013getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m4009getKeyDownCS__XNY())) {
                    return Boolean.FALSE;
                }
                switch (Key_androidKt.m4021getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m4012getKeyZmokQxo(keyEvent))) {
                    case 19:
                        zMo2525moveFocus3ESFkO8 = focusManager.mo2525moveFocus3ESFkO8(FocusDirection.INSTANCE.m2523getUpdhqQ8s());
                        break;
                    case 20:
                        zMo2525moveFocus3ESFkO8 = focusManager.mo2525moveFocus3ESFkO8(FocusDirection.INSTANCE.m2514getDowndhqQ8s());
                        break;
                    case 21:
                        zMo2525moveFocus3ESFkO8 = focusManager.mo2525moveFocus3ESFkO8(FocusDirection.INSTANCE.m2518getLeftdhqQ8s());
                        break;
                    case R.styleable.AppCompatTheme_actionModeCutDrawable /* 22 */:
                        zMo2525moveFocus3ESFkO8 = focusManager.mo2525moveFocus3ESFkO8(FocusDirection.INSTANCE.m2522getRightdhqQ8s());
                        break;
                    case 23:
                        TextInputSession inputSession = textFieldState.getInputSession();
                        if (inputSession != null) {
                            inputSession.showSoftwareKeyboard();
                        }
                        zMo2525moveFocus3ESFkO8 = true;
                        break;
                    default:
                        zMo2525moveFocus3ESFkO8 = false;
                        break;
                }
                return Boolean.valueOf(zMo2525moveFocus3ESFkO8);
            }
        });
    }
}
