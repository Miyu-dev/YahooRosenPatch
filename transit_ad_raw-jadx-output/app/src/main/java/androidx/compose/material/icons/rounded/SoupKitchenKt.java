package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: SoupKitchen.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_soupKitchen", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SoupKitchen", "Landroidx/compose/material/icons/Icons$Rounded;", "getSoupKitchen", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SoupKitchenKt {
    private static ImageVector _soupKitchen;

    public static final ImageVector getSoupKitchen(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _soupKitchen;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SoupKitchen", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.15f, 13.5f);
        pathBuilderD.curveToRelative(-0.46f, 0.0f, -0.8f, -0.42f, -0.71f, -0.87f);
        pathBuilderD.curveTo(5.48f, 12.45f, 5.5f, 12.24f, 5.5f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.0f, -1.0f, -2.85f, -1.0f, -3.62f);
        pathBuilderD.curveToRelative(0.0f, -0.29f, 0.03f, -0.59f, 0.17f, -0.93f);
        pathBuilderD.curveTo(4.78f, 7.18f, 5.04f, 7.0f, 5.34f, 7.0f);
        pathBuilderD.curveToRelative(0.45f, 0.0f, 0.8f, 0.42f, 0.71f, 0.86f);
        pathBuilderD.curveTo(6.01f, 8.04f, 6.0f, 8.21f, 6.0f, 8.38f);
        pathBuilderD.curveTo(6.0f, 9.15f, 7.0f, 11.0f, 7.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.42f, -0.08f, 0.76f, -0.17f, 1.01f);
        pathBuilderD.curveTo(6.73f, 13.31f, 6.46f, 13.5f, 6.15f, 13.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.65f, 13.5f);
        pathBuilderD.curveToRelative(0.31f, 0.0f, 0.58f, -0.19f, 0.68f, -0.49f);
        pathBuilderD.curveToRelative(0.09f, -0.25f, 0.17f, -0.59f, 0.17f, -1.01f);
        pathBuilderD.curveToRelative(0.0f, -1.0f, -1.0f, -2.85f, -1.0f, -3.62f);
        pathBuilderD.curveToRelative(0.0f, -0.17f, 0.01f, -0.34f, 0.04f, -0.51f);
        pathBuilderD.curveTo(12.63f, 7.42f, 12.29f, 7.0f, 11.84f, 7.0f);
        pathBuilderD.curveToRelative(-0.29f, 0.0f, -0.56f, 0.18f, -0.67f, 0.45f);
        pathBuilderD.curveTo(11.03f, 7.79f, 11.0f, 8.08f, 11.0f, 8.38f);
        pathBuilderD.curveTo(11.0f, 9.15f, 12.0f, 11.0f, 12.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.24f, -0.02f, 0.45f, -0.06f, 0.63f);
        pathBuilderD.curveTo(11.85f, 13.08f, 12.19f, 13.5f, 12.65f, 13.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(9.4f, 13.5f);
        pathBuilderD.curveToRelative(0.31f, 0.0f, 0.58f, -0.19f, 0.68f, -0.49f);
        pathBuilderD.curveToRelative(0.09f, -0.25f, 0.17f, -0.59f, 0.17f, -1.01f);
        pathBuilderD.curveToRelative(0.0f, -1.0f, -1.0f, -2.85f, -1.0f, -3.62f);
        pathBuilderD.curveToRelative(0.0f, -0.17f, 0.01f, -0.34f, 0.04f, -0.51f);
        pathBuilderD.curveTo(9.38f, 7.42f, 9.04f, 7.0f, 8.59f, 7.0f);
        pathBuilderD.curveTo(8.29f, 7.0f, 8.03f, 7.18f, 7.92f, 7.45f);
        pathBuilderD.curveTo(7.78f, 7.79f, 7.75f, 8.08f, 7.75f, 8.38f);
        pathBuilderD.curveToRelative(0.0f, 0.77f, 1.0f, 2.63f, 1.0f, 3.62f);
        pathBuilderD.curveToRelative(0.0f, 0.24f, -0.02f, 0.45f, -0.06f, 0.63f);
        pathBuilderD.curveTo(8.6f, 13.08f, 8.94f, 13.5f, 9.4f, 13.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(20.46f, 6.37f);
        pathBuilderD.curveToRelative(0.57f, 0.07f, 1.08f, -0.34f, 1.12f, -0.91f);
        pathBuilderD.curveTo(21.59f, 5.28f, 21.6f, 5.12f, 21.6f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        pathBuilderD.curveToRelative(-1.54f, 0.0f, -2.81f, 1.16f, -2.98f, 2.65f);
        pathBuilderD.lineTo(14.53f, 15.0f);
        pathBuilderD.horizontalLineTo(3.99f);
        pathBuilderD.curveToRelative(-0.6f, 0.0f, -1.07f, 0.54f, -0.98f, 1.14f);
        pathBuilderD.curveTo(3.54f, 19.46f, 6.39f, 22.0f, 9.75f, 22.0f);
        pathBuilderD.curveToRelative(3.48f, 0.0f, 6.34f, -2.73f, 6.71f, -6.23f);
        pathBuilderD.lineToRelative(1.15f, -10.87f);
        pathBuilderD.curveTo(17.66f, 4.39f, 18.08f, 4.0f, 18.6f, 4.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.07f, -0.01f, 0.18f, -0.01f, 0.31f);
        pathBuilderD.curveTo(19.55f, 5.84f, 19.93f, 6.3f, 20.46f, 6.37f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 20.46f, 6.37f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _soupKitchen = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
