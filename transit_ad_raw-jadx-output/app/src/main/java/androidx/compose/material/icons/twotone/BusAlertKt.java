package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BusAlert.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_busAlert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BusAlert", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBusAlert", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BusAlertKt {
    private static ImageVector _busAlert;

    public static final ImageVector getBusAlert(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _busAlert;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BusAlert", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(8.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.f(pathBuilderD, -3.0f, 4.0f, 16.0f);
        pathBuilderD.moveTo(13.5f, 14.0f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(14.33f, 17.0f, 13.5f, 17.0f);
        pathBuilderD.reflectiveCurveTo(12.0f, 16.33f, 12.0f, 15.5f);
        pathBuilderD.reflectiveCurveTo(12.67f, 14.0f, 13.5f, 14.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.5f, 14.0f);
        pathBuilderD.curveTo(7.33f, 14.0f, 8.0f, 14.67f, 8.0f, 15.5f);
        pathBuilderD.reflectiveCurveTo(7.33f, 17.0f, 6.5f, 17.0f);
        pathBuilderD.reflectiveCurveTo(5.0f, 16.33f, 5.0f, 15.5f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 5.67f, 14.0f, 6.5f, 14.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(4.43f, 6.0f, 11.0f);
        pathBuilderB.curveToRelative(0.0f, -0.33f, 0.03f, -0.66f, 0.08f, -0.98f);
        pathBuilderB.curveTo(7.4f, 4.91f, 5.25f, 5.29f, 4.43f, 6.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(4.0f, 11.0f, 8.0f, 7.29f);
        pathBuilderO.curveTo(11.1f, 7.37f, 11.0f, 6.7f, 11.0f, 6.0f);
        pathBuilderO.horizontalLineTo(4.43f);
        pathBuilderO.curveToRelative(0.83f, -0.71f, 2.98f, -1.09f, 6.65f, -0.98f);
        pathBuilderO.curveToRelative(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.99f);
        pathBuilderO.curveTo(2.97f, 2.67f, 2.0f, 5.02f, 2.0f, 7.0f);
        pathBuilderO.verticalLineToRelative(9.5f);
        pathBuilderO.curveToRelative(0.0f, 0.95f, 0.38f, 1.81f, 1.0f, 2.44f);
        pathBuilderO.verticalLineTo(21.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.horizontalLineToRelative(1.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        android.support.v4.media.a.m(pathBuilderO, -1.0f, 8.0f, 1.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.horizontalLineToRelative(1.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderO.verticalLineToRelative(-2.06f);
        pathBuilderO.curveToRelative(0.62f, -0.63f, 1.0f, -1.49f, 1.0f, -2.44f);
        pathBuilderO.verticalLineTo(13.0f);
        pathBuilderO.curveToRelative(-1.91f, 0.0f, -3.63f, -0.76f, -4.89f, -2.0f);
        b.w(pathBuilderO, 4.0f, 16.0f, 16.0f);
        pathBuilderO.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderO.horizontalLineTo(6.0f);
        pathBuilderO.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderO, -3.0f, 12.0f, 16.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = v.b(6.5f, 15.5f, -1.5f, 0.0f);
        pathBuilderB2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilderB2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB3 = v.b(13.5f, 15.5f, -1.5f, 0.0f);
        pathBuilderB3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilderB3.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB3.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw6 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk86 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(18.0f, 1.0f);
        pathBuilderD2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilderD2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilderD2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderD2.reflectiveCurveTo(20.76f, 1.0f, 18.0f, 1.0f);
        androidx.compose.animation.a.k(pathBuilderD2, 18.5f, 9.0f, -1.0f, 8.0f);
        a.b.m(pathBuilderD2, 1.0f, 9.0f, 18.5f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.y(pathBuilderD2, -1.0f, 3.0f, 1.0f, 7.0f), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw6, iM3151getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _busAlert = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
