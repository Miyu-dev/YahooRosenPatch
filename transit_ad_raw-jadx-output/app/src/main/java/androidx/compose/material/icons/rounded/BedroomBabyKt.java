package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: BedroomBaby.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bedroomBaby", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BedroomBaby", "Landroidx/compose/material/icons/Icons$Rounded;", "getBedroomBaby", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BedroomBabyKt {
    private static ImageVector _bedroomBaby;

    public static final ImageVector getBedroomBaby(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _bedroomBaby;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BedroomBaby", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.0f, 2.0f, 4.0f);
        pathBuilderB.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilderB.verticalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(16.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(4.0f);
        pathBuilderB.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilderB.close();
        pathBuilderB.moveTo(12.0f, 17.99f);
        pathBuilderB.curveToRelative(-2.37f, 0.0f, -4.61f, -0.83f, -6.4f, -2.35f);
        pathBuilderB.curveToRelative(-0.33f, -0.28f, -0.35f, -0.8f, -0.04f, -1.11f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(0.27f, -0.27f, 0.71f, -0.29f, 1.01f, -0.04f);
        pathBuilderB.curveToRelative(0.19f, 0.16f, 0.39f, 0.31f, 0.6f, 0.46f);
        pathBuilderB.lineTo(8.0f, 13.49f);
        pathBuilderB.verticalLineTo(9.5f);
        pathBuilderB.lineToRelative(-1.0f, 0.65f);
        pathBuilderB.curveToRelative(-0.32f, 0.21f, -0.73f, 0.16f, -0.99f, -0.12f);
        pathBuilderB.lineTo(6.0f, 10.01f);
        pathBuilderB.curveToRelative(-0.29f, -0.3f, -0.3f, -0.77f, -0.03f, -1.08f);
        pathBuilderB.curveTo(6.27f, 8.6f, 6.62f, 8.19f, 6.83f, 7.95f);
        pathBuilderB.curveTo(6.92f, 7.84f, 6.9f, 7.67f, 6.79f, 7.59f);
        pathBuilderB.curveToRelative(0.0f, 0.0f, -0.81f, -0.31f, -0.79f, -0.57f);
        pathBuilderB.curveTo(6.0f, 6.91f, 9.36f, 6.99f, 9.36f, 6.99f);
        pathBuilderB.curveToRelative(0.18f, 0.0f, 0.34f, 0.1f, 0.43f, 0.25f);
        pathBuilderB.lineToRelative(1.44f, 2.5f);
        pathBuilderB.curveToRelative(0.09f, 0.15f, 0.25f, 0.25f, 0.43f, 0.25f);
        pathBuilderB.horizontalLineToRelative(4.83f);
        pathBuilderB.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        a.z(pathBuilderB, 16.0f, 2.5f, 0.84f, 1.46f);
        pathBuilderB.curveToRelative(0.2f, -0.15f, 0.4f, -0.3f, 0.6f, -0.46f);
        pathBuilderB.curveToRelative(0.3f, -0.25f, 0.73f, -0.23f, 1.01f, 0.04f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.31f, 0.31f, 0.29f, 0.82f, -0.04f, 1.11f);
        pathBuilderB.curveTo(16.61f, 17.16f, 14.37f, 17.99f, 12.0f, 17.99f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(14.69f, 14.24f);
        pathBuilderD.curveToRelative(-1.74f, 0.65f, -3.66f, 0.65f, -5.4f, 0.0f);
        pathBuilderD.lineToRelative(-0.81f, 1.41f);
        pathBuilderD.lineToRelative(-0.03f, 0.06f);
        pathBuilderD.curveToRelative(1.1f, 0.52f, 2.28f, 0.79f, 3.53f, 0.79f);
        pathBuilderD.reflectiveCurveToRelative(2.45f, -0.28f, 3.55f, -0.79f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, -0.03f, -0.06f, 14.69f, 14.24f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedroomBaby = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
