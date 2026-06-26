package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: Air.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_air", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Air", "Landroidx/compose/material/icons/Icons$Filled;", "getAir", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AirKt {
    private static ImageVector _air;

    public static final ImageVector getAir(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _air;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Air", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.5f, 17.0f);
        pathBuilderD.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        androidx.compose.animation.a.s(pathBuilderD, 2.0f, -2.0f, 9.5f);
        pathBuilderD.curveTo(13.15f, 14.0f, 14.5f, 15.35f, 14.5f, 17.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 6.5f);
        pathBuilderD.curveTo(19.0f, 4.57f, 17.43f, 3.0f, 15.5f, 3.0f);
        pathBuilderD.reflectiveCurveTo(12.0f, 4.57f, 12.0f, 6.5f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.curveTo(14.0f, 5.67f, 14.67f, 5.0f, 15.5f, 5.0f);
        pathBuilderD.reflectiveCurveTo(17.0f, 5.67f, 17.0f, 6.5f);
        pathBuilderD.reflectiveCurveTo(16.33f, 8.0f, 15.5f, 8.0f);
        androidx.compose.animation.a.s(pathBuilderD, 2.0f, 2.0f, 13.5f);
        pathBuilderD.curveTo(17.43f, 10.0f, 19.0f, 8.43f, 19.0f, 6.5f);
        a.q(pathBuilderD, 18.5f, 11.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(16.5f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(19.33f, 16.0f, 18.5f, 16.0f);
        pathBuilderD.verticalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 20.43f, 11.0f, 18.5f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _air = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
