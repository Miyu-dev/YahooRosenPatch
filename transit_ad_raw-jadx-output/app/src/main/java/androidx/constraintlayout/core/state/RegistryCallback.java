package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public interface RegistryCallback {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int i2, int i3);

    void onNewMotionScene(String str);

    void onProgress(float f);

    void setDrawDebug(int i2);

    void setLayoutInformationMode(int i2);
}
