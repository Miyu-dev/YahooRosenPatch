package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_donutLarge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DonutLarge", "Landroidx/compose/material/icons/Icons$Filled;", "getDonutLarge", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DonutLarge", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(11.0f, 5.08f, 2.0f);
        pathBuilderN.curveTo(6.0f, 2.5f, 2.0f, 6.81f, 2.0f, 12.0f);
        pathBuilderN.reflectiveCurveToRelative(4.0f, 9.5f, 9.0f, 10.0f);
        pathBuilderN.verticalLineToRelative(-3.08f);
        pathBuilderN.curveToRelative(-3.0f, -0.48f, -6.0f, -3.4f, -6.0f, -6.92f);
        pathBuilderN.reflectiveCurveTo(8.0f, 5.56f, 11.0f, 5.08f);
        a.k(pathBuilderN, 18.97f, 11.0f, 22.0f);
        pathBuilderN.curveToRelative(-0.47f, -5.0f, -4.0f, -8.53f, -9.0f, -9.0f);
        pathBuilderN.verticalLineToRelative(3.08f);
        pathBuilderN.curveTo(16.0f, 5.51f, 18.54f, 8.0f, 18.97f, 11.0f);
        h.A(pathBuilderN, 13.0f, 18.92f, 22.0f);
        pathBuilderN.curveToRelative(5.0f, -0.47f, 8.53f, -4.0f, 9.0f, -9.0f);
        pathBuilderN.horizontalLineToRelative(-3.03f);
        pathBuilderN.curveTo(18.54f, 16.0f, 16.0f, 18.49f, 13.0f, 18.92f);
        pathBuilderN.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderN.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
