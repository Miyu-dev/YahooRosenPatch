package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: CarRental.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_carRental", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarRental", "Landroidx/compose/material/icons/Icons$Outlined;", "getCarRental", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CarRentalKt {
    private static ImageVector _carRental;

    public static final ImageVector getCarRental(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _carRental;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CarRental", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(9.0f, 16.5f, -1.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = v.b(15.0f, 16.5f, -1.0f, 0.0f);
        pathBuilderB2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilderB2.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.25f, 9.6f);
        pathBuilderD.curveToRelative(-0.02f, -0.02f, -0.03f, -0.04f, -0.05f, -0.07f);
        pathBuilderD.curveTo(16.82f, 9.01f, 16.28f, 9.0f, 16.28f, 9.0f);
        pathBuilderD.horizontalLineTo(7.72f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, -0.54f, 0.01f, -0.92f, 0.54f);
        pathBuilderD.curveTo(6.78f, 9.56f, 6.77f, 9.58f, 6.75f, 9.6f);
        pathBuilderD.curveTo(6.68f, 9.71f, 6.61f, 9.84f, 6.56f, 10.0f);
        pathBuilderD.curveTo(6.34f, 10.66f, 5.82f, 12.22f, 5.0f, 14.69f);
        pathBuilderD.verticalLineToRelative(6.5f);
        pathBuilderD.curveTo(5.0f, 21.64f, 5.35f, 22.0f, 5.78f, 22.0f);
        pathBuilderD.horizontalLineToRelative(0.44f);
        pathBuilderD.curveTo(6.65f, 22.0f, 7.0f, 21.64f, 7.0f, 21.19f);
        v.r(pathBuilderD, 20.0f, 10.0f, 1.19f);
        pathBuilderD.curveToRelative(0.0f, 0.45f, 0.34f, 0.81f, 0.78f, 0.81f);
        pathBuilderD.horizontalLineToRelative(0.44f);
        pathBuilderD.curveToRelative(0.43f, 0.0f, 0.78f, -0.36f, 0.78f, -0.81f);
        pathBuilderD.verticalLineToRelative(-6.5f);
        pathBuilderD.curveToRelative(-0.82f, -2.46f, -1.34f, -4.03f, -1.56f, -4.69f);
        pathBuilderD.curveTo(17.39f, 9.84f, 17.32f, 9.71f, 17.25f, 9.6f);
        androidx.compose.animation.a.j(pathBuilderD, 8.33f, 11.0f, 7.34f);
        pathBuilderD.lineToRelative(0.23f, 0.69f);
        pathBuilderD.lineTo(16.33f, 13.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderD, 7.67f, 8.33f, 11.0f);
        b.z(pathBuilderD, 17.0f, 18.0f, 7.0f, -2.99f);
        pathBuilderD.verticalLineTo(15.0f);
        pathBuilderD.horizontalLineToRelative(10.0f);
        pathBuilderD.verticalLineToRelative(0.01f);
        pathBuilderD.verticalLineTo(18.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(10.83f, 3.0f);
        pathBuilderD2.curveTo(10.41f, 1.83f, 9.3f, 1.0f, 8.0f, 1.0f);
        pathBuilderD2.curveTo(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.65f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD2.curveToRelative(1.3f, 0.0f, 2.41f, -0.84f, 2.83f, -2.0f);
        androidx.appcompat.graphics.drawable.a.i(pathBuilderD2, 16.0f, 2.0f, 2.0f, 5.0f);
        b.w(pathBuilderD2, 1.0f, 3.0f, 10.83f);
        pathBuilderD2.moveTo(8.0f, 5.0f);
        pathBuilderD2.curveTo(7.45f, 5.0f, 7.0f, 4.55f, 7.0f, 4.0f);
        pathBuilderD2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD2, 8.55f, 5.0f, 8.0f, 5.0f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRental = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
