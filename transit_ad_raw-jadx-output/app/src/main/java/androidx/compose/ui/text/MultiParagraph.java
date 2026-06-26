package androidx.compose.ui.text;

import a.f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDrawKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.u;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010D\u001a\u00020C\u0012\b\b\u0002\u0010H\u001a\u00020\u001a\u0012\b\b\u0002\u0010l\u001a\u00020)\u0012\u0006\u0010P\u001a\u00020\u0016¢\u0006\u0004\bm\u0010nB[\b\u0017\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010p\u001a\u00020o\u0012\u0014\b\u0002\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0q0X\u0012\b\b\u0002\u0010H\u001a\u00020\u001a\u0012\b\b\u0002\u0010l\u001a\u00020)\u0012\u0006\u0010P\u001a\u00020\u0016\u0012\u0006\u0010u\u001a\u00020t\u0012\u0006\u0010w\u001a\u00020v¢\u0006\u0004\bm\u0010xB[\b\u0017\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010p\u001a\u00020o\u0012\u0006\u0010P\u001a\u00020\u0016\u0012\u0006\u0010u\u001a\u00020t\u0012\u0006\u0010z\u001a\u00020y\u0012\u0014\b\u0002\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0q0X\u0012\b\b\u0002\u0010H\u001a\u00020\u001a\u0012\b\b\u0002\u0010l\u001a\u00020)¢\u0006\u0004\bm\u0010{B.\u0012\u0006\u0010D\u001a\u00020C\u0012\u0006\u0010}\u001a\u00020|\u0012\b\b\u0002\u0010H\u001a\u00020\u001a\u0012\b\b\u0002\u0010l\u001a\u00020)ø\u0001\u0001¢\u0006\u0004\bm\u0010~B^\b\u0016\u0012\u0006\u0010k\u001a\u00020h\u0012\u0006\u0010p\u001a\u00020o\u0012\u0006\u0010}\u001a\u00020|\u0012\u0006\u0010u\u001a\u00020t\u0012\u0006\u0010z\u001a\u00020y\u0012\u0014\b\u0002\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0q0X\u0012\b\b\u0002\u0010H\u001a\u00020\u001a\u0012\b\b\u0002\u0010l\u001a\u00020)ø\u0001\u0001¢\u0006\u0004\bm\u0010\u007fJ=\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJU\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J]\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0016J\u001b\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u000e\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001aJ\u0016\u0010+\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)J\u000e\u0010-\u001a\u00020,2\u0006\u0010&\u001a\u00020\u001aJ\u000e\u0010.\u001a\u00020,2\u0006\u0010&\u001a\u00020\u001aJ\u001e\u00102\u001a\u00020/2\u0006\u0010&\u001a\u00020\u001aø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u000e\u00103\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001aJ\u000e\u00104\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aJ\u000e\u00106\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u00107\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u00109\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u0010:\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u0010;\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u001aJ\u000e\u0010<\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001aJ\u0018\u0010>\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a2\b\b\u0002\u0010=\u001a\u00020)J\u000e\u0010?\u001a\u00020)2\u0006\u00105\u001a\u00020\u001aJ\u0010\u0010@\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u001aH\u0002J\u0010\u0010A\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u001aH\u0002J\u0010\u0010B\u001a\u00020\n2\u0006\u00105\u001a\u00020\u001aH\u0002R\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010H\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010L\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010P\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010T\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010SR\u0017\u0010V\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bV\u0010I\u001a\u0004\bW\u0010KR\u001f\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010^\u001a\b\u0012\u0004\u0012\u00020]0X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010Z\u001a\u0004\b_\u0010\\R\u0011\u0010a\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b`\u0010SR\u0011\u0010c\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bb\u0010SR\u0011\u0010e\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bd\u0010SR\u0011\u0010g\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bf\u0010SR\u0014\u0010k\u001a\u00020h8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0080\u0001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "Lkotlin/j;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "vertical", "getLineForVerticalPosition", "Landroidx/compose/ui/geometry/Offset;", "position", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "", "usePrimaryDirection", "getHorizontalPosition", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "getBidiRunDirection", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "lineIndex", "getLineLeft", "getLineRight", "getLineTop", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "visibleEnd", "getLineEnd", "isLineEllipsized", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "maxLines", "I", "getMaxLines", "()I", "didExceedMaxLines", "Z", "getDidExceedMaxLines", "()Z", "width", "F", "getWidth", "()F", "height", "getHeight", "lineCount", "getLineCount", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "getParagraphInfoList$ui_text_release", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "ellipsis", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i2, z);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        return multiParagraph.getLineEnd(i2, z);
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m4685paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = Color.INSTANCE.m2854getUnspecified0d7_KjU();
        }
        multiParagraph.m4690paintRPmYEkk(canvas, j, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration);
    }

    private final void requireIndexInRange(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 < getAnnotatedString().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbG = androidx.appcompat.view.menu.a.g("offset(", i2, ") is out of bounds [0, ");
        sbG.append(getAnnotatedString().length());
        sbG.append(')');
        throw new IllegalArgumentException(sbG.toString().toString());
    }

    private final void requireIndexInRangeInclusiveEnd(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= getAnnotatedString().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbG = androidx.appcompat.view.menu.a.g("offset(", i2, ") is out of bounds [0, ");
        sbG.append(getAnnotatedString().length());
        sbG.append(']');
        throw new IllegalArgumentException(sbG.toString().toString());
    }

    private final void requireLineIndexInRange(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 < this.lineCount) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(android.support.v4.media.a.f(androidx.appcompat.view.menu.a.g("lineIndex(", i2, ") is out of bounds [0, "), this.lineCount, ')').toString());
        }
    }

    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? f.I(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    public final Rect getBoundingBox(int offset) {
        requireIndexInRange(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
    }

    public final Rect getCursorRect(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? f.I(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(offset)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? f.I(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) y.z1(this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(lineIndex), visibleEnd));
    }

    public final int getLineForOffset(int offset) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset >= getAnnotatedString().length() ? f.I(this.paragraphInfoList) : offset < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(offset)));
    }

    public final int getLineForVerticalPosition(float vertical) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(vertical <= 0.0f ? 0 : vertical >= this.height ? f.I(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical));
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(vertical)));
    }

    public final float getLineHeight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineLeft(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineRight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final int getLineStart(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineTop(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineWidth(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m4687getOffsetForPositionk4lQ0M(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(Offset.m2586getYimpl(position) <= 0.0f ? 0 : Offset.m2586getYimpl(position) >= this.height ? f.I(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m2586getYimpl(position)));
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo4658getOffsetForPositionk4lQ0M(paragraphInfo.m4695toLocalMKHz9U(position)));
    }

    public final ResolvedTextDirection getParagraphDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? f.I(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    public final Path getPathForRange(int start, int end) {
        if (!((start >= 0 && start <= end) && end <= getAnnotatedString().getText().length())) {
            StringBuilder sbF = androidx.compose.animation.a.f("Start(", start, ") or End(", end, ") is out of range [0..");
            sbF.append(getAnnotatedString().getText().length());
            sbF.append("), or start > end!");
            throw new IllegalArgumentException(sbF.toString().toString());
        }
        if (start == end) {
            return AndroidPath_androidKt.Path();
        }
        Path Path = AndroidPath_androidKt.Path();
        int size = this.paragraphInfoList.size();
        for (int iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, start); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= end) {
                break;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                androidx.compose.ui.graphics.f.c(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(start), paragraphInfo.toLocalIndex(end))), 0L, 2, null);
            }
        }
        return Path;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m4688getWordBoundaryjx7JFs(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? f.I(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.m4694toGlobalGEjPoXI(paragraphInfo.getParagraph().mo4659getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)));
    }

    public final boolean isLineEllipsized(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex)).getParagraph().isLineEllipsized(lineIndex);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public final void m4689paintLG529CI(Canvas canvas, long color, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        m.h(canvas, "canvas");
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = list.get(i2);
            paragraphInfo.getParagraph().mo4660paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public final void m4690paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration decoration) {
        m.h(canvas, "canvas");
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ParagraphInfo paragraphInfo = list.get(i2);
            paragraphInfo.getParagraph().mo4661paintRPmYEkk(canvas, color, shadow, decoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m4691painthn5TExg(Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        m.h(canvas, "canvas");
        m.h(brush, "brush");
        AndroidMultiParagraphDrawKt.m5027drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, i2, z);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i2, boolean z) {
        boolean z2;
        int iM5234getMaxHeightimpl;
        int i3;
        Paragraph paragraphM4698Paragraph_EkL_Y;
        float height;
        int lineCount;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i2;
        if (Constraints.m5237getMinWidthimpl(j) == 0 && Constraints.m5236getMinHeightimpl(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
            int size = infoList$ui_text_release.size();
            float f = 0.0f;
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i4);
                ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
                int iM5235getMaxWidthimpl = Constraints.m5235getMaxWidthimpl(j);
                if (Constraints.m5230getHasBoundedHeightimpl(j)) {
                    iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(j) - ParagraphKt.ceilToInt(f);
                    i3 = iM5234getMaxHeightimpl < 0 ? 0 : i3;
                    paragraphM4698Paragraph_EkL_Y = ParagraphKt.m4698Paragraph_EkL_Y(intrinsics, ConstraintsKt.Constraints$default(0, iM5235getMaxWidthimpl, 0, i3, 5, null), this.maxLines - i5, z);
                    height = paragraphM4698Paragraph_EkL_Y.getHeight() + f;
                    lineCount = paragraphM4698Paragraph_EkL_Y.getLineCount() + i5;
                    arrayList.add(new ParagraphInfo(paragraphM4698Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i5, lineCount, f, height));
                    if (!paragraphM4698Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.maxLines && i4 != f.I(this.intrinsics.getInfoList$ui_text_release()))) {
                        i5 = lineCount;
                        f = height;
                        z2 = true;
                        break;
                    } else {
                        i4++;
                        i5 = lineCount;
                        f = height;
                    }
                } else {
                    iM5234getMaxHeightimpl = Constraints.m5234getMaxHeightimpl(j);
                }
                i3 = iM5234getMaxHeightimpl;
                paragraphM4698Paragraph_EkL_Y = ParagraphKt.m4698Paragraph_EkL_Y(intrinsics, ConstraintsKt.Constraints$default(0, iM5235getMaxWidthimpl, 0, i3, 5, null), this.maxLines - i5, z);
                height = paragraphM4698Paragraph_EkL_Y.getHeight() + f;
                lineCount = paragraphM4698Paragraph_EkL_Y.getLineCount() + i5;
                arrayList.add(new ParagraphInfo(paragraphM4698Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i5, lineCount, f, height));
                if (paragraphM4698Paragraph_EkL_Y.getDidExceedMaxLines()) {
                }
                i5 = lineCount;
                f = height;
                z2 = true;
                break;
            }
            z2 = false;
            this.height = f;
            this.lineCount = i5;
            this.didExceedMaxLines = z2;
            this.paragraphInfoList = arrayList;
            this.width = Constraints.m5235getMaxWidthimpl(j);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i6);
                List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
                ArrayList arrayList3 = new ArrayList(placeholderRects.size());
                int size3 = placeholderRects.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    Rect rect = placeholderRects.get(i7);
                    arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
                }
                u.Y0(arrayList3, arrayList2);
            }
            if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
                int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i8 = 0; i8 < size4; i8++) {
                    arrayList4.add(null);
                }
                arrayList2 = y.F1(arrayList4, arrayList2);
            }
            this.placeholderRects = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j, (i3 & 4) != 0 ? Integer.MAX_VALUE : i2, (i3 & 8) != 0 ? false : z, null);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List list, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i3 & 32) != 0 ? EmptyList.INSTANCE : list), (i3 & 64) != 0 ? Integer.MAX_VALUE : i2, (i3 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? false : z);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List list, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j, density, resolver, (i3 & 32) != 0 ? EmptyList.INSTANCE : list, (i3 & 64) != 0 ? Integer.MAX_VALUE : i2, (i3 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? false : z, null);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i2, boolean z, float f, Density density, Font.ResourceLoader resourceLoader, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i3 & 4) != 0 ? EmptyList.INSTANCE : list), (i3 & 8) != 0 ? Integer.MAX_VALUE : i2, (i3 & 16) != 0 ? false : z, f, density, resourceLoader);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i2, boolean z, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2, (i3 & 4) != 0 ? false : z, f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i2, boolean z, float f) {
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i2, z, null);
        m.h(multiParagraphIntrinsics, "intrinsics");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z, float f, Density density, Font.ResourceLoader resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader)), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i2, z, null);
        m.h(annotatedString, "annotatedString");
        m.h(textStyle, "style");
        m.h(list, "placeholders");
        m.h(density, "density");
        m.h(resourceLoader, "resourceLoader");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i2, z, null);
        m.h(annotatedString, "annotatedString");
        m.h(textStyle, "style");
        m.h(density, "density");
        m.h(resolver, "fontFamilyResolver");
        m.h(list, "placeholders");
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j, i2, z, null);
    }
}
