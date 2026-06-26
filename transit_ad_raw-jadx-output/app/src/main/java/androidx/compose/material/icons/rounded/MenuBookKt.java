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

/* JADX INFO: compiled from: MenuBook.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_menuBook", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MenuBook", "Landroidx/compose/material/icons/Icons$Rounded;", "getMenuBook", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MenuBookKt {
    private static ImageVector _menuBook;

    public static final ImageVector getMenuBook(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _menuBook;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MenuBook", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.5f, 4.5f);
        pathBuilderD.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        pathBuilderD.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        pathBuilderD.curveToRelative(-1.45f, 0.0f, -2.99f, 0.22f, -4.28f, 0.79f);
        pathBuilderD.curveTo(1.49f, 5.62f, 1.0f, 6.33f, 1.0f, 7.14f);
        pathBuilderD.lineToRelative(0.0f, 11.28f);
        pathBuilderD.curveToRelative(0.0f, 1.3f, 1.22f, 2.26f, 2.48f, 1.94f);
        pathBuilderD.curveTo(4.46f, 20.11f, 5.5f, 20.0f, 6.5f, 20.0f);
        pathBuilderD.curveToRelative(1.56f, 0.0f, 3.22f, 0.26f, 4.56f, 0.92f);
        pathBuilderD.curveToRelative(0.6f, 0.3f, 1.28f, 0.3f, 1.87f, 0.0f);
        pathBuilderD.curveToRelative(1.34f, -0.67f, 3.0f, -0.92f, 4.56f, -0.92f);
        pathBuilderD.curveToRelative(1.0f, 0.0f, 2.04f, 0.11f, 3.02f, 0.36f);
        pathBuilderD.curveToRelative(1.26f, 0.33f, 2.48f, -0.63f, 2.48f, -1.94f);
        pathBuilderD.lineToRelative(0.0f, -11.28f);
        pathBuilderD.curveToRelative(0.0f, -0.81f, -0.49f, -1.52f, -1.22f, -1.85f);
        pathBuilderD.curveTo(20.49f, 4.72f, 18.95f, 4.5f, 17.5f, 4.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(21.0f, 17.23f);
        pathBuilderD.curveToRelative(0.0f, 0.63f, -0.58f, 1.09f, -1.2f, 0.98f);
        pathBuilderD.curveToRelative(-0.75f, -0.14f, -1.53f, -0.2f, -2.3f, -0.2f);
        pathBuilderD.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        pathBuilderD.verticalLineTo(8.0f);
        pathBuilderD.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        pathBuilderD.curveToRelative(0.92f, 0.0f, 1.83f, 0.09f, 2.7f, 0.28f);
        pathBuilderD.curveToRelative(0.46f, 0.1f, 0.8f, 0.51f, 0.8f, 0.98f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 17.23f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(13.98f, 11.01f);
        pathBuilderD2.curveToRelative(-0.32f, 0.0f, -0.61f, -0.2f, -0.71f, -0.52f);
        pathBuilderD2.curveToRelative(-0.13f, -0.39f, 0.09f, -0.82f, 0.48f, -0.94f);
        pathBuilderD2.curveToRelative(1.54f, -0.5f, 3.53f, -0.66f, 5.36f, -0.45f);
        pathBuilderD2.curveToRelative(0.41f, 0.05f, 0.71f, 0.42f, 0.66f, 0.83f);
        pathBuilderD2.curveToRelative(-0.05f, 0.41f, -0.42f, 0.71f, -0.83f, 0.66f);
        pathBuilderD2.curveToRelative(-1.62f, -0.19f, -3.39f, -0.04f, -4.73f, 0.39f);
        pathBuilderD2.curveTo(14.13f, 10.99f, 14.05f, 11.01f, 13.98f, 11.01f);
        pathBuilderD2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(13.98f, 13.67f);
        pathBuilderD3.curveToRelative(-0.32f, 0.0f, -0.61f, -0.2f, -0.71f, -0.52f);
        pathBuilderD3.curveToRelative(-0.13f, -0.39f, 0.09f, -0.82f, 0.48f, -0.94f);
        pathBuilderD3.curveToRelative(1.53f, -0.5f, 3.53f, -0.66f, 5.36f, -0.45f);
        pathBuilderD3.curveToRelative(0.41f, 0.05f, 0.71f, 0.42f, 0.66f, 0.83f);
        pathBuilderD3.curveToRelative(-0.05f, 0.41f, -0.42f, 0.71f, -0.83f, 0.66f);
        pathBuilderD3.curveToRelative(-1.62f, -0.19f, -3.39f, -0.04f, -4.73f, 0.39f);
        pathBuilderD3.curveTo(14.13f, 13.66f, 14.05f, 13.67f, 13.98f, 13.67f);
        pathBuilderD3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD4 = a.d(13.98f, 16.33f);
        pathBuilderD4.curveToRelative(-0.32f, 0.0f, -0.61f, -0.2f, -0.71f, -0.52f);
        pathBuilderD4.curveToRelative(-0.13f, -0.39f, 0.09f, -0.82f, 0.48f, -0.94f);
        pathBuilderD4.curveToRelative(1.53f, -0.5f, 3.53f, -0.66f, 5.36f, -0.45f);
        pathBuilderD4.curveToRelative(0.41f, 0.05f, 0.71f, 0.42f, 0.66f, 0.83f);
        pathBuilderD4.curveToRelative(-0.05f, 0.41f, -0.42f, 0.7f, -0.83f, 0.66f);
        pathBuilderD4.curveToRelative(-1.62f, -0.19f, -3.39f, -0.04f, -4.73f, 0.39f);
        pathBuilderD4.curveTo(14.13f, 16.32f, 14.05f, 16.33f, 13.98f, 16.33f);
        pathBuilderD4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _menuBook = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
