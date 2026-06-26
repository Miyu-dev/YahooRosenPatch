package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.compose.animation.b;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wifiProtectedSetup", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WifiProtectedSetup", "Landroidx/compose/material/icons/Icons$Rounded;", "getWifiProtectedSetup", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WifiProtectedSetupKt {
    private static ImageVector _wifiProtectedSetup;

    public static final ImageVector getWifiProtectedSetup(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _wifiProtectedSetup;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WifiProtectedSetup", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(16.7f, 5.3f, 1.44f, -1.44f);
        pathBuilderA.curveToRelative(0.32f, -0.32f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilderA.horizontalLineTo(11.5f);
        pathBuilderA.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderA.verticalLineTo(9.8f);
        pathBuilderA.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilderA.lineToRelative(1.45f, -1.45f);
        pathBuilderA.curveToRelative(1.97f, 1.46f, 3.25f, 3.78f, 3.25f, 6.42f);
        pathBuilderA.curveToRelative(0.0f, 0.66f, -0.08f, 1.31f, -0.24f, 1.92f);
        pathBuilderA.curveToRelative(-0.12f, 0.5f, 0.48f, 0.86f, 0.84f, 0.49f);
        pathBuilderA.curveToRelative(1.48f, -1.53f, 2.4f, -3.61f, 2.4f, -5.91f);
        pathBuilderA.curveTo(19.55f, 9.11f, 18.44f, 6.86f, 16.7f, 5.3f);
        pathBuilderA.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = a.b.a(12.15f, 13.86f, 10.7f, 15.3f);
        pathBuilderA2.curveToRelative(-1.97f, -1.46f, -3.25f, -3.78f, -3.25f, -6.42f);
        pathBuilderA2.curveToRelative(0.0f, -0.66f, 0.08f, -1.31f, 0.24f, -1.92f);
        pathBuilderA2.curveToRelative(0.12f, -0.5f, -0.48f, -0.86f, -0.84f, -0.49f);
        pathBuilderA2.curveToRelative(-1.48f, 1.53f, -2.4f, 3.61f, -2.4f, 5.91f);
        pathBuilderA2.curveToRelative(0.0f, 2.52f, 1.1f, 4.77f, 2.84f, 6.33f);
        pathBuilderA2.lineToRelative(-1.44f, 1.44f);
        pathBuilderA2.curveToRelative(-0.32f, 0.32f, -0.09f, 0.85f, 0.35f, 0.85f);
        pathBuilderA2.horizontalLineToRelative(6.29f);
        pathBuilderA2.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderA2.verticalLineToRelative(-6.29f);
        pathBuilderA2.curveTo(13.0f, 13.77f, 12.46f, 13.54f, 12.15f, 13.86f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifiProtectedSetup = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
