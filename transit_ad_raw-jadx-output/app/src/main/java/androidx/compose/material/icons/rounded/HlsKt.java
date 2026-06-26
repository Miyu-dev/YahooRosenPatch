package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: Hls.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hls", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Hls", "Landroidx/compose/material/icons/Icons$Rounded;", "getHls", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HlsKt {
    private static ImageVector _hls;

    public static final ImageVector getHls(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _hls;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hls", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.75f, 9.0f);
        pathBuilderD.curveTo(10.34f, 9.0f, 10.0f, 9.34f, 10.0f, 9.75f);
        pathBuilderD.verticalLineTo(14.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(2.25f);
        pathBuilderD.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderD.reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilderD.horizontalLineTo(11.5f);
        pathBuilderD.verticalLineTo(9.75f);
        pathBuilderD.curveTo(11.5f, 9.34f, 11.16f, 9.0f, 10.75f, 9.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.04f, 10.5f);
        pathBuilderD.curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f);
        pathBuilderD.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilderD.verticalLineTo(10.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(-3.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(1.5f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.B(pathBuilderD, 19.0f, 1.0f, -2.04f, 0.0f);
        pathBuilderD.curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f);
        pathBuilderD.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilderD.verticalLineTo(14.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-1.5f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineTo(17.0f);
        pathBuilderD.verticalLineToRelative(-1.0f);
        pathBuilderD.lineTo(19.04f, 10.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.0f, 9.75f);
        pathBuilderD.curveTo(8.0f, 9.34f, 7.66f, 9.0f, 7.25f, 9.0f);
        pathBuilderD.reflectiveCurveTo(6.5f, 9.34f, 6.5f, 9.75f);
        h.w(pathBuilderD, 11.0f, -2.0f, 9.75f);
        pathBuilderD.curveTo(4.5f, 9.34f, 4.16f, 9.0f, 3.75f, 9.0f);
        pathBuilderD.reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f);
        pathBuilderD.verticalLineToRelative(4.5f);
        pathBuilderD.curveTo(3.0f, 14.66f, 3.34f, 15.0f, 3.75f, 15.0f);
        pathBuilderD.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        v.r(pathBuilderD, 12.5f, 2.0f, 1.75f);
        pathBuilderD.curveTo(6.5f, 14.66f, 6.84f, 15.0f, 7.25f, 15.0f);
        pathBuilderD.reflectiveCurveTo(8.0f, 14.66f, 8.0f, 14.25f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 9.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hls = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
