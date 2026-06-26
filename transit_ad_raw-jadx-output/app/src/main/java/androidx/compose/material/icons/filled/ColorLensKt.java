package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: ColorLens.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_colorLens", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ColorLens", "Landroidx/compose/material/icons/Icons$Filled;", "getColorLens", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ColorLensKt {
    private static ImageVector _colorLens;

    public static final ImageVector getColorLens(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _colorLens;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ColorLens", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 3.0f);
        pathBuilderD.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilderD.reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.curveToRelative(0.0f, -0.39f, -0.15f, -0.74f, -0.39f, -1.01f);
        pathBuilderD.curveToRelative(-0.23f, -0.26f, -0.38f, -0.61f, -0.38f, -0.99f);
        pathBuilderD.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderD.lineTo(16.0f, 16.0f);
        pathBuilderD.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderD.curveToRelative(0.0f, -4.42f, -4.03f, -8.0f, -9.0f, -8.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.5f, 12.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(5.67f, 9.0f, 6.5f, 9.0f);
        pathBuilderD.reflectiveCurveTo(8.0f, 9.67f, 8.0f, 10.5f);
        pathBuilderD.reflectiveCurveTo(7.33f, 12.0f, 6.5f, 12.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(9.5f, 8.0f);
        pathBuilderD.curveTo(8.67f, 8.0f, 8.0f, 7.33f, 8.0f, 6.5f);
        pathBuilderD.reflectiveCurveTo(8.67f, 5.0f, 9.5f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(10.33f, 8.0f, 9.5f, 8.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(14.5f, 8.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(13.67f, 5.0f, 14.5f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(15.33f, 8.0f, 14.5f, 8.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.5f, 12.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(16.67f, 9.0f, 17.5f, 9.0f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderD, -0.67f, 1.5f, -1.5f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _colorLens = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
