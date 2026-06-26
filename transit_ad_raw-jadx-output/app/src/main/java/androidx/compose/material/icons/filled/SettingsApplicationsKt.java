package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: SettingsApplications.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsApplications", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsApplications", "Landroidx/compose/material/icons/Icons$Filled;", "getSettingsApplications", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsApplicationsKt {
    private static ImageVector _settingsApplications;

    public static final ImageVector getSettingsApplications(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _settingsApplications;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SettingsApplications", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 10.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        androidx.compose.animation.a.t(pathBuilderD, 19.0f, 3.0f, 5.0f, 3.0f);
        pathBuilderD.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(14.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(14.0f);
        pathBuilderD.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.lineTo(21.0f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.25f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.23f, -0.02f, 0.46f, -0.05f, 0.68f);
        pathBuilderD.lineToRelative(1.48f, 1.16f);
        pathBuilderD.curveToRelative(0.13f, 0.11f, 0.17f, 0.3f, 0.08f, 0.45f);
        pathBuilderD.lineToRelative(-1.4f, 2.42f);
        pathBuilderD.curveToRelative(-0.09f, 0.15f, -0.27f, 0.21f, -0.43f, 0.15f);
        pathBuilderD.lineToRelative(-1.74f, -0.7f);
        pathBuilderD.curveToRelative(-0.36f, 0.28f, -0.76f, 0.51f, -1.18f, 0.69f);
        pathBuilderD.lineToRelative(-0.26f, 1.85f);
        pathBuilderD.curveToRelative(-0.03f, 0.17f, -0.18f, 0.3f, -0.35f, 0.3f);
        pathBuilderD.horizontalLineToRelative(-2.8f);
        pathBuilderD.curveToRelative(-0.17f, 0.0f, -0.32f, -0.13f, -0.35f, -0.29f);
        pathBuilderD.lineToRelative(-0.26f, -1.85f);
        pathBuilderD.curveToRelative(-0.43f, -0.18f, -0.82f, -0.41f, -1.18f, -0.69f);
        pathBuilderD.lineToRelative(-1.74f, 0.7f);
        pathBuilderD.curveToRelative(-0.16f, 0.06f, -0.34f, 0.0f, -0.43f, -0.15f);
        pathBuilderD.lineToRelative(-1.4f, -2.42f);
        pathBuilderD.curveToRelative(-0.09f, -0.15f, -0.05f, -0.34f, 0.08f, -0.45f);
        pathBuilderD.lineToRelative(1.48f, -1.16f);
        pathBuilderD.curveToRelative(-0.03f, -0.23f, -0.05f, -0.46f, -0.05f, -0.69f);
        pathBuilderD.curveToRelative(0.0f, -0.23f, 0.02f, -0.46f, 0.05f, -0.68f);
        pathBuilderD.lineToRelative(-1.48f, -1.16f);
        pathBuilderD.curveToRelative(-0.13f, -0.11f, -0.17f, -0.3f, -0.08f, -0.45f);
        pathBuilderD.lineToRelative(1.4f, -2.42f);
        pathBuilderD.curveToRelative(0.09f, -0.15f, 0.27f, -0.21f, 0.43f, -0.15f);
        pathBuilderD.lineToRelative(1.74f, 0.7f);
        pathBuilderD.curveToRelative(0.36f, -0.28f, 0.76f, -0.51f, 1.18f, -0.69f);
        pathBuilderD.lineToRelative(0.26f, -1.85f);
        pathBuilderD.curveToRelative(0.03f, -0.17f, 0.18f, -0.3f, 0.35f, -0.3f);
        pathBuilderD.horizontalLineToRelative(2.8f);
        pathBuilderD.curveToRelative(0.17f, 0.0f, 0.32f, 0.13f, 0.35f, 0.29f);
        pathBuilderD.lineToRelative(0.26f, 1.85f);
        pathBuilderD.curveToRelative(0.43f, 0.18f, 0.82f, 0.41f, 1.18f, 0.69f);
        pathBuilderD.lineToRelative(1.74f, -0.7f);
        pathBuilderD.curveToRelative(0.16f, -0.06f, 0.34f, 0.0f, 0.43f, 0.15f);
        pathBuilderD.lineToRelative(1.4f, 2.42f);
        pathBuilderD.curveToRelative(0.09f, 0.15f, 0.05f, 0.34f, -0.08f, 0.45f);
        pathBuilderD.lineToRelative(-1.48f, 1.16f);
        pathBuilderD.curveToRelative(0.03f, 0.23f, 0.05f, 0.46f, 0.05f, 0.69f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsApplications = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
