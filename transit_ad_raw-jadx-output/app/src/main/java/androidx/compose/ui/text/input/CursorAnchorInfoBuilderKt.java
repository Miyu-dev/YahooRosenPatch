package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: CursorAnchorInfoBuilder.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"build", "Landroid/view/inputmethod/CursorAnchorInfo;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "matrix", "Landroid/graphics/Matrix;", "setInsertionMarker", "selectionStart", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CursorAnchorInfoBuilderKt {
    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, TextLayoutResult textLayoutResult, Matrix matrix) {
        m.h(builder, "<this>");
        m.h(textFieldValue, "textFieldValue");
        m.h(textLayoutResult, "textLayoutResult");
        m.h(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int iM4809getMinimpl = TextRange.m4809getMinimpl(textFieldValue.getSelection());
        builder.setSelectionRange(iM4809getMinimpl, TextRange.m4808getMaximpl(textFieldValue.getSelection()));
        setInsertionMarker(builder, iM4809getMinimpl, textLayoutResult);
        TextRange composition = textFieldValue.getComposition();
        int iM4809getMinimpl2 = composition != null ? TextRange.m4809getMinimpl(composition.getPackedValue()) : -1;
        TextRange composition2 = textFieldValue.getComposition();
        int iM4808getMaximpl = composition2 != null ? TextRange.m4808getMaximpl(composition2.getPackedValue()) : -1;
        boolean z = false;
        if (iM4809getMinimpl2 >= 0 && iM4809getMinimpl2 < iM4808getMaximpl) {
            z = true;
        }
        if (z) {
            builder.setComposingText(iM4809getMinimpl2, textFieldValue.getText().subSequence(iM4809getMinimpl2, iM4808getMaximpl));
        }
        CursorAnchorInfo cursorAnchorInfoBuild = builder.build();
        m.g(cursorAnchorInfoBuild, "build()");
        return cursorAnchorInfoBuild;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i2, TextLayoutResult textLayoutResult) {
        if (i2 < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i2);
        builder.setInsertionMarkerLocation(cursorRect.getLeft(), cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), textLayoutResult.getBidiRunDirection(i2) == ResolvedTextDirection.Rtl ? 4 : 0);
        return builder;
    }
}
