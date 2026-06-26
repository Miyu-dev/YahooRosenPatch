package s0;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: BaseProxy.java */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f167a;
    public final String b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public a(IBinder iBinder) {
        this.f167a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f167a;
    }
}
