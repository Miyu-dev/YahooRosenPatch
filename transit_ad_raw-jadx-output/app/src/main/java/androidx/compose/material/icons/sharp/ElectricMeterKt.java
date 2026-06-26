package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: ElectricMeter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_electricMeter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ElectricMeter", "Landroidx/compose/material/icons/Icons$Sharp;", "getElectricMeter", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ElectricMeterKt {
    private static ImageVector _electricMeter;

    public static final ImageVector getElectricMeter(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _electricMeter;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ElectricMeter", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveToRelative(-4.96f, 0.0f, -9.0f, 4.04f, -9.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, 3.91f, 2.51f, 7.24f, 6.0f, 8.47f);
        v.r(pathBuilderD, 22.0f, 2.0f, -2.06f);
        pathBuilderD.curveToRelative(0.33f, 0.04f, 0.66f, 0.06f, 1.0f, 0.06f);
        pathBuilderD.reflectiveCurveToRelative(0.67f, -0.02f, 1.0f, -0.06f);
        v.r(pathBuilderD, 22.0f, 2.0f, -2.53f);
        pathBuilderD.curveToRelative(3.49f, -1.24f, 6.0f, -4.57f, 6.0f, -8.47f);
        pathBuilderD.curveTo(21.0f, 6.04f, 16.96f, 2.0f, 12.0f, 2.0f);
        a.y(pathBuilderD, 14.25f, 14.0f, -3.0f, 3.0f);
        pathBuilderD.lineToRelative(-1.5f, -1.5f);
        pathBuilderD.lineTo(11.0f, 14.25f);
        pathBuilderD.lineTo(9.75f, 13.0f);
        pathBuilderD.lineToRelative(3.0f, -3.0f);
        pathBuilderD.lineToRelative(1.5f, 1.5f);
        android.support.v4.media.a.C(pathBuilderD, 13.0f, 12.75f, 14.25f, 14.0f);
        android.support.v4.media.a.B(pathBuilderD, 16.0f, 9.0f, 8.0f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderD, 8.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricMeter = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
