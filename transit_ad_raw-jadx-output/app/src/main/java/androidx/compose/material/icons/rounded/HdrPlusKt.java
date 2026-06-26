package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: HdrPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrPlus", "Landroidx/compose/material/icons/Icons$Rounded;", "getHdrPlus", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrPlusKt {
    private static ImageVector _hdrPlus;

    public static final ImageVector getHdrPlus(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hdrPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HdrPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(8.5f, 14.5f, 2.0f, 1.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(14.5f, 7.5f, 1.5f, 3.0f, -1.5f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 15.5f);
        pathBuilderD.curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f);
        pathBuilderD.lineToRelative(0.49f, 1.13f);
        pathBuilderD.curveToRelative(0.2f, 0.46f, -0.14f, 0.97f, -0.64f, 0.97f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.27f, 0.0f, -0.52f, -0.16f, -0.63f, -0.41f);
        h.n(pathBuilderD, 9.6f, 17.0f, 8.5f, 1.31f);
        pathBuilderD.curveTo(8.5f, 18.69f, 8.19f, 19.0f, 7.81f, 19.0f);
        pathBuilderD.horizontalLineTo(7.69f);
        pathBuilderD.curveTo(7.31f, 19.0f, 7.0f, 18.69f, 7.0f, 18.31f);
        pathBuilderD.verticalLineTo(14.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(2.5f);
        pathBuilderD.curveToRelative(0.82f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        android.support.v4.media.a.y(pathBuilderD, 15.5f, 11.25f, 12.0f);
        pathBuilderD.lineTo(11.25f, 12.0f);
        pathBuilderD.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        v.r(pathBuilderD, 9.5f, -2.0f, 1.75f);
        pathBuilderD.curveTo(8.5f, 11.66f, 8.16f, 12.0f, 7.75f, 12.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveTo(7.34f, 12.0f, 7.0f, 11.66f, 7.0f, 11.25f);
        pathBuilderD.verticalLineToRelative(-4.5f);
        pathBuilderD.curveTo(7.0f, 6.34f, 7.34f, 6.0f, 7.75f, 6.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveTo(8.16f, 6.0f, 8.5f, 6.34f, 8.5f, 6.75f);
        h.w(pathBuilderD, 8.0f, 2.0f, 6.75f);
        pathBuilderD.curveTo(10.5f, 6.34f, 10.84f, 6.0f, 11.25f, 6.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveTo(11.66f, 6.0f, 12.0f, 6.34f, 12.0f, 6.75f);
        pathBuilderD.verticalLineToRelative(4.5f);
        pathBuilderD.curveTo(12.0f, 11.66f, 11.66f, 12.0f, 11.25f, 12.0f);
        a.q(pathBuilderD, 16.75f, 16.0f, 16.0f, 0.75f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderD.verticalLineTo(16.0f);
        pathBuilderD.horizontalLineToRelative(-0.75f);
        pathBuilderD.curveTo(13.34f, 16.0f, 13.0f, 15.66f, 13.0f, 15.25f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderD.horizontalLineToRelative(0.75f);
        pathBuilderD.verticalLineToRelative(-0.75f);
        pathBuilderD.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderD.verticalLineToRelative(0.74f);
        pathBuilderD.horizontalLineToRelative(0.75f);
        pathBuilderD.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderD.verticalLineToRelative(0.01f);
        pathBuilderD.curveTo(17.5f, 15.66f, 17.16f, 16.0f, 16.75f, 16.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.5f, 10.5f);
        pathBuilderD.curveToRelative(0.0f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderD.horizontalLineToRelative(-2.5f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderD.verticalLineToRelative(-5.0f);
        pathBuilderD.curveTo(13.0f, 6.22f, 13.22f, 6.0f, 13.5f, 6.0f);
        pathBuilderD.horizontalLineTo(16.0f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 10.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
