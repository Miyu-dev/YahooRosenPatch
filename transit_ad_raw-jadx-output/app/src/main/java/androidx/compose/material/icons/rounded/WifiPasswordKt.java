package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: WifiPassword.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiPassword", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiPassword", "Landroidx/compose/material/icons/Icons$Rounded;", "getWifiPassword", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WifiPasswordKt {
    private static ImageVector _wifiPassword;

    public static final ImageVector getWifiPassword(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _wifiPassword;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiPassword", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.49f, 12.13f);
        pathBuilderD.curveTo(16.67f, 10.79f, 14.43f, 10.0f, 12.0f, 10.0f);
        pathBuilderD.curveToRelative(-2.43f, 0.0f, -4.67f, 0.79f, -6.49f, 2.13f);
        pathBuilderD.curveToRelative(-0.72f, 0.53f, -0.76f, 1.6f, -0.13f, 2.24f);
        pathBuilderD.curveToRelative(0.53f, 0.54f, 1.37f, 0.57f, 1.98f, 0.12f);
        pathBuilderD.curveTo(8.67f, 13.55f, 10.27f, 13.0f, 12.0f, 13.0f);
        pathBuilderD.curveToRelative(1.73f, 0.0f, 3.33f, 0.55f, 4.64f, 1.49f);
        pathBuilderD.curveToRelative(0.62f, 0.44f, 1.45f, 0.41f, 1.98f, -0.12f);
        pathBuilderD.curveTo(19.26f, 13.73f, 19.22f, 12.66f, 18.49f, 12.13f);
        pathBuilderD.close();
        pathBuilderD.moveTo(22.8f, 7.89f);
        pathBuilderD.curveTo(19.86f, 5.46f, 16.1f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.reflectiveCurveTo(4.14f, 5.46f, 1.2f, 7.89f);
        pathBuilderD.curveTo(0.53f, 8.44f, 0.49f, 9.47f, 1.11f, 10.1f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.55f, 0.55f, 1.42f, 0.58f, 2.02f, 0.09f);
        pathBuilderD.curveTo(5.55f, 8.2f, 8.64f, 7.0f, 12.0f, 7.0f);
        pathBuilderD.reflectiveCurveToRelative(6.45f, 1.2f, 8.87f, 3.19f);
        pathBuilderD.curveToRelative(0.6f, 0.49f, 1.47f, 0.46f, 2.02f, -0.09f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveTo(23.51f, 9.47f, 23.47f, 8.44f, 22.8f, 7.89f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 16.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(13.1f, 16.0f, 12.0f, 16.0f);
        androidx.compose.animation.a.n(pathBuilderD, 23.0f, 19.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.curveTo(24.0f, 19.45f, 23.55f, 19.0f, 23.0f, 19.0f);
        b.r(pathBuilderD, 22.0f, 19.0f, -2.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiPassword = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
