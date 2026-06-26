package androidx.compose.ui.graphics.colorspace;

import android.content.Context;
import android.view.Display;
import androidx.fragment.app.FragmentResultListener;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.offline.ProgressiveDownloader;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;
import androidx.media3.exoplayer.video.VideoFrameReleaseHelper;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.LocationClientStartStopCallback;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.compat.LocationEngineCallback;
import com.mapbox.common.location.compat.LocationEngineImpl;
import e1.a;
import h9.w;
import java.util.Iterator;
import jp.co.yahoo.android.apps.transit.ui.activity.InputActivity;
import jp.co.yahoo.android.apps.transit.ui.activity.MapDisplayActivity;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.TimeTableTopFragment;
import jp.co.yahoo.android.voice.ui.internal.view.RevealAnimationLayout;
import jp.co.yahoo.customlogpv.YJPvSharedBCookieListener;
import w7.a;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class j implements DoubleFunction, ListenerSet.Event, RequirementsWatcher.Listener, CacheWriter.ProgressListener, VideoFrameReleaseHelper.DisplayHelper.Listener, a.a, BreadcrumbSource, g4.c, LocationClientStartStopCallback, Expected.Action, w.c, a.a, vk.c, YJPvSharedBCookieListener, mf.g, FragmentResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i2) {
        this.f144a = i2;
        this.b = obj;
    }

    public Object a(Object obj) {
        kj.l lVar = (kj.l) this.b;
        int i2 = TimeTableTopFragment.y;
        kotlin.jvm.internal.m.h(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    public void e(int i2) {
        int i3 = this.f144a;
        Object obj = this.b;
        switch (i3) {
            case 11:
                InputActivity inputActivity = (InputActivity) obj;
                int[] iArr = InputActivity.S;
                kotlin.jvm.internal.m.h(inputActivity, "this$0");
                inputActivity.l = i2;
                if (i2 == -3) {
                    inputActivity.finish();
                }
                break;
            default:
                MapDisplayActivity mapDisplayActivity = (MapDisplayActivity) obj;
                int i4 = MapDisplayActivity.m;
                kotlin.jvm.internal.m.h(mapDisplayActivity, "this$0");
                mapDisplayActivity.j = i2;
                break;
        }
    }

    public Object execute() {
        c1.i iVar = (c1.i) this.b;
        Iterator it = iVar.b.s().iterator();
        while (it.hasNext()) {
            iVar.c.a((w0.m) it.next(), 1);
        }
        return null;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        return Rgb.oetfFunc$lambda$0((Rgb) this.b, d);
    }

    public void onAnimationEnd() {
        kf.l lVar = (kf.l) this.b;
        kf.o oVar = lVar.b;
        if (oVar != null && oVar.e()) {
            kf.o oVarD = lVar.d();
            l lVar2 = new l(lVar, 9);
            RevealAnimationLayout revealAnimationLayout = oVarD.d;
            revealAnimationLayout.getClass();
            revealAnimationLayout.a(new k.b(10, revealAnimationLayout, lVar2));
            kf.o oVar2 = lVar.b;
            if (oVar2 != null) {
                oVar2.o();
            }
            lVar.a();
        }
    }

    public void onDefaultDisplayChanged(Display display) {
        VideoFrameReleaseHelper.a((VideoFrameReleaseHelper) this.b, display);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFragmentResult(java.lang.String r8, android.os.Bundle r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.j.onFragmentResult(java.lang.String, android.os.Bundle):void");
    }

    public void onProgress(long j, long j2, long j3) {
        ProgressiveDownloader.a((ProgressiveDownloader) this.b, j, j2, j3);
    }

    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i2) {
        DownloadManager.b((DownloadManager) this.b, requirementsWatcher, i2);
    }

    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        AnalyticsDeferredProxy.c((AnalyticsDeferredProxy) this.b, breadcrumbHandler);
    }

    public void run(LocationError locationError) {
        LocationEngineImpl.b((LocationEngineCallback) this.b, locationError);
    }

    public void sharedBCookieSaved(String str, long j) {
        Context context = (Context) this.b;
        jp.co.yahoo.android.customlog.h.n("Issued a new AppSharedId: " + str + " Timestamp: " + j);
        jp.co.yahoo.android.customlog.h.m(context);
    }

    public Object then(g4.i iVar) {
        return Boolean.valueOf(SessionReportingCoordinator.a((SessionReportingCoordinator) this.b, iVar));
    }

    public void invoke(Object obj) {
        int i2 = this.f144a;
        Object obj2 = this.b;
        switch (i2) {
            case 1:
                SimpleBasePlayer.x((Tracks) obj2, (Player.Listener) obj);
                break;
            default:
                DefaultAnalyticsCollector.e0((AnalyticsListener.EventTime) obj2, (AnalyticsListener) obj);
                break;
        }
    }

    public void run(Object obj) {
        LocationEngineImpl.liveTrackingObserver.1.b((LocationEngineImpl) this.b, (LocationError) obj);
    }
}
