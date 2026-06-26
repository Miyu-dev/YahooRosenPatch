package androidx.compose.material.icons.outlined;

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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: HdrAutoSelect.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrAutoSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrAutoSelect", "Landroidx/compose/material/icons/Icons$Outlined;", "getHdrAutoSelect", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrAutoSelectKt {
    private static ImageVector _hdrAutoSelect;

    public static final ImageVector getHdrAutoSelect(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _hdrAutoSelect;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HdrAutoSelect", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = e.b(10.0f, 16.0f, 6.5f, 6.0f, 10.0f);
        pathBuilderB.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        pathBuilderB.verticalLineToRelative(-3.0f);
        pathBuilderB.curveTo(11.5f, 16.7f, 10.8f, 16.0f, 10.0f, 16.0f);
        a.q(pathBuilderB, 10.0f, 20.5f, 8.0f, -3.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderB, 2.0f, 20.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(3.5f, 18.0f, -2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -2.0f);
        pathBuilderA.lineToRelative(-1.5f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 6.0f);
        pathBuilderA.lineToRelative(1.5f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, -2.5f);
        pathBuilderA.lineToRelative(2.0f, 0.0f);
        pathBuilderA.lineToRelative(0.0f, 2.5f);
        pathBuilderA.lineToRelative(1.5f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 0.0f, -6.0f, -1.5f, 0.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(22.0f, 18.5f, 0.0f, -2.0f);
        pathBuilderA2.lineToRelative(-1.5f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, 2.0f);
        pathBuilderA2.lineToRelative(-2.0f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, 1.5f);
        pathBuilderA2.lineToRelative(2.0f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, 2.0f);
        pathBuilderA2.lineToRelative(1.5f, 0.0f);
        pathBuilderA2.lineToRelative(0.0f, -2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA2, 2.0f, 0.0f, 0.0f, -1.5f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(16.5f, 16.0f, 13.0f, 6.0f, 1.5f);
        a.t(pathBuilderO, -2.0f, 1.1f, 0.9f, 2.0f);
        pathBuilderO.horizontalLineTo(18.0f);
        pathBuilderO.lineToRelative(-0.9f, -2.1f);
        pathBuilderO.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        pathBuilderO.verticalLineToRelative(-1.0f);
        pathBuilderO.curveTo(18.0f, 16.7f, 17.3f, 16.0f, 16.5f, 16.0f);
        b.r(pathBuilderO, 16.5f, 18.5f, -2.0f, -1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderO, 2.0f, 18.5f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(b.a(11.97f, 5.3f, -1.02f, 2.89f), 2.1f, 0.0f, -1.02f, -2.89f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(8.69f, 2.0f, 6.0f, 4.69f, 6.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilderD.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilderD.reflectiveCurveTo(15.31f, 2.0f, 12.0f, 2.0f);
        a.y(pathBuilderD, 14.04f, 11.0f, -0.63f, -1.79f);
        androidx.appcompat.app.m.D(pathBuilderD, -2.83f, 9.96f, 11.0f, 8.74f);
        pathBuilderD.lineToRelative(2.63f, -7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.p(pathBuilderD, 1.25f, 2.63f, 7.0f, 14.04f), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrAutoSelect = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
