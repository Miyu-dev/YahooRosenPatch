package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
import androidx.compose.animation.b;
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

/* JADX INFO: compiled from: ThermostatAuto.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thermostatAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ThermostatAuto", "Landroidx/compose/material/icons/Icons$Outlined;", "getThermostatAuto", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ThermostatAutoKt {
    private static ImageVector _thermostatAuto;

    public static final ImageVector getThermostatAuto(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _thermostatAuto;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ThermostatAuto", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(11.0f, 12.0f, 6.0f);
        pathBuilderN.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderN.reflectiveCurveTo(5.0f, 4.34f, 5.0f, 6.0f);
        pathBuilderN.verticalLineToRelative(6.0f);
        pathBuilderN.curveToRelative(-1.21f, 0.91f, -2.0f, 2.37f, -2.0f, 4.0f);
        pathBuilderN.curveToRelative(0.0f, 1.12f, 0.38f, 2.14f, 1.0f, 2.97f);
        pathBuilderN.verticalLineTo(19.0f);
        pathBuilderN.horizontalLineToRelative(0.02f);
        pathBuilderN.curveToRelative(0.91f, 1.21f, 2.35f, 2.0f, 3.98f, 2.0f);
        pathBuilderN.reflectiveCurveToRelative(3.06f, -0.79f, 3.98f, -2.0f);
        pathBuilderN.horizontalLineTo(12.0f);
        pathBuilderN.verticalLineToRelative(-0.03f);
        pathBuilderN.curveToRelative(0.62f, -0.83f, 1.0f, -1.85f, 1.0f, -2.97f);
        pathBuilderN.curveTo(13.0f, 14.37f, 12.21f, 12.91f, 11.0f, 12.0f);
        pathBuilderN.close();
        pathBuilderN.moveTo(5.0f, 16.0f);
        pathBuilderN.curveToRelative(0.0f, -0.94f, 0.45f, -1.84f, 1.2f, -2.4f);
        pathBuilderN.lineTo(7.0f, 13.0f);
        pathBuilderN.verticalLineTo(6.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderN.verticalLineToRelative(7.0f);
        pathBuilderN.lineToRelative(0.8f, 0.6f);
        pathBuilderN.curveToRelative(0.75f, 0.57f, 1.2f, 1.46f, 1.2f, 2.4f);
        h.v(pathBuilderN, 5.0f, 18.62f, 4.0f, -1.61f);
        pathBuilderN.lineToRelative(-3.38f, 9.0f);
        a.y(pathBuilderN, 1.56f, 16.0f, 10.7f, 3.63f);
        pathBuilderN.lineToRelative(0.8f, 2.3f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderN, 22.0f, 18.62f, 4.0f);
        pathBuilderN.moveTo(16.47f, 9.39f);
        pathBuilderN.lineToRelative(1.31f, -3.72f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.p(pathBuilderN, 0.08f, 1.31f, 3.72f, 16.47f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thermostatAuto = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
