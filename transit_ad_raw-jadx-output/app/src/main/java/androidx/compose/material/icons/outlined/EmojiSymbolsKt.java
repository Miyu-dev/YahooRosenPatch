package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: EmojiSymbols.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_emojiSymbols", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmojiSymbols", "Landroidx/compose/material/icons/Icons$Outlined;", "getEmojiSymbols", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EmojiSymbolsKt {
    private static ImageVector _emojiSymbols;

    public static final ImageVector getEmojiSymbols(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _emojiSymbols;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EmojiSymbols", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(3.0f, 2.0f, 8.0f, 2.0f, -8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = androidx.compose.animation.b.a(6.0f, 11.0f, 2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -4.0f);
        pathBuilderA.lineToRelative(3.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -2.0f);
        pathBuilderA.lineToRelative(-8.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderA, 0.0f, 2.0f, 3.0f, 0.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(androidx.compose.animation.b.a(12.404f, 20.182f, 7.778f, -7.778f), 1.414f, 1.414f, -7.778f, 7.778f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(14.5f, 14.5f, -1.5f, 0.0f);
        pathBuilderB.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilderB.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = v.b(19.5f, 19.5f, -1.5f, 0.0f);
        pathBuilderB2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        pathBuilderB2.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(15.5f, 11.0f);
        pathBuilderD.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        androidx.appcompat.view.menu.a.C(pathBuilderD, 4.0f, 3.0f, 2.0f, -4.0f);
        pathBuilderD.verticalLineToRelative(4.51f);
        pathBuilderD.curveTo(16.58f, 6.19f, 16.07f, 6.0f, 15.5f, 6.0f);
        pathBuilderD.curveTo(14.12f, 6.0f, 13.0f, 7.12f, 13.0f, 8.5f);
        pathBuilderD.curveTo(13.0f, 9.88f, 14.12f, 11.0f, 15.5f, 11.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw6 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = androidx.compose.animation.b.a(9.74f, 15.96f, -1.41f, 1.41f);
        pathBuilderA2.lineToRelative(-0.71f, -0.71f);
        pathBuilderA2.lineToRelative(0.35f, -0.35f);
        pathBuilderA2.curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0.0f, -3.54f);
        pathBuilderA2.curveToRelative(-0.49f, -0.49f, -1.13f, -0.73f, -1.77f, -0.73f);
        pathBuilderA2.curveToRelative(-0.64f, 0.0f, -1.28f, 0.24f, -1.77f, 0.73f);
        pathBuilderA2.curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0.0f, 3.54f);
        pathBuilderA2.lineToRelative(0.35f, 0.35f);
        pathBuilderA2.lineToRelative(-1.06f, 1.06f);
        pathBuilderA2.curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0.0f, 3.54f);
        pathBuilderA2.curveTo(4.22f, 21.76f, 4.86f, 22.0f, 5.5f, 22.0f);
        pathBuilderA2.reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.73f);
        pathBuilderA2.lineToRelative(1.06f, -1.06f);
        pathBuilderA2.lineToRelative(1.41f, 1.41f);
        pathBuilderA2.lineToRelative(1.41f, -1.41f);
        pathBuilderA2.lineToRelative(-1.41f, -1.41f);
        s.r(pathBuilderA2, 1.41f, -1.41f, 9.74f, 15.96f);
        pathBuilderA2.moveTo(5.85f, 14.2f);
        pathBuilderA2.curveToRelative(0.12f, -0.12f, 0.26f, -0.15f, 0.35f, -0.15f);
        pathBuilderA2.reflectiveCurveToRelative(0.23f, 0.03f, 0.35f, 0.15f);
        pathBuilderA2.curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, 0.0f, 0.71f);
        pathBuilderA2.lineToRelative(-0.35f, 0.35f);
        pathBuilderA2.lineTo(5.85f, 14.9f);
        pathBuilderA2.curveTo(5.66f, 14.71f, 5.66f, 14.39f, 5.85f, 14.2f);
        pathBuilderA2.close();
        pathBuilderA2.moveTo(5.85f, 19.85f);
        pathBuilderA2.curveTo(5.73f, 19.97f, 5.59f, 20.0f, 5.5f, 20.0f);
        pathBuilderA2.reflectiveCurveToRelative(-0.23f, -0.03f, -0.35f, -0.15f);
        pathBuilderA2.curveToRelative(-0.19f, -0.19f, -0.19f, -0.51f, 0.0f, -0.71f);
        pathBuilderA2.lineToRelative(1.06f, -1.06f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderA2, 0.71f, 0.71f, 5.85f, 19.85f), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw6, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiSymbols = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
