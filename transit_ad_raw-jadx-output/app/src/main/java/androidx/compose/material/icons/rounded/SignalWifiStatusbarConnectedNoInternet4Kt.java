package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: SignalWifiStatusbarConnectedNoInternet4.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_signalWifiStatusbarConnectedNoInternet4", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SignalWifiStatusbarConnectedNoInternet4", "Landroidx/compose/material/icons/Icons$Rounded;", "getSignalWifiStatusbarConnectedNoInternet4", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SignalWifiStatusbarConnectedNoInternet4Kt {
    private static ImageVector _signalWifiStatusbarConnectedNoInternet4;

    public static final ImageVector getSignalWifiStatusbarConnectedNoInternet4(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _signalWifiStatusbarConnectedNoInternet4;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SignalWifiStatusbarConnectedNoInternet4", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.appcompat.app.m.f(22.92f, 8.0f, 17.0f, 7.99f);
        pathBuilderF.lineToRelative(-4.29f, 4.3f);
        pathBuilderF.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0.0f);
        pathBuilderF.lineTo(0.73f, 9.71f);
        pathBuilderF.curveTo(0.32f, 9.3f, 0.35f, 8.63f, 0.79f, 8.24f);
        pathBuilderF.curveTo(3.78f, 5.6f, 7.7f, 4.0f, 12.0f, 4.0f);
        pathBuilderF.curveTo(16.16f, 4.0f, 19.97f, 5.51f, 22.92f, 8.0f);
        pathBuilderF.close();
        pathBuilderF.moveTo(20.0f, 18.0f);
        pathBuilderF.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderF.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderF.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderF.reflectiveCurveTo(20.55f, 18.0f, 20.0f, 18.0f);
        pathBuilderF.close();
        pathBuilderF.moveTo(20.0f, 10.0f);
        pathBuilderF.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderF.verticalLineToRelative(4.0f);
        pathBuilderF.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderF.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderF.verticalLineToRelative(-4.0f);
        pathBuilderF.curveTo(21.0f, 10.45f, 20.55f, 10.0f, 20.0f, 10.0f);
        pathBuilderF.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderF.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalWifiStatusbarConnectedNoInternet4 = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
