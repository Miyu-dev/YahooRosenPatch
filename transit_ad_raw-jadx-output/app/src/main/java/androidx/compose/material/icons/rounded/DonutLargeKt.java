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

/* JADX INFO: compiled from: DonutLarge.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_donutLarge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DonutLarge", "Landroidx/compose/material/icons/Icons$Rounded;", "getDonutLarge", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DonutLarge", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.07f, 5.32f);
        pathBuilderD.curveTo(16.26f, 6.0f, 18.0f, 7.74f, 18.68f, 9.93f);
        pathBuilderD.curveToRelative(0.19f, 0.63f, 0.76f, 1.07f, 1.41f, 1.07f);
        pathBuilderD.horizontalLineToRelative(0.04f);
        pathBuilderD.curveToRelative(1.0f, 0.0f, 1.72f, -0.96f, 1.43f, -1.91f);
        pathBuilderD.curveToRelative(-0.97f, -3.18f, -3.48f, -5.69f, -6.66f, -6.66f);
        pathBuilderD.curveToRelative(-0.94f, -0.29f, -1.9f, 0.43f, -1.9f, 1.43f);
        pathBuilderD.verticalLineToRelative(0.04f);
        pathBuilderD.curveToRelative(0.0f, 0.66f, 0.44f, 1.23f, 1.07f, 1.42f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.68f, 14.07f);
        pathBuilderD.curveToRelative(-0.68f, 2.2f, -2.42f, 3.93f, -4.61f, 4.61f);
        pathBuilderD.curveToRelative(-0.63f, 0.19f, -1.07f, 0.76f, -1.07f, 1.41f);
        pathBuilderD.verticalLineToRelative(0.04f);
        pathBuilderD.curveToRelative(0.0f, 1.0f, 0.96f, 1.72f, 1.91f, 1.43f);
        pathBuilderD.curveToRelative(3.18f, -0.97f, 5.69f, -3.48f, 6.66f, -6.66f);
        pathBuilderD.curveToRelative(0.29f, -0.95f, -0.43f, -1.91f, -1.42f, -1.91f);
        pathBuilderD.horizontalLineToRelative(-0.05f);
        pathBuilderD.curveToRelative(-0.66f, 0.01f, -1.23f, 0.45f, -1.42f, 1.08f);
        pathBuilderD.close();
        pathBuilderD.moveTo(11.0f, 20.11f);
        pathBuilderD.curveToRelative(0.0f, -0.67f, -0.45f, -1.24f, -1.09f, -1.44f);
        pathBuilderD.curveTo(7.07f, 17.78f, 5.0f, 15.13f, 5.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(2.07f, -5.78f, 4.91f, -6.67f);
        pathBuilderD.curveToRelative(0.64f, -0.2f, 1.09f, -0.77f, 1.09f, -1.44f);
        pathBuilderD.verticalLineToRelative(-0.01f);
        pathBuilderD.curveToRelative(0.0f, -1.0f, -0.97f, -1.74f, -1.93f, -1.44f);
        pathBuilderD.curveTo(4.98f, 3.69f, 2.0f, 7.5f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 4.5f, 2.98f, 8.31f, 7.07f, 9.56f);
        pathBuilderD.curveToRelative(0.96f, 0.3f, 1.93f, -0.44f, 1.93f, -1.45f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
