package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: BakeryDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bakeryDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BakeryDining", "Landroidx/compose/material/icons/Icons$Rounded;", "getBakeryDining", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BakeryDiningKt {
    private static ImageVector _bakeryDining;

    public static final ImageVector getBakeryDining(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _bakeryDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BakeryDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.77f, 8.55f, 17.6f, 8.08f);
        pathBuilderA.curveToRelative(-0.62f, -0.25f, -1.31f, 0.17f, -1.37f, 0.84f);
        pathBuilderA.lineToRelative(-0.74f, 8.08f);
        pathBuilderA.horizontalLineTo(17.0f);
        pathBuilderA.lineToRelative(2.6f, -6.5f);
        pathBuilderA.curveTo(19.91f, 9.73f, 19.54f, 8.85f, 18.77f, 8.55f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(6.4f, 8.08f, 5.23f, 8.55f);
        pathBuilderA2.curveTo(4.46f, 8.85f, 4.09f, 9.73f, 4.4f, 10.5f);
        pathBuilderA2.lineToRelative(2.6f, 6.5f);
        pathBuilderA2.horizontalLineToRelative(1.5f);
        pathBuilderA2.lineTo(7.76f, 8.92f);
        pathBuilderA2.curveTo(7.7f, 8.25f, 7.02f, 7.83f, 6.4f, 8.08f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(13.36f, 6.0f, -2.71f);
        pathBuilderB.curveTo(9.76f, 6.0f, 9.07f, 6.76f, 9.15f, 7.64f);
        pathBuilderB.lineTo(10.0f, 16.99f);
        pathBuilderB.horizontalLineToRelative(4.0f);
        pathBuilderB.lineToRelative(0.85f, -9.36f);
        pathBuilderB.curveTo(14.93f, 6.76f, 14.24f, 6.0f, 13.36f, 6.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = androidx.compose.animation.b.a(3.18f, 13.72f, -1.0f, 1.93f);
        pathBuilderA3.curveToRelative(-0.19f, 0.36f, -0.23f, 0.78f, -0.12f, 1.19f);
        pathBuilderA3.curveToRelative(0.29f, 1.01f, 1.43f, 1.41f, 2.38f, 0.94f);
        pathBuilderA3.lineToRelative(1.05f, -0.52f);
        pathBuilderA3.lineToRelative(-1.4f, -3.49f);
        pathBuilderA3.curveTo(3.93f, 13.37f, 3.38f, 13.34f, 3.18f, 13.72f);
        pathBuilderA3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA4 = androidx.compose.animation.b.a(21.82f, 15.65f, -1.0f, -1.93f);
        pathBuilderA4.curveToRelative(-0.2f, -0.38f, -0.75f, -0.35f, -0.91f, 0.04f);
        pathBuilderA4.lineToRelative(-1.4f, 3.49f);
        pathBuilderA4.lineToRelative(1.05f, 0.52f);
        pathBuilderA4.curveToRelative(0.94f, 0.47f, 2.09f, 0.07f, 2.38f, -0.94f);
        pathBuilderA4.curveTo(22.05f, 16.43f, 22.01f, 16.01f, 21.82f, 15.65f);
        pathBuilderA4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA4.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bakeryDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
