package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: SpatialTracking.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_spatialTracking", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpatialTracking", "Landroidx/compose/material/icons/Icons$Rounded;", "getSpatialTracking", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SpatialTrackingKt {
    private static ImageVector _spatialTracking;

    public static final ImageVector getSpatialTracking(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _spatialTracking;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SpatialTracking", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(10.0f, 9.0f, -4.0f, 0.0f);
        pathBuilderB.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        pathBuilderB.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.39f, 15.56f);
        pathBuilderD.curveTo(14.71f, 14.7f, 12.53f, 14.0f, 10.0f, 14.0f);
        pathBuilderD.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilderD.curveTo(2.61f, 16.07f, 2.0f, 17.1f, 2.0f, 18.22f);
        v.r(pathBuilderD, 21.0f, 16.0f, -2.78f);
        pathBuilderD.curveTo(18.0f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.39f, 1.76f, 19.39f, 1.76f);
        pathBuilderA.curveToRelative(-0.43f, -0.43f, -1.14f, -0.39f, -1.51f, 0.09f);
        pathBuilderA.curveToRelative(-1.5f, 1.93f, -3.35f, 6.72f, 0.0f, 11.03f);
        pathBuilderA.curveToRelative(0.37f, 0.48f, 1.08f, 0.52f, 1.5f, 0.09f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.35f, -0.35f, 0.39f, -0.91f, 0.09f, -1.3f);
        pathBuilderA.curveToRelative(-1.17f, -1.5f, -2.64f, -5.23f, 0.0f, -8.61f);
        pathBuilderA.curveTo(19.78f, 2.67f, 19.74f, 2.11f, 19.39f, 1.76f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(22.4f, 5.86f);
        pathBuilderD2.curveToRelative(0.23f, -0.4f, 0.19f, -0.9f, -0.14f, -1.22f);
        pathBuilderD2.lineToRelative(0.0f, 0.0f);
        pathBuilderD2.curveTo(21.79f, 4.16f, 21.0f, 4.27f, 20.67f, 4.85f);
        pathBuilderD2.curveToRelative(-1.15f, 2.0f, -0.57f, 4.03f, 0.01f, 5.04f);
        pathBuilderD2.curveToRelative(0.33f, 0.57f, 1.11f, 0.67f, 1.58f, 0.21f);
        pathBuilderD2.curveToRelative(0.33f, -0.33f, 0.36f, -0.84f, 0.13f, -1.25f);
        pathBuilderD2.curveTo(22.14f, 8.41f, 21.65f, 7.16f, 22.4f, 5.86f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spatialTracking = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
