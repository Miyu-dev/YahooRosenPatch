package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Pageview.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pageview", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pageview", "Landroidx/compose/material/icons/Icons$Rounded;", "getPageview", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PageviewKt {
    private static ImageVector _pageview;

    public static final ImageVector getPageview(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _pageview;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pageview", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(11.5f, 9.0f);
        pathBuilderD.curveTo(10.12f, 9.0f, 9.0f, 10.12f, 9.0f, 11.5f);
        pathBuilderD.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilderD.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilderD.reflectiveCurveTo(12.88f, 9.0f, 11.5f, 9.0f);
        androidx.compose.animation.a.t(pathBuilderD, 20.0f, 4.0f, 4.0f, 4.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(12.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(16.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.lineTo(22.0f, 6.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.y(pathBuilderD, 16.08f, 17.5f, -2.2f, -2.2f);
        pathBuilderD.curveToRelative(-0.9f, 0.58f, -2.03f, 0.84f, -3.22f, 0.62f);
        pathBuilderD.curveToRelative(-1.88f, -0.35f, -3.38f, -1.93f, -3.62f, -3.83f);
        pathBuilderD.curveToRelative(-0.38f, -3.01f, 2.18f, -5.52f, 5.21f, -5.04f);
        pathBuilderD.curveToRelative(1.88f, 0.3f, 3.39f, 1.84f, 3.7f, 3.71f);
        pathBuilderD.curveToRelative(0.19f, 1.16f, -0.08f, 2.23f, -0.64f, 3.12f);
        pathBuilderD.lineToRelative(2.2f, 2.19f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 0.39f, 1.03f, 0.0f, 1.42f);
        pathBuilderD.curveToRelative(-0.4f, 0.4f, -1.04f, 0.4f, -1.43f, 0.01f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pageview = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
