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

/* JADX INFO: compiled from: PrintDisabled.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_printDisabled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PrintDisabled", "Landroidx/compose/material/icons/Icons$Rounded;", "getPrintDisabled", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PrintDisabledKt {
    private static ImageVector _printDisabled;

    public static final ImageVector getPrintDisabled(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _printDisabled;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PrintDisabled", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(2.12f, 2.32f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineTo(4.98f, 8.0f);
        pathBuilderD.curveTo(3.33f, 8.01f, 2.0f, 9.35f, 2.0f, 11.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(8.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.04f, -0.22f, 1.4f, -0.58f);
        pathBuilderD.lineToRelative(2.83f, 2.83f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 2.12f, 2.32f, 15.0f, 19.0f);
        pathBuilderD.lineTo(9.0f, 19.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.t(pathBuilderD, -4.0f, 2.98f, 4.72f, 4.72f);
        pathBuilderD.curveToRelative(-0.19f, 0.17f, -0.43f, 0.28f, -0.7f, 0.28f);
        androidx.compose.animation.a.j(pathBuilderD, 19.0f, 8.0f, -8.37f);
        pathBuilderD.lineToRelative(9.0f, 9.0f);
        pathBuilderD.lineTo(20.0f, 17.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(-4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 12.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.0f, 7.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.lineTo(18.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.lineTo(7.0f, 3.0f);
        pathBuilderD.curveToRelative(-0.37f, 0.0f, -0.68f, 0.21f, -0.85f, 0.51f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 9.63f, 7.0f, 17.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _printDisabled = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
