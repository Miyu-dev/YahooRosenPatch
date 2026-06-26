package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.b;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.UrlAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidAccessibilitySpannableString.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007\u001a4\u0010\u000f\u001a\u00020\u000e*\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "Landroid/text/SpannableString;", "toAccessibilitySpannableString", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "", "start", "end", "Lkotlin/j;", "setSpanStyle", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i2, int i3, Density density, FontFamily.Resolver resolver) {
        SpannableExtensions_androidKt.m5050setColorRPmYEkk(spannableString, spanStyle.m4770getColor0d7_KjU(), i2, i3);
        SpannableExtensions_androidKt.m5051setFontSizeKmRG4DE(spannableString, spanStyle.getFontSize(), density, i2, i3);
        if (spanStyle.getFontWeight() != null || spanStyle.getFontStyle() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyle = spanStyle.getFontStyle();
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m4852getAndroidTypefaceStyleFO1MlWM(fontWeight, fontStyle != null ? fontStyle.m4900unboximpl() : FontStyle.INSTANCE.m4902getNormal_LCdwA())), i2, i3, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i2, i3, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                Object value = b.a(resolver, fontFamily, null, 0, fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m4912getAllGVVA2EU(), 6, null).getValue();
                m.f(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) value), i2, i3, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i2, i3, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i2, i3, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i2, i3, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i2, i3);
        SpannableExtensions_androidKt.m5048setBackgroundRPmYEkk(spannableString, spanStyle.getBackground(), i2, i3);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, Font.ResourceLoader resourceLoader) {
        m.h(annotatedString, "<this>");
        m.h(density, "density");
        m.h(resourceLoader, "resourceLoader");
        return toAccessibilitySpannableString(annotatedString, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver) {
        m.h(annotatedString, "<this>");
        m.h(density, "density");
        m.h(resolver, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i2);
                SpanStyle spanStyleComponent1 = range.component1();
                setSpanStyle(spannableString, spanStyleComponent1.m4766copyIuqyXdg((16351 & 1) != 0 ? spanStyleComponent1.m4770getColor0d7_KjU() : 0L, (16351 & 2) != 0 ? spanStyleComponent1.fontSize : 0L, (16351 & 4) != 0 ? spanStyleComponent1.fontWeight : null, (16351 & 8) != 0 ? spanStyleComponent1.fontStyle : null, (16351 & 16) != 0 ? spanStyleComponent1.fontSynthesis : null, (16351 & 32) != 0 ? spanStyleComponent1.fontFamily : null, (16351 & 64) != 0 ? spanStyleComponent1.fontFeatureSettings : null, (16351 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? spanStyleComponent1.letterSpacing : 0L, (16351 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? spanStyleComponent1.baselineShift : null, (16351 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? spanStyleComponent1.textGeometricTransform : null, (16351 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? spanStyleComponent1.localeList : null, (16351 & 2048) != 0 ? spanStyleComponent1.background : 0L, (16351 & 4096) != 0 ? spanStyleComponent1.textDecoration : null, (16351 & 8192) != 0 ? spanStyleComponent1.shadow : null), range.getStart(), range.getEnd(), density, resolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i3);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.getStart(), range2.getEnd(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i4 = 0; i4 < size3; i4++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i4);
            spannableString.setSpan(UrlAnnotationExtensions_androidKt.toSpan(range3.component1()), range3.getStart(), range3.getEnd(), 33);
        }
        return spannableString;
    }
}
