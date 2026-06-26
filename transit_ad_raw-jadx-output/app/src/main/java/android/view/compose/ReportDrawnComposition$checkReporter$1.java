package android.view.compose;

import androidx.appcompat.R;
import kj.a;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends FunctionReferenceImpl implements l<a<? extends Boolean>, j> {
    public ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a<Boolean>) obj);
        return j.a;
    }

    public final void invoke(a<Boolean> aVar) {
        m.h(aVar, "p0");
        ((ReportDrawnComposition) ((CallableReference) this).receiver).observeReporter(aVar);
    }
}
