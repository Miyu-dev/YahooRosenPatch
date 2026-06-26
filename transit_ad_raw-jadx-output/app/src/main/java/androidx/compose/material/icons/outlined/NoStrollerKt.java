package androidx.compose.material.icons.outlined;

import a6.h;
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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoStroller.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noStroller", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoStroller", "Landroidx/compose/material/icons/Icons$Outlined;", "getNoStroller", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoStrollerKt {
    private static ImageVector _noStroller;

    public static final ImageVector getNoStroller(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _noStroller;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoStroller", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.0f, 20.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(8.0f, 18.9f, 8.0f, 20.0f);
        androidx.compose.animation.a.n(pathBuilderD, 15.0f, 8.66f, 3.51f);
        pathBuilderD.lineToRelative(2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(-7.9f);
        pathBuilderD.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        pathBuilderD.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        h.w(pathBuilderD, 7.0f, 2.0f, 6.48f);
        pathBuilderD.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        pathBuilderD.lineToRelative(-3.5f, 4.11f);
        s.r(pathBuilderD, 1.42f, 1.42f, 15.0f, 8.66f);
        pathBuilderD.moveTo(19.78f, 22.61f);
        pathBuilderD.lineToRelative(-1.91f, -1.91f);
        pathBuilderD.curveTo(17.58f, 21.46f, 16.86f, 22.0f, 16.0f, 22.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.86f, 0.54f, -1.58f, 1.3f, -1.87f);
        pathBuilderD.lineTo(14.17f, 17.0f);
        pathBuilderD.horizontalLineTo(7.43f);
        pathBuilderD.curveToRelative(-0.85f, 0.0f, -1.31f, -1.0f, -0.76f, -1.65f);
        pathBuilderD.lineToRelative(2.69f, -3.16f);
        pathBuilderD.lineTo(1.39f, 4.22f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        pathBuilderD.lineToRelative(7.86f, 7.86f);
        pathBuilderD.lineToRelative(1.42f, 1.42f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        s.r(pathBuilderD, 9.11f, 9.11f, 19.78f, 22.61f);
        pathBuilderD.moveTo(12.17f, 15.0f);
        pathBuilderD.lineToRelative(-1.39f, -1.39f);
        i.b(pathBuilderD, 9.6f, 15.0f, 12.17f);
        pathBuilderD.moveTo(10.0f, 5.0f);
        pathBuilderD.curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f);
        pathBuilderD.lineTo(9.49f, 6.67f);
        pathBuilderD.lineToRelative(1.42f, 1.42f);
        pathBuilderD.lineTo(14.3f, 4.1f);
        pathBuilderD.curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f);
        pathBuilderD.curveTo(8.77f, 3.0f, 7.6f, 3.25f, 6.53f, 3.7f);
        pathBuilderD.lineTo(8.1f, 5.27f);
        pathBuilderD.curveTo(8.71f, 5.1f, 9.35f, 5.0f, 10.0f, 5.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noStroller = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
