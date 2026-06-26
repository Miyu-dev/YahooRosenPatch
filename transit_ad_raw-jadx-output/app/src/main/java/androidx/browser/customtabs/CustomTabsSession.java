package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.b;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.util.List;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final class CustomTabsSession {
    private static final String TAG = "CustomTabsSession";
    private final android.support.customtabs.a mCallback;
    private final ComponentName mComponentName;

    @Nullable
    private final PendingIntent mId;
    private final Object mLock = new Object();
    private final b mService;

    public static class MockSession extends b.a {
        @Override // android.support.customtabs.b
        public Bundle extraCommand(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.b
        public boolean mayLaunchUrl(android.support.customtabs.a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean newSession(android.support.customtabs.a aVar) {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean newSessionWithExtras(android.support.customtabs.a aVar, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.b
        public int postMessage(android.support.customtabs.a aVar, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.b
        public boolean receiveFile(android.support.customtabs.a aVar, Uri uri, int i2, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean requestPostMessageChannel(android.support.customtabs.a aVar, Uri uri) {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.a aVar, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean updateVisuals(android.support.customtabs.a aVar, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean validateRelationship(android.support.customtabs.a aVar, int i2, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.b
        public boolean warmup(long j) {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class PendingSession {

        @Nullable
        private final CustomTabsCallback mCallback;

        @Nullable
        private final PendingIntent mId;

        public PendingSession(@Nullable CustomTabsCallback customTabsCallback, @Nullable PendingIntent pendingIntent) {
            this.mCallback = customTabsCallback;
            this.mId = pendingIntent;
        }

        @Nullable
        public CustomTabsCallback getCallback() {
            return this.mCallback;
        }

        @Nullable
        public PendingIntent getId() {
            return this.mId;
        }
    }

    public CustomTabsSession(b bVar, android.support.customtabs.a aVar, ComponentName componentName, @Nullable PendingIntent pendingIntent) {
        this.mService = bVar;
        this.mCallback = aVar;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    private void addIdToBundle(Bundle bundle) {
        PendingIntent pendingIntent = this.mId;
        if (pendingIntent != null) {
            bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
        }
    }

    private Bundle createBundleWithId(@Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        addIdToBundle(bundle2);
        return bundle2;
    }

    @NonNull
    @VisibleForTesting
    public static CustomTabsSession createMockSessionForTesting(@NonNull ComponentName componentName) {
        return new CustomTabsSession(new MockSession(), new CustomTabsSessionToken.MockCallback(), componentName, null);
    }

    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    @Nullable
    public PendingIntent getId() {
        return this.mId;
    }

    public boolean mayLaunchUrl(@Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
        try {
            return this.mService.mayLaunchUrl(this.mCallback, uri, createBundleWithId(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int postMessage(@NonNull String str, @Nullable Bundle bundle) {
        int iPostMessage;
        Bundle bundleCreateBundleWithId = createBundleWithId(bundle);
        synchronized (this.mLock) {
            try {
                try {
                    iPostMessage = this.mService.postMessage(this.mCallback, str, bundleCreateBundleWithId);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public boolean receiveFile(@NonNull Uri uri, int i2, @Nullable Bundle bundle) {
        try {
            return this.mService.receiveFile(this.mCallback, uri, i2, createBundleWithId(bundle));
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean requestPostMessageChannel(@NonNull Uri uri) {
        try {
            return this.mId != null ? this.mService.requestPostMessageChannelWithExtras(this.mCallback, uri, createBundleWithId(null)) : this.mService.requestPostMessageChannel(this.mCallback, uri);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setActionButton(@NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean setSecondaryToolbarViews(@Nullable RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
        bundle.putIntArray(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
        bundle.putParcelable(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
        addIdToBundle(bundle);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setToolbarItem(int i2, @NonNull Bitmap bitmap, @NonNull String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(CustomTabsIntent.KEY_ID, i2);
        bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
        bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
        addIdToBundle(bundle2);
        try {
            return this.mService.updateVisuals(this.mCallback, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean validateRelationship(int i2, @NonNull Uri uri, @Nullable Bundle bundle) {
        if (i2 >= 1 && i2 <= 2) {
            try {
                return this.mService.validateRelationship(this.mCallback, i2, uri, createBundleWithId(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
