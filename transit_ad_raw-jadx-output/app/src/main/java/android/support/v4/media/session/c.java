package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import androidx.annotation.RequiresApi;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MediaControllerCompat.java */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaControllerCompat$MediaControllerImplApi21.a f96a;

    /* JADX INFO: compiled from: MediaControllerCompat.java */
    @RequiresApi(21)
    public static class a extends MediaController.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<c> f97a;

        public a(c cVar) {
            this.f97a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            if (this.f97a.get() != null) {
                playbackInfo.getPlaybackType();
                AudioAttributesCompat.wrap(playbackInfo.getAudioAttributes());
                playbackInfo.getVolumeControl();
                playbackInfo.getMaxVolume();
                playbackInfo.getCurrentVolume();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f97a.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            if (this.f97a.get() != null) {
                Parcelable.Creator<MediaMetadataCompat> creator = MediaMetadataCompat.CREATOR;
                if (mediaMetadata != null) {
                    Parcel parcelObtain = Parcel.obtain();
                    mediaMetadata.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    MediaMetadataCompat mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                    mediaMetadataCompatCreateFromParcel.getClass();
                }
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            ArrayList arrayList;
            PlaybackStateCompat.CustomAction customAction;
            c cVar = this.f97a.get();
            if (cVar == null || cVar.f96a != null || playbackState == null) {
                return;
            }
            List<PlaybackState.CustomAction> listJ = PlaybackStateCompat.b.j(playbackState);
            if (listJ != null) {
                ArrayList arrayList2 = new ArrayList(listJ.size());
                for (PlaybackState.CustomAction customAction2 : listJ) {
                    if (customAction2 != null) {
                        PlaybackState.CustomAction customAction3 = customAction2;
                        Bundle bundleL = PlaybackStateCompat.b.l(customAction3);
                        MediaSessionCompat.a(bundleL);
                        customAction = new PlaybackStateCompat.CustomAction(PlaybackStateCompat.b.f(customAction3), PlaybackStateCompat.b.o(customAction3), PlaybackStateCompat.b.m(customAction3), bundleL);
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            Bundle bundleA = PlaybackStateCompat.c.a(playbackState);
            MediaSessionCompat.a(bundleA);
            new PlaybackStateCompat(PlaybackStateCompat.b.r(playbackState), PlaybackStateCompat.b.q(playbackState), PlaybackStateCompat.b.i(playbackState), PlaybackStateCompat.b.p(playbackState), PlaybackStateCompat.b.g(playbackState), PlaybackStateCompat.b.k(playbackState), PlaybackStateCompat.b.n(playbackState), arrayList, PlaybackStateCompat.b.h(playbackState), bundleA);
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueChanged(List<MediaSession.QueueItem> list) {
            MediaSessionCompat.QueueItem queueItem;
            if (this.f97a.get() == null || list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (MediaSession.QueueItem queueItem2 : list) {
                if (queueItem2 != null) {
                    MediaSession.QueueItem queueItem3 = queueItem2;
                    queueItem = new MediaSessionCompat.QueueItem(MediaDescriptionCompat.a(MediaSessionCompat.QueueItem.b.b(queueItem3)), MediaSessionCompat.QueueItem.b.c(queueItem3));
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.f97a.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionDestroyed() {
            this.f97a.get();
        }

        @Override // android.media.session.MediaController.Callback
        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f97a.get();
        }
    }

    /* JADX INFO: compiled from: MediaControllerCompat.java */
    public static class b extends a.AbstractBinderC0009a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<c> f98a;

        public b(c cVar) {
            this.f98a = new WeakReference<>(cVar);
        }
    }

    public c() {
        new a(this);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }
}
