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

/* JADX INFO: compiled from: FilterDrama.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_filterDrama", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FilterDrama", "Landroidx/compose/material/icons/Icons$Rounded;", "getFilterDrama", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FilterDramaKt {
    private static ImageVector _filterDrama;

    public static final ImageVector getFilterDrama(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _filterDrama;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FilterDrama", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.35f, 10.04f);
        pathBuilderD.curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.curveTo(9.11f, 4.0f, 6.61f, 5.64f, 5.36f, 8.04f);
        pathBuilderD.curveTo(2.35f, 8.36f, 0.0f, 10.9f, 0.0f, 14.0f);
        pathBuilderD.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilderD.horizontalLineToRelative(13.0f);
        pathBuilderD.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderD.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        a.k(pathBuilderD, 19.0f, 18.0f, 6.17f);
        pathBuilderD.curveToRelative(-2.09f, 0.0f, -3.95f, -1.53f, -4.15f, -3.61f);
        pathBuilderD.curveTo(1.79f, 12.01f, 3.66f, 10.0f, 6.0f, 10.0f);
        pathBuilderD.curveToRelative(1.92f, 0.0f, 3.53f, 1.36f, 3.91f, 3.17f);
        pathBuilderD.curveToRelative(0.1f, 0.48f, 0.5f, 0.83f, 0.98f, 0.83f);
        pathBuilderD.curveToRelative(0.61f, 0.0f, 1.11f, -0.55f, 0.99f, -1.15f);
        pathBuilderD.curveToRelative(-0.43f, -2.24f, -2.11f, -4.03f, -4.29f, -4.63f);
        pathBuilderD.curveToRelative(1.1f, -1.46f, 2.89f, -2.37f, 4.89f, -2.2f);
        pathBuilderD.curveToRelative(2.88f, 0.25f, 5.01f, 2.82f, 5.01f, 5.71f);
        pathBuilderD.verticalLineTo(12.0f);
        pathBuilderD.horizontalLineToRelative(1.37f);
        pathBuilderD.curveToRelative(1.45f, 0.0f, 2.79f, 0.97f, 3.07f, 2.4f);
        pathBuilderD.curveToRelative(0.39f, 1.91f, -1.08f, 3.6f, -2.93f, 3.6f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterDrama = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
