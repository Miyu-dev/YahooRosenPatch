package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.trusted.a;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final android.support.customtabs.trusted.a mCallbackBinder;

    private TrustedWebActivityCallbackRemote(@NonNull android.support.customtabs.trusted.a aVar) {
        this.mCallbackBinder = aVar;
    }

    @Nullable
    public static TrustedWebActivityCallbackRemote fromBinder(@Nullable IBinder iBinder) {
        android.support.customtabs.trusted.a aVarAsInterface = iBinder == null ? null : a.AbstractBinderC0004a.asInterface(iBinder);
        if (aVarAsInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(aVarAsInterface);
    }

    public void runExtraCallback(@NonNull String str, @NonNull Bundle bundle) {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
