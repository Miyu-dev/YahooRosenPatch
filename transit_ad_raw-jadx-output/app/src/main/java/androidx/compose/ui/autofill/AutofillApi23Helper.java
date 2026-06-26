package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RequiresApi(23)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007J@\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/autofill/AutofillApi23Helper;", "", "Landroid/view/ViewStructure;", "structure", "", "index", "newChild", "num", "addChildCount", "id", "", "packageName", "typeName", "entryName", "Lkotlin/j;", "setId", "left", "top", "scrollX", "scrollY", "width", "height", "setDimens", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AutofillApi23Helper {
    public static final AutofillApi23Helper INSTANCE = new AutofillApi23Helper();

    private AutofillApi23Helper() {
    }

    @DoNotInline
    @RequiresApi(23)
    public final int addChildCount(ViewStructure structure, int num) {
        m.h(structure, "structure");
        return structure.addChildCount(num);
    }

    @DoNotInline
    @RequiresApi(23)
    public final ViewStructure newChild(ViewStructure structure, int index) {
        m.h(structure, "structure");
        return structure.newChild(index);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setDimens(ViewStructure viewStructure, int i2, int i3, int i4, int i5, int i6, int i7) {
        m.h(viewStructure, "structure");
        viewStructure.setDimens(i2, i3, i4, i5, i6, i7);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void setId(ViewStructure viewStructure, int i2, String str, String str2, String str3) {
        m.h(viewStructure, "structure");
        viewStructure.setId(i2, str, str2, str3);
    }
}
