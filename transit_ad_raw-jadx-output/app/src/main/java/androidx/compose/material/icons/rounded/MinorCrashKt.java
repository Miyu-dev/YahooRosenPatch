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

/* JADX INFO: compiled from: MinorCrash.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_minorCrash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MinorCrash", "Landroidx/compose/material/icons/Icons$Rounded;", "getMinorCrash", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MinorCrashKt {
    private static ImageVector _minorCrash;

    public static final ImageVector getMinorCrash(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _minorCrash;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MinorCrash", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.5f, 24.0f);
        pathBuilderD.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.verticalLineToRelative(-7.16f);
        pathBuilderD.curveToRelative(0.0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f);
        pathBuilderD.lineToRelative(-1.97f, -5.67f);
        pathBuilderD.curveTo(18.72f, 8.42f, 18.16f, 8.0f, 17.5f, 8.0f);
        pathBuilderD.horizontalLineToRelative(-11.0f);
        pathBuilderD.curveTo(5.84f, 8.0f, 5.29f, 8.42f, 5.08f, 9.01f);
        pathBuilderD.lineToRelative(-1.97f, 5.67f);
        pathBuilderD.curveTo(3.04f, 14.89f, 3.0f, 15.11f, 3.0f, 15.34f);
        pathBuilderD.verticalLineToRelative(7.16f);
        pathBuilderD.curveTo(3.0f, 23.33f, 3.68f, 24.0f, 4.5f, 24.0f);
        pathBuilderD.reflectiveCurveTo(6.0f, 23.33f, 6.0f, 22.5f);
        v.r(pathBuilderD, 22.0f, 12.0f, 0.5f);
        pathBuilderD.curveTo(18.0f, 23.33f, 18.67f, 24.0f, 19.5f, 24.0f);
        androidx.compose.animation.a.j(pathBuilderD, 6.85f, 10.0f, 10.29f);
        pathBuilderD.lineToRelative(1.04f, 3.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderD, 5.81f, 6.85f, 10.0f);
        pathBuilderD.moveTo(6.0f, 17.5f);
        pathBuilderD.curveTo(6.0f, 16.67f, 6.67f, 16.0f, 7.5f, 16.0f);
        pathBuilderD.reflectiveCurveTo(9.0f, 16.67f, 9.0f, 17.5f);
        pathBuilderD.reflectiveCurveTo(8.33f, 19.0f, 7.5f, 19.0f);
        pathBuilderD.reflectiveCurveTo(6.0f, 18.33f, 6.0f, 17.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.0f, 17.5f);
        pathBuilderD.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(17.33f, 19.0f, 16.5f, 19.0f);
        pathBuilderD.reflectiveCurveTo(15.0f, 18.33f, 15.0f, 17.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.71f, 5.71f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.lineTo(5.71f, 4.12f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(1.59f, 1.59f);
        pathBuilderD.curveTo(9.1f, 4.68f, 9.1f, 5.32f, 8.71f, 5.71f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.29f, 2.71f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(-1.59f, 1.59f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineToRelative(1.59f, -1.59f);
        pathBuilderD.curveTo(17.27f, 2.32f, 17.9f, 2.32f, 18.29f, 2.71f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 5.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineTo(1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.curveTo(13.0f, 4.55f, 12.55f, 5.0f, 12.0f, 5.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _minorCrash = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
