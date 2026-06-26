package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: WheelchairPickup.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wheelchairPickup", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WheelchairPickup", "Landroidx/compose/material/icons/Icons$Outlined;", "getWheelchairPickup", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WheelchairPickupKt {
    private static ImageVector _wheelchairPickup;

    public static final ImageVector getWheelchairPickup(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _wheelchairPickup;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WheelchairPickup", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.5f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(4.5f, 5.11f, 4.5f, 4.0f);
        h.A(pathBuilderD, 10.0f, 10.95f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.horizontalLineTo(5.0f);
        pathBuilderD.curveTo(3.9f, 7.0f, 3.0f, 7.9f, 3.0f, 9.0f);
        a.l(pathBuilderD, 6.0f, 2.0f, 7.0f, 3.5f);
        pathBuilderD.verticalLineToRelative(-0.11f);
        pathBuilderD.curveToRelative(-1.24f, -1.26f, -2.0f, -2.99f, -2.0f, -4.89f);
        pathBuilderD.curveTo(6.5f, 14.42f, 7.91f, 12.16f, 10.0f, 10.95f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.5f, 17.0f);
        pathBuilderD.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilderD.curveToRelative(0.0f, -1.11f, 0.61f, -2.06f, 1.5f, -2.58f);
        pathBuilderD.verticalLineToRelative(-2.16f);
        pathBuilderD.curveTo(9.98f, 12.9f, 8.5f, 14.77f, 8.5f, 17.0f);
        pathBuilderD.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderD.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        h.r(pathBuilderD, 16.5f, 19.54f, 14.0f, 15.0f);
        s.y(pathBuilderD, 8.0f, -2.0f, 8.0f, 5.46f);
        pathBuilderD.lineToRelative(2.47f, 3.71f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 1.66f, -1.11f, 19.54f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wheelchairPickup = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
