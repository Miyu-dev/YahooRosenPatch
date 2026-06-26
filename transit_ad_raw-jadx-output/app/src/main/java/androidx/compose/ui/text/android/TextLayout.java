package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpanKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.f;
import kotlin.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0002\u0088\u0001BÐ\u0001\u0012\u0006\u0010s\u001a\u00020m\u0012\b\b\u0002\u0010t\u001a\u00020\u0004\u0012\u0006\u0010v\u001a\u00020u\u0012\b\b\u0002\u0010w\u001a\u00020\u0002\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010x\u0012\b\b\u0002\u0010z\u001a\u00020\u0002\u0012\b\b\u0002\u0010{\u001a\u00020\u0004\u0012\b\b\u0003\u0010|\u001a\u00020\u0004\u0012\b\b\u0002\u00106\u001a\u00020\u0012\u0012\b\b\u0002\u00109\u001a\u00020\u0012\u0012\b\b\u0002\u0010}\u001a\u00020\u0002\u0012\b\b\u0002\u0010~\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u007f\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0080\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u0002\u0012\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u0001\u0012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0083\u0001\u0012\b\b\u0002\u0010<\u001a\u00020;¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002J\u0016\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0012J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u001e\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#J&\u0010,\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0002J\u000e\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u00101\u001a\u00020%2\u0006\u00100\u001a\u00020/J\u000f\u00104\u001a\u00020\u0012H\u0000¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R\u0017\u00106\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00103R\u0017\u00109\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u00103R\u0017\u0010<\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010@\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u00103R \u0010C\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR\u0017\u0010I\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010M\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bM\u0010J\u0012\u0004\bO\u0010H\u001a\u0004\bN\u0010LR \u0010P\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bP\u0010J\u0012\u0004\bR\u0010H\u001a\u0004\bQ\u0010LR\u0014\u0010S\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0014\u0010V\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00107R\u0016\u0010X\u001a\u0004\u0018\u00010W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010JR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0011\u0010j\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010l\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bk\u0010iR\u0011\u0010p\u001a\u00020m8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0011\u0010r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bq\u0010L¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "", "lineIndex", "", "getLineLeft", "getLineRight", "line", "getLineTop", "getLineBottom", "getLineAscent", "getLineBaseline", "getLineDescent", "getLineHeight", "getLineWidth", "getLineStart", "getLineEnd", "getLineVisibleEnd", "", "isLineEllipsized", "getLineEllipsisOffset", "getLineEllipsisCount", "vertical", "getLineForVertical", "horizontal", "getOffsetForHorizontal", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "getPrimaryHorizontal", "getSecondaryHorizontal", "getLineForOffset", "isRtlCharAt", "getParagraphDirection", "start", "end", "Landroid/graphics/Path;", "dest", "Lkotlin/j;", "getSelectionPath", "startOffset", "endOffset", "", "array", "arrayStart", "fillBoundingBoxes", "Landroid/graphics/RectF;", "getBoundingBox", "Landroid/graphics/Canvas;", "canvas", "paint", "isFallbackLinespacingApplied$ui_text_release", "()Z", "isFallbackLinespacingApplied", "getHorizontalPadding", "includePadding", "Z", "getIncludePadding", "fallbackLineSpacing", "getFallbackLineSpacing", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "didExceedMaxLines", "getDidExceedMaxLines", "Landroid/text/Layout;", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "getLayout$annotations", "()V", "lineCount", "I", "getLineCount", "()I", "topPadding", "getTopPadding$ui_text_release", "getTopPadding$ui_text_release$annotations", "bottomPadding", "getBottomPadding$ui_text_release", "getBottomPadding$ui_text_release$annotations", "leftPadding", "F", "rightPadding", "isBoringLayout", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineFontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "lastLineExtra", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "lineHeightSpans", "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper$delegate", "Lkotlin/f;", "getLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth", "", "getText", "()Ljava/lang/CharSequence;", "text", "getHeight", "height", "charSequence", "width", "Landroid/text/TextPaint;", "textPaint", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextLayout {
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;

    /* JADX INFO: renamed from: layoutHelper$delegate, reason: from kotlin metadata */
    private final f layoutHelper;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final int topPadding;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: TextLayout.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout$Companion;", "", "()V", "constructStaticLayout", "Landroid/text/StaticLayout;", "charSequence", "", "width", "", "textPaint", "Landroid/text/TextPaint;", "hyphenationFrequency", "lineBreakStyle", "breakStrategy", "lineBreakWordStyle", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public final StaticLayout constructStaticLayout(CharSequence charSequence, int width, TextPaint textPaint, int hyphenationFrequency, int lineBreakStyle, int breakStrategy, int lineBreakWordStyle) {
            m.h(charSequence, "charSequence");
            m.h(textPaint, "textPaint");
            return StaticLayoutFactory.INSTANCE.create(charSequence, (2072512 & 2) != 0 ? 0 : 0, (2072512 & 4) != 0 ? charSequence.length() : 0, textPaint, width, (2072512 & 32) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : null, (2072512 & 64) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : null, (2072512 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? Integer.MAX_VALUE : 0, (2072512 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? null : null, (2072512 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? width : 0, (2072512 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : false, (2072512 & 16384) != 0, (32768 & 2072512) != 0 ? 0 : breakStrategy, (65536 & 2072512) != 0 ? 0 : lineBreakStyle, (131072 & 2072512) != 0 ? 0 : lineBreakWordStyle, (262144 & 2072512) != 0 ? 0 : hyphenationFrequency, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        }

        private Companion() {
        }
    }

    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i2, TextUtils.TruncateAt truncateAt, int i3, float f2, @Px float f3, boolean z, boolean z2, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        boolean z3;
        boolean z4;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutCreate;
        m.h(charSequence, "charSequence");
        m.h(textPaint, "textPaint");
        m.h(layoutIntrinsics, "layoutIntrinsics");
        this.includePadding = z;
        this.fallbackLineSpacing = z2;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayoutKt.getTextDirectionHeuristic(i3);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i2);
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (boringMetrics == null || layoutIntrinsics.getMaxIntrinsicWidth() > f || z5) {
                z3 = true;
                this.isBoringLayout = false;
                z4 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                layoutCreate = StaticLayoutFactory.INSTANCE.create(charSequence, 0, charSequence.length(), textPaint, iCeil, textDirectionHeuristic2, alignment, i4, truncateAt, (int) Math.ceil(d), f2, f3, i9, z, z2, i5, i6, i7, i8, iArr, iArr2);
            } else {
                this.isBoringLayout = true;
                z3 = true;
                layoutCreate = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, iCeil, boringMetrics, alignment, z, z2, truncateAt, iCeil);
                z4 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
            }
            this.layout = layoutCreate;
            Trace.endSection();
            int iMin = Math.min(layoutCreate.getLineCount(), i4);
            this.lineCount = iMin;
            this.didExceedMaxLines = (iMin >= i4 && (layoutCreate.getEllipsisCount(iMin + (-1)) > 0 || layoutCreate.getLineEnd(iMin + (-1)) != charSequence.length())) ? z3 : z4;
            Pair verticalPaddings = TextLayoutKt.getVerticalPaddings(this);
            LineHeightStyleSpan[] lineHeightSpans = TextLayoutKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            Pair lineHeightPaddings = TextLayoutKt.getLineHeightPaddings(this, lineHeightSpans);
            this.topPadding = Math.max(((Number) verticalPaddings.getFirst()).intValue(), ((Number) lineHeightPaddings.getFirst()).intValue());
            this.bottomPadding = Math.max(((Number) verticalPaddings.getSecond()).intValue(), ((Number) lineHeightPaddings.getSecond()).intValue());
            Pair lastLineMetrics = TextLayoutKt.getLastLineMetrics(this, textPaint, textDirectionHeuristic, lineHeightSpans);
            this.lastLineFontMetrics = (Paint.FontMetricsInt) lastLineMetrics.getFirst();
            this.lastLineExtra = ((Number) lastLineMetrics.getSecond()).intValue();
            this.leftPadding = IndentationFixSpanKt.getEllipsizedLeftPadding$default(layoutCreate, iMin - 1, null, 2, null);
            this.rightPadding = IndentationFixSpanKt.getEllipsizedRightPadding$default(layoutCreate, iMin - 1, null, 2, null);
            this.layoutHelper = g.b(LazyThreadSafetyMode.NONE, new kj.a<LayoutHelper>() { // from class: androidx.compose.ui.text.android.TextLayout$layoutHelper$2
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                public final LayoutHelper m4842invoke() {
                    return new LayoutHelper(this.this$0.getLayout());
                }
            });
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final float getHorizontalPadding(int line) {
        if (line == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    private final LayoutHelper getLayoutHelper() {
        return (LayoutHelper) this.layoutHelper.getValue();
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        return textLayout.getPrimaryHorizontal(i2, z);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        return textLayout.getSecondaryHorizontal(i2, z);
    }

    public final void fillBoundingBoxes(int i2, int i3, float[] fArr, int i4) {
        float secondaryDownstream;
        float secondaryUpstream;
        m.h(fArr, "array");
        int length = getText().length();
        int i5 = 1;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
        if (!(i2 < length)) {
            throw new IllegalArgumentException("startOffset must be less than text length".toString());
        }
        if (!(i3 > i2)) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
        }
        if (!(i3 <= length)) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
        }
        if (!(fArr.length - i4 >= (i3 - i2) * 4)) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
        }
        int lineForOffset = getLineForOffset(i2);
        int lineForOffset2 = getLineForOffset(i3 - 1);
        HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
        if (lineForOffset > lineForOffset2) {
            return;
        }
        int i6 = lineForOffset;
        int i7 = i4;
        while (true) {
            int lineStart = getLineStart(i6);
            int lineEnd = getLineEnd(i6);
            int iMin = Math.min(i3, lineEnd);
            float lineTop = getLineTop(i6);
            float lineBottom = getLineBottom(i6);
            int i8 = getParagraphDirection(i6) == i5 ? i5 : 0;
            int i9 = i8 ^ 1;
            for (int iMax = Math.max(i2, lineStart); iMax < iMin; iMax++) {
                boolean zIsRtlCharAt = isRtlCharAt(iMax);
                if (i8 != 0 && !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                } else if (i8 != 0 && zIsRtlCharAt) {
                    secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else if (i9 == 0 || !zIsRtlCharAt) {
                    secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(iMax);
                    secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(iMax + 1);
                } else {
                    secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(iMax);
                    secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(iMax + 1);
                }
                fArr[i7] = secondaryDownstream;
                fArr[i7 + 1] = lineTop;
                fArr[i7 + 2] = secondaryUpstream;
                fArr[i7 + 3] = lineBottom;
                i7 += 4;
            }
            if (i6 == lineForOffset2) {
                return;
            }
            i6++;
            i5 = 1;
        }
    }

    /* JADX INFO: renamed from: getBottomPadding$ui_text_release, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final RectF getBoundingBox(int offset) {
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(offset);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        boolean z = getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = this.layout.isRtlCharAt(offset);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(offset, false);
                primaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            } else if (zIsRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(offset, false);
                primaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(offset, false);
                secondaryHorizontal2 = getSecondaryHorizontal(offset + 1, true);
            }
            float f = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f;
        } else {
            secondaryHorizontal = getPrimaryHorizontal(offset, false);
            secondaryHorizontal2 = getPrimaryHorizontal(offset + 1, true);
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        return (this.didExceedMaxLines ? this.layout.getLineBottom(this.lineCount - 1) : this.layout.getHeight()) + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineAscent(line) : fontMetricsInt.ascent;
    }

    public final float getLineBaseline(int line) {
        return this.topPadding + ((line != this.lineCount + (-1) || this.lastLineFontMetrics == null) ? this.layout.getLineBaseline(line) : getLineTop(line) - this.lastLineFontMetrics.ascent);
    }

    public final float getLineBottom(int line) {
        if (line != this.lineCount - 1 || this.lastLineFontMetrics == null) {
            return this.topPadding + this.layout.getLineBottom(line) + (line == this.lineCount + (-1) ? this.bottomPadding : 0);
        }
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int line) {
        Paint.FontMetricsInt fontMetricsInt;
        return (line != this.lineCount + (-1) || (fontMetricsInt = this.lastLineFontMetrics) == null) ? this.layout.getLineDescent(line) : fontMetricsInt.descent;
    }

    public final int getLineEllipsisCount(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int getLineEllipsisOffset(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int getLineEnd(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex) == 0 ? this.layout.getLineEnd(lineIndex) : this.layout.getText().length();
    }

    public final int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final int getLineForVertical(int vertical) {
        return this.layout.getLineForVertical(this.topPadding + vertical);
    }

    public final float getLineHeight(int lineIndex) {
        return getLineBottom(lineIndex) - getLineTop(lineIndex);
    }

    public final float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.leftPadding : 0.0f);
    }

    public final float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex) + (lineIndex == this.lineCount + (-1) ? this.rightPadding : 0.0f);
    }

    public final int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final float getLineTop(int line) {
        return this.layout.getLineTop(line) + (line == 0 ? 0 : this.topPadding);
    }

    public final int getLineVisibleEnd(int lineIndex) {
        if (this.layout.getEllipsisStart(lineIndex) == 0) {
            return this.layout.getLineVisibleEnd(lineIndex);
        }
        return this.layout.getEllipsisStart(lineIndex) + this.layout.getLineStart(lineIndex);
    }

    public final float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, ((-1) * getHorizontalPadding(line)) + horizontal);
    }

    public final int getParagraphDirection(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final float getPrimaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, true, upstream) + getHorizontalPadding(getLineForOffset(offset));
    }

    public final float getSecondaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, false, upstream) + getHorizontalPadding(getLineForOffset(offset));
    }

    public final void getSelectionPath(int i2, int i3, Path path) {
        m.h(path, "dest");
        this.layout.getSelectionPath(i2, i3, path);
        if (this.topPadding == 0 || path.isEmpty()) {
            return;
        }
        path.offset(0.0f, this.topPadding);
    }

    public final CharSequence getText() {
        CharSequence text = this.layout.getText();
        m.g(text, "layout.text");
        return text;
    }

    /* JADX INFO: renamed from: getTopPadding$ui_text_release, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.layout;
            m.f(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        m.f(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return TextLayoutKt.isLineEllipsized(this.layout, lineIndex);
    }

    public final boolean isRtlCharAt(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final void paint(Canvas canvas) {
        m.h(canvas, "canvas");
        if (canvas.getClipBounds(this.rect)) {
            int i2 = this.topPadding;
            if (i2 != 0) {
                canvas.translate(0.0f, i2);
            }
            TextAndroidCanvas textAndroidCanvas = TextLayoutKt.SharedTextAndroidCanvas;
            textAndroidCanvas.setCanvas(canvas);
            this.layout.draw(textAndroidCanvas);
            int i3 = this.topPadding;
            if (i3 != 0) {
                canvas.translate(0.0f, (-1) * i3);
            }
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i2, TextUtils.TruncateAt truncateAt, int i3, float f2, float f3, boolean z, boolean z2, int i4, int i5, int i6, int i7, int i8, int i9, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        float f4 = (i10 & 2) != 0 ? 0.0f : f;
        int i11 = (i10 & 8) != 0 ? 0 : i2;
        TextUtils.TruncateAt truncateAt2 = (i10 & 16) != 0 ? null : truncateAt;
        int i12 = (i10 & 32) != 0 ? 2 : i3;
        this(charSequence, f4, textPaint, i11, truncateAt2, i12, (i10 & 64) != 0 ? 1.0f : f2, (i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? 0.0f : f3, (i10 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? false : z, (i10 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? true : z2, (i10 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? Integer.MAX_VALUE : i4, (i10 & 2048) != 0 ? 0 : i5, (i10 & 4096) != 0 ? 0 : i6, (i10 & 8192) != 0 ? 0 : i7, (i10 & 16384) != 0 ? 0 : i8, (32768 & i10) != 0 ? 0 : i9, (65536 & i10) != 0 ? null : iArr, (131072 & i10) != 0 ? null : iArr2, (i10 & 262144) != 0 ? new LayoutIntrinsics(charSequence, textPaint, i12) : layoutIntrinsics);
    }
}
