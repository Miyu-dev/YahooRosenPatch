package androidx.compose.ui.text;

import a.f;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextPainter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0085\u0001\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ao\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001am\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001ak\u0010\u001a\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a\u0014\u00101\u001a\u00020\u0017*\u0002002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u001a)\u00105\u001a\u000202*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\"\u001d\u00106\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/text/TextMeasurer;", "textMeasurer", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Lkotlin/j;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "drawText", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "alpha", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "clip", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "textLayoutConstraints", "DefaultTextBlendMode", "I", "getDefaultTextBlendMode", "()I", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class TextPainterKt {
    private static final int DefaultTextBlendMode = BlendMode.INSTANCE.m2768getSrcOver0nO6VwU();

    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m5212equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m5221getVisiblegIe3tQ8())) {
            return;
        }
        c.d(drawTransform, 0.0f, 0.0f, IntSize.m5427getWidthimpl(textLayoutResult.getSize()), IntSize.m5426getHeightimpl(textLayoutResult.getSize()), 0, 16, null);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m4790drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j, TextStyle textStyle, int i2, boolean z, int i3, List<AnnotatedString.Range<Placeholder>> list, long j2, int i4) {
        m.h(drawScope, "$this$drawText");
        m.h(textMeasurer, "textMeasurer");
        m.h(annotatedString, "text");
        m.h(textStyle, "style");
        m.h(list, "placeholders");
        TextLayoutResult textLayoutResultM4787measurexDpz5zY$default = TextMeasurer.m4787measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i2, z, i3, list, m4798textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2585getXimpl(j), Offset.m2586getYimpl(j));
        clip(transform, textLayoutResultM4787measurexDpz5zY$default);
        textLayoutResultM4787measurexDpz5zY$default.getMultiParagraph().m4689paintLG529CI(drawScope.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m2854getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i4);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m4792drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        m.h(drawScope, "$this$drawText");
        m.h(textLayoutResult, "textLayoutResult");
        m.h(brush, "brush");
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2585getXimpl(j), Offset.m2586getYimpl(j));
        clip(transform, textLayoutResult);
        textLayoutResult.getMultiParagraph().m4691painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i2);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m4794drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j, TextStyle textStyle, int i2, boolean z, int i3, long j2, int i4) {
        m.h(drawScope, "$this$drawText");
        m.h(textMeasurer, "textMeasurer");
        m.h(str, "text");
        m.h(textStyle, "style");
        TextLayoutResult textLayoutResultM4787measurexDpz5zY$default = TextMeasurer.m4787measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, null, 6, null), textStyle, i2, z, i3, null, m4798textLayoutConstraintsv_w8tDc(drawScope, j2, j), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo3260getSizeNHjbRc = drawContext.mo3260getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m2585getXimpl(j), Offset.m2586getYimpl(j));
        clip(transform, textLayoutResultM4787measurexDpz5zY$default);
        textLayoutResultM4787measurexDpz5zY$default.getMultiParagraph().m4689paintLG529CI(drawScope.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m2854getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m3284getDefaultBlendMode0nO6VwU() : i4);
        drawContext.getCanvas().restore();
        drawContext.mo3261setSizeuvyYCjk(jMo3260getSizeNHjbRc);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    @androidx.compose.ui.text.ExperimentalTextApi
    /* JADX INFO: renamed from: drawText-d8-rzKo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4796drawTextd8rzKo(androidx.compose.ui.graphics.drawscope.DrawScope r13, androidx.compose.ui.text.TextLayoutResult r14, long r15, long r17, float r19, androidx.compose.ui.graphics.Shadow r20, androidx.compose.ui.text.style.TextDecoration r21, androidx.compose.ui.graphics.drawscope.DrawStyle r22, int r23) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextPainterKt.m4796drawTextd8rzKo(androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.text.TextLayoutResult, long, long, float, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.drawscope.DrawStyle, int):void");
    }

    public static final int getDefaultTextBlendMode() {
        return DefaultTextBlendMode;
    }

    /* JADX INFO: renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m4798textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j, long j2) {
        int iF0;
        int iF02;
        int iF03;
        Size.Companion companion = Size.INSTANCE;
        boolean z = true;
        int iF04 = 0;
        if (((j > companion.m2662getUnspecifiedNHjbRc() ? 1 : (j == companion.m2662getUnspecifiedNHjbRc() ? 0 : -1)) == 0) || Float.isNaN(Size.m2654getWidthimpl(j))) {
            iF02 = f.f0((float) Math.ceil(Size.m2654getWidthimpl(drawScope.mo3254getSizeNHjbRc()) - Offset.m2585getXimpl(j2)));
            iF0 = 0;
        } else {
            iF0 = f.f0((float) Math.ceil(Size.m2654getWidthimpl(j)));
            iF02 = iF0;
        }
        if (!(j == companion.m2662getUnspecifiedNHjbRc()) && !Float.isNaN(Size.m2651getHeightimpl(j))) {
            z = false;
        }
        if (z) {
            iF03 = f.f0((float) Math.ceil(Size.m2651getHeightimpl(drawScope.mo3254getSizeNHjbRc()) - Offset.m2586getYimpl(j2)));
        } else {
            iF04 = f.f0((float) Math.ceil(Size.m2651getHeightimpl(j)));
            iF03 = iF04;
        }
        return ConstraintsKt.Constraints(iF0, iF02, iF04, iF03);
    }
}
