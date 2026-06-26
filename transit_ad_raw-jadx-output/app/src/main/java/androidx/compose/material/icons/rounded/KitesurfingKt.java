package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Kitesurfing.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_kitesurfing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Kitesurfing", "Landroidx/compose/material/icons/Icons$Rounded;", "getKitesurfing", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KitesurfingKt {
    private static ImageVector _kitesurfing;

    public static final ImageVector getKitesurfing(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _kitesurfing;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Kitesurfing", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.0f, 3.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(6.0f, 4.1f, 6.0f, 3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.03f, 3.97f);
        pathBuilderD.curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f);
        pathBuilderD.lineTo(20.06f, 1.0f);
        pathBuilderD.horizontalLineToRelative(-2.12f);
        pathBuilderD.lineToRelative(-1.91f, 1.91f);
        pathBuilderD.curveTo(15.74f, 3.2f, 15.74f, 3.68f, 16.03f, 3.97f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.15f, 12.0f);
        pathBuilderD.curveToRelative(-1.29f, 0.0f, -3.11f, 0.53f, -5.06f, 1.38f);
        pathBuilderD.lineTo(13.0f, 12.16f);
        pathBuilderD.curveToRelative(-0.38f, -0.42f, -0.92f, -0.66f, -1.49f, -0.66f);
        s.C(pathBuilderD, 9.6f, 0.0f, -3.5f, 11.0f);
        pathBuilderD.curveToRelative(1.52f, 0.0f, 2.94f, -0.49f, 4.09f, -1.32f);
        pathBuilderD.curveToRelative(0.49f, -0.35f, 0.52f, -1.07f, 0.09f, -1.5f);
        pathBuilderD.curveToRelative(-0.35f, -0.35f, -0.9f, -0.38f, -1.3f, -0.09f);
        pathBuilderD.curveTo(13.06f, 5.66f, 12.07f, 6.0f, 11.0f, 6.0f);
        pathBuilderD.horizontalLineTo(8.0f);
        pathBuilderD.curveTo(6.9f, 6.0f, 6.0f, 6.9f, 6.0f, 8.0f);
        pathBuilderD.verticalLineToRelative(4.04f);
        pathBuilderD.curveToRelative(0.0f, 0.64f, 0.15f, 1.27f, 0.45f, 1.83f);
        pathBuilderD.lineTo(8.0f, 16.84f);
        pathBuilderD.curveToRelative(-0.53f, 0.38f, -1.03f, 0.78f, -1.49f, 1.17f);
        pathBuilderD.curveTo(7.19f, 18.59f, 8.06f, 19.0f, 9.0f, 19.0f);
        pathBuilderD.curveToRelative(1.2f, 0.0f, 2.27f, -0.66f, 3.0f, -1.5f);
        pathBuilderD.curveToRelative(0.73f, 0.84f, 1.8f, 1.5f, 3.0f, 1.5f);
        pathBuilderD.curveToRelative(0.33f, 0.0f, 0.65f, -0.05f, 0.96f, -0.14f);
        pathBuilderD.curveTo(18.81f, 16.9f, 21.0f, 14.72f, 21.0f, 13.28f);
        pathBuilderD.curveTo(21.0f, 12.25f, 19.99f, 12.0f, 19.15f, 12.0f);
        androidx.compose.animation.a.t(pathBuilderD, 9.83f, 15.61f, 9.0f, 13.6f);
        pathBuilderD.lineToRelative(2.5f, -0.1f);
        pathBuilderD.lineToRelative(0.7f, 0.77f);
        pathBuilderD.curveTo(11.64f, 14.55f, 10.42f, 15.23f, 9.83f, 15.61f);
        pathBuilderD.close();
        pathBuilderD.moveTo(22.0f, 22.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.87f, 0.0f, -1.73f, -0.24f, -2.53f, -0.7f);
        pathBuilderD.curveToRelative(-0.29f, -0.16f, -0.65f, -0.17f, -0.94f, 0.0f);
        pathBuilderD.curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0.0f);
        pathBuilderD.curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0.0f);
        pathBuilderD.curveToRelative(-1.59f, 0.9f, -3.47f, 0.9f, -5.06f, 0.0f);
        pathBuilderD.curveToRelative(-0.29f, -0.16f, -0.65f, -0.16f, -0.94f, 0.0f);
        pathBuilderD.curveTo(4.73f, 20.76f, 3.87f, 21.0f, 3.0f, 21.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(1.15f, 0.0f, 2.3f, -0.31f, 3.33f, -0.94f);
        pathBuilderD.curveToRelative(1.66f, 1.11f, 3.78f, 1.01f, 5.58f, 0.14f);
        pathBuilderD.curveToRelative(1.91f, 1.05f, 4.17f, 1.07f, 6.09f, 0.05f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.95f, 0.5f, 1.97f, 0.75f, 3.0f, 0.75f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveTo(21.55f, 23.0f, 22.0f, 22.55f, 22.0f, 22.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kitesurfing = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
