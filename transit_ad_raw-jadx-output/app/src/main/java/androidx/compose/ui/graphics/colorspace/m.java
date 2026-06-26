package androidx.compose.ui.graphics.colorspace;

import ch.a;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.Utils;
import h9.a;
import java.util.ArrayList;
import java.util.HashMap;
import jp.co.yahoo.android.apps.transit.ui.activity.alarm.AlarmConfirm;
import jp.co.yahoo.android.apps.transit.ui.activity.setting.SettingActivity;
import jp.co.yahoo.android.apps.transit.ui.activity.timer.SettingSkinActivity;
import jp.co.yahoo.android.apps.transit.ui.fragment.input.InputAddressFragment;
import jp.co.yahoo.android.apps.transit.util.d;
import jp.co.yahoo.android.common.security.YSecureException;
import sk.b;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class m implements DoubleFunction, g4.c, b.b, d.h, a.a, a.a, vk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f147a;

    public /* synthetic */ m(Object obj) {
        this.f147a = obj;
    }

    public final void a(Object obj) {
        AlarmConfirm alarmConfirm = (AlarmConfirm) this.f147a;
        sk.g gVar = (sk.g) obj;
        int i2 = AlarmConfirm.i;
        kotlin.jvm.internal.m.h(alarmConfirm, "this$0");
        try {
            z6.b bVar = alarmConfirm.f;
            ArrayList arrayListE = bVar != null ? bVar.e() : null;
            kotlin.jvm.internal.m.f(arrayListE, "null cannot be cast to non-null type java.util.ArrayList<android.os.Bundle>{ kotlin.collections.TypeAliasesKt.ArrayList<android.os.Bundle> }");
            gVar.onNext(arrayListE);
            gVar.onCompleted();
        } catch (YSecureException e) {
            FirebaseCrashlytics.getInstance().recordException(e);
            gVar.onError((Throwable) null);
        }
    }

    public final void b(String str) {
        SettingActivity settingActivity = (SettingActivity) this.f147a;
        int i2 = SettingActivity.m;
        settingActivity.getClass();
        if (str.isEmpty()) {
            settingActivity.l.c.setVisibility(4);
        } else {
            settingActivity.l.c.setVisibility(0);
            settingActivity.l.c.setText(String.format("%s %s", str, settingActivity.getString(2131888004)));
        }
    }

    public final void c(ch.a aVar, Object obj) {
        SettingSkinActivity settingSkinActivity = (SettingSkinActivity) this.f147a;
        int i2 = SettingSkinActivity.z;
        kotlin.jvm.internal.m.h(settingSkinActivity, "this$0");
        settingSkinActivity.F0();
    }

    public final void call() {
        ((c7.m) this.f147a).d();
    }

    public final void d(HashMap map) {
        InputAddressFragment inputAddressFragment = (InputAddressFragment) this.f147a;
        int i2 = InputAddressFragment.h;
        kotlin.jvm.internal.m.h(inputAddressFragment, "this$0");
        inputAddressFragment.k(map);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$7((TransferParameters) this.f147a, d);
    }

    public final Object then(g4.i iVar) {
        return Utils.b((g4.j) this.f147a, iVar);
    }
}
