package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.support.v4.os.a f99a;

    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i2) {
            return new ResultReceiver[i2];
        }
    }

    public class b extends a.AbstractBinderC0011a {
        public b() {
        }

        @Override // android.support.v4.os.a
        public final void N(int i2, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            resultReceiver.getClass();
            resultReceiver.a(i2, bundle);
        }
    }

    public ResultReceiver(Parcel parcel) {
        android.support.v4.os.a c0012a;
        IBinder strongBinder = parcel.readStrongBinder();
        int i2 = a.AbstractBinderC0011a.f100a;
        if (strongBinder == null) {
            c0012a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c0012a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof android.support.v4.os.a)) ? new a.AbstractBinderC0011a.C0012a(strongBinder) : (android.support.v4.os.a) iInterfaceQueryLocalInterface;
        }
        this.f99a = c0012a;
    }

    public final void b(int i2, Bundle bundle) {
        android.support.v4.os.a aVar = this.f99a;
        if (aVar != null) {
            try {
                aVar.N(i2, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f99a == null) {
                this.f99a = new b();
            }
            parcel.writeStrongBinder(this.f99a.asBinder());
        }
    }

    public void a(int i2, Bundle bundle) {
    }
}
