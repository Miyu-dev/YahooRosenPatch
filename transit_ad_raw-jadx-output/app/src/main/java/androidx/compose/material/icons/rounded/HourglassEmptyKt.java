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

/* JADX INFO: compiled from: HourglassEmpty.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hourglassEmpty", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HourglassEmpty", "Landroidx/compose/material/icons/Icons$Rounded;", "getHourglassEmpty", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HourglassEmptyKt {
    private static ImageVector _hourglassEmpty;

    public static final ImageVector getHourglassEmpty(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hourglassEmpty;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HourglassEmpty", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.0f, 2.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(3.17f);
        pathBuilderD.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.42f);
        pathBuilderD.lineTo(10.0f, 12.0f);
        pathBuilderD.lineToRelative(-3.42f, 3.42f);
        pathBuilderD.curveToRelative(-0.37f, 0.38f, -0.58f, 0.89f, -0.58f, 1.42f);
        pathBuilderD.lineTo(6.0f, 20.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(8.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(-3.16f);
        pathBuilderD.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.58f, -1.41f);
        pathBuilderD.lineTo(14.0f, 12.0f);
        pathBuilderD.lineToRelative(3.41f, -3.4f);
        pathBuilderD.curveToRelative(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f);
        pathBuilderD.lineTo(18.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 8.0f, 2.0f, 16.0f, 16.5f);
        pathBuilderD.lineTo(16.0f, 19.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.lineTo(9.0f, 20.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-2.5f);
        android.support.v4.media.a.n(pathBuilderD, 4.0f, -4.0f, 4.0f, 4.0f);
        pathBuilderD.moveTo(12.0f, 11.5f);
        pathBuilderD.lineToRelative(-4.0f, -4.0f);
        pathBuilderD.lineTo(8.0f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.m(pathBuilderD, 2.5f, -4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassEmpty = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
