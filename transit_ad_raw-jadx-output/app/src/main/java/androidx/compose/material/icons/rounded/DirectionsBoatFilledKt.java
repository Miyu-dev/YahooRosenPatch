package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: DirectionsBoatFilled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_directionsBoatFilled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsBoatFilled", "Landroidx/compose/material/icons/Icons$Rounded;", "getDirectionsBoatFilled", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DirectionsBoatFilledKt {
    private static ImageVector _directionsBoatFilled;

    public static final ImageVector getDirectionsBoatFilled(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _directionsBoatFilled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DirectionsBoatFilled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.0f, 21.0f);
        pathBuilderD.curveToRelative(-1.19f, 0.0f, -2.38f, -0.35f, -3.47f, -0.98f);
        pathBuilderD.curveToRelative(-0.33f, -0.19f, -0.73f, -0.19f, -1.07f, 0.0f);
        pathBuilderD.curveToRelative(-2.17f, 1.26f, -4.76f, 1.26f, -6.93f, 0.0f);
        pathBuilderD.curveToRelative(-0.33f, -0.19f, -0.73f, -0.19f, -1.07f, 0.0f);
        pathBuilderD.curveTo(6.38f, 20.65f, 5.19f, 21.0f, 4.0f, 21.0f);
        pathBuilderD.horizontalLineTo(3.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.curveToRelative(1.38f, 0.0f, 2.74f, -0.35f, 4.0f, -0.99f);
        pathBuilderD.curveToRelative(2.52f, 1.29f, 5.48f, 1.29f, 8.0f, 0.0f);
        pathBuilderD.curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4.0f, 0.99f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.r(pathBuilderD, 20.0f, 3.95f, 19.0f, 4.0f);
        pathBuilderD.curveToRelative(1.27f, 0.0f, 2.42f, -0.55f, 3.33f, -1.33f);
        pathBuilderD.curveToRelative(0.39f, -0.34f, 0.95f, -0.34f, 1.34f, 0.0f);
        pathBuilderD.curveTo(9.58f, 18.45f, 10.73f, 19.0f, 12.0f, 19.0f);
        pathBuilderD.reflectiveCurveToRelative(2.42f, -0.55f, 3.33f, -1.33f);
        pathBuilderD.curveToRelative(0.39f, -0.34f, 0.95f, -0.34f, 1.34f, 0.0f);
        pathBuilderD.curveTo(17.58f, 18.45f, 18.73f, 19.0f, 20.0f, 19.0f);
        pathBuilderD.horizontalLineToRelative(0.05f);
        pathBuilderD.lineToRelative(1.9f, -6.68f);
        pathBuilderD.curveToRelative(0.11f, -0.37f, 0.04f, -1.06f, -0.66f, -1.28f);
        pathBuilderD.lineTo(20.0f, 10.62f);
        pathBuilderD.verticalLineTo(6.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(-3.0f);
        pathBuilderD.verticalLineTo(2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(-4.0f);
        pathBuilderD.curveTo(9.45f, 1.0f, 9.0f, 1.45f, 9.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.horizontalLineTo(6.0f);
        pathBuilderD.curveTo(4.9f, 4.0f, 4.0f, 4.9f, 4.0f, 6.0f);
        pathBuilderD.verticalLineToRelative(4.62f);
        pathBuilderD.lineToRelative(-1.29f, 0.42f);
        pathBuilderD.curveToRelative(-0.63f, 0.19f, -0.81f, 0.84f, -0.66f, 1.28f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 3.95f, 19.0f, 6.0f, 6.0f);
        android.support.v4.media.a.w(pathBuilderD, 12.0f, 3.97f, 12.62f, 8.2f);
        pathBuilderD.curveToRelative(-0.41f, -0.13f, -0.84f, -0.13f, -1.25f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, s.i(pathBuilderD, 6.0f, 9.97f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBoatFilled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
