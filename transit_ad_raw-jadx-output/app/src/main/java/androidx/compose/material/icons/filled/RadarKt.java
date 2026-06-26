package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: Radar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_radar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Radar", "Landroidx/compose/material/icons/Icons$Filled;", "getRadar", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RadarKt {
    private static ImageVector _radar;

    public static final ImageVector getRadar(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _radar;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Radar", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.74f, 18.33f);
        pathBuilderD.curveTo(21.15f, 16.6f, 22.0f, 14.4f, 22.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilderD.reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.curveToRelative(2.4f, 0.0f, 4.6f, -0.85f, 6.33f, -2.26f);
        pathBuilderD.curveToRelative(0.27f, -0.22f, 0.53f, -0.46f, 0.78f, -0.71f);
        pathBuilderD.curveToRelative(0.03f, -0.03f, 0.05f, -0.06f, 0.07f, -0.08f);
        pathBuilderD.curveTo(19.38f, 18.75f, 19.57f, 18.54f, 19.74f, 18.33f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 20.0f);
        pathBuilderD.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 1.85f, -0.63f, 3.54f, -1.69f, 4.9f);
        pathBuilderD.lineToRelative(-1.43f, -1.43f);
        pathBuilderD.curveToRelative(0.69f, -0.98f, 1.1f, -2.17f, 1.1f, -3.46f);
        pathBuilderD.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilderD.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilderD.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilderD.curveToRelative(1.3f, 0.0f, 2.51f, -0.42f, 3.49f, -1.13f);
        pathBuilderD.lineToRelative(1.42f, 1.42f);
        pathBuilderD.curveTo(15.54f, 19.37f, 13.85f, 20.0f, 12.0f, 20.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(13.92f, 12.51f);
        pathBuilderD.curveToRelative(0.17f, -0.66f, 0.02f, -1.38f, -0.49f, -1.9f);
        pathBuilderD.lineToRelative(-0.02f, -0.02f);
        pathBuilderD.curveToRelative(-0.77f, -0.77f, -2.0f, -0.78f, -2.78f, -0.04f);
        pathBuilderD.curveToRelative(-0.01f, 0.01f, -0.03f, 0.02f, -0.05f, 0.04f);
        pathBuilderD.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderD.lineToRelative(0.02f, 0.02f);
        pathBuilderD.curveToRelative(0.52f, 0.51f, 1.25f, 0.67f, 1.91f, 0.49f);
        pathBuilderD.lineToRelative(1.51f, 1.51f);
        pathBuilderD.curveToRelative(-0.6f, 0.36f, -1.29f, 0.58f, -2.04f, 0.58f);
        pathBuilderD.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderD.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilderD.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.73f, -0.21f, 1.41f, -0.56f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 13.92f, 12.51f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _radar = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
