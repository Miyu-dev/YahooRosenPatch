package androidx.compose.foundation.text;

import a.l;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextDelegate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Stable
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PBh\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010 \u001a\u00020\u001b\u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u00100\u001a\u00020/\u0012\u0014\b\u0002\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060504ø\u0001\u0001¢\u0006\u0004\bN\u0010OJ%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004J/\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010(\u001a\u00020'8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R#\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020605048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010?R\u0011\u0010K\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bJ\u0010\u001fR\u0011\u0010M\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/MultiParagraph;", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "layoutText", "Lkotlin/j;", "layoutIntrinsics", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResult", "layout-NN6Ew-U", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;", "layout", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/TextStyle;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "", "maxLines", "I", "getMaxLines", "()I", "minLines", "getMinLines", "", "softWrap", "Z", "getSoftWrap", "()Z", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "getOverflow-gIe3tQ8", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "paragraphIntrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getParagraphIntrinsics$foundation_release", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setParagraphIntrinsics$foundation_release", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;)V", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getIntrinsicsLayoutDirection$foundation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setIntrinsicsLayoutDirection$foundation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getNonNullIntrinsics", "nonNullIntrinsics", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@InternalFoundationTextApi
public final class TextDelegate {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    /* JADX INFO: compiled from: TextDelegate.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Lkotlin/j;", "paint", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
            m.h(canvas, "canvas");
            m.h(textLayoutResult, "textLayoutResult");
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z, int i4, Density density, FontFamily.Resolver resolver, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, i2, i3, z, i4, density, resolver, list);
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m870layoutNN6EwU$default(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m873layoutNN6EwU(j, layoutDirection, textLayoutResult);
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m871layoutTextK40F9xA(long constraints, LayoutDirection layoutDirection) {
        layoutIntrinsics(layoutDirection);
        int iM5237getMinWidthimpl = Constraints.m5237getMinWidthimpl(constraints);
        boolean z = false;
        int iM5235getMaxWidthimpl = ((this.softWrap || TextOverflow.m5212equalsimpl0(this.overflow, TextOverflow.INSTANCE.m5220getEllipsisgIe3tQ8())) && Constraints.m5231getHasBoundedWidthimpl(constraints)) ? Constraints.m5235getMaxWidthimpl(constraints) : Integer.MAX_VALUE;
        if (!this.softWrap && TextOverflow.m5212equalsimpl0(this.overflow, TextOverflow.INSTANCE.m5220getEllipsisgIe3tQ8())) {
            z = true;
        }
        int i2 = z ? 1 : this.maxLines;
        if (iM5237getMinWidthimpl != iM5235getMaxWidthimpl) {
            iM5235getMaxWidthimpl = l.i(getMaxIntrinsicWidth(), iM5237getMinWidthimpl, iM5235getMaxWidthimpl);
        }
        return new MultiParagraph(getNonNullIntrinsics(), ConstraintsKt.Constraints$default(0, iM5235getMaxWidthimpl, 0, Constraints.m5234getMaxHeightimpl(constraints), 5, null), i2, TextOverflow.m5212equalsimpl0(this.overflow, TextOverflow.INSTANCE.m5220getEllipsisgIe3tQ8()), null);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: getIntrinsicsLayoutDirection$foundation_release, reason: from getter */
    public final LayoutDirection getIntrinsicsLayoutDirection() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name and from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    /* JADX INFO: renamed from: getParagraphIntrinsics$foundation_release, reason: from getter */
    public final MultiParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m873layoutNN6EwU(long constraints, LayoutDirection layoutDirection, TextLayoutResult prevResult) {
        m.h(layoutDirection, "layoutDirection");
        if (prevResult != null && TextLayoutHelperKt.m899canReuse7_7YC6M(prevResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints)) {
            return prevResult.m4782copyO0kMr_c(new TextLayoutInput(prevResult.getLayoutInput().getText(), this.style, prevResult.getLayoutInput().getPlaceholders(), prevResult.getLayoutInput().getMaxLines(), prevResult.getLayoutInput().getSoftWrap(), prevResult.getLayoutInput().getOverflow(), prevResult.getLayoutInput().getDensity(), prevResult.getLayoutInput().getLayoutDirection(), prevResult.getLayoutInput().getFontFamilyResolver(), constraints, (DefaultConstructorMarker) null), ConstraintsKt.m5246constrain4WqzIAM(constraints, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(prevResult.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(prevResult.getMultiParagraph().getHeight()))));
        }
        MultiParagraph multiParagraphM871layoutTextK40F9xA = m871layoutTextK40F9xA(constraints, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, constraints, (DefaultConstructorMarker) null), multiParagraphM871layoutTextK40F9xA, ConstraintsKt.m5246constrain4WqzIAM(constraints, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(multiParagraphM871layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(multiParagraphM871layoutTextK40F9xA.getHeight()))), null);
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        m.h(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation_release(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    private TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z, int i4, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.maxLines = i2;
        this.minLines = i3;
        this.softWrap = z;
        this.overflow = i4;
        this.density = density;
        this.fontFamilyResolver = resolver;
        this.placeholders = list;
        if (!(i2 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i3 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i3 <= i2)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i2, int i3, boolean z, int i4, Density density, FontFamily.Resolver resolver, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (i5 & 4) != 0 ? Integer.MAX_VALUE : i2, (i5 & 8) != 0 ? 1 : i3, (i5 & 16) != 0 ? true : z, (i5 & 32) != 0 ? TextOverflow.INSTANCE.m5219getClipgIe3tQ8() : i4, density, resolver, (i5 & Optimizer.OPTIMIZATION_CACHE_MEASURES) != 0 ? EmptyList.INSTANCE : list, null);
    }
}
