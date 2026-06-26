package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: SettingsAccessibility.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsAccessibility", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsAccessibility", "Landroidx/compose/material/icons/Icons$Rounded;", "getSettingsAccessibility", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsAccessibilityKt {
    private static ImageVector _settingsAccessibility;

    public static final ImageVector getSettingsAccessibility(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _settingsAccessibility;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsAccessibility", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.74f, 4.96f);
        pathBuilderD.curveToRelative(-0.13f, -0.53f, -0.67f, -0.85f, -1.2f, -0.73f);
        pathBuilderD.curveTo(17.16f, 4.77f, 14.49f, 5.0f, 12.0f, 5.0f);
        pathBuilderD.reflectiveCurveTo(6.84f, 4.77f, 4.46f, 4.24f);
        pathBuilderD.curveToRelative(-0.54f, -0.12f, -1.07f, 0.19f, -1.2f, 0.73f);
        pathBuilderD.lineTo(3.24f, 5.02f);
        pathBuilderD.curveTo(3.11f, 5.56f, 3.43f, 6.12f, 3.97f, 6.24f);
        pathBuilderD.curveTo(5.59f, 6.61f, 7.34f, 6.86f, 9.0f, 7.0f);
        pathBuilderD.verticalLineToRelative(11.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderD, -5.0f, 2.0f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineTo(7.0f);
        pathBuilderD.curveToRelative(1.66f, -0.14f, 3.41f, -0.39f, 5.03f, -0.76f);
        pathBuilderD.curveToRelative(0.54f, -0.12f, 0.86f, -0.68f, 0.73f, -1.22f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 20.74f, 4.96f, 12.0f, 4.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(10.9f, 4.0f, 12.0f, 4.0f);
        androidx.compose.animation.a.t(pathBuilderD, 8.0f, 24.0f, 8.0f, 24.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveTo(7.0f, 23.55f, 7.45f, 24.0f, 8.0f, 24.0f);
        androidx.compose.animation.a.t(pathBuilderD, 12.0f, 24.0f, 12.0f, 24.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveTo(11.0f, 23.55f, 11.45f, 24.0f, 12.0f, 24.0f);
        androidx.compose.animation.a.t(pathBuilderD, 16.0f, 24.0f, 16.0f, 24.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveTo(15.0f, 23.55f, 15.45f, 24.0f, 16.0f, 24.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsAccessibility = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
