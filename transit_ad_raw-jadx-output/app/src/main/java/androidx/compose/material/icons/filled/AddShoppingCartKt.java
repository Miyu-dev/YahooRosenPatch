package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: AddShoppingCart.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addShoppingCart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddShoppingCart", "Landroidx/compose/material/icons/Icons$Filled;", "getAddShoppingCart", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AddShoppingCartKt {
    private static ImageVector _addShoppingCart;

    public static final ImageVector getAddShoppingCart(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _addShoppingCart;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddShoppingCart", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(11.0f, 9.0f, 2.0f, 13.0f, 6.0f);
        a.y(pathBuilderC, 3.0f, 16.0f, 4.0f, -3.0f);
        androidx.compose.animation.a.o(pathBuilderC, 13.0f, 1.0f, -2.0f, 3.0f);
        b.s(pathBuilderC, 8.0f, 4.0f, 2.0f, 3.0f);
        android.support.v4.media.a.v(pathBuilderC, 3.0f, 7.0f, 18.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderC.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilderC.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderC.close();
        pathBuilderC.moveTo(17.0f, 18.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderC.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderC.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        androidx.browser.browseractions.a.y(pathBuilderC, 7.17f, 14.75f, 0.03f, -0.12f);
        pathBuilderC.lineToRelative(0.9f, -1.63f);
        pathBuilderC.horizontalLineToRelative(7.45f);
        pathBuilderC.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        pathBuilderC.lineToRelative(3.86f, -7.01f);
        pathBuilderC.lineTo(19.42f, 4.0f);
        pathBuilderC.horizontalLineToRelative(-0.01f);
        pathBuilderC.lineToRelative(-1.1f, 2.0f);
        pathBuilderC.lineToRelative(-2.76f, 5.0f);
        pathBuilderC.lineTo(8.53f, 11.0f);
        pathBuilderC.lineToRelative(-0.13f, -0.27f);
        pathBuilderC.lineTo(6.16f, 6.0f);
        pathBuilderC.lineToRelative(-0.95f, -2.0f);
        pathBuilderC.lineToRelative(-0.94f, -2.0f);
        b.s(pathBuilderC, 1.0f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.lineToRelative(3.6f, 7.59f);
        pathBuilderC.lineToRelative(-1.35f, 2.45f);
        pathBuilderC.curveToRelative(-0.16f, 0.28f, -0.25f, 0.61f, -0.25f, 0.96f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        android.support.v4.media.a.w(pathBuilderC, 12.0f, -2.0f, 7.42f, 15.0f);
        pathBuilderC.curveToRelative(-0.13f, 0.0f, -0.25f, -0.11f, -0.25f, -0.25f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addShoppingCart = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
