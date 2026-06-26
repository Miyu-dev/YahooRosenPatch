package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: VapeFree.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_vapeFree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VapeFree", "Landroidx/compose/material/icons/Icons$Rounded;", "getVapeFree", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VapeFreeKt {
    private static ImageVector _vapeFree;

    public static final ImageVector getVapeFree(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _vapeFree;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VapeFree", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.49f, 21.9f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        androidx.compose.animation.a.r(pathBuilderD, -2.9f, -2.9f, 8.0f, -3.0f);
        pathBuilderD.horizontalLineToRelative(5.17f);
        pathBuilderD.lineTo(2.1f, 4.93f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(16.97f, 16.97f);
        pathBuilderD.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        androidx.compose.animation.a.j(pathBuilderD, 18.83f, 16.0f, 1.67f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.curveToRelative(0.0f, 0.46f, -0.21f, 0.87f, -0.53f, 1.14f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 18.83f, 16.0f, 10.5f, 17.0f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderD.reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderD.reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderD.reflectiveCurveTo(10.78f, 17.0f, 10.5f, 17.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.85f, 7.73f);
        pathBuilderD.curveToRelative(0.62f, -0.61f, 1.0f, -1.45f, 1.0f, -2.38f);
        pathBuilderD.curveToRelative(0.0f, -1.51f, -1.0f, -2.79f, -2.38f, -3.21f);
        pathBuilderD.curveTo(16.99f, 2.0f, 16.5f, 2.36f, 16.5f, 2.86f);
        pathBuilderD.curveToRelative(0.0f, 0.33f, 0.21f, 0.62f, 0.52f, 0.71f);
        pathBuilderD.curveToRelative(0.77f, 0.23f, 1.33f, 0.94f, 1.33f, 1.78f);
        pathBuilderD.curveToRelative(0.0f, 0.82f, -0.53f, 1.51f, -1.27f, 1.76f);
        pathBuilderD.curveTo(16.75f, 7.22f, 16.5f, 7.5f, 16.5f, 7.85f);
        pathBuilderD.verticalLineTo(8.0f);
        pathBuilderD.curveToRelative(0.0f, 0.37f, 0.27f, 0.69f, 0.64f, 0.75f);
        pathBuilderD.curveToRelative(1.93f, 0.31f, 3.36f, 2.0f, 3.36f, 4.02f);
        pathBuilderD.verticalLineToRelative(1.48f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderD.reflectiveCurveTo(22.0f, 14.66f, 22.0f, 14.25f);
        pathBuilderD.verticalLineToRelative(-1.49f);
        pathBuilderD.curveTo(22.0f, 10.54f, 20.72f, 8.62f, 18.85f, 7.73f);
        pathBuilderD.close();
        pathBuilderD.moveTo(14.48f, 11.65f);
        pathBuilderD.curveToRelative(0.04f, 0.0f, 0.09f, 0.0f, 0.13f, 0.0f);
        pathBuilderD.horizontalLineToRelative(1.42f);
        pathBuilderD.curveToRelative(1.05f, 0.0f, 1.97f, 0.74f, 1.97f, 2.05f);
        pathBuilderD.verticalLineToRelative(0.55f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.76f, 0.75f);
        pathBuilderD.curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f);
        pathBuilderD.verticalLineToRelative(-0.89f);
        pathBuilderD.curveToRelative(-0.01f, -1.81f, -1.61f, -3.16f, -3.48f, -3.16f);
        pathBuilderD.horizontalLineToRelative(-1.3f);
        pathBuilderD.curveToRelative(-1.02f, 0.0f, -1.94f, -0.73f, -2.07f, -1.75f);
        pathBuilderD.curveToRelative(-0.12f, -0.95f, 0.46f, -1.7f, 1.3f, -1.93f);
        pathBuilderD.curveToRelative(0.32f, -0.09f, 0.54f, -0.38f, 0.54f, -0.72f);
        pathBuilderD.curveToRelative(0.0f, -0.49f, -0.46f, -0.86f, -0.93f, -0.72f);
        pathBuilderD.curveToRelative(-1.41f, 0.41f, -2.43f, 1.71f, -2.42f, 3.24f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 14.48f, 11.65f, 3.0f, 18.5f);
        pathBuilderD.curveToRelative(1.33f, 0.0f, 2.71f, 0.18f, 4.0f, 0.5f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.curveToRelative(-1.29f, 0.32f, -2.67f, 0.5f, -4.0f, 0.5f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 2.45f, 18.5f, 3.0f, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vapeFree = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
