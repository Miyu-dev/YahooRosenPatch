package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.ui.text.TextRange;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public /* synthetic */ class SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1 extends FunctionReferenceImpl implements l<Integer, TextRange> {
    public SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(Object obj) {
        super(1, obj, StringHelpersKt.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TextRange.m4799boximpl(m929invokejx7JFs(((Number) obj).intValue()));
    }

    /* JADX INFO: renamed from: invoke--jx7JFs, reason: not valid java name */
    public final long m929invokejx7JFs(int i2) {
        return StringHelpersKt.getParagraphBoundary((CharSequence) ((CallableReference) this).receiver, i2);
    }
}
