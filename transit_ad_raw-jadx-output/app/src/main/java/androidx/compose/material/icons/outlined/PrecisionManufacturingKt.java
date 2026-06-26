package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: PrecisionManufacturing.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_precisionManufacturing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PrecisionManufacturing", "Landroidx/compose/material/icons/Icons$Outlined;", "getPrecisionManufacturing", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PrecisionManufacturingKt {
    private static ImageVector _precisionManufacturing;

    public static final ImageVector getPrecisionManufacturing(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _precisionManufacturing;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PrecisionManufacturing", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.93f, 8.35f, -3.6f, 1.68f);
        pathBuilderA.lineTo(14.0f, 7.7f);
        pathBuilderA.verticalLineTo(6.3f);
        pathBuilderA.lineToRelative(2.33f, -2.33f);
        pathBuilderA.lineToRelative(3.6f, 1.68f);
        pathBuilderA.curveToRelative(0.38f, 0.18f, 0.82f, 0.01f, 1.0f, -0.36f);
        pathBuilderA.curveToRelative(0.18f, -0.38f, 0.01f, -0.82f, -0.36f, -1.0f);
        pathBuilderA.lineToRelative(-3.92f, -1.83f);
        pathBuilderA.curveToRelative(-0.38f, -0.18f, -0.83f, -0.1f, -1.13f, 0.2f);
        pathBuilderA.lineTo(13.78f, 4.4f);
        pathBuilderA.curveTo(13.6f, 4.16f, 13.32f, 4.0f, 13.0f, 4.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(1.0f);
        pathBuilderA.horizontalLineTo(8.82f);
        pathBuilderA.curveTo(8.4f, 4.84f, 7.3f, 4.0f, 6.0f, 4.0f);
        pathBuilderA.curveTo(4.34f, 4.0f, 3.0f, 5.34f, 3.0f, 7.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.6f, 2.05f, 1.48f, 2.58f);
        pathBuilderA.lineTo(7.08f, 18.0f);
        pathBuilderA.horizontalLineTo(6.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        a.m(pathBuilderA, 1.0f, 13.0f, -1.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.horizontalLineToRelative(-1.62f);
        pathBuilderA.lineTo(8.41f, 8.77f);
        pathBuilderA.curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f);
        pathBuilderA.horizontalLineTo(12.0f);
        pathBuilderA.verticalLineToRelative(1.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.curveToRelative(0.32f, 0.0f, 0.6f, -0.16f, 0.78f, -0.4f);
        pathBuilderA.lineToRelative(1.74f, 1.74f);
        pathBuilderA.curveToRelative(0.3f, 0.3f, 0.75f, 0.38f, 1.13f, 0.2f);
        pathBuilderA.lineToRelative(3.92f, -1.83f);
        pathBuilderA.curveToRelative(0.38f, -0.18f, 0.54f, -0.62f, 0.36f, -1.0f);
        pathBuilderA.curveTo(20.75f, 8.34f, 20.31f, 8.17f, 19.93f, 8.35f);
        pathBuilderA.close();
        pathBuilderA.moveTo(6.0f, 8.0f);
        pathBuilderA.curveTo(5.45f, 8.0f, 5.0f, 7.55f, 5.0f, 7.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderA.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderA.curveTo(7.0f, 7.55f, 6.55f, 8.0f, 6.0f, 8.0f);
        androidx.browser.browseractions.a.k(pathBuilderA, 11.11f, 18.0f, 9.17f);
        pathBuilderA.lineToRelative(-2.46f, -8.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.r(pathBuilderA, 0.1f, 11.11f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _precisionManufacturing = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
