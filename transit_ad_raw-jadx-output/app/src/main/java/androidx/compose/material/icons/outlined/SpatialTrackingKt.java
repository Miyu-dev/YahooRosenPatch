package androidx.compose.material.icons.outlined;

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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_spatialTracking", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SpatialTracking", "Landroidx/compose/material/icons/Icons$Outlined;", "getSpatialTracking", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SpatialTrackingKt {
    private static ImageVector _spatialTracking;

    public static final ImageVector getSpatialTracking(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _spatialTracking;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SpatialTracking", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.0f, 13.0f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderD.reflectiveCurveTo(6.0f, 6.79f, 6.0f, 9.0f);
        pathBuilderD.curveTo(6.0f, 11.21f, 7.79f, 13.0f, 10.0f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.0f, 7.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.curveTo(8.0f, 7.9f, 8.9f, 7.0f, 10.0f, 7.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(16.39f, 15.56f);
        pathBuilderD2.curveTo(14.71f, 14.7f, 12.53f, 14.0f, 10.0f, 14.0f);
        pathBuilderD2.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilderD2.curveTo(2.61f, 16.07f, 2.0f, 17.1f, 2.0f, 18.22f);
        v.r(pathBuilderD2, 21.0f, 16.0f, -2.78f);
        pathBuilderD2.curveTo(18.0f, 17.1f, 17.39f, 16.07f, 16.39f, 15.56f);
        a.q(pathBuilderD2, 16.0f, 19.0f, 4.0f, -0.78f);
        pathBuilderD2.curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f);
        pathBuilderD2.curveTo(5.71f, 16.73f, 7.63f, 16.0f, 10.0f, 16.0f);
        pathBuilderD2.curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f);
        pathBuilderD2.curveTo(15.8f, 17.5f, 16.0f, 17.84f, 16.0f, 18.22f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD2, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.05f, 2.41f, 18.64f, 1.0f);
        pathBuilderA.curveToRelative(-3.51f, 3.51f, -3.51f, 9.21f, 0.0f, 12.73f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        pathBuilderA.curveTo(17.32f, 9.58f, 17.32f, 5.14f, 20.05f, 2.41f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = androidx.compose.animation.b.a(22.88f, 5.24f, -1.41f, -1.41f);
        pathBuilderA2.curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.0f, 7.07f);
        pathBuilderA2.lineToRelative(1.41f, -1.41f);
        pathBuilderA2.curveTo(21.71f, 8.32f, 21.71f, 6.41f, 22.88f, 5.24f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spatialTracking = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
