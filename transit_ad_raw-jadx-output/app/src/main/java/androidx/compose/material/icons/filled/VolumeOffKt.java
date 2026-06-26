package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: VolumeOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_volumeOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VolumeOff", "Landroidx/compose/material/icons/Icons$Filled;", "getVolumeOff", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VolumeOffKt {
    private static ImageVector _volumeOff;

    public static final ImageVector getVolumeOff(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _volumeOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.VolumeOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.5f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
        pathBuilderD.verticalLineToRelative(2.21f);
        pathBuilderD.lineToRelative(2.45f, 2.45f);
        pathBuilderD.curveToRelative(0.03f, -0.2f, 0.05f, -0.41f, 0.05f, -0.63f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.94f, -0.2f, 1.82f, -0.54f, 2.64f);
        pathBuilderD.lineToRelative(1.51f, 1.51f);
        pathBuilderD.curveTo(20.63f, 14.91f, 21.0f, 13.5f, 21.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -4.28f, -2.99f, -7.86f, -7.0f, -8.77f);
        pathBuilderD.verticalLineToRelative(2.06f);
        pathBuilderD.curveToRelative(2.89f, 0.86f, 5.0f, 3.54f, 5.0f, 6.71f);
        androidx.compose.animation.a.t(pathBuilderD, 4.27f, 3.0f, 3.0f, 4.27f);
        pathBuilderD.lineTo(7.73f, 9.0f);
        b.s(pathBuilderD, 3.0f, 9.0f, 6.0f, 4.0f);
        pathBuilderD.lineToRelative(5.0f, 5.0f);
        pathBuilderD.verticalLineToRelative(-6.73f);
        pathBuilderD.lineToRelative(4.25f, 4.25f);
        pathBuilderD.curveToRelative(-0.67f, 0.52f, -1.42f, 0.93f, -2.25f, 1.18f);
        pathBuilderD.verticalLineToRelative(2.06f);
        pathBuilderD.curveToRelative(1.38f, -0.31f, 2.63f, -0.95f, 3.69f, -1.81f);
        pathBuilderD.lineTo(19.73f, 21.0f);
        pathBuilderD.lineTo(21.0f, 19.73f);
        s.r(pathBuilderD, -9.0f, -9.0f, 4.27f, 3.0f);
        pathBuilderD.moveTo(12.0f, 4.0f);
        pathBuilderD.lineTo(9.91f, 6.09f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderD, 12.0f, 8.18f, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _volumeOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
