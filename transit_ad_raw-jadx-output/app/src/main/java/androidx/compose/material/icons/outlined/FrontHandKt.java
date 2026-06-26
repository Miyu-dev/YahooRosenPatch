package androidx.compose.material.icons.outlined;

import a6.h;
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

/* JADX INFO: compiled from: FrontHand.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_frontHand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FrontHand", "Landroidx/compose/material/icons/Icons$Outlined;", "getFrontHand", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FrontHandKt {
    private static ImageVector _frontHand;

    public static final ImageVector getFrontHand(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _frontHand;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FrontHand", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.5f, 8.0f);
        pathBuilderD.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        pathBuilderD.verticalLineTo(4.5f);
        pathBuilderD.curveTo(18.0f, 3.12f, 16.88f, 2.0f, 15.5f, 2.0f);
        pathBuilderD.curveToRelative(-0.19f, 0.0f, -0.37f, 0.02f, -0.54f, 0.06f);
        pathBuilderD.curveTo(14.75f, 0.89f, 13.73f, 0.0f, 12.5f, 0.0f);
        pathBuilderD.curveToRelative(-1.06f, 0.0f, -1.96f, 0.66f, -2.33f, 1.59f);
        pathBuilderD.curveTo(9.96f, 1.53f, 9.73f, 1.5f, 9.5f, 1.5f);
        pathBuilderD.curveTo(8.12f, 1.5f, 7.0f, 2.62f, 7.0f, 4.0f);
        pathBuilderD.verticalLineToRelative(0.55f);
        pathBuilderD.curveTo(6.84f, 4.52f, 6.67f, 4.5f, 6.5f, 4.5f);
        pathBuilderD.curveTo(5.12f, 4.5f, 4.0f, 5.62f, 4.0f, 7.0f);
        pathBuilderD.verticalLineToRelative(8.5f);
        pathBuilderD.curveToRelative(0.0f, 4.69f, 3.81f, 8.5f, 8.5f, 8.5f);
        pathBuilderD.reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f);
        pathBuilderD.verticalLineToRelative(-5.0f);
        pathBuilderD.curveTo(21.0f, 9.12f, 19.88f, 8.0f, 18.5f, 8.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 15.5f);
        pathBuilderD.curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f);
        pathBuilderD.reflectiveCurveTo(6.0f, 19.09f, 6.0f, 15.5f);
        pathBuilderD.verticalLineTo(7.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.reflectiveCurveTo(7.0f, 6.72f, 7.0f, 7.0f);
        s.l(pathBuilderD, 5.0f, 2.0f, 4.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.reflectiveCurveTo(10.0f, 3.72f, 10.0f, 4.0f);
        s.l(pathBuilderD, 7.0f, 2.0f, 2.5f);
        pathBuilderD.curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f);
        pathBuilderD.reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f);
        h.w(pathBuilderD, 11.0f, 2.0f, 4.5f);
        pathBuilderD.curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f);
        pathBuilderD.reflectiveCurveTo(16.0f, 4.22f, 16.0f, 4.5f);
        pathBuilderD.verticalLineToRelative(8.92f);
        pathBuilderD.curveToRelative(-1.77f, 0.77f, -3.0f, 2.53f, -3.0f, 4.58f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderD.verticalLineToRelative(-4.5f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _frontHand = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
