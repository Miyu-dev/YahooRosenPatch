package a;

import android.content.Context;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final class d {
    @WorkerThread
    public static Boolean a(Context context) {
        kotlin.jvm.internal.m.h(context, "applicationContext");
        try {
            return Boolean.valueOf(AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled());
        } catch (Exception unused) {
            Log.w("YJACookieLibrary", "Failed to get Optout.");
            return null;
        }
    }

    @WorkerThread
    public static String b(Context context) {
        kotlin.jvm.internal.m.h(context, "applicationContext");
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
        } catch (Exception unused) {
            Log.w("YJACookieLibrary", "Failed to get Advertising ID.");
            return null;
        }
    }
}
