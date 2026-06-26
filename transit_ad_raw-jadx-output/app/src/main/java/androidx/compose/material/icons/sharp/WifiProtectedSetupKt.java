package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: WifiProtectedSetup.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiProtectedSetup", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiProtectedSetup", "Landroidx/compose/material/icons/Icons$Sharp;", "getWifiProtectedSetup", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WifiProtectedSetupKt {
    private static ImageVector _wifiProtectedSetup;

    public static final ImageVector getWifiProtectedSetup(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _wifiProtectedSetup;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WifiProtectedSetup", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderL = a.l(16.71f, 5.29f, 19.0f, 3.0f, -8.0f);
        pathBuilderL.verticalLineToRelative(8.0f);
        pathBuilderL.lineToRelative(2.3f, -2.3f);
        pathBuilderL.curveToRelative(1.97f, 1.46f, 3.25f, 3.78f, 3.25f, 6.42f);
        pathBuilderL.curveToRelative(0.0f, 1.31f, -0.32f, 2.54f, -0.88f, 3.63f);
        pathBuilderL.curveToRelative(2.33f, -1.52f, 3.88f, -4.14f, 3.88f, -7.13f);
        pathBuilderL.curveTo(19.55f, 9.1f, 18.44f, 6.85f, 16.71f, 5.29f);
        pathBuilderL.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderL.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(7.46f, 8.88f);
        pathBuilderD.curveToRelative(0.0f, -1.31f, 0.32f, -2.54f, 0.88f, -3.63f);
        pathBuilderD.curveTo(6.0f, 6.77f, 4.46f, 9.39f, 4.46f, 12.38f);
        pathBuilderD.curveToRelative(0.0f, 2.52f, 1.1f, 4.77f, 2.84f, 6.33f);
        androidx.compose.animation.a.o(pathBuilderD, 5.0f, 21.0f, 8.0f, -8.0f);
        pathBuilderD.lineToRelative(-2.3f, 2.3f);
        pathBuilderD.curveTo(8.74f, 13.84f, 7.46f, 11.52f, 7.46f, 8.88f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiProtectedSetup = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
