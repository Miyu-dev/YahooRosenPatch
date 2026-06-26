package androidx.compose.ui.graphics.colorspace;

import android.text.TextUtils;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.ExtractorsFactory;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import e1.a;
import h9.a;
import h9.w;
import java.util.HashMap;
import jp.co.yahoo.android.apps.transit.ui.activity.navi.RailmapActivity;
import jp.co.yahoo.android.apps.transit.ui.view.SettingAddressView;
import r8.p;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class l implements DoubleFunction, ProgressiveMediaExtractor.Factory, a.a, Deferred.DeferredHandler, g4.c, w.c, a.a, mf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i2) {
        this.f146a = i2;
        this.b = obj;
    }

    public final ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return ProgressiveMediaSource.Factory.a((ExtractorsFactory) this.b, playerId);
    }

    public final void d(HashMap map) {
        SettingAddressView settingAddressView = (SettingAddressView) this.b;
        int i2 = SettingAddressView.d;
        kotlin.jvm.internal.m.h(settingAddressView, "this$0");
        String str = (String) map.get("address");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        settingAddressView.a.d.setText(str);
    }

    public final void e(int i2) {
        int i3 = this.f146a;
        Object obj = this.b;
        switch (i3) {
            case 6:
                ((RailmapActivity) obj).x = i2;
                break;
            default:
                p pVar = (p) obj;
                int i4 = p.t0;
                kotlin.jvm.internal.m.h(pVar, "this$0");
                pVar.k0 = i2;
                break;
        }
    }

    public final Object execute() {
        return Integer.valueOf(((d1.d) this.b).h());
    }

    public final void handle(Provider provider) {
        AnalyticsDeferredProxy.a((AnalyticsDeferredProxy) this.b, provider);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$6((TransferParameters) this.b, d);
    }

    public final void onAnimationEnd() {
        ((kf.l) this.b).b();
    }

    public final Object then(g4.i iVar) {
        return Utils.a((g4.j) this.b, iVar);
    }
}
