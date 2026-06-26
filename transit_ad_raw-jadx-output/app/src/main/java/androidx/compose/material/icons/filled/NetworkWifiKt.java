package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: NetworkWifi.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_networkWifi", "Landroidx/compose/ui/graphics/vector/ImageVector;", "NetworkWifi", "Landroidx/compose/material/icons/Icons$Filled;", "getNetworkWifi", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class NetworkWifiKt {
    private static ImageVector _networkWifi;

    public static final ImageVector getNetworkWifi(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _networkWifi;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NetworkWifi", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(24.0f, 8.98f);
        pathBuilderD.curveTo(20.93f, 5.9f, 16.69f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.curveTo(7.31f, 4.0f, 3.07f, 5.9f, 0.0f, 8.98f);
        pathBuilderD.lineTo(12.0f, 21.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        s.r(pathBuilderD, 0.0f, 0.0f, 24.0f, 8.98f);
        pathBuilderD.moveTo(2.92f, 9.07f);
        pathBuilderD.curveTo(5.51f, 7.08f, 8.67f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f);
        pathBuilderD.lineToRelative(-1.43f, 1.43f);
        pathBuilderD.curveTo(17.5f, 8.94f, 14.86f, 8.0f, 12.0f, 8.0f);
        pathBuilderD.reflectiveCurveToRelative(-5.5f, 0.94f, -7.65f, 2.51f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 2.92f, 9.07f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _networkWifi = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
