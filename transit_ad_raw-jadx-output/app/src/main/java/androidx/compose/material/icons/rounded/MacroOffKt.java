package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: MacroOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_macroOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MacroOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getMacroOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MacroOffKt {
    private static ImageVector _macroOff;

    public static final ImageVector getMacroOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _macroOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MacroOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.2f, 13.08f);
        pathBuilderD.curveToRelative(-0.64f, -0.09f, -1.21f, 0.48f, -1.12f, 1.12f);
        pathBuilderD.curveTo(3.67f, 18.6f, 7.44f, 22.0f, 12.0f, 22.0f);
        pathBuilderD.curveTo(12.0f, 17.44f, 8.6f, 13.67f, 4.2f, 13.08f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(12.0f, 5.5f);
        pathBuilderD2.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderD2.curveToRelative(0.0f, 0.99f, -0.58f, 1.84f, -1.42f, 2.25f);
        pathBuilderD2.lineToRelative(2.48f, 2.48f);
        pathBuilderD2.curveToRelative(0.11f, 0.02f, 0.23f, 0.03f, 0.35f, 0.03f);
        pathBuilderD2.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilderD2.curveToRelative(0.0f, -1.0f, -0.59f, -1.85f, -1.43f, -2.25f);
        pathBuilderD2.curveToRelative(0.84f, -0.4f, 1.43f, -1.25f, 1.43f, -2.25f);
        pathBuilderD2.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilderD2.curveToRelative(-0.53f, 0.0f, -1.01f, 0.16f, -1.42f, 0.44f);
        pathBuilderD2.lineTo(14.5f, 3.5f);
        pathBuilderD2.curveTo(14.5f, 2.12f, 13.38f, 1.0f, 12.0f, 1.0f);
        pathBuilderD2.reflectiveCurveTo(9.5f, 2.12f, 9.5f, 3.5f);
        pathBuilderD2.lineToRelative(0.02f, 0.19f);
        pathBuilderD2.curveTo(9.12f, 3.41f, 8.63f, 3.25f, 8.1f, 3.25f);
        pathBuilderD2.curveToRelative(-0.57f, 0.0f, -1.09f, 0.2f, -1.51f, 0.52f);
        pathBuilderD2.lineToRelative(3.16f, 3.16f);
        pathBuilderD2.curveTo(10.16f, 6.08f, 11.01f, 5.5f, 12.0f, 5.5f);
        pathBuilderD2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(19.98f, 17.15f);
        pathBuilderD3.curveToRelative(0.47f, -0.91f, 0.8f, -1.9f, 0.94f, -2.95f);
        pathBuilderD3.curveToRelative(0.09f, -0.64f, -0.48f, -1.21f, -1.12f, -1.12f);
        pathBuilderD3.curveToRelative(-1.05f, 0.14f, -2.05f, 0.47f, -2.95f, 0.94f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD3, 19.98f, 17.15f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(2.1f, 3.51f, 2.1f, 3.51f);
        pathBuilderA.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderA.lineToRelative(3.93f, 3.93f);
        pathBuilderA.curveToRelative(-0.35f, 0.52f, -0.53f, 1.17f, -0.38f, 1.89f);
        pathBuilderA.curveToRelative(0.22f, 1.13f, 1.26f, 1.98f, 2.41f, 2.0f);
        pathBuilderA.curveToRelative(0.54f, 0.01f, 1.02f, -0.15f, 1.44f, -0.43f);
        pathBuilderA.lineToRelative(0.02f, 0.02f);
        pathBuilderA.lineTo(9.5f, 12.5f);
        pathBuilderA.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilderA.curveToRelative(0.05f, 0.0f, 0.1f, -0.01f, 0.16f, -0.02f);
        pathBuilderA.lineToRelative(1.64f, 1.64f);
        pathBuilderA.curveTo(12.67f, 18.12f, 12.0f, 19.98f, 12.0f, 22.0f);
        pathBuilderA.curveToRelative(2.02f, 0.0f, 3.88f, -0.67f, 5.38f, -1.79f);
        pathBuilderA.lineToRelative(1.69f, 1.69f);
        pathBuilderA.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderA.lineTo(3.51f, 3.51f);
        pathBuilderA.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _macroOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
