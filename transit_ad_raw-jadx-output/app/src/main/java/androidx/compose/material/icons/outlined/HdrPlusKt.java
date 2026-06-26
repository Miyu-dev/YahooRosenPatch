package androidx.compose.material.icons.outlined;

import a.b;
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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: HdrPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_hdrPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HdrPlus", "Landroidx/compose/material/icons/Icons$Outlined;", "getHdrPlus", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HdrPlusKt {
    private static ImageVector _hdrPlus;

    public static final ImageVector getHdrPlus(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _hdrPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HdrPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.13f, 19.0f);
        pathBuilderD.curveToRelative(1.15f, 0.64f, 2.47f, 1.0f, 3.87f, 1.0f);
        pathBuilderD.curveToRelative(4.41f, 0.0f, 8.0f, -3.59f, 8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilderD.reflectiveCurveToRelative(-8.0f, 3.59f, -8.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, 2.52f, 1.17f, 4.77f, 3.0f, 6.24f);
        pathBuilderD.verticalLineTo(13.0f);
        pathBuilderD.horizontalLineToRelative(3.5f);
        pathBuilderD.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f);
        pathBuilderD.lineTo(12.0f, 19.0f);
        androidx.compose.animation.a.C(pathBuilderD, -1.5f, -0.9f, -2.0f, 8.5f);
        h.z(pathBuilderD, 2.0f, 8.13f, 12.0f, 2.0f);
        pathBuilderD.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f);
        pathBuilderD.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f);
        a.q(pathBuilderD, 17.5f, 16.0f, 16.0f, 1.5f);
        b.C(pathBuilderD, -1.5f, 16.0f, 13.0f, -1.5f);
        b.C(pathBuilderD, 1.5f, 13.0f, 16.0f, 1.49f);
        b.m(pathBuilderD, 1.5f, 16.0f, 10.5f, 15.5f);
        androidx.appcompat.view.menu.a.u(pathBuilderD, -1.0f, -2.0f, 1.0f, 10.5f);
        androidx.appcompat.app.m.t(pathBuilderD, 10.5f, 8.0f, 6.0f, 12.0f);
        androidx.compose.animation.b.u(pathBuilderD, 6.0f, -1.5f, 9.5f, -2.0f);
        c.g(pathBuilderD, 12.0f, 7.0f, 6.0f, 1.5f);
        h.z(pathBuilderD, 2.0f, 10.5f, 16.0f, 6.0f);
        pathBuilderD.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f);
        b.w(pathBuilderD, -3.0f, 6.0f, 16.0f);
        b.y(pathBuilderD, 16.0f, 10.5f, -3.0f, -1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.m(pathBuilderD, 3.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
