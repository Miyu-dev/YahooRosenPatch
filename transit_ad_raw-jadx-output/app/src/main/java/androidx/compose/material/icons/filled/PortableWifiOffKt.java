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

/* JADX INFO: compiled from: PortableWifiOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_portableWifiOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PortableWifiOff", "Landroidx/compose/material/icons/Icons$Filled;", "getPortableWifiOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PortableWifiOffKt {
    private static ImageVector _portableWifiOff;

    public static final ImageVector getPortableWifiOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _portableWifiOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PortableWifiOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.56f, 14.24f);
        pathBuilderD.curveToRelative(0.28f, -0.69f, 0.44f, -1.45f, 0.44f, -2.24f);
        pathBuilderD.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilderD.curveToRelative(-0.79f, 0.0f, -1.55f, 0.16f, -2.24f, 0.44f);
        pathBuilderD.lineToRelative(1.62f, 1.62f);
        pathBuilderD.curveToRelative(0.2f, -0.03f, 0.41f, -0.06f, 0.62f, -0.06f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.21f, -0.02f, 0.42f, -0.05f, 0.63f);
        android.support.v4.media.a.t(pathBuilderD, 1.61f, 1.61f, 12.0f, 4.0f);
        pathBuilderD.curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 1.35f, -0.35f, 2.62f, -0.95f, 3.74f);
        pathBuilderD.lineToRelative(1.47f, 1.47f);
        pathBuilderD.curveTo(21.46f, 15.69f, 22.0f, 13.91f, 22.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilderD.curveToRelative(-1.91f, 0.0f, -3.69f, 0.55f, -5.21f, 1.47f);
        pathBuilderD.lineToRelative(1.46f, 1.46f);
        pathBuilderD.curveTo(9.37f, 4.34f, 10.65f, 4.0f, 12.0f, 4.0f);
        androidx.compose.animation.a.t(pathBuilderD, 3.27f, 2.5f, 2.0f, 3.77f);
        pathBuilderD.lineToRelative(2.1f, 2.1f);
        pathBuilderD.curveTo(2.79f, 7.57f, 2.0f, 9.69f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f);
        pathBuilderD.lineToRelative(1.0f, -1.73f);
        pathBuilderD.curveTo(5.61f, 17.53f, 4.0f, 14.96f, 4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.76f, 0.57f, -3.38f, 1.53f, -4.69f);
        pathBuilderD.lineToRelative(1.43f, 1.44f);
        pathBuilderD.curveTo(6.36f, 9.68f, 6.0f, 10.8f, 6.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f);
        pathBuilderD.lineToRelative(1.0f, -1.74f);
        pathBuilderD.curveToRelative(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f);
        pathBuilderD.curveToRelative(0.0f, -0.65f, 0.17f, -1.25f, 0.44f, -1.79f);
        pathBuilderD.lineToRelative(1.58f, 1.58f);
        pathBuilderD.lineTo(10.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.lineToRelative(0.21f, -0.02f);
        pathBuilderD.lineToRelative(0.01f, 0.01f);
        pathBuilderD.lineToRelative(7.51f, 7.51f);
        pathBuilderD.lineTo(21.0f, 20.23f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderD, 4.27f, 3.5f, -1.0f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _portableWifiOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
