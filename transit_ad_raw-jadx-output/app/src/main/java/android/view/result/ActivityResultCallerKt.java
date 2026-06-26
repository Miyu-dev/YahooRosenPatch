package android.view.result;

import android.content.SharedPreferences;
import android.view.result.contract.ActivityResultContract;
import jp.co.yahoo.android.apps.transit.TransitApplication;
import jp.co.yahoo.android.apps.transit.api.registration.RegistrationMyTimetable;
import jp.co.yahoo.android.apps.transit.api.registration.RegistrationMyTimetableCache;
import jp.co.yahoo.android.apps.transit.ui.fragment.spot.StationInfoFragment;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.TimeTableMemoAppealFromType;
import jp.co.yahoo.android.apps.transit.ui.fragment.timetable.TimeTableMemoListFragment;
import kj.l;
import kotlin.Metadata;
import kotlin.j;
import kotlin.jvm.internal.m;
import m7.i;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"I", "O", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lkotlin/Function1;", "Lkotlin/j;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lkj/l;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Lkj/l;)Landroidx/activity/result/ActivityResultLauncher;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0})
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<j> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i2, ActivityResultRegistry activityResultRegistry, final l<? super O, j> lVar) {
        m.h(activityResultCaller, "<this>");
        m.h(activityResultContract, "contract");
        m.h(activityResultRegistry, "registry");
        m.h(lVar, "callback");
        final int i3 = 0;
        ActivityResultLauncher<I> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new ActivityResultCallback() { // from class: androidx.activity.result.b
            @Override // android.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i4 = i3;
                Object obj2 = lVar;
                switch (i4) {
                    case 0:
                        ActivityResultCallerKt.registerForActivityResult$lambda$0((l) obj2, obj);
                        break;
                    case 1:
                        StationInfoFragment stationInfoFragment = (StationInfoFragment) obj2;
                        String[][] strArr = StationInfoFragment.w;
                        m.h(stationInfoFragment, "this$0");
                        if (((ActivityResult) obj).getResultCode() == 0) {
                            stationInfoFragment.T(false);
                        }
                        break;
                    default:
                        TimeTableMemoListFragment timeTableMemoListFragment = (TimeTableMemoListFragment) obj2;
                        int i5 = TimeTableMemoListFragment.x;
                        m.h(timeTableMemoListFragment, "this$0");
                        TransitApplication transitApplication = TransitApplication.a;
                        new i(TransitApplication.a.a());
                        new RegistrationMyTimetableCache(0);
                        new RegistrationMyTimetable();
                        SharedPreferences sharedPreferences = TransitApplication.a.a().getSharedPreferences(TransitApplication.a.a().getString(2131888632), 0);
                        m.g(sharedPreferences, "application.getSharedPre…ontext.MODE_PRIVATE\n    )");
                        if (!sharedPreferences.getBoolean("has_synced_my_timetable", false)) {
                            TimeTableMemoListFragment.a0(timeTableMemoListFragment, true, TimeTableMemoAppealFromType.EDIT, 2);
                        }
                        break;
                }
            }
        });
        m.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new ActivityResultCallerLauncher(activityResultLauncherRegisterForActivityResult, activityResultContract, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$0(l lVar, Object obj) {
        m.h(lVar, "$callback");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$1(l lVar, Object obj) {
        m.h(lVar, "$callback");
        lVar.invoke(obj);
    }

    public static final <I, O> ActivityResultLauncher<j> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i2, l<? super O, j> lVar) {
        m.h(activityResultCaller, "<this>");
        m.h(activityResultContract, "contract");
        m.h(lVar, "callback");
        ActivityResultLauncher<I> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(activityResultContract, new a(lVar));
        m.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new ActivityResultCallerLauncher(activityResultLauncherRegisterForActivityResult, activityResultContract, i2);
    }
}
