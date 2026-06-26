package androidx.compose.ui.graphics.colorspace;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.widget.NestedScrollView;
import androidx.media3.common.Format;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.RandomTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.LiveTrackingClient;
import com.mapbox.common.location.compat.LocationEngineImpl;
import com.mapbox.maps.QueryFeaturesCallback;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.maps.plugin.locationcomponent.PuckLocatedAtPointListener;
import e1.a;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import jp.co.yahoo.android.apps.transit.ui.view.diainfo.SliderView;
import l7.u3;
import q8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class k implements DoubleFunction, ListenerSet.Event, com.google.common.util.concurrent.d, ExtractorsFactory, TrackSelectionUtil.AdaptiveTrackSelectionFactory, a.a, AnalyticsEventLogger, g4.c, Expected.Action, QueryFeaturesCallback, SliderView.b, NestedScrollView.OnScrollChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i2) {
        this.f145a = i2;
        this.b = obj;
    }

    public final ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        return RandomTrackSelection.Factory.a((RandomTrackSelection.Factory) this.b, definition);
    }

    public final Extractor[] createExtractors() {
        return DefaultMediaSourceFactory.a((Format) this.b);
    }

    public final Object execute() {
        ((c1.g) this.b).i.a();
        return null;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb.eotfFunc$lambda$1((Rgb) this.b, d);
    }

    public final void logEvent(String str, Bundle bundle) {
        AnalyticsDeferredProxy.b((AnalyticsDeferredProxy) this.b, str, bundle);
    }

    public final void onScrollChange(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
        jp.co.yahoo.android.apps.transit.ui.fragment.navi.d dVar = ((a2) this.b).a;
        u3 u3Var = dVar.Q;
        u3Var.z.onScrollChange(u3Var.s);
        dVar.Q.n.d(nestedScrollView, dVar.P);
    }

    public final void run(Expected expected) {
        LocationComponentPluginImpl.b((PuckLocatedAtPointListener) this.b, expected);
    }

    public final Object then(g4.i iVar) {
        return Utils.c((CountDownLatch) this.b, iVar);
    }

    public final /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return androidx.media3.extractor.b.a(this, uri, map);
    }

    public final void invoke(Object obj) {
        int i2 = this.f145a;
        Object obj2 = this.b;
        switch (i2) {
            case 1:
                SimpleBasePlayer.R((MediaMetadata) obj2, (Player.Listener) obj);
                break;
            default:
                DefaultAnalyticsCollector.o0((AnalyticsListener.EventTime) obj2, (AnalyticsListener) obj);
                break;
        }
    }

    public final void run(Object obj) {
        LocationEngineImpl.a((LocationEngineImpl) this.b, (LiveTrackingClient) obj);
    }
}
