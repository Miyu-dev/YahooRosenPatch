package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: WifiTethering.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiTethering", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiTethering", "Landroidx/compose/material/icons/Icons$Rounded;", "getWifiTethering", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WifiTetheringKt {
    private static ImageVector _wifiTethering;

    public static final ImageVector getWifiTethering(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _wifiTethering;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiTethering", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 11.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, -3.56f, -3.11f, -6.4f, -6.75f, -5.95f);
        pathBuilderD.curveToRelative(-2.62f, 0.32f, -4.78f, 2.41f, -5.18f, 5.02f);
        pathBuilderD.curveToRelative(-0.33f, 2.15f, 0.49f, 4.11f, 1.93f, 5.4f);
        pathBuilderD.curveToRelative(0.48f, 0.43f, 1.23f, 0.33f, 1.56f, -0.23f);
        pathBuilderD.lineToRelative(0.01f, -0.01f);
        pathBuilderD.curveToRelative(0.24f, -0.42f, 0.14f, -0.93f, -0.22f, -1.26f);
        pathBuilderD.curveToRelative(-1.03f, -0.93f, -1.59f, -2.37f, -1.22f, -3.94f);
        pathBuilderD.curveToRelative(0.33f, -1.42f, 1.48f, -2.57f, 2.9f, -2.91f);
        pathBuilderD.curveTo(13.65f, 8.49f, 16.0f, 10.47f, 16.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, 1.18f, -0.52f, 2.23f, -1.33f, 2.96f);
        pathBuilderD.curveToRelative(-0.36f, 0.32f, -0.47f, 0.84f, -0.23f, 1.26f);
        pathBuilderD.lineToRelative(0.01f, 0.01f);
        pathBuilderD.curveToRelative(0.31f, 0.53f, 1.03f, 0.69f, 1.5f, 0.28f);
        pathBuilderD.curveTo(17.2f, 16.41f, 18.0f, 14.8f, 18.0f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.83f, 3.07f);
        pathBuilderD.curveToRelative(-4.62f, 0.52f, -8.35f, 4.33f, -8.78f, 8.96f);
        pathBuilderD.curveToRelative(-0.35f, 3.7f, 1.32f, 7.02f, 4.02f, 9.01f);
        pathBuilderD.curveToRelative(0.48f, 0.35f, 1.16f, 0.2f, 1.46f, -0.31f);
        pathBuilderD.curveToRelative(0.25f, -0.43f, 0.14f, -0.99f, -0.26f, -1.29f);
        pathBuilderD.curveToRelative(-2.28f, -1.69f, -3.65f, -4.55f, -3.16f, -7.7f);
        pathBuilderD.curveToRelative(0.54f, -3.5f, 3.46f, -6.29f, 6.98f, -6.68f);
        pathBuilderD.curveTo(15.91f, 4.51f, 20.0f, 8.28f, 20.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, 2.65f, -1.29f, 4.98f, -3.27f, 6.44f);
        pathBuilderD.curveToRelative(-0.4f, 0.3f, -0.51f, 0.85f, -0.26f, 1.29f);
        pathBuilderD.curveToRelative(0.3f, 0.52f, 0.98f, 0.66f, 1.46f, 0.31f);
        pathBuilderD.curveTo(20.4f, 19.22f, 22.0f, 16.3f, 22.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, -5.91f, -5.13f, -10.62f, -11.17f, -9.93f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiTethering = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
