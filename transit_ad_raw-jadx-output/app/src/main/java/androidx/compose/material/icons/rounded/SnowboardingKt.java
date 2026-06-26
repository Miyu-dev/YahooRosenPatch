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

/* JADX INFO: compiled from: Snowboarding.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_snowboarding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Snowboarding", "Landroidx/compose/material/icons/Icons$Rounded;", "getSnowboarding", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SnowboardingKt {
    private static ImageVector _snowboarding;

    public static final ImageVector getSnowboarding(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _snowboarding;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Snowboarding", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.0f, 3.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(14.0f, 4.1f, 14.0f, 3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.35f, 9.53f);
        pathBuilderD.curveToRelative(0.47f, 0.29f, 1.09f, 0.15f, 1.38f, -0.32f);
        pathBuilderD.lineTo(9.1f, 7.0f);
        pathBuilderD.horizontalLineToRelative(2.35f);
        pathBuilderD.lineToRelative(-2.51f, 3.99f);
        pathBuilderD.curveToRelative(-0.28f, 0.45f, -0.37f, 1.0f, -0.25f, 1.52f);
        pathBuilderD.lineTo(9.5f, 16.0f);
        pathBuilderD.lineTo(6.0f, 18.35f);
        pathBuilderD.lineToRelative(-0.47f, -0.1f);
        pathBuilderD.curveToRelative(-0.96f, -0.2f, -1.71f, -0.85f, -2.1f, -1.67f);
        pathBuilderD.curveToRelative(-0.1f, -0.21f, -0.28f, -0.37f, -0.51f, -0.42f);
        pathBuilderD.curveToRelative(-0.43f, -0.09f, -0.82f, 0.2f, -0.9f, 0.58f);
        pathBuilderD.curveTo(1.98f, 16.88f, 2.0f, 17.05f, 2.07f, 17.2f);
        pathBuilderD.curveToRelative(0.58f, 1.24f, 1.71f, 2.2f, 3.15f, 2.51f);
        pathBuilderD.lineToRelative(12.63f, 2.69f);
        pathBuilderD.curveToRelative(1.44f, 0.31f, 2.86f, -0.11f, 3.9f, -1.01f);
        pathBuilderD.curveToRelative(0.13f, -0.11f, 0.21f, -0.26f, 0.24f, -0.41f);
        pathBuilderD.curveToRelative(0.08f, -0.38f, -0.16f, -0.8f, -0.59f, -0.89f);
        pathBuilderD.curveToRelative(-0.23f, -0.05f, -0.46f, 0.02f, -0.64f, 0.17f);
        pathBuilderD.curveToRelative(-0.69f, 0.6f, -1.64f, 0.88f, -2.6f, 0.67f);
        pathBuilderD.lineTo(17.0f, 20.69f);
        pathBuilderD.lineToRelative(-0.88f, -5.43f);
        pathBuilderD.curveToRelative(-0.08f, -0.49f, -0.34f, -0.93f, -0.72f, -1.24f);
        pathBuilderD.lineToRelative(-2.72f, -2.19f);
        pathBuilderD.lineToRelative(1.8f, -2.89f);
        pathBuilderD.curveToRelative(0.96f, 1.53f, 2.54f, 2.64f, 4.39f, 2.96f);
        pathBuilderD.curveToRelative(0.6f, 0.11f, 1.13f, -0.39f, 1.13f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.48f, -0.35f, -0.89f, -0.83f, -0.98f);
        pathBuilderD.curveToRelative(-1.49f, -0.28f, -2.72f, -1.29f, -3.3f, -2.64f);
        pathBuilderD.lineToRelative(-0.52f, -1.21f);
        pathBuilderD.curveTo(15.16f, 5.64f, 14.61f, 5.0f, 13.7f, 5.0f);
        pathBuilderD.horizontalLineTo(9.11f);
        pathBuilderD.curveToRelative(-0.69f, 0.0f, -1.33f, 0.36f, -1.7f, 0.94f);
        pathBuilderD.lineTo(6.03f, 8.15f);
        pathBuilderD.curveTo(5.74f, 8.62f, 5.88f, 9.24f, 6.35f, 9.53f);
        a.y(pathBuilderD, 8.73f, 18.93f, 2.25f, -1.51f);
        pathBuilderD.curveToRelative(0.47f, -0.32f, 0.73f, -0.88f, 0.65f, -1.44f);
        pathBuilderD.lineToRelative(-0.32f, -2.4f);
        pathBuilderD.lineToRelative(2.84f, 2.02f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 0.75f, 4.64f, 8.73f, 18.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowboarding = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
