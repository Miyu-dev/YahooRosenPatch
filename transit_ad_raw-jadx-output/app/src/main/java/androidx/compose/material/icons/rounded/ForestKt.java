package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: Forest.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_forest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Forest", "Landroidx/compose/material/icons/Icons$Rounded;", "getForest", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ForestKt {
    private static ImageVector _forest;

    public static final ImageVector getForest(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _forest;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Forest", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(14.14f, 12.0f, -0.06f);
        pathBuilderB.curveToRelative(0.81f, 0.0f, 1.28f, -0.91f, 0.82f, -1.57f);
        pathBuilderB.lineTo(9.82f, 3.17f);
        pathBuilderB.curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0.0f);
        pathBuilderB.lineTo(3.1f, 10.43f);
        pathBuilderB.curveTo(2.64f, 11.09f, 3.11f, 12.0f, 3.92f, 12.0f);
        pathBuilderB.horizontalLineTo(3.86f);
        pathBuilderB.lineToRelative(-2.87f, 4.46f);
        pathBuilderB.curveTo(0.56f, 17.12f, 1.04f, 18.0f, 1.83f, 18.0f);
        pathBuilderB.horizontalLineTo(7.0f);
        pathBuilderB.verticalLineToRelative(2.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineToRelative(-2.0f);
        pathBuilderB.horizontalLineToRelative(5.17f);
        pathBuilderB.curveToRelative(0.79f, 0.0f, 1.27f, -0.88f, 0.84f, -1.54f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderB, 14.14f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(23.01f, 16.46f, 20.14f, 12.0f, -0.06f);
        pathBuilderL.curveToRelative(0.81f, 0.0f, 1.28f, -0.91f, 0.82f, -1.57f);
        pathBuilderL.lineToRelative(-5.08f, -7.26f);
        pathBuilderL.curveToRelative(-0.4f, -0.57f, -1.24f, -0.57f, -1.64f, 0.0f);
        pathBuilderL.lineToRelative(-1.57f, 2.24f);
        pathBuilderL.lineToRelative(3.11f, 4.44f);
        pathBuilderL.curveToRelative(0.43f, 0.61f, 0.48f, 1.41f, 0.14f, 2.07f);
        pathBuilderL.curveToRelative(-0.08f, 0.16f, -0.18f, 0.3f, -0.3f, 0.43f);
        pathBuilderL.lineToRelative(2.29f, 3.57f);
        pathBuilderL.curveToRelative(0.4f, 0.62f, 0.42f, 1.4f, 0.07f, 2.04f);
        pathBuilderL.curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.03f, 0.04f);
        pathBuilderL.horizontalLineToRelative(4.28f);
        pathBuilderL.curveTo(22.96f, 18.0f, 23.44f, 17.12f, 23.01f, 16.46f);
        pathBuilderL.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderL.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(13.0f, 20.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderD, -1.0f, -4.0f, 20.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forest = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
