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

/* JADX INFO: compiled from: AirlineSeatReclineExtra.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatReclineExtra", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatReclineExtra", "Landroidx/compose/material/icons/Icons$Rounded;", "getAirlineSeatReclineExtra", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirlineSeatReclineExtraKt {
    private static ImageVector _airlineSeatReclineExtra;

    public static final ImageVector getAirlineSeatReclineExtra(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _airlineSeatReclineExtra;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirlineSeatReclineExtra", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(5.35f, 5.64f);
        pathBuilderD.curveToRelative(-0.9f, -0.64f, -1.12f, -1.88f, -0.49f, -2.79f);
        pathBuilderD.curveToRelative(0.63f, -0.9f, 1.88f, -1.12f, 2.79f, -0.49f);
        pathBuilderD.curveToRelative(0.9f, 0.64f, 1.12f, 1.88f, 0.49f, 2.79f);
        pathBuilderD.curveToRelative(-0.64f, 0.9f, -1.88f, 1.12f, -2.79f, 0.49f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.0f, 20.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.lineTo(8.93f, 19.0f);
        pathBuilderD.curveToRelative(-1.48f, 0.0f, -2.74f, -1.08f, -2.96f, -2.54f);
        pathBuilderD.lineTo(4.16f, 7.78f);
        pathBuilderD.curveTo(4.07f, 7.33f, 3.67f, 7.0f, 3.2f, 7.0f);
        pathBuilderD.curveToRelative(-0.62f, 0.0f, -1.08f, 0.57f, -0.96f, 1.18f);
        pathBuilderD.lineToRelative(1.75f, 8.58f);
        pathBuilderD.curveTo(4.37f, 19.2f, 6.47f, 21.0f, 8.94f, 21.0f);
        pathBuilderD.lineTo(15.0f, 21.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        androidx.compose.animation.a.j(pathBuilderD, 15.54f, 15.0f, -4.19f);
        pathBuilderD.lineToRelative(-1.03f, -4.1f);
        pathBuilderD.curveToRelative(1.28f, 0.72f, 2.63f, 1.28f, 4.1f, 1.3f);
        pathBuilderD.curveToRelative(0.58f, 0.01f, 1.05f, -0.49f, 1.05f, -1.07f);
        pathBuilderD.curveToRelative(0.0f, -0.59f, -0.49f, -1.04f, -1.08f, -1.06f);
        pathBuilderD.curveToRelative(-1.31f, -0.04f, -2.63f, -0.56f, -3.61f, -1.33f);
        pathBuilderD.lineTo(9.14f, 7.47f);
        pathBuilderD.curveToRelative(-0.23f, -0.18f, -0.49f, -0.3f, -0.76f, -0.38f);
        pathBuilderD.curveToRelative(-0.32f, -0.09f, -0.66f, -0.12f, -0.99f, -0.06f);
        pathBuilderD.horizontalLineToRelative(-0.02f);
        pathBuilderD.curveToRelative(-1.23f, 0.22f, -2.05f, 1.39f, -1.84f, 2.61f);
        pathBuilderD.lineToRelative(1.35f, 5.92f);
        pathBuilderD.curveTo(7.16f, 16.98f, 8.39f, 18.0f, 9.83f, 18.0f);
        pathBuilderD.horizontalLineToRelative(6.85f);
        pathBuilderD.lineToRelative(3.09f, 2.42f);
        pathBuilderD.curveToRelative(0.42f, 0.33f, 1.02f, 0.29f, 1.39f, -0.08f);
        pathBuilderD.curveToRelative(0.45f, -0.45f, 0.4f, -1.18f, -0.1f, -1.57f);
        pathBuilderD.lineToRelative(-4.29f, -3.35f);
        pathBuilderD.curveToRelative(-0.35f, -0.27f, -0.78f, -0.42f, -1.23f, -0.42f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatReclineExtra = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
