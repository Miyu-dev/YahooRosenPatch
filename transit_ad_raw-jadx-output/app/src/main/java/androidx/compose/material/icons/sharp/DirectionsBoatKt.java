package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: DirectionsBoat.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_directionsBoat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsBoat", "Landroidx/compose/material/icons/Icons$Sharp;", "getDirectionsBoat", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DirectionsBoatKt {
    private static ImageVector _directionsBoat;

    public static final ImageVector getDirectionsBoat(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _directionsBoat;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DirectionsBoat", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.0f, 21.0f);
        pathBuilderD.curveToRelative(-1.39f, 0.0f, -2.78f, -0.47f, -4.0f, -1.32f);
        pathBuilderD.curveToRelative(-2.44f, 1.71f, -5.56f, 1.71f, -8.0f, 0.0f);
        pathBuilderD.curveTo(6.78f, 20.53f, 5.39f, 21.0f, 4.0f, 21.0f);
        androidx.compose.animation.a.s(pathBuilderD, 2.0f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(1.38f, 0.0f, 2.74f, -0.35f, 4.0f, -0.99f);
        pathBuilderD.curveToRelative(2.52f, 1.29f, 5.48f, 1.29f, 8.0f, 0.0f);
        pathBuilderD.curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4.0f, 0.99f);
        b.t(pathBuilderD, 2.0f, -2.0f, -2.0f);
        pathBuilderD.moveTo(3.95f, 19.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.curveToRelative(1.6f, 0.0f, 3.02f, -0.88f, 4.0f, -2.0f);
        pathBuilderD.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(3.02f, -0.88f, 4.0f, -2.0f);
        pathBuilderD.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(0.05f);
        pathBuilderD.lineToRelative(2.18f, -7.65f);
        s.D(pathBuilderD, -2.23f, -0.73f, 4.0f, -5.0f);
        pathBuilderD.verticalLineTo(1.0f);
        pathBuilderD.horizontalLineTo(9.0f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.verticalLineToRelative(6.62f);
        s.r(pathBuilderD, -2.23f, 0.73f, 3.95f, 19.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 6.0f, 6.0f, 12.0f, 3.97f);
        pathBuilderD.lineTo(12.0f, 8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.i(pathBuilderD, 6.0f, 9.97f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBoat = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
