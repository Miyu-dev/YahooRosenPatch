package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: SatelliteAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_satelliteAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SatelliteAlt", "Landroidx/compose/material/icons/Icons$Rounded;", "getSatelliteAlt", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SatelliteAltKt {
    private static ImageVector _satelliteAlt;

    public static final ImageVector getSatelliteAlt(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _satelliteAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SatelliteAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.95f, 14.88f);
        pathBuilderD.curveToRelative(-0.4f, 3.18f, -2.89f, 5.67f, -6.07f, 6.07f);
        pathBuilderD.curveTo(14.37f, 21.01f, 14.0f, 21.44f, 14.0f, 21.94f);
        pathBuilderD.curveToRelative(0.0f, 0.04f, 0.0f, 0.08f, 0.01f, 0.12f);
        pathBuilderD.curveToRelative(0.07f, 0.55f, 0.57f, 0.94f, 1.12f, 0.87f);
        pathBuilderD.curveToRelative(4.09f, -0.51f, 7.3f, -3.72f, 7.81f, -7.81f);
        pathBuilderD.curveToRelative(0.06f, -0.55f, -0.33f, -1.05f, -0.88f, -1.11f);
        pathBuilderD.curveTo(21.51f, 13.94f, 21.01f, 14.33f, 20.95f, 14.88f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.84f, 15.26f);
        pathBuilderD.curveToRelative(0.14f, -0.53f, -0.18f, -1.08f, -0.72f, -1.22f);
        pathBuilderD.curveToRelative(-0.54f, -0.14f, -1.08f, 0.18f, -1.22f, 0.72f);
        pathBuilderD.curveToRelative(-0.27f, 1.05f, -1.09f, 1.87f, -2.15f, 2.15f);
        pathBuilderD.curveTo(14.3f, 17.03f, 14.0f, 17.43f, 14.0f, 17.88f);
        pathBuilderD.curveToRelative(0.0f, 0.08f, 0.01f, 0.17f, 0.03f, 0.25f);
        pathBuilderD.curveToRelative(0.14f, 0.53f, 0.69f, 0.85f, 1.22f, 0.72f);
        pathBuilderD.curveTo(17.02f, 18.38f, 18.39f, 17.01f, 18.84f, 15.26f);
        a.y(pathBuilderD, 21.8f, 4.12f, -3.54f, -3.54f);
        pathBuilderD.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilderD.lineToRelative(-3.18f, 3.18f);
        pathBuilderD.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderD.lineToRelative(1.24f, 1.24f);
        pathBuilderD.lineToRelative(-0.71f, 0.71f);
        pathBuilderD.lineTo(11.55f, 7.3f);
        pathBuilderD.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilderD.lineTo(7.3f, 8.72f);
        pathBuilderD.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderD.lineToRelative(1.24f, 1.24f);
        pathBuilderD.lineToRelative(-0.71f, 0.71f);
        pathBuilderD.lineTo(6.6f, 12.25f);
        pathBuilderD.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilderD.lineToRelative(-3.18f, 3.18f);
        pathBuilderD.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilderD.lineToRelative(3.54f, 3.54f);
        pathBuilderD.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilderD.lineToRelative(3.18f, -3.18f);
        pathBuilderD.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderD.lineToRelative(-1.24f, -1.24f);
        pathBuilderD.lineToRelative(0.71f, -0.71f);
        pathBuilderD.lineToRelative(1.24f, 1.24f);
        pathBuilderD.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        pathBuilderD.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderD.lineTo(13.84f, 9.6f);
        pathBuilderD.lineToRelative(0.71f, -0.71f);
        pathBuilderD.lineToRelative(1.24f, 1.24f);
        pathBuilderD.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilderD.lineToRelative(3.18f, -3.18f);
        pathBuilderD.curveTo(22.58f, 6.17f, 22.58f, 4.9f, 21.8f, 4.12f);
        androidx.compose.animation.a.t(pathBuilderD, 5.54f, 20.38f, 2.0f, 16.85f);
        pathBuilderD.lineToRelative(1.06f, -1.06f);
        s.r(pathBuilderD, 3.54f, 3.54f, 5.54f, 20.38f);
        pathBuilderD.moveTo(7.66f, 18.26f);
        pathBuilderD.lineToRelative(-3.54f, -3.54f);
        pathBuilderD.lineToRelative(1.06f, -1.06f);
        s.r(pathBuilderD, 3.54f, 3.54f, 7.66f, 18.26f);
        pathBuilderD.moveTo(17.2f, 8.72f);
        pathBuilderD.lineToRelative(-3.54f, -3.54f);
        pathBuilderD.lineToRelative(1.06f, -1.06f);
        s.r(pathBuilderD, 3.54f, 3.54f, 17.2f, 8.72f);
        pathBuilderD.moveTo(19.32f, 6.6f);
        pathBuilderD.lineToRelative(-3.54f, -3.54f);
        pathBuilderD.lineTo(16.85f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 3.54f, 3.54f, 19.32f, 6.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _satelliteAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
