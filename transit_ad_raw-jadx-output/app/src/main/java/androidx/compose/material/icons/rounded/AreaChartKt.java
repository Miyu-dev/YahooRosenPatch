package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: AreaChart.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_areaChart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AreaChart", "Landroidx/compose/material/icons/Icons$Rounded;", "getAreaChart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AreaChartKt {
    private static ImageVector _areaChart;

    public static final ImageVector getAreaChart(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _areaChart;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AreaChart", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(8.0f, 17.0f, 3.39f, -4.66f);
        pathBuilderA.curveToRelative(0.33f, -0.46f, 0.98f, -0.55f, 1.42f, -0.2f);
        pathBuilderA.lineTo(21.0f, 18.5f);
        pathBuilderA.verticalLineTo(19.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderA.horizontalLineTo(4.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderA.lineToRelative(0.0f, -5.72f);
        pathBuilderA.curveToRelative(0.22f, 0.0f, 0.44f, 0.07f, 0.62f, 0.22f);
        a.z(pathBuilderA, 8.0f, 17.0f, 3.0f, 11.0f);
        pathBuilderA.curveToRelative(0.44f, 0.0f, 0.88f, 0.15f, 1.25f, 0.44f);
        pathBuilderA.lineToRelative(3.37f, 2.69f);
        pathBuilderA.lineToRelative(2.77f, -3.81f);
        pathBuilderA.curveToRelative(0.66f, -0.91f, 1.95f, -1.1f, 2.85f, -0.4f);
        pathBuilderA.lineTo(21.0f, 15.97f);
        pathBuilderA.verticalLineTo(8.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(-3.0f);
        pathBuilderA.lineToRelative(-4.18f, -3.34f);
        pathBuilderA.curveToRelative(-0.45f, -0.36f, -1.1f, -0.27f, -1.44f, 0.2f);
        pathBuilderA.lineTo(7.0f, 10.0f);
        pathBuilderA.lineTo(3.6f, 7.45f);
        pathBuilderA.curveTo(3.42f, 7.32f, 3.21f, 7.25f, 3.0f, 7.25f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 3.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _areaChart = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
