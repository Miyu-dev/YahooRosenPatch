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

/* JADX INFO: compiled from: Soap.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_soap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Soap", "Landroidx/compose/material/icons/Icons$Outlined;", "getSoap", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SoapKt {
    private static ImageVector _soap;

    public static final ImageVector getSoap(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _soap;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Soap", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.25f, 6.0f);
        pathBuilderD.curveTo(14.66f, 6.0f, 15.0f, 6.34f, 15.0f, 6.75f);
        pathBuilderD.reflectiveCurveTo(14.66f, 7.5f, 14.25f, 7.5f);
        pathBuilderD.reflectiveCurveTo(13.5f, 7.16f, 13.5f, 6.75f);
        pathBuilderD.reflectiveCurveTo(13.84f, 6.0f, 14.25f, 6.0f);
        pathBuilderD.moveTo(14.25f, 4.5f);
        pathBuilderD.curveTo(13.01f, 4.5f, 12.0f, 5.51f, 12.0f, 6.75f);
        pathBuilderD.reflectiveCurveTo(13.01f, 9.0f, 14.25f, 9.0f);
        pathBuilderD.reflectiveCurveToRelative(2.25f, -1.01f, 2.25f, -2.25f);
        pathBuilderD.reflectiveCurveTo(15.49f, 4.5f, 14.25f, 4.5f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 14.25f, 4.5f, 20.0f, 5.5f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderD.reflectiveCurveTo(20.28f, 6.5f, 20.0f, 6.5f);
        pathBuilderD.reflectiveCurveTo(19.5f, 6.28f, 19.5f, 6.0f);
        pathBuilderD.reflectiveCurveTo(19.72f, 5.5f, 20.0f, 5.5f);
        pathBuilderD.moveTo(20.0f, 4.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(21.1f, 4.0f, 20.0f, 4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 20.0f, 4.0f, 16.5f, 1.0f);
        pathBuilderD.curveTo(15.67f, 1.0f, 15.0f, 1.67f, 15.0f, 2.5f);
        pathBuilderD.reflectiveCurveTo(15.67f, 4.0f, 16.5f, 4.0f);
        pathBuilderD.curveTo(17.33f, 4.0f, 18.0f, 3.33f, 18.0f, 2.5f);
        pathBuilderD.reflectiveCurveTo(17.33f, 1.0f, 16.5f, 1.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(20.75f, 16.0f);
        pathBuilderD.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderD.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        androidx.compose.animation.a.s(pathBuilderD, 12.0f, -1.0f, 6.75f);
        pathBuilderD.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderD.curveToRelative(0.0f, -0.67f, -0.53f, -1.2f, -1.18f, -1.24f);
        pathBuilderD.lineTo(8.87f, 10.0f);
        pathBuilderD.lineToRelative(1.48f, -2.6f);
        pathBuilderD.curveToRelative(0.09f, -0.17f, 0.14f, -0.34f, 0.14f, -0.54f);
        pathBuilderD.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilderD.lineTo(9.12f, 5.0f);
        pathBuilderD.lineToRelative(-7.18f, 6.8f);
        pathBuilderD.curveTo(1.34f, 12.36f, 1.0f, 13.15f, 1.0f, 13.97f);
        pathBuilderD.verticalLineTo(20.0f);
        pathBuilderD.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.horizontalLineToRelative(13.75f);
        pathBuilderD.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderD.reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f);
        androidx.compose.animation.a.s(pathBuilderD, 12.0f, -1.0f, 7.75f);
        pathBuilderD.curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f);
        pathBuilderD.reflectiveCurveTo(20.44f, 17.0f, 19.75f, 17.0f);
        androidx.compose.animation.a.w(pathBuilderD, 12.0f, -1.0f, 20.75f);
        pathBuilderD.moveTo(10.0f, 21.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-6.0f);
        pathBuilderD.curveToRelative(0.0f, -0.39f, 0.23f, -0.64f, 0.36f, -0.75f);
        pathBuilderD.lineTo(7.0f, 9.87f);
        pathBuilderD.verticalLineTo(12.0f);
        pathBuilderD.lineToRelative(3.0f, 0.0f);
        pathBuilderD.verticalLineTo(21.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soap = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
