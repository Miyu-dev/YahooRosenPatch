package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: SettingsPower.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsPower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsPower", "Landroidx/compose/material/icons/Icons$Rounded;", "getSettingsPower", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsPowerKt {
    private static ImageVector _settingsPower;

    public static final ImageVector getSettingsPower(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _settingsPower;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsPower", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(8.0f, 24.0f, 8.0f, 24.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveTo(7.0f, 23.55f, 7.45f, 24.0f, 8.0f, 24.0f);
        a.t(pathBuilderA, 12.0f, 24.0f, 12.0f, 24.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveTo(11.0f, 23.55f, 11.45f, 24.0f, 12.0f, 24.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 2.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(8.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineTo(3.0f);
        pathBuilderA.curveTo(13.0f, 2.45f, 12.55f, 2.0f, 12.0f, 2.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 15.94f, 5.06f, -0.02f, 0.02f);
        pathBuilderA.curveTo(15.51f, 5.49f, 15.56f, 6.16f, 16.0f, 6.54f);
        pathBuilderA.curveToRelative(1.51f, 1.34f, 2.33f, 3.43f, 1.88f, 5.7f);
        pathBuilderA.curveToRelative(-0.46f, 2.28f, -2.29f, 4.14f, -4.56f, 4.62f);
        pathBuilderA.curveTo(9.43f, 17.69f, 6.0f, 14.74f, 6.0f, 11.0f);
        pathBuilderA.curveToRelative(0.0f, -1.78f, 0.78f, -3.37f, 2.01f, -4.47f);
        pathBuilderA.curveToRelative(0.43f, -0.39f, 0.47f, -1.04f, 0.07f, -1.45f);
        pathBuilderA.lineTo(8.06f, 5.06f);
        pathBuilderA.curveTo(7.69f, 4.69f, 7.1f, 4.67f, 6.7f, 5.02f);
        pathBuilderA.curveToRelative(-2.01f, 1.77f, -3.12f, 4.53f, -2.56f, 7.52f);
        pathBuilderA.curveToRelative(0.59f, 3.15f, 3.11f, 5.7f, 6.26f, 6.31f);
        pathBuilderA.curveToRelative(5.12f, 0.99f, 9.6f, -2.9f, 9.6f, -7.85f);
        pathBuilderA.curveToRelative(0.0f, -2.38f, -1.05f, -4.52f, -2.71f, -5.99f);
        pathBuilderA.curveTo(16.9f, 4.67f, 16.31f, 4.69f, 15.94f, 5.06f);
        a.t(pathBuilderA, 16.0f, 24.0f, 16.0f, 24.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveTo(15.0f, 23.55f, 15.45f, 24.0f, 16.0f, 24.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsPower = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
