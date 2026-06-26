package a;

import android.util.Log;
import androidx.lifecycle.Observer;
import b.o;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class m implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj.a f56a;
    public final /* synthetic */ kj.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kj.a f57c;

    public /* synthetic */ m(o.b bVar, o.c cVar, o.d dVar) {
        this.f56a = bVar;
        this.b = cVar;
        this.f57c = dVar;
    }

    public final void onChanged(Object obj) {
        String str;
        Map map = (Map) obj;
        kj.a aVar = this.f56a;
        kotlin.jvm.internal.m.h(aVar, "$onLoginSuccess");
        kj.a aVar2 = this.b;
        kotlin.jvm.internal.m.h(aVar2, "$onLogoutSuccess");
        kj.a aVar3 = this.f57c;
        kotlin.jvm.internal.m.h(aVar3, "$onSwitchSuccess");
        Object obj2 = map == null ? null : map.get("event");
        if (kotlin.jvm.internal.m.c(obj2, "onLoginSuccess")) {
            if (cf.a.b) {
                Log.d("YJACookieLibrary", "Observed: onLoginSuccess");
            }
            aVar.invoke();
            return;
        }
        if (kotlin.jvm.internal.m.c(obj2, "onLogoutSuccess")) {
            if (cf.a.b) {
                Log.d("YJACookieLibrary", "Observed: onLogoutSuccess");
            }
            aVar2.invoke();
            return;
        }
        if (kotlin.jvm.internal.m.c(obj2, "onSwitchSuccess")) {
            if (cf.a.b) {
                Log.d("YJACookieLibrary", "Observed: onSwitchSuccess");
            }
            aVar3.invoke();
            return;
        }
        if (kotlin.jvm.internal.m.c(obj2, "onLoginFailure")) {
            if (!cf.a.b) {
                return;
            } else {
                str = "Observed: onLoginFailure";
            }
        } else if (kotlin.jvm.internal.m.c(obj2, "onLogoutFailure")) {
            if (!cf.a.b) {
                return;
            } else {
                str = "Observed: onLogoutFailure";
            }
        } else if (!kotlin.jvm.internal.m.c(obj2, "onSwitchFailure") || !cf.a.b) {
            return;
        } else {
            str = "Observed: onSwitchFailure";
        }
        Log.d("YJACookieLibrary", str);
    }
}
