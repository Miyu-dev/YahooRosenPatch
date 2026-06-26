package androidx.compose.material.icons.filled;

import a.b;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_batteryUnknown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BatteryUnknown", "Landroidx/compose/material/icons/Icons$Filled;", "getBatteryUnknown", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BatteryUnknownKt {
    private static ImageVector _batteryUnknown;

    public static final ImageVector getBatteryUnknown(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _batteryUnknown;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BatteryUnknown", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(15.67f, 4.0f, 14.0f, 4.0f);
        a.o(pathBuilderA, 14.0f, 2.0f, -4.0f, 2.0f);
        pathBuilderA.lineTo(8.33f, 4.0f);
        pathBuilderA.curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        pathBuilderA.verticalLineToRelative(15.33f);
        pathBuilderA.curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.33f, 22.0f);
        pathBuilderA.horizontalLineToRelative(7.33f);
        pathBuilderA.curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        pathBuilderA.lineTo(17.0f, 5.33f);
        pathBuilderA.curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        androidx.compose.animation.b.r(pathBuilderA, 12.95f, 17.95f, -1.9f, -1.9f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderA, 1.9f, 1.9f, 14.3f, 12.69f);
        pathBuilderA.reflectiveCurveToRelative(-0.38f, 0.42f, -0.67f, 0.71f);
        pathBuilderA.curveToRelative(-0.48f, 0.48f, -0.83f, 1.15f, -0.83f, 1.6f);
        pathBuilderA.horizontalLineToRelative(-1.6f);
        pathBuilderA.curveToRelative(0.0f, -0.83f, 0.46f, -1.52f, 0.93f, -2.0f);
        pathBuilderA.lineToRelative(0.93f, -0.94f);
        pathBuilderA.curveToRelative(0.27f, -0.27f, 0.44f, -0.65f, 0.44f, -1.06f);
        pathBuilderA.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderA.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderA.lineTo(9.0f, 11.0f);
        pathBuilderA.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderA.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilderA.curveToRelative(0.0f, 0.66f, -0.27f, 1.26f, -0.7f, 1.69f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batteryUnknown = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
