package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: BluetoothConnected.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bluetoothConnected", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BluetoothConnected", "Landroidx/compose/material/icons/Icons$Rounded;", "getBluetoothConnected", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BluetoothConnectedKt {
    private static ImageVector _bluetoothConnected;

    public static final ImageVector getBluetoothConnected(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _bluetoothConnected;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BluetoothConnected", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.0f, 13.0f);
        pathBuilderD.curveToRelative(0.55f, -0.55f, 0.55f, -1.44f, 0.0f, -1.99f);
        pathBuilderD.lineTo(6.0f, 11.0f);
        pathBuilderD.curveToRelative(-0.55f, -0.55f, -1.45f, -0.55f, -2.0f, 0.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.55f, 1.45f, 0.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(1.45f, 0.55f, 2.0f, 0.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(20.0f, 11.0f);
        pathBuilderD.curveToRelative(-0.56f, -0.56f, -1.45f, -0.56f, -2.0f, -0.01f);
        pathBuilderD.lineTo(18.0f, 11.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.55f, -0.55f, 1.44f, 0.0f, 1.99f);
        pathBuilderD.lineTo(18.0f, 13.0f);
        pathBuilderD.curveToRelative(0.55f, 0.55f, 1.44f, 0.55f, 1.99f, 0.0f);
        pathBuilderD.lineTo(20.0f, 13.0f);
        pathBuilderD.curveToRelative(0.55f, -0.55f, 0.55f, -1.45f, 0.0f, -2.0f);
        a.y(pathBuilderD, 17.0f, 7.0f, -4.29f, -4.29f);
        pathBuilderD.curveToRelative(-0.63f, -0.63f, -1.71f, -0.19f, -1.71f, 0.7f);
        pathBuilderD.verticalLineToRelative(6.18f);
        pathBuilderD.lineTo(7.11f, 5.7f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineTo(10.59f, 12.0f);
        pathBuilderD.lineTo(5.7f, 16.89f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.lineTo(11.0f, 14.41f);
        pathBuilderD.verticalLineToRelative(6.18f);
        pathBuilderD.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        pathBuilderD.lineTo(17.0f, 17.0f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f);
        pathBuilderD.lineTo(13.41f, 12.0f);
        pathBuilderD.lineTo(17.0f, 8.42f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        androidx.compose.animation.a.t(pathBuilderD, 14.88f, 16.29f, 13.0f, 18.17f);
        v.v(pathBuilderD, -3.76f, 1.88f, 1.88f);
        pathBuilderD.moveTo(13.0f, 9.59f);
        pathBuilderD.lineTo(13.0f, 5.83f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, 1.88f, 1.88f, 13.0f, 9.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothConnected = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
