package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: SportsBar.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsBar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsBar", "Landroidx/compose/material/icons/Icons$Rounded;", "getSportsBar", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsBarKt {
    private static ImageVector _sportsBar;

    public static final ImageVector getSportsBar(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _sportsBar;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsBar", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(19.0f, 9.0f, -1.56f);
        pathBuilderB.curveToRelative(0.33f, -0.55f, 0.53f, -1.18f, 0.55f, -1.86f);
        pathBuilderB.curveToRelative(0.04f, -1.03f, -0.43f, -1.99f, -1.16f, -2.71f);
        pathBuilderB.curveToRelative(-1.54f, -1.54f, -2.74f, -1.56f, -3.82f, -1.29f);
        pathBuilderB.curveTo(12.2f, 2.45f, 11.16f, 2.02f, 10.0f, 2.02f);
        pathBuilderB.curveToRelative(-1.89f, 0.0f, -3.51f, 1.11f, -4.27f, 2.71f);
        pathBuilderB.curveTo(4.15f, 5.26f, 3.0f, 6.74f, 3.0f, 8.5f);
        pathBuilderB.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        pathBuilderB.lineTo(6.0f, 19.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(7.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.horizontalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineToRelative(-6.0f);
        pathBuilderB.curveTo(21.0f, 9.9f, 20.1f, 9.0f, 19.0f, 9.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(7.0f, 10.5f);
        pathBuilderB.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderB.curveToRelative(0.0f, -0.85f, 0.55f, -1.6f, 1.37f, -1.88f);
        pathBuilderB.lineToRelative(0.8f, -0.27f);
        pathBuilderB.lineToRelative(0.36f, -0.76f);
        pathBuilderB.curveTo(8.0f, 4.62f, 8.94f, 4.02f, 10.0f, 4.02f);
        pathBuilderB.curveToRelative(0.79f, 0.0f, 1.39f, 0.35f, 1.74f, 0.65f);
        pathBuilderB.lineToRelative(0.78f, 0.65f);
        pathBuilderB.curveToRelative(0.0f, 0.0f, 0.64f, -0.32f, 1.47f, -0.32f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderB.curveToRelative(0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 0.0f);
        pathBuilderB.curveTo(9.67f, 7.0f, 9.15f, 10.5f, 7.0f, 10.5f);
        b.r(pathBuilderB, 19.0f, 17.0f, -2.0f, -6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.g(pathBuilderB, 2.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsBar = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
