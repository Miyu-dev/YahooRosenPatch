package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: WifiOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiOff", "Landroidx/compose/material/icons/Icons$Filled;", "getWifiOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WifiOffKt {
    private static ImageVector _wifiOff;

    public static final ImageVector getWifiOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _wifiOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WifiOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(22.99f, 9.0f);
        pathBuilderD.curveTo(19.15f, 5.16f, 13.8f, 3.76f, 8.84f, 4.78f);
        pathBuilderD.lineToRelative(2.52f, 2.52f);
        pathBuilderD.curveToRelative(3.47f, -0.17f, 6.99f, 1.05f, 9.63f, 3.7f);
        android.support.v4.media.a.t(pathBuilderD, 2.0f, -2.0f, 18.99f, 13.0f);
        pathBuilderD.curveToRelative(-1.29f, -1.29f, -2.84f, -2.13f, -4.49f, -2.56f);
        android.support.v4.media.a.n(pathBuilderD, 3.53f, 3.53f, 0.96f, -0.97f);
        pathBuilderD.moveTo(2.0f, 3.05f);
        pathBuilderD.lineTo(5.07f, 6.1f);
        pathBuilderD.curveTo(3.6f, 6.82f, 2.22f, 7.78f, 1.0f, 9.0f);
        pathBuilderD.lineToRelative(1.99f, 2.0f);
        pathBuilderD.curveToRelative(1.24f, -1.24f, 2.67f, -2.16f, 4.2f, -2.77f);
        pathBuilderD.lineToRelative(2.24f, 2.24f);
        pathBuilderD.curveTo(7.81f, 10.89f, 6.27f, 11.73f, 5.0f, 13.0f);
        pathBuilderD.verticalLineToRelative(0.01f);
        pathBuilderD.lineTo(6.99f, 15.0f);
        pathBuilderD.curveToRelative(1.36f, -1.36f, 3.14f, -2.04f, 4.92f, -2.06f);
        pathBuilderD.lineTo(18.98f, 20.0f);
        pathBuilderD.lineToRelative(1.27f, -1.26f);
        android.support.v4.media.a.C(pathBuilderD, 3.29f, 1.79f, 2.0f, 3.05f);
        pathBuilderD.moveTo(9.0f, 17.0f);
        pathBuilderD.lineToRelative(3.0f, 3.0f);
        pathBuilderD.lineToRelative(3.0f, -3.0f);
        pathBuilderD.curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
