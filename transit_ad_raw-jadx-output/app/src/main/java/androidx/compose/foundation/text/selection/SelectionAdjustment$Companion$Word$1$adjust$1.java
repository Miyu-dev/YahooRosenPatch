package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SelectionAdjustment.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public /* synthetic */ class SelectionAdjustment$Companion$Word$1$adjust$1 extends FunctionReferenceImpl implements l<Integer, TextRange> {
    public SelectionAdjustment$Companion$Word$1$adjust$1(Object obj) {
        super(1, obj, TextLayoutResult.class, "getWordBoundary", "getWordBoundary--jx7JFs(I)J", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return TextRange.m4799boximpl(m930invokejx7JFs(((Number) obj).intValue()));
    }

    /* JADX INFO: renamed from: invoke--jx7JFs, reason: not valid java name */
    public final long m930invokejx7JFs(int i2) {
        return ((TextLayoutResult) ((CallableReference) this).receiver).m4785getWordBoundaryjx7JFs(i2);
    }
}
