package androidx.compose.material.ripple;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.lifecycle.ComputableLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.room.AutoCloser;
import androidx.room.QueryInterceptorDatabase;
import androidx.room.QueryInterceptorStatement;
import androidx.work.CoroutineWorker;
import bk.f;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.concurrent.CountDownLatch;
import jp.co.yahoo.android.apps.transit.ui.activity.WalkNaviActivity;
import jp.co.yahoo.android.apps.transit.ui.adapter.InputSuggestListAdapter;
import jp.co.yahoo.android.apps.transit.ui.fragment.navi.d;
import jp.co.yahoo.android.apps.transit.ui.fragment.spot.h;
import jp.co.yahoo.android.apps.transit.ui.view.input.InputSuggestView;
import jp.co.yahoo.android.apps.transit.util.LocationTrainManager;
import jp.co.yahoo.android.apps.transit.util.d;
import jp.co.yahoo.android.voice.ui.VoiceConfig;
import jp.co.yahoo.android.voice.ui.internal.view.BeatingView;
import jp.co.yahoo.android.walk.navi.view.YWNaviView;
import kf.c;
import kf.l;
import kf.o;
import kotlin.j;
import kotlin.jvm.internal.m;
import lf.c;
import ni.g;
import q8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f132a = i2;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f132a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                RippleHostView.setRippleState$lambda$2((RippleHostView) obj);
                break;
            case 1:
                ContentLoadingProgressBar.c((ContentLoadingProgressBar) obj);
                break;
            case 2:
                ComputableLiveData.a((ComputableLiveData) obj);
                break;
            case 3:
                SphericalGLSurfaceView.a((SphericalGLSurfaceView) obj);
                break;
            case 4:
                AutoCloser.a((AutoCloser) obj);
                break;
            case 5:
                QueryInterceptorDatabase.i((QueryInterceptorDatabase) obj);
                break;
            case 6:
                QueryInterceptorStatement.f((QueryInterceptorStatement) obj);
                break;
            case 7:
                CoroutineWorker.a((CoroutineWorker) obj);
                break;
            case 8:
                FirebaseMessaging.f((FirebaseMessaging) obj);
                break;
            case 9:
                GesturesPluginImpl.b((GesturesPluginImpl) obj);
                break;
            case 10:
                AnimationThreadController.b((kj.a) obj);
                break;
            case 11:
                WalkNaviActivity walkNaviActivity = (WalkNaviActivity) obj;
                int i3 = WalkNaviActivity.i;
                m.h(walkNaviActivity, "this$0");
                walkNaviActivity.setResult(-1);
                walkNaviActivity.finish();
                break;
            case 12:
                d dVar = (d) obj;
                dVar.Q.s.getViewTreeObserver().addOnGlobalLayoutListener(new a2(dVar));
                break;
            case 13:
                h hVar = (h) obj;
                String str = h.z;
                m.h(hVar, "this$0");
                try {
                    CountDownLatch countDownLatch = hVar.m;
                    if (countDownLatch != null) {
                        countDownLatch.await();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Handler(Looper.getMainLooper()).post(new androidx.core.widget.a(hVar, 7));
                break;
            case 14:
                InputSuggestView inputSuggestView = (InputSuggestView) obj;
                int i4 = InputSuggestView.e;
                m.h(inputSuggestView, "this$0");
                inputSuggestView.a.c.getRoot().setVisibility(8);
                InputSuggestListAdapter inputSuggestListAdapter = inputSuggestView.b;
                if (inputSuggestListAdapter != null) {
                    inputSuggestListAdapter.h = true;
                    inputSuggestListAdapter.notifyDataSetChanged();
                }
                break;
            case 15:
                LocationTrainManager locationTrainManager = (LocationTrainManager) obj;
                m.h(locationTrainManager, "this$0");
                LocationTrainManager.a aVar = locationTrainManager.f;
                if (aVar != null) {
                    aVar.a();
                }
                break;
            case 16:
                boolean z = jp.co.yahoo.android.apps.transit.util.d.a;
                ((d.h) obj).b("");
                break;
            case 17:
                l lVar = ((c) obj).a;
                lVar.d().b();
                lVar.a();
                break;
            case 18:
                BeatingView beatingView = (BeatingView) obj;
                beatingView.k = true;
                beatingView.d(0);
                beatingView.d(1);
                break;
            case 19:
                YWNaviView.f((TextView) obj);
                break;
            case 20:
                ng.h hVar2 = (ng.h) obj;
                m.h(hVar2, "this$0");
                kf.d dVar2 = hVar2.d;
                if (dVar2 != null) {
                    l.e eVar = dVar2.a;
                    eVar.a.a();
                    l lVar2 = eVar.a;
                    lVar2.d().o();
                    lf.d dVar3 = lVar2.j;
                    boolean z2 = dVar3.a.a0;
                    c.b bVar = c.b.d;
                    if (z2) {
                        dVar3.b.b(bVar);
                    }
                    if (dVar3.a.b0) {
                        dVar3.b.c(bVar);
                    }
                    o oVarD = lVar2.d();
                    VoiceConfig voiceConfig = oVarD.A;
                    VoiceConfig.a(oVarD.e, voiceConfig.R, voiceConfig.S);
                    oVarD.k();
                }
                break;
            default:
                ni.h hVar3 = (ni.h) obj;
                m.h(hVar3, "this$0");
                MutableLiveData mutableLiveData = hVar3.a;
                f.u(mutableLiveData);
                try {
                    g.a aVar2 = g.Companion;
                    Application application = hVar3.getApplication();
                    m.g(application, "getApplication()");
                    aVar2.b(application);
                    f.v(mutableLiveData, j.a);
                } catch (Exception e2) {
                    f.t(mutableLiveData, e2);
                    return;
                }
                break;
        }
    }
}
