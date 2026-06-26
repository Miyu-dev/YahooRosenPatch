package androidx.compose.material.icons.sharp;

import a6.h;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiPassword", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiPassword", "Landroidx/compose/material/icons/Icons$Sharp;", "getWifiPassword", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WifiPasswordKt {
    private static ImageVector _wifiPassword;

    public static final ImageVector getWifiPassword(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _wifiPassword;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WifiPassword", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(24.0f, 8.98f, -2.12f, 2.13f);
        pathBuilderA.curveTo(19.35f, 8.57f, 15.85f, 7.0f, 12.0f, 7.0f);
        pathBuilderA.reflectiveCurveToRelative(-7.35f, 1.57f, -9.88f, 4.11f);
        pathBuilderA.lineTo(0.0f, 8.98f);
        pathBuilderA.curveTo(3.07f, 5.9f, 7.31f, 4.0f, 12.0f, 4.0f);
        pathBuilderA.reflectiveCurveTo(20.93f, 5.9f, 24.0f, 8.98f);
        a.y(pathBuilderA, 4.24f, 13.22f, 2.12f, 2.12f);
        pathBuilderA.curveTo(7.8f, 13.9f, 9.8f, 13.0f, 12.0f, 13.0f);
        pathBuilderA.curveToRelative(2.2f, 0.0f, 4.2f, 0.9f, 5.64f, 2.35f);
        pathBuilderA.lineToRelative(2.12f, -2.12f);
        pathBuilderA.curveTo(17.78f, 11.23f, 15.03f, 10.0f, 12.0f, 10.0f);
        pathBuilderA.curveTo(8.97f, 10.0f, 6.22f, 11.23f, 4.24f, 13.22f);
        androidx.appcompat.app.m.n(pathBuilderA, 24.0f, 19.0f, 5.0f, -6.0f);
        android.support.v4.media.a.m(pathBuilderA, -5.0f, 1.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        h.z(pathBuilderA, 1.0f, 24.0f, 22.0f, 18.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderA, 1.0f, 2.0f, 18.0f);
        pathBuilderA.moveTo(12.0f, 16.0f);
        pathBuilderA.curveToRelative(-1.38f, 0.0f, -2.63f, 0.56f, -3.53f, 1.46f);
        pathBuilderA.lineTo(12.0f, 21.0f);
        pathBuilderA.lineToRelative(3.53f, -3.54f);
        pathBuilderA.curveTo(14.63f, 16.56f, 13.38f, 16.0f, 12.0f, 16.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiPassword = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
