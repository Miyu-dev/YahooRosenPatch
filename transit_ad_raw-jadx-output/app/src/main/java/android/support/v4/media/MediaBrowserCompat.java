package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserCompatUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final class MediaBrowserCompat {
    public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f66a;

    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i2, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.b(bundle);
            }
            if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i2, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.b(bundle);
            }
            if (i2 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            parcelableArray.getClass();
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        @DoNotInline
        public static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    public static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<g> f68a;
        public WeakReference<Messenger> b;

        public b(g gVar) {
            this.f68a = new WeakReference<>(gVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            WeakReference<Messenger> weakReference = this.b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            WeakReference<g> weakReference2 = this.f68a;
            if (weakReference2.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            g gVar = weakReference2.get();
            Messenger messenger = this.b.get();
            try {
                int i2 = message.what;
                if (i2 == 1) {
                    MediaSessionCompat.a(data.getBundle("data_root_hints"));
                    gVar.c(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"));
                } else if (i2 == 2) {
                    gVar.b(messenger);
                } else if (i2 != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle);
                    MediaSessionCompat.a(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    data.getParcelableArrayList("data_media_item_list");
                    gVar.a(messenger, string, bundle);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    gVar.b(messenger);
                }
            }
        }
    }

    @RequiresApi(23)
    public static class e extends d {
        public e(Context context, ComponentName componentName, c cVar) {
            super(context, componentName, cVar);
        }
    }

    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    public static class f extends e {
        public f(Context context, ComponentName componentName, c cVar) {
            super(context, componentName, cVar);
        }
    }

    public interface g {
        void a(Messenger messenger, String str, Bundle bundle);

        void b(Messenger messenger);

        void c(Messenger messenger, String str, MediaSessionCompat.Token token);
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Messenger f72a;
        public final Bundle b;

        public h(IBinder iBinder, Bundle bundle) {
            this.f72a = new Messenger(iBinder);
            this.b = bundle;
        }

        public final void a(int i2, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i2;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f72a.send(messageObtain);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f73a = new ArrayList();
        public final ArrayList b = new ArrayList();

        public final void a(Bundle bundle) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i2 >= arrayList.size()) {
                    return;
                }
                if (MediaBrowserCompatUtils.areSameOptions((Bundle) arrayList.get(i2), bundle)) {
                    return;
                }
                i2++;
            }
        }
    }

    public static abstract class j {

        @RequiresApi(21)
        public class a extends MediaBrowser.SubscriptionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(@NonNull String str, List<MediaBrowser.MediaItem> list) {
                j.this.getClass();
                MediaItem.a(list);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(@NonNull String str) {
                j.this.getClass();
            }
        }

        @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
        public class b extends a {
            public b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(@NonNull String str, @NonNull List<MediaBrowser.MediaItem> list, @NonNull Bundle bundle) {
                MediaSessionCompat.a(bundle);
                MediaItem.a(list);
                j.this.getClass();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(@NonNull String str, @NonNull Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j.this.getClass();
            }
        }

        public j() {
            new Binder();
            if (Build.VERSION.SDK_INT >= 26) {
                new b();
            } else {
                new a();
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f66a = new f(context, componentName, cVar);
        } else {
            this.f66a = new e(context, componentName, cVar);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f67a;
        public final MediaDescriptionCompat b;

        public class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i2) {
                return new MediaItem[i2];
            }
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i2) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.f75a)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f67a = i2;
            this.b = mediaDescriptionCompat;
        }

        public static void a(List list) {
            MediaItem mediaItem;
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj != null) {
                        MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                        mediaItem = new MediaItem(MediaDescriptionCompat.a(a.a(mediaItem2)), a.b(mediaItem2));
                    } else {
                        mediaItem = null;
                    }
                    arrayList.add(mediaItem);
                }
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NonNull
        public final String toString() {
            return "MediaItem{mFlags=" + this.f67a + ", mDescription=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f67a);
            this.b.writeToParcel(parcel, i2);
        }

        public MediaItem(Parcel parcel) {
            this.f67a = parcel.readInt();
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    public static class c {
        final MediaBrowser.ConnectionCallback mConnectionCallbackFwk = new a();
        b mConnectionCallbackInternal;

        @RequiresApi(21)
        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnected() {
                c cVar = c.this;
                b bVar = cVar.mConnectionCallbackInternal;
                if (bVar != null) {
                    d dVar = (d) bVar;
                    MediaBrowser mediaBrowser = dVar.b;
                    try {
                        Bundle extras = mediaBrowser.getExtras();
                        if (extras != null) {
                            extras.getInt("extra_service_version", 0);
                            IBinder binder = BundleCompat.getBinder(extras, "extra_messenger");
                            if (binder != null) {
                                dVar.f = new h(binder, dVar.f71c);
                                b bVar2 = dVar.d;
                                Messenger messenger = new Messenger(bVar2);
                                dVar.g = messenger;
                                bVar2.getClass();
                                bVar2.b = new WeakReference<>(messenger);
                                try {
                                    h hVar = dVar.f;
                                    Context context = dVar.f70a;
                                    Messenger messenger2 = dVar.g;
                                    hVar.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data_package_name", context.getPackageName());
                                    bundle.putInt("data_calling_pid", Process.myPid());
                                    bundle.putBundle("data_root_hints", hVar.b);
                                    hVar.a(6, bundle, messenger2);
                                } catch (RemoteException unused) {
                                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            }
                            android.support.v4.media.session.b bVarE = b.a.e(BundleCompat.getBinder(extras, "extra_session_binder"));
                            if (bVarE != null) {
                                dVar.h = MediaSessionCompat.Token.a(mediaBrowser.getSessionToken(), bVarE);
                            }
                        }
                    } catch (IllegalStateException e) {
                        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
                    }
                }
                cVar.onConnected();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionFailed() {
                c cVar = c.this;
                b bVar = cVar.mConnectionCallbackInternal;
                if (bVar != null) {
                    bVar.getClass();
                }
                cVar.onConnectionFailed();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionSuspended() {
                c cVar = c.this;
                b bVar = cVar.mConnectionCallbackInternal;
                if (bVar != null) {
                    d dVar = (d) bVar;
                    dVar.f = null;
                    dVar.g = null;
                    dVar.h = null;
                    b bVar2 = dVar.d;
                    bVar2.getClass();
                    bVar2.b = new WeakReference<>(null);
                }
                cVar.onConnectionSuspended();
            }
        }

        public interface b {
        }

        public void setInternalConnectionCallback(b bVar) {
            this.mConnectionCallbackInternal = bVar;
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }
    }

    @RequiresApi(21)
    public static class d implements g, c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f70a;
        public final MediaBrowser b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f71c;
        public final b d = new b(this);
        public final ArrayMap<String, i> e = new ArrayMap<>();
        public h f;
        public Messenger g;
        public MediaSessionCompat.Token h;

        public d(Context context, ComponentName componentName, c cVar) {
            this.f70a = context;
            Bundle bundle = new Bundle();
            this.f71c = bundle;
            bundle.putInt("extra_client_version", 1);
            bundle.putInt("extra_calling_pid", Process.myPid());
            cVar.setInternalConnectionCallback(this);
            this.b = new MediaBrowser(context, componentName, cVar.mConnectionCallbackFwk, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public final void a(Messenger messenger, String str, Bundle bundle) {
            if (this.g != messenger) {
                return;
            }
            i iVar = this.e.get(str);
            if (iVar != null) {
                iVar.a(bundle);
            } else if (MediaBrowserCompat.b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public final void b(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public final void c(Messenger messenger, String str, MediaSessionCompat.Token token) {
        }
    }

    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public final void a(int i2, Bundle bundle) {
        }
    }
}
