package androidx.compose.ui.text.input;

import android.view.View;
import androidx.annotation.DoNotInline;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: InputMethodManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/input/ImmHelper21;", "Landroidx/compose/ui/text/input/ImmHelper;", "Landroid/view/inputmethod/InputMethodManager;", "imm", "Lkotlin/j;", "showSoftInput", "hideSoftInput", "Landroid/view/View;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
final class ImmHelper21 implements ImmHelper {
    private final View view;

    public ImmHelper21(View view) {
        m.h(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSoftInput$lambda$0(android.view.inputmethod.InputMethodManager inputMethodManager, ImmHelper21 immHelper21) {
        m.h(inputMethodManager, "$imm");
        m.h(immHelper21, "this$0");
        inputMethodManager.showSoftInput(immHelper21.view, 0);
    }

    @Override // androidx.compose.ui.text.input.ImmHelper
    @DoNotInline
    public void hideSoftInput(android.view.inputmethod.InputMethodManager inputMethodManager) {
        m.h(inputMethodManager, "imm");
        inputMethodManager.hideSoftInputFromWindow(this.view.getWindowToken(), 0);
    }

    @Override // androidx.compose.ui.text.input.ImmHelper
    @DoNotInline
    public void showSoftInput(final android.view.inputmethod.InputMethodManager inputMethodManager) {
        m.h(inputMethodManager, "imm");
        this.view.post(new Runnable() { // from class: androidx.compose.ui.text.input.a
            @Override // java.lang.Runnable
            public final void run() {
                ImmHelper21.showSoftInput$lambda$0(inputMethodManager, this);
            }
        });
    }
}
