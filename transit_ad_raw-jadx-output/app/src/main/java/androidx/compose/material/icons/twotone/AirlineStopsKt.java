package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: AirlineStops.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineStops", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineStops", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAirlineStops", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirlineStopsKt {
    private static ImageVector _airlineStops;

    public static final ImageVector getAirlineStops(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _airlineStops;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AirlineStops", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.21f, 9.21f);
        pathBuilderD.curveTo(15.93f, 10.78f, 13.45f, 13.3f, 13.0f, 17.0f);
        androidx.appcompat.app.m.x(pathBuilderD, 2.0f, 2.0f, 9.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(-0.5f, -4.5f, -4.37f, -8.0f, -9.0f, -8.0f);
        pathBuilderD.verticalLineTo(7.0f);
        pathBuilderD.curveToRelative(4.39f, 0.0f, 8.22f, 2.55f, 10.0f, 6.3f);
        pathBuilderD.curveToRelative(1.13f, -2.43f, 2.99f, -4.25f, 4.78f, -5.52f);
        androidx.compose.animation.a.o(pathBuilderD, 14.0f, 5.0f, 7.0f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 18.21f, 9.21f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineStops = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
