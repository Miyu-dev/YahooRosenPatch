package a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import c4.b5;
import c4.r2;
import c4.s6;
import c4.u3;
import c4.x6;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.location.d0;
import com.google.android.gms.internal.location.o;
import com.google.android.gms.internal.measurement.f4;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final class k implements y0.b, d2.d, y2.n, x6, r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f53a;

    public /* synthetic */ k() {
    }

    public final void a(int i2, Context context) {
        kotlin.jvm.internal.m.h(context, "context");
        SharedPreferences sharedPreferences = (SharedPreferences) this.f53a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("TYPE", i2).apply();
    }

    public final void b(String str, int i2, Throwable th, byte[] bArr, Map map) {
        ((s6) this.f53a).l(str, i2, th, bArr, map);
    }

    public final void c(Context context) {
        kotlin.jvm.internal.m.h(context, "context");
        if (((SharedPreferences) this.f53a) != null) {
            return;
        }
        this.f53a = context.getSharedPreferences("YJACOOKIELIBRARY", 0);
    }

    public final void d(a.e eVar, Object obj) {
        PendingIntent pendingIntent = (PendingIntent) this.f53a;
        d0 d0Var = (d0) eVar;
        d0Var.getClass();
        a3.h.j(pendingIntent, "PendingIntent must be specified.");
        d0Var.x().q(pendingIntent, new o((g4.j) obj), ((a3.a) d0Var).c.getPackageName());
    }

    public final void e(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            ((b5) this.f53a).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        b5 b5Var = (b5) this.f53a;
        ((u3) ((com.google.android.gms.internal.location.e) b5Var).a).n.getClass();
        b5Var.n("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    public final void f(Context context, long j) {
        kotlin.jvm.internal.m.h(context, "context");
        SharedPreferences sharedPreferences = (SharedPreferences) this.f53a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putLong("EXPIRE", j).apply();
    }

    public final void g(Context context, String str, String str2) {
        kotlin.jvm.internal.m.h(context, "context");
        SharedPreferences sharedPreferences = (SharedPreferences) this.f53a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public final Object get() {
        String packageName = ((Context) ((x5.a) this.f53a).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final List getCues(long j) {
        return (List) this.f53a;
    }

    public final long getEventTime(int i2) {
        return 0L;
    }

    public final int getEventTimeCount() {
        return 1;
    }

    public final int getNextEventTimeIndex(long j) {
        return -1;
    }

    public final void h(Context context, boolean z) {
        kotlin.jvm.internal.m.h(context, "context");
        SharedPreferences sharedPreferences = (SharedPreferences) this.f53a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean("OPTOUT", z).apply();
    }

    public final String i(Context context, String str, String str2) {
        kotlin.jvm.internal.m.h(context, "context");
        SharedPreferences sharedPreferences = (SharedPreferences) this.f53a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString(str, str2);
    }

    public final void j(yb.a aVar) {
        ((ld.m) this.f53a).g(aVar);
    }

    public final void k(yb.a aVar, Integer num, HashMap map) {
        ((ld.m) this.f53a).f(aVar.a(), aVar.b(), num, map);
    }

    public final Object l() {
        f4 f4Var = (f4) this.f53a;
        Cursor cursorQuery = f4Var.a.query(f4Var.b, f4.h, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            cursorQuery.close();
            return arrayMap;
        } finally {
            cursorQuery.close();
        }
    }

    public /* synthetic */ k(ld.m mVar) {
        kotlin.jvm.internal.m.h(mVar, "builder");
        this.f53a = mVar;
    }
}
