package androidx.compose.ui.graphics.colorspace;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.SnapshotCompleteCallback;
import com.mapbox.maps.Snapshotter;
import d1.o;
import e1.a;
import h9.a;
import h9.k0;
import h9.w;
import java.util.HashMap;
import jp.co.yahoo.android.apps.transit.ad.SearchResultListBottomAdView;
import jp.co.yahoo.android.apps.transit.ui.activity.navi.RailmapActivity;
import jp.co.yahoo.android.apps.transit.ui.fragment.input.InputAddressFragment;
import jp.co.yahoo.android.apps.transit.ui.view.diainfo.CgmView;
import jp.co.yahoo.android.apps.transit.util.d;
import jp.co.yahoo.android.maps.place.presentation.poiend.PoiEndFragment;
import kf.o;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class n implements DoubleFunction, InputConnectionCompat.OnCommitContentListener, ListenerSet.IterationFinishedEvent, ListenerSet.Event, a.a, o.a, Deferred.DeferredHandler, SnapshotCompleteCallback, w.c, a.a, SearchResultListBottomAdView.c, d.h, lb.a, ng.j, o.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f148a;

    public /* synthetic */ n(Object obj) {
        this.f148a = obj;
    }

    public final void a() {
        ((kf.l) this.f148a).h.getSharedPreferences("pref_voice_ui", 0);
    }

    public final Object apply(Object obj) {
        d1.o oVar = (d1.o) this.f148a;
        Cursor cursor = (Cursor) obj;
        t0.b bVar = d1.o.f;
        oVar.getClass();
        while (cursor.moveToNext()) {
            oVar.d(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public final void b(String str) {
        CgmView cgmView = (CgmView) this.f148a;
        HashMap map = CgmView.h;
        cgmView.getClass();
        cgmView.f.P.setText(str.isEmpty() ? k0.m(2131886657) : String.format("%s %s %s", str, k0.m(2131888004), k0.m(2131886657)));
    }

    public final void d(HashMap map) {
        InputAddressFragment inputAddressFragment = (InputAddressFragment) this.f148a;
        int i2 = InputAddressFragment.h;
        kotlin.jvm.internal.m.h(inputAddressFragment, "this$0");
        inputAddressFragment.k(map);
    }

    public final void e(int i2) {
        ((RailmapActivity) this.f148a).x = i2;
    }

    public final Object execute() {
        return ((d1.c) this.f148a).c();
    }

    public final void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.a((CrashlyticsNativeComponentDeferredProxy) this.f148a, provider);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$8((TransferParameters) this.f148a, d);
    }

    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle) {
        return InputConnectionCompat.a((View) this.f148a, inputContentInfoCompat, i2, bundle);
    }

    public final void onResult(boolean z) {
        PoiEndFragment poiEndFragment = (PoiEndFragment) this.f148a;
        int i2 = PoiEndFragment.k;
        kotlin.jvm.internal.m.h(poiEndFragment, "this$0");
        LifecycleOwnerKt.getLifecycleScope(poiEndFragment).launchWhenStarted(new jp.co.yahoo.android.maps.place.presentation.poiend.g(z, poiEndFragment, (dj.c) null));
    }

    public final void run(Expected expected) {
        Snapshotter.a((Snapshotter) this.f148a, expected);
    }

    public final void invoke(Object obj) {
        DefaultAnalyticsCollector.l((AnalyticsListener.EventTime) this.f148a, (AnalyticsListener) obj);
    }

    public final void invoke(Object obj, FlagSet flagSet) {
        SimpleBasePlayer.a0((SimpleBasePlayer) this.f148a, (Player.Listener) obj, flagSet);
    }
}
