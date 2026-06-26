package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J%\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi26Helper;", "", "Landroid/view/ViewStructure;", "structure", "Landroid/view/autofill/AutofillId;", "parent", "", "virtualId", "Lkotlin/j;", "setAutofillId", "getAutofillId", "type", "setAutofillType", "", "", "hints", "setAutofillHints", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillValue;", "value", "", "isText", "isDate", "isList", "isToggle", "", "textValue", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AutofillApi26Helper {
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    @DoNotInline
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public final AutofillId getAutofillId(ViewStructure structure) {
        m.h(structure, "structure");
        return structure.getAutofillId();
    }

    @DoNotInline
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public final boolean isDate(AutofillValue value) {
        m.h(value, "value");
        return value.isDate();
    }

    @DoNotInline
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public final boolean isList(AutofillValue value) {
        m.h(value, "value");
        return value.isList();
    }

    @DoNotInline
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public final boolean isText(AutofillValue value) {
        m.h(value, "value");
        return value.isText();
    }

    @DoNotInline
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public final boolean isToggle(AutofillValue value) {
        m.h(value, "value");
        return value.isToggle();
    }

    @DoNotInline
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public final void setAutofillHints(ViewStructure structure, String[] hints) {
        m.h(structure, "structure");
        m.h(hints, "hints");
        structure.setAutofillHints(hints);
    }

    @DoNotInline
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public final void setAutofillId(ViewStructure viewStructure, AutofillId autofillId, int i2) {
        m.h(viewStructure, "structure");
        m.h(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i2);
    }

    @DoNotInline
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public final void setAutofillType(ViewStructure viewStructure, int i2) {
        m.h(viewStructure, "structure");
        viewStructure.setAutofillType(i2);
    }

    @DoNotInline
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public final CharSequence textValue(AutofillValue value) {
        m.h(value, "value");
        CharSequence textValue = value.getTextValue();
        m.g(textValue, "value.textValue");
        return textValue;
    }
}
