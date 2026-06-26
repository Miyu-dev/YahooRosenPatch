package androidx.compose.material.icons.filled;

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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rocketLaunch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RocketLaunch", "Landroidx/compose/material/icons/Icons$Filled;", "getRocketLaunch", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RocketLaunchKt {
    private static ImageVector _rocketLaunch;

    public static final ImageVector getRocketLaunch(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RocketLaunch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(9.19f, 6.35f);
        pathBuilderD.curveToRelative(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
        pathBuilderD.lineTo(2.0f, 10.69f);
        pathBuilderD.lineToRelative(4.05f, -4.05f);
        pathBuilderD.curveToRelative(0.47f, -0.47f, 1.15f, -0.68f, 1.81f, -0.55f);
        android.support.v4.media.a.C(pathBuilderD, 9.19f, 6.35f, 9.19f, 6.35f);
        pathBuilderD.moveTo(11.17f, 17.0f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 3.74f, -1.55f, 5.89f, -3.7f);
        pathBuilderD.curveToRelative(5.4f, -5.4f, 4.5f, -9.62f, 4.21f, -10.57f);
        pathBuilderD.curveToRelative(-0.95f, -0.3f, -5.17f, -1.19f, -10.57f, 4.21f);
        pathBuilderD.curveTo(8.55f, 9.09f, 7.0f, 12.83f, 7.0f, 12.83f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 11.17f, 17.0f, 17.65f, 14.81f);
        pathBuilderD.curveToRelative(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
        pathBuilderD.lineTo(13.31f, 22.0f);
        pathBuilderD.lineToRelative(4.05f, -4.05f);
        pathBuilderD.curveToRelative(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
        android.support.v4.media.a.C(pathBuilderD, 17.65f, 14.81f, 17.65f, 14.81f);
        pathBuilderD.moveTo(9.0f, 18.0f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, -0.34f, 1.58f, -0.88f, 2.12f);
        pathBuilderD.curveTo(6.94f, 21.3f, 2.0f, 22.0f, 2.0f, 22.0f);
        pathBuilderD.reflectiveCurveToRelative(0.7f, -4.94f, 1.88f, -6.12f);
        pathBuilderD.curveTo(4.42f, 15.34f, 5.17f, 15.0f, 6.0f, 15.0f);
        pathBuilderD.curveTo(7.66f, 15.0f, 9.0f, 16.34f, 9.0f, 18.0f);
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
