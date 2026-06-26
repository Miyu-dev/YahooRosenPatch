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

/* JADX INFO: compiled from: QueryStats.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_queryStats", "Landroidx/compose/ui/graphics/vector/ImageVector;", "QueryStats", "Landroidx/compose/material/icons/Icons$Rounded;", "getQueryStats", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class QueryStatsKt {
    private static ImageVector _queryStats;

    public static final ImageVector getQueryStats(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _queryStats;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.QueryStats", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.88f, 18.47f);
        pathBuilderD.curveToRelative(0.48f, -0.77f, 0.75f, -1.67f, 0.69f, -2.66f);
        pathBuilderD.curveToRelative(-0.13f, -2.15f, -1.84f, -3.97f, -3.97f, -4.2f);
        pathBuilderD.curveToRelative(-2.72f, -0.3f, -5.02f, 1.81f, -5.02f, 4.47f);
        pathBuilderD.curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.49f, 4.5f);
        pathBuilderD.curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f);
        pathBuilderD.lineToRelative(2.41f, 2.41f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 19.88f, 18.47f, 16.08f, 18.58f);
        pathBuilderD.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilderD.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilderD.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderD.curveTo(18.58f, 17.46f, 17.46f, 18.58f, 16.08f, 18.58f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.72f, 10.08f);
        pathBuilderD.curveToRelative(-0.74f, 0.02f, -1.45f, 0.18f, -2.1f, 0.45f);
        pathBuilderD.lineToRelative(-0.55f, -0.83f);
        pathBuilderD.lineToRelative(-3.08f, 5.01f);
        pathBuilderD.curveToRelative(-0.36f, 0.58f, -1.17f, 0.64f, -1.61f, 0.13f);
        pathBuilderD.lineToRelative(-2.12f, -2.47f);
        pathBuilderD.lineToRelative(-3.06f, 4.9f);
        pathBuilderD.curveToRelative(-0.31f, 0.49f, -0.97f, 0.62f, -1.44f, 0.28f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(-0.42f, -0.31f, -0.54f, -0.89f, -0.26f, -1.34f);
        pathBuilderD.lineToRelative(3.78f, -6.05f);
        pathBuilderD.curveToRelative(0.36f, -0.57f, 1.17f, -0.63f, 1.61f, -0.12f);
        pathBuilderD.lineTo(9.0f, 12.5f);
        pathBuilderD.lineToRelative(3.18f, -5.17f);
        pathBuilderD.curveToRelative(0.38f, -0.62f, 1.28f, -0.64f, 1.68f, -0.03f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 15.72f, 10.08f, 18.31f, 10.58f);
        pathBuilderD.curveToRelative(-0.64f, -0.28f, -1.33f, -0.45f, -2.05f, -0.49f);
        pathBuilderD.lineTo(20.8f, 2.9f);
        pathBuilderD.curveToRelative(0.31f, -0.49f, 0.97f, -0.61f, 1.43f, -0.27f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.43f, 0.31f, 0.54f, 0.9f, 0.26f, 1.34f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 18.31f, 10.58f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queryStats = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
