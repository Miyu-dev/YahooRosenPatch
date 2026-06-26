package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: QueryStats.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_queryStats", "Landroidx/compose/ui/graphics/vector/ImageVector;", "QueryStats", "Landroidx/compose/material/icons/Icons$Outlined;", "getQueryStats", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class QueryStatsKt {
    private static ImageVector _queryStats;

    public static final ImageVector getQueryStats(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _queryStats;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.QueryStats", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.88f, 18.47f);
        pathBuilderD.curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f);
        pathBuilderD.curveToRelative(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
        pathBuilderD.reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f);
        pathBuilderD.reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f);
        pathBuilderD.curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f);
        pathBuilderD.lineTo(21.58f, 23.0f);
        android.support.v4.media.a.C(pathBuilderD, 23.0f, 21.58f, 19.88f, 18.47f);
        pathBuilderD.moveTo(16.08f, 18.58f);
        pathBuilderD.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilderD.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilderD.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderD.curveTo(18.58f, 17.46f, 17.46f, 18.58f, 16.08f, 18.58f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.72f, 10.08f);
        pathBuilderD.curveToRelative(-0.74f, 0.02f, -1.45f, 0.18f, -2.1f, 0.45f);
        pathBuilderD.lineToRelative(-0.55f, -0.83f);
        pathBuilderD.lineToRelative(-3.8f, 6.18f);
        pathBuilderD.lineToRelative(-3.01f, -3.52f);
        pathBuilderD.lineToRelative(-3.63f, 5.81f);
        pathBuilderD.lineTo(1.0f, 17.0f);
        pathBuilderD.lineToRelative(5.0f, -8.0f);
        pathBuilderD.lineToRelative(3.0f, 3.5f);
        pathBuilderD.lineTo(13.0f, 6.0f);
        pathBuilderD.curveTo(13.0f, 6.0f, 15.72f, 10.08f, 15.72f, 10.08f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.31f, 10.58f);
        pathBuilderD.curveToRelative(-0.64f, -0.28f, -1.33f, -0.45f, -2.05f, -0.49f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 5.12f, -8.09f, 5.12f, -8.09f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 23.0f, 3.18f, 18.31f, 10.58f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queryStats = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
