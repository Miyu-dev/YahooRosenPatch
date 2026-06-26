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

/* JADX INFO: compiled from: WavingHand.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wavingHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WavingHand", "Landroidx/compose/material/icons/Icons$Filled;", "getWavingHand", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WavingHandKt {
    private static ImageVector _wavingHand;

    public static final ImageVector getWavingHand(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WavingHand", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(23.0f, 17.0f);
        pathBuilderD.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilderD.verticalLineToRelative(-1.5f);
        pathBuilderD.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        b.w(pathBuilderD, 23.0f, 1.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilderD.verticalLineToRelative(1.5f);
        pathBuilderD.curveTo(4.52f, 2.5f, 2.5f, 4.52f, 2.5f, 7.0f);
        b.w(pathBuilderD, 1.0f, 8.01f, 4.32f);
        pathBuilderD.lineToRelative(-4.6f, 4.6f);
        pathBuilderD.curveToRelative(-3.22f, 3.22f, -3.22f, 8.45f, 0.0f, 11.67f);
        pathBuilderD.reflectiveCurveToRelative(8.45f, 3.22f, 11.67f, 0.0f);
        pathBuilderD.lineToRelative(7.07f, -7.07f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilderD.curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilderD.lineToRelative(-4.42f, 4.42f);
        pathBuilderD.lineToRelative(-0.71f, -0.71f);
        pathBuilderD.lineToRelative(6.54f, -6.54f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilderD.reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilderD.lineToRelative(-5.83f, 5.83f);
        pathBuilderD.lineToRelative(-0.71f, -0.71f);
        pathBuilderD.lineToRelative(6.89f, -6.89f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilderD.reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilderD.lineToRelative(-6.89f, 6.89f);
        pathBuilderD.lineTo(11.02f, 9.8f);
        pathBuilderD.lineToRelative(5.48f, -5.48f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilderD.reflectiveCurveToRelative(-1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilderD.lineToRelative(-7.62f, 7.62f);
        pathBuilderD.curveToRelative(1.22f, 1.57f, 1.11f, 3.84f, -0.33f, 5.28f);
        pathBuilderD.lineToRelative(-0.71f, -0.71f);
        pathBuilderD.curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f);
        pathBuilderD.lineToRelative(-0.35f, -0.35f);
        pathBuilderD.lineToRelative(4.07f, -4.07f);
        pathBuilderD.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilderD.curveTo(9.29f, 3.83f, 8.5f, 3.83f, 8.01f, 4.32f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wavingHand = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
