package android.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.material.ripple.a;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.room.InvalidationTracker;
import androidx.room.QueryInterceptorDatabase;
import androidx.room.RoomTrackingLiveData;
import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.Task;
import com.mapbox.maps.renderer.MapboxRenderer;
import h9.k0;
import jp.co.yahoo.android.ads.feedback.popup.YJFeedbackPopupActivity;
import jp.co.yahoo.android.apps.transit.ad.NaviSearchAdView;
import jp.co.yahoo.android.apps.transit.api.data.location.LocationTrainData;
import jp.co.yahoo.android.apps.transit.ui.activity.WalkNaviActivity;
import jp.co.yahoo.android.apps.transit.ui.activity.navi.RealTimeTrainActivity;
import jp.co.yahoo.android.apps.transit.ui.fragment.spot.StationInfoHeaderView;
import jp.co.yahoo.android.apps.transit.ui.fragment.spot.b0;
import jp.co.yahoo.android.apps.transit.util.LocationTrainManager;
import jp.co.yahoo.android.walk.navi.view.YWNaviView;
import jp.co.yahoo.android.ymlv.YMLVPlayerActivity;
import jp.co.yahoo.yconnect.sso.AccountManagementActivity;
import kotlin.jvm.internal.m;
import l7.ed;
import l7.g1;
import qf.q;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f108a = i2;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        RelativeLayout relativeLayout;
        int i2 = this.f108a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                FullyDrawnReporter.reportRunnable$lambda$2((FullyDrawnReporter) obj);
                return;
            case 1:
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$38((AndroidComposeViewAccessibilityDelegateCompat) obj);
                return;
            case 2:
                ((InvalidationTracker) obj).onAutoCloseCallback$room_runtime_release();
                return;
            case 3:
                QueryInterceptorDatabase.l((QueryInterceptorDatabase) obj);
                return;
            case 4:
                RoomTrackingLiveData.a((RoomTrackingLiveData) obj);
                return;
            case 5:
                DelayMetCommandHandler.b((DelayMetCommandHandler) obj);
                return;
            case 6:
                FirebaseInstallations.b((FirebaseInstallations) obj);
                return;
            case 7:
                FirebaseMessaging.c((FirebaseMessaging) obj);
                return;
            case 8:
                NativeObserver.a((Exception) obj);
                return;
            case 9:
                MapboxRenderer.c((Task) obj);
                return;
            case 10:
                YJFeedbackPopupActivity.h.a.a.a((YJFeedbackPopupActivity) obj);
                return;
            case 11:
                NaviSearchAdView naviSearchAdView = (NaviSearchAdView) obj;
                int i3 = NaviSearchAdView.e;
                m.h(naviSearchAdView, "this$0");
                naviSearchAdView.d.a(false);
                return;
            case 12:
                WalkNaviActivity walkNaviActivity = (WalkNaviActivity) obj;
                int i4 = WalkNaviActivity.i;
                m.h(walkNaviActivity, "this$0");
                g1 g1Var = walkNaviActivity.b;
                if (g1Var != null) {
                    g1Var.b.postDelayed(new a(walkNaviActivity, 11), 5000L);
                    return;
                } else {
                    m.o("binding");
                    throw null;
                }
            case 13:
                RealTimeTrainActivity realTimeTrainActivity = (RealTimeTrainActivity) obj;
                int i5 = RealTimeTrainActivity.d.b;
                m.h(realTimeTrainActivity, "this$0");
                RealTimeTrainActivity.a aVar = RealTimeTrainActivity.y;
                realTimeTrainActivity.C0();
                return;
            case 14:
                StationInfoHeaderView stationInfoHeaderView = (StationInfoHeaderView) obj;
                int i6 = StationInfoHeaderView.d;
                m.h(stationInfoHeaderView, "this$0");
                ed edVar = stationInfoHeaderView.c;
                if (edVar == null) {
                    m.o("binding");
                    throw null;
                }
                AppCompatImageView appCompatImageView = edVar.g;
                SharedPreferences sharedPreferences = appCompatImageView.getContext().getSharedPreferences(k0.m(2131888632), 0);
                if (sharedPreferences.getBoolean("hasTimetablePopupShownKey", false)) {
                    return;
                }
                sharedPreferences.edit().putBoolean("hasTimetablePopupShownKey", true).apply();
                Context context = appCompatImageView.getContext();
                m.g(context, "context");
                float f = context.getResources().getDisplayMetrics().density * 24.0f;
                appCompatImageView.setOnClickListener(new b0(appCompatImageView, f));
                appCompatImageView.setAlpha(0.0f);
                appCompatImageView.setVisibility(0);
                appCompatImageView.animate().translationYBy(-f).setDuration(200L).alpha(1.0f).setStartDelay(200L).start();
                return;
            case 15:
                LocationTrainManager locationTrainManager = (LocationTrainManager) obj;
                m.h(locationTrainManager, "this$0");
                LocationTrainManager.a aVar2 = locationTrainManager.f;
                if (aVar2 != null) {
                    aVar2.b();
                    aVar2.c(LocationTrainData.TripStatus.PositioningImpossible);
                    return;
                }
                return;
            case 16:
                q qVar = (q) obj;
                m.h(qVar, "this$0");
                qVar.z.c();
                return;
            case 17:
                YWNaviView.j((YWNaviView) obj);
                return;
            case 18:
                YMLVPlayerActivity yMLVPlayerActivity = (YMLVPlayerActivity) obj;
                int i7 = YMLVPlayerActivity.j;
                if (yMLVPlayerActivity.isFinishing() || (view = yMLVPlayerActivity.g) == null || (relativeLayout = yMLVPlayerActivity.a) == null) {
                    return;
                }
                relativeLayout.removeView(view);
                yMLVPlayerActivity.a.addView(yMLVPlayerActivity.g);
                return;
            default:
                View view2 = (View) obj;
                AccountManagementActivity.a aVar3 = AccountManagementActivity.Companion;
                m.h(view2, "$view");
                view2.setEnabled(true);
                return;
        }
    }
}
