package android.support.v4.media;

import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        return androidx.media.AudioAttributesCompatParcelizer.read(versionedParcel);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, versionedParcel);
    }
}
