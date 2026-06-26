package androidx.compose.material.icons.twotone;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DirectionsBoat.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_directionsBoat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsBoat", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDirectionsBoat", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DirectionsBoatKt {
    private static ImageVector _directionsBoat;

    public static final ImageVector getDirectionsBoat(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _directionsBoat;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DirectionsBoat", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(6.49f, 15.68f, 8.0f, 13.96f);
        pathBuilderA.lineToRelative(1.51f, 1.72f);
        pathBuilderA.curveToRelative(0.34f, 0.4f, 1.28f, 1.32f, 2.49f, 1.32f);
        pathBuilderA.curveToRelative(1.21f, 0.0f, 2.15f, -0.92f, 2.49f, -1.32f);
        pathBuilderA.lineTo(16.0f, 13.96f);
        pathBuilderA.lineToRelative(1.51f, 1.72f);
        pathBuilderA.curveToRelative(0.2f, 0.23f, 0.6f, 0.64f, 1.14f, 0.94f);
        pathBuilderA.lineToRelative(1.12f, -3.97f);
        pathBuilderA.lineToRelative(-2.39f, -0.78f);
        pathBuilderA.lineTo(12.0f, 10.11f);
        pathBuilderA.lineToRelative(-5.38f, 1.77f);
        pathBuilderA.lineToRelative(-2.4f, 0.79f);
        pathBuilderA.lineToRelative(1.13f, 3.96f);
        pathBuilderA.curveToRelative(0.55f, -0.31f, 0.94f, -0.72f, 1.14f, -0.95f);
        androidx.compose.animation.b.r(pathBuilderA, 11.0f, 3.0f, 2.0f, 1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.c(pathBuilderA, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(3.95f, 19.0f, 4.0f, 19.0f);
        pathBuilderA2.curveToRelative(1.6f, 0.0f, 3.02f, -0.88f, 4.0f, -2.0f);
        pathBuilderA2.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        pathBuilderA2.reflectiveCurveToRelative(3.02f, -0.88f, 4.0f, -2.0f);
        pathBuilderA2.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        pathBuilderA2.horizontalLineToRelative(0.05f);
        pathBuilderA2.lineToRelative(1.89f, -6.68f);
        pathBuilderA2.curveToRelative(0.08f, -0.26f, 0.06f, -0.54f, -0.06f, -0.78f);
        pathBuilderA2.reflectiveCurveToRelative(-0.34f, -0.42f, -0.6f, -0.5f);
        pathBuilderA2.lineTo(20.0f, 10.62f);
        pathBuilderA2.lineTo(20.0f, 6.0f);
        pathBuilderA2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA2.horizontalLineToRelative(-3.0f);
        pathBuilderA2.lineTo(15.0f, 1.0f);
        pathBuilderA2.lineTo(9.0f, 1.0f);
        pathBuilderA2.verticalLineToRelative(3.0f);
        pathBuilderA2.lineTo(6.0f, 4.0f);
        pathBuilderA2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA2.verticalLineToRelative(4.62f);
        pathBuilderA2.lineToRelative(-1.29f, 0.42f);
        pathBuilderA2.curveToRelative(-0.26f, 0.08f, -0.48f, 0.26f, -0.6f, 0.5f);
        pathBuilderA2.reflectiveCurveToRelative(-0.15f, 0.52f, -0.06f, 0.78f);
        androidx.appcompat.view.menu.a.z(pathBuilderA2, 3.95f, 19.0f, 11.0f, 3.0f);
        android.support.v4.media.a.s(pathBuilderA2, 2.0f, 1.0f, -2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderA2, 11.0f, 3.0f, 6.0f, 6.0f);
        android.support.v4.media.a.w(pathBuilderA2, 12.0f, 3.97f, 12.0f, 8.0f);
        android.support.v4.media.a.C(pathBuilderA2, 6.0f, 9.97f, 6.0f, 6.0f);
        pathBuilderA2.moveTo(6.62f, 11.87f);
        pathBuilderA2.lineTo(12.0f, 10.11f);
        pathBuilderA2.lineToRelative(5.38f, 1.77f);
        pathBuilderA2.lineToRelative(2.39f, 0.78f);
        pathBuilderA2.lineToRelative(-1.12f, 3.97f);
        pathBuilderA2.curveToRelative(-0.54f, -0.3f, -0.94f, -0.71f, -1.14f, -0.94f);
        pathBuilderA2.lineTo(16.0f, 13.96f);
        pathBuilderA2.lineToRelative(-1.51f, 1.72f);
        pathBuilderA2.curveToRelative(-0.34f, 0.4f, -1.28f, 1.32f, -2.49f, 1.32f);
        pathBuilderA2.curveToRelative(-1.21f, 0.0f, -2.15f, -0.92f, -2.49f, -1.32f);
        pathBuilderA2.lineTo(8.0f, 13.96f);
        pathBuilderA2.lineToRelative(-1.51f, 1.72f);
        pathBuilderA2.curveToRelative(-0.2f, 0.23f, -0.6f, 0.63f, -1.14f, 0.93f);
        android.support.v4.media.a.n(pathBuilderA2, -1.13f, -3.96f, 2.4f, -0.78f);
        pathBuilderA2.moveTo(8.0f, 22.01f);
        pathBuilderA2.curveToRelative(1.26f, 0.64f, 2.63f, 0.97f, 4.0f, 0.97f);
        pathBuilderA2.reflectiveCurveToRelative(2.74f, -0.32f, 4.0f, -0.97f);
        pathBuilderA2.curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4.0f, 0.99f);
        android.support.v4.media.a.s(pathBuilderA2, 2.0f, -2.0f, -2.0f);
        pathBuilderA2.curveToRelative(-1.39f, 0.0f, -2.78f, -0.47f, -4.0f, -1.32f);
        pathBuilderA2.curveToRelative(-1.22f, 0.85f, -2.61f, 1.28f, -4.0f, 1.28f);
        pathBuilderA2.reflectiveCurveToRelative(-2.78f, -0.43f, -4.0f, -1.28f);
        pathBuilderA2.curveTo(6.78f, 20.53f, 5.39f, 21.0f, 4.0f, 21.0f);
        b.s(pathBuilderA2, 2.0f, 21.0f, 2.0f, 2.0f);
        pathBuilderA2.curveToRelative(1.38f, 0.0f, 2.74f, -0.35f, 4.0f, -0.99f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBoat = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
