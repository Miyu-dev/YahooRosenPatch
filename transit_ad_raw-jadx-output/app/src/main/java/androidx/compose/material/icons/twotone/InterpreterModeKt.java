package androidx.compose.material.icons.twotone;

import a6.h;
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

/* JADX INFO: compiled from: InterpreterMode.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_interpreterMode", "Landroidx/compose/ui/graphics/vector/ImageVector;", "InterpreterMode", "Landroidx/compose/material/icons/Icons$TwoTone;", "getInterpreterMode", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class InterpreterModeKt {
    private static ImageVector _interpreterMode;

    public static final ImageVector getInterpreterMode(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _interpreterMode;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.InterpreterMode", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(15.52f, 15.01f);
        pathBuilderD.curveTo(15.35f, 15.0f, 15.18f, 15.0f, 15.0f, 15.0f);
        pathBuilderD.curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f);
        pathBuilderD.curveTo(9.2f, 16.5f, 9.0f, 16.84f, 9.0f, 17.22f);
        pathBuilderD.verticalLineTo(18.0f);
        pathBuilderD.lineToRelative(7.17f, 0.0f);
        pathBuilderD.curveTo(15.74f, 17.26f, 15.4f, 16.24f, 15.52f, 15.01f);
        pathBuilderD.close();
        pathBuilderD.moveTo(13.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 13.0f, 6.9f, 13.0f, 8.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(20.5f, 16.5f);
        pathBuilderD2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD2.verticalLineToRelative(-2.5f);
        pathBuilderD2.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderD2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD2.verticalLineTo(15.0f);
        pathBuilderD2.curveTo(22.0f, 15.83f, 21.33f, 16.5f, 20.5f, 16.5f);
        androidx.compose.animation.a.j(pathBuilderD2, 20.0f, 20.0f, 1.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.0f, 0.0f, -1.54f, 0.0f, -1.54f);
        pathBuilderD2.curveToRelative(1.69f, -0.24f, 3.0f, -1.7f, 3.0f, -3.46f);
        pathBuilderD2.horizontalLineToRelative(-1.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        pathBuilderD2.reflectiveCurveTo(18.0f, 16.38f, 18.0f, 15.0f);
        pathBuilderD2.horizontalLineToRelative(-1.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.76f, 1.31f, 3.22f, 3.0f, 3.46f);
        pathBuilderD2.curveTo(20.0f, 18.46f, 20.0f, 20.0f, 20.0f, 20.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(9.0f, 12.0f);
        pathBuilderD2.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilderD2.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilderD2.curveToRelative(0.47f, 0.0f, 0.92f, 0.08f, 1.34f, 0.23f);
        pathBuilderD2.curveTo(9.5f, 5.26f, 9.0f, 6.57f, 9.0f, 8.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.43f, 0.5f, 2.74f, 1.34f, 3.77f);
        pathBuilderD2.curveTo(9.92f, 11.92f, 9.47f, 12.0f, 9.0f, 12.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(7.11f, 13.13f);
        pathBuilderD2.curveTo(5.79f, 14.05f, 5.0f, 15.57f, 5.0f, 17.22f);
        androidx.appcompat.graphics.drawable.a.o(pathBuilderD2, 20.0f, 1.0f, -2.78f);
        pathBuilderD2.curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f);
        pathBuilderD2.curveTo(3.85f, 13.92f, 5.37f, 13.37f, 7.11f, 13.13f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(11.0f, 8.0f);
        pathBuilderD2.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilderD2.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilderD2.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilderD2.reflectiveCurveTo(11.0f, 10.21f, 11.0f, 8.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(13.0f, 8.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD2.reflectiveCurveTo(13.0f, 6.9f, 13.0f, 8.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(15.0f, 15.0f);
        pathBuilderD2.curveToRelative(-2.37f, 0.0f, -4.29f, 0.73f, -5.48f, 1.34f);
        pathBuilderD2.curveTo(9.2f, 16.5f, 9.0f, 16.84f, 9.0f, 17.22f);
        pathBuilderD2.verticalLineTo(18.0f);
        pathBuilderD2.lineToRelative(7.17f, 0.0f);
        pathBuilderD2.curveToRelative(0.5f, 0.86f, 1.25f, 1.56f, 2.15f, 2.0f);
        pathBuilderD2.lineTo(7.0f, 20.0f);
        pathBuilderD2.verticalLineToRelative(-2.78f);
        pathBuilderD2.curveToRelative(0.0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f);
        pathBuilderD2.curveTo(10.29f, 13.7f, 12.47f, 13.0f, 15.0f, 13.0f);
        pathBuilderD2.curveToRelative(0.39f, 0.0f, 0.77f, 0.02f, 1.14f, 0.05f);
        pathBuilderD2.curveToRelative(-0.33f, 0.59f, -0.55f, 1.26f, -0.62f, 1.96f);
        pathBuilderD2.curveTo(15.35f, 15.0f, 15.18f, 15.0f, 15.0f, 15.0f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _interpreterMode = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
