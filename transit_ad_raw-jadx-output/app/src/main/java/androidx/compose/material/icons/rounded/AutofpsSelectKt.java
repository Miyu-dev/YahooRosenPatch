package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: AutofpsSelect.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autofpsSelect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutofpsSelect", "Landroidx/compose/material/icons/Icons$Rounded;", "getAutofpsSelect", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutofpsSelectKt {
    private static ImageVector _autofpsSelect;

    public static final ImageVector getAutofpsSelect(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _autofpsSelect;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutofpsSelect", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(b.a(12.03f, 6.3f, -0.06f, 0.0f), -1.02f, 2.89f, 2.1f, 0.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.b.a(4.0f, 22.0f, 4.0f, 22.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-3.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(3.0f);
        pathBuilderA.curveTo(3.0f, 21.55f, 3.45f, 22.0f, 4.0f, 22.0f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(12.0f, 15.0f);
        pathBuilderD.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilderD.reflectiveCurveTo(6.0f, 5.69f, 6.0f, 9.0f);
        pathBuilderD.reflectiveCurveTo(8.69f, 15.0f, 12.0f, 15.0f);
        androidx.compose.animation.a.t(pathBuilderD, 12.0f, 5.0f, 12.0f, 5.0f);
        pathBuilderD.curveToRelative(0.38f, 0.0f, 0.71f, 0.23f, 0.85f, 0.59f);
        pathBuilderD.lineToRelative(2.12f, 5.65f);
        pathBuilderD.curveToRelative(0.14f, 0.37f, -0.13f, 0.76f, -0.53f, 0.76f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.24f, 0.0f, -0.45f, -0.15f, -0.53f, -0.38f);
        pathBuilderD.lineToRelative(-0.49f, -1.41f);
        pathBuilderD.horizontalLineToRelative(-2.83f);
        pathBuilderD.lineToRelative(-0.5f, 1.41f);
        pathBuilderD.curveTo(10.01f, 11.85f, 9.8f, 12.0f, 9.56f, 12.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.39f, 0.0f, -0.67f, -0.39f, -0.53f, -0.76f);
        pathBuilderD.lineToRelative(2.12f, -5.65f);
        pathBuilderD.curveTo(11.29f, 5.23f, 11.62f, 5.0f, 12.0f, 5.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(8.0f, 22.0f, 8.0f, 22.0f);
        pathBuilderA2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA2.verticalLineToRelative(-3.0f);
        pathBuilderA2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA2.horizontalLineToRelative(0.0f);
        pathBuilderA2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA2.verticalLineToRelative(3.0f);
        pathBuilderA2.curveTo(7.0f, 21.55f, 7.45f, 22.0f, 8.0f, 22.0f);
        pathBuilderA2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType5 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw5 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA3 = a.b.a(12.0f, 22.0f, 12.0f, 22.0f);
        pathBuilderA3.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA3.verticalLineToRelative(-3.0f);
        pathBuilderA3.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA3.horizontalLineToRelative(0.0f);
        pathBuilderA3.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA3.verticalLineToRelative(3.0f);
        pathBuilderA3.curveTo(11.0f, 21.55f, 11.45f, 22.0f, 12.0f, 22.0f);
        pathBuilderA3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA3.getNodes(), defaultFillType5, "", solidColor5, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw5, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType6 = VectorKt.getDefaultFillType();
        SolidColor solidColor6 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw6 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk85 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(15.0f, 18.0f, 3.0f);
        pathBuilderE.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderE.horizontalLineToRelative(4.0f);
        pathBuilderE.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderE.verticalLineToRelative(-3.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderE.horizontalLineToRelative(-4.0f);
        pathBuilderE.curveTo(15.45f, 17.0f, 15.0f, 17.45f, 15.0f, 18.0f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType6, "", solidColor6, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw6, iM3151getBevelLxFBmk85, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autofpsSelect = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
