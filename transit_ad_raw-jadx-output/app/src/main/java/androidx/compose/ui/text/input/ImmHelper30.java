package androidx.compose.ui.text.input;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: InputMethodManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RequiresApi(30)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0005H\u0082\u0010J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/ImmHelper30;", "Landroidx/compose/ui/text/input/ImmHelper;", "Landroid/view/View;", "Landroid/view/Window;", "findWindow", "Landroid/content/Context;", "Landroid/view/inputmethod/InputMethodManager;", "imm", "Lkotlin/j;", "showSoftInput", "hideSoftInput", "view", "Landroid/view/View;", "Landroidx/compose/ui/text/input/ImmHelper21;", "_immHelper21", "Landroidx/compose/ui/text/input/ImmHelper21;", "Landroidx/core/view/WindowInsetsControllerCompat;", "getInsetsControllerCompat", "()Landroidx/core/view/WindowInsetsControllerCompat;", "insetsControllerCompat", "getImmHelper21", "()Landroidx/compose/ui/text/input/ImmHelper21;", "immHelper21", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final class ImmHelper30 implements ImmHelper {
    private ImmHelper21 _immHelper21;
    private final View view;

    public ImmHelper30(View view) {
        m.h(view, "view");
        this.view = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Window findWindow(View view) {
        View view2 = view;
        while (!(view2 instanceof DialogWindowProvider)) {
            Object parent = view2.getParent();
            View view3 = parent instanceof View ? (View) parent : null;
            if (view3 == null) {
                Context context = view2.getContext();
                m.g(context, "view.context");
                Window windowFindWindow = findWindow(context);
                if (windowFindWindow == null) {
                    return null;
                }
                View decorView = windowFindWindow.getDecorView();
                m.g(decorView, "windowFromContext.decorView");
                if (decorView == view2) {
                    return windowFindWindow;
                }
                return null;
            }
            view2 = view3;
        }
        return ((DialogWindowProvider) view2).getWindow();
    }

    private final ImmHelper21 getImmHelper21() {
        ImmHelper21 immHelper21 = this._immHelper21;
        if (immHelper21 != null) {
            return immHelper21;
        }
        ImmHelper21 immHelper212 = new ImmHelper21(this.view);
        this._immHelper21 = immHelper212;
        return immHelper212;
    }

    private final WindowInsetsControllerCompat getInsetsControllerCompat() {
        Window windowFindWindow = findWindow(this.view);
        if (windowFindWindow != null) {
            return new WindowInsetsControllerCompat(windowFindWindow, this.view);
        }
        return null;
    }

    @Override // androidx.compose.ui.text.input.ImmHelper
    @DoNotInline
    public void hideSoftInput(android.view.inputmethod.InputMethodManager inputMethodManager) {
        m.h(inputMethodManager, "imm");
        WindowInsetsControllerCompat insetsControllerCompat = getInsetsControllerCompat();
        if (insetsControllerCompat != null) {
            insetsControllerCompat.hide(WindowInsetsCompat.Type.ime());
        } else {
            getImmHelper21().hideSoftInput(inputMethodManager);
        }
    }

    @Override // androidx.compose.ui.text.input.ImmHelper
    @DoNotInline
    public void showSoftInput(android.view.inputmethod.InputMethodManager inputMethodManager) {
        m.h(inputMethodManager, "imm");
        WindowInsetsControllerCompat insetsControllerCompat = getInsetsControllerCompat();
        if (insetsControllerCompat != null) {
            insetsControllerCompat.show(WindowInsetsCompat.Type.ime());
        } else {
            getImmHelper21().showSoftInput(inputMethodManager);
        }
    }

    private final Window findWindow(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            m.g(context, "baseContext");
        }
        return ((Activity) context).getWindow();
    }
}
