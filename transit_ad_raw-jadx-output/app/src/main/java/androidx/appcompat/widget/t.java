package androidx.appcompat.widget;

import ah.c;
import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.room.QueryInterceptorDatabase;
import androidx.room.QueryInterceptorStatement;
import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.mapbox.maps.plugin.scalebar.ScaleBarImpl;
import h9.k0;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import jp.co.yahoo.android.ads.feedback.popup.YJFeedbackPopupActivity;
import jp.co.yahoo.android.apps.transit.api.data.StationData;
import jp.co.yahoo.android.apps.transit.api.timetable.TimetableStationTrain;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.b0;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.d0;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.g0;
import jp.co.yahoo.android.apps.transit.util.LocationBusManager;
import jp.co.yahoo.android.customlog.CustomLogger;
import jp.co.yahoo.android.walk.navi.view.YWNaviView;
import l8.z;
import z8.o0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i2) {
        this.f118a = i2;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        int i2 = this.f118a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((Toolbar) obj).invalidateMenu();
                break;
            case 1:
                AndroidComposeView.sendHoverExitEvent$lambda$5((AndroidComposeView) obj);
                break;
            case 2:
                TextInputServiceAndroid.sendInputCommand$lambda$1((TextInputServiceAndroid) obj);
                break;
            case 3:
                ContentLoadingProgressBar.b((ContentLoadingProgressBar) obj);
                break;
            case 4:
                ProcessLifecycleOwner.a((ProcessLifecycleOwner) obj);
                break;
            case 5:
                QueryInterceptorDatabase.c((QueryInterceptorDatabase) obj);
                break;
            case 6:
                QueryInterceptorStatement.b((QueryInterceptorStatement) obj);
                break;
            case 7:
                DelayMetCommandHandler.a((DelayMetCommandHandler) obj);
                break;
            case 8:
                ConstraintTrackingWorker.b((ConstraintTrackingWorker) obj);
                break;
            case 9:
                ((ScaleBarImpl) obj).requestLayout();
                break;
            case 10:
                YJFeedbackPopupActivity.f.c.a.a((YJFeedbackPopupActivity) obj);
                break;
            case 11:
                d0 d0Var = (d0) obj;
                int i3 = d0.h0;
                kotlin.jvm.internal.m.h(d0Var, "this$0");
                CountDownLatch countDownLatch = d0Var.d0;
                if (countDownLatch != null) {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String str3 = d0Var.i;
                    if (str3 == null || str3.length() == 0) {
                        d0Var.S();
                    }
                }
                z zVar = new z(d0Var.getActivity(), k0.m(2131888558), k0.m(2131888557));
                d0Var.g0 = zVar;
                zVar.setOnCancelListener(new b0(d0Var, 1));
                z zVar2 = d0Var.g0;
                if (zVar2 != null) {
                    zVar2.show();
                }
                Pair pairL = d0Var.L();
                String str4 = d0Var.f;
                if (str4 != null) {
                    StationData stationData = d0Var.s;
                    String id = stationData != null ? stationData.getId() : null;
                    if (id != null && (str = (String) pairL.first) != null && (str2 = (String) pairL.second) != null) {
                        TimetableStationTrain timetableStationTrain = new TimetableStationTrain();
                        String str5 = d0Var.v;
                        String str6 = d0Var.g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("stationCode", id);
                        linkedHashMap.put("trainId", str4);
                        if (!TextUtils.isEmpty(str5)) {
                            linkedHashMap.put("directionCode", String.valueOf(str5));
                        }
                        if (!TextUtils.isEmpty(str)) {
                            linkedHashMap.put("driveDayKind", str);
                        } else if (!TextUtils.isEmpty(str2)) {
                            linkedHashMap.put("date", str2);
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            linkedHashMap.put("hhmm", kotlin.text.r.s1(4, String.valueOf(str6)));
                        }
                        nk.b bVar = ((TimetableStationTrain.TimetableStationTrainService) timetableStationTrain.a.getValue()).get(linkedHashMap);
                        bVar.k0(new f7.d(new g0(d0Var, pairL)));
                        d0Var.f0.a.add(bVar);
                    }
                    break;
                }
                break;
            case 12:
                jp.co.yahoo.android.apps.transit.ui.view.navi.detail.a aVar = (jp.co.yahoo.android.apps.transit.ui.view.navi.detail.a) obj;
                aVar.q((o0) null, (String) null, -1, (String) null);
                aVar.d();
                break;
            case 13:
                LocationBusManager locationBusManager = (LocationBusManager) obj;
                kotlin.jvm.internal.m.h(locationBusManager, "this$0");
                LocationBusManager.a aVar2 = locationBusManager.f;
                if (aVar2 != null) {
                    aVar2.a();
                }
                break;
            case 14:
                ((Activity) obj).finish();
                break;
            case 15:
                ((kf.c) obj).a.a();
                break;
            case 16:
                kotlin.jvm.internal.m.h((yf.b) obj, "this$0");
                CustomLogger.getInstance().flush();
                break;
            case 17:
                YWNaviView.o((TextView) obj);
                break;
            default:
                ((c.a) obj).d.b((Bitmap) null);
                break;
        }
    }
}
