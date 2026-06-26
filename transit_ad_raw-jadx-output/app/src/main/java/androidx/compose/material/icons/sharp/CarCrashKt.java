package androidx.compose.material.icons.sharp;

import a.b;
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

/* JADX INFO: compiled from: CarCrash.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_carCrash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarCrash", "Landroidx/compose/material/icons/Icons$Sharp;", "getCarCrash", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CarCrashKt {
    private static ImageVector _carCrash;

    public static final ImageVector getCarCrash(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _carCrash;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.CarCrash", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.0f, 1.0f);
        pathBuilderD.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderD.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        androidx.compose.animation.a.k(pathBuilderD, 18.5f, 7.0f, -1.0f, 3.0f);
        b.m(pathBuilderD, 1.0f, 7.0f, 18.5f, 8.0f);
        androidx.appcompat.graphics.drawable.a.q(pathBuilderD, 1.0f, -1.0f, 8.0f, 18.5f);
        pathBuilderD.moveTo(17.91f, 13.0f);
        pathBuilderD.curveToRelative(0.06f, 0.16f, 0.09f, 0.33f, 0.09f, 0.5f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(15.0f, 14.33f, 15.0f, 13.5f);
        pathBuilderD.curveToRelative(0.0f, -0.39f, 0.15f, -0.74f, 0.39f, -1.01f);
        pathBuilderD.curveToRelative(-1.63f, -0.66f, -2.96f, -1.91f, -3.71f, -3.49f);
        s.C(pathBuilderD, 5.81f, 1.04f, -3.0f, 11.0f);
        pathBuilderD.curveToRelative(0.0f, -0.69f, 0.1f, -1.37f, 0.29f, -2.0f);
        pathBuilderD.horizontalLineTo(5.41f);
        pathBuilderD.lineTo(3.0f, 11.0f);
        pathBuilderD.verticalLineToRelative(9.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 3.0f, -2.0f, 12.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.verticalLineToRelative(-7.68f);
        pathBuilderD.curveTo(19.95f, 12.83f, 18.84f, 13.01f, 17.91f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.5f, 15.0f);
        pathBuilderD.curveTo(6.67f, 15.0f, 6.0f, 14.33f, 6.0f, 13.5f);
        pathBuilderD.reflectiveCurveTo(6.67f, 12.0f, 7.5f, 12.0f);
        pathBuilderD.reflectiveCurveTo(9.0f, 12.67f, 9.0f, 13.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 8.33f, 15.0f, 7.5f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carCrash = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
