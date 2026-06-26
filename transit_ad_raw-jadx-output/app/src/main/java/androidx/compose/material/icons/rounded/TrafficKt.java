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

/* JADX INFO: compiled from: Traffic.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_traffic", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Traffic", "Landroidx/compose/material/icons/Icons$Rounded;", "getTraffic", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TrafficKt {
    private static ImageVector _traffic;

    public static final ImageVector getTraffic(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _traffic;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Traffic", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.96f, 10.59f);
        pathBuilderD.curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f);
        pathBuilderD.lineTo(17.0f, 10.0f);
        pathBuilderD.lineTo(17.0f, 8.86f);
        pathBuilderD.curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f);
        pathBuilderD.curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f);
        pathBuilderD.lineTo(17.0f, 5.0f);
        pathBuilderD.lineTo(17.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.lineTo(8.0f, 3.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.lineTo(4.54f, 5.0f);
        pathBuilderD.curveToRelative(-0.31f, 0.0f, -0.54f, 0.28f, -0.5f, 0.59f);
        pathBuilderD.curveTo(4.28f, 7.18f, 5.46f, 8.46f, 7.0f, 8.86f);
        pathBuilderD.lineTo(7.0f, 10.0f);
        pathBuilderD.lineTo(4.54f, 10.0f);
        pathBuilderD.curveToRelative(-0.31f, 0.0f, -0.54f, 0.28f, -0.5f, 0.59f);
        pathBuilderD.curveToRelative(0.24f, 1.59f, 1.42f, 2.87f, 2.96f, 3.27f);
        pathBuilderD.lineTo(7.0f, 15.0f);
        pathBuilderD.lineTo(4.54f, 15.0f);
        pathBuilderD.curveToRelative(-0.31f, 0.0f, -0.54f, 0.28f, -0.5f, 0.59f);
        pathBuilderD.curveToRelative(0.24f, 1.59f, 1.42f, 2.87f, 2.96f, 3.27f);
        pathBuilderD.lineTo(7.0f, 20.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(8.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-1.14f);
        pathBuilderD.curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f);
        pathBuilderD.curveToRelative(0.04f, -0.31f, -0.19f, -0.59f, -0.5f, -0.59f);
        pathBuilderD.lineTo(17.0f, 15.0f);
        pathBuilderD.verticalLineToRelative(-1.14f);
        pathBuilderD.curveToRelative(1.54f, -0.4f, 2.72f, -1.68f, 2.96f, -3.27f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 19.0f);
        pathBuilderD.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 14.0f);
        pathBuilderD.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 9.0f);
        pathBuilderD.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _traffic = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
