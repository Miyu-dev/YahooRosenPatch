package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: PanTool.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_panTool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanTool", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPanTool", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PanToolKt {
    private static ImageVector _panTool;

    public static final ImageVector getPanTool(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _panTool;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PanTool", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.5f, 5.65f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        h.w(pathBuilderD, 12.0f, -2.0f, 3.42f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderD.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        h.w(pathBuilderD, 12.0f, -2.0f, 2.51f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderD.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        h.w(pathBuilderD, 12.0f, -2.0f, 4.79f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderD.reflectiveCurveToRelative(-0.5f, 0.23f, -0.5f, 0.5f);
        pathBuilderD.verticalLineToRelative(12.87f);
        pathBuilderD.lineToRelative(-5.35f, -2.83f);
        pathBuilderD.lineToRelative(-0.51f, 0.45f);
        pathBuilderD.lineToRelative(5.86f, 6.1f);
        pathBuilderD.curveToRelative(0.38f, 0.39f, 0.9f, 0.62f, 1.44f, 0.62f);
        pathBuilderD.horizontalLineTo(18.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineTo(6.15f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(19.5f, 3.65f);
        pathBuilderD2.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        pathBuilderD2.verticalLineToRelative(-0.28f);
        pathBuilderD2.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilderD2.curveToRelative(-0.33f, 0.0f, -0.65f, 0.06f, -0.94f, 0.18f);
        pathBuilderD2.curveTo(15.11f, 0.44f, 14.35f, 0.01f, 13.5f, 0.01f);
        pathBuilderD2.curveToRelative(-1.32f, 0.0f, -2.41f, 1.03f, -2.49f, 2.33f);
        pathBuilderD2.curveToRelative(-0.16f, -0.03f, -0.33f, -0.05f, -0.51f, -0.05f);
        pathBuilderD2.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilderD2.verticalLineToRelative(9.55f);
        pathBuilderD2.lineToRelative(-2.41f, -1.28f);
        pathBuilderD2.curveToRelative(-0.73f, -0.39f, -1.64f, -0.28f, -2.26f, 0.27f);
        pathBuilderD2.lineToRelative(-2.07f, 1.83f);
        pathBuilderD2.lineToRelative(7.3f, 7.61f);
        pathBuilderD2.curveToRelative(0.75f, 0.78f, 1.8f, 1.23f, 2.89f, 1.23f);
        pathBuilderD2.horizontalLineTo(18.0f);
        pathBuilderD2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD2.verticalLineTo(6.15f);
        pathBuilderD2.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(20.0f, 20.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD2.horizontalLineToRelative(-6.55f);
        pathBuilderD2.curveToRelative(-0.54f, 0.0f, -1.07f, -0.22f, -1.44f, -0.62f);
        pathBuilderD2.lineToRelative(-5.86f, -6.11f);
        pathBuilderD2.lineToRelative(0.51f, -0.45f);
        pathBuilderD2.lineTo(10.0f, 17.66f);
        pathBuilderD2.verticalLineTo(4.79f);
        pathBuilderD2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD2.reflectiveCurveToRelative(0.5f, 0.23f, 0.5f, 0.5f);
        h.w(pathBuilderD2, 12.0f, 2.0f, 2.51f);
        pathBuilderD2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD2.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        h.w(pathBuilderD2, 12.0f, 2.0f, 3.42f);
        pathBuilderD2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD2.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        h.w(pathBuilderD2, 12.0f, 2.0f, 6.15f);
        pathBuilderD2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD2.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD2, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panTool = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
