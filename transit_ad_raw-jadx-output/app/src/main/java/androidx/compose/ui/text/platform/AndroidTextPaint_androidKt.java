package androidx.compose.ui.text.platform;

import a.f;
import a.l;
import android.text.TextPaint;
import androidx.compose.ui.text.input.PartialGapBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidTextPaint.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"Landroid/text/TextPaint;", "", "alpha", "Lkotlin/j;", "setAlpha", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(TextPaint textPaint, float f) {
        m.h(textPaint, "<this>");
        if (Float.isNaN(f)) {
            return;
        }
        textPaint.setAlpha(f.f0(l.h(f, 0.0f, 1.0f) * PartialGapBuffer.BUF_SIZE));
    }
}
