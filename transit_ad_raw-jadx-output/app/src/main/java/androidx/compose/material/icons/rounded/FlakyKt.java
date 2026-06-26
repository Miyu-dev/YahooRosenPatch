package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Flaky.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_flaky", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Flaky", "Landroidx/compose/material/icons/Icons$Rounded;", "getFlaky", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FlakyKt {
    private static ImageVector _flaky;

    public static final ImageVector getFlaky(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _flaky;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Flaky", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int iM3071getEvenOddRgk1Os = PathFillType.INSTANCE.m3071getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.16f, 15.72f);
        pathBuilderD.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilderD.lineToRelative(0.82f, 0.82f);
        pathBuilderD.lineToRelative(1.96f, -1.96f);
        pathBuilderD.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilderD.lineToRelative(-2.65f, 2.65f);
        pathBuilderD.curveToRelative(-0.19f, 0.19f, -0.51f, 0.2f, -0.7f, 0.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 12.16f, 15.72f, 12.0f, 2.0f);
        pathBuilderD.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        pathBuilderD.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        a.y(pathBuilderD, 7.87f, 6.81f, 0.88f, 0.88f);
        pathBuilderD.lineToRelative(0.88f, -0.88f);
        pathBuilderD.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilderD.lineTo(9.81f, 8.75f);
        pathBuilderD.lineToRelative(0.88f, 0.88f);
        pathBuilderD.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilderD.lineTo(8.75f, 9.81f);
        pathBuilderD.lineToRelative(-0.88f, 0.88f);
        pathBuilderD.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilderD.lineToRelative(0.88f, -0.88f);
        pathBuilderD.lineTo(6.81f, 7.87f);
        pathBuilderD.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveTo(7.1f, 6.51f, 7.57f, 6.51f, 7.87f, 6.81f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 20.0f);
        pathBuilderD.curveToRelative(-2.2f, 0.0f, -4.2f, -0.9f, -5.7f, -2.3f);
        pathBuilderD.lineTo(17.7f, 6.3f);
        pathBuilderD.curveTo(19.1f, 7.8f, 20.0f, 9.8f, 20.0f, 12.0f);
        pathBuilderD.curveTo(20.0f, 16.4f, 16.4f, 20.0f, 12.0f, 20.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), iM3071getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flaky = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
