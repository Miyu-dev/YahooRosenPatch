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

/* JADX INFO: compiled from: Copyright.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_copyright", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Copyright", "Landroidx/compose/material/icons/Icons$Rounded;", "getCopyright", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CopyrightKt {
    private static ImageVector _copyright;

    public static final ImageVector getCopyright(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _copyright;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Copyright", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.08f, 10.86f);
        pathBuilderD.curveToRelative(0.05f, -0.33f, 0.16f, -0.62f, 0.3f, -0.87f);
        pathBuilderD.reflectiveCurveToRelative(0.34f, -0.46f, 0.59f, -0.62f);
        pathBuilderD.curveToRelative(0.24f, -0.15f, 0.54f, -0.22f, 0.91f, -0.23f);
        pathBuilderD.curveToRelative(0.23f, 0.01f, 0.44f, 0.05f, 0.63f, 0.13f);
        pathBuilderD.curveToRelative(0.2f, 0.09f, 0.38f, 0.21f, 0.52f, 0.36f);
        pathBuilderD.reflectiveCurveToRelative(0.25f, 0.33f, 0.34f, 0.53f);
        pathBuilderD.reflectiveCurveToRelative(0.13f, 0.42f, 0.14f, 0.64f);
        pathBuilderD.horizontalLineToRelative(1.79f);
        pathBuilderD.curveToRelative(-0.02f, -0.47f, -0.11f, -0.9f, -0.28f, -1.29f);
        pathBuilderD.reflectiveCurveToRelative(-0.4f, -0.73f, -0.7f, -1.01f);
        pathBuilderD.reflectiveCurveToRelative(-0.66f, -0.5f, -1.08f, -0.66f);
        pathBuilderD.reflectiveCurveToRelative(-0.88f, -0.23f, -1.39f, -0.23f);
        pathBuilderD.curveToRelative(-0.65f, 0.0f, -1.22f, 0.11f, -1.7f, 0.34f);
        pathBuilderD.reflectiveCurveToRelative(-0.88f, 0.53f, -1.2f, 0.92f);
        pathBuilderD.reflectiveCurveToRelative(-0.56f, 0.84f, -0.71f, 1.36f);
        pathBuilderD.reflectiveCurveTo(8.0f, 11.29f, 8.0f, 11.87f);
        pathBuilderD.verticalLineToRelative(0.27f);
        pathBuilderD.curveToRelative(0.0f, 0.58f, 0.08f, 1.12f, 0.23f, 1.64f);
        pathBuilderD.reflectiveCurveToRelative(0.39f, 0.97f, 0.71f, 1.35f);
        pathBuilderD.reflectiveCurveToRelative(0.72f, 0.69f, 1.2f, 0.91f);
        pathBuilderD.curveToRelative(0.48f, 0.22f, 1.05f, 0.34f, 1.7f, 0.34f);
        pathBuilderD.curveToRelative(0.47f, 0.0f, 0.91f, -0.08f, 1.32f, -0.23f);
        pathBuilderD.reflectiveCurveToRelative(0.77f, -0.36f, 1.08f, -0.63f);
        pathBuilderD.reflectiveCurveToRelative(0.56f, -0.58f, 0.74f, -0.94f);
        pathBuilderD.reflectiveCurveToRelative(0.29f, -0.74f, 0.3f, -1.15f);
        pathBuilderD.horizontalLineToRelative(-1.79f);
        pathBuilderD.curveToRelative(-0.01f, 0.21f, -0.06f, 0.4f, -0.15f, 0.58f);
        pathBuilderD.reflectiveCurveToRelative(-0.21f, 0.33f, -0.36f, 0.46f);
        pathBuilderD.reflectiveCurveToRelative(-0.32f, 0.23f, -0.52f, 0.3f);
        pathBuilderD.curveToRelative(-0.19f, 0.07f, -0.39f, 0.09f, -0.6f, 0.1f);
        pathBuilderD.curveToRelative(-0.36f, -0.01f, -0.66f, -0.08f, -0.89f, -0.23f);
        pathBuilderD.curveToRelative(-0.25f, -0.16f, -0.45f, -0.37f, -0.59f, -0.62f);
        pathBuilderD.reflectiveCurveToRelative(-0.25f, -0.55f, -0.3f, -0.88f);
        pathBuilderD.reflectiveCurveToRelative(-0.08f, -0.67f, -0.08f, -1.0f);
        pathBuilderD.verticalLineToRelative(-0.27f);
        pathBuilderD.curveToRelative(0.0f, -0.35f, 0.03f, -0.68f, 0.08f, -1.01f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 20.0f);
        pathBuilderD.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderD, -3.59f, 8.0f, -8.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _copyright = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
