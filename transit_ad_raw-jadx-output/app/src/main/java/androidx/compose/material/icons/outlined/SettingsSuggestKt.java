package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: SettingsSuggest.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsSuggest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsSuggest", "Landroidx/compose/material/icons/Icons$Outlined;", "getSettingsSuggest", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsSuggestKt {
    private static ImageVector _settingsSuggest;

    public static final ImageVector getSettingsSuggest(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _settingsSuggest;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SettingsSuggest", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.0f, 13.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveTo(9.45f, 13.0f, 10.0f, 13.0f);
        pathBuilderD.moveTo(10.0f, 11.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveTo(11.66f, 11.0f, 10.0f, 11.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 10.0f, 11.0f, 18.5f, 9.0f);
        pathBuilderD.lineToRelative(1.09f, -2.41f);
        pathBuilderD.lineTo(22.0f, 5.5f);
        pathBuilderD.lineToRelative(-2.41f, -1.09f);
        pathBuilderD.lineTo(18.5f, 2.0f);
        pathBuilderD.lineToRelative(-1.09f, 2.41f);
        pathBuilderD.lineTo(15.0f, 5.5f);
        s.r(pathBuilderD, 2.41f, 1.09f, 18.5f, 9.0f);
        pathBuilderD.moveTo(21.28f, 12.72f);
        pathBuilderD.lineTo(20.5f, 11.0f);
        pathBuilderD.lineToRelative(-0.78f, 1.72f);
        pathBuilderD.lineTo(18.0f, 13.5f);
        pathBuilderD.lineToRelative(1.72f, 0.78f);
        pathBuilderD.lineTo(20.5f, 16.0f);
        pathBuilderD.lineToRelative(0.78f, -1.72f);
        android.support.v4.media.a.C(pathBuilderD, 23.0f, 13.5f, 21.28f, 12.72f);
        pathBuilderD.moveTo(16.25f, 14.0f);
        pathBuilderD.curveToRelative(0.0f, -0.12f, 0.0f, -0.25f, -0.01f, -0.37f);
        pathBuilderD.lineToRelative(1.94f, -1.47f);
        pathBuilderD.lineToRelative(-2.5f, -4.33f);
        pathBuilderD.lineToRelative(-2.24f, 0.94f);
        pathBuilderD.curveToRelative(-0.2f, -0.13f, -0.42f, -0.26f, -0.64f, -0.37f);
        pathBuilderD.lineTo(12.5f, 6.0f);
        pathBuilderD.horizontalLineToRelative(-5.0f);
        pathBuilderD.lineTo(7.2f, 8.41f);
        pathBuilderD.curveTo(6.98f, 8.52f, 6.77f, 8.65f, 6.56f, 8.78f);
        pathBuilderD.lineTo(4.32f, 7.83f);
        pathBuilderD.lineToRelative(-2.5f, 4.33f);
        pathBuilderD.lineToRelative(1.94f, 1.47f);
        pathBuilderD.curveTo(3.75f, 13.75f, 3.75f, 13.88f, 3.75f, 14.0f);
        pathBuilderD.reflectiveCurveToRelative(0.0f, 0.25f, 0.01f, 0.37f);
        pathBuilderD.lineToRelative(-1.94f, 1.47f);
        pathBuilderD.lineToRelative(2.5f, 4.33f);
        pathBuilderD.lineToRelative(2.24f, -0.94f);
        pathBuilderD.curveToRelative(0.2f, 0.13f, 0.42f, 0.26f, 0.64f, 0.37f);
        pathBuilderD.lineTo(7.5f, 22.0f);
        pathBuilderD.horizontalLineToRelative(5.0f);
        pathBuilderD.lineToRelative(0.3f, -2.41f);
        pathBuilderD.curveToRelative(0.22f, -0.11f, 0.43f, -0.23f, 0.64f, -0.37f);
        pathBuilderD.lineToRelative(2.24f, 0.94f);
        pathBuilderD.lineToRelative(2.5f, -4.33f);
        pathBuilderD.lineToRelative(-1.94f, -1.47f);
        pathBuilderD.curveTo(16.25f, 14.25f, 16.25f, 14.12f, 16.25f, 14.0f);
        a.y(pathBuilderD, 14.83f, 17.64f, -1.73f, -0.73f);
        pathBuilderD.curveToRelative(-0.56f, 0.6f, -1.3f, 1.04f, -2.13f, 1.23f);
        pathBuilderD.lineTo(10.73f, 20.0f);
        pathBuilderD.horizontalLineTo(9.27f);
        pathBuilderD.lineToRelative(-0.23f, -1.86f);
        pathBuilderD.curveToRelative(-0.83f, -0.19f, -1.57f, -0.63f, -2.13f, -1.23f);
        pathBuilderD.lineToRelative(-1.73f, 0.73f);
        pathBuilderD.lineToRelative(-0.73f, -1.27f);
        pathBuilderD.lineToRelative(1.49f, -1.13f);
        pathBuilderD.curveToRelative(-0.12f, -0.39f, -0.18f, -0.8f, -0.18f, -1.23f);
        pathBuilderD.curveToRelative(0.0f, -0.43f, 0.06f, -0.84f, 0.18f, -1.23f);
        pathBuilderD.lineToRelative(-1.49f, -1.13f);
        pathBuilderD.lineToRelative(0.73f, -1.27f);
        pathBuilderD.lineToRelative(1.73f, 0.73f);
        pathBuilderD.curveToRelative(0.56f, -0.6f, 1.3f, -1.04f, 2.13f, -1.23f);
        pathBuilderD.lineTo(9.27f, 8.0f);
        pathBuilderD.horizontalLineToRelative(1.47f);
        pathBuilderD.lineToRelative(0.23f, 1.86f);
        pathBuilderD.curveToRelative(0.83f, 0.19f, 1.57f, 0.63f, 2.13f, 1.23f);
        pathBuilderD.lineToRelative(1.73f, -0.73f);
        pathBuilderD.lineToRelative(0.73f, 1.27f);
        pathBuilderD.lineToRelative(-1.49f, 1.13f);
        pathBuilderD.curveToRelative(0.12f, 0.39f, 0.18f, 0.8f, 0.18f, 1.23f);
        pathBuilderD.curveToRelative(0.0f, 0.43f, -0.06f, 0.84f, -0.18f, 1.23f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 1.49f, 1.13f, 14.83f, 17.64f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSuggest = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
