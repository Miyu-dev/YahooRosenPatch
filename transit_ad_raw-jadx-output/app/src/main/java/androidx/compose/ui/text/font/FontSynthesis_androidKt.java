package androidx.compose.ui.text.font;

import androidx.appcompat.R;
import kotlin.Metadata;

/* JADX INFO: compiled from: FontSynthesis.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"synthesizeTypeface", "", "Landroidx/compose/ui/text/font/FontSynthesis;", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "requestedWeight", "Landroidx/compose/ui/text/font/FontWeight;", "requestedStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FontSynthesis_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX INFO: renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4916synthesizeTypefaceFxwP2eA(int r5, java.lang.Object r6, androidx.compose.ui.text.font.Font r7, androidx.compose.ui.text.font.FontWeight r8, int r9) {
        /*
            java.lang.String r0 = "typeface"
            kotlin.jvm.internal.m.h(r6, r0)
            java.lang.String r0 = "font"
            kotlin.jvm.internal.m.h(r7, r0)
            java.lang.String r0 = "requestedWeight"
            kotlin.jvm.internal.m.h(r8, r0)
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 != 0) goto L17
            return r6
        L17:
            boolean r0 = androidx.compose.ui.text.font.FontSynthesis.m4909isWeightOnimpl$ui_text_release(r5)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L45
            androidx.compose.ui.text.font.FontWeight r0 = r7.getWeight()
            boolean r0 = kotlin.jvm.internal.m.c(r0, r8)
            if (r0 != 0) goto L45
            androidx.compose.ui.text.font.FontWeight$Companion r0 = androidx.compose.ui.text.font.FontWeight.INSTANCE
            androidx.compose.ui.text.font.FontWeight r3 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(r0)
            int r3 = r8.compareTo(r3)
            if (r3 < 0) goto L45
            androidx.compose.ui.text.font.FontWeight r3 = r7.getWeight()
            androidx.compose.ui.text.font.FontWeight r0 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidBold(r0)
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L45
            r0 = r1
            goto L46
        L45:
            r0 = r2
        L46:
            boolean r5 = androidx.compose.ui.text.font.FontSynthesis.m4908isStyleOnimpl$ui_text_release(r5)
            if (r5 == 0) goto L58
            int r5 = r7.getStyle()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m4897equalsimpl0(r9, r5)
            if (r5 != 0) goto L58
            r5 = r1
            goto L59
        L58:
            r5 = r2
        L59:
            if (r5 != 0) goto L5e
            if (r0 != 0) goto L5e
            return r6
        L5e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 >= r4) goto L7f
            if (r5 == 0) goto L73
            androidx.compose.ui.text.font.FontStyle$Companion r5 = androidx.compose.ui.text.font.FontStyle.INSTANCE
            int r5 = r5.m4901getItalic_LCdwA()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m4897equalsimpl0(r9, r5)
            if (r5 == 0) goto L73
            goto L74
        L73:
            r1 = r2
        L74:
            int r5 = androidx.compose.ui.text.font.AndroidFontUtils_androidKt.getAndroidTypefaceStyle(r0, r1)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            goto Lb1
        L7f:
            if (r0 == 0) goto L86
            int r8 = r8.getWeight()
            goto L8e
        L86:
            androidx.compose.ui.text.font.FontWeight r8 = r7.getWeight()
            int r8 = r8.getWeight()
        L8e:
            if (r5 == 0) goto L9b
            androidx.compose.ui.text.font.FontStyle$Companion r5 = androidx.compose.ui.text.font.FontStyle.INSTANCE
            int r5 = r5.m4901getItalic_LCdwA()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m4897equalsimpl0(r9, r5)
            goto La9
        L9b:
            int r5 = r7.getStyle()
            androidx.compose.ui.text.font.FontStyle$Companion r7 = androidx.compose.ui.text.font.FontStyle.INSTANCE
            int r7 = r7.m4901getItalic_LCdwA()
            boolean r5 = androidx.compose.ui.text.font.FontStyle.m4897equalsimpl0(r5, r7)
        La9:
            androidx.compose.ui.text.font.TypefaceHelperMethodsApi28 r7 = androidx.compose.ui.text.font.TypefaceHelperMethodsApi28.INSTANCE
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = r7.create(r6, r8, r5)
        Lb1:
            java.lang.String r6 = "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }"
            kotlin.jvm.internal.m.g(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontSynthesis_androidKt.m4916synthesizeTypefaceFxwP2eA(int, java.lang.Object, androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.FontWeight, int):java.lang.Object");
    }
}
