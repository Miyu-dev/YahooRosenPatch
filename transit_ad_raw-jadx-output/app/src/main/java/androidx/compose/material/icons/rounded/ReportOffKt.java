package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: ReportOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_reportOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ReportOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getReportOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ReportOffKt {
    private static ImageVector _reportOff;

    public static final ImageVector getReportOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _reportOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ReportOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 7.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(1.33f);
        pathBuilderD.lineToRelative(7.2f, 7.2f);
        pathBuilderD.lineToRelative(0.51f, -0.51f);
        pathBuilderD.curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f);
        pathBuilderD.verticalLineTo(8.68f);
        pathBuilderD.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        pathBuilderD.lineToRelative(-4.68f, -4.68f);
        pathBuilderD.curveToRelative(-0.19f, -0.18f, -0.45f, -0.29f, -0.71f, -0.29f);
        pathBuilderD.horizontalLineTo(8.68f);
        pathBuilderD.curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f);
        pathBuilderD.lineToRelative(-0.51f, 0.51f);
        pathBuilderD.lineToRelative(3.69f, 3.69f);
        pathBuilderD.curveToRelative(0.17f, -0.29f, 0.48f, -0.49f, 0.84f, -0.49f);
        androidx.compose.animation.a.t(pathBuilderD, 2.41f, 1.58f, 1.0f, 2.99f);
        pathBuilderD.lineToRelative(3.64f, 3.64f);
        pathBuilderD.lineToRelative(-1.35f, 1.35f);
        pathBuilderD.curveToRelative(-0.18f, 0.18f, -0.29f, 0.44f, -0.29f, 0.7f);
        pathBuilderD.verticalLineToRelative(6.63f);
        pathBuilderD.curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f);
        pathBuilderD.lineToRelative(4.68f, 4.68f);
        pathBuilderD.curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.71f, 0.3f);
        pathBuilderD.horizontalLineToRelative(6.63f);
        pathBuilderD.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.29f);
        pathBuilderD.lineToRelative(1.35f, -1.35f);
        pathBuilderD.lineTo(21.01f, 23.0f);
        s.r(pathBuilderD, 1.41f, -1.41f, 2.41f, 1.58f);
        pathBuilderD.moveTo(12.0f, 17.3f);
        pathBuilderD.curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f);
        pathBuilderD.curveToRelative(0.0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f);
        pathBuilderD.reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f);
        pathBuilderD.curveToRelative(0.0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
