package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: RawOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rawOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RawOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getRawOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RawOffKt {
    private static ImageVector _rawOff;

    public static final ImageVector getRawOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _rawOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RawOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.55f, 9.0f);
        pathBuilderD.curveToRelative(-0.33f, 0.0f, -0.63f, 0.23f, -0.71f, 0.55f);
        pathBuilderD.lineTo(19.24f, 12.0f);
        pathBuilderD.lineToRelative(-0.56f, -2.26f);
        pathBuilderD.curveTo(18.58f, 9.3f, 18.19f, 9.0f, 17.74f, 9.0f);
        pathBuilderD.reflectiveCurveTo(16.9f, 9.3f, 16.8f, 9.74f);
        pathBuilderD.lineTo(16.24f, 12.0f);
        pathBuilderD.lineToRelative(-0.6f, -2.45f);
        pathBuilderD.curveTo(15.56f, 9.23f, 15.27f, 9.0f, 14.93f, 9.0f);
        pathBuilderD.curveToRelative(-0.47f, 0.0f, -0.82f, 0.44f, -0.71f, 0.9f);
        pathBuilderD.lineToRelative(0.5f, 1.99f);
        pathBuilderD.lineToRelative(2.42f, 2.42f);
        pathBuilderD.curveToRelative(0.0f, -0.01f, 0.01f, -0.02f, 0.01f, -0.03f);
        pathBuilderD.lineToRelative(0.58f, -2.32f);
        pathBuilderD.lineToRelative(0.58f, 2.32f);
        pathBuilderD.curveTo(18.43f, 14.7f, 18.81f, 15.0f, 19.24f, 15.0f);
        pathBuilderD.reflectiveCurveToRelative(0.81f, -0.3f, 0.92f, -0.72f);
        pathBuilderD.lineToRelative(1.09f, -4.38f);
        pathBuilderD.curveTo(21.37f, 9.44f, 21.02f, 9.0f, 20.55f, 9.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(3.51f, 3.51f);
        pathBuilderD2.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD2.lineTo(6.17f, 9.0f);
        pathBuilderD2.horizontalLineTo(4.0f);
        pathBuilderD2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD2.verticalLineToRelative(4.31f);
        pathBuilderD2.curveTo(3.0f, 14.69f, 3.31f, 15.0f, 3.69f, 15.0f);
        pathBuilderD2.horizontalLineToRelative(0.11f);
        pathBuilderD2.curveToRelative(0.38f, 0.0f, 0.69f, -0.31f, 0.69f, -0.69f);
        androidx.appcompat.app.m.u(pathBuilderD2, 13.0f, 1.1f, 0.72f, 1.59f);
        pathBuilderD2.curveTo(6.43f, 14.84f, 6.68f, 15.0f, 6.95f, 15.0f);
        pathBuilderD2.curveToRelative(0.5f, 0.0f, 0.83f, -0.51f, 0.64f, -0.97f);
        pathBuilderD2.lineTo(7.1f, 12.9f);
        pathBuilderD2.curveTo(7.6f, 12.6f, 8.0f, 12.1f, 8.0f, 11.5f);
        pathBuilderD2.verticalLineToRelative(-0.67f);
        pathBuilderD2.lineToRelative(1.43f, 1.43f);
        pathBuilderD2.lineTo(8.98f, 14.1f);
        pathBuilderD2.curveTo(8.86f, 14.56f, 9.21f, 15.0f, 9.68f, 15.0f);
        pathBuilderD2.horizontalLineToRelative(0.0f);
        pathBuilderD2.curveToRelative(0.33f, 0.0f, 0.62f, -0.23f, 0.7f, -0.55f);
        pathBuilderD2.lineToRelative(0.24f, -0.95f);
        pathBuilderD2.horizontalLineToRelative(0.04f);
        pathBuilderD2.lineToRelative(8.4f, 8.4f);
        pathBuilderD2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD2.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        androidx.appcompat.view.menu.a.z(pathBuilderD2, 3.51f, 3.51f, 6.5f, 11.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderD2, -2.0f, -1.0f, 2.0f, 11.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rawOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
