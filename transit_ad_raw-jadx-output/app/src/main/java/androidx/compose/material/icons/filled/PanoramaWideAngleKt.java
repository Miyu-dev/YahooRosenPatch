package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: PanoramaWideAngle.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_panoramaWideAngle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PanoramaWideAngle", "Landroidx/compose/material/icons/Icons$Filled;", "getPanoramaWideAngle", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PanoramaWideAngleKt {
    private static ImageVector _panoramaWideAngle;

    public static final ImageVector getPanoramaWideAngle(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _panoramaWideAngle;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PanoramaWideAngle", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 6.0f);
        pathBuilderD.curveToRelative(2.45f, 0.0f, 4.71f, 0.2f, 7.29f, 0.64f);
        pathBuilderD.curveToRelative(0.47f, 1.78f, 0.71f, 3.58f, 0.71f, 5.36f);
        pathBuilderD.curveToRelative(0.0f, 1.78f, -0.24f, 3.58f, -0.71f, 5.36f);
        pathBuilderD.curveToRelative(-2.58f, 0.44f, -4.84f, 0.64f, -7.29f, 0.64f);
        pathBuilderD.reflectiveCurveToRelative(-4.71f, -0.2f, -7.29f, -0.64f);
        pathBuilderD.curveTo(4.24f, 15.58f, 4.0f, 13.78f, 4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.78f, 0.24f, -3.58f, 0.71f, -5.36f);
        pathBuilderD.curveTo(7.29f, 6.2f, 9.55f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.moveToRelative(0.0f, -2.0f);
        pathBuilderD.curveToRelative(-2.73f, 0.0f, -5.22f, 0.24f, -7.95f, 0.72f);
        pathBuilderD.lineToRelative(-0.93f, 0.16f);
        pathBuilderD.lineToRelative(-0.25f, 0.9f);
        pathBuilderD.curveTo(2.29f, 7.85f, 2.0f, 9.93f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(0.29f, 4.15f, 0.87f, 6.22f);
        pathBuilderD.lineToRelative(0.25f, 0.89f);
        pathBuilderD.lineToRelative(0.93f, 0.16f);
        pathBuilderD.curveToRelative(2.73f, 0.49f, 5.22f, 0.73f, 7.95f, 0.73f);
        pathBuilderD.reflectiveCurveToRelative(5.22f, -0.24f, 7.95f, -0.72f);
        pathBuilderD.lineToRelative(0.93f, -0.16f);
        pathBuilderD.lineToRelative(0.25f, -0.89f);
        pathBuilderD.curveToRelative(0.58f, -2.08f, 0.87f, -4.16f, 0.87f, -6.23f);
        pathBuilderD.reflectiveCurveToRelative(-0.29f, -4.15f, -0.87f, -6.22f);
        pathBuilderD.lineToRelative(-0.25f, -0.89f);
        pathBuilderD.lineToRelative(-0.93f, -0.16f);
        pathBuilderD.curveTo(17.22f, 4.24f, 14.73f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaWideAngle = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
