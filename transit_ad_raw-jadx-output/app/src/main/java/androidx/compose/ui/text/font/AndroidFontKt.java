package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.font.FontVariation;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidFont.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\r\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0014\u001a\b\u0010\u0016\u001a\u00020\u0015H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"", "path", "Landroid/content/res/AssetManager;", "assetManager", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroidx/compose/ui/text/font/Font;", "Font-MuC2MFs", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Font", "Ljava/io/File;", "file", "Font-Ej4NQ78", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "Lkotlin/j;", "generateAndroidFontKtForApiCompatibility", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidFontKt {
    @Stable
    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m4845FontEj4NQ78(File file, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        m.h(file, "file");
        m.h(fontWeight, "weight");
        m.h(settings, "variationSettings");
        return new AndroidFileFont(file, fontWeight, i2, settings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m4847FontEj4NQ78$default(File file, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.INSTANCE.m4902getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            settings = FontVariation.INSTANCE.m4917Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m4845FontEj4NQ78(file, fontWeight, i2, settings);
    }

    @Stable
    /* JADX INFO: renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m4848FontMuC2MFs(String str, AssetManager assetManager, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        m.h(str, "path");
        m.h(assetManager, "assetManager");
        m.h(fontWeight, "weight");
        m.h(settings, "variationSettings");
        return new AndroidAssetFont(assetManager, str, fontWeight, i2, settings, null);
    }

    /* JADX INFO: renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m4849FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 8) != 0) {
            i2 = FontStyle.INSTANCE.m4902getNormal_LCdwA();
        }
        if ((i3 & 16) != 0) {
            settings = FontVariation.INSTANCE.m4917Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m4848FontMuC2MFs(str, assetManager, fontWeight, i2, settings);
    }

    @Stable
    @RequiresApi(R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m4844FontEj4NQ78(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        m.h(parcelFileDescriptor, "fileDescriptor");
        m.h(fontWeight, "weight");
        m.h(settings, "variationSettings");
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i2, settings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m4846FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.INSTANCE.m4902getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            settings = FontVariation.INSTANCE.m4917Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m4844FontEj4NQ78(parcelFileDescriptor, fontWeight, i2, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }
}
