package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: ExposureZero.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_exposureZero", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ExposureZero", "Landroidx/compose/material/icons/Icons$Rounded;", "getExposureZero", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ExposureZeroKt {
    private static ImageVector _exposureZero;

    public static final ImageVector getExposureZero(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _exposureZero;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ExposureZero", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.14f, 12.5f);
        pathBuilderD.curveToRelative(0.0f, 1.0f, -0.1f, 1.85f, -0.3f, 2.55f);
        pathBuilderD.reflectiveCurveToRelative(-0.48f, 1.27f, -0.83f, 1.7f);
        pathBuilderD.curveToRelative(-0.36f, 0.44f, -0.79f, 0.75f, -1.3f, 0.95f);
        pathBuilderD.reflectiveCurveToRelative(-1.07f, 0.3f, -1.7f, 0.3f);
        pathBuilderD.curveToRelative(-0.62f, 0.0f, -1.18f, -0.1f, -1.69f, -0.3f);
        pathBuilderD.curveToRelative(-0.51f, -0.2f, -0.95f, -0.51f, -1.31f, -0.95f);
        pathBuilderD.reflectiveCurveToRelative(-0.65f, -1.01f, -0.85f, -1.7f);
        pathBuilderD.curveToRelative(-0.2f, -0.7f, -0.3f, -1.55f, -0.3f, -2.55f);
        pathBuilderD.verticalLineToRelative(-2.04f);
        pathBuilderD.curveToRelative(0.0f, -1.0f, 0.1f, -1.85f, 0.3f, -2.55f);
        pathBuilderD.curveToRelative(0.2f, -0.7f, 0.48f, -1.26f, 0.84f, -1.69f);
        pathBuilderD.curveToRelative(0.36f, -0.43f, 0.8f, -0.74f, 1.31f, -0.93f);
        pathBuilderD.curveTo(10.81f, 5.1f, 11.38f, 5.0f, 12.0f, 5.0f);
        pathBuilderD.curveToRelative(0.63f, 0.0f, 1.19f, 0.1f, 1.7f, 0.29f);
        pathBuilderD.curveToRelative(0.51f, 0.19f, 0.95f, 0.5f, 1.31f, 0.93f);
        pathBuilderD.curveToRelative(0.36f, 0.43f, 0.64f, 0.99f, 0.84f, 1.69f);
        pathBuilderD.curveToRelative(0.2f, 0.7f, 0.3f, 1.54f, 0.3f, 2.55f);
        androidx.appcompat.app.m.y(pathBuilderD, 2.04f, -0.01f, 14.03f, 10.14f);
        pathBuilderD.curveToRelative(0.0f, -0.64f, -0.05f, -1.18f, -0.13f, -1.62f);
        pathBuilderD.curveToRelative(-0.09f, -0.44f, -0.22f, -0.79f, -0.4f, -1.06f);
        pathBuilderD.curveToRelative(-0.17f, -0.27f, -0.39f, -0.46f, -0.64f, -0.58f);
        pathBuilderD.curveToRelative(-0.25f, -0.13f, -0.54f, -0.19f, -0.86f, -0.19f);
        pathBuilderD.reflectiveCurveToRelative(-0.61f, 0.06f, -0.86f, 0.18f);
        pathBuilderD.reflectiveCurveToRelative(-0.47f, 0.31f, -0.64f, 0.58f);
        pathBuilderD.reflectiveCurveToRelative(-0.31f, 0.62f, -0.4f, 1.06f);
        pathBuilderD.reflectiveCurveToRelative(-0.13f, 0.98f, -0.13f, 1.62f);
        pathBuilderD.verticalLineToRelative(2.67f);
        pathBuilderD.curveToRelative(0.0f, 0.64f, 0.05f, 1.18f, 0.14f, 1.62f);
        pathBuilderD.curveToRelative(0.09f, 0.45f, 0.23f, 0.81f, 0.4f, 1.09f);
        pathBuilderD.reflectiveCurveToRelative(0.39f, 0.48f, 0.64f, 0.61f);
        pathBuilderD.reflectiveCurveToRelative(0.54f, 0.19f, 0.87f, 0.19f);
        pathBuilderD.reflectiveCurveToRelative(0.62f, -0.06f, 0.87f, -0.19f);
        pathBuilderD.reflectiveCurveToRelative(0.46f, -0.33f, 0.63f, -0.61f);
        pathBuilderD.reflectiveCurveToRelative(0.3f, -0.64f, 0.39f, -1.09f);
        pathBuilderD.reflectiveCurveToRelative(0.13f, -0.99f, 0.13f, -1.62f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.p(pathBuilderD, -2.66f, -0.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exposureZero = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
