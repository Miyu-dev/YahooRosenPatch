package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Subway.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_subway", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Subway", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSubway", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SubwayKt {
    private static ImageVector _subway;

    public static final ImageVector getSubway(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _subway;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Subway", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(10.67f, 18.5f, 9.17f, 20.0f, 5.66f);
        android.support.v4.media.a.t(pathBuilderL, -1.5f, -1.5f, 17.07f, 4.66f);
        pathBuilderL.curveTo(15.59f, 4.08f, 13.68f, 4.0f, 12.0f, 4.0f);
        pathBuilderL.reflectiveCurveToRelative(-3.59f, 0.08f, -5.07f, 0.66f);
        pathBuilderL.curveTo(5.01f, 5.41f, 4.0f, 6.86f, 4.0f, 8.86f);
        androidx.compose.animation.a.o(pathBuilderL, 4.0f, 20.0f, 3.5f, -0.38f);
        pathBuilderL.lineToRelative(1.15f, -1.16f);
        pathBuilderL.curveTo(7.16f, 18.29f, 6.0f, 17.04f, 6.0f, 15.5f);
        pathBuilderL.lineTo(6.0f, 9.0f);
        pathBuilderL.curveToRelative(0.0f, -2.63f, 3.0f, -3.0f, 6.0f, -3.0f);
        pathBuilderL.reflectiveCurveToRelative(6.0f, 0.37f, 6.0f, 3.0f);
        pathBuilderL.verticalLineToRelative(6.5f);
        pathBuilderL.curveToRelative(0.0f, 1.54f, -1.16f, 2.79f, -2.65f, 2.96f);
        pathBuilderL.lineToRelative(1.15f, 1.16f);
        pathBuilderL.lineTo(16.5f, 20.0f);
        pathBuilderL.lineTo(20.0f, 20.0f);
        pathBuilderL.lineTo(20.0f, 8.86f);
        pathBuilderL.curveToRelative(0.0f, -2.0f, -1.01f, -3.45f, -2.93f, -4.2f);
        pathBuilderL.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderL.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(17.8f, 2.8f);
        pathBuilderD.curveTo(16.0f, 2.09f, 13.86f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-4.0f, 0.09f, -5.8f, 0.8f);
        pathBuilderD.curveTo(3.53f, 3.84f, 2.0f, 6.05f, 2.0f, 8.86f);
        pathBuilderD.lineTo(2.0f, 22.0f);
        pathBuilderD.horizontalLineToRelative(20.0f);
        pathBuilderD.lineTo(22.0f, 8.86f);
        pathBuilderD.curveToRelative(0.0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f);
        androidx.browser.browseractions.a.y(pathBuilderD, 9.17f, 20.0f, 1.5f, -1.5f);
        pathBuilderD.horizontalLineToRelative(2.66f);
        s.r(pathBuilderD, 1.5f, 1.5f, 9.17f, 20.0f);
        pathBuilderD.moveTo(7.01f, 14.0f);
        androidx.compose.animation.a.o(pathBuilderD, 7.01f, 9.0f, 10.0f, 5.0f);
        b.q(pathBuilderD, -10.0f, 16.5f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.5f, 15.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.r(pathBuilderD, 20.0f, 20.0f, -3.5f, -0.38f);
        pathBuilderD.lineToRelative(-1.15f, -1.16f);
        pathBuilderD.curveToRelative(1.49f, -0.17f, 2.65f, -1.42f, 2.65f, -2.96f);
        pathBuilderD.lineTo(18.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, -2.63f, -3.0f, -3.0f, -6.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(-6.0f, 0.37f, -6.0f, 3.0f);
        pathBuilderD.verticalLineToRelative(6.5f);
        pathBuilderD.curveToRelative(0.0f, 1.54f, 1.16f, 2.79f, 2.65f, 2.96f);
        pathBuilderD.lineTo(7.5f, 19.62f);
        pathBuilderD.lineTo(7.5f, 20.0f);
        pathBuilderD.lineTo(4.0f, 20.0f);
        pathBuilderD.lineTo(4.0f, 8.86f);
        pathBuilderD.curveToRelative(0.0f, -2.0f, 1.01f, -3.45f, 2.93f, -4.2f);
        pathBuilderD.curveTo(8.41f, 4.08f, 10.32f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.reflectiveCurveToRelative(3.59f, 0.08f, 5.07f, 0.66f);
        pathBuilderD.curveToRelative(1.92f, 0.75f, 2.93f, 2.2f, 2.93f, 4.2f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 20.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _subway = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
