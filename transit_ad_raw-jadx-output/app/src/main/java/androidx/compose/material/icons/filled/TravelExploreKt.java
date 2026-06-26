package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: TravelExplore.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_travelExplore", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TravelExplore", "Landroidx/compose/material/icons/Icons$Filled;", "getTravelExplore", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TravelExploreKt {
    private static ImageVector _travelExplore;

    public static final ImageVector getTravelExplore(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _travelExplore;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TravelExplore", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.3f, 16.9f);
        pathBuilderD.curveToRelative(0.4f, -0.7f, 0.7f, -1.5f, 0.7f, -2.4f);
        pathBuilderD.curveToRelative(0.0f, -2.5f, -2.0f, -4.5f, -4.5f, -4.5f);
        pathBuilderD.reflectiveCurveTo(11.0f, 12.0f, 11.0f, 14.5f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 4.5f, 4.5f, 4.5f);
        pathBuilderD.curveToRelative(0.9f, 0.0f, 1.7f, -0.3f, 2.4f, -0.7f);
        pathBuilderD.lineToRelative(3.2f, 3.2f);
        s.r(pathBuilderD, 1.4f, -1.4f, 19.3f, 16.9f);
        pathBuilderD.moveTo(15.5f, 17.0f);
        pathBuilderD.curveToRelative(-1.4f, 0.0f, -2.5f, -1.1f, -2.5f, -2.5f);
        pathBuilderD.reflectiveCurveToRelative(1.1f, -2.5f, 2.5f, -2.5f);
        pathBuilderD.reflectiveCurveToRelative(2.5f, 1.1f, 2.5f, 2.5f);
        pathBuilderD.reflectiveCurveTo(16.9f, 17.0f, 15.5f, 17.0f);
        androidx.compose.animation.a.n(pathBuilderD, 12.0f, 20.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilderD.curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.curveToRelative(4.84f, 0.0f, 8.87f, 3.44f, 9.8f, 8.0f);
        pathBuilderD.horizontalLineToRelative(-2.07f);
        pathBuilderD.curveToRelative(-0.64f, -2.46f, -2.4f, -4.47f, -4.73f, -5.41f);
        pathBuilderD.verticalLineTo(5.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(-2.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.B(pathBuilderD, 8.0f, 2.0f, 2.0f, 3.0f);
        pathBuilderD.horizontalLineTo(9.0f);
        pathBuilderD.lineToRelative(-4.79f, -4.79f);
        pathBuilderD.curveTo(4.08f, 10.79f, 4.0f, 11.38f, 4.0f, 12.0f);
        pathBuilderD.curveTo(4.0f, 16.41f, 7.59f, 20.0f, 12.0f, 20.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _travelExplore = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
