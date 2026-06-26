package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RequiresApi(21)
public final class MediaControllerCompat$MediaControllerImplApi21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaController f80a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ArrayList f81c = new ArrayList();
    public final HashMap<c, a> d = new HashMap<>();
    public final MediaSessionCompat.Token e;

    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<MediaControllerCompat$MediaControllerImplApi21> f82a;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super(null);
            this.f82a = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i2, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f82a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.b) {
                mediaControllerCompat$MediaControllerImplApi21.e.c(b.a.e(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.e.d(ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    public static class a extends c.b {
        public a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.a
        public final void F() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void O(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void d0() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void e0() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void p() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public final void y() {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        b bVar;
        this.e = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.b);
        this.f80a = mediaController;
        synchronized (token.f85a) {
            bVar = token.f86c;
        }
        if (bVar == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    @GuardedBy("mLock")
    public final void a() {
        b bVar;
        MediaSessionCompat.Token token = this.e;
        synchronized (token.f85a) {
            bVar = token.f86c;
        }
        if (bVar == null) {
            return;
        }
        ArrayList<c> arrayList = this.f81c;
        for (c cVar : arrayList) {
            a aVar = new a(cVar);
            this.d.put(cVar, aVar);
            cVar.f96a = aVar;
            try {
                token.b().c0(aVar);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }
}
