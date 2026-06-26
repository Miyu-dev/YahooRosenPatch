package androidx.compose.material.icons.twotone;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: DirectionsBoatFilled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_directionsBoatFilled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsBoatFilled", "Landroidx/compose/material/icons/Icons$TwoTone;", "getDirectionsBoatFilled", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DirectionsBoatFilledKt {
    private static ImageVector _directionsBoatFilled;

    public static final ImageVector getDirectionsBoatFilled(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _directionsBoatFilled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DirectionsBoatFilled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.77f, 12.66f, -1.12f, 3.97f);
        pathBuilderA.curveToRelative(-0.78f, -0.43f, -1.07f, -0.86f, -2.65f, -2.67f);
        pathBuilderA.curveTo(14.4f, 15.78f, 13.57f, 17.0f, 12.0f, 17.0f);
        pathBuilderA.curveToRelative(-1.53f, 0.0f, -2.34f, -1.15f, -4.0f, -3.04f);
        pathBuilderA.curveToRelative(-1.6f, 1.82f, -1.87f, 2.21f, -2.65f, 2.65f);
        pathBuilderA.lineToRelative(-1.13f, -3.96f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderA, 12.0f, 10.11f, 19.77f, 12.66f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(19.77f, 12.66f, -1.12f, 3.97f);
        pathBuilderA2.curveToRelative(-0.78f, -0.43f, -1.07f, -0.86f, -2.65f, -2.67f);
        pathBuilderA2.curveTo(14.4f, 15.78f, 13.57f, 17.0f, 12.0f, 17.0f);
        pathBuilderA2.curveToRelative(-1.53f, 0.0f, -2.34f, -1.15f, -4.0f, -3.04f);
        pathBuilderA2.curveToRelative(-1.6f, 1.82f, -1.87f, 2.21f, -2.65f, 2.65f);
        pathBuilderA2.lineToRelative(-1.13f, -3.96f);
        a.C(pathBuilderA2, 12.0f, 10.11f, 19.77f, 12.66f);
        a.b.z(pathBuilderA2, 15.0f, 1.0f, 9.0f, 3.0f);
        pathBuilderA2.horizontalLineTo(6.0f);
        pathBuilderA2.curveTo(4.9f, 4.0f, 4.0f, 4.9f, 4.0f, 6.0f);
        pathBuilderA2.verticalLineToRelative(4.62f);
        pathBuilderA2.lineToRelative(-1.29f, 0.42f);
        pathBuilderA2.curveToRelative(-0.63f, 0.19f, -0.81f, 0.84f, -0.66f, 1.28f);
        pathBuilderA2.lineTo(3.95f, 19.0f);
        pathBuilderA2.horizontalLineTo(4.0f);
        pathBuilderA2.curveToRelative(1.6f, 0.0f, 3.02f, -0.88f, 4.0f, -2.0f);
        pathBuilderA2.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        pathBuilderA2.reflectiveCurveToRelative(3.02f, -0.88f, 4.0f, -2.0f);
        pathBuilderA2.curveToRelative(0.98f, 1.12f, 2.4f, 2.0f, 4.0f, 2.0f);
        pathBuilderA2.horizontalLineToRelative(0.05f);
        pathBuilderA2.lineToRelative(1.91f, -6.68f);
        pathBuilderA2.curveToRelative(0.11f, -0.37f, 0.04f, -1.06f, -0.66f, -1.28f);
        pathBuilderA2.lineTo(20.0f, 10.62f);
        pathBuilderA2.verticalLineTo(6.0f);
        pathBuilderA2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.browser.browseractions.a.s(pathBuilderA2, -3.0f, 1.0f, 15.0f, 1.0f);
        h.D(pathBuilderA2, 6.0f, 9.97f, 6.0f, 12.0f);
        pathBuilderA2.verticalLineToRelative(3.97f);
        pathBuilderA2.lineTo(12.0f, 8.0f);
        a.C(pathBuilderA2, 6.0f, 9.97f, 6.0f, 9.97f);
        pathBuilderA2.moveTo(16.0f, 19.68f);
        pathBuilderA2.curveToRelative(-1.22f, 0.85f, -2.61f, 1.28f, -4.0f, 1.28f);
        pathBuilderA2.reflectiveCurveToRelative(-2.78f, -0.43f, -4.0f, -1.28f);
        pathBuilderA2.curveTo(6.78f, 20.53f, 5.39f, 21.0f, 4.0f, 21.0f);
        androidx.compose.animation.a.s(pathBuilderA2, 2.0f, 2.0f, 2.0f);
        pathBuilderA2.curveToRelative(1.38f, 0.0f, 2.74f, -0.35f, 4.0f, -0.99f);
        pathBuilderA2.curveToRelative(1.26f, 0.64f, 2.63f, 0.97f, 4.0f, 0.97f);
        pathBuilderA2.reflectiveCurveToRelative(2.74f, -0.32f, 4.0f, -0.97f);
        pathBuilderA2.curveToRelative(1.26f, 0.65f, 2.62f, 0.99f, 4.0f, 0.99f);
        a.s(pathBuilderA2, 2.0f, -2.0f, -2.0f);
        pathBuilderA2.curveTo(18.61f, 21.0f, 17.22f, 20.53f, 16.0f, 19.68f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA2, 16.0f, 19.68f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBoatFilled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
