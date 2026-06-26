package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: PanoramaVertical.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_panoramaVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanoramaVertical", "Landroidx/compose/material/icons/Icons$Sharp;", "getPanoramaVertical", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PanoramaVerticalKt {
    private static ImageVector _panoramaVertical;

    public static final ImageVector getPanoramaVertical(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _panoramaVertical;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PanoramaVertical", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.46f, 4.0f);
        pathBuilderD.curveToRelative(-0.77f, 2.6f, -1.16f, 5.28f, -1.16f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 2.72f, 0.39f, 5.41f, 1.16f, 8.0f);
        pathBuilderD.horizontalLineTo(6.55f);
        pathBuilderD.curveToRelative(0.77f, -2.6f, 1.16f, -5.28f, 1.16f, -8.0f);
        pathBuilderD.curveToRelative(0.0f, -2.72f, -0.39f, -5.41f, -1.16f, -8.0f);
        pathBuilderD.horizontalLineToRelative(10.91f);
        pathBuilderD.moveToRelative(2.78f, -2.0f);
        pathBuilderD.horizontalLineTo(3.77f);
        pathBuilderD.reflectiveCurveToRelative(0.26f, 0.77f, 0.3f, 0.88f);
        pathBuilderD.curveTo(5.16f, 5.82f, 5.71f, 8.91f, 5.71f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.55f, 6.18f, -1.64f, 9.12f);
        pathBuilderD.curveToRelative(-0.04f, 0.11f, -0.3f, 0.88f, -0.3f, 0.88f);
        pathBuilderD.horizontalLineToRelative(16.47f);
        pathBuilderD.reflectiveCurveToRelative(-0.26f, -0.77f, -0.3f, -0.88f);
        pathBuilderD.curveToRelative(-1.09f, -2.94f, -1.64f, -6.03f, -1.64f, -9.12f);
        pathBuilderD.reflectiveCurveToRelative(0.55f, -6.18f, 1.64f, -9.12f);
        pathBuilderD.curveToRelative(0.04f, -0.11f, 0.3f, -0.88f, 0.3f, -0.88f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaVertical = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
