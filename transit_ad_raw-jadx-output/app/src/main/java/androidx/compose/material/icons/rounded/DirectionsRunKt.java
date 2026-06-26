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

/* JADX INFO: compiled from: DirectionsRun.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_directionsRun", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsRun", "Landroidx/compose/material/icons/Icons$Rounded;", "getDirectionsRun", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DirectionsRunKt {
    private static ImageVector _directionsRun;

    public static final ImageVector getDirectionsRun(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _directionsRun;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DirectionsRun", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.49f, 5.48f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        a.y(pathBuilderD, 10.32f, 17.48f, 0.57f, -2.5f);
        pathBuilderD.lineToRelative(2.1f, 2.0f);
        pathBuilderD.verticalLineToRelative(5.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-5.64f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f);
        pathBuilderD.lineToRelative(-1.48f, -1.41f);
        pathBuilderD.lineToRelative(0.6f, -3.0f);
        pathBuilderD.curveToRelative(1.07f, 1.24f, 2.62f, 2.13f, 4.36f, 2.41f);
        pathBuilderD.curveToRelative(0.6f, 0.09f, 1.14f, -0.39f, 1.14f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.49f, -0.36f, -0.9f, -0.85f, -0.98f);
        pathBuilderD.curveToRelative(-1.52f, -0.25f, -2.78f, -1.15f, -3.45f, -2.33f);
        pathBuilderD.lineToRelative(-1.0f, -1.6f);
        pathBuilderD.curveToRelative(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f);
        pathBuilderD.curveToRelative(-0.3f, 0.0f, -0.5f, 0.1f, -0.8f, 0.1f);
        pathBuilderD.lineTo(7.21f, 7.76f);
        pathBuilderD.curveToRelative(-0.74f, 0.32f, -1.22f, 1.04f, -1.22f, 1.85f);
        pathBuilderD.verticalLineToRelative(2.37f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-2.4f);
        pathBuilderD.lineToRelative(1.8f, -0.7f);
        pathBuilderD.lineToRelative(-1.6f, 8.1f);
        pathBuilderD.lineToRelative(-3.92f, -0.8f);
        pathBuilderD.curveToRelative(-0.54f, -0.11f, -1.07f, 0.24f, -1.18f, 0.78f);
        pathBuilderD.lineTo(3.09f, 17.0f);
        pathBuilderD.curveToRelative(-0.11f, 0.54f, 0.24f, 1.07f, 0.78f, 1.18f);
        pathBuilderD.lineToRelative(4.11f, 0.82f);
        pathBuilderD.curveToRelative(1.06f, 0.21f, 2.1f, -0.46f, 2.34f, -1.52f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsRun = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
