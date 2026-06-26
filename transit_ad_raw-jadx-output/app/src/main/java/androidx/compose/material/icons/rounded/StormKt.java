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

/* JADX INFO: compiled from: Storm.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_storm", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Storm", "Landroidx/compose/material/icons/Icons$Rounded;", "getStorm", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StormKt {
    private static ImageVector _storm;

    public static final ImageVector getStorm(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _storm;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Storm", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.93f, 8.0f);
        pathBuilderD.curveTo(16.72f, 4.18f, 11.82f, 2.87f, 8.0f, 5.07f);
        pathBuilderD.curveToRelative(-1.41f, 0.82f, -2.48f, 2.0f, -3.16f, 3.37f);
        pathBuilderD.curveToRelative(-0.1f, -1.75f, 0.1f, -3.5f, 0.59f, -5.17f);
        pathBuilderD.curveTo(5.61f, 2.63f, 5.14f, 2.0f, 4.48f, 2.0f);
        pathBuilderD.horizontalLineTo(4.47f);
        pathBuilderD.curveTo(4.04f, 2.0f, 3.64f, 2.28f, 3.52f, 2.7f);
        pathBuilderD.curveTo(2.24f, 7.01f, 2.65f, 11.81f, 5.07f, 16.0f);
        pathBuilderD.curveToRelative(1.1f, 1.91f, 2.88f, 3.19f, 4.86f, 3.72f);
        pathBuilderD.curveToRelative(1.98f, 0.53f, 4.16f, 0.31f, 6.07f, -0.79f);
        pathBuilderD.curveToRelative(1.41f, -0.82f, 2.48f, -2.0f, 3.16f, -3.37f);
        pathBuilderD.curveToRelative(0.1f, 1.75f, -0.09f, 3.5f, -0.58f, 5.18f);
        pathBuilderD.curveTo(18.4f, 21.37f, 18.87f, 22.0f, 19.53f, 22.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.44f, 0.0f, 0.83f, -0.28f, 0.95f, -0.7f);
        pathBuilderD.curveTo(21.75f, 16.99f, 21.35f, 12.19f, 18.93f, 8.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.0f, 17.2f);
        pathBuilderD.curveToRelative(-2.87f, 1.65f, -6.54f, 0.67f, -8.2f, -2.2f);
        pathBuilderD.curveToRelative(-0.11f, -0.2f, -0.21f, -0.4f, -0.3f, -0.6f);
        pathBuilderD.curveTo(5.3f, 11.64f, 6.33f, 8.34f, 9.0f, 6.8f);
        pathBuilderD.curveToRelative(2.86f, -1.65f, 6.54f, -0.67f, 8.2f, 2.2f);
        pathBuilderD.curveToRelative(0.11f, 0.2f, 0.21f, 0.4f, 0.3f, 0.6f);
        pathBuilderD.curveTo(18.7f, 12.36f, 17.67f, 15.66f, 15.0f, 17.2f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 10.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f);
        pathBuilderD.moveTo(12.0f, 8.0f);
        pathBuilderD.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilderD.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderD.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 14.21f, 8.0f, 12.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _storm = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
