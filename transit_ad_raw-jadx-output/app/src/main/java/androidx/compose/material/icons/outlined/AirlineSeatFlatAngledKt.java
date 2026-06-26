package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: AirlineSeatFlatAngled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatFlatAngled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatFlatAngled", "Landroidx/compose/material/icons/Icons$Outlined;", "getAirlineSeatFlatAngled", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirlineSeatFlatAngledKt {
    private static ImageVector _airlineSeatFlatAngled;

    public static final ImageVector getAirlineSeatFlatAngled(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _airlineSeatFlatAngled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AirlineSeatFlatAngled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.0f, 6.5f);
        pathBuilderD.curveToRelative(0.31f, 0.0f, 0.7f, 0.15f, 0.9f, 0.56f);
        pathBuilderD.curveToRelative(0.24f, 0.5f, 0.02f, 1.1f, -0.47f, 1.34f);
        pathBuilderD.curveToRelative(-0.14f, 0.06f, -0.28f, 0.1f, -0.43f, 0.1f);
        pathBuilderD.curveToRelative(-0.3f, 0.0f, -0.7f, -0.15f, -0.89f, -0.56f);
        pathBuilderD.curveToRelative(-0.17f, -0.34f, -0.1f, -0.63f, -0.05f, -0.78f);
        pathBuilderD.curveToRelative(0.05f, -0.14f, 0.18f, -0.4f, 0.51f, -0.56f);
        pathBuilderD.curveToRelative(0.14f, -0.06f, 0.28f, -0.1f, 0.43f, -0.1f);
        pathBuilderD.moveToRelative(6.47f, 2.11f);
        pathBuilderD.lineToRelative(6.69f, 2.41f);
        pathBuilderD.curveToRelative(0.52f, 0.19f, 0.93f, 0.56f, 1.15f, 1.05f);
        pathBuilderD.curveToRelative(0.22f, 0.48f, 0.25f, 1.03f, 0.06f, 1.53f);
        pathBuilderD.lineToRelative(-0.01f, 0.02f);
        pathBuilderD.lineToRelative(-8.59f, -3.11f);
        pathBuilderD.lineToRelative(0.7f, -1.9f);
        pathBuilderD.moveTo(10.0f, 15.19f);
        pathBuilderD.lineToRelative(4.0f, 1.44f);
        androidx.compose.animation.a.o(pathBuilderD, 14.0f, 17.0f, -4.0f, -1.81f);
        pathBuilderD.moveTo(6.0f, 4.5f);
        pathBuilderD.curveToRelative(-0.44f, 0.0f, -0.88f, 0.1f, -1.3f, 0.3f);
        pathBuilderD.curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f);
        pathBuilderD.curveToRelative(0.51f, 1.07f, 1.58f, 1.7f, 2.7f, 1.7f);
        pathBuilderD.curveToRelative(0.44f, 0.0f, 0.88f, -0.1f, 1.3f, -0.3f);
        pathBuilderD.curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f);
        pathBuilderD.curveTo(8.19f, 5.13f, 7.12f, 4.5f, 6.0f, 4.5f);
        androidx.compose.animation.a.t(pathBuilderD, 11.28f, 6.05f, 9.2f, 11.71f);
        pathBuilderD.lineToRelative(12.36f, 4.47f);
        pathBuilderD.lineToRelative(0.69f, -1.89f);
        pathBuilderD.curveToRelative(0.77f, -2.09f, -0.31f, -4.39f, -2.41f, -5.15f);
        android.support.v4.media.a.t(pathBuilderD, -8.56f, -3.09f, 2.19f, 10.25f);
        pathBuilderD.lineToRelative(-0.69f, 1.89f);
        pathBuilderD.lineTo(8.0f, 14.48f);
        androidx.compose.animation.a.o(pathBuilderD, 8.0f, 19.0f, 8.0f, -1.63f);
        pathBuilderD.lineTo(20.52f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderD, 0.69f, -1.89f, -19.02f, -6.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatFlatAngled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
