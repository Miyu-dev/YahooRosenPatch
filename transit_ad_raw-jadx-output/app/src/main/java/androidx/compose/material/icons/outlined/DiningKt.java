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
import c.h;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Dining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Dining", "Landroidx/compose/material/icons/Icons$Outlined;", "getDining", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DiningKt {
    private static ImageVector _dining;

    public static final ImageVector getDining(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _dining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Dining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.75f, 6.0f);
        pathBuilderD.curveToRelative(-1.37f, 0.0f, -2.5f, 1.52f, -2.5f, 3.4f);
        pathBuilderD.curveToRelative(0.0f, 1.48f, 0.7f, 2.71f, 1.67f, 3.18f);
        androidx.appcompat.app.m.r(pathBuilderD, 14.0f, 12.62f, 19.0f, 1.5f);
        pathBuilderD.verticalLineToRelative(-6.38f);
        pathBuilderD.lineToRelative(0.08f, -0.03f);
        pathBuilderD.curveToRelative(0.97f, -0.47f, 1.67f, -1.7f, 1.67f, -3.18f);
        pathBuilderD.curveTo(17.25f, 7.53f, 16.13f, 6.0f, 14.75f, 6.0f);
        pathBuilderD.moveTo(6.5f, 9.96f);
        pathBuilderD.moveTo(10.5f, 6.0f);
        pathBuilderD.curveTo(10.23f, 6.0f, 10.0f, 6.22f, 10.0f, 6.5f);
        h.d(pathBuilderD, 9.0f, 9.25f, 6.5f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderD.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        h.d(pathBuilderD, 9.0f, 7.5f, 6.5f);
        pathBuilderD.curveTo(7.5f, 6.22f, 7.28f, 6.0f, 7.0f, 6.0f);
        pathBuilderD.reflectiveCurveTo(6.5f, 6.22f, 6.5f, 6.5f);
        pathBuilderD.verticalLineToRelative(3.8f);
        pathBuilderD.curveToRelative(0.0f, 0.93f, 0.64f, 1.71f, 1.5f, 1.93f);
        v.r(pathBuilderD, 19.0f, 1.5f, -6.77f);
        pathBuilderD.curveToRelative(0.86f, -0.22f, 1.5f, -1.0f, 1.5f, -1.93f);
        pathBuilderD.verticalLineTo(6.5f);
        pathBuilderD.curveTo(11.0f, 6.22f, 10.78f, 6.0f, 10.5f, 6.0f);
        a.q(pathBuilderD, 20.0f, 4.0f, 4.0f, 16.0f);
        pathBuilderD.horizontalLineToRelative(16.0f);
        pathBuilderD.verticalLineTo(4.0f);
        pathBuilderD.moveTo(20.0f, 2.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.verticalLineToRelative(16.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.verticalLineTo(4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderD, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
