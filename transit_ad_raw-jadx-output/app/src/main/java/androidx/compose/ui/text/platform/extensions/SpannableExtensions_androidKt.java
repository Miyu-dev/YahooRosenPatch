package androidx.compose.ui.text.platform.extensions;

import a.f;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kj.q;
import kj.r;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;
import kotlin.text.u;

/* JADX INFO: compiled from: SpannableExtensions.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a9\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a[\u0010(\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u0006\u0010\r\u001a\u00020\f2&\u0010'\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0!H\u0000ø\u0001\u0001\u001a\"\u0010*\u001a\u00020\u0006*\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\r\u001a\u00020\fH\u0002\u001aS\u0010+\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2&\u0010'\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0!H\u0002ø\u0001\u0001\u001aF\u0010/\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u001f2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d2\u001e\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060-H\u0000\u001a'\u00104\u001a\u0004\u0018\u0001012\u0006\u00100\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001a&\u00107\u001a\u00020\u0006*\u00020\u00002\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00002\b\u00109\u001a\u0004\u0018\u0001082\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a1\u0010?\u001a\u00020\u0006*\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>\u001a&\u0010B\u001a\u00020\u0006*\u00020\u00002\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010E\u001a\u00020\u0006*\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u0010H\u001a\u00020\u0006*\u00020\u00002\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a9\u0010L\u001a\u00020\u0006*\u00020\u00002\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bJ\u0010K\u001a&\u0010O\u001a\u00020\u0006*\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a1\u0010Q\u001a\u00020\u0006*\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010>\u001a3\u0010V\u001a\u00020\u0006*\u00020\u00002\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010U\u001a.\u0010Z\u001a\u00020\u0006*\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\f\u0010\\\u001a\u00020[*\u00020\u001bH\u0002\u001a\u0016\u0010^\u001a\u00020\u001f*\u0004\u0018\u00010\u001f2\u0006\u0010]\u001a\u00020\u001fH\u0002\"\u0018\u0010a\u001a\u00020[*\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006b"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Lkotlin/j;", "setSpan", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/Density;", "density", "setTextIndent", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "resolveLineHeightInPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "resolveLineHeightInPx", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "setSpanStyles", "spanStyleRange", "setSpanStyle", "setFontAttributes", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "flattenFontStylesAndApply", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "setDrawStyle", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBackground", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "setLocaleList", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "setGeometricTransform", "", "fontFeatureSettings", "setFontFeatureSettings", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setFontSize", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "setTextDecoration", "setColor-RPmYEkk", "setColor", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "setBaselineShift-0ocSgnM", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/BaselineShift;II)V", "setBaselineShift", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "setBrush", "", "hasFontAttributes", "spanStyle", "merge", "getNeedsLetterSpacingSpan", "(Landroidx/compose/ui/text/SpanStyle;)Z", "needsLetterSpacingSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class SpannableExtensions_androidKt {
    /* JADX INFO: renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m5046createLetterSpacingSpaneAf_CNQ(long j, Density density) {
        long jM5447getTypeUIouoOA = TextUnit.m5447getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5481getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo347toPxR2X_6o(j));
        }
        if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5480getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m5448getValueimpl(j));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(SpanStyle spanStyle, List<AnnotatedString.Range<SpanStyle>> list, q<? super SpanStyle, ? super Integer, ? super Integer, j> qVar) {
        m.h(list, "spanStyles");
        m.h(qVar, "block");
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                qVar.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = list.size();
        int i2 = size * 2;
        Integer[] numArr = new Integer[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            numArr[i3] = 0;
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i4);
            numArr[i4] = Integer.valueOf(range.getStart());
            numArr[i4 + size] = Integer.valueOf(range.getEnd());
        }
        Integer[] numArr2 = numArr;
        if (numArr2.length > 1) {
            Arrays.sort(numArr2);
        }
        int iIntValue = ((Number) p.E0(numArr)).intValue();
        for (int i5 = 0; i5 < i2; i5++) {
            int iIntValue2 = numArr[i5].intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                SpanStyle spanStyleMerge = spanStyle;
                for (int i6 = 0; i6 < size3; i6++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i6);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(iIntValue, iIntValue2, range2.getStart(), range2.getEnd())) {
                        spanStyleMerge = merge(spanStyleMerge, range2.getItem());
                    }
                }
                if (spanStyleMerge != null) {
                    qVar.invoke(spanStyleMerge, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long jM5447getTypeUIouoOA = TextUnit.m5447getTypeUIouoOA(spanStyle.getLetterSpacing());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        return TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5481getSpUIouoOA()) || TextUnitType.m5476equalsimpl0(TextUnit.m5447getTypeUIouoOA(spanStyle.getLetterSpacing()), companion.m5480getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m4834getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* JADX INFO: renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m5047resolveLineHeightInPxo2QH7mI(long j, float f, Density density) {
        long jM5447getTypeUIouoOA = TextUnit.m5447getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5481getSpUIouoOA())) {
            return density.mo347toPxR2X_6o(j);
        }
        if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5480getEmUIouoOA())) {
            return TextUnit.m5448getValueimpl(j) * f;
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m5048setBackgroundRPmYEkk(Spannable spannable, long j, int i2, int i3) {
        m.h(spannable, "$this$setBackground");
        if (j != Color.INSTANCE.m2854getUnspecified0d7_KjU()) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m2872toArgb8_81llA(j)), i2, i3);
        }
    }

    /* JADX INFO: renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m5049setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i2, int i3) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m5065unboximpl()), i2, i3);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f, int i2, int i3) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m5050setColorRPmYEkk(spannable, ((SolidColor) brush).getValue(), i2, i3);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f), i2, i3);
            }
        }
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m5050setColorRPmYEkk(Spannable spannable, long j, int i2, int i3) {
        m.h(spannable, "$this$setColor");
        if (j != Color.INSTANCE.m2854getUnspecified0d7_KjU()) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m2872toArgb8_81llA(j)), i2, i3);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i2, int i3) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i2, i3);
        }
    }

    private static final void setFontAttributes(final Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, final r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i2);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().getFontSynthesis() != null) {
                arrayList.add(range);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m4833getFontStyle4Lr2A7w(), textStyle.m4834getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16323, (DefaultConstructorMarker) null) : null, arrayList, new q<SpanStyle, Integer, Integer, j>() { // from class: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setFontAttributes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((SpanStyle) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
                return j.a;
            }

            public final void invoke(SpanStyle spanStyle, int i3, int i4) {
                m.h(spanStyle, "spanStyle");
                Spannable spannable2 = spannable;
                r<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> rVar2 = rVar;
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontWeight fontWeight = spanStyle.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyle = spanStyle.getFontStyle();
                FontStyle fontStyleM4894boximpl = FontStyle.m4894boximpl(fontStyle != null ? fontStyle.m4900unboximpl() : FontStyle.INSTANCE.m4902getNormal_LCdwA());
                FontSynthesis fontSynthesis = spanStyle.getFontSynthesis();
                spannable2.setSpan(new TypefaceSpan((Typeface) rVar2.invoke(fontFamily, fontWeight, fontStyleM4894boximpl, FontSynthesis.m4903boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m4912getAllGVVA2EU()))), i3, i4, 33);
            }
        });
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i2, int i3) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i2, i3);
        }
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m5051setFontSizeKmRG4DE(Spannable spannable, long j, Density density, int i2, int i3) {
        m.h(spannable, "$this$setFontSize");
        m.h(density, "density");
        long jM5447getTypeUIouoOA = TextUnit.m5447getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5481getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(f.f0(density.mo347toPxR2X_6o(j)), false), i2, i3);
        } else if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5480getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m5448getValueimpl(j)), i2, i3);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i2, int i3) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i2, i3);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i2, i3);
        }
    }

    /* JADX INFO: renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m5052setLineHeightKmRG4DE(Spannable spannable, long j, float f, Density density, LineHeightStyle lineHeightStyle) {
        m.h(spannable, "$this$setLineHeight");
        m.h(density, "density");
        m.h(lineHeightStyle, "lineHeightStyle");
        float fM5047resolveLineHeightInPxo2QH7mI = m5047resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(fM5047resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightStyleSpan(fM5047resolveLineHeightInPxo2QH7mI, 0, ((spannable.length() == 0) || u.N1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.Trim.m5155isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.getTrim()), LineHeightStyle.Trim.m5156isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment()), 0, spannable.length());
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m5053setLineHeightr9BaKPg(Spannable spannable, long j, float f, Density density) {
        m.h(spannable, "$this$setLineHeight");
        m.h(density, "density");
        float fM5047resolveLineHeightInPxo2QH7mI = m5047resolveLineHeightInPxo2QH7mI(j, f, density);
        if (Float.isNaN(fM5047resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new LineHeightSpan(fM5047resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(Spannable spannable, LocaleList localeList, int i2, int i3) {
        Object localeSpan;
        m.h(spannable, "<this>");
        if (localeList != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = LocaleListHelperMethods.INSTANCE.localeSpan(localeList);
            } else {
                localeSpan = new LocaleSpan(LocaleExtensions_androidKt.toJavaLocale(localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0)));
            }
            setSpan(spannable, localeSpan, i2, i3);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i2, int i3) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m2872toArgb8_81llA(shadow.getColor()), Offset.m2585getXimpl(shadow.getOffset()), Offset.m2586getYimpl(shadow.getOffset()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i2, i3);
        }
    }

    public static final void setSpan(Spannable spannable, Object obj, int i2, int i3) {
        m.h(spannable, "<this>");
        m.h(obj, "span");
        spannable.setSpan(obj, i2, i3, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m5049setBaselineShift0ocSgnM(spannable, item.getBaselineShift(), start, end);
        m5050setColorRPmYEkk(spannable, item.m4770getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m5051setFontSizeKmRG4DE(spannable, item.getFontSize(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m5048setBackgroundRPmYEkk(spannable, item.getBackground(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void setSpanStyles(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, Density density, r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        MetricAffectingSpan metricAffectingSpanM5046createLetterSpacingSpaneAf_CNQ;
        m.h(spannable, "<this>");
        m.h(textStyle, "contextTextStyle");
        m.h(list, "spanStyles");
        m.h(density, "density");
        m.h(rVar, "resolveTypeface");
        setFontAttributes(spannable, textStyle, list, rVar);
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i2);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density);
                if (getNeedsLetterSpacingSpan(range.getItem())) {
                    z = true;
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AnnotatedString.Range<SpanStyle> range2 = list.get(i3);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle item = range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM5046createLetterSpacingSpaneAf_CNQ = m5046createLetterSpacingSpaneAf_CNQ(item.getLetterSpacing(), density)) != null) {
                    setSpan(spannable, metricAffectingSpanM5046createLetterSpacingSpaneAf_CNQ, start2, end2);
                }
            }
        }
    }

    public static final void setTextDecoration(Spannable spannable, TextDecoration textDecoration, int i2, int i3) {
        m.h(spannable, "<this>");
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.INSTANCE;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i2, i3);
        }
    }

    public static final void setTextIndent(Spannable spannable, TextIndent textIndent, float f, Density density) {
        m.h(spannable, "<this>");
        m.h(density, "density");
        if (textIndent != null) {
            if ((TextUnit.m5445equalsimpl0(textIndent.getFirstLine(), TextUnitKt.getSp(0)) && TextUnit.m5445equalsimpl0(textIndent.getRestLine(), TextUnitKt.getSp(0))) || TextUnitKt.m5466isUnspecifiedR2X_6o(textIndent.getFirstLine()) || TextUnitKt.m5466isUnspecifiedR2X_6o(textIndent.getRestLine())) {
                return;
            }
            long jM5447getTypeUIouoOA = TextUnit.m5447getTypeUIouoOA(textIndent.getFirstLine());
            TextUnitType.Companion companion = TextUnitType.INSTANCE;
            float fM5448getValueimpl = 0.0f;
            float fMo347toPxR2X_6o = TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5481getSpUIouoOA()) ? density.mo347toPxR2X_6o(textIndent.getFirstLine()) : TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA, companion.m5480getEmUIouoOA()) ? TextUnit.m5448getValueimpl(textIndent.getFirstLine()) * f : 0.0f;
            long jM5447getTypeUIouoOA2 = TextUnit.m5447getTypeUIouoOA(textIndent.getRestLine());
            if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA2, companion.m5481getSpUIouoOA())) {
                fM5448getValueimpl = density.mo347toPxR2X_6o(textIndent.getRestLine());
            } else if (TextUnitType.m5476equalsimpl0(jM5447getTypeUIouoOA2, companion.m5480getEmUIouoOA())) {
                fM5448getValueimpl = TextUnit.m5448getValueimpl(textIndent.getRestLine()) * f;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo347toPxR2X_6o), (int) Math.ceil(fM5448getValueimpl)), 0, spannable.length());
        }
    }
}
