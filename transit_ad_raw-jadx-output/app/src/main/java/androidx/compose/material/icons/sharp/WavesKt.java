package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: Waves.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_waves", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Waves", "Landroidx/compose/material/icons/Icons$Sharp;", "getWaves", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WavesKt {
    private static ImageVector _waves;

    public static final ImageVector getWaves(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _waves;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Waves", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.0f, 16.99f);
        pathBuilderD.curveToRelative(-1.35f, 0.0f, -2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilderD.curveToRelative(-0.65f, 0.33f, -1.18f, 0.6f, -2.05f, 0.6f);
        pathBuilderD.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilderD.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilderD.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilderD.curveToRelative(-0.65f, 0.33f, -1.17f, 0.6f, -2.05f, 0.6f);
        pathBuilderD.verticalLineToRelative(1.95f);
        pathBuilderD.curveToRelative(1.35f, 0.0f, 2.2f, -0.42f, 2.95f, -0.8f);
        pathBuilderD.curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f);
        pathBuilderD.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilderD.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilderD.reflectiveCurveToRelative(2.2f, -0.42f, 2.95f, -0.8f);
        pathBuilderD.curveToRelative(0.65f, -0.33f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilderD.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilderD.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        pathBuilderD.verticalLineToRelative(-1.95f);
        pathBuilderD.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilderD.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.0f, 12.54f);
        pathBuilderD.curveToRelative(-1.35f, 0.0f, -2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilderD.curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f);
        pathBuilderD.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilderD.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilderD.reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilderD.curveToRelative(-0.65f, 0.32f, -1.17f, 0.6f, -2.05f, 0.6f);
        pathBuilderD.verticalLineToRelative(1.95f);
        pathBuilderD.curveToRelative(1.35f, 0.0f, 2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilderD.curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f);
        pathBuilderD.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilderD.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilderD.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilderD.curveToRelative(0.65f, -0.35f, 1.15f, -0.6f, 2.05f, -0.6f);
        pathBuilderD.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilderD.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        pathBuilderD.verticalLineToRelative(-1.95f);
        pathBuilderD.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilderD.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.95f, 4.46f);
        pathBuilderD.curveToRelative(-0.75f, -0.38f, -1.58f, -0.8f, -2.95f, -0.8f);
        pathBuilderD.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilderD.curveToRelative(-0.65f, 0.32f, -1.18f, 0.6f, -2.05f, 0.6f);
        pathBuilderD.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilderD.curveToRelative(-0.75f, -0.37f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilderD.reflectiveCurveToRelative(-2.2f, 0.42f, -2.95f, 0.8f);
        pathBuilderD.curveToRelative(-0.65f, 0.33f, -1.17f, 0.6f, -2.05f, 0.6f);
        pathBuilderD.verticalLineToRelative(1.93f);
        pathBuilderD.curveToRelative(1.35f, 0.0f, 2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilderD.curveToRelative(0.65f, -0.33f, 1.17f, -0.6f, 2.05f, -0.6f);
        pathBuilderD.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilderD.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilderD.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilderD.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilderD.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilderD.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        pathBuilderD.lineTo(22.0f, 5.04f);
        pathBuilderD.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.58f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.0f, 8.09f);
        pathBuilderD.curveToRelative(-1.35f, 0.0f, -2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilderD.curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f);
        pathBuilderD.reflectiveCurveToRelative(-1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilderD.curveToRelative(-0.75f, -0.38f, -1.57f, -0.8f, -2.95f, -0.8f);
        pathBuilderD.reflectiveCurveToRelative(-2.2f, 0.43f, -2.95f, 0.8f);
        pathBuilderD.curveToRelative(-0.65f, 0.35f, -1.15f, 0.6f, -2.05f, 0.6f);
        pathBuilderD.verticalLineToRelative(1.95f);
        pathBuilderD.curveToRelative(1.35f, 0.0f, 2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilderD.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilderD.reflectiveCurveToRelative(1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilderD.curveToRelative(0.75f, 0.38f, 1.57f, 0.8f, 2.95f, 0.8f);
        pathBuilderD.reflectiveCurveToRelative(2.2f, -0.43f, 2.95f, -0.8f);
        pathBuilderD.curveToRelative(0.65f, -0.32f, 1.18f, -0.6f, 2.05f, -0.6f);
        pathBuilderD.curveToRelative(0.9f, 0.0f, 1.4f, 0.25f, 2.05f, 0.6f);
        pathBuilderD.curveToRelative(0.75f, 0.38f, 1.58f, 0.8f, 2.95f, 0.8f);
        pathBuilderD.lineTo(22.0f, 9.49f);
        pathBuilderD.curveToRelative(-0.9f, 0.0f, -1.4f, -0.25f, -2.05f, -0.6f);
        pathBuilderD.curveToRelative(-0.75f, -0.38f, -1.6f, -0.8f, -2.95f, -0.8f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waves = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
