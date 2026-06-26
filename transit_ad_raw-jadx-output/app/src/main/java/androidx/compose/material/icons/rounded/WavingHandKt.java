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

/* JADX INFO: compiled from: WavingHand.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wavingHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WavingHand", "Landroidx/compose/material/icons/Icons$Rounded;", "getWavingHand", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WavingHandKt {
    private static ImageVector _wavingHand;

    public static final ImageVector getWavingHand(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WavingHand", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.07f, 9.8f);
        pathBuilderD.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(1.07f, 1.07f, 1.16f, 2.75f, 0.28f, 3.92f);
        pathBuilderD.curveToRelative(-0.15f, 0.2f, -0.12f, 0.47f, 0.05f, 0.65f);
        pathBuilderD.curveToRelative(0.22f, 0.22f, 0.57f, 0.19f, 0.76f, -0.05f);
        pathBuilderD.curveToRelative(1.07f, -1.43f, 1.06f, -3.43f, -0.04f, -4.85f);
        pathBuilderD.lineToRelative(7.62f, -7.62f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilderD.reflectiveCurveToRelative(0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilderD.lineToRelative(-5.13f, 5.13f);
        pathBuilderD.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderD.reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilderD.lineToRelative(6.54f, -6.54f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilderD.reflectiveCurveToRelative(0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilderD.lineToRelative(-6.54f, 6.54f);
        pathBuilderD.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderD.reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilderD.lineToRelative(5.48f, -5.48f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilderD.reflectiveCurveToRelative(0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilderD.lineToRelative(-6.19f, 6.19f);
        pathBuilderD.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderD.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilderD.lineToRelative(4.07f, -4.07f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilderD.curveToRelative(0.49f, 0.49f, 0.49f, 1.28f, 0.0f, 1.77f);
        pathBuilderD.lineToRelative(-7.07f, 7.07f);
        pathBuilderD.curveToRelative(-3.22f, 3.22f, -8.45f, 3.22f, -11.67f, 0.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.22f, -8.45f, 0.0f, -11.67f);
        pathBuilderD.lineToRelative(4.6f, -4.6f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f);
        pathBuilderD.curveToRelative(0.49f, 0.49f, 0.49f, 1.28f, 0.0f, 1.77f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 6.07f, 9.8f, 7.0f, 1.8f);
        pathBuilderD.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderD.curveToRelative(-0.04f, 0.0f, -0.07f, 0.0f, -0.11f, 0.01f);
        pathBuilderD.curveToRelative(-2.63f, 0.38f, -4.7f, 2.46f, -5.08f, 5.08f);
        pathBuilderD.curveToRelative(0.0f, 0.03f, -0.01f, 0.07f, -0.01f, 0.11f);
        pathBuilderD.curveTo(1.05f, 6.66f, 1.39f, 7.0f, 1.8f, 7.0f);
        pathBuilderD.curveToRelative(0.38f, 0.0f, 0.69f, -0.28f, 0.74f, -0.64f);
        pathBuilderD.curveToRelative(0.28f, -1.97f, 1.84f, -3.53f, 3.81f, -3.81f);
        pathBuilderD.curveTo(6.72f, 2.49f, 7.0f, 2.18f, 7.0f, 1.8f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.0f, 22.2f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        pathBuilderD.curveToRelative(0.04f, 0.0f, 0.07f, 0.0f, 0.11f, -0.01f);
        pathBuilderD.curveToRelative(2.63f, -0.38f, 4.7f, -2.46f, 5.08f, -5.08f);
        pathBuilderD.curveToRelative(0.0f, -0.03f, 0.01f, -0.07f, 0.01f, -0.11f);
        pathBuilderD.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderD.curveToRelative(-0.38f, 0.0f, -0.69f, 0.28f, -0.74f, 0.64f);
        pathBuilderD.curveToRelative(-0.28f, 1.97f, -1.84f, 3.53f, -3.81f, 3.81f);
        pathBuilderD.curveTo(17.28f, 21.51f, 17.0f, 21.82f, 17.0f, 22.2f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wavingHand = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
