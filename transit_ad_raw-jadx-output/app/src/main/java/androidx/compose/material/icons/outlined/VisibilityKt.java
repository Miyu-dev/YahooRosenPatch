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

/* JADX INFO: compiled from: Visibility.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_visibility", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Visibility", "Landroidx/compose/material/icons/Icons$Outlined;", "getVisibility", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VisibilityKt {
    private static ImageVector _visibility;

    public static final ImageVector getVisibility(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _visibility;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Visibility", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 6.0f);
        pathBuilderD.curveToRelative(3.79f, 0.0f, 7.17f, 2.13f, 8.82f, 5.5f);
        pathBuilderD.curveTo(19.17f, 14.87f, 15.79f, 17.0f, 12.0f, 17.0f);
        pathBuilderD.reflectiveCurveToRelative(-7.17f, -2.13f, -8.82f, -5.5f);
        pathBuilderD.curveTo(4.83f, 8.13f, 8.21f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.moveToRelative(0.0f, -2.0f);
        pathBuilderD.curveTo(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
        pathBuilderD.curveTo(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        pathBuilderD.reflectiveCurveToRelative(9.27f, -3.11f, 11.0f, -7.5f);
        pathBuilderD.curveTo(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 9.0f);
        pathBuilderD.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderD.reflectiveCurveTo(13.38f, 14.0f, 12.0f, 14.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilderD.reflectiveCurveTo(10.62f, 9.0f, 12.0f, 9.0f);
        pathBuilderD.moveToRelative(0.0f, -2.0f);
        pathBuilderD.curveToRelative(-2.48f, 0.0f, -4.5f, 2.02f, -4.5f, 4.5f);
        pathBuilderD.reflectiveCurveTo(9.52f, 16.0f, 12.0f, 16.0f);
        pathBuilderD.reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 14.48f, 7.0f, 12.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _visibility = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
