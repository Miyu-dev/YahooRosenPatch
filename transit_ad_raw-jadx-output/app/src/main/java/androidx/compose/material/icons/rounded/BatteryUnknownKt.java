package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: BatteryUnknown.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_batteryUnknown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BatteryUnknown", "Landroidx/compose/material/icons/Icons$Rounded;", "getBatteryUnknown", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BatteryUnknownKt {
    private static ImageVector _batteryUnknown;

    public static final ImageVector getBatteryUnknown(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _batteryUnknown;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BatteryUnknown", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
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
        androidx.compose.animation.b.r(pathBuilderA, 13.0f, 18.0f, -2.0f, -2.0f);
        a.z(pathBuilderA, 2.0f, 2.0f, 14.3f, 12.69f);
        pathBuilderA.reflectiveCurveToRelative(-0.38f, 0.42f, -0.67f, 0.71f);
        pathBuilderA.curveToRelative(-0.14f, 0.14f, -0.27f, 0.31f, -0.39f, 0.47f);
        pathBuilderA.lineToRelative(-0.09f, 0.15f);
        pathBuilderA.curveToRelative(-0.08f, 0.12f, -0.14f, 0.25f, -0.19f, 0.37f);
        pathBuilderA.curveToRelative(-0.09f, 0.22f, -0.16f, 0.43f, -0.16f, 0.61f);
        pathBuilderA.horizontalLineToRelative(-1.6f);
        pathBuilderA.curveToRelative(0.0f, -0.42f, 0.12f, -0.8f, 0.29f, -1.13f);
        pathBuilderA.curveToRelative(0.06f, -0.11f, 0.13f, -0.21f, 0.2f, -0.31f);
        pathBuilderA.curveToRelative(0.03f, -0.05f, 0.06f, -0.11f, 0.1f, -0.16f);
        pathBuilderA.curveToRelative(0.11f, -0.14f, 0.23f, -0.28f, 0.34f, -0.4f);
        pathBuilderA.lineToRelative(0.93f, -0.94f);
        pathBuilderA.curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        pathBuilderA.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderA.curveToRelative(-0.65f, 0.0f, -1.21f, 0.41f, -1.41f, 0.99f);
        pathBuilderA.curveToRelative(-0.11f, 0.31f, -0.39f, 0.51f, -0.71f, 0.51f);
        pathBuilderA.curveToRelative(-0.52f, 0.0f, -0.88f, -0.52f, -0.71f, -1.01f);
        pathBuilderA.curveTo(9.59f, 8.83f, 10.69f, 8.0f, 12.0f, 8.0f);
        pathBuilderA.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilderA.curveToRelative(0.0f, 0.66f, -0.27f, 1.26f, -0.7f, 1.69f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batteryUnknown = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
