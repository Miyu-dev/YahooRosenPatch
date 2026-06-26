package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: RocketLaunch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rocketLaunch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RocketLaunch", "Landroidx/compose/material/icons/Icons$Rounded;", "getRocketLaunch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RocketLaunchKt {
    private static ImageVector _rocketLaunch;

    public static final ImageVector getRocketLaunch(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RocketLaunch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(9.19f, 6.35f);
        pathBuilderD.curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
        pathBuilderD.lineToRelative(-2.26f, -0.97f);
        pathBuilderD.curveToRelative(-0.65f, -0.28f, -0.81f, -1.13f, -0.31f, -1.63f);
        pathBuilderD.lineToRelative(3.01f, -3.01f);
        pathBuilderD.curveToRelative(0.47f, -0.47f, 1.15f, -0.68f, 1.81f, -0.55f);
        android.support.v4.media.a.C(pathBuilderD, 9.19f, 6.35f, 9.19f, 6.35f);
        pathBuilderD.moveTo(10.68f, 16.51f);
        pathBuilderD.curveToRelative(0.3f, 0.3f, 0.74f, 0.38f, 1.12f, 0.2f);
        pathBuilderD.curveToRelative(1.16f, -0.54f, 3.65f, -1.81f, 5.26f, -3.42f);
        pathBuilderD.curveToRelative(4.59f, -4.59f, 4.63f, -8.33f, 4.36f, -9.93f);
        pathBuilderD.curveToRelative(-0.07f, -0.4f, -0.39f, -0.72f, -0.79f, -0.79f);
        pathBuilderD.curveToRelative(-1.6f, -0.27f, -5.34f, -0.23f, -9.93f, 4.36f);
        pathBuilderD.curveToRelative(-1.61f, 1.61f, -2.87f, 4.1f, -3.42f, 5.26f);
        pathBuilderD.curveToRelative(-0.18f, 0.38f, -0.09f, 0.83f, 0.2f, 1.12f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 10.68f, 16.51f, 17.65f, 14.81f);
        pathBuilderD.curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
        pathBuilderD.lineToRelative(0.97f, 2.26f);
        pathBuilderD.curveToRelative(0.28f, 0.65f, 1.13f, 0.81f, 1.63f, 0.31f);
        pathBuilderD.lineToRelative(3.01f, -3.01f);
        pathBuilderD.curveToRelative(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
        android.support.v4.media.a.C(pathBuilderD, 17.65f, 14.81f, 17.65f, 14.81f);
        pathBuilderD.moveTo(8.94f, 17.41f);
        pathBuilderD.curveToRelative(0.2f, 1.06f, -0.15f, 2.04f, -0.82f, 2.71f);
        pathBuilderD.curveToRelative(-0.77f, 0.77f, -3.16f, 1.34f, -4.71f, 1.64f);
        pathBuilderD.curveToRelative(-0.69f, 0.13f, -1.3f, -0.48f, -1.17f, -1.17f);
        pathBuilderD.curveToRelative(0.3f, -1.55f, 0.86f, -3.94f, 1.64f, -4.71f);
        pathBuilderD.curveToRelative(0.67f, -0.67f, 1.65f, -1.02f, 2.71f, -0.82f);
        pathBuilderD.curveTo(7.76f, 15.28f, 8.72f, 16.24f, 8.94f, 17.41f);
        pathBuilderD.close();
        pathBuilderD.moveTo(13.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 13.0f, 10.1f, 13.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocketLaunch = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
