package androidx.compose.material.icons.filled;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: NoStroller.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_noStroller", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NoStroller", "Landroidx/compose/material/icons/Icons$Filled;", "getNoStroller", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NoStrollerKt {
    private static ImageVector _noStroller;

    public static final ImageVector getNoStroller(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _noStroller;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoStroller", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.0f, 18.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(4.9f, 18.0f, 6.0f, 18.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.65f, 3.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        pathBuilderD.lineToRelative(-3.5f, 4.11f);
        pathBuilderD.lineTo(17.0f, 14.17f);
        pathBuilderD.verticalLineToRelative(-7.9f);
        pathBuilderD.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        pathBuilderD.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        h.w(pathBuilderD, 7.0f, 2.0f, 6.48f);
        pathBuilderD.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        androidx.compose.animation.a.t(pathBuilderD, 10.67f, 10.67f, 2.81f, 2.81f);
        pathBuilderD.lineTo(1.39f, 4.22f);
        pathBuilderD.lineToRelative(7.97f, 7.97f);
        pathBuilderD.lineTo(6.7f, 15.31f);
        pathBuilderD.curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f);
        pathBuilderD.horizontalLineToRelative(6.66f);
        pathBuilderD.lineToRelative(1.17f, 1.17f);
        pathBuilderD.curveTo(14.54f, 18.42f, 14.0f, 19.14f, 14.0f, 20.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.86f, 0.0f, 1.58f, -0.54f, 1.87f, -1.3f);
        pathBuilderD.lineToRelative(1.91f, 1.91f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        s.r(pathBuilderD, -4.8f, -4.8f, 10.67f, 10.67f);
        pathBuilderD.moveTo(13.47f, 5.03f);
        pathBuilderD.curveToRelative(0.27f, -0.32f, 0.58f, -0.72f, 0.98f, -1.09f);
        pathBuilderD.curveToRelative(-2.46f, -1.19f, -5.32f, -1.22f, -7.81f, -0.13f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 4.25f, 4.25f, 13.47f, 5.03f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noStroller = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
