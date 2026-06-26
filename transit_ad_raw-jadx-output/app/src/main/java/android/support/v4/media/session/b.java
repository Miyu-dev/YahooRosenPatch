package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;

/* JADX INFO: compiled from: IMediaSession.java */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public interface b extends IInterface {

    /* JADX INFO: compiled from: IMediaSession.java */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f94a = 0;

        /* JADX INFO: renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMediaSession.java */
        public static class C0010a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f95a;

            public C0010a(IBinder iBinder) {
                this.f95a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f95a;
            }

            @Override // android.support.v4.media.session.b
            public final void c0(MediaControllerCompat$MediaControllerImplApi21.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(aVar);
                    if (!this.f95a.transact(3, parcelObtain, parcelObtain2, 0)) {
                        int i2 = a.f94a;
                    }
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static b e(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0010a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    void c0(MediaControllerCompat$MediaControllerImplApi21.a aVar);
}
