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
import c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoMeals.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noMeals", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoMeals", "Landroidx/compose/material/icons/Icons$Rounded;", "getNoMeals", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoMealsKt {
    private static ImageVector _noMeals;

    public static final ImageVector getNoMeals(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _noMeals;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoMeals", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(21.0f, 18.17f, -2.0f, -2.0f, 14.0f);
        pathBuilderW.horizontalLineToRelative(-1.0f);
        pathBuilderW.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderW.verticalLineTo(6.0f);
        pathBuilderW.curveToRelative(0.0f, -1.49f, 1.6f, -3.32f, 3.76f, -3.85f);
        pathBuilderW.curveTo(20.39f, 2.0f, 21.0f, 2.48f, 21.0f, 3.13f);
        android.support.v4.media.a.y(pathBuilderW, 18.17f, 21.19f, 22.61f);
        pathBuilderW.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderW.lineToRelative(-9.76f, -9.76f);
        pathBuilderW.curveTo(9.69f, 12.94f, 9.36f, 13.0f, 9.0f, 13.0f);
        pathBuilderW.verticalLineToRelative(8.0f);
        pathBuilderW.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderW.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderW.verticalLineToRelative(-8.0f);
        pathBuilderW.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderW.verticalLineTo(5.83f);
        pathBuilderW.lineTo(1.39f, 4.22f);
        pathBuilderW.curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f);
        pathBuilderW.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderW.lineToRelative(18.38f, 18.38f);
        pathBuilderW.curveTo(21.58f, 21.58f, 21.58f, 22.22f, 21.19f, 22.61f);
        androidx.compose.animation.a.t(pathBuilderW, 6.17f, 9.0f, 5.0f, 7.83f);
        androidx.appcompat.view.menu.a.o(pathBuilderW, 9.0f, 6.17f, 13.0f, 9.0f);
        pathBuilderW.verticalLineTo(3.0f);
        pathBuilderW.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderW.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderW.verticalLineToRelative(5.17f);
        pathBuilderW.lineToRelative(1.85f, 1.85f);
        pathBuilderW.curveTo(12.94f, 9.69f, 13.0f, 9.36f, 13.0f, 9.0f);
        pathBuilderW.close();
        pathBuilderW.moveTo(9.0f, 3.0f);
        pathBuilderW.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderW.reflectiveCurveTo(7.0f, 2.45f, 7.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.d(pathBuilderW, 1.17f, 2.0f, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noMeals = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
