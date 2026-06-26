package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u000b\u001a\u0010\u0010$\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0002\u0010%\u001a\u0017\u0010&\u001a\u00020'*\u00020\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010*\u001a\u00020'*\u00020\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010)\u001a\u001f\u0010,\u001a\u00020\u0001*\u00020\u00022\u0006\u0010-\u001a\u00020'ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"\u0018\u0010\n\u001a\u00020\u0001*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004\"\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004\"\u0018\u0010\u000e\u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\"\u0018\u0010\u0010\u001a\u00020\u0001*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0004\"\u0018\u0010\u0012\u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0004\"\u0018\u0010\u0014\u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0004\"\u0018\u0010\u0016\u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0004\"\u0018\u0010\u0018\u001a\u00020\u0001*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0004\"\u0018\u0010\u001a\u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0004\"\u0018\u0010\u001c\u001a\u00020\u0001*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0004\"\u0018\u0010\u001e\u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0004\"\u0018\u0010 \u001a\u00020\u0001*\u00020\u00068Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\u0004\"\u0018\u0010\"\u001a\u00020\u0001*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b#\u0010\u0004*\f\b\u0000\u00100\"\u00020'2\u00020'*\f\b\u0000\u00101\"\u00020'2\u00020'\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"areAnyPressed", "", "Landroidx/compose/ui/input/pointer/PointerButtons;", "getAreAnyPressed-aHzCx-E", "(I)Z", "isAltGraphPressed", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "isAltGraphPressed-5xRPYO0", "isAltPressed", "isAltPressed-5xRPYO0", "isBackPressed", "isBackPressed-aHzCx-E", "isCapsLockOn", "isCapsLockOn-5xRPYO0", "isCtrlPressed", "isCtrlPressed-5xRPYO0", "isForwardPressed", "isForwardPressed-aHzCx-E", "isFunctionPressed", "isFunctionPressed-5xRPYO0", "isMetaPressed", "isMetaPressed-5xRPYO0", "isNumLockOn", "isNumLockOn-5xRPYO0", "isPrimaryPressed", "isPrimaryPressed-aHzCx-E", "isScrollLockOn", "isScrollLockOn-5xRPYO0", "isSecondaryPressed", "isSecondaryPressed-aHzCx-E", "isShiftPressed", "isShiftPressed-5xRPYO0", "isSymPressed", "isSymPressed-5xRPYO0", "isTertiaryPressed", "isTertiaryPressed-aHzCx-E", "EmptyPointerKeyboardModifiers", "()I", "indexOfFirstPressed", "", "indexOfFirstPressed-aHzCx-E", "(I)I", "indexOfLastPressed", "indexOfLastPressed-aHzCx-E", "isPressed", "buttonIndex", "isPressed-bNIWhpI", "(II)Z", "NativePointerButtons", "NativePointerKeyboardModifiers", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m4178constructorimpl(0);
    }

    /* JADX INFO: renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m4092getAreAnyPressedaHzCxE(int i2) {
        return i2 != 0;
    }

    /* JADX INFO: renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m4093indexOfFirstPressedaHzCxE(int i2) {
        if (i2 == 0) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = (i2 & (-97)) | ((i2 & 96) >>> 5); (i4 & 1) == 0; i4 >>>= 1) {
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m4094indexOfLastPressedaHzCxE(int i2) {
        int i3 = -1;
        for (int i4 = (i2 & (-97)) | ((i2 & 96) >>> 5); i4 != 0; i4 >>>= 1) {
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m4095isAltGraphPressed5xRPYO0(int i2) {
        return false;
    }

    /* JADX INFO: renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m4096isAltPressed5xRPYO0(int i2) {
        return (i2 & 2) != 0;
    }

    /* JADX INFO: renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m4097isBackPressedaHzCxE(int i2) {
        return (i2 & 8) != 0;
    }

    /* JADX INFO: renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m4098isCapsLockOn5xRPYO0(int i2) {
        return (i2 & 1048576) != 0;
    }

    /* JADX INFO: renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m4099isCtrlPressed5xRPYO0(int i2) {
        return (i2 & 4096) != 0;
    }

    /* JADX INFO: renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m4100isForwardPressedaHzCxE(int i2) {
        return (i2 & 16) != 0;
    }

    /* JADX INFO: renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m4101isFunctionPressed5xRPYO0(int i2) {
        return (i2 & 8) != 0;
    }

    /* JADX INFO: renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m4102isMetaPressed5xRPYO0(int i2) {
        return (i2 & 65536) != 0;
    }

    /* JADX INFO: renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m4103isNumLockOn5xRPYO0(int i2) {
        return (i2 & 2097152) != 0;
    }

    /* JADX INFO: renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m4104isPressedbNIWhpI(int i2, int i3) {
        if (i3 == 0) {
            return m4105isPrimaryPressedaHzCxE(i2);
        }
        if (i3 == 1) {
            return m4107isSecondaryPressedaHzCxE(i2);
        }
        if (i3 == 2 || i3 == 3 || i3 == 4) {
            if ((i2 & (1 << i3)) != 0) {
                return true;
            }
        } else if ((i2 & (1 << (i3 + 2))) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m4105isPrimaryPressedaHzCxE(int i2) {
        return (i2 & 33) != 0;
    }

    /* JADX INFO: renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m4106isScrollLockOn5xRPYO0(int i2) {
        return (i2 & 4194304) != 0;
    }

    /* JADX INFO: renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m4107isSecondaryPressedaHzCxE(int i2) {
        return (i2 & 66) != 0;
    }

    /* JADX INFO: renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m4108isShiftPressed5xRPYO0(int i2) {
        return (i2 & 1) != 0;
    }

    /* JADX INFO: renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m4109isSymPressed5xRPYO0(int i2) {
        return (i2 & 4) != 0;
    }

    /* JADX INFO: renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m4110isTertiaryPressedaHzCxE(int i2) {
        return (i2 & 4) != 0;
    }
}
