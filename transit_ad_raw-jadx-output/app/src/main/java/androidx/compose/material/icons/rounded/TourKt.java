package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Tour.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tour", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tour", "Landroidx/compose/material/icons/Icons$Rounded;", "getTour", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TourKt {
    private static ImageVector _tour;

    public static final ImageVector getTour(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _tour;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Tour", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.45f, 5.37f);
        pathBuilderD.curveTo(20.71f, 4.71f, 20.23f, 4.0f, 19.52f, 4.0f);
        pathBuilderD.horizontalLineTo(13.0f);
        pathBuilderD.horizontalLineToRelative(-1.0f);
        pathBuilderD.horizontalLineTo(7.0f);
        pathBuilderD.verticalLineTo(3.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveTo(5.45f, 2.0f, 5.0f, 2.45f, 5.0f, 3.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.verticalLineToRelative(10.0f);
        pathBuilderD.verticalLineToRelative(8.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.verticalLineToRelative(-8.0f);
        pathBuilderD.horizontalLineToRelative(4.0f);
        pathBuilderD.horizontalLineToRelative(1.0f);
        pathBuilderD.horizontalLineToRelative(7.52f);
        pathBuilderD.curveToRelative(0.71f, 0.0f, 1.19f, -0.71f, 0.93f, -1.37f);
        android.support.v4.media.a.C(pathBuilderD, 19.0f, 9.0f, 20.45f, 5.37f);
        pathBuilderD.moveTo(15.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 15.0f, 7.9f, 15.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tour = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
