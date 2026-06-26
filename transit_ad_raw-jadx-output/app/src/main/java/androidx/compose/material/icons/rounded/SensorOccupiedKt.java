package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: SensorOccupied.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sensorOccupied", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SensorOccupied", "Landroidx/compose/material/icons/Icons$Rounded;", "getSensorOccupied", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SensorOccupiedKt {
    private static ImageVector _sensorOccupied;

    public static final ImageVector getSensorOccupied(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _sensorOccupied;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SensorOccupied", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 11.0f);
        pathBuilderD.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderD.reflectiveCurveTo(9.0f, 6.34f, 9.0f, 8.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 10.34f, 11.0f, 12.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(12.0f, 12.0f);
        pathBuilderD2.curveToRelative(-1.84f, 0.0f, -3.56f, 0.5f, -5.03f, 1.37f);
        pathBuilderD2.curveTo(6.36f, 13.73f, 6.0f, 14.39f, 6.0f, 15.09f);
        pathBuilderD2.lineTo(6.0f, 16.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD2.horizontalLineToRelative(10.0f);
        pathBuilderD2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD2.lineToRelative(0.0f, -0.91f);
        pathBuilderD2.curveToRelative(0.0f, -0.7f, -0.36f, -1.36f, -0.97f, -1.72f);
        pathBuilderD2.curveTo(15.56f, 12.5f, 13.84f, 12.0f, 12.0f, 12.0f);
        pathBuilderD2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(22.11f, 7.79f, 22.11f, 7.79f);
        pathBuilderA.curveToRelative(0.55f, -0.23f, 0.78f, -0.88f, 0.5f, -1.41f);
        pathBuilderA.curveToRelative(-1.13f, -2.12f, -2.87f, -3.86f, -4.99f, -4.99f);
        pathBuilderA.curveToRelative(-0.52f, -0.28f, -1.17f, -0.04f, -1.4f, 0.5f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.19f, 0.47f, -0.01f, 1.02f, 0.43f, 1.25f);
        pathBuilderA.curveToRelative(1.79f, 0.94f, 3.26f, 2.42f, 4.21f, 4.21f);
        pathBuilderA.curveTo(21.09f, 7.8f, 21.64f, 7.98f, 22.11f, 7.79f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(7.79f, 1.89f, 7.79f, 1.89f);
        pathBuilderA2.curveToRelative(-0.23f, -0.55f, -0.88f, -0.78f, -1.4f, -0.5f);
        pathBuilderA2.curveTo(4.27f, 2.52f, 2.52f, 4.26f, 1.4f, 6.38f);
        pathBuilderA2.curveToRelative(-0.28f, 0.52f, -0.05f, 1.18f, 0.5f, 1.41f);
        pathBuilderA2.lineToRelative(0.0f, 0.0f);
        pathBuilderA2.curveToRelative(0.47f, 0.2f, 1.02f, 0.01f, 1.25f, -0.43f);
        pathBuilderA2.curveToRelative(0.94f, -1.79f, 2.42f, -3.26f, 4.21f, -4.21f);
        pathBuilderA2.curveTo(7.8f, 2.91f, 7.98f, 2.36f, 7.79f, 1.89f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = b.a(1.89f, 16.21f, 1.89f, 16.21f);
        pathBuilderA3.curveToRelative(-0.55f, 0.23f, -0.78f, 0.88f, -0.5f, 1.4f);
        pathBuilderA3.curveToRelative(1.13f, 2.12f, 2.87f, 3.87f, 5.0f, 5.0f);
        pathBuilderA3.curveToRelative(0.52f, 0.28f, 1.17f, 0.04f, 1.4f, -0.5f);
        pathBuilderA3.lineToRelative(0.0f, 0.0f);
        pathBuilderA3.curveToRelative(0.19f, -0.47f, 0.01f, -1.02f, -0.43f, -1.25f);
        pathBuilderA3.curveToRelative(-1.79f, -0.94f, -3.26f, -2.42f, -4.21f, -4.21f);
        pathBuilderA3.curveTo(2.91f, 16.2f, 2.36f, 16.02f, 1.89f, 16.21f);
        pathBuilderA3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw6 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk86 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA4 = b.a(16.21f, 22.11f, 16.21f, 22.11f);
        pathBuilderA4.curveToRelative(0.23f, 0.55f, 0.88f, 0.78f, 1.4f, 0.5f);
        pathBuilderA4.curveToRelative(2.12f, -1.13f, 3.87f, -2.87f, 5.0f, -5.0f);
        pathBuilderA4.curveToRelative(0.28f, -0.52f, 0.04f, -1.17f, -0.5f, -1.4f);
        pathBuilderA4.horizontalLineToRelative(0.0f);
        pathBuilderA4.curveToRelative(-0.47f, -0.19f, -1.02f, -0.01f, -1.25f, 0.43f);
        pathBuilderA4.curveToRelative(-0.94f, 1.79f, -2.42f, 3.26f, -4.21f, 4.21f);
        pathBuilderA4.curveTo(16.2f, 21.09f, 16.02f, 21.64f, 16.21f, 22.11f);
        pathBuilderA4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA4.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw6, iM3151getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sensorOccupied = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
