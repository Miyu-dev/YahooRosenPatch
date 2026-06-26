package androidx.compose.material.icons.rounded;

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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Hevc.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hevc", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hevc", "Landroidx/compose/material/icons/Icons$Rounded;", "getHevc", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HevcKt {
    private static ImageVector _hevc;

    public static final ImageVector getHevc(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hevc;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hevc", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.25f, 9.0f);
        pathBuilderD.curveTo(5.84f, 9.0f, 5.5f, 9.34f, 5.5f, 9.75f);
        h.w(pathBuilderD, 11.0f, -1.0f, 9.75f);
        pathBuilderD.curveTo(4.5f, 9.34f, 4.16f, 9.0f, 3.75f, 9.0f);
        pathBuilderD.reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f);
        pathBuilderD.verticalLineToRelative(4.5f);
        pathBuilderD.curveTo(3.0f, 14.66f, 3.34f, 15.0f, 3.75f, 15.0f);
        pathBuilderD.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        v.r(pathBuilderD, 12.5f, 1.0f, 1.75f);
        pathBuilderD.curveTo(5.5f, 14.66f, 5.84f, 15.0f, 6.25f, 15.0f);
        pathBuilderD.reflectiveCurveTo(7.0f, 14.66f, 7.0f, 14.25f);
        pathBuilderD.verticalLineToRelative(-4.5f);
        pathBuilderD.curveTo(7.0f, 9.34f, 6.66f, 9.0f, 6.25f, 9.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(10.75f, 10.5f);
        pathBuilderD2.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderD2.curveTo(11.5f, 9.34f, 11.16f, 9.0f, 10.75f, 9.0f);
        pathBuilderD2.horizontalLineTo(9.0f);
        pathBuilderD2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD2.verticalLineToRelative(4.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD2.horizontalLineToRelative(1.75f);
        pathBuilderD2.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderD2.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        androidx.compose.animation.a.s(pathBuilderD2, 9.5f, -1.0f, 1.25f);
        pathBuilderD2.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderD2.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderD2.horizontalLineTo(9.5f);
        pathBuilderD2.verticalLineToRelative(-0.5f);
        pathBuilderD2.horizontalLineTo(10.75f);
        pathBuilderD2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(15.63f, 9.0f);
        pathBuilderD3.curveToRelative(-0.36f, 0.0f, -0.67f, 0.26f, -0.73f, 0.62f);
        pathBuilderD3.lineToRelative(-0.65f, 3.88f);
        pathBuilderD3.lineTo(13.6f, 9.62f);
        pathBuilderD3.curveTo(13.54f, 9.26f, 13.23f, 9.0f, 12.87f, 9.0f);
        pathBuilderD3.curveToRelative(-0.46f, 0.0f, -0.8f, 0.41f, -0.73f, 0.86f);
        pathBuilderD3.lineToRelative(0.65f, 3.91f);
        pathBuilderD3.curveToRelative(0.12f, 0.71f, 0.73f, 1.23f, 1.46f, 1.23f);
        pathBuilderD3.reflectiveCurveToRelative(1.34f, -0.52f, 1.46f, -1.23f);
        pathBuilderD3.lineToRelative(0.65f, -3.91f);
        pathBuilderD3.curveTo(16.43f, 9.41f, 16.08f, 9.0f, 15.63f, 9.0f);
        pathBuilderD3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD4 = a.d(19.5f, 10.5f);
        pathBuilderD4.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderD4.horizontalLineToRelative(0.5f);
        pathBuilderD4.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderD4.verticalLineTo(10.0f);
        pathBuilderD4.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD4.horizontalLineToRelative(-2.0f);
        pathBuilderD4.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD4.verticalLineToRelative(4.0f);
        pathBuilderD4.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD4.horizontalLineToRelative(2.0f);
        pathBuilderD4.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD4.verticalLineToRelative(-0.5f);
        pathBuilderD4.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderD4.horizontalLineTo(20.0f);
        pathBuilderD4.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, d.c(pathBuilderD4, -1.0f, -3.0f, 19.5f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hevc = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
