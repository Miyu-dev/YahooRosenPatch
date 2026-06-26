package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: AirlineSeatReclineExtra.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatReclineExtra", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatReclineExtra", "Landroidx/compose/material/icons/Icons$Sharp;", "getAirlineSeatReclineExtra", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirlineSeatReclineExtraKt {
    private static ImageVector _airlineSeatReclineExtra;

    public static final ImageVector getAirlineSeatReclineExtra(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _airlineSeatReclineExtra;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AirlineSeatReclineExtra", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(5.35f, 5.64f);
        pathBuilderD.curveToRelative(-0.9f, -0.64f, -1.12f, -1.88f, -0.49f, -2.79f);
        pathBuilderD.curveToRelative(0.63f, -0.9f, 1.88f, -1.12f, 2.79f, -0.49f);
        pathBuilderD.curveToRelative(0.9f, 0.64f, 1.12f, 1.88f, 0.49f, 2.79f);
        pathBuilderD.curveToRelative(-0.64f, 0.9f, -1.88f, 1.12f, -2.79f, 0.49f);
        androidx.compose.animation.a.t(pathBuilderD, 16.0f, 19.0f, 6.5f, 19.0f);
        pathBuilderD.lineTo(4.0f, 7.0f);
        pathBuilderD.lineTo(2.0f, 7.0f);
        pathBuilderD.lineToRelative(2.85f, 14.0f);
        b.k(pathBuilderD, 16.0f, 21.0f, -2.0f);
        pathBuilderD.moveTo(16.23f, 15.0f);
        pathBuilderD.horizontalLineToRelative(-4.88f);
        pathBuilderD.lineToRelative(-1.03f, -4.1f);
        pathBuilderD.curveToRelative(1.58f, 0.89f, 3.28f, 1.54f, 5.15f, 1.22f);
        pathBuilderD.lineTo(15.47f, 9.99f);
        pathBuilderD.curveToRelative(-1.63f, 0.31f, -3.44f, -0.27f, -4.69f, -1.25f);
        pathBuilderD.lineTo(9.14f, 7.47f);
        pathBuilderD.curveToRelative(-0.23f, -0.18f, -0.49f, -0.3f, -0.76f, -0.38f);
        pathBuilderD.curveToRelative(-0.32f, -0.09f, -0.66f, -0.12f, -0.99f, -0.06f);
        pathBuilderD.horizontalLineToRelative(-0.02f);
        pathBuilderD.curveToRelative(-1.23f, 0.22f, -2.05f, 1.39f, -1.84f, 2.61f);
        pathBuilderD.lineTo(7.44f, 18.0f);
        pathBuilderD.horizontalLineToRelative(9.24f);
        pathBuilderD.lineToRelative(3.82f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderD, 1.5f, -1.5f, -5.77f, -4.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatReclineExtra = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
