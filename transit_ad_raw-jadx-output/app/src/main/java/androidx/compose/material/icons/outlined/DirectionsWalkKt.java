package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: DirectionsWalk.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_directionsWalk", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirectionsWalk", "Landroidx/compose/material/icons/Icons$Outlined;", "getDirectionsWalk", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DirectionsWalkKt {
    private static ImageVector _directionsWalk;

    public static final ImageVector getDirectionsWalk(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _directionsWalk;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DirectionsWalk", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.5f, 5.5f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        androidx.compose.animation.a.t(pathBuilderD, 9.8f, 8.9f, 7.0f, 23.0f);
        pathBuilderD.horizontalLineToRelative(2.1f);
        pathBuilderD.lineToRelative(1.8f, -8.0f);
        v.u(pathBuilderD, 2.1f, 2.0f, 6.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(-7.5f);
        pathBuilderD.lineToRelative(-2.1f, -2.0f);
        pathBuilderD.lineToRelative(0.6f, -3.0f);
        pathBuilderD.curveTo(14.8f, 12.0f, 16.8f, 13.0f, 19.0f, 13.0f);
        pathBuilderD.verticalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(-1.9f, 0.0f, -3.5f, -1.0f, -4.3f, -2.4f);
        pathBuilderD.lineToRelative(-1.0f, -1.6f);
        pathBuilderD.curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.65f, -0.84f);
        androidx.appcompat.app.m.r(pathBuilderD, 6.0f, 8.3f, 13.0f, 2.0f);
        pathBuilderD.verticalLineTo(9.6f);
        pathBuilderD.lineToRelative(1.8f, -0.7f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsWalk = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
