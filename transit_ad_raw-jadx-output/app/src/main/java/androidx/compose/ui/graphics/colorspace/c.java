package androidx.compose.ui.graphics.colorspace;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class c implements DoubleFunction, lb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj.l f137a;

    public /* synthetic */ c(kj.l lVar) {
        this.f137a = lVar;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$4(this.f137a, d);
    }

    public final void onResult(boolean z) {
        kj.l lVar = this.f137a;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }
}
