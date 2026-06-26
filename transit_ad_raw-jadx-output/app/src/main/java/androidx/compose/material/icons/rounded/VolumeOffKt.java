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

/* JADX INFO: compiled from: VolumeOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_volumeOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VolumeOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getVolumeOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VolumeOffKt {
    private static ImageVector _volumeOff;

    public static final ImageVector getVolumeOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _volumeOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VolumeOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(3.63f, 3.63f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineTo(7.29f, 8.7f);
        pathBuilderD.lineTo(7.0f, 9.0f);
        pathBuilderD.lineTo(4.0f, 9.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.lineToRelative(3.29f, 3.29f);
        pathBuilderD.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        pathBuilderD.verticalLineToRelative(-4.17f);
        pathBuilderD.lineToRelative(4.18f, 4.18f);
        pathBuilderD.curveToRelative(-0.49f, 0.37f, -1.02f, 0.68f, -1.6f, 0.91f);
        pathBuilderD.curveToRelative(-0.36f, 0.15f, -0.58f, 0.53f, -0.58f, 0.92f);
        pathBuilderD.curveToRelative(0.0f, 0.72f, 0.73f, 1.18f, 1.39f, 0.91f);
        pathBuilderD.curveToRelative(0.8f, -0.33f, 1.55f, -0.77f, 2.22f, -1.31f);
        pathBuilderD.lineToRelative(1.34f, 1.34f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineTo(5.05f, 3.63f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.82f, -0.15f, 1.61f, -0.41f, 2.34f);
        pathBuilderD.lineToRelative(1.53f, 1.53f);
        pathBuilderD.curveToRelative(0.56f, -1.17f, 0.88f, -2.48f, 0.88f, -3.87f);
        pathBuilderD.curveToRelative(0.0f, -3.83f, -2.4f, -7.11f, -5.78f, -8.4f);
        pathBuilderD.curveToRelative(-0.59f, -0.23f, -1.22f, 0.23f, -1.22f, 0.86f);
        pathBuilderD.verticalLineToRelative(0.19f);
        pathBuilderD.curveToRelative(0.0f, 0.38f, 0.25f, 0.71f, 0.61f, 0.85f);
        pathBuilderD.curveTo(17.18f, 6.54f, 19.0f, 9.06f, 19.0f, 12.0f);
        a.y(pathBuilderD, 10.29f, 5.71f, -0.17f, 0.17f);
        pathBuilderD.lineTo(12.0f, 7.76f);
        pathBuilderD.lineTo(12.0f, 6.41f);
        pathBuilderD.curveToRelative(0.0f, -0.89f, -1.08f, -1.33f, -1.71f, -0.7f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.5f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        pathBuilderD.verticalLineToRelative(1.79f);
        pathBuilderD.lineToRelative(2.48f, 2.48f);
        pathBuilderD.curveToRelative(0.01f, -0.08f, 0.02f, -0.16f, 0.02f, -0.24f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
