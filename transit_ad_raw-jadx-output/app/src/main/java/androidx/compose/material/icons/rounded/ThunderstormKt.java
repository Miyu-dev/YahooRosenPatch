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

/* JADX INFO: compiled from: Thunderstorm.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thunderstorm", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Thunderstorm", "Landroidx/compose/material/icons/Icons$Rounded;", "getThunderstorm", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ThunderstormKt {
    private static ImageVector _thunderstorm;

    public static final ImageVector getThunderstorm(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _thunderstorm;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Thunderstorm", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.92f, 7.02f);
        pathBuilderD.curveTo(17.45f, 4.18f, 14.97f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.curveTo(9.82f, 2.0f, 7.83f, 3.18f, 6.78f, 5.06f);
        pathBuilderD.curveTo(4.09f, 5.41f, 2.0f, 7.74f, 2.0f, 10.5f);
        pathBuilderD.curveTo(2.0f, 13.53f, 4.47f, 16.0f, 7.5f, 16.0f);
        pathBuilderD.horizontalLineToRelative(10.0f);
        pathBuilderD.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        pathBuilderD.curveTo(22.0f, 9.16f, 20.21f, 7.23f, 17.92f, 7.02f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.95f, 20.11f, -0.84f, -0.42f);
        pathBuilderA.lineToRelative(0.9f, -1.03f);
        pathBuilderA.curveToRelative(0.36f, -0.42f, 0.32f, -1.05f, -0.09f, -1.41f);
        pathBuilderA.curveToRelative(-0.42f, -0.36f, -1.05f, -0.32f, -1.41f, 0.09f);
        pathBuilderA.lineToRelative(-1.75f, 2.0f);
        pathBuilderA.curveToRelative(-0.2f, 0.23f, -0.29f, 0.55f, -0.23f, 0.85f);
        pathBuilderA.curveToRelative(0.06f, 0.3f, 0.26f, 0.56f, 0.53f, 0.7f);
        pathBuilderA.lineToRelative(0.84f, 0.42f);
        pathBuilderA.lineTo(13.0f, 22.34f);
        pathBuilderA.curveToRelative(-0.36f, 0.42f, -0.32f, 1.05f, 0.09f, 1.41f);
        pathBuilderA.curveToRelative(0.19f, 0.17f, 0.42f, 0.25f, 0.66f, 0.25f);
        pathBuilderA.curveToRelative(0.28f, 0.0f, 0.55f, -0.12f, 0.75f, -0.34f);
        pathBuilderA.lineToRelative(1.75f, -2.0f);
        pathBuilderA.curveToRelative(0.2f, -0.23f, 0.29f, -0.55f, 0.23f, -0.85f);
        pathBuilderA.curveTo(16.42f, 20.5f, 16.22f, 20.24f, 15.95f, 20.11f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(9.95f, 20.11f, 9.1f, 19.68f);
        pathBuilderA2.lineToRelative(0.9f, -1.03f);
        pathBuilderA2.curveToRelative(0.36f, -0.42f, 0.32f, -1.05f, -0.09f, -1.41f);
        pathBuilderA2.curveToRelative(-0.42f, -0.36f, -1.05f, -0.32f, -1.41f, 0.09f);
        pathBuilderA2.lineToRelative(-1.75f, 2.0f);
        pathBuilderA2.curveToRelative(-0.2f, 0.23f, -0.29f, 0.55f, -0.23f, 0.85f);
        pathBuilderA2.curveToRelative(0.06f, 0.3f, 0.26f, 0.56f, 0.53f, 0.7f);
        pathBuilderA2.lineToRelative(0.84f, 0.42f);
        pathBuilderA2.lineTo(7.0f, 22.34f);
        pathBuilderA2.curveToRelative(-0.36f, 0.42f, -0.32f, 1.05f, 0.09f, 1.41f);
        pathBuilderA2.curveTo(7.28f, 23.92f, 7.52f, 24.0f, 7.75f, 24.0f);
        pathBuilderA2.curveToRelative(0.28f, 0.0f, 0.55f, -0.12f, 0.75f, -0.34f);
        pathBuilderA2.lineToRelative(1.75f, -2.0f);
        pathBuilderA2.curveToRelative(0.2f, -0.23f, 0.29f, -0.55f, 0.23f, -0.85f);
        pathBuilderA2.curveTo(10.42f, 20.5f, 10.22f, 20.24f, 9.95f, 20.11f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thunderstorm = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
