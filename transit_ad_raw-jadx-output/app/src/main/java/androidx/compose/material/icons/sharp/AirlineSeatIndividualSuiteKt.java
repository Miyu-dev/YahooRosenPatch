package androidx.compose.material.icons.sharp;

import a.b;
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

/* JADX INFO: compiled from: AirlineSeatIndividualSuite.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatIndividualSuite", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatIndividualSuite", "Landroidx/compose/material/icons/Icons$Sharp;", "getAirlineSeatIndividualSuite", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirlineSeatIndividualSuiteKt {
    private static ImageVector _airlineSeatIndividualSuite;

    public static final ImageVector getAirlineSeatIndividualSuite(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _airlineSeatIndividualSuite;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AirlineSeatIndividualSuite", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(7.0f, 13.0f);
        pathBuilderD.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveTo(8.65f, 7.0f, 7.0f, 7.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        androidx.compose.animation.a.t(pathBuilderD, 23.0f, 7.0f, 11.0f, 7.0f);
        pathBuilderD.verticalLineToRelative(7.0f);
        pathBuilderD.lineTo(3.0f, 14.0f);
        pathBuilderD.lineTo(3.0f, 7.0f);
        b.s(pathBuilderD, 1.0f, 7.0f, 10.0f, 22.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderD, 23.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatIndividualSuite = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
