package androidx.compose.ui.graphics.colorspace;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.QueryFeaturesCallback;
import java.util.HashSet;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class h implements DoubleFunction, QueryFeaturesCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj.l f142a;

    public /* synthetic */ h(kj.l lVar) {
        this.f142a = lVar;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$2(this.f142a, d);
    }

    public final void run(Expected expected) {
        HashSet hashSet = xf.f.n;
        kj.l lVar = this.f142a;
        kotlin.jvm.internal.m.h(lVar, "$onRendered");
        kotlin.jvm.internal.m.h(expected, "it");
        lVar.invoke(expected);
    }
}
