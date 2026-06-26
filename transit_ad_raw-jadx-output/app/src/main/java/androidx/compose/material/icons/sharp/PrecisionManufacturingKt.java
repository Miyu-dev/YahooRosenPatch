package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_precisionManufacturing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PrecisionManufacturing", "Landroidx/compose/material/icons/Icons$Sharp;", "getPrecisionManufacturing", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PrecisionManufacturingKt {
    private static ImageVector _precisionManufacturing;

    public static final ImageVector getPrecisionManufacturing(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _precisionManufacturing;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PrecisionManufacturing", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = b.u(14.0f, 10.0f, 9.82f, 2.01f, 2.01f);
        pathBuilderU.lineToRelative(5.23f, -2.44f);
        pathBuilderU.lineToRelative(-0.63f, -1.36f);
        pathBuilderU.lineToRelative(-4.28f, 2.0f);
        pathBuilderU.lineTo(14.0f, 7.7f);
        pathBuilderU.verticalLineTo(6.3f);
        pathBuilderU.lineToRelative(2.33f, -2.33f);
        pathBuilderU.lineToRelative(4.28f, 2.0f);
        pathBuilderU.lineToRelative(0.63f, -1.36f);
        pathBuilderU.lineToRelative(-5.23f, -2.44f);
        androidx.appcompat.app.m.r(pathBuilderU, 14.0f, 4.18f, 4.0f, -2.0f);
        pathBuilderU.verticalLineToRelative(2.0f);
        pathBuilderU.horizontalLineTo(8.82f);
        pathBuilderU.curveTo(8.4f, 4.84f, 7.3f, 4.0f, 6.0f, 4.0f);
        pathBuilderU.curveTo(4.34f, 4.0f, 3.0f, 5.34f, 3.0f, 7.0f);
        pathBuilderU.curveToRelative(0.0f, 1.1f, 0.6f, 2.05f, 1.48f, 2.58f);
        h.n(pathBuilderU, 7.08f, 18.0f, 4.0f, 3.0f);
        a.s(pathBuilderU, 13.0f, -3.0f, -3.62f);
        pathBuilderU.lineTo(8.41f, 8.76f);
        pathBuilderU.curveTo(8.58f, 8.53f, 8.72f, 8.28f, 8.82f, 8.0f);
        androidx.compose.animation.a.w(pathBuilderU, 12.0f, 2.0f, 14.0f);
        pathBuilderU.moveTo(6.0f, 8.0f);
        pathBuilderU.curveTo(5.45f, 8.0f, 5.0f, 7.55f, 5.0f, 7.0f);
        pathBuilderU.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderU.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderU.curveTo(7.0f, 7.55f, 6.55f, 8.0f, 6.0f, 8.0f);
        pathBuilderU.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderU.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _precisionManufacturing = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
