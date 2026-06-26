package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Handyman.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_handyman", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Handyman", "Landroidx/compose/material/icons/Icons$Rounded;", "getHandyman", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HandymanKt {
    private static ImageVector _handyman;

    public static final ImageVector getHandyman(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _handyman;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Handyman", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.67f, 18.17f, -4.72f, -4.72f);
        pathBuilderA.curveToRelative(-0.48f, -0.48f, -0.99f, -0.59f, -1.58f, -0.59f);
        pathBuilderA.lineToRelative(-2.54f, 2.54f);
        pathBuilderA.curveToRelative(0.0f, 0.59f, 0.11f, 1.11f, 0.59f, 1.58f);
        pathBuilderA.lineToRelative(4.72f, 4.72f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderA.lineToRelative(2.12f, -2.12f);
        pathBuilderA.curveTo(22.06f, 19.2f, 22.06f, 18.56f, 21.67f, 18.17f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.63f, 9.49f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(0.71f, -0.71f);
        pathBuilderD.lineToRelative(2.12f, 2.12f);
        pathBuilderD.curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f);
        pathBuilderD.lineToRelative(-2.83f, -2.83f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.lineToRelative(-0.71f, 0.71f);
        pathBuilderD.verticalLineTo(2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.62f, -0.76f, -0.95f, -1.21f, -0.5f);
        pathBuilderD.lineToRelative(-2.54f, 2.54f);
        pathBuilderD.curveToRelative(-0.45f, 0.45f, -0.12f, 1.21f, 0.5f, 1.21f);
        pathBuilderD.horizontalLineToRelative(2.54f);
        pathBuilderD.lineToRelative(-0.71f, 0.71f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(0.35f, 0.35f);
        pathBuilderD.lineToRelative(-2.89f, 2.89f);
        pathBuilderD.lineTo(7.85f, 6.48f);
        pathBuilderD.verticalLineToRelative(-1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilderD.lineTo(5.54f, 2.74f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.lineTo(2.71f, 4.16f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineTo(4.73f, 7.6f);
        pathBuilderD.curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.71f, 0.29f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.lineToRelative(4.13f, 4.13f);
        pathBuilderD.lineToRelative(-0.85f, 0.85f);
        pathBuilderD.horizontalLineTo(8.42f);
        pathBuilderD.curveToRelative(-0.53f, 0.0f, -1.04f, 0.21f, -1.41f, 0.59f);
        pathBuilderD.lineToRelative(-4.72f, 4.72f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(2.12f, 2.12f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(4.72f, -4.72f);
        pathBuilderD.curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f);
        pathBuilderD.verticalLineToRelative(-1.29f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 5.15f, -5.15f, 16.63f, 9.49f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handyman = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
