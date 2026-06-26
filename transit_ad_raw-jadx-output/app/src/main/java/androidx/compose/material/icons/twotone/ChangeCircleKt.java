package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: ChangeCircle.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_changeCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ChangeCircle", "Landroidx/compose/material/icons/Icons$TwoTone;", "getChangeCircle", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ChangeCircleKt {
    private static ImageVector _changeCircle;

    public static final ImageVector getChangeCircle(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _changeCircle;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ChangeCircle", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 4.0f);
        pathBuilderD.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderD.reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.moveTo(12.06f, 13.34f);
        pathBuilderD.verticalLineToRelative(2.14f);
        pathBuilderD.curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f);
        pathBuilderD.curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f);
        pathBuilderD.lineToRelative(-1.1f, -1.1f);
        pathBuilderD.curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f);
        pathBuilderD.curveTo(9.44f, 16.51f, 10.72f, 17.0f, 12.0f, 17.0f);
        pathBuilderD.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        pathBuilderD.verticalLineTo(19.0f);
        s.r(pathBuilderD, 2.83f, -2.83f, 12.06f, 13.34f);
        pathBuilderD.moveTo(15.54f, 8.46f);
        pathBuilderD.curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f);
        pathBuilderD.verticalLineTo(5.0f);
        pathBuilderD.lineTo(9.11f, 7.83f);
        pathBuilderD.lineToRelative(2.83f, 2.83f);
        pathBuilderD.verticalLineTo(8.51f);
        pathBuilderD.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        pathBuilderD.curveToRelative(0.9f, 0.0f, 1.79f, 0.34f, 2.48f, 1.02f);
        pathBuilderD.curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f);
        pathBuilderD.lineToRelative(1.1f, 1.1f);
        pathBuilderD.curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(12.0f, 4.0f);
        pathBuilderD2.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilderD2.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilderD2.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderD2.reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f);
        pathBuilderD2.moveTo(12.0f, 2.0f);
        pathBuilderD2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD2, 12.0f, 2.0f, 12.06f, 13.34f);
        pathBuilderD2.verticalLineToRelative(2.14f);
        pathBuilderD2.curveToRelative(-0.92f, 0.02f, -1.84f, -0.31f, -2.54f, -1.01f);
        pathBuilderD2.curveToRelative(-1.12f, -1.12f, -1.3f, -2.8f, -0.59f, -4.13f);
        pathBuilderD2.lineToRelative(-1.1f, -1.1f);
        pathBuilderD2.curveToRelative(-1.28f, 1.94f, -1.07f, 4.59f, 0.64f, 6.29f);
        pathBuilderD2.curveTo(9.44f, 16.51f, 10.72f, 17.0f, 12.0f, 17.0f);
        pathBuilderD2.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        pathBuilderD2.verticalLineTo(19.0f);
        s.r(pathBuilderD2, 2.83f, -2.83f, 12.06f, 13.34f);
        pathBuilderD2.moveTo(15.54f, 8.46f);
        pathBuilderD2.curveToRelative(-0.99f, -0.99f, -2.3f, -1.46f, -3.6f, -1.45f);
        pathBuilderD2.verticalLineTo(5.0f);
        pathBuilderD2.lineTo(9.11f, 7.83f);
        pathBuilderD2.lineToRelative(2.83f, 2.83f);
        pathBuilderD2.verticalLineTo(8.51f);
        pathBuilderD2.curveToRelative(0.02f, 0.0f, 0.04f, 0.0f, 0.06f, 0.0f);
        pathBuilderD2.curveToRelative(0.9f, 0.0f, 1.79f, 0.34f, 2.48f, 1.02f);
        pathBuilderD2.curveToRelative(1.12f, 1.12f, 1.3f, 2.8f, 0.59f, 4.13f);
        pathBuilderD2.lineToRelative(1.1f, 1.1f);
        pathBuilderD2.curveTo(17.45f, 12.82f, 17.24f, 10.17f, 15.54f, 8.46f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _changeCircle = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
