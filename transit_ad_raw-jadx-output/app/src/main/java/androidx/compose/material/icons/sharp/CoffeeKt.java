package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: Coffee.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_coffee", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Coffee", "Landroidx/compose/material/icons/Icons$Sharp;", "getCoffee", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CoffeeKt {
    private static ImageVector _coffee;

    public static final ImageVector getCoffee(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _coffee;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Coffee", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.appcompat.app.m.f(18.5f, 3.0f, 4.0f, 8.0f);
        pathBuilderF.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilderF.horizontalLineToRelative(0.0f);
        pathBuilderF.curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilderF.verticalLineToRelative(-1.0f);
        pathBuilderF.lineToRelative(0.4f, 0.0f);
        pathBuilderF.curveToRelative(1.67f, 0.0f, 3.19f, -1.13f, 3.52f, -2.77f);
        pathBuilderF.curveTo(22.39f, 4.98f, 20.67f, 3.0f, 18.5f, 3.0f);
        a.x(pathBuilderF, 16.0f, 5.0f, 3.0f, 6.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderF, 5.0f, 16.0f, 18.5f, 8.0f);
        c.a.i(pathBuilderF, 18.0f, 5.0f, 0.5f);
        pathBuilderF.curveTo(19.33f, 5.0f, 20.0f, 5.67f, 20.0f, 6.5f);
        pathBuilderF.reflectiveCurveTo(19.33f, 8.0f, 18.5f, 8.0f);
        b.r(pathBuilderF, 4.0f, 19.0f, 16.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.i(pathBuilderF, 4.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _coffee = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
