package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LocationDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_locationDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LocationDisabled", "Landroidx/compose/material/icons/Icons$Filled;", "getLocationDisabled", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LocationDisabledKt {
    private static ImageVector _locationDisabled;

    public static final ImageVector getLocationDisabled(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _locationDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocationDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.94f, 11.0f);
        pathBuilderD.curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        androidx.compose.animation.a.o(pathBuilderD, 13.0f, 1.0f, -2.0f, 2.06f);
        pathBuilderD.curveToRelative(-1.13f, 0.12f, -2.19f, 0.46f, -3.16f, 0.97f);
        pathBuilderD.lineToRelative(1.5f, 1.5f);
        pathBuilderD.curveTo(10.16f, 5.19f, 11.06f, 5.0f, 12.0f, 5.0f);
        pathBuilderD.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, 0.94f, -0.19f, 1.84f, -0.52f, 2.65f);
        pathBuilderD.lineToRelative(1.5f, 1.5f);
        pathBuilderD.curveToRelative(0.5f, -0.96f, 0.84f, -2.02f, 0.97f, -3.15f);
        c.a.k(pathBuilderD, 23.0f, 13.0f, -2.0f, -2.06f);
        pathBuilderD.moveTo(3.0f, 4.27f);
        pathBuilderD.lineToRelative(2.04f, 2.04f);
        pathBuilderD.curveTo(3.97f, 7.62f, 3.25f, 9.23f, 3.06f, 11.0f);
        b.s(pathBuilderD, 1.0f, 11.0f, 2.0f, 2.06f);
        pathBuilderD.curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        androidx.compose.animation.a.o(pathBuilderD, 11.0f, 23.0f, 2.0f, -2.06f);
        pathBuilderD.curveToRelative(1.77f, -0.2f, 3.38f, -0.91f, 4.69f, -1.98f);
        pathBuilderD.lineTo(19.73f, 21.0f);
        pathBuilderD.lineTo(21.0f, 19.73f);
        android.support.v4.media.a.C(pathBuilderD, 4.27f, 3.0f, 3.0f, 4.27f);
        pathBuilderD.moveTo(16.27f, 17.54f);
        pathBuilderD.curveTo(15.09f, 18.45f, 13.61f, 19.0f, 12.0f, 19.0f);
        pathBuilderD.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilderD.curveToRelative(0.0f, -1.61f, 0.55f, -3.09f, 1.46f, -4.27f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(pathBuilderD, 9.81f, 9.81f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
