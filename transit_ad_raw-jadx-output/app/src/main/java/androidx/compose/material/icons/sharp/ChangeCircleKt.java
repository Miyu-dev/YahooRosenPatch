package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: ChangeCircle.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_changeCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ChangeCircle", "Landroidx/compose/material/icons/Icons$Sharp;", "getChangeCircle", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ChangeCircleKt {
    private static ImageVector _changeCircle;

    public static final ImageVector getChangeCircle(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _changeCircle;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ChangeCircle", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        androidx.compose.animation.a.n(pathBuilderD, 12.06f, 19.0f, -2.01f);
        pathBuilderD.curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f);
        pathBuilderD.curveToRelative(-1.28f, 0.0f, -2.56f, -0.49f, -3.54f, -1.46f);
        pathBuilderD.curveToRelative(-1.71f, -1.71f, -1.92f, -4.35f, -0.64f, -6.29f);
        pathBuilderD.lineToRelative(1.1f, 1.1f);
        pathBuilderD.curveToRelative(-0.71f, 1.33f, -0.53f, 3.01f, 0.59f, 4.13f);
        pathBuilderD.curveToRelative(0.7f, 0.7f, 1.62f, 1.03f, 2.54f, 1.01f);
        pathBuilderD.verticalLineToRelative(-2.14f);
        s.r(pathBuilderD, 2.83f, 2.83f, 12.06f, 19.0f);
        pathBuilderD.moveTo(16.17f, 14.76f);
        pathBuilderD.lineToRelative(-1.1f, -1.1f);
        pathBuilderD.curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f);
        pathBuilderD.curveTo(13.79f, 8.84f, 12.9f, 8.5f, 12.0f, 8.5f);
        pathBuilderD.curveToRelative(-0.02f, 0.0f, -0.04f, 0.0f, -0.06f, 0.0f);
        pathBuilderD.verticalLineToRelative(2.15f);
        pathBuilderD.lineTo(9.11f, 7.83f);
        pathBuilderD.lineTo(11.94f, 5.0f);
        pathBuilderD.verticalLineToRelative(2.02f);
        pathBuilderD.curveToRelative(1.3f, -0.02f, 2.61f, 0.45f, 3.6f, 1.45f);
        pathBuilderD.curveTo(17.24f, 10.17f, 17.45f, 12.82f, 16.17f, 14.76f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeCircle = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
