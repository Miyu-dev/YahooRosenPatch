package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: Timeline.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_timeline", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Timeline", "Landroidx/compose/material/icons/Icons$Sharp;", "getTimeline", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TimelineKt {
    private static ImageVector _timeline;

    public static final ImageVector getTimeline(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _timeline;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Timeline", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(23.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.curveToRelative(-0.18f, 0.0f, -0.35f, -0.02f, -0.51f, -0.07f);
        pathBuilderD.lineToRelative(-3.56f, 3.55f);
        pathBuilderD.curveTo(16.98f, 13.64f, 17.0f, 13.82f, 17.0f, 14.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.18f, 0.02f, -0.36f, 0.07f, -0.52f);
        pathBuilderD.lineToRelative(-2.55f, -2.55f);
        pathBuilderD.curveTo(10.36f, 10.98f, 10.18f, 11.0f, 10.0f, 11.0f);
        pathBuilderD.curveToRelative(-0.18f, 0.0f, -0.36f, -0.02f, -0.52f, -0.07f);
        pathBuilderD.lineToRelative(-4.55f, 4.56f);
        pathBuilderD.curveTo(4.98f, 15.65f, 5.0f, 15.82f, 5.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.18f, 0.0f, 0.35f, 0.02f, 0.51f, 0.07f);
        pathBuilderD.lineToRelative(4.56f, -4.55f);
        pathBuilderD.curveTo(8.02f, 9.36f, 8.0f, 9.18f, 8.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.18f, -0.02f, 0.36f, -0.07f, 0.52f);
        pathBuilderD.lineToRelative(2.55f, 2.55f);
        pathBuilderD.curveTo(14.64f, 12.02f, 14.82f, 12.0f, 15.0f, 12.0f);
        pathBuilderD.curveToRelative(0.18f, 0.0f, 0.36f, 0.02f, 0.52f, 0.07f);
        pathBuilderD.lineToRelative(3.55f, -3.56f);
        pathBuilderD.curveTo(19.02f, 8.35f, 19.0f, 8.18f, 19.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(23.0f, 6.9f, 23.0f, 8.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(23.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.curveToRelative(-0.18f, 0.0f, -0.35f, -0.02f, -0.51f, -0.07f);
        pathBuilderD.lineToRelative(-3.56f, 3.55f);
        pathBuilderD.curveTo(16.98f, 13.64f, 17.0f, 13.82f, 17.0f, 14.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.18f, 0.02f, -0.36f, 0.07f, -0.52f);
        pathBuilderD.lineToRelative(-2.55f, -2.55f);
        pathBuilderD.curveTo(10.36f, 10.98f, 10.18f, 11.0f, 10.0f, 11.0f);
        pathBuilderD.curveToRelative(-0.18f, 0.0f, -0.36f, -0.02f, -0.52f, -0.07f);
        pathBuilderD.lineToRelative(-4.55f, 4.56f);
        pathBuilderD.curveTo(4.98f, 15.65f, 5.0f, 15.82f, 5.0f, 16.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.18f, 0.0f, 0.35f, 0.02f, 0.51f, 0.07f);
        pathBuilderD.lineToRelative(4.56f, -4.55f);
        pathBuilderD.curveTo(8.02f, 9.36f, 8.0f, 9.18f, 8.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.18f, -0.02f, 0.36f, -0.07f, 0.52f);
        pathBuilderD.lineToRelative(2.55f, 2.55f);
        pathBuilderD.curveTo(14.64f, 12.02f, 14.82f, 12.0f, 15.0f, 12.0f);
        pathBuilderD.curveToRelative(0.18f, 0.0f, 0.36f, 0.02f, 0.52f, 0.07f);
        pathBuilderD.lineToRelative(3.55f, -3.56f);
        pathBuilderD.curveTo(19.02f, 8.35f, 19.0f, 8.18f, 19.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 23.0f, 6.9f, 23.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timeline = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
