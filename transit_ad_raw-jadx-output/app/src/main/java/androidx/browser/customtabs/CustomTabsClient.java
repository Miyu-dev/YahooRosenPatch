package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.a;
import android.support.customtabs.b;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public class CustomTabsClient {
    private static final String TAG = "CustomTabsClient";
    private final Context mApplicationContext;
    private final b mService;
    private final ComponentName mServiceComponentName;

    public CustomTabsClient(b bVar, ComponentName componentName, Context context) {
        this.mService = bVar;
        this.mServiceComponentName = componentName;
        this.mApplicationContext = context;
    }

    public static boolean bindCustomTabsService(@NonNull Context context, @Nullable String str, @NonNull CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static boolean bindCustomTabsServicePreservePriority(@NonNull Context context, @Nullable String str, @NonNull CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 1);
    }

    public static boolean connectAndInitialize(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
            return bindCustomTabsService(applicationContext, str, new CustomTabsServiceConnection() { // from class: androidx.browser.customtabs.CustomTabsClient.1
                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
                    customTabsClient.warmup(0L);
                    applicationContext.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }
            });
        } catch (SecurityException unused) {
            return false;
        }
    }

    private a.AbstractBinderC0000a createCallbackWrapper(@Nullable final CustomTabsCallback customTabsCallback) {
        return new a.AbstractBinderC0000a() { // from class: androidx.browser.customtabs.CustomTabsClient.2
            private Handler mHandler = new Handler(Looper.getMainLooper());

            @Override // android.support.customtabs.a
            public void extraCallback(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.2
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.extraCallback(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.a
            public Bundle extraCallbackWithResult(@NonNull String str, @Nullable Bundle bundle) {
                CustomTabsCallback customTabsCallback2 = customTabsCallback;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // android.support.customtabs.a
            public void onMessageChannelReady(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onMessageChannelReady(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.a
            public void onNavigationEvent(final int i2, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onNavigationEvent(i2, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.a
            public void onPostMessage(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.4
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onPostMessage(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.a
            public void onRelationshipValidationResult(final int i2, final Uri uri, final boolean z, @Nullable final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.mHandler.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.5
                    @Override // java.lang.Runnable
                    public void run() {
                        customTabsCallback.onRelationshipValidationResult(i2, uri, z, bundle);
                    }
                });
            }
        };
    }

    private static PendingIntent createSessionId(Context context, int i2) {
        return PendingIntent.getActivity(context, i2, new Intent(), 67108864);
    }

    @Nullable
    public static String getPackageName(@NonNull Context context, @Nullable List<String> list) {
        return getPackageName(context, list, false);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static CustomTabsSession.PendingSession newPendingSession(@NonNull Context context, @Nullable CustomTabsCallback customTabsCallback, int i2) {
        return new CustomTabsSession.PendingSession(customTabsCallback, createSessionId(context, i2));
    }

    @Nullable
    private CustomTabsSession newSessionInternal(@Nullable CustomTabsCallback customTabsCallback, @Nullable PendingIntent pendingIntent) {
        boolean zNewSession;
        a.AbstractBinderC0000a abstractBinderC0000aCreateCallbackWrapper = createCallbackWrapper(customTabsCallback);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
                zNewSession = this.mService.newSessionWithExtras(abstractBinderC0000aCreateCallbackWrapper, bundle);
            } else {
                zNewSession = this.mService.newSession(abstractBinderC0000aCreateCallbackWrapper);
            }
            if (zNewSession) {
                return new CustomTabsSession(this.mService, abstractBinderC0000aCreateCallbackWrapper, this.mServiceComponentName, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public CustomTabsSession attachSession(@NonNull CustomTabsSession.PendingSession pendingSession) {
        return newSessionInternal(pendingSession.getCallback(), pendingSession.getId());
    }

    @Nullable
    public Bundle extraCommand(@NonNull String str, @Nullable Bundle bundle) {
        try {
            return this.mService.extraCommand(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Nullable
    public CustomTabsSession newSession(@Nullable CustomTabsCallback customTabsCallback) {
        return newSessionInternal(customTabsCallback, null);
    }

    public boolean warmup(long j) {
        try {
            return this.mService.warmup(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Nullable
    public static String getPackageName(@NonNull Context context, @Nullable List<String> list, boolean z) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w(TAG, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    @Nullable
    public CustomTabsSession newSession(@Nullable CustomTabsCallback customTabsCallback, int i2) {
        return newSessionInternal(customTabsCallback, createSessionId(this.mApplicationContext, i2));
    }
}
