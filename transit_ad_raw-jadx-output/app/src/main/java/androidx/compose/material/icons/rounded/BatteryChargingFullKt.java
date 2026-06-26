package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: BatteryChargingFull.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_batteryChargingFull", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BatteryChargingFull", "Landroidx/compose/material/icons/Icons$Rounded;", "getBatteryChargingFull", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BatteryChargingFullKt {
    private static ImageVector _batteryChargingFull;

    public static final ImageVector getBatteryChargingFull(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _batteryChargingFull;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BatteryChargingFull", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.67f, 4.0f, 14.0f, 4.0f);
        pathBuilderA.lineTo(14.0f, 3.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderA.horizontalLineToRelative(-2.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(1.0f);
        pathBuilderA.lineTo(8.33f, 4.0f);
        pathBuilderA.curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        pathBuilderA.verticalLineToRelative(15.33f);
        pathBuilderA.curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.34f, 22.0f);
        pathBuilderA.horizontalLineToRelative(7.32f);
        pathBuilderA.curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        pathBuilderA.lineTo(17.0f, 5.33f);
        pathBuilderA.curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        a.y(pathBuilderA, 14.61f, 13.24f, -2.67f, 5.0f);
        pathBuilderA.curveToRelative(-0.24f, 0.45f, -0.94f, 0.28f, -0.94f, -0.24f);
        pathBuilderA.verticalLineToRelative(-3.5f);
        pathBuilderA.lineTo(9.83f, 14.5f);
        pathBuilderA.curveToRelative(-0.38f, 0.0f, -0.62f, -0.4f, -0.44f, -0.74f);
        pathBuilderA.lineToRelative(2.67f, -5.0f);
        pathBuilderA.curveToRelative(0.24f, -0.45f, 0.94f, -0.28f, 0.94f, 0.24f);
        pathBuilderA.verticalLineToRelative(3.5f);
        pathBuilderA.horizontalLineToRelative(1.17f);
        pathBuilderA.curveToRelative(0.37f, 0.0f, 0.62f, 0.4f, 0.44f, 0.74f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batteryChargingFull = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
