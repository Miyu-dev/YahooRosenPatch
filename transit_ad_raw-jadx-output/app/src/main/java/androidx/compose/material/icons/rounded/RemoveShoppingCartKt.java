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

/* JADX INFO: compiled from: RemoveShoppingCart.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_removeShoppingCart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RemoveShoppingCart", "Landroidx/compose/material/icons/Icons$Rounded;", "getRemoveShoppingCart", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RemoveShoppingCartKt {
    private static ImageVector _removeShoppingCart;

    public static final ImageVector getRemoveShoppingCart(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _removeShoppingCart;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RemoveShoppingCart", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(0.71f, 1.83f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(3.68f, 3.68f);
        pathBuilderD.lineToRelative(2.21f, 4.66f);
        pathBuilderD.lineToRelative(-1.35f, 2.45f);
        pathBuilderD.curveToRelative(-0.19f, 0.33f, -0.28f, 0.73f, -0.24f, 1.15f);
        pathBuilderD.curveToRelative(0.1f, 1.06f, 1.06f, 1.82f, 2.12f, 1.82f);
        pathBuilderD.horizontalLineToRelative(7.33f);
        pathBuilderD.lineToRelative(1.38f, 1.38f);
        pathBuilderD.curveToRelative(-0.5f, 0.36f, -0.83f, 0.95f, -0.83f, 1.62f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderD.curveToRelative(0.67f, 0.0f, 1.26f, -0.33f, 1.62f, -0.84f);
        pathBuilderD.lineToRelative(2.13f, 2.13f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineTo(2.12f, 1.83f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        a.y(pathBuilderD, 7.0f, 15.0f, 1.1f, -2.0f);
        pathBuilderD.horizontalLineToRelative(2.36f);
        s.r(pathBuilderD, 2.0f, 2.0f, 7.0f, 15.0f);
        pathBuilderD.moveTo(16.05f, 12.94f);
        pathBuilderD.curveToRelative(0.54f, -0.14f, 0.99f, -0.49f, 1.25f, -0.97f);
        pathBuilderD.lineToRelative(3.58f, -6.49f);
        pathBuilderD.curveTo(21.25f, 4.82f, 20.76f, 4.0f, 20.0f, 4.0f);
        androidx.compose.animation.a.A(pathBuilderD, 7.12f, 4.0f, 8.93f, 8.94f);
        pathBuilderD.moveTo(7.0f, 18.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderD.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderD, -0.9f, -2.0f, -2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeShoppingCart = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
