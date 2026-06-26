package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: HourglassBottom.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hourglassBottom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HourglassBottom", "Landroidx/compose/material/icons/Icons$Rounded;", "getHourglassBottom", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HourglassBottomKt {
    private static ImageVector _hourglassBottom;

    public static final ImageVector getHourglassBottom(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hourglassBottom;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HourglassBottom", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.0f, 22.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.lineToRelative(-0.01f, -3.18f);
        pathBuilderD.curveToRelative(0.0f, -0.53f, -0.21f, -1.03f, -0.58f, -1.41f);
        pathBuilderD.lineTo(14.0f, 12.0f);
        pathBuilderD.lineToRelative(3.41f, -3.43f);
        pathBuilderD.curveToRelative(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f);
        pathBuilderD.lineTo(18.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.horizontalLineTo(8.0f);
        pathBuilderD.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(3.16f);
        pathBuilderD.curveTo(6.0f, 7.69f, 6.21f, 8.2f, 6.58f, 8.58f);
        pathBuilderD.lineTo(10.0f, 12.0f);
        pathBuilderD.lineToRelative(-3.41f, 3.4f);
        pathBuilderD.curveTo(6.21f, 15.78f, 6.0f, 16.29f, 6.0f, 16.82f);
        pathBuilderD.verticalLineTo(20.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v.s(pathBuilderD, 16.0f, 8.0f, 7.09f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(2.09f);
        pathBuilderD.curveToRelative(0.0f, 0.27f, -0.11f, 0.52f, -0.29f, 0.71f);
        pathBuilderD.lineTo(12.0f, 11.5f);
        pathBuilderD.lineTo(8.29f, 7.79f);
        pathBuilderD.curveTo(8.11f, 7.61f, 8.0f, 7.35f, 8.0f, 7.09f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassBottom = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
