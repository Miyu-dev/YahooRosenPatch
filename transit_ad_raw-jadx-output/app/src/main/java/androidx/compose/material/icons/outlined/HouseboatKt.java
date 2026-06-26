package androidx.compose.material.icons.outlined;

import a.b;
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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Houseboat.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_houseboat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Houseboat", "Landroidx/compose/material/icons/Icons$Outlined;", "getHouseboat", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HouseboatKt {
    private static ImageVector _houseboat;

    public static final ImageVector getHouseboat(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _houseboat;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Houseboat", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 16.0f);
        pathBuilderD.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilderD.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilderD.curveTo(3.38f, 16.0f, 3.24f, 17.0f, 2.0f, 17.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f);
        pathBuilderD.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilderD.curveToRelative(1.95f, 0.0f, 2.08f, -1.0f, 3.32f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.37f, 1.0f, 3.32f, 1.0f);
        pathBuilderD.curveToRelative(1.91f, 0.0f, 2.14f, -1.0f, 3.33f, -1.0f);
        pathBuilderD.curveToRelative(1.18f, 0.0f, 1.45f, 1.0f, 3.35f, 1.0f);
        pathBuilderD.verticalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        pathBuilderD.curveToRelative(-1.91f, 0.0f, -2.14f, 1.0f, -3.33f, 1.0f);
        pathBuilderD.curveTo(14.1f, 17.0f, 13.95f, 16.0f, 12.0f, 16.0f);
        a.y(pathBuilderD, 20.34f, 11.34f, -1.37f, 1.37f);
        pathBuilderD.curveTo(18.78f, 12.89f, 18.52f, 13.0f, 18.26f, 13.0f);
        pathBuilderD.horizontalLineTo(17.0f);
        pathBuilderD.verticalLineTo(9.65f);
        pathBuilderD.lineToRelative(1.32f, 0.97f);
        pathBuilderD.lineTo(19.5f, 9.0f);
        pathBuilderD.lineTo(12.0f, 3.5f);
        pathBuilderD.lineTo(4.5f, 9.0f);
        pathBuilderD.lineToRelative(1.18f, 1.61f);
        a.D(pathBuilderD, 7.0f, 9.65f, 13.0f, 5.74f);
        pathBuilderD.curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f);
        pathBuilderD.lineToRelative(-1.37f, -1.37f);
        pathBuilderD.lineToRelative(-1.41f, 1.41f);
        pathBuilderD.lineToRelative(1.37f, 1.37f);
        pathBuilderD.curveTo(4.18f, 14.68f, 4.95f, 15.0f, 5.74f, 15.0f);
        pathBuilderD.horizontalLineToRelative(12.51f);
        pathBuilderD.curveToRelative(0.8f, 0.0f, 1.56f, -0.32f, 2.12f, -0.88f);
        s.r(pathBuilderD, 1.37f, -1.37f, 20.34f, 11.34f);
        b.y(pathBuilderD, 13.0f, 13.0f, -2.0f, -2.0f);
        i.c(pathBuilderD, 2.0f, 9.0f, 8.18f);
        pathBuilderD.lineToRelative(3.0f, -2.2f);
        pathBuilderD.lineToRelative(3.0f, 2.2f);
        pathBuilderD.verticalLineTo(13.0f);
        pathBuilderD.horizontalLineTo(13.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _houseboat = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
