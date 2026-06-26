package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.TextDecoration;

/* JADX INFO: compiled from: Paragraph.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ int a(Paragraph paragraph, int i2, boolean z, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i3 & 2) != 0) {
            z = false;
        }
        return paragraph.getLineEnd(i2, z);
    }

    public static /* synthetic */ void b(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        paragraph.mo4660paintLG529CI(canvas, (i3 & 2) != 0 ? Color.INSTANCE.m2854getUnspecified0d7_KjU() : j, (i3 & 4) != 0 ? null : shadow, (i3 & 8) != 0 ? null : textDecoration, (i3 & 16) == 0 ? drawStyle : null, (i3 & 32) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }

    public static /* synthetic */ void c(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i2 & 2) != 0) {
            j = Color.INSTANCE.m2854getUnspecified0d7_KjU();
        }
        paragraph.mo4661paintRPmYEkk(canvas, j, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration);
    }

    public static /* synthetic */ void d(Paragraph paragraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        paragraph.mo4662painthn5TExg(canvas, brush, (i3 & 4) != 0 ? Float.NaN : f, (i3 & 8) != 0 ? null : shadow, (i3 & 16) != 0 ? null : textDecoration, (i3 & 32) != 0 ? null : drawStyle, (i3 & 64) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i2);
    }
}
