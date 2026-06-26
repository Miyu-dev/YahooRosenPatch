package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: SouthAmerica.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_southAmerica", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SouthAmerica", "Landroidx/compose/material/icons/Icons$Sharp;", "getSouthAmerica", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SouthAmericaKt {
    private static ImageVector _southAmerica;

    public static final ImageVector getSouthAmerica(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _southAmerica;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SouthAmerica", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
        pathBuilderD.moveTo(4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.95f, 0.7f, -3.74f, 1.87f, -5.13f);
        pathBuilderD.lineTo(9.0f, 10.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(5.59f);
        pathBuilderD.curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f);
        pathBuilderD.lineTo(12.0f, 20.0f);
        pathBuilderD.curveTo(7.58f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f);
        h.A(pathBuilderD, 13.0f, 19.94f, 18.0f);
        pathBuilderD.lineToRelative(3.75f, -5.62f);
        pathBuilderD.curveToRelative(0.16f, -0.25f, 0.25f, -0.54f, 0.25f, -0.83f);
        pathBuilderD.verticalLineTo(10.5f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(-1.5f);
        pathBuilderD.lineToRelative(-1.4f, -1.75f);
        pathBuilderD.curveTo(12.72f, 7.28f, 12.15f, 7.0f, 11.54f, 7.0f);
        pathBuilderD.horizontalLineTo(8.0f);
        pathBuilderD.verticalLineTo(5.07f);
        pathBuilderD.curveTo(9.18f, 4.39f, 10.54f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderD.curveTo(20.0f, 16.07f, 16.94f, 19.44f, 13.0f, 19.94f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _southAmerica = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
