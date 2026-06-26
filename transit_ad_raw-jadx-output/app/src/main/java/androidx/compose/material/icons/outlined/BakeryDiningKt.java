package androidx.compose.material.icons.outlined;

import a.b;
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

/* JADX INFO: compiled from: BakeryDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bakeryDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BakeryDining", "Landroidx/compose/material/icons/Icons$Outlined;", "getBakeryDining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BakeryDiningKt {
    private static ImageVector _bakeryDining;

    public static final ImageVector getBakeryDining(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _bakeryDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BakeryDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.5f, 10.94f);
        pathBuilderD.curveToRelative(0.13f, -0.32f, 0.1f, -0.23f, 0.15f, -0.39f);
        pathBuilderD.curveToRelative(0.3f, -1.21f, -0.34f, -2.47f, -1.5f, -2.93f);
        pathBuilderD.lineToRelative(-2.01f, -0.8f);
        pathBuilderD.curveToRelative(-0.46f, -0.18f, -0.95f, -0.21f, -1.41f, -0.12f);
        pathBuilderD.curveToRelative(-0.11f, -0.33f, -0.29f, -0.63f, -0.52f, -0.89f);
        pathBuilderD.curveTo(14.73f, 5.29f, 14.06f, 5.0f, 13.36f, 5.0f);
        pathBuilderD.horizontalLineToRelative(-2.71f);
        pathBuilderD.curveTo(9.94f, 5.0f, 9.27f, 5.29f, 8.8f, 5.81f);
        pathBuilderD.curveTo(8.56f, 6.07f, 8.38f, 6.37f, 8.27f, 6.69f);
        pathBuilderD.curveTo(7.81f, 6.6f, 7.32f, 6.63f, 6.86f, 6.81f);
        pathBuilderD.lineToRelative(-2.01f, 0.8f);
        pathBuilderD.curveToRelative(-1.16f, 0.46f, -1.8f, 1.72f, -1.5f, 2.93f);
        pathBuilderD.lineToRelative(0.15f, 0.38f);
        pathBuilderD.curveTo(1.1f, 15.55f, 1.0f, 15.55f, 1.0f, 16.38f);
        pathBuilderD.curveToRelative(0.0f, 0.91f, 0.46f, 1.74f, 1.24f, 2.22f);
        pathBuilderD.curveToRelative(1.42f, 0.88f, 2.49f, 0.14f, 4.0f, -0.61f);
        pathBuilderD.horizontalLineToRelative(11.53f);
        pathBuilderD.curveToRelative(1.52f, 0.76f, 1.86f, 1.01f, 2.63f, 1.01f);
        pathBuilderD.curveToRelative(1.0f, 0.0f, 2.61f, -0.77f, 2.61f, -2.61f);
        pathBuilderD.curveTo(23.0f, 15.54f, 22.88f, 15.51f, 20.5f, 10.94f);
        a.y(pathBuilderD, 20.12f, 16.93f, -1.68f, -0.84f);
        pathBuilderD.lineToRelative(1.08f, -2.7f);
        pathBuilderD.lineToRelative(1.41f, 2.71f);
        pathBuilderD.curveTo(21.21f, 16.63f, 20.64f, 17.19f, 20.12f, 16.93f);
        a.y(pathBuilderD, 15.09f, 15.99f, 0.62f, -6.9f);
        pathBuilderD.curveToRelative(0.03f, -0.33f, 0.37f, -0.54f, 0.68f, -0.42f);
        pathBuilderD.lineToRelative(2.01f, 0.8f);
        pathBuilderD.curveToRelative(0.22f, 0.09f, 0.34f, 0.31f, 0.31f, 0.54f);
        b.l(pathBuilderD, -2.4f, 5.98f, 15.09f);
        pathBuilderD.moveTo(7.68f, 15.99f);
        pathBuilderD.lineToRelative(-2.4f, -5.98f);
        pathBuilderD.curveTo(5.25f, 9.78f, 5.37f, 9.56f, 5.59f, 9.47f);
        pathBuilderD.lineToRelative(2.01f, -0.8f);
        pathBuilderD.curveToRelative(0.31f, -0.12f, 0.65f, 0.08f, 0.68f, 0.42f);
        b.l(pathBuilderD, 0.62f, 6.9f, 7.68f);
        pathBuilderD.moveTo(3.07f, 16.1f);
        pathBuilderD.lineToRelative(1.41f, -2.72f);
        pathBuilderD.lineToRelative(1.08f, 2.71f);
        pathBuilderD.lineToRelative(-1.68f, 0.84f);
        pathBuilderD.curveTo(3.36f, 17.19f, 2.79f, 16.63f, 3.07f, 16.1f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.15f, 7.54f);
        pathBuilderD.curveToRelative(-0.03f, -0.31f, 0.23f, -0.54f, 0.5f, -0.54f);
        pathBuilderD.horizontalLineToRelative(2.71f);
        pathBuilderD.curveToRelative(0.27f, 0.0f, 0.53f, 0.23f, 0.5f, 0.54f);
        pathBuilderD.lineToRelative(-0.77f, 8.45f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.r(pathBuilderD, -2.17f, 10.15f, 7.54f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bakeryDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
