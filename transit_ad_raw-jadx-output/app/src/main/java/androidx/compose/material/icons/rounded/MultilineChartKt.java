package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: MultilineChart.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_multilineChart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MultilineChart", "Landroidx/compose/material/icons/Icons$Rounded;", "getMultilineChart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MultilineChartKt {
    private static ImageVector _multilineChart;

    public static final ImageVector getMultilineChart(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _multilineChart;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MultilineChart", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.36f, 6.28f, -0.06f, -0.06f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.03f, -0.37f, -1.39f, 0.04f);
        pathBuilderA.lineToRelative(-2.18f, 2.45f);
        pathBuilderA.curveTo(15.68f, 6.4f, 12.83f, 5.0f, 9.61f, 5.0f);
        pathBuilderA.curveToRelative(-2.5f, 0.0f, -4.83f, 0.87f, -6.75f, 2.3f);
        pathBuilderA.curveToRelative(-0.47f, 0.35f, -0.52f, 1.04f, -0.11f, 1.45f);
        pathBuilderA.lineToRelative(0.06f, 0.06f);
        pathBuilderA.curveToRelative(0.33f, 0.33f, 0.86f, 0.39f, 1.23f, 0.11f);
        pathBuilderA.curveTo(5.63f, 7.72f, 7.54f, 7.0f, 9.61f, 7.0f);
        pathBuilderA.curveToRelative(2.74f, 0.0f, 5.09f, 1.26f, 6.77f, 3.24f);
        pathBuilderA.lineToRelative(-2.88f, 3.24f);
        pathBuilderA.lineToRelative(-3.29f, -3.29f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderA.lineToRelative(-6.12f, 6.13f);
        pathBuilderA.curveToRelative(-0.37f, 0.37f, -0.37f, 0.98f, 0.0f, 1.35f);
        pathBuilderA.lineToRelative(0.15f, 0.15f);
        pathBuilderA.curveToRelative(0.37f, 0.37f, 0.98f, 0.37f, 1.35f, 0.0f);
        pathBuilderA.lineToRelative(5.32f, -5.33f);
        pathBuilderA.lineToRelative(3.25f, 3.25f);
        pathBuilderA.curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f);
        pathBuilderA.lineToRelative(3.35f, -3.76f);
        pathBuilderA.curveToRelative(0.62f, 1.12f, 1.08f, 2.39f, 1.32f, 3.73f);
        pathBuilderA.curveToRelative(0.08f, 0.47f, 0.47f, 0.82f, 0.95f, 0.82f);
        pathBuilderA.horizontalLineToRelative(0.09f);
        pathBuilderA.curveToRelative(0.6f, 0.0f, 1.05f, -0.55f, 0.94f, -1.14f);
        pathBuilderA.curveToRelative(-0.32f, -1.85f, -0.98f, -3.54f, -1.89f, -5.0f);
        pathBuilderA.lineTo(21.4f, 7.6f);
        pathBuilderA.curveToRelative(0.34f, -0.38f, 0.32f, -0.96f, -0.04f, -1.32f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _multilineChart = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
