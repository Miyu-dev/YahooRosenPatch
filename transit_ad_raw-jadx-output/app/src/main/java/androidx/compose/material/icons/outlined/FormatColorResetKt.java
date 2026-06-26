package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: FormatColorReset.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatColorReset", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatColorReset", "Landroidx/compose/material/icons/Icons$Outlined;", "getFormatColorReset", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FormatColorResetKt {
    private static ImageVector _formatColorReset;

    public static final ImageVector getFormatColorReset(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _formatColorReset;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FormatColorReset", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 6.36f);
        pathBuilderD.curveToRelative(1.53f, 2.0f, 3.08f, 4.43f, 3.71f, 6.24f);
        pathBuilderD.lineToRelative(2.23f, 2.23f);
        pathBuilderD.curveToRelative(0.03f, -0.27f, 0.06f, -0.55f, 0.06f, -0.83f);
        pathBuilderD.curveToRelative(0.0f, -3.98f, -6.0f, -10.8f, -6.0f, -10.8f);
        pathBuilderD.reflectiveCurveToRelative(-1.18f, 1.35f, -2.5f, 3.19f);
        pathBuilderD.lineToRelative(1.44f, 1.44f);
        pathBuilderD.curveToRelative(0.34f, -0.51f, 0.7f, -1.0f, 1.06f, -1.47f);
        androidx.compose.animation.a.t(pathBuilderD, 5.41f, 5.14f, 4.0f, 6.55f);
        pathBuilderD.lineToRelative(3.32f, 3.32f);
        pathBuilderD.curveTo(6.55f, 11.33f, 6.0f, 12.79f, 6.0f, 14.0f);
        pathBuilderD.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilderD.curveToRelative(1.52f, 0.0f, 2.9f, -0.57f, 3.95f, -1.5f);
        pathBuilderD.lineToRelative(2.63f, 2.63f);
        android.support.v4.media.a.C(pathBuilderD, 20.0f, 19.72f, 5.41f, 5.14f);
        pathBuilderD.moveTo(12.0f, 18.0f);
        pathBuilderD.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.69f, 0.32f, -1.62f, 0.81f, -2.64f);
        pathBuilderD.lineToRelative(5.72f, 5.72f);
        pathBuilderD.curveToRelative(-0.7f, 0.56f, -1.57f, 0.92f, -2.53f, 0.92f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorReset = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
