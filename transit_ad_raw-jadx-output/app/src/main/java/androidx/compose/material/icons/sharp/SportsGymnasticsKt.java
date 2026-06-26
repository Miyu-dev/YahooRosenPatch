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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SportsGymnastics.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsGymnastics", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsGymnastics", "Landroidx/compose/material/icons/Icons$Sharp;", "getSportsGymnastics", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsGymnasticsKt {
    private static ImageVector _sportsGymnastics;

    public static final ImageVector getSportsGymnastics(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _sportsGymnastics;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SportsGymnastics", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.0f, 6.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(7.1f, 8.0f, 6.0f, 8.0f);
        pathBuilderD.reflectiveCurveTo(4.0f, 7.1f, 4.0f, 6.0f);
        androidx.compose.animation.a.j(pathBuilderD, 1.0f, 9.0f, 6.0f);
        pathBuilderD.lineToRelative(7.0f, -5.0f);
        pathBuilderD.lineToRelative(1.31f, 1.52f);
        pathBuilderD.lineTo(11.14f, 8.5f);
        pathBuilderD.horizontalLineTo(14.0f);
        pathBuilderD.lineTo(21.8f, 4.0f);
        pathBuilderD.lineTo(23.0f, 5.4f);
        pathBuilderD.lineTo(14.5f, 12.0f);
        pathBuilderD.lineTo(14.0f, 22.0f);
        pathBuilderD.horizontalLineToRelative(-2.0f);
        pathBuilderD.lineToRelative(-0.5f, -10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, c.e(pathBuilderD, 8.0f, 11.0f, 1.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsGymnastics = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
