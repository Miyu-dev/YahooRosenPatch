package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: CellTower.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_cellTower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CellTower", "Landroidx/compose/material/icons/Icons$Rounded;", "getCellTower", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CellTowerKt {
    private static ImageVector _cellTower;

    public static final ImageVector getCellTower(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _cellTower;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CellTower", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(7.9f, 14.1f, 0.09f, -0.09f);
        pathBuilderA.curveToRelative(0.27f, -0.27f, 0.32f, -0.71f, 0.08f, -1.01f);
        pathBuilderA.curveTo(7.36f, 12.09f, 7.0f, 11.01f, 7.0f, 10.0f);
        pathBuilderA.curveToRelative(0.0f, -1.08f, 0.35f, -2.16f, 1.04f, -3.01f);
        pathBuilderA.curveToRelative(0.25f, -0.3f, 0.21f, -0.75f, -0.07f, -1.02f);
        pathBuilderA.lineTo(7.9f, 5.9f);
        pathBuilderA.curveTo(7.56f, 5.56f, 7.0f, 5.6f, 6.7f, 5.98f);
        pathBuilderA.curveTo(5.79f, 7.16f, 5.3f, 8.58f, 5.3f, 10.0f);
        pathBuilderA.curveToRelative(0.0f, 1.42f, 0.49f, 2.84f, 1.4f, 4.02f);
        pathBuilderA.curveTo(7.0f, 14.4f, 7.56f, 14.44f, 7.9f, 14.1f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(18.51f, 3.49f, -0.08f, 0.08f);
        pathBuilderA2.curveToRelative(-0.3f, 0.3f, -0.29f, 0.76f, -0.03f, 1.08f);
        pathBuilderA2.curveToRelative(1.26f, 1.53f, 1.9f, 3.48f, 1.9f, 5.35f);
        pathBuilderA2.curveToRelative(0.0f, 1.87f, -0.63f, 3.81f, -1.9f, 5.35f);
        pathBuilderA2.curveToRelative(-0.28f, 0.33f, -0.23f, 0.83f, 0.08f, 1.14f);
        pathBuilderA2.verticalLineToRelative(0.0f);
        pathBuilderA2.curveToRelative(0.35f, 0.35f, 0.93f, 0.31f, 1.24f, -0.07f);
        pathBuilderA2.curveTo(21.29f, 14.54f, 22.0f, 12.31f, 22.0f, 10.0f);
        pathBuilderA2.curveToRelative(0.0f, -2.32f, -0.79f, -4.55f, -2.31f, -6.43f);
        pathBuilderA2.curveTo(19.39f, 3.2f, 18.84f, 3.16f, 18.51f, 3.49f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = a.b.a(5.57f, 3.57f, 5.49f, 3.49f);
        pathBuilderA3.curveTo(5.16f, 3.16f, 4.61f, 3.2f, 4.31f, 3.57f);
        pathBuilderA3.curveTo(2.79f, 5.45f, 2.0f, 7.68f, 2.0f, 10.0f);
        pathBuilderA3.curveToRelative(0.0f, 2.32f, 0.79f, 4.55f, 2.31f, 6.43f);
        pathBuilderA3.curveToRelative(0.3f, 0.37f, 0.85f, 0.42f, 1.18f, 0.08f);
        pathBuilderA3.lineToRelative(0.08f, -0.08f);
        pathBuilderA3.curveToRelative(0.3f, -0.3f, 0.29f, -0.76f, 0.03f, -1.08f);
        pathBuilderA3.curveTo(4.33f, 13.81f, 3.7f, 11.87f, 3.7f, 10.0f);
        pathBuilderA3.curveToRelative(0.0f, -1.87f, 0.63f, -3.81f, 1.9f, -5.35f);
        pathBuilderA3.curveTo(5.86f, 4.33f, 5.87f, 3.87f, 5.57f, 3.57f);
        pathBuilderA3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.07f, 14.07f);
        pathBuilderD.curveToRelative(0.36f, 0.36f, 0.95f, 0.32f, 1.26f, -0.09f);
        pathBuilderD.curveToRelative(0.9f, -1.18f, 1.37f, -2.58f, 1.37f, -3.98f);
        pathBuilderD.curveToRelative(-0.08f, -1.41f, -0.51f, -2.83f, -1.4f, -4.01f);
        pathBuilderD.curveToRelative(-0.29f, -0.39f, -0.86f, -0.43f, -1.2f, -0.09f);
        pathBuilderD.lineToRelative(-0.08f, 0.08f);
        pathBuilderD.curveToRelative(-0.27f, 0.27f, -0.32f, 0.71f, -0.08f, 1.01f);
        pathBuilderD.curveTo(16.64f, 7.91f, 17.0f, 8.99f, 17.0f, 10.0f);
        pathBuilderD.curveToRelative(0.0f, 1.07f, -0.34f, 2.13f, -1.01f, 2.98f);
        pathBuilderD.curveTo(15.73f, 13.3f, 15.77f, 13.77f, 16.07f, 14.07f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 16.07f, 14.07f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(14.5f, 10.0f);
        pathBuilderD2.curveToRelative(0.0f, -1.6f, -1.51f, -2.85f, -3.18f, -2.41f);
        pathBuilderD2.curveToRelative(-0.8f, 0.21f, -1.46f, 0.85f, -1.7f, 1.65f);
        pathBuilderD2.curveToRelative(-0.32f, 1.06f, 0.06f, 2.04f, 0.76f, 2.64f);
        pathBuilderD2.lineToRelative(-2.96f, 8.87f);
        pathBuilderD2.curveTo(7.21f, 21.37f, 7.67f, 22.0f, 8.32f, 22.0f);
        pathBuilderD2.horizontalLineToRelative(0.0f);
        pathBuilderD2.curveToRelative(0.41f, 0.0f, 0.77f, -0.26f, 0.9f, -0.65f);
        pathBuilderD2.lineTo(9.67f, 20.0f);
        pathBuilderD2.horizontalLineToRelative(4.67f);
        pathBuilderD2.lineToRelative(0.45f, 1.35f);
        pathBuilderD2.curveToRelative(0.13f, 0.39f, 0.49f, 0.65f, 0.9f, 0.65f);
        pathBuilderD2.horizontalLineToRelative(0.0f);
        pathBuilderD2.curveToRelative(0.65f, 0.0f, 1.1f, -0.63f, 0.9f, -1.25f);
        pathBuilderD2.lineToRelative(-2.96f, -8.87f);
        pathBuilderD2.curveTo(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10.0f);
        androidx.compose.animation.a.t(pathBuilderD2, 10.33f, 18.0f, 12.0f, 13.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.k(pathBuilderD2, 1.67f, 5.0f, 10.33f), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cellTower = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
