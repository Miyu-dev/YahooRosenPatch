package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: DirectionsBoat.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_directionsBoat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsBoat", "Landroidx/compose/material/icons/Icons$Outlined;", "getDirectionsBoat", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DirectionsBoatKt {
    private static ImageVector _directionsBoat;

    public static final ImageVector getDirectionsBoat(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _directionsBoat;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DirectionsBoat", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(13.0f, 3.0f, 1.0f, -2.0f);
        pathBuilderE.lineTo(11.0f, 3.0f);
        pathBuilderE.horizontalLineToRelative(2.0f);
        pathBuilderE.moveToRelative(-1.0f, 7.11f);
        pathBuilderE.lineToRelative(5.38f, 1.77f);
        pathBuilderE.lineToRelative(2.39f, 0.78f);
        pathBuilderE.lineToRelative(-1.12f, 3.97f);
        pathBuilderE.curveToRelative(-0.54f, -0.3f, -0.94f, -0.71f, -1.14f, -0.94f);
        pathBuilderE.lineTo(16.0f, 13.96f);
        pathBuilderE.lineToRelative(-1.51f, 1.72f);
        pathBuilderE.curveToRelative(-0.34f, 0.4f, -1.28f, 1.32f, -2.49f, 1.32f);
        pathBuilderE.reflectiveCurveToRelative(-2.15f, -0.92f, -2.49f, -1.32f);
        pathBuilderE.lineTo(8.0f, 13.96f);
        pathBuilderE.lineToRelative(-1.51f, 1.72f);
        pathBuilderE.curveToRelative(-0.2f, 0.23f, -0.6f, 0.63f, -1.14f, 0.93f);
        pathBuilderE.lineToRelative(-1.13f, -3.96f);
        pathBuilderE.lineToRelative(2.4f, -0.79f);
        pathBuilderE.lineTo(12.0f, 10.11f);
        pathBuilderE.moveTo(15.0f, 1.0f);
        pathBuilderE.lineTo(9.0f, 1.0f);
        pathBuilderE.verticalLineToRelative(3.0f);
        pathBuilderE.lineTo(6.0f, 4.0f);
        pathBuilderE.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderE.verticalLineToRelative(4.62f);
        pathBuilderE.lineToRelative(-1.29f, 0.42f);
        pathBuilderE.curveToRelative(-0.26f, 0.08f, -0.48f, 0.26f, -0.6f, 0.5f);
        pathBuilderE.reflectiveCurveToRelative(-0.15f, 0.52f, -0.06f, 0.78f);
        pathBuilderE.lineTo(3.95f, 19.0f);
        pathBuilderE.lineTo(4.0f, 19.0f);
        pathBuilderE.curveToRelative(1.6f, 0.0f, 3.02f, -0.88f, 4.0f, -2.0f);
        pathBuilderE.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        pathBuilderE.reflectiveCurveToRelative(3.02f, -0.88f, 4.0f, -2.0f);
        pathBuilderE.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        pathBuilderE.horizontalLineToRelative(0.05f);
        pathBuilderE.lineToRelative(1.89f, -6.68f);
        pathBuilderE.curveToRelative(0.08f, -0.26f, 0.06f, -0.54f, -0.06f, -0.78f);
        pathBuilderE.reflectiveCurveToRelative(-0.34f, -0.42f, -0.6f, -0.5f);
        pathBuilderE.lineTo(20.0f, 10.62f);
        pathBuilderE.lineTo(20.0f, 6.0f);
        pathBuilderE.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderE, -3.0f, 15.0f, 1.0f);
        pathBuilderE.moveTo(6.0f, 9.97f);
        androidx.compose.animation.a.o(pathBuilderE, 6.0f, 6.0f, 12.0f, 3.97f);
        android.support.v4.media.a.C(pathBuilderE, 12.0f, 8.0f, 6.0f, 9.97f);
        pathBuilderE.moveTo(16.0f, 19.68f);
        pathBuilderE.curveToRelative(-1.22f, 0.85f, -2.61f, 1.28f, -4.0f, 1.28f);
        pathBuilderE.reflectiveCurveToRelative(-2.78f, -0.43f, -4.0f, -1.28f);
        pathBuilderE.curveTo(6.78f, 20.53f, 5.39f, 21.0f, 4.0f, 21.0f);
        b.s(pathBuilderE, 2.0f, 21.0f, 2.0f, 2.0f);
        pathBuilderE.curveToRelative(1.38f, 0.0f, 2.74f, -0.35f, 4.0f, -0.99f);
        pathBuilderE.curveToRelative(1.26f, 0.64f, 2.63f, 0.97f, 4.0f, 0.97f);
        pathBuilderE.reflectiveCurveToRelative(2.74f, -0.32f, 4.0f, -0.97f);
        pathBuilderE.curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4.0f, 0.99f);
        android.support.v4.media.a.s(pathBuilderE, 2.0f, -2.0f, -2.0f);
        pathBuilderE.curveToRelative(-1.39f, 0.0f, -2.78f, -0.47f, -4.0f, -1.32f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBoat = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
