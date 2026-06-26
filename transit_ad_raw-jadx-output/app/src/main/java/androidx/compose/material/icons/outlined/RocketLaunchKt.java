package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rocketLaunch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RocketLaunch", "Landroidx/compose/material/icons/Icons$Outlined;", "getRocketLaunch", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RocketLaunchKt {
    private static ImageVector _rocketLaunch;

    public static final ImageVector getRocketLaunch(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RocketLaunch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.0f, 15.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.58f, 0.34f, -2.12f, 0.88f);
        pathBuilderD.curveTo(2.7f, 17.06f, 2.0f, 22.0f, 2.0f, 22.0f);
        pathBuilderD.reflectiveCurveToRelative(4.94f, -0.7f, 6.12f, -1.88f);
        pathBuilderD.curveTo(8.66f, 19.58f, 9.0f, 18.83f, 9.0f, 18.0f);
        pathBuilderD.curveTo(9.0f, 16.34f, 7.66f, 15.0f, 6.0f, 15.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.71f, 18.71f);
        pathBuilderD.curveToRelative(-0.28f, 0.28f, -2.17f, 0.76f, -2.17f, 0.76f);
        pathBuilderD.reflectiveCurveToRelative(0.47f, -1.88f, 0.76f, -2.17f);
        pathBuilderD.curveTo(5.47f, 17.11f, 5.72f, 17.0f, 6.0f, 17.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.curveTo(7.0f, 18.28f, 6.89f, 18.53f, 6.71f, 18.71f);
        androidx.compose.animation.a.t(pathBuilderD, 17.42f, 13.65f, 17.42f, 13.65f);
        pathBuilderD.curveToRelative(6.36f, -6.36f, 4.24f, -11.31f, 4.24f, -11.31f);
        pathBuilderD.reflectiveCurveToRelative(-4.95f, -2.12f, -11.31f, 4.24f);
        pathBuilderD.lineToRelative(-2.49f, -0.5f);
        pathBuilderD.curveTo(7.21f, 5.95f, 6.53f, 6.16f, 6.05f, 6.63f);
        pathBuilderD.lineTo(2.0f, 10.69f);
        pathBuilderD.lineToRelative(5.0f, 2.14f);
        pathBuilderD.lineTo(11.17f, 17.0f);
        pathBuilderD.lineToRelative(2.14f, 5.0f);
        pathBuilderD.lineToRelative(4.05f, -4.05f);
        pathBuilderD.curveToRelative(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 17.42f, 13.65f, 7.41f, 10.83f);
        pathBuilderD.lineTo(5.5f, 10.01f);
        pathBuilderD.lineToRelative(1.97f, -1.97f);
        pathBuilderD.lineToRelative(1.44f, 0.29f);
        pathBuilderD.curveTo(8.34f, 9.16f, 7.83f, 10.03f, 7.41f, 10.83f);
        a.y(pathBuilderD, 13.99f, 18.5f, -0.82f, -1.91f);
        pathBuilderD.curveToRelative(0.8f, -0.42f, 1.67f, -0.93f, 2.49f, -1.5f);
        s.r(pathBuilderD, 0.29f, 1.44f, 13.99f, 18.5f);
        pathBuilderD.moveTo(16.0f, 12.24f);
        pathBuilderD.curveToRelative(-1.32f, 1.32f, -3.38f, 2.4f, -4.04f, 2.73f);
        pathBuilderD.lineToRelative(-2.93f, -2.93f);
        pathBuilderD.curveToRelative(0.32f, -0.65f, 1.4f, -2.71f, 2.73f, -4.04f);
        pathBuilderD.curveToRelative(4.68f, -4.68f, 8.23f, -3.99f, 8.23f, -3.99f);
        pathBuilderD.reflectiveCurveTo(20.68f, 7.56f, 16.0f, 12.24f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.0f, 11.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 13.9f, 11.0f, 15.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocketLaunch = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
