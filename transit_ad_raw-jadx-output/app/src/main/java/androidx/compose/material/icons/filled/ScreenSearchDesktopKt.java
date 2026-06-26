package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: ScreenSearchDesktop.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_screenSearchDesktop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScreenSearchDesktop", "Landroidx/compose/material/icons/Icons$Filled;", "getScreenSearchDesktop", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScreenSearchDesktopKt {
    private static ImageVector _screenSearchDesktop;

    public static final ImageVector getScreenSearchDesktop(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _screenSearchDesktop;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ScreenSearchDesktop", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.0f, 18.0f);
        pathBuilderD.curveTo(21.1f, 18.0f, 21.99f, 17.1f, 21.99f, 16.0f);
        pathBuilderD.lineTo(22.0f, 6.0f);
        pathBuilderD.curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilderD.lineTo(4.0f, 4.0f);
        pathBuilderD.curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f);
        pathBuilderD.lineTo(2.0f, 16.0f);
        pathBuilderD.curveTo(2.0f, 17.1f, 2.89f, 18.0f, 4.0f, 18.0f);
        pathBuilderD.lineTo(0.0f, 18.0f);
        pathBuilderD.lineTo(0.0f, 20.0f);
        pathBuilderD.lineTo(24.0f, 20.0f);
        android.support.v4.media.a.C(pathBuilderD, 24.0f, 18.0f, 20.0f, 18.0f);
        pathBuilderD.moveTo(4.0f, 16.0f);
        pathBuilderD.lineTo(4.0f, 6.0f);
        pathBuilderD.lineTo(20.0f, 6.0f);
        pathBuilderD.lineTo(20.0f, 16.0f);
        android.support.v4.media.a.C(pathBuilderD, 20.0f, 16.01f, 4.0f, 16.0f);
        pathBuilderD.moveTo(9.097f, 9.953f);
        pathBuilderD.curveTo(9.097f, 8.926f, 9.933f, 8.089f, 10.961f, 8.089f);
        pathBuilderD.curveTo(11.988f, 8.089f, 12.825f, 8.926f, 12.825f, 9.953f);
        pathBuilderD.curveTo(12.825f, 10.98f, 11.988f, 11.817f, 10.961f, 11.817f);
        pathBuilderD.curveTo(9.933f, 11.817f, 9.097f, 10.98f, 9.097f, 9.953f);
        androidx.compose.animation.a.t(pathBuilderD, 16.129f, 14.189f, 13.647f, 11.707f);
        pathBuilderD.curveTo(13.978f, 11.202f, 14.174f, 10.6f, 14.174f, 9.953f);
        pathBuilderD.curveTo(14.174f, 8.181f, 12.733f, 6.74f, 10.961f, 6.74f);
        pathBuilderD.curveTo(9.189f, 6.74f, 7.747f, 8.181f, 7.747f, 9.953f);
        pathBuilderD.curveTo(7.747f, 11.725f, 9.189f, 13.167f, 10.961f, 13.167f);
        pathBuilderD.curveTo(11.597f, 13.167f, 12.186f, 12.975f, 12.685f, 12.656f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 15.174f, 15.144f, 16.129f, 14.189f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenSearchDesktop = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
