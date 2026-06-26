package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
import androidx.compose.animation.b;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BuildCircle.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_buildCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BuildCircle", "Landroidx/compose/material/icons/Icons$Outlined;", "getBuildCircle", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BuildCircleKt {
    private static ImageVector _buildCircle;

    public static final ImageVector getBuildCircle(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _buildCircle;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BuildCircle", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        PathFillType.Companion companion = PathFillType.INSTANCE;
        int iM3071getEvenOddRgk1Os = companion.m3071getEvenOddRgk1Os();
        Color.Companion companion2 = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion2.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion3 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion3.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion4 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion4.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 20.0f);
        pathBuilderD.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderD.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderD.curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), iM3071getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int iM3071getEvenOddRgk1Os2 = companion.m3071getEvenOddRgk1Os();
        SolidColor solidColor2 = new SolidColor(companion2.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion3.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion4.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(13.49f, 11.38f);
        pathBuilderD2.curveToRelative(0.43f, -1.22f, 0.17f, -2.64f, -0.81f, -3.62f);
        pathBuilderD2.curveToRelative(-1.11f, -1.11f, -2.79f, -1.3f, -4.1f, -0.59f);
        pathBuilderD2.lineToRelative(2.35f, 2.35f);
        pathBuilderD2.lineToRelative(-1.41f, 1.41f);
        pathBuilderD2.lineTo(7.17f, 8.58f);
        pathBuilderD2.curveToRelative(-0.71f, 1.32f, -0.52f, 2.99f, 0.59f, 4.1f);
        pathBuilderD2.curveToRelative(0.98f, 0.98f, 2.4f, 1.24f, 3.62f, 0.81f);
        pathBuilderD2.lineToRelative(3.41f, 3.41f);
        pathBuilderD2.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilderD2.lineToRelative(1.4f, -1.4f);
        pathBuilderD2.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD2, 13.49f, 11.38f), iM3071getEvenOddRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _buildCircle = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
