package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: ShoppingCartCheckout.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shoppingCartCheckout", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShoppingCartCheckout", "Landroidx/compose/material/icons/Icons$Rounded;", "getShoppingCartCheckout", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ShoppingCartCheckoutKt {
    private static ImageVector _shoppingCartCheckout;

    public static final ImageVector getShoppingCartCheckout(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _shoppingCartCheckout;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ShoppingCartCheckout", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        s.u(pathBuilderD, 7.0f, 1.1f, -2.0f, 7.45f);
        pathBuilderD.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        pathBuilderD.lineToRelative(3.24f, -6.14f);
        pathBuilderD.curveToRelative(0.25f, -0.48f, 0.08f, -1.08f, -0.4f, -1.34f);
        pathBuilderD.curveToRelative(-0.49f, -0.27f, -1.1f, -0.08f, -1.36f, 0.41f);
        pathBuilderD.lineTo(15.55f, 11.0f);
        pathBuilderD.horizontalLineTo(8.53f);
        pathBuilderD.lineTo(4.54f, 2.57f);
        pathBuilderD.curveTo(4.38f, 2.22f, 4.02f, 2.0f, 3.64f, 2.0f);
        pathBuilderD.horizontalLineTo(2.0f);
        pathBuilderD.curveTo(1.45f, 2.0f, 1.0f, 2.45f, 1.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.lineToRelative(3.6f, 7.59f);
        pathBuilderD.lineToRelative(-1.35f, 2.44f);
        pathBuilderD.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        pathBuilderD.horizontalLineToRelative(11.0f);
        pathBuilderD.curveTo(18.55f, 17.0f, 19.0f, 16.55f, 19.0f, 16.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(11.29f, 2.71f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(2.59f, 2.59f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(-2.59f, 2.59f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineTo(12.17f, 7.0f);
        pathBuilderD.lineTo(9.0f, 7.0f);
        pathBuilderD.curveTo(8.45f, 7.0f, 8.0f, 6.55f, 8.0f, 6.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.lineToRelative(3.17f, 0.0f);
        pathBuilderD.lineToRelative(-0.88f, -0.88f);
        pathBuilderD.curveTo(10.9f, 3.73f, 10.9f, 3.1f, 11.29f, 2.71f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shoppingCartCheckout = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
