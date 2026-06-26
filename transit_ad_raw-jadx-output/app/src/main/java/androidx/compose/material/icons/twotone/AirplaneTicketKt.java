package androidx.compose.material.icons.twotone;

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
import c.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: AirplaneTicket.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_airplaneTicket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirplaneTicket", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAirplaneTicket", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirplaneTicketKt {
    private static ImageVector _airplaneTicket;

    public static final ImageVector getAirplaneTicket(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _airplaneTicket;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AirplaneTicket", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.01f, 8.54f);
        pathBuilderD.curveTo(5.2f, 9.23f, 6.0f, 10.52f, 6.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 1.47f, -0.81f, 2.77f, -2.0f, 3.46f);
        f.g(pathBuilderD, 18.0f, 16.0f, 6.0f, 4.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 4.01f, 8.54f, 8.14f, 12.53f);
        pathBuilderD.lineToRelative(1.26f, 0.99f);
        pathBuilderD.lineToRelative(2.39f, -0.64f);
        pathBuilderD.lineToRelative(-2.4f, -4.16f);
        pathBuilderD.lineToRelative(1.4f, -0.38f);
        pathBuilderD.lineToRelative(4.01f, 3.74f);
        pathBuilderD.lineToRelative(2.44f, -0.65f);
        pathBuilderD.curveToRelative(0.51f, -0.14f, 1.04f, 0.17f, 1.18f, 0.68f);
        pathBuilderD.curveToRelative(0.13f, 0.51f, -0.17f, 1.04f, -0.69f, 1.19f);
        pathBuilderD.lineToRelative(-8.86f, 2.36f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, -1.66f, -2.88f, 8.14f, 12.53f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.19f, 4.0f, 4.0f);
        pathBuilderB.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        pathBuilderB.verticalLineToRelative(4.0f);
        pathBuilderB.curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f);
        pathBuilderB.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilderB.verticalLineToRelative(4.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(6.0f);
        pathBuilderB.curveTo(22.0f, 4.9f, 21.19f, 4.0f, 20.19f, 4.0f);
        a.q(pathBuilderB, 20.0f, 18.0f, 4.0f, -2.54f);
        pathBuilderB.curveToRelative(1.19f, -0.69f, 2.0f, -1.99f, 2.0f, -3.46f);
        pathBuilderB.curveToRelative(0.0f, -1.48f, -0.8f, -2.77f, -1.99f, -3.46f);
        pathBuilderB.lineTo(4.0f, 6.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.verticalLineTo(18.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(17.73f, 13.3f);
        pathBuilderD2.curveToRelative(0.52f, -0.15f, 0.82f, -0.68f, 0.69f, -1.19f);
        pathBuilderD2.curveToRelative(-0.14f, -0.51f, -0.67f, -0.82f, -1.18f, -0.68f);
        pathBuilderD2.lineToRelative(-2.44f, 0.65f);
        pathBuilderD2.lineToRelative(-4.01f, -3.74f);
        pathBuilderD2.lineToRelative(-1.4f, 0.38f);
        pathBuilderD2.lineToRelative(2.4f, 4.16f);
        pathBuilderD2.lineTo(9.4f, 13.52f);
        pathBuilderD2.lineToRelative(-1.26f, -0.99f);
        pathBuilderD2.lineToRelative(-0.93f, 0.25f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD2, 1.66f, 2.88f, 17.73f, 13.3f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airplaneTicket = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
