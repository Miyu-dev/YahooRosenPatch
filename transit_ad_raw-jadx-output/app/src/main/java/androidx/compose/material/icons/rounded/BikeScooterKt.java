package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BikeScooter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bikeScooter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BikeScooter", "Landroidx/compose/material/icons/Icons$Rounded;", "getBikeScooter", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BikeScooterKt {
    private static ImageVector _bikeScooter;

    public static final ImageVector getBikeScooter(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _bikeScooter;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BikeScooter", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(10.0f, 14.0f, 0.74f, 8.82f, 5.56f);
        pathBuilderC.curveTo(8.61f, 4.65f, 7.8f, 4.0f, 6.87f, 4.0f);
        pathBuilderC.horizontalLineTo(4.0f);
        pathBuilderC.curveTo(3.45f, 4.0f, 3.0f, 4.45f, 3.0f, 5.0f);
        pathBuilderC.verticalLineToRelative(0.0f);
        pathBuilderC.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.horizontalLineToRelative(2.87f);
        pathBuilderC.lineToRelative(1.42f, 6.25f);
        pathBuilderC.curveToRelative(0.0f, 0.0f, -0.01f, 0.0f, -0.01f, 0.0f);
        pathBuilderC.curveTo(6.12f, 12.9f, 4.47f, 14.73f, 4.09f, 17.0f);
        a.B(pathBuilderC, 0.0f, 2.0f, 6.0f, -1.0f);
        pathBuilderC.curveTo(6.0f, 15.79f, 7.79f, 14.0f, 10.0f, 14.0f);
        pathBuilderC.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.75f, 8.0f, -0.56f, 0.0f);
        pathBuilderA.lineToRelative(-1.35f, -3.69f);
        pathBuilderA.curveTo(16.55f, 3.52f, 15.8f, 3.0f, 14.96f, 3.0f);
        pathBuilderA.horizontalLineTo(12.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        androidx.compose.animation.a.C(pathBuilderA, 2.96f, 1.1f, 3.0f, 10.4f);
        pathBuilderA.lineToRelative(0.46f, 2.0f);
        pathBuilderA.horizontalLineTo(15.0f);
        pathBuilderA.curveToRelative(-0.43f, 0.58f, -0.75f, 1.25f, -0.9f, 2.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderA, -2.79f, 0.46f, 2.0f, 2.33f);
        pathBuilderA.curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f);
        pathBuilderA.curveToRelative(3.16f, 0.15f, 5.88f, -2.83f, 5.12f, -6.1f);
        pathBuilderA.curveTo(23.34f, 9.57f, 21.13f, 8.0f, 18.75f, 8.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(18.88f, 16.0f);
        pathBuilderA.curveToRelative(-1.54f, -0.06f, -2.84f, -1.37f, -2.88f, -2.92f);
        pathBuilderA.curveToRelative(-0.02f, -0.96f, 0.39f, -1.8f, 1.05f, -2.36f);
        pathBuilderA.lineToRelative(0.62f, 1.7f);
        pathBuilderA.curveToRelative(0.19f, 0.52f, 0.76f, 0.79f, 1.28f, 0.6f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.52f, -0.19f, 0.79f, -0.76f, 0.6f, -1.28f);
        pathBuilderA.lineToRelative(-0.63f, -1.73f);
        pathBuilderA.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.01f, -0.01f);
        pathBuilderA.curveTo(20.64f, 9.96f, 22.0f, 11.29f, 22.0f, 13.0f);
        pathBuilderA.curveTo(22.0f, 14.72f, 20.62f, 16.06f, 18.88f, 16.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.0f, 15.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveTo(11.66f, 15.0f, 10.0f, 15.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.0f, 19.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 10.55f, 19.0f, 10.0f, 19.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bikeScooter = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
