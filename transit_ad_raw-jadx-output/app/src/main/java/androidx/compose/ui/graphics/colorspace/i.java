package androidx.compose.ui.graphics.colorspace;

import android.location.Location;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class i implements DoubleFunction, vk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj.l f143a;

    public /* synthetic */ i(kj.l lVar) {
        this.f143a = lVar;
    }

    public final Object a(Object obj) {
        kj.l lVar = this.f143a;
        kotlin.jvm.internal.m.h(lVar, "$tmp0");
        return (Location) lVar.invoke(obj);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$3(this.f143a, d);
    }
}
