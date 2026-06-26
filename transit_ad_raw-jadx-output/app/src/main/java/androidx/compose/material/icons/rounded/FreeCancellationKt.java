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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: FreeCancellation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_freeCancellation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FreeCancellation", "Landroidx/compose/material/icons/Icons$Rounded;", "getFreeCancellation", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FreeCancellationKt {
    private static ImageVector _freeCancellation;

    public static final ImageVector getFreeCancellation(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _freeCancellation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FreeCancellation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderG = androidx.appcompat.app.m.g(10.79f, 20.0f, 5.0f, 10.0f, 14.0f);
        pathBuilderG.verticalLineToRelative(2.96f);
        pathBuilderG.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        pathBuilderG.lineToRelative(0.0f, 0.0f);
        pathBuilderG.curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f);
        pathBuilderG.verticalLineTo(6.0f);
        pathBuilderG.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderG.horizontalLineToRelative(-1.0f);
        pathBuilderG.verticalLineTo(3.0f);
        pathBuilderG.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderG.horizontalLineToRelative(0.0f);
        pathBuilderG.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.c(pathBuilderG, 1.0f, 8.0f, 3.0f);
        pathBuilderG.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderG.horizontalLineToRelative(0.0f);
        pathBuilderG.curveTo(6.45f, 2.0f, 6.0f, 2.45f, 6.0f, 3.0f);
        pathBuilderG.verticalLineToRelative(1.0f);
        pathBuilderG.horizontalLineTo(5.0f);
        pathBuilderG.curveTo(3.89f, 4.0f, 3.01f, 4.9f, 3.01f, 6.0f);
        pathBuilderG.lineTo(3.0f, 20.0f);
        pathBuilderG.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderG.horizontalLineToRelative(5.79f);
        pathBuilderG.curveToRelative(0.89f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        pathBuilderG.lineToRelative(0.0f, 0.0f);
        pathBuilderG.curveTo(11.31f, 20.11f, 11.06f, 20.0f, 10.79f, 20.0f);
        pathBuilderG.close();
        pathBuilderG.moveTo(13.71f, 18.26f);
        pathBuilderG.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderG.lineToRelative(1.41f, 1.41f);
        pathBuilderG.lineToRelative(3.54f, -3.54f);
        pathBuilderG.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderG.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderG.lineToRelative(-4.24f, 4.24f);
        pathBuilderG.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderG.lineToRelative(-2.12f, -2.12f);
        pathBuilderG.curveTo(13.32f, 19.28f, 13.32f, 18.65f, 13.71f, 18.26f);
        pathBuilderG.close();
        pathBuilderG.moveTo(11.29f, 16.29f);
        pathBuilderG.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderG.lineTo(9.0f, 15.41f);
        pathBuilderG.lineToRelative(-0.88f, 0.88f);
        pathBuilderG.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderG.reflectiveCurveToRelative(-0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderG.lineTo(7.59f, 14.0f);
        pathBuilderG.lineToRelative(-0.88f, -0.88f);
        pathBuilderG.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderG.reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderG.lineTo(9.0f, 12.59f);
        pathBuilderG.lineToRelative(0.88f, -0.88f);
        pathBuilderG.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderG.reflectiveCurveToRelative(0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderG.lineTo(10.41f, 14.0f);
        pathBuilderG.lineToRelative(0.88f, 0.88f);
        pathBuilderG.curveTo(11.68f, 15.27f, 11.68f, 15.9f, 11.29f, 16.29f);
        pathBuilderG.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderG.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _freeCancellation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
