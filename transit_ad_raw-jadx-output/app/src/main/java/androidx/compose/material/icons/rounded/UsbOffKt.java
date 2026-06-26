package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
import androidx.compose.animation.b;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: UsbOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_usbOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "UsbOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getUsbOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class UsbOffKt {
    private static ImageVector _usbOff;

    public static final ImageVector getUsbOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _usbOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.UsbOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(9.6f, 5.2f, 2.0f, -2.67f);
        pathBuilderA.curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f);
        pathBuilderA.lineToRelative(2.0f, 2.67f);
        pathBuilderA.curveTo(14.65f, 5.53f, 14.41f, 6.0f, 14.0f, 6.0f);
        s.s(pathBuilderA, -1.0f, 4.17f, -2.0f, -2.0f);
        pathBuilderA.verticalLineTo(6.0f);
        pathBuilderA.horizontalLineToRelative(-1.0f);
        pathBuilderA.curveTo(9.59f, 6.0f, 9.35f, 5.53f, 9.6f, 5.2f);
        a.q(pathBuilderA, 15.5f, 12.0f, 16.0f, 1.17f);
        pathBuilderA.lineToRelative(1.77f, 1.77f);
        pathBuilderA.curveTo(17.91f, 14.66f, 18.0f, 14.34f, 18.0f, 14.0f);
        pathBuilderA.verticalLineToRelative(-2.0f);
        pathBuilderA.horizontalLineToRelative(0.5f);
        pathBuilderA.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderA.verticalLineToRelative(-3.0f);
        pathBuilderA.curveTo(19.0f, 8.22f, 18.78f, 8.0f, 18.5f, 8.0f);
        pathBuilderA.horizontalLineToRelative(-3.0f);
        pathBuilderA.curveTo(15.22f, 8.0f, 15.0f, 8.22f, 15.0f, 8.5f);
        pathBuilderA.verticalLineToRelative(3.0f);
        pathBuilderA.curveTo(15.0f, 11.78f, 15.22f, 12.0f, 15.5f, 12.0f);
        androidx.compose.animation.a.t(pathBuilderA, 20.49f, 21.9f, 20.49f, 21.9f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        androidx.compose.animation.a.r(pathBuilderA, -5.9f, -5.9f, 13.0f, 2.28f);
        pathBuilderA.curveToRelative(0.6f, 0.34f, 1.0f, 0.98f, 1.0f, 1.72f);
        pathBuilderA.curveToRelative(0.0f, 1.2f, -1.07f, 2.16f, -2.31f, 1.98f);
        pathBuilderA.curveToRelative(-0.88f, -0.13f, -1.59f, -0.88f, -1.68f, -1.77f);
        pathBuilderA.curveToRelative(-0.08f, -0.83f, 0.33f, -1.55f, 0.99f, -1.93f);
        pathBuilderA.verticalLineTo(16.0f);
        pathBuilderA.horizontalLineTo(8.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderA.verticalLineToRelative(-2.28f);
        pathBuilderA.curveTo(5.4f, 11.38f, 5.0f, 10.74f, 5.0f, 10.0f);
        pathBuilderA.curveToRelative(0.0f, -0.59f, 0.26f, -1.13f, 0.68f, -1.5f);
        pathBuilderA.lineTo(2.1f, 4.93f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderA.lineToRelative(16.97f, 16.97f);
        pathBuilderA.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        a.y(pathBuilderA, 11.0f, 13.83f, -2.51f, -2.51f);
        pathBuilderA.curveToRelative(-0.14f, 0.16f, -0.31f, 0.29f, -0.49f, 0.4f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.q(pathBuilderA, 14.0f, 3.0f, 13.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _usbOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
