package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.ImageBitmap;

/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
public final /* synthetic */ class e {
    static {
        ImageBitmap.Companion companion = ImageBitmap.Companion;
    }

    public static /* synthetic */ void a(ImageBitmap imageBitmap, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        int i9 = (i8 & 2) != 0 ? 0 : i2;
        int i10 = (i8 & 4) != 0 ? 0 : i3;
        int width = (i8 & 8) != 0 ? imageBitmap.getWidth() : i4;
        imageBitmap.readPixels(iArr, i9, i10, width, (i8 & 16) != 0 ? imageBitmap.getHeight() : i5, (i8 & 32) == 0 ? i6 : 0, (i8 & 64) != 0 ? width : i7);
    }
}
