package androidx.compose.material.icons.rounded;

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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Brightness4.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brightness4", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Brightness4", "Landroidx/compose/material/icons/Icons$Rounded;", "getBrightness4", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class Brightness4Kt {
    private static ImageVector _brightness4;

    public static final ImageVector getBrightness4(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _brightness4;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Brightness4", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = c.c(22.6f, 11.29f, 20.0f, 8.69f, 5.0f);
        pathBuilderC.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderC.horizontalLineToRelative(-3.69f);
        pathBuilderC.lineToRelative(-2.6f, -2.6f);
        pathBuilderC.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderC.lineTo(8.69f, 4.0f);
        pathBuilderC.horizontalLineTo(5.0f);
        pathBuilderC.curveTo(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f);
        pathBuilderC.verticalLineToRelative(3.69f);
        pathBuilderC.lineToRelative(-2.6f, 2.6f);
        pathBuilderC.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderC.lineTo(4.0f, 15.3f);
        pathBuilderC.verticalLineTo(19.0f);
        pathBuilderC.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderC.horizontalLineToRelative(3.69f);
        pathBuilderC.lineToRelative(2.6f, 2.6f);
        pathBuilderC.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderC.lineToRelative(2.6f, -2.6f);
        pathBuilderC.horizontalLineTo(19.0f);
        pathBuilderC.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderC.verticalLineToRelative(-3.69f);
        pathBuilderC.lineToRelative(2.6f, -2.6f);
        pathBuilderC.curveTo(22.99f, 12.32f, 22.99f, 11.68f, 22.6f, 11.29f);
        pathBuilderC.close();
        pathBuilderC.moveTo(17.92f, 12.98f);
        pathBuilderC.curveToRelative(-0.34f, 2.12f, -1.85f, 3.94f, -3.88f, 4.66f);
        pathBuilderC.curveToRelative(-1.21f, 0.43f, -2.41f, 0.45f, -3.5f, 0.18f);
        pathBuilderC.curveToRelative(-0.41f, -0.1f, -0.48f, -0.65f, -0.13f, -0.9f);
        pathBuilderC.curveTo(11.98f, 15.84f, 13.0f, 14.04f, 13.0f, 12.0f);
        pathBuilderC.reflectiveCurveToRelative(-1.02f, -3.84f, -2.58f, -4.92f);
        pathBuilderC.curveToRelative(-0.35f, -0.24f, -0.29f, -0.79f, 0.13f, -0.9f);
        pathBuilderC.curveToRelative(1.09f, -0.27f, 2.29f, -0.25f, 3.5f, 0.18f);
        pathBuilderC.curveToRelative(2.02f, 0.72f, 3.54f, 2.54f, 3.88f, 4.66f);
        pathBuilderC.curveTo(17.98f, 11.35f, 18.0f, 11.68f, 18.0f, 12.0f);
        pathBuilderC.curveTo(17.99f, 12.32f, 17.97f, 12.65f, 17.92f, 12.98f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness4 = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
