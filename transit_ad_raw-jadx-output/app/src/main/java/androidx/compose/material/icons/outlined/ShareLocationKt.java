package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: ShareLocation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shareLocation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShareLocation", "Landroidx/compose/material/icons/Icons$Outlined;", "getShareLocation", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ShareLocationKt {
    private static ImageVector _shareLocation;

    public static final ImageVector getShareLocation(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _shareLocation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ShareLocation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(13.02f, 19.93f, 2.02f);
        pathBuilderE.curveToRelative(2.01f, -0.2f, 3.84f, -1.0f, 5.32f, -2.21f);
        pathBuilderE.lineToRelative(-1.42f, -1.43f);
        pathBuilderE.curveTo(15.81f, 19.17f, 14.48f, 19.75f, 13.02f, 19.93f);
        pathBuilderE.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.03f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -4.05f, 3.03f, -7.41f, 6.95f, -7.93f);
        pathBuilderD.verticalLineTo(2.05f);
        pathBuilderD.curveTo(5.95f, 2.58f, 2.03f, 6.84f, 2.03f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 5.16f, 3.92f, 9.42f, 8.95f, 9.95f);
        pathBuilderD.verticalLineToRelative(-2.02f);
        pathBuilderD.curveTo(7.06f, 19.41f, 4.03f, 16.05f, 4.03f, 12.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(19.95f, 11.0f, 2.02f);
        pathBuilderB.curveToRelative(-0.2f, -2.01f, -1.0f, -3.84f, -2.21f, -5.32f);
        pathBuilderB.lineToRelative(-1.43f, 1.43f);
        pathBuilderB.curveTo(19.19f, 8.21f, 19.77f, 9.54f, 19.95f, 11.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(18.34f, 4.26f);
        pathBuilderD2.curveToRelative(-1.48f, -1.21f, -3.32f, -2.01f, -5.32f, -2.21f);
        pathBuilderD2.verticalLineToRelative(2.02f);
        pathBuilderD2.curveToRelative(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD2, 18.34f, 4.26f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.33f, 16.9f, 1.43f, 1.42f);
        pathBuilderA.curveToRelative(1.21f, -1.48f, 2.01f, -3.31f, 2.21f, -5.32f);
        pathBuilderA.horizontalLineToRelative(-2.02f);
        pathBuilderA.curveTo(19.77f, 14.46f, 19.19f, 15.79f, 18.33f, 16.9f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw6 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk86 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(16.0f, 11.1f);
        pathBuilderD3.curveTo(16.0f, 8.61f, 14.1f, 7.0f, 12.0f, 7.0f);
        pathBuilderD3.reflectiveCurveToRelative(-4.0f, 1.61f, -4.0f, 4.1f);
        pathBuilderD3.curveToRelative(0.0f, 1.66f, 1.33f, 3.63f, 4.0f, 5.9f);
        pathBuilderD3.curveTo(14.67f, 14.73f, 16.0f, 12.76f, 16.0f, 11.1f);
        pathBuilderD3.close();
        pathBuilderD3.moveTo(12.0f, 12.0f);
        pathBuilderD3.curveToRelative(-0.59f, 0.0f, -1.07f, -0.48f, -1.07f, -1.07f);
        pathBuilderD3.curveToRelative(0.0f, -0.59f, 0.48f, -1.07f, 1.07f, -1.07f);
        pathBuilderD3.reflectiveCurveToRelative(1.07f, 0.48f, 1.07f, 1.07f);
        pathBuilderD3.curveTo(13.07f, 11.52f, 12.59f, 12.0f, 12.0f, 12.0f);
        pathBuilderD3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD3.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw6, iM3151getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shareLocation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
