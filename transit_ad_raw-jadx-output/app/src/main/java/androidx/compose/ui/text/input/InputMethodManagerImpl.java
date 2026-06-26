package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.f;
import kotlin.g;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: InputMethodManager.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J(\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "Lkotlin/j;", "restartInput", "showSoftInput", "hideSoftInput", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "Landroid/view/View;", "view", "Landroid/view/View;", "Landroid/view/inputmethod/InputMethodManager;", "imm$delegate", "Lkotlin/f;", "getImm", "()Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroidx/compose/ui/text/input/ImmHelper;", "helper", "Landroidx/compose/ui/text/input/ImmHelper;", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class InputMethodManagerImpl implements InputMethodManager {
    private final ImmHelper helper;

    /* JADX INFO: renamed from: imm$delegate, reason: from kotlin metadata */
    private final f imm;
    private final View view;

    public InputMethodManagerImpl(View view) {
        m.h(view, "view");
        this.view = view;
        this.imm = g.b(LazyThreadSafetyMode.NONE, new kj.a<android.view.inputmethod.InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final android.view.inputmethod.InputMethodManager m4973invoke() {
                Object systemService = this.this$0.view.getContext().getSystemService("input_method");
                m.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (android.view.inputmethod.InputMethodManager) systemService;
            }
        });
        this.helper = Build.VERSION.SDK_INT < 30 ? new ImmHelper21(view) : new ImmHelper30(view);
    }

    private final android.view.inputmethod.InputMethodManager getImm() {
        return (android.view.inputmethod.InputMethodManager) this.imm.getValue();
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.helper.hideSoftInput(getImm());
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput() {
        getImm().restartInput(this.view);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.helper.showSoftInput(getImm());
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(int i2, ExtractedText extractedText) {
        m.h(extractedText, "extractedText");
        getImm().updateExtractedText(this.view, i2, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(int i2, int i3, int i4, int i5) {
        getImm().updateSelection(this.view, i2, i3, i4, i5);
    }
}
