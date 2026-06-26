package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: Icecream.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_icecream", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Icecream", "Landroidx/compose/material/icons/Icons$TwoTone;", "getIcecream", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class IcecreamKt {
    private static ImageVector _icecream;

    public static final ImageVector getIcecream(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _icecream;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Icecream", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(9.32f, 13.42f, 2.73f, 5.21f);
        pathBuilderA.lineToRelative(2.67f, -5.23f);
        pathBuilderA.curveTo(13.88f, 13.79f, 12.95f, 14.0f, 12.0f, 14.0f);
        pathBuilderA.curveTo(11.06f, 14.0f, 10.15f, 13.79f, 9.32f, 13.42f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(17.31f, 8.02f, 16.54f, 7.9f);
        pathBuilderA2.lineToRelative(-0.06f, -0.78f);
        pathBuilderA2.curveTo(16.29f, 4.8f, 14.34f, 3.0f, 12.0f, 3.0f);
        pathBuilderA2.reflectiveCurveTo(7.71f, 4.8f, 7.51f, 7.12f);
        pathBuilderA2.lineTo(7.45f, 7.9f);
        pathBuilderA2.lineTo(6.68f, 8.03f);
        pathBuilderA2.curveTo(5.72f, 8.18f, 5.0f, 9.02f, 5.0f, 10.0f);
        pathBuilderA2.curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA2.curveToRelative(0.52f, 0.0f, 1.01f, -0.21f, 1.39f, -0.56f);
        pathBuilderA2.lineToRelative(0.56f, -0.54f);
        pathBuilderA2.lineToRelative(0.66f, 0.41f);
        pathBuilderA2.curveTo(10.32f, 11.76f, 11.14f, 12.0f, 12.0f, 12.0f);
        pathBuilderA2.reflectiveCurveToRelative(1.68f, -0.24f, 2.39f, -0.68f);
        pathBuilderA2.lineToRelative(0.66f, -0.42f);
        pathBuilderA2.lineToRelative(0.56f, 0.54f);
        pathBuilderA2.curveTo(15.99f, 11.8f, 16.48f, 12.0f, 17.0f, 12.0f);
        pathBuilderA2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA2.curveTo(19.0f, 9.01f, 18.28f, 8.18f, 17.31f, 8.02f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.38f, 6.24f);
        pathBuilderD.curveTo(17.79f, 3.24f, 15.14f, 1.0f, 12.0f, 1.0f);
        pathBuilderD.reflectiveCurveTo(6.21f, 3.24f, 5.62f, 6.24f);
        pathBuilderD.curveTo(4.08f, 6.81f, 3.0f, 8.29f, 3.0f, 10.0f);
        pathBuilderD.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderD.curveToRelative(0.12f, 0.0f, 0.23f, -0.02f, 0.34f, -0.02f);
        pathBuilderD.lineTo(12.07f, 23.0f);
        pathBuilderD.lineToRelative(4.61f, -9.03f);
        pathBuilderD.curveTo(16.79f, 13.98f, 16.89f, 14.0f, 17.0f, 14.0f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.curveTo(21.0f, 8.29f, 19.92f, 6.81f, 18.38f, 6.24f);
        a.y(pathBuilderD, 12.05f, 18.63f, -2.73f, -5.21f);
        pathBuilderD.curveTo(10.15f, 13.79f, 11.06f, 14.0f, 12.0f, 14.0f);
        pathBuilderD.curveToRelative(0.95f, 0.0f, 1.88f, -0.21f, 2.72f, -0.6f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 12.05f, 18.63f, 17.0f, 12.0f);
        pathBuilderD.curveToRelative(-0.52f, 0.0f, -1.01f, -0.2f, -1.39f, -0.56f);
        pathBuilderD.lineToRelative(-0.56f, -0.54f);
        pathBuilderD.lineToRelative(-0.66f, 0.42f);
        pathBuilderD.curveTo(13.68f, 11.76f, 12.86f, 12.0f, 12.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.68f, -0.24f, -2.39f, -0.69f);
        pathBuilderD.lineTo(8.95f, 10.9f);
        pathBuilderD.lineToRelative(-0.56f, 0.54f);
        pathBuilderD.curveTo(8.01f, 11.79f, 7.52f, 12.0f, 7.0f, 12.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.98f, 0.72f, -1.82f, 1.68f, -1.97f);
        pathBuilderD.lineTo(7.45f, 7.9f);
        pathBuilderD.lineToRelative(0.06f, -0.78f);
        pathBuilderD.curveTo(7.71f, 4.8f, 9.66f, 3.0f, 12.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(4.29f, 1.8f, 4.48f, 4.12f);
        pathBuilderD.lineToRelative(0.06f, 0.78f);
        pathBuilderD.lineToRelative(0.77f, 0.12f);
        pathBuilderD.curveTo(18.28f, 8.18f, 19.0f, 9.01f, 19.0f, 10.0f);
        pathBuilderD.curveTo(19.0f, 11.1f, 18.1f, 12.0f, 17.0f, 12.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _icecream = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
