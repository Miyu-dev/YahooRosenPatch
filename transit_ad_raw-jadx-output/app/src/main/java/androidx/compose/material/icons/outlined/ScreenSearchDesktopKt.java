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

/* JADX INFO: compiled from: ScreenSearchDesktop.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_screenSearchDesktop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScreenSearchDesktop", "Landroidx/compose/material/icons/Icons$Outlined;", "getScreenSearchDesktop", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScreenSearchDesktopKt {
    private static ImageVector _screenSearchDesktop;

    public static final ImageVector getScreenSearchDesktop(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _screenSearchDesktop;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ScreenSearchDesktop", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(4.0f, 18.0f, 16.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilderB.lineTo(22.0f, 5.0f);
        pathBuilderB.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderB.horizontalLineTo(4.0f);
        pathBuilderB.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(11.0f);
        pathBuilderB.curveTo(2.0f, 17.1f, 2.9f, 18.0f, 4.0f, 18.0f);
        b.r(pathBuilderB, 4.0f, 5.0f, 16.0f, 11.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.i(pathBuilderB, 4.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.b.i(1.0f, 19.0f, 22.0f, 2.0f, -22.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.97f, 7.53f);
        pathBuilderD.curveToRelative(-1.37f, -1.37f, -3.58f, -1.37f, -4.95f, 0.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.37f, 3.58f, 0.0f, 4.95f);
        pathBuilderD.curveToRelative(1.18f, 1.18f, 3.0f, 1.34f, 4.36f, 0.47f);
        pathBuilderD.lineToRelative(2.09f, 2.09f);
        pathBuilderD.lineToRelative(1.06f, -1.06f);
        pathBuilderD.lineToRelative(-2.09f, -2.09f);
        pathBuilderD.curveTo(15.31f, 10.53f, 15.16f, 8.71f, 13.97f, 7.53f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.91f, 11.41f);
        pathBuilderD.curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0.0f);
        pathBuilderD.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilderD.reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0.0f);
        pathBuilderD.curveTo(13.69f, 9.37f, 13.69f, 10.63f, 12.91f, 11.41f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenSearchDesktop = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
