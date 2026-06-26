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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BrowserUpdated.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_browserUpdated", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BrowserUpdated", "Landroidx/compose/material/icons/Icons$Rounded;", "getBrowserUpdated", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BrowserUpdatedKt {
    private static ImageVector _browserUpdated;

    public static final ImageVector getBrowserUpdated(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _browserUpdated;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BrowserUpdated", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(15.0f, 3.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(6.0f);
        pathBuilderD.horizontalLineToRelative(1.59f);
        pathBuilderD.curveToRelative(0.89f, 0.0f, 1.34f, 1.08f, 0.71f, 1.71f);
        pathBuilderD.lineToRelative(-2.59f, 2.59f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.lineToRelative(-2.59f, -2.59f);
        pathBuilderD.curveTo(11.08f, 11.08f, 11.52f, 10.0f, 12.41f, 10.0f);
        pathBuilderD.horizontalLineTo(14.0f);
        pathBuilderD.verticalLineTo(4.0f);
        pathBuilderD.curveTo(14.0f, 3.45f, 14.45f, 3.0f, 15.0f, 3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.0f, 19.59f);
        pathBuilderD.curveTo(6.0f, 20.37f, 6.63f, 21.0f, 7.41f, 21.0f);
        pathBuilderD.horizontalLineToRelative(9.17f);
        pathBuilderD.curveToRelative(0.78f, 0.0f, 1.41f, -0.63f, 1.41f, -1.41f);
        pathBuilderD.curveToRelative(0.0f, -0.72f, -0.44f, -1.03f, -1.0f, -1.59f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        i.c(pathBuilderD, 2.0f, 4.0f, 5.0f);
        pathBuilderD.lineToRelative(7.0f, 0.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.lineTo(4.0f, 3.0f);
        pathBuilderD.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        pathBuilderD.verticalLineToRelative(11.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.curveTo(6.45f, 18.55f, 6.0f, 18.87f, 6.0f, 19.59f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _browserUpdated = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
