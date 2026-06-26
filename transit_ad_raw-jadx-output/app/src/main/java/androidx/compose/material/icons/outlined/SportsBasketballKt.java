package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: SportsBasketball.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsBasketball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsBasketball", "Landroidx/compose/material/icons/Icons$Outlined;", "getSportsBasketball", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsBasketballKt {
    private static ImageVector _sportsBasketball;

    public static final ImageVector getSportsBasketball(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _sportsBasketball;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsBasketball", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(5.23f, 7.75f);
        pathBuilderD.curveTo(6.1f, 8.62f, 6.7f, 9.74f, 6.91f, 11.0f);
        pathBuilderD.horizontalLineTo(4.07f);
        pathBuilderD.curveTo(4.22f, 9.82f, 4.63f, 8.72f, 5.23f, 7.75f);
        androidx.compose.animation.a.j(pathBuilderD, 4.07f, 13.0f, 2.84f);
        pathBuilderD.curveToRelative(-0.21f, 1.26f, -0.81f, 2.38f, -1.68f, 3.25f);
        pathBuilderD.curveTo(4.63f, 15.28f, 4.22f, 14.18f, 4.07f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(11.0f, 19.93f);
        pathBuilderD.curveToRelative(-1.73f, -0.22f, -3.29f, -1.0f, -4.49f, -2.14f);
        pathBuilderD.curveToRelative(1.3f, -1.24f, 2.19f, -2.91f, 2.42f, -4.79f);
        b.B(pathBuilderD, 11.0f, 19.93f, 11.0f, 11.0f);
        pathBuilderD.horizontalLineTo(8.93f);
        pathBuilderD.curveTo(8.69f, 9.12f, 7.81f, 7.44f, 6.5f, 6.2f);
        pathBuilderD.curveTo(7.71f, 5.06f, 9.27f, 4.29f, 11.0f, 4.07f);
        androidx.appcompat.view.menu.a.B(pathBuilderD, 11.0f, 19.93f, 11.0f, -2.84f);
        pathBuilderD.curveToRelative(0.21f, -1.26f, 0.81f, -2.38f, 1.68f, -3.25f);
        pathBuilderD.curveTo(19.37f, 8.72f, 19.78f, 9.82f, 19.93f, 11.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(13.0f, 4.07f);
        pathBuilderD.curveToRelative(1.73f, 0.22f, 3.29f, 0.99f, 4.5f, 2.13f);
        pathBuilderD.curveToRelative(-1.31f, 1.24f, -2.19f, 2.92f, -2.43f, 4.8f);
        b.B(pathBuilderD, 13.0f, 4.07f, 13.0f, 19.93f);
        pathBuilderD.verticalLineTo(13.0f);
        pathBuilderD.horizontalLineToRelative(2.07f);
        pathBuilderD.curveToRelative(0.24f, 1.88f, 1.12f, 3.55f, 2.42f, 4.79f);
        pathBuilderD.curveTo(16.29f, 18.93f, 14.73f, 19.71f, 13.0f, 19.93f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.77f, 16.25f);
        pathBuilderD.curveToRelative(-0.87f, -0.86f, -1.46f, -1.99f, -1.68f, -3.25f);
        pathBuilderD.horizontalLineToRelative(2.84f);
        pathBuilderD.curveTo(19.78f, 14.18f, 19.37f, 15.28f, 18.77f, 16.25f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsBasketball = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
