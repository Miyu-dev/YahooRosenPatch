package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: LeaveBagsAtHome.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_leaveBagsAtHome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LeaveBagsAtHome", "Landroidx/compose/material/icons/Icons$Rounded;", "getLeaveBagsAtHome", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LeaveBagsAtHomeKt {
    private static ImageVector _leaveBagsAtHome;

    public static final ImageVector getLeaveBagsAtHome(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _leaveBagsAtHome;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LeaveBagsAtHome", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(11.86f, 9.03f);
        pathBuilderD.curveTo(11.91f, 9.02f, 11.95f, 9.0f, 12.0f, 9.0f);
        pathBuilderD.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        a.z(pathBuilderD, 0.17f, 1.75f, 1.75f, 9.75f);
        pathBuilderD.curveTo(14.5f, 9.34f, 14.84f, 9.0f, 15.25f, 9.0f);
        pathBuilderD.reflectiveCurveTo(16.0f, 9.34f, 16.0f, 9.75f);
        a.z(pathBuilderD, 3.42f, 3.0f, 3.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(-2.0f);
        pathBuilderD.verticalLineTo(3.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(-4.0f);
        pathBuilderD.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.horizontalLineTo(8.83f);
        pathBuilderD.lineTo(11.86f, 9.03f);
        pathBuilderD.close();
        androidx.appcompat.view.menu.a.x(pathBuilderD, 11.0f, 4.0f, 2.0f, 2.0f);
        b.m(pathBuilderD, -2.0f, 4.0f, 20.49f, 20.49f);
        pathBuilderD.lineTo(3.51f, 3.51f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(2.92f, 2.92f);
        pathBuilderD.curveTo(5.02f, 7.9f, 5.0f, 7.95f, 5.0f, 8.0f);
        pathBuilderD.verticalLineToRelative(11.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f);
        pathBuilderD.lineToRelative(1.14f, 1.14f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.75f, 18.0f);
        pathBuilderD.curveTo(8.34f, 18.0f, 8.0f, 17.66f, 8.0f, 17.25f);
        androidx.compose.animation.a.q(pathBuilderD, -6.42f, 1.5f, 1.5f, 4.92f);
        pathBuilderD.curveTo(9.5f, 17.66f, 9.16f, 18.0f, 8.75f, 18.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 18.0f);
        pathBuilderD.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        androidx.compose.animation.a.q(pathBuilderD, -3.17f, 1.5f, 1.5f, 1.67f);
        pathBuilderD.curveTo(12.75f, 17.66f, 12.41f, 18.0f, 12.0f, 18.0f);
        a.y(pathBuilderD, 14.52f, 17.35f, 0.63f, 0.63f);
        pathBuilderD.curveTo(14.82f, 17.93f, 14.57f, 17.68f, 14.52f, 17.35f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leaveBagsAtHome = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
