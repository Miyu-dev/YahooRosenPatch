package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoMeals.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noMeals", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoMeals", "Landroidx/compose/material/icons/Icons$Sharp;", "getNoMeals", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoMealsKt {
    private static ImageVector _noMeals;

    public static final ImageVector getNoMeals(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _noMeals;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoMeals", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(16.0f, 14.0f, 6.0f);
        pathBuilderN.curveToRelative(0.0f, -1.76f, 2.24f, -4.0f, 5.0f, -4.0f);
        a.z(pathBuilderN, 16.17f, -2.0f, -2.0f, 14.0f);
        b.w(pathBuilderN, 16.0f, 20.49f, 23.31f);
        pathBuilderN.lineTo(10.02f, 12.85f);
        pathBuilderN.curveTo(9.69f, 12.94f, 9.36f, 13.0f, 9.0f, 13.0f);
        v.z(pathBuilderN, 9.0f, 7.0f, -9.0f);
        pathBuilderN.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderN.verticalLineTo(5.83f);
        pathBuilderN.lineTo(0.69f, 3.51f);
        pathBuilderN.lineTo(2.1f, 2.1f);
        s.r(pathBuilderN, 19.8f, 19.8f, 20.49f, 23.31f);
        pathBuilderN.moveTo(6.17f, 9.0f);
        j.h(pathBuilderN, 5.0f, 7.83f, 9.0f, 6.17f);
        a.b.z(pathBuilderN, 9.0f, 2.0f, 7.0f, 2.17f);
        c.a.g(pathBuilderN, 2.0f, 2.0f, 2.0f);
        h.D(pathBuilderN, 13.0f, 9.0f, 2.0f, -2.0f);
        pathBuilderN.verticalLineToRelative(6.17f);
        pathBuilderN.lineToRelative(1.85f, 1.85f);
        pathBuilderN.curveTo(12.94f, 9.69f, 13.0f, 9.36f, 13.0f, 9.0f);
        pathBuilderN.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderN.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noMeals = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
