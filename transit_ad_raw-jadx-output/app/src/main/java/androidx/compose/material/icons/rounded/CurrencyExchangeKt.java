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

/* JADX INFO: compiled from: CurrencyExchange.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_currencyExchange", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyExchange", "Landroidx/compose/material/icons/Icons$Rounded;", "getCurrencyExchange", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CurrencyExchangeKt {
    private static ImageVector _currencyExchange;

    public static final ImageVector getCurrencyExchange(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _currencyExchange;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyExchange", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 23.0f);
        pathBuilderD.curveToRelative(5.7f, 0.0f, 10.39f, -4.34f, 10.95f, -9.9f);
        pathBuilderD.curveToRelative(0.06f, -0.59f, -0.41f, -1.1f, -1.0f, -1.1f);
        pathBuilderD.curveToRelative(-0.51f, 0.0f, -0.94f, 0.38f, -0.99f, 0.88f);
        pathBuilderD.curveTo(20.52f, 17.44f, 16.67f, 21.0f, 12.0f, 21.0f);
        pathBuilderD.curveToRelative(-3.12f, 0.0f, -5.87f, -1.59f, -7.48f, -4.0f);
        pathBuilderD.lineTo(6.0f, 17.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineTo(2.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.lineToRelative(0.0f, -1.67f);
        pathBuilderD.curveTo(4.99f, 21.15f, 8.28f, 23.0f, 12.0f, 23.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 1.0f);
        pathBuilderD.curveTo(6.3f, 1.0f, 1.61f, 5.34f, 1.05f, 10.9f);
        pathBuilderD.curveTo(1.0f, 11.49f, 1.46f, 12.0f, 2.05f, 12.0f);
        pathBuilderD.curveToRelative(0.51f, 0.0f, 0.94f, -0.38f, 0.99f, -0.88f);
        pathBuilderD.curveTo(3.48f, 6.56f, 7.33f, 3.0f, 12.0f, 3.0f);
        pathBuilderD.curveToRelative(3.12f, 0.0f, 5.87f, 1.59f, 7.48f, 4.0f);
        pathBuilderD.lineTo(18.0f, 7.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineTo(4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.lineToRelative(0.0f, 1.67f);
        pathBuilderD.curveTo(19.01f, 2.85f, 15.72f, 1.0f, 12.0f, 1.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(11.12f, 5.88f);
        pathBuilderD.curveTo(11.12f, 5.39f, 11.52f, 5.0f, 12.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(0.88f, 0.39f, 0.88f, 0.88f);
        pathBuilderD.lineToRelative(0.0f, 0.37f);
        pathBuilderD.curveToRelative(1.07f, 0.19f, 1.75f, 0.76f, 2.16f, 1.3f);
        pathBuilderD.curveToRelative(0.34f, 0.44f, 0.16f, 1.08f, -0.36f, 1.3f);
        pathBuilderD.curveTo(14.32f, 9.0f, 13.9f, 8.88f, 13.66f, 8.57f);
        pathBuilderD.curveToRelative(-0.28f, -0.38f, -0.78f, -0.77f, -1.6f, -0.77f);
        pathBuilderD.curveToRelative(-0.7f, 0.0f, -1.81f, 0.37f, -1.81f, 1.39f);
        pathBuilderD.curveToRelative(0.0f, 0.95f, 0.86f, 1.31f, 2.64f, 1.9f);
        pathBuilderD.curveToRelative(2.4f, 0.83f, 3.01f, 2.05f, 3.01f, 3.45f);
        pathBuilderD.curveToRelative(0.0f, 2.62f, -2.5f, 3.13f, -3.02f, 3.22f);
        pathBuilderD.lineToRelative(0.0f, 0.37f);
        pathBuilderD.curveToRelative(0.0f, 0.48f, -0.39f, 0.88f, -0.88f, 0.88f);
        pathBuilderD.reflectiveCurveToRelative(-0.88f, -0.39f, -0.88f, -0.88f);
        pathBuilderD.lineToRelative(0.0f, -0.42f);
        pathBuilderD.curveToRelative(-0.63f, -0.15f, -1.93f, -0.61f, -2.69f, -2.1f);
        pathBuilderD.curveToRelative(-0.23f, -0.44f, 0.03f, -1.02f, 0.49f, -1.2f);
        pathBuilderD.curveToRelative(0.41f, -0.16f, 0.9f, -0.01f, 1.11f, 0.38f);
        pathBuilderD.curveToRelative(0.32f, 0.61f, 0.95f, 1.37f, 2.12f, 1.37f);
        pathBuilderD.curveToRelative(0.93f, 0.0f, 1.98f, -0.48f, 1.98f, -1.61f);
        pathBuilderD.curveToRelative(0.0f, -0.96f, -0.7f, -1.46f, -2.28f, -2.03f);
        pathBuilderD.curveToRelative(-1.1f, -0.39f, -3.35f, -1.03f, -3.35f, -3.31f);
        pathBuilderD.curveToRelative(0.0f, -0.1f, 0.01f, -2.4f, 2.62f, -2.96f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 11.12f, 5.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyExchange = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
