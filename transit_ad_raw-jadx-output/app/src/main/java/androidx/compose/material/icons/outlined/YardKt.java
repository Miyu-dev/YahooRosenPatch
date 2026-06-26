package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Yard.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_yard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Yard", "Landroidx/compose/material/icons/Icons$Outlined;", "getYard", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class YardKt {
    private static ImageVector _yard;

    public static final ImageVector getYard(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _yard;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Yard", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.0f, 13.0f);
        pathBuilderD.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilderD.curveTo(15.31f, 19.0f, 18.0f, 16.31f, 18.0f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilderD.curveTo(12.0f, 15.69f, 9.31f, 13.0f, 6.0f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.0f, 11.03f);
        pathBuilderD.curveToRelative(0.0f, 0.86f, 0.7f, 1.56f, 1.56f, 1.56f);
        pathBuilderD.curveToRelative(0.33f, 0.0f, 0.63f, -0.1f, 0.89f, -0.28f);
        pathBuilderD.lineToRelative(-0.01f, 0.12f);
        pathBuilderD.curveToRelative(0.0f, 0.86f, 0.7f, 1.56f, 1.56f, 1.56f);
        pathBuilderD.reflectiveCurveToRelative(1.56f, -0.7f, 1.56f, -1.56f);
        pathBuilderD.lineToRelative(-0.01f, -0.12f);
        pathBuilderD.curveToRelative(0.25f, 0.17f, 0.56f, 0.28f, 0.89f, 0.28f);
        pathBuilderD.curveToRelative(0.86f, 0.0f, 1.56f, -0.7f, 1.56f, -1.56f);
        pathBuilderD.curveToRelative(0.0f, -0.62f, -0.37f, -1.16f, -0.89f, -1.41f);
        pathBuilderD.curveTo(15.63f, 9.38f, 16.0f, 8.84f, 16.0f, 8.22f);
        pathBuilderD.curveToRelative(0.0f, -0.86f, -0.7f, -1.56f, -1.56f, -1.56f);
        pathBuilderD.curveToRelative(-0.33f, 0.0f, -0.63f, 0.1f, -0.89f, 0.28f);
        pathBuilderD.lineToRelative(0.01f, -0.12f);
        pathBuilderD.curveToRelative(0.0f, -0.86f, -0.7f, -1.56f, -1.56f, -1.56f);
        pathBuilderD.reflectiveCurveToRelative(-1.56f, 0.7f, -1.56f, 1.56f);
        pathBuilderD.lineToRelative(0.01f, 0.12f);
        pathBuilderD.curveTo(10.2f, 6.76f, 9.89f, 6.66f, 9.56f, 6.66f);
        pathBuilderD.curveTo(8.7f, 6.66f, 8.0f, 7.36f, 8.0f, 8.22f);
        pathBuilderD.curveToRelative(0.0f, 0.62f, 0.37f, 1.16f, 0.89f, 1.41f);
        pathBuilderD.curveTo(8.37f, 9.87f, 8.0f, 10.41f, 8.0f, 11.03f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 8.06f);
        pathBuilderD.curveToRelative(0.86f, 0.0f, 1.56f, 0.7f, 1.56f, 1.56f);
        pathBuilderD.reflectiveCurveToRelative(-0.7f, 1.56f, -1.56f, 1.56f);
        pathBuilderD.reflectiveCurveToRelative(-1.56f, -0.7f, -1.56f, -1.56f);
        pathBuilderD.reflectiveCurveTo(11.14f, 8.06f, 12.0f, 8.06f);
        androidx.appcompat.graphics.drawable.a.x(pathBuilderD, 20.0f, 4.0f, 16.0f, 4.0f);
        pathBuilderD.verticalLineTo(4.0f);
        pathBuilderD.horizontalLineTo(20.0f);
        pathBuilderD.moveTo(20.0f, 2.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(16.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(16.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineTo(4.0f);
        pathBuilderD.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _yard = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
