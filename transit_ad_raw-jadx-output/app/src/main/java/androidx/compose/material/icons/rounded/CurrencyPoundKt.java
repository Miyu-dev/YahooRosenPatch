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

/* JADX INFO: compiled from: CurrencyPound.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_currencyPound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyPound", "Landroidx/compose/material/icons/Icons$Rounded;", "getCurrencyPound", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CurrencyPoundKt {
    private static ImageVector _currencyPound;

    public static final ImageVector getCurrencyPound(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _currencyPound;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyPound", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.21f, 17.61f);
        pathBuilderD.curveToRelative(-0.47f, -0.24f, -1.03f, -0.05f, -1.31f, 0.4f);
        pathBuilderD.curveTo(15.54f, 18.61f, 14.93f, 19.0f, 14.0f, 19.0f);
        pathBuilderD.lineToRelative(-4.9f, 0.0f);
        pathBuilderD.curveToRelative(0.83f, -1.0f, 1.5f, -2.34f, 1.5f, -4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.35f, -0.03f, -0.69f, -0.08f, -1.0f);
        pathBuilderD.lineTo(13.0f, 14.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.lineToRelative(-3.18f, 0.0f);
        pathBuilderD.curveTo(9.0f, 10.42f, 8.0f, 9.6f, 8.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilderD.curveToRelative(1.2f, 0.0f, 2.26f, 0.61f, 2.89f, 1.53f);
        pathBuilderD.curveToRelative(0.27f, 0.4f, 0.77f, 0.59f, 1.22f, 0.4f);
        pathBuilderD.curveToRelative(0.6f, -0.25f, 0.8f, -0.99f, 0.43f, -1.53f);
        pathBuilderD.curveToRelative(-0.99f, -1.45f, -2.66f, -2.4f, -4.54f, -2.4f);
        pathBuilderD.curveTo(8.46f, 2.5f, 6.0f, 4.96f, 6.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 1.78f, 0.79f, 2.9f, 1.49f, 4.0f);
        pathBuilderD.lineTo(7.0f, 12.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.lineToRelative(1.47f, 0.0f);
        pathBuilderD.curveToRelative(0.08f, 0.31f, 0.13f, 0.64f, 0.13f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 1.9f, -1.29f, 3.11f, -2.06f, 3.66f);
        pathBuilderD.curveTo(6.2f, 18.9f, 6.0f, 19.29f, 6.0f, 19.71f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveTo(6.0f, 20.42f, 6.58f, 21.0f, 7.29f, 21.0f);
        pathBuilderD.horizontalLineTo(14.0f);
        pathBuilderD.curveToRelative(1.55f, 0.0f, 2.95f, -0.76f, 3.63f, -2.0f);
        pathBuilderD.curveTo(17.91f, 18.49f, 17.72f, 17.86f, 17.21f, 17.61f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyPound = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
