package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: ITrustedWebActivityCallback.java */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public interface a extends IInterface {
    void onExtraCallback(String str, Bundle bundle);

    /* JADX INFO: renamed from: android.support.customtabs.trusted.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ITrustedWebActivityCallback.java */
    public static abstract class AbstractBinderC0004a extends Binder implements a {
        private static final String DESCRIPTOR = "android.support.customtabs.trusted.ITrustedWebActivityCallback";
        static final int TRANSACTION_onExtraCallback = 2;

        /* JADX INFO: renamed from: android.support.customtabs.trusted.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ITrustedWebActivityCallback.java */
        public static class C0005a implements a {
            public static a b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f63a;

            public C0005a(IBinder iBinder) {
                this.f63a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f63a;
            }

            @Override // android.support.customtabs.trusted.a
            public final void onExtraCallback(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0004a.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f63a.transact(2, parcelObtain, parcelObtain2, 0) || AbstractBinderC0004a.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC0004a.getDefaultImpl().onExtraCallback(str, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0004a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0005a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a getDefaultImpl() {
            return C0005a.b;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0005a.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (aVar == null) {
                return false;
            }
            C0005a.b = aVar;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 != 2) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onExtraCallback(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
