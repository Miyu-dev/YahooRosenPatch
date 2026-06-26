package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AndroidImageBitmap.android.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@RequiresApi(androidx.appcompat.R.styleable.AppCompatTheme_actionModeSelectAllDrawable)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0004H\u0001¢\u0006\u0002\b\u0011J\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0012H\u0001¢\u0006\u0002\b\u0011J\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\rH\u0001¢\u0006\u0002\b\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "()V", "createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "composeColorSpace", "composeColorSpace$ui_graphics_release", "Landroid/graphics/ColorSpace;", "toFrameworkColorSpace", "toFrameworkColorSpace$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
final class Api26Bitmap {
    public static final Api26Bitmap INSTANCE = new Api26Bitmap();

    private Api26Bitmap() {
    }

    @DoNotInline
    public static final ColorSpace composeColorSpace$ui_graphics_release(Bitmap bitmap) {
        ColorSpace colorSpaceComposeColorSpace$ui_graphics_release;
        m.h(bitmap, "<this>");
        android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (colorSpaceComposeColorSpace$ui_graphics_release = composeColorSpace$ui_graphics_release(colorSpace)) == null) ? ColorSpaces.INSTANCE.getSrgb() : colorSpaceComposeColorSpace$ui_graphics_release;
    }

    @DoNotInline
    /* JADX INFO: renamed from: createBitmap-x__-hDU$ui_graphics_release, reason: not valid java name */
    public static final Bitmap m2733createBitmapx__hDU$ui_graphics_release(int width, int height, int bitmapConfig, boolean hasAlpha, ColorSpace colorSpace) {
        m.h(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, width, height, AndroidImageBitmap_androidKt.m2696toBitmapConfig1JJdX4A(bitmapConfig), hasAlpha, toFrameworkColorSpace$ui_graphics_release(colorSpace));
        m.g(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    @DoNotInline
    public static final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(ColorSpace colorSpace) {
        m.h(colorSpace, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        android.graphics.ColorSpace colorSpace2 = android.graphics.ColorSpace.get(m.c(colorSpace, colorSpaces.getSrgb()) ? ColorSpace.Named.SRGB : m.c(colorSpace, colorSpaces.getAces()) ? ColorSpace.Named.ACES : m.c(colorSpace, colorSpaces.getAcescg()) ? ColorSpace.Named.ACESCG : m.c(colorSpace, colorSpaces.getAdobeRgb()) ? ColorSpace.Named.ADOBE_RGB : m.c(colorSpace, colorSpaces.getBt2020()) ? ColorSpace.Named.BT2020 : m.c(colorSpace, colorSpaces.getBt709()) ? ColorSpace.Named.BT709 : m.c(colorSpace, colorSpaces.getCieLab()) ? ColorSpace.Named.CIE_LAB : m.c(colorSpace, colorSpaces.getCieXyz()) ? ColorSpace.Named.CIE_XYZ : m.c(colorSpace, colorSpaces.getDciP3()) ? ColorSpace.Named.DCI_P3 : m.c(colorSpace, colorSpaces.getDisplayP3()) ? ColorSpace.Named.DISPLAY_P3 : m.c(colorSpace, colorSpaces.getExtendedSrgb()) ? ColorSpace.Named.EXTENDED_SRGB : m.c(colorSpace, colorSpaces.getLinearExtendedSrgb()) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : m.c(colorSpace, colorSpaces.getLinearSrgb()) ? ColorSpace.Named.LINEAR_SRGB : m.c(colorSpace, colorSpaces.getNtsc1953()) ? ColorSpace.Named.NTSC_1953 : m.c(colorSpace, colorSpaces.getProPhotoRgb()) ? ColorSpace.Named.PRO_PHOTO_RGB : m.c(colorSpace, colorSpaces.getSmpteC()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
        m.g(colorSpace2, "get(frameworkNamedSpace)");
        return colorSpace2;
    }

    @DoNotInline
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace$ui_graphics_release(android.graphics.ColorSpace colorSpace) {
        m.h(colorSpace, "<this>");
        return m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SRGB)) ? ColorSpaces.INSTANCE.getSrgb() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACES)) ? ColorSpaces.INSTANCE.getAces() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACESCG)) ? ColorSpaces.INSTANCE.getAcescg() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ADOBE_RGB)) ? ColorSpaces.INSTANCE.getAdobeRgb() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT2020)) ? ColorSpaces.INSTANCE.getBt2020() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT709)) ? ColorSpaces.INSTANCE.getBt709() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_LAB)) ? ColorSpaces.INSTANCE.getCieLab() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_XYZ)) ? ColorSpaces.INSTANCE.getCieXyz() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DCI_P3)) ? ColorSpaces.INSTANCE.getDciP3() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DISPLAY_P3)) ? ColorSpaces.INSTANCE.getDisplayP3() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)) ? ColorSpaces.INSTANCE.getExtendedSrgb() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB)) ? ColorSpaces.INSTANCE.getLinearExtendedSrgb() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_SRGB)) ? ColorSpaces.INSTANCE.getLinearSrgb() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.NTSC_1953)) ? ColorSpaces.INSTANCE.getNtsc1953() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB)) ? ColorSpaces.INSTANCE.getProPhotoRgb() : m.c(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? ColorSpaces.INSTANCE.getSmpteC() : ColorSpaces.INSTANCE.getSrgb();
    }
}
