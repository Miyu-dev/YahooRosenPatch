package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kj.l;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: TextFieldDelegate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate;", "", "()V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TextFieldDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: TextFieldDelegate.kt */
    @Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJK\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ7\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010$\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\"\u0010#JC\u0010/\u001a\u00020\u00182\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010)\u001a\u00020(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180*2\b\u0010,\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\b-\u0010.JI\u00105\u001a\u00020\u00182\u0006\u00101\u001a\u0002002\u0006\u0010\u0015\u001a\u0002022\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180*H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104JZ\u0010>\u001a\u00020\u001e2\u0006\u00107\u001a\u0002062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(2\u0006\u00109\u001a\u0002082\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180*2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00180*H\u0001ø\u0001\u0001¢\u0006\u0004\b<\u0010=JZ\u0010@\u001a\u00020\u001e2\u0006\u00107\u001a\u0002062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(2\u0006\u00109\u001a\u0002082\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180*2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00180*H\u0001ø\u0001\u0001¢\u0006\u0004\b?\u0010=J3\u0010C\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180*H\u0001¢\u0006\u0004\bA\u0010BJ#\u0010J\u001a\u00020F2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006M"}, d2 = {"Landroidx/compose/foundation/text/TextFieldDelegate$Companion;", "", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/TextLayoutResult;", "prevResultText", "Lkotlin/Triple;", "", "layout-_EkL_-Y$foundation_release", "(Landroidx/compose/foundation/text/TextDelegate;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextLayoutResult;)Lkotlin/Triple;", "layout", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "textLayoutResult", "Landroidx/compose/ui/graphics/Paint;", "selectionPaint", "Lkotlin/j;", "draw$foundation_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Paint;)V", "draw", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/text/input/TextInputSession;", "textInputSession", "", "hasFocus", "notifyFocusedRect$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/text/input/TextInputSession;ZLandroidx/compose/ui/text/input/OffsetMapping;)V", "notifyFocusedRect", "", "Landroidx/compose/ui/text/input/EditCommand;", "ops", "Landroidx/compose/ui/text/input/EditProcessor;", "editProcessor", "Lkotlin/Function1;", "onValueChange", "session", "onEditCommand$foundation_release", "(Ljava/util/List;Landroidx/compose/ui/text/input/EditProcessor;Lkj/l;Landroidx/compose/ui/text/input/TextInputSession;)V", "onEditCommand", "Landroidx/compose/ui/geometry/Offset;", "position", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setCursorOffset-ULxng0E$foundation_release", "(JLandroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/OffsetMapping;Lkj/l;)V", "setCursorOffset", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "restartInput$foundation_release", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/EditProcessor;Landroidx/compose/ui/text/input/ImeOptions;Lkj/l;Lkj/l;)Landroidx/compose/ui/text/input/TextInputSession;", "restartInput", "onFocus$foundation_release", "onFocus", "onBlur$foundation_release", "(Landroidx/compose/ui/text/input/TextInputSession;Landroidx/compose/ui/text/input/EditProcessor;Lkj/l;)V", "onBlur", "Landroidx/compose/ui/text/TextRange;", "compositionRange", "Landroidx/compose/ui/text/input/TransformedText;", "transformed", "applyCompositionDecoration-72CqOWE", "(JLandroidx/compose/ui/text/input/TransformedText;)Landroidx/compose/ui/text/input/TransformedText;", "applyCompositionDecoration", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release$default, reason: not valid java name */
        public static /* synthetic */ Triple m876layout_EkL_Y$foundation_release$default(Companion companion, TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m878layout_EkL_Y$foundation_release(textDelegate, j, layoutDirection, textLayoutResult);
        }

        /* JADX INFO: renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m877applyCompositionDecoration72CqOWE(long compositionRange, TransformedText transformed) {
            m.h(transformed, "transformed");
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformed.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, 12287, (DefaultConstructorMarker) null), transformed.getOffsetMapping().originalToTransformed(TextRange.m4811getStartimpl(compositionRange)), transformed.getOffsetMapping().originalToTransformed(TextRange.m4806getEndimpl(compositionRange)));
            return new TransformedText(builder.toAnnotatedString(), transformed.getOffsetMapping());
        }

        public final void draw$foundation_release(Canvas canvas, TextFieldValue value, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint selectionPaint) {
            int iOriginalToTransformed;
            int iOriginalToTransformed2;
            m.h(canvas, "canvas");
            m.h(value, "value");
            m.h(offsetMapping, "offsetMapping");
            m.h(textLayoutResult, "textLayoutResult");
            m.h(selectionPaint, "selectionPaint");
            if (!TextRange.m4805getCollapsedimpl(value.getSelection()) && (iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m4809getMinimpl(value.getSelection()))) != (iOriginalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m4808getMaximpl(value.getSelection())))) {
                canvas.drawPath(textLayoutResult.getPathForRange(iOriginalToTransformed, iOriginalToTransformed2), selectionPaint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        /* JADX INFO: renamed from: layout-_EkL_-Y$foundation_release, reason: not valid java name */
        public final Triple<Integer, Integer, TextLayoutResult> m878layout_EkL_Y$foundation_release(TextDelegate textDelegate, long constraints, LayoutDirection layoutDirection, TextLayoutResult prevResultText) {
            m.h(textDelegate, "textDelegate");
            m.h(layoutDirection, "layoutDirection");
            TextLayoutResult textLayoutResultM873layoutNN6EwU = textDelegate.m873layoutNN6EwU(constraints, layoutDirection, prevResultText);
            return new Triple<>(Integer.valueOf(IntSize.m5427getWidthimpl(textLayoutResultM873layoutNN6EwU.getSize())), Integer.valueOf(IntSize.m5426getHeightimpl(textLayoutResultM873layoutNN6EwU.getSize())), textLayoutResultM873layoutNN6EwU);
        }

        public final void notifyFocusedRect$foundation_release(TextFieldValue value, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean hasFocus, OffsetMapping offsetMapping) {
            m.h(value, "value");
            m.h(textDelegate, "textDelegate");
            m.h(textLayoutResult, "textLayoutResult");
            m.h(layoutCoordinates, "layoutCoordinates");
            m.h(textInputSession, "textInputSession");
            m.h(offsetMapping, "offsetMapping");
            if (hasFocus) {
                int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m4808getMaximpl(value.getSelection()));
                Rect boundingBox = iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length() ? textLayoutResult.getBoundingBox(iOriginalToTransformed) : iOriginalToTransformed != 0 ? textLayoutResult.getBoundingBox(iOriginalToTransformed - 1) : new Rect(0.0f, 0.0f, 1.0f, IntSize.m5426getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
                long jMo4241localToRootMKHz9U = layoutCoordinates.mo4241localToRootMKHz9U(OffsetKt.Offset(boundingBox.getLeft(), boundingBox.getTop()));
                textInputSession.notifyFocusedRect(RectKt.m2625Recttz77jQw(OffsetKt.Offset(Offset.m2585getXimpl(jMo4241localToRootMKHz9U), Offset.m2586getYimpl(jMo4241localToRootMKHz9U)), SizeKt.Size(boundingBox.getWidth(), boundingBox.getHeight())));
            }
        }

        public final void onBlur$foundation_release(TextInputSession textInputSession, EditProcessor editProcessor, l<? super TextFieldValue, j> onValueChange) {
            m.h(textInputSession, "textInputSession");
            m.h(editProcessor, "editProcessor");
            m.h(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m5015copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        public final void onEditCommand$foundation_release(List<? extends EditCommand> ops, EditProcessor editProcessor, l<? super TextFieldValue, j> onValueChange, TextInputSession session) {
            m.h(ops, "ops");
            m.h(editProcessor, "editProcessor");
            m.h(onValueChange, "onValueChange");
            TextFieldValue textFieldValueApply = editProcessor.apply(ops);
            if (session != null) {
                session.updateState(null, textFieldValueApply);
            }
            onValueChange.invoke(textFieldValueApply);
        }

        public final TextInputSession onFocus$foundation_release(TextInputService textInputService, TextFieldValue value, EditProcessor editProcessor, ImeOptions imeOptions, l<? super TextFieldValue, j> onValueChange, l<? super ImeAction, j> onImeActionPerformed) {
            m.h(textInputService, "textInputService");
            m.h(value, "value");
            m.h(editProcessor, "editProcessor");
            m.h(imeOptions, "imeOptions");
            m.h(onValueChange, "onValueChange");
            m.h(onImeActionPerformed, "onImeActionPerformed");
            return restartInput$foundation_release(textInputService, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
        }

        public final TextInputSession restartInput$foundation_release(TextInputService textInputService, TextFieldValue value, final EditProcessor editProcessor, ImeOptions imeOptions, final l<? super TextFieldValue, j> onValueChange, l<? super ImeAction, j> onImeActionPerformed) {
            m.h(textInputService, "textInputService");
            m.h(value, "value");
            m.h(editProcessor, "editProcessor");
            m.h(imeOptions, "imeOptions");
            m.h(onValueChange, "onValueChange");
            m.h(onImeActionPerformed, "onImeActionPerformed");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            TextInputSession textInputSessionStartInput = textInputService.startInput(value, imeOptions, new l<List<? extends EditCommand>, j>() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<? extends EditCommand>) obj);
                    return j.a;
                }

                public final void invoke(List<? extends EditCommand> list) {
                    m.h(list, "it");
                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(list, editProcessor, onValueChange, (TextInputSession) objectRef.element);
                }
            }, onImeActionPerformed);
            objectRef.element = textInputSessionStartInput;
            return textInputSessionStartInput;
        }

        /* JADX INFO: renamed from: setCursorOffset-ULxng0E$foundation_release, reason: not valid java name */
        public final void m879setCursorOffsetULxng0E$foundation_release(long position, TextLayoutResultProxy textLayoutResult, EditProcessor editProcessor, OffsetMapping offsetMapping, l<? super TextFieldValue, j> onValueChange) {
            m.h(textLayoutResult, "textLayoutResult");
            m.h(editProcessor, "editProcessor");
            m.h(offsetMapping, "offsetMapping");
            m.h(onValueChange, "onValueChange");
            onValueChange.invoke(TextFieldValue.m5015copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m901getOffsetForPosition3MmeM6k$default(textLayoutResult, position, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        private Companion() {
        }
    }
}
