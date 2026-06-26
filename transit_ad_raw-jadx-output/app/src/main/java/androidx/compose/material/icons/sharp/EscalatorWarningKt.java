package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: EscalatorWarning.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_escalatorWarning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EscalatorWarning", "Landroidx/compose/material/icons/Icons$Sharp;", "getEscalatorWarning", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class EscalatorWarningKt {
    private static ImageVector _escalatorWarning;

    public static final ImageVector getEscalatorWarning(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _escalatorWarning;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EscalatorWarning", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.5f, 2.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(5.4f, 2.0f, 6.5f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.5f, 9.5f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(17.83f, 8.0f, 17.0f, 8.0f);
        pathBuilderD.reflectiveCurveTo(15.5f, 8.67f, 15.5f, 9.5f);
        a.y(pathBuilderD, 14.21f, 12.86f, -0.92f, 1.32f);
        pathBuilderD.lineTo(9.72f, 8.0f);
        pathBuilderD.curveTo(9.37f, 7.38f, 8.71f, 7.0f, 7.99f, 7.0f);
        a.B(pathBuilderD, 3.0f, 8.0f, 1.5f, 7.0f);
        pathBuilderD.horizontalLineToRelative(5.0f);
        pathBuilderD.verticalLineTo(11.61f);
        pathBuilderD.lineTo(12.03f, 16.0f);
        androidx.appcompat.graphics.drawable.a.C(pathBuilderD, 2.2f, 15.0f, 14.9f, 22.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 4.0f, -5.0f, 1.0f, -5.0f);
        pathBuilderD.horizontalLineToRelative(-4.15f);
        pathBuilderD.curveTo(15.19f, 12.0f, 14.58f, 12.32f, 14.21f, 12.86f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _escalatorWarning = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
