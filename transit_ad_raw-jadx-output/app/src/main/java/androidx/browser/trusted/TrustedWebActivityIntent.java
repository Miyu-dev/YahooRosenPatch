package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final class TrustedWebActivityIntent {

    @NonNull
    private final Intent mIntent;

    @NonNull
    private final List<Uri> mSharedFileUris;

    public TrustedWebActivityIntent(@NonNull Intent intent, @NonNull List<Uri> list) {
        this.mIntent = intent;
        this.mSharedFileUris = list;
    }

    private void grantUriPermissionToProvider(Context context) {
        Iterator<Uri> it = this.mSharedFileUris.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.mIntent.getPackage(), it.next(), 1);
        }
    }

    @NonNull
    public Intent getIntent() {
        return this.mIntent;
    }

    public void launchTrustedWebActivity(@NonNull Context context) {
        grantUriPermissionToProvider(context);
        ContextCompat.startActivity(context, this.mIntent, (Bundle) null);
    }
}
