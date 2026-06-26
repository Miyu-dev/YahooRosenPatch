package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: AutoMode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoMode", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoMode", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAutoMode", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutoModeKt {
    private static ImageVector _autoMode;

    public static final ImageVector getAutoMode(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _autoMode;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AutoMode", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.03f, 3.56f);
        pathBuilderD.curveToRelative(-1.67f, -1.39f, -3.74f, -2.3f, -6.03f, -2.51f);
        pathBuilderD.verticalLineToRelative(2.01f);
        pathBuilderD.curveToRelative(1.73f, 0.19f, 3.31f, 0.88f, 4.61f, 1.92f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 19.03f, 3.56f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(11.0f, 3.06f, 1.05f);
        pathBuilderN.curveTo(8.71f, 1.25f, 6.64f, 2.17f, 4.97f, 3.56f);
        pathBuilderN.lineToRelative(1.42f, 1.42f);
        pathBuilderN.curveTo(7.69f, 3.94f, 9.27f, 3.25f, 11.0f, 3.06f);
        pathBuilderN.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderN.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(4.98f, 6.39f, 3.56f, 4.97f);
        pathBuilderA.curveTo(2.17f, 6.64f, 1.26f, 8.71f, 1.05f, 11.0f);
        pathBuilderA.horizontalLineToRelative(2.01f);
        pathBuilderA.curveTo(3.25f, 9.27f, 3.94f, 7.69f, 4.98f, 6.39f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = h.b(20.94f, 11.0f, 2.01f);
        pathBuilderB.curveToRelative(-0.21f, -2.29f, -1.12f, -4.36f, -2.51f, -6.03f);
        pathBuilderB.lineToRelative(-1.42f, 1.42f);
        pathBuilderB.curveTo(20.06f, 7.69f, 20.75f, 9.27f, 20.94f, 11.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(7.0f, 12.0f, 3.44f, 1.56f);
        pathBuilderA2.lineToRelative(1.56f, 3.44f);
        pathBuilderA2.lineToRelative(1.56f, -3.44f);
        pathBuilderA2.lineToRelative(3.44f, -1.56f);
        pathBuilderA2.lineToRelative(-3.44f, -1.56f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, -1.56f, -3.44f, -1.56f, 3.44f), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw6 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk86 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(12.0f, 21.0f);
        pathBuilderD2.curveToRelative(-3.11f, 0.0f, -5.85f, -1.59f, -7.46f, -4.0f);
        s.B(pathBuilderD2, 7.0f, -2.0f, 1.0f, 6.0f);
        pathBuilderD2.horizontalLineToRelative(2.0f);
        pathBuilderD2.verticalLineToRelative(-2.7f);
        pathBuilderD2.curveToRelative(1.99f, 2.84f, 5.27f, 4.7f, 9.0f, 4.7f);
        pathBuilderD2.curveToRelative(4.87f, 0.0f, 9.0f, -3.17f, 10.44f, -7.56f);
        pathBuilderD2.lineToRelative(-1.96f, -0.45f);
        pathBuilderD2.curveTo(19.25f, 18.48f, 15.92f, 21.0f, 12.0f, 21.0f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw6, iM3151getBevelLxFBmk86, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoMode = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
