package androidx.compose.material.icons.outlined;

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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thunderstorm", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Thunderstorm", "Landroidx/compose/material/icons/Icons$Outlined;", "getThunderstorm", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ThunderstormKt {
    private static ImageVector _thunderstorm;

    public static final ImageVector getThunderstorm(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _thunderstorm;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Thunderstorm", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
        androidx.compose.animation.a.j(pathBuilderD, 17.5f, 14.0f, -10.0f);
        pathBuilderD.curveTo(5.57f, 14.0f, 4.0f, 12.43f, 4.0f, 10.5f);
        pathBuilderD.curveToRelative(0.0f, -1.74f, 1.31f, -3.23f, 3.04f, -3.46f);
        pathBuilderD.lineToRelative(0.99f, -0.13f);
        pathBuilderD.lineToRelative(0.49f, -0.87f);
        pathBuilderD.curveTo(9.23f, 4.78f, 10.56f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.curveToRelative(1.94f, 0.0f, 3.63f, 1.44f, 3.95f, 3.35f);
        pathBuilderD.lineToRelative(0.25f, 1.52f);
        pathBuilderD.lineToRelative(1.54f, 0.14f);
        pathBuilderD.curveTo(19.01f, 9.13f, 20.0f, 10.22f, 20.0f, 11.5f);
        pathBuilderD.curveTo(20.0f, 12.88f, 18.88f, 14.0f, 17.5f, 14.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.8f, 17.0f, -2.9f, 3.32f);
        pathBuilderA.lineToRelative(2.0f, 1.0f);
        pathBuilderA.lineToRelative(-2.35f, 2.68f);
        pathBuilderA.lineToRelative(2.65f, 0.0f);
        pathBuilderA.lineToRelative(2.9f, -3.32f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, -2.0f, -1.0f, 2.35f, -2.68f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(8.8f, 17.0f, -2.9f, 3.32f);
        pathBuilderA2.lineToRelative(2.0f, 1.0f);
        pathBuilderA2.lineToRelative(-2.35f, 2.68f);
        pathBuilderA2.lineToRelative(2.65f, 0.0f);
        pathBuilderA2.lineToRelative(2.9f, -3.32f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, -2.0f, -1.0f, 2.35f, -2.68f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thunderstorm = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
