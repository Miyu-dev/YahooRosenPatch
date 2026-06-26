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

/* JADX INFO: compiled from: AirlineSeatFlat.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airlineSeatFlat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatFlat", "Landroidx/compose/material/icons/Icons$Outlined;", "getAirlineSeatFlat", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirlineSeatFlatKt {
    private static ImageVector _airlineSeatFlat;

    public static final ImageVector getAirlineSeatFlat(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _airlineSeatFlat;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AirlineSeatFlat", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(5.0f, 13.0f);
        pathBuilderD.curveToRelative(0.78f, 0.0f, 1.55f, -0.3f, 2.14f, -0.9f);
        pathBuilderD.curveToRelative(1.16f, -1.19f, 1.14f, -3.08f, -0.04f, -4.24f);
        pathBuilderD.curveTo(6.51f, 7.29f, 5.75f, 7.0f, 5.0f, 7.0f);
        pathBuilderD.curveToRelative(-0.78f, 0.0f, -1.55f, 0.3f, -2.14f, 0.9f);
        pathBuilderD.curveToRelative(-1.16f, 1.19f, -1.14f, 3.08f, 0.04f, 4.24f);
        pathBuilderD.curveToRelative(0.59f, 0.57f, 1.35f, 0.86f, 2.1f, 0.86f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.29f, 9.3f);
        pathBuilderD.curveToRelative(0.19f, -0.19f, 0.44f, -0.3f, 0.71f, -0.3f);
        pathBuilderD.curveToRelative(0.26f, 0.0f, 0.51f, 0.1f, 0.7f, 0.28f);
        pathBuilderD.curveToRelative(0.4f, 0.39f, 0.4f, 1.01f, 0.02f, 1.41f);
        pathBuilderD.curveToRelative(-0.2f, 0.2f, -0.45f, 0.31f, -0.72f, 0.31f);
        pathBuilderD.curveToRelative(-0.26f, 0.0f, -0.51f, -0.1f, -0.7f, -0.28f);
        pathBuilderD.curveToRelative(-0.4f, -0.4f, -0.4f, -1.02f, -0.01f, -1.42f);
        androidx.compose.animation.a.t(pathBuilderD, 18.0f, 7.0f, 9.0f, 7.0f);
        android.support.v4.media.a.m(pathBuilderD, 6.0f, 13.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        androidx.compose.animation.a.t(pathBuilderD, 11.0f, 11.0f, 11.0f, 9.0f);
        pathBuilderD.horizontalLineToRelative(7.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.w(pathBuilderD, -9.0f, 2.0f, 16.0f, 6.0f);
        a.l(pathBuilderD, 2.0f, 8.0f, -2.0f, 6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.i(pathBuilderD, -2.0f, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatFlat = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
