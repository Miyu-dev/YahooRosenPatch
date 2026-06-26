package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: SportsSoccer.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsSoccer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsSoccer", "Landroidx/compose/material/icons/Icons$Rounded;", "getSportsSoccer", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsSoccerKt {
    private static ImageVector _sportsSoccer;

    public static final ImageVector getSportsSoccer(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _sportsSoccer;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsSoccer", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        a.y(pathBuilderD, 13.0f, 5.3f, 1.35f, -0.95f);
        pathBuilderD.curveToRelative(1.82f, 0.56f, 3.37f, 1.76f, 4.38f, 3.34f);
        pathBuilderD.lineToRelative(-0.39f, 1.34f);
        pathBuilderD.lineToRelative(-1.35f, 0.46f);
        h.y(pathBuilderD, 13.0f, 6.7f, 5.3f);
        pathBuilderD.moveTo(9.65f, 4.35f);
        pathBuilderD.lineTo(11.0f, 5.3f);
        pathBuilderD.verticalLineToRelative(1.4f);
        pathBuilderD.lineTo(7.01f, 9.49f);
        pathBuilderD.lineTo(5.66f, 9.03f);
        pathBuilderD.lineTo(5.27f, 7.69f);
        pathBuilderD.curveTo(6.28f, 6.12f, 7.83f, 4.92f, 9.65f, 4.35f);
        a.y(pathBuilderD, 7.08f, 17.11f, -1.14f, 0.1f);
        pathBuilderD.curveTo(4.73f, 15.81f, 4.0f, 13.99f, 4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -0.12f, 0.01f, -0.23f, 0.02f, -0.35f);
        pathBuilderD.lineToRelative(1.0f, -0.73f);
        pathBuilderD.lineTo(6.4f, 11.4f);
        s.r(pathBuilderD, 1.46f, 4.34f, 7.08f, 17.11f);
        pathBuilderD.moveTo(14.5f, 19.59f);
        pathBuilderD.curveTo(13.71f, 19.85f, 12.87f, 20.0f, 12.0f, 20.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.71f, -0.15f, -2.5f, -0.41f);
        pathBuilderD.lineToRelative(-0.69f, -1.49f);
        pathBuilderD.lineTo(9.45f, 17.0f);
        pathBuilderD.horizontalLineToRelative(5.11f);
        s.r(pathBuilderD, 0.64f, 1.11f, 14.5f, 19.59f);
        pathBuilderD.moveTo(14.27f, 15.0f);
        pathBuilderD.horizontalLineTo(9.73f);
        pathBuilderD.lineToRelative(-1.35f, -4.02f);
        pathBuilderD.lineTo(12.0f, 8.44f);
        s.r(pathBuilderD, 3.63f, 2.54f, 14.27f, 15.0f);
        pathBuilderD.moveTo(18.06f, 17.21f);
        pathBuilderD.lineToRelative(-1.14f, -0.1f);
        pathBuilderD.lineToRelative(-0.79f, -1.37f);
        pathBuilderD.lineToRelative(1.46f, -4.34f);
        pathBuilderD.lineToRelative(1.39f, -0.47f);
        pathBuilderD.lineToRelative(1.0f, 0.73f);
        pathBuilderD.curveTo(19.99f, 11.77f, 20.0f, 11.88f, 20.0f, 12.0f);
        pathBuilderD.curveTo(20.0f, 13.99f, 19.27f, 15.81f, 18.06f, 17.21f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsSoccer = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
