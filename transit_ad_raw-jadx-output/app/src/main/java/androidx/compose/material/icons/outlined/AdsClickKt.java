package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: AdsClick.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_adsClick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AdsClick", "Landroidx/compose/material/icons/Icons$Outlined;", "getAdsClick", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AdsClickKt {
    private static ImageVector _adsClick;

    public static final ImageVector getAdsClick(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _adsClick;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AdsClick", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(11.71f, 17.99f);
        pathBuilderD.curveTo(8.53f, 17.84f, 6.0f, 15.22f, 6.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilderD.curveToRelative(3.22f, 0.0f, 5.84f, 2.53f, 5.99f, 5.71f);
        pathBuilderD.lineToRelative(-2.1f, -0.63f);
        pathBuilderD.curveTo(15.48f, 9.31f, 13.89f, 8.0f, 12.0f, 8.0f);
        pathBuilderD.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, 1.89f, 1.31f, 3.48f, 3.08f, 3.89f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 11.71f, 17.99f, 22.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.3f, -0.01f, 0.6f, -0.04f, 0.9f);
        pathBuilderD.lineToRelative(-1.97f, -0.59f);
        pathBuilderD.curveTo(20.0f, 12.21f, 20.0f, 12.1f, 20.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilderD.curveToRelative(0.1f, 0.0f, 0.21f, 0.0f, 0.31f, -0.01f);
        pathBuilderD.lineToRelative(0.59f, 1.97f);
        pathBuilderD.curveTo(12.6f, 21.99f, 12.3f, 22.0f, 12.0f, 22.0f);
        pathBuilderD.curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilderD.curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(22.0f, 6.48f, 22.0f, 12.0f);
        androidx.compose.animation.a.t(pathBuilderD, 18.23f, 16.26f, 22.0f, 15.0f);
        pathBuilderD.lineToRelative(-10.0f, -3.0f);
        pathBuilderD.lineToRelative(3.0f, 10.0f);
        pathBuilderD.lineToRelative(1.26f, -3.77f);
        pathBuilderD.lineToRelative(4.27f, 4.27f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 1.98f, -1.98f, 18.23f, 16.26f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _adsClick = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
