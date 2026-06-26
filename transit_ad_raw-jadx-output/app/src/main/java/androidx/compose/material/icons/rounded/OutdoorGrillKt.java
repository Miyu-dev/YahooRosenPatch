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

/* JADX INFO: compiled from: OutdoorGrill.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_outdoorGrill", "Landroidx/compose/ui/graphics/vector/ImageVector;", "OutdoorGrill", "Landroidx/compose/material/icons/Icons$Rounded;", "getOutdoorGrill", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class OutdoorGrillKt {
    private static ImageVector _outdoorGrill;

    public static final ImageVector getOutdoorGrill(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _outdoorGrill;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OutdoorGrill", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.0f, 22.0f);
        pathBuilderD.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderD.curveToRelative(-1.3f, 0.0f, -2.4f, 0.84f, -2.82f, 2.0f);
        pathBuilderD.horizontalLineTo(9.14f);
        pathBuilderD.lineToRelative(1.99f, -3.06f);
        pathBuilderD.curveTo(11.42f, 14.98f, 11.71f, 15.0f, 12.0f, 15.0f);
        pathBuilderD.reflectiveCurveToRelative(0.58f, -0.02f, 0.87f, -0.06f);
        pathBuilderD.lineToRelative(1.02f, 1.57f);
        pathBuilderD.curveToRelative(0.42f, -0.53f, 0.96f, -0.95f, 1.6f, -1.21f);
        pathBuilderD.lineToRelative(-0.6f, -0.93f);
        pathBuilderD.curveToRelative(2.1f, -0.95f, 3.64f, -2.9f, 4.02f, -5.24f);
        pathBuilderD.curveTo(19.01f, 8.54f, 18.52f, 8.0f, 17.92f, 8.0f);
        pathBuilderD.curveTo(15.31f, 8.0f, 8.69f, 8.0f, 6.08f, 8.0f);
        pathBuilderD.curveTo(5.48f, 8.0f, 4.99f, 8.54f, 5.09f, 9.14f);
        pathBuilderD.curveToRelative(0.38f, 2.34f, 1.93f, 4.29f, 4.02f, 5.24f);
        pathBuilderD.lineToRelative(-3.95f, 6.08f);
        pathBuilderD.curveToRelative(-0.3f, 0.46f, -0.17f, 1.08f, 0.29f, 1.38f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.46f, 0.3f, 1.08f, 0.17f, 1.38f, -0.29f);
        pathBuilderD.lineToRelative(1.0f, -1.55f);
        pathBuilderD.horizontalLineToRelative(6.34f);
        pathBuilderD.curveTo(14.6f, 21.16f, 15.7f, 22.0f, 17.0f, 22.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.0f, 18.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.curveTo(16.0f, 18.45f, 16.45f, 18.0f, 17.0f, 18.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(9.5f, 6.47f);
        pathBuilderD2.curveTo(9.48f, 6.75f, 9.68f, 7.0f, 9.96f, 7.0f);
        pathBuilderD2.horizontalLineTo(10.0f);
        pathBuilderD2.curveToRelative(0.24f, 0.0f, 0.44f, -0.18f, 0.46f, -0.42f);
        pathBuilderD2.curveToRelative(0.1f, -0.87f, 0.04f, -1.39f, -0.94f, -2.54f);
        pathBuilderD2.curveTo(9.16f, 3.61f, 8.92f, 3.35f, 8.99f, 2.49f);
        pathBuilderD2.curveTo(9.02f, 2.23f, 8.8f, 2.0f, 8.53f, 2.0f);
        pathBuilderD2.horizontalLineTo(8.48f);
        pathBuilderD2.curveTo(8.24f, 2.0f, 8.03f, 2.19f, 8.01f, 2.43f);
        pathBuilderD2.curveToRelative(-0.08f, 0.93f, 0.2f, 1.74f, 0.95f, 2.53f);
        pathBuilderD2.curveTo(9.15f, 5.17f, 9.6f, 5.52f, 9.5f, 6.47f);
        pathBuilderD2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(11.99f, 6.47f);
        pathBuilderD3.curveTo(11.96f, 6.75f, 12.17f, 7.0f, 12.45f, 7.0f);
        pathBuilderD3.horizontalLineToRelative(0.03f);
        pathBuilderD3.curveToRelative(0.24f, 0.0f, 0.44f, -0.18f, 0.46f, -0.42f);
        pathBuilderD3.curveToRelative(0.1f, -0.87f, 0.04f, -1.39f, -0.94f, -2.54f);
        pathBuilderD3.curveToRelative(-0.36f, -0.43f, -0.61f, -0.69f, -0.53f, -1.55f);
        pathBuilderD3.curveTo(11.5f, 2.23f, 11.28f, 2.0f, 11.01f, 2.0f);
        pathBuilderD3.horizontalLineToRelative(-0.05f);
        pathBuilderD3.curveToRelative(-0.24f, 0.0f, -0.45f, 0.19f, -0.47f, 0.43f);
        pathBuilderD3.curveToRelative(-0.08f, 0.93f, 0.2f, 1.74f, 0.95f, 2.53f);
        pathBuilderD3.curveTo(11.63f, 5.17f, 12.08f, 5.52f, 11.99f, 6.47f);
        pathBuilderD3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD4 = a.d(14.5f, 6.47f);
        pathBuilderD4.curveTo(14.48f, 6.75f, 14.68f, 7.0f, 14.96f, 7.0f);
        pathBuilderD4.horizontalLineTo(15.0f);
        pathBuilderD4.curveToRelative(0.24f, 0.0f, 0.44f, -0.18f, 0.46f, -0.42f);
        pathBuilderD4.curveToRelative(0.1f, -0.87f, 0.04f, -1.39f, -0.94f, -2.54f);
        pathBuilderD4.curveToRelative(-0.36f, -0.43f, -0.61f, -0.69f, -0.53f, -1.55f);
        pathBuilderD4.curveTo(14.02f, 2.23f, 13.8f, 2.0f, 13.53f, 2.0f);
        pathBuilderD4.horizontalLineToRelative(-0.05f);
        pathBuilderD4.curveToRelative(-0.24f, 0.0f, -0.45f, 0.19f, -0.47f, 0.43f);
        pathBuilderD4.curveToRelative(-0.08f, 0.93f, 0.2f, 1.74f, 0.95f, 2.53f);
        pathBuilderD4.curveTo(14.15f, 5.17f, 14.6f, 5.52f, 14.5f, 6.47f);
        pathBuilderD4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _outdoorGrill = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
