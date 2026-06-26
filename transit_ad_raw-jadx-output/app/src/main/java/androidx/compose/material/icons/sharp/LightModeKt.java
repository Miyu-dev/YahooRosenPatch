package androidx.compose.material.icons.sharp;

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
import c.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LightMode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_lightMode", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LightMode", "Landroidx/compose/material/icons/Icons$Sharp;", "getLightMode", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LightModeKt {
    private static ImageVector _lightMode;

    public static final ImageVector getLightMode(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _lightMode;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LightMode", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 7.0f);
        pathBuilderD.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderD.reflectiveCurveTo(14.76f, 7.0f, 12.0f, 7.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 12.0f, 7.0f, 11.0f, 1.0f);
        s.l(pathBuilderD, 4.0f, 2.0f, 1.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 11.0f, 1.0f, 11.0f, 19.0f);
        android.support.v4.media.a.m(pathBuilderD, 4.0f, 2.0f, -4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 11.0f, 19.0f, 23.0f, 11.0f);
        pathBuilderD.lineToRelative(-4.0f, 0.0f);
        f.f(pathBuilderD, 2.0f, 4.0f, 0.0f, 11.0f);
        pathBuilderD.moveTo(5.0f, 11.0f);
        pathBuilderD.lineToRelative(-4.0f, 0.0f);
        pathBuilderD.lineToRelative(0.0f, 2.0f);
        s.r(pathBuilderD, 4.0f, 0.0f, 5.0f, 11.0f);
        pathBuilderD.moveTo(16.24f, 17.66f);
        pathBuilderD.lineToRelative(2.47f, 2.47f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderD, -2.47f, -2.47f, 16.24f, 17.66f);
        pathBuilderD.moveTo(3.87f, 5.28f);
        pathBuilderD.lineToRelative(2.47f, 2.47f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        android.support.v4.media.a.C(pathBuilderD, 5.28f, 3.87f, 3.87f, 5.28f);
        pathBuilderD.moveTo(6.34f, 16.24f);
        pathBuilderD.lineToRelative(-2.47f, 2.47f);
        pathBuilderD.lineToRelative(1.41f, 1.41f);
        s.r(pathBuilderD, 2.47f, -2.47f, 6.34f, 16.24f);
        pathBuilderD.moveTo(18.72f, 3.87f);
        pathBuilderD.lineToRelative(-2.47f, 2.47f);
        pathBuilderD.lineToRelative(1.41f, 1.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 2.47f, -2.47f, 18.72f, 3.87f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lightMode = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
