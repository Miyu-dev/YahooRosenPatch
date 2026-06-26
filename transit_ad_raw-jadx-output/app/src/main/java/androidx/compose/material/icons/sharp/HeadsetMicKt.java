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

/* JADX INFO: compiled from: HeadsetMic.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_headsetMic", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HeadsetMic", "Landroidx/compose/material/icons/Icons$Sharp;", "getHeadsetMic", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HeadsetMicKt {
    private static ImageVector _headsetMic;

    public static final ImageVector getHeadsetMic(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _headsetMic;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HeadsetMic", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(11.4f, 1.02f);
        pathBuilderD.curveTo(6.62f, 1.33f, 3.0f, 5.51f, 3.0f, 10.31f);
        v.C(pathBuilderD, 20.0f, 6.0f, -8.0f, 5.0f);
        pathBuilderD.verticalLineToRelative(-1.71f);
        pathBuilderD.curveTo(5.0f, 6.45f, 7.96f, 3.11f, 11.79f, 3.0f);
        pathBuilderD.curveTo(15.76f, 2.89f, 19.0f, 6.06f, 19.0f, 10.0f);
        a.l(pathBuilderD, 2.0f, -4.0f, 8.0f, 4.0f);
        a.l(pathBuilderD, 1.0f, -7.0f, 2.0f, 9.0f);
        pathBuilderD.verticalLineTo(10.0f);
        pathBuilderD.curveToRelative(0.0f, -5.17f, -4.36f, -9.32f, -9.6f, -8.98f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _headsetMic = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
