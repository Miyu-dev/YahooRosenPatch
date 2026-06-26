package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LinkedCamera.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_linkedCamera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LinkedCamera", "Landroidx/compose/material/icons/Icons$Rounded;", "getLinkedCamera", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LinkedCameraKt {
    private static ImageVector _linkedCamera;

    public static final ImageVector getLinkedCamera(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _linkedCamera;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LinkedCamera", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.0f, 13.0f, -2.5f, 0.0f);
        pathBuilderB.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilderB.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.6f, 2.37f);
        pathBuilderD.curveToRelative(2.1f, 0.27f, 3.77f, 1.93f, 4.03f, 4.03f);
        pathBuilderD.curveTo(20.67f, 6.74f, 20.95f, 7.0f, 21.29f, 7.0f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.39f, 0.0f, 0.71f, -0.34f, 0.66f, -0.73f);
        pathBuilderD.curveToRelative(-0.33f, -2.72f, -2.5f, -4.89f, -5.22f, -5.22f);
        pathBuilderD.curveTo(16.34f, 1.0f, 16.0f, 1.32f, 16.0f, 1.71f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveTo(16.0f, 2.05f, 16.26f, 2.33f, 16.6f, 2.37f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(19.23f, 6.19f);
        pathBuilderD2.curveTo(18.93f, 5.0f, 18.0f, 4.07f, 16.81f, 3.77f);
        pathBuilderD2.curveTo(16.4f, 3.67f, 16.0f, 3.99f, 16.0f, 4.42f);
        pathBuilderD2.lineToRelative(0.0f, 0.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.29f, 0.19f, 0.57f, 0.48f, 0.64f);
        pathBuilderD2.curveToRelative(0.72f, 0.18f, 1.29f, 0.74f, 1.46f, 1.46f);
        pathBuilderD2.curveTo(18.01f, 6.81f, 18.28f, 7.0f, 18.58f, 7.0f);
        pathBuilderD2.lineToRelative(0.0f, 0.0f);
        pathBuilderD2.curveTo(19.01f, 7.0f, 19.33f, 6.6f, 19.23f, 6.19f);
        pathBuilderD2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(17.0f, 8.0f);
        pathBuilderD3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD3.verticalLineTo(4.0f);
        pathBuilderD3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD3.horizontalLineTo(9.88f);
        pathBuilderD3.curveTo(9.32f, 3.0f, 8.78f, 3.24f, 8.4f, 3.65f);
        pathBuilderD3.lineTo(7.17f, 5.0f);
        pathBuilderD3.horizontalLineTo(4.0f);
        pathBuilderD3.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        pathBuilderD3.verticalLineToRelative(12.0f);
        pathBuilderD3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD3.horizontalLineToRelative(16.0f);
        pathBuilderD3.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD3.verticalLineToRelative(-9.0f);
        pathBuilderD3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.w(pathBuilderD3, 17.0f, 12.0f, 17.5f);
        pathBuilderD3.curveToRelative(-2.48f, 0.0f, -4.5f, -2.02f, -4.5f, -4.5f);
        pathBuilderD3.reflectiveCurveTo(9.52f, 8.5f, 12.0f, 8.5f);
        pathBuilderD3.reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD3, 14.48f, 17.5f, 12.0f, 17.5f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkedCamera = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
