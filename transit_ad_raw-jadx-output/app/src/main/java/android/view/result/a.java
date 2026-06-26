package android.view.result;

import g4.g;
import jp.co.yahoo.android.apps.transit.geofence.GeoFenceManager;
import kj.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a implements ActivityResultCallback, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f112a;

    public /* synthetic */ a(l lVar) {
        this.f112a = lVar;
    }

    @Override // android.view.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ActivityResultCallerKt.registerForActivityResult$lambda$1(this.f112a, obj);
    }

    public void onSuccess(Object obj) {
        int i2 = GeoFenceManager.a;
        l lVar = this.f112a;
        m.h(lVar, "$tmp0");
        lVar.invoke(obj);
    }
}
