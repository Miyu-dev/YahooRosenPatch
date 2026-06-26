package android.view;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.u;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.ComputableLiveData;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.room.AutoCloser;
import androidx.room.QueryInterceptorStatement;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.concurrent.CountDownLatch;
import jp.co.yahoo.android.ads.YJIIconOverlayView;
import jp.co.yahoo.android.apps.transit.fcm.q;
import jp.co.yahoo.android.apps.transit.ui.fragment.spot.h;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.d0;
import jp.co.yahoo.android.apps.transit.ui.view.custom.SectionListView;
import jp.co.yahoo.android.walk.navi.view.YWNaviView;
import jp.co.yahoo.android.ymlv.YMLVPlayerActivity;
import kj.a;
import kotlin.jvm.internal.m;
import r8.p;
import wi.c;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f107a = i2;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f107a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ComponentDialog.onBackPressedDispatcher$lambda$1((ComponentDialog) obj);
                break;
            case 1:
                AppCompatDelegate.syncRequestedAndStoredLocales((Context) obj);
                break;
            case 2:
                ActivityCompat.a((Activity) obj);
                break;
            case 3:
                ComputableLiveData.b((ComputableLiveData) obj);
                break;
            case 4:
                DownloadHelper.a((DownloadHelper) obj);
                break;
            case 5:
                AutoCloser.b((AutoCloser) obj);
                break;
            case 6:
                QueryInterceptorStatement.a((QueryInterceptorStatement) obj);
                break;
            case 7:
                CameraAnimationsPluginImpl.a((CameraAnimationsPluginImpl) obj);
                break;
            case 8:
                GesturesPluginImpl.a((GesturesPluginImpl) obj);
                break;
            case 9:
                AnimationThreadController.a((a) obj);
                break;
            case 10:
                YJIIconOverlayView.b((YJIIconOverlayView) obj);
                break;
            case 11:
                q.c cVar = (q.c) obj;
                Object obj2 = q.d;
                m.h(cVar, "$listener");
                cVar.onCanceled();
                break;
            case 12:
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
                new Handler(Looper.getMainLooper()).post(new u(hVar, 14));
                break;
            case 13:
                p pVar = (p) obj;
                int i3 = p.t0;
                m.h(pVar, "this$0");
                try {
                    pVar.G(false);
                } catch (IllegalStateException unused) {
                    return;
                }
                break;
            case 14:
                d0 d0Var = (d0) obj;
                int i4 = d0.h0;
                m.h(d0Var, "this$0");
                if (d0Var.isVisible()) {
                    d0Var.M();
                }
                break;
            case 15:
                ((SectionListView) obj).invalidateViews();
                break;
            case 16:
                qf.q qVar = (qf.q) obj;
                m.h(qVar, "this$0");
                qVar.z.c();
                break;
            case 17:
                YWNaviView.a((TextView) obj);
                break;
            case 18:
                ((YMLVPlayerActivity) obj).i = false;
                break;
            default:
                View view = (View) obj;
                c.a aVar = c.Companion;
                m.h(view, "$view");
                view.setEnabled(true);
                break;
        }
    }
}
