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

/* JADX INFO: compiled from: QueryBuilder.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_queryBuilder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "QueryBuilder", "Landroidx/compose/material/icons/Icons$Rounded;", "getQueryBuilder", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class QueryBuilderKt {
    private static ImageVector _queryBuilder;

    public static final ImageVector getQueryBuilder(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _queryBuilder;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.QueryBuilder", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(11.99f, 2.0f);
        pathBuilderD.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilderD.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilderD.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 20.0f);
        pathBuilderD.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        androidx.compose.animation.a.j(pathBuilderD, 11.78f, 7.0f, -0.06f);
        pathBuilderD.curveToRelative(-0.4f, 0.0f, -0.72f, 0.32f, -0.72f, 0.72f);
        pathBuilderD.verticalLineToRelative(4.72f);
        pathBuilderD.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        pathBuilderD.lineToRelative(4.15f, 2.49f);
        pathBuilderD.curveToRelative(0.34f, 0.2f, 0.78f, 0.1f, 0.98f, -0.24f);
        pathBuilderD.curveToRelative(0.21f, -0.34f, 0.1f, -0.79f, -0.25f, -0.99f);
        pathBuilderD.lineToRelative(-3.87f, -2.3f);
        pathBuilderD.lineTo(12.5f, 7.72f);
        pathBuilderD.curveToRelative(0.0f, -0.4f, -0.32f, -0.72f, -0.72f, -0.72f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queryBuilder = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
