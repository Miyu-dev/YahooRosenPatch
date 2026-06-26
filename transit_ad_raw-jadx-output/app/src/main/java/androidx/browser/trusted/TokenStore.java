package androidx.browser.trusted;

import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public interface TokenStore {
    @Nullable
    @BinderThread
    Token load();

    @WorkerThread
    void store(@Nullable Token token);
}
