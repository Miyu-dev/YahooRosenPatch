package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Clickable.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002\"\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u000b8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001b\u0010\u0010\u001a\u00020\u0001*\u00020\u000b8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u001b\u0010\u0012\u001a\u00020\u0001*\u00020\u000b8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlin/Function0;", "", "isComposeRootInScrollableContainer", "(Landroidx/compose/runtime/Composer;I)Lkj/a;", "Landroid/view/View;", "isInScrollableViewGroup", "", "TapIndicationDelay", "J", "getTapIndicationDelay", "()J", "Landroidx/compose/ui/input/key/KeyEvent;", "isPress-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isPress", "isClick-ZmokQxo", "isClick", "isEnter-ZmokQxo", "isEnter", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* JADX INFO: renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m225isClickZmokQxo(KeyEvent keyEvent) {
        m.h(keyEvent, "$this$isClick");
        return KeyEventType.m4005equalsimpl0(KeyEvent_androidKt.m4013getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m4010getKeyUpCS__XNY()) && m226isEnterZmokQxo(keyEvent);
    }

    @Composable
    public static final kj.a<Boolean> isComposeRootInScrollableContainer(Composer composer, int i2) {
        composer.startReplaceableGroup(-1990508712);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1990508712, i2, -1, "androidx.compose.foundation.isComposeRootInScrollableContainer (Clickable.android.kt:34)");
        }
        final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        kj.a<Boolean> aVar = new kj.a<Boolean>() { // from class: androidx.compose.foundation.Clickable_androidKt.isComposeRootInScrollableContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Boolean m228invoke() {
                return Boolean.valueOf(Clickable_androidKt.isInScrollableViewGroup(view));
            }
        };
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return aVar;
    }

    /* JADX INFO: renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m226isEnterZmokQxo(KeyEvent keyEvent) {
        int iM4021getNativeKeyCodeYVgTNJs = Key_androidKt.m4021getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m4012getKeyZmokQxo(keyEvent));
        return iM4021getNativeKeyCodeYVgTNJs == 23 || iM4021getNativeKeyCodeYVgTNJs == 66 || iM4021getNativeKeyCodeYVgTNJs == 160;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX INFO: renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m227isPressZmokQxo(KeyEvent keyEvent) {
        m.h(keyEvent, "$this$isPress");
        return KeyEventType.m4005equalsimpl0(KeyEvent_androidKt.m4013getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m4009getKeyDownCS__XNY()) && m226isEnterZmokQxo(keyEvent);
    }
}
