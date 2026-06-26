package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.v;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ProductionQuantityLimits.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_productionQuantityLimits", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ProductionQuantityLimits", "Landroidx/compose/material/icons/Icons$Filled;", "getProductionQuantityLimits", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ProductionQuantityLimitsKt {
    private static ImageVector _productionQuantityLimits;

    public static final ImageVector getProductionQuantityLimits(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _productionQuantityLimits;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ProductionQuantityLimits", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.app.m.v(13.0f, 10.0f, -2.0f, 8.0f, 2.0f);
        a.B(pathBuilderV, 10.0f, 13.0f, 6.0f, -2.0f);
        a.v(pathBuilderV, 1.0f, 2.0f, 6.0f);
        pathBuilderV.moveTo(7.0f, 18.0f);
        pathBuilderV.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderV.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilderV.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderV.reflectiveCurveTo(8.1f, 18.0f, 7.0f, 18.0f);
        pathBuilderV.close();
        pathBuilderV.moveTo(17.0f, 18.0f);
        pathBuilderV.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderV.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderV.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderV.reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f);
        androidx.compose.animation.a.j(pathBuilderV, 8.1f, 13.0f, 7.45f);
        pathBuilderV.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        pathBuilderV.lineTo(21.0f, 4.96f);
        pathBuilderV.lineTo(19.25f, 4.0f);
        pathBuilderV.lineToRelative(-3.7f, 7.0f);
        e.g(pathBuilderV, 8.53f, 4.27f, 2.0f, 1.0f);
        androidx.browser.browseractions.a.t(pathBuilderV, 2.0f, 2.0f, 3.6f, 7.59f);
        pathBuilderV.lineToRelative(-1.35f, 2.44f);
        pathBuilderV.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        v.t(pathBuilderV, 12.0f, -2.0f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderV, 8.1f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _productionQuantityLimits = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
