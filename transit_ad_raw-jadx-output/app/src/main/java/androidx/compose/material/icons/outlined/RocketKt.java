package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Rocket.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rocket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rocket", "Landroidx/compose/material/icons/Icons$Outlined;", "getRocket", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RocketKt {
    private static ImageVector _rocket;

    public static final ImageVector getRocket(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Rocket", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.0f, 11.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.98f, 18.25f);
        pathBuilderD.curveToRelative(-0.29f, -0.9f, -0.57f, -1.94f, -0.76f, -3.0f);
        pathBuilderD.lineTo(6.0f, 16.07f);
        h.q(pathBuilderD, 2.98f, 7.98f, 18.25f);
        pathBuilderD.moveTo(12.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 5.0f, 2.0f, 5.0f, 11.0f);
        pathBuilderD.lineToRelative(2.11f, 1.41f);
        pathBuilderD.curveToRelative(0.56f, 0.37f, 0.89f, 1.0f, 0.89f, 1.66f);
        pathBuilderD.verticalLineTo(22.0f);
        pathBuilderD.lineToRelative(-5.0f, -2.0f);
        pathBuilderD.horizontalLineTo(9.0f);
        pathBuilderD.lineToRelative(-5.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(-5.93f);
        pathBuilderD.curveToRelative(0.0f, -0.67f, 0.33f, -1.29f, 0.89f, -1.66f);
        pathBuilderD.lineTo(7.0f, 13.0f);
        pathBuilderD.curveTo(7.0f, 4.0f, 12.0f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 4.36f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, -3.0f, 2.02f, -3.0f, 8.64f);
        pathBuilderD.curveToRelative(0.0f, 2.25f, 1.0f, 5.0f, 1.0f, 5.0f);
        pathBuilderD.horizontalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 1.0f, -2.75f, 1.0f, -5.0f);
        pathBuilderD.curveTo(15.0f, 6.38f, 12.0f, 4.36f, 12.0f, 4.36f);
        androidx.compose.animation.a.n(pathBuilderD, 18.0f, 19.05f, -2.98f);
        pathBuilderD.lineToRelative(-1.22f, -0.81f);
        pathBuilderD.curveToRelative(-0.19f, 1.05f, -0.47f, 2.1f, -0.76f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 18.0f, 19.05f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rocket = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
