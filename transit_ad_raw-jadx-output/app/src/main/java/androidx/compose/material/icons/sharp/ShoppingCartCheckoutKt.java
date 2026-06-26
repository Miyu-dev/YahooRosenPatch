package androidx.compose.material.icons.sharp;

import a6.h;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: ShoppingCartCheckout.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shoppingCartCheckout", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShoppingCartCheckout", "Landroidx/compose/material/icons/Icons$Sharp;", "getShoppingCartCheckout", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ShoppingCartCheckoutKt {
    private static ImageVector _shoppingCartCheckout;

    public static final ImageVector getShoppingCartCheckout(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _shoppingCartCheckout;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ShoppingCartCheckout", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(7.0f, 18.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderD.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(8.1f, 18.0f, 7.0f, 18.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.0f, 18.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f);
        androidx.compose.animation.a.j(pathBuilderD, 8.1f, 13.0f, 8.66f);
        pathBuilderD.lineTo(21.0f, 4.96f);
        pathBuilderD.lineTo(19.25f, 4.0f);
        pathBuilderD.lineToRelative(-3.7f, 7.0f);
        e.g(pathBuilderD, 8.53f, 4.27f, 2.0f, 1.0f);
        a.t(pathBuilderD, 2.0f, 2.0f, 3.6f, 7.59f);
        h.n(pathBuilderD, 3.61f, 17.0f, 19.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderD, 7.0f, 8.1f, 13.0f);
        pathBuilderD.moveTo(12.0f, 2.0f);
        pathBuilderD.lineToRelative(4.0f, 4.0f);
        pathBuilderD.lineToRelative(-4.0f, 4.0f);
        pathBuilderD.lineToRelative(-1.41f, -1.41f);
        pathBuilderD.lineTo(12.17f, 7.0f);
        pathBuilderD.lineTo(8.0f, 7.0f);
        pathBuilderD.lineToRelative(0.0f, -2.0f);
        pathBuilderD.lineToRelative(4.17f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, -1.59f, -1.59f, 12.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingCartCheckout = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
