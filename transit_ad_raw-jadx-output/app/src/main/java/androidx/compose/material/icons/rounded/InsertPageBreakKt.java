package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: InsertPageBreak.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_insertPageBreak", "Landroidx/compose/ui/graphics/vector/ImageVector;", "InsertPageBreak", "Landroidx/compose/material/icons/Icons$Rounded;", "getInsertPageBreak", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class InsertPageBreakKt {
    private static ImageVector _insertPageBreak;

    public static final ImageVector getInsertPageBreak(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _insertPageBreak;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.InsertPageBreak", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.0f, 20.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderD.horizontalLineTo(18.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(-3.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.lineTo(4.0f, 20.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.41f, 7.41f, -4.83f, -4.83f);
        pathBuilderA.curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
        pathBuilderA.horizontalLineTo(6.0f);
        pathBuilderA.curveTo(4.9f, 2.0f, 4.01f, 2.89f, 4.01f, 3.99f);
        c.b.f(pathBuilderA, 0.0f, 7.01f, 20.0f, 8.83f);
        pathBuilderA.curveTo(20.0f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f);
        h.A(pathBuilderA, 13.0f, 8.0f, 3.5f);
        pathBuilderA.lineTo(18.5f, 9.0f);
        pathBuilderA.horizontalLineTo(14.0f);
        pathBuilderA.curveTo(13.45f, 9.0f, 13.0f, 8.55f, 13.0f, 8.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(15.0f, 14.0f, 15.0f, 14.0f);
        pathBuilderA2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA2.horizontalLineToRelative(-4.0f);
        pathBuilderA2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA2.verticalLineToRelative(0.0f);
        pathBuilderA2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA2.horizontalLineToRelative(4.0f);
        pathBuilderA2.curveTo(14.55f, 15.0f, 15.0f, 14.55f, 15.0f, 14.0f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = a.b.a(17.0f, 14.0f, 17.0f, 14.0f);
        pathBuilderA3.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA3.horizontalLineToRelative(4.0f);
        pathBuilderA3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA3.verticalLineToRelative(0.0f);
        pathBuilderA3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA3.horizontalLineToRelative(-4.0f);
        pathBuilderA3.curveTo(17.45f, 13.0f, 17.0f, 13.45f, 17.0f, 14.0f);
        pathBuilderA3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(6.0f, 13.0f, 2.0f);
        pathBuilderB.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderB.horizontalLineToRelative(4.0f);
        pathBuilderB.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(7.0f, 13.45f, 6.55f, 13.0f, 6.0f, 13.0f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _insertPageBreak = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
