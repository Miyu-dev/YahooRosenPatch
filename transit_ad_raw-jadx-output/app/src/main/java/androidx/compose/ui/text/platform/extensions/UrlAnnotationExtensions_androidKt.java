package androidx.compose.ui.text.platform.extensions;

import android.text.style.URLSpan;
import androidx.appcompat.R;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.UrlAnnotation;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: UrlAnnotationExtensions.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"toSpan", "Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/UrlAnnotation;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UrlAnnotationExtensions_androidKt {
    @ExperimentalTextApi
    public static final URLSpan toSpan(UrlAnnotation urlAnnotation) {
        m.h(urlAnnotation, "<this>");
        return new URLSpan(urlAnnotation.getUrl());
    }
}
