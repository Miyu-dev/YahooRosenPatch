package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AirportShuttle.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airportShuttle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirportShuttle", "Landroidx/compose/material/icons/Icons$Outlined;", "getAirportShuttle", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirportShuttleKt {
    private static ImageVector _airportShuttle;

    public static final ImageVector getAirportShuttle(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _airportShuttle;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AirportShuttle", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(17.0f, 5.0f, 3.0f, 5.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(9.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderA.horizontalLineToRelative(6.0f);
        pathBuilderA.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        d.g(pathBuilderA, 2.0f, -5.0f, -6.0f, -6.0f);
        pathBuilderA.moveTo(15.0f, 7.0f);
        a.B(pathBuilderA, 1.0f, 3.0f, 3.0f, -4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 15.0f, 7.0f, 9.0f, 7.0f);
        android.support.v4.media.a.w(pathBuilderA, 4.0f, 3.0f, 9.0f, 10.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 9.0f, 7.0f, 3.0f, 7.0f);
        android.support.v4.media.a.w(pathBuilderA, 4.0f, 3.0f, 3.0f, 10.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 3.0f, 7.0f, 6.0f, 17.25f);
        pathBuilderA.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        pathBuilderA.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilderA.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilderA.reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f);
        pathBuilderA.close();
        pathBuilderA.moveTo(18.0f, 17.25f);
        pathBuilderA.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        pathBuilderA.reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilderA.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilderA.reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f);
        androidx.compose.animation.a.j(pathBuilderA, 21.0f, 14.0f, -0.78f);
        pathBuilderA.curveToRelative(-0.55f, -0.61f, -1.34f, -1.0f, -2.22f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1.0f);
        pathBuilderA.lineTo(8.22f, 14.0f);
        pathBuilderA.curveToRelative(-0.55f, -0.61f, -1.33f, -1.0f, -2.22f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1.0f);
        b.s(pathBuilderA, 3.0f, 14.0f, -2.0f, 18.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderA, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airportShuttle = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
