package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: SettingsSuggest.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_settingsSuggest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SettingsSuggest", "Landroidx/compose/material/icons/Icons$Rounded;", "getSettingsSuggest", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SettingsSuggestKt {
    private static ImageVector _settingsSuggest;

    public static final ImageVector getSettingsSuggest(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _settingsSuggest;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsSuggest", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.04f, 7.99f, -0.63f, -1.4f);
        pathBuilderA.lineToRelative(-1.4f, -0.63f);
        pathBuilderA.curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilderA.lineToRelative(1.4f, -0.63f);
        pathBuilderA.lineToRelative(0.63f, -1.4f);
        pathBuilderA.curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0.0f);
        pathBuilderA.lineToRelative(0.63f, 1.4f);
        pathBuilderA.lineToRelative(1.4f, 0.63f);
        pathBuilderA.curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilderA.lineToRelative(-1.4f, 0.63f);
        pathBuilderA.lineToRelative(-0.63f, 1.4f);
        pathBuilderA.curveTo(18.78f, 8.38f, 18.22f, 8.38f, 18.04f, 7.99f);
        a.t(pathBuilderA, 21.28f, 12.72f, 20.96f, 12.0f);
        pathBuilderA.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilderA.lineToRelative(-0.32f, 0.72f);
        pathBuilderA.lineTo(19.0f, 13.04f);
        pathBuilderA.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilderA.lineToRelative(0.72f, 0.32f);
        pathBuilderA.lineTo(20.04f, 15.0f);
        pathBuilderA.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilderA.lineToRelative(0.32f, -0.72f);
        pathBuilderA.lineTo(22.0f, 13.96f);
        pathBuilderA.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 21.28f, 12.72f, 16.24f, 14.37f);
        pathBuilderA.lineToRelative(1.23f, 0.93f);
        pathBuilderA.curveToRelative(0.4f, 0.3f, 0.51f, 0.86f, 0.26f, 1.3f);
        pathBuilderA.lineToRelative(-1.62f, 2.8f);
        pathBuilderA.curveToRelative(-0.25f, 0.44f, -0.79f, 0.62f, -1.25f, 0.42f);
        pathBuilderA.lineToRelative(-1.43f, -0.6f);
        pathBuilderA.curveToRelative(-0.2f, 0.13f, -0.42f, 0.26f, -0.64f, 0.37f);
        pathBuilderA.lineToRelative(-0.19f, 1.54f);
        pathBuilderA.curveToRelative(-0.06f, 0.5f, -0.49f, 0.88f, -0.99f, 0.88f);
        pathBuilderA.horizontalLineTo(8.38f);
        pathBuilderA.curveToRelative(-0.5f, 0.0f, -0.93f, -0.38f, -0.99f, -0.88f);
        pathBuilderA.lineTo(7.2f, 19.59f);
        pathBuilderA.curveToRelative(-0.22f, -0.11f, -0.43f, -0.23f, -0.64f, -0.37f);
        pathBuilderA.lineToRelative(-1.43f, 0.6f);
        pathBuilderA.curveToRelative(-0.46f, 0.2f, -1.0f, 0.02f, -1.25f, -0.42f);
        pathBuilderA.lineToRelative(-1.62f, -2.8f);
        pathBuilderA.curveToRelative(-0.25f, -0.44f, -0.14f, -0.99f, 0.26f, -1.3f);
        pathBuilderA.lineToRelative(1.23f, -0.93f);
        pathBuilderA.curveTo(3.75f, 14.25f, 3.75f, 14.12f, 3.75f, 14.0f);
        pathBuilderA.reflectiveCurveToRelative(0.0f, -0.25f, 0.01f, -0.37f);
        pathBuilderA.lineTo(2.53f, 12.7f);
        pathBuilderA.curveToRelative(-0.4f, -0.3f, -0.51f, -0.86f, -0.26f, -1.3f);
        pathBuilderA.lineToRelative(1.62f, -2.8f);
        pathBuilderA.curveToRelative(0.25f, -0.44f, 0.79f, -0.62f, 1.25f, -0.42f);
        pathBuilderA.lineToRelative(1.43f, 0.6f);
        pathBuilderA.curveToRelative(0.2f, -0.13f, 0.42f, -0.26f, 0.64f, -0.37f);
        pathBuilderA.lineToRelative(0.19f, -1.54f);
        pathBuilderA.curveTo(7.45f, 6.38f, 7.88f, 6.0f, 8.38f, 6.0f);
        pathBuilderA.horizontalLineToRelative(3.23f);
        pathBuilderA.curveToRelative(0.5f, 0.0f, 0.93f, 0.38f, 0.99f, 0.88f);
        pathBuilderA.lineToRelative(0.19f, 1.54f);
        pathBuilderA.curveToRelative(0.22f, 0.11f, 0.43f, 0.23f, 0.64f, 0.37f);
        pathBuilderA.lineToRelative(1.43f, -0.6f);
        pathBuilderA.curveToRelative(0.46f, -0.2f, 1.0f, -0.02f, 1.25f, 0.42f);
        pathBuilderA.lineToRelative(1.62f, 2.8f);
        pathBuilderA.curveToRelative(0.25f, 0.44f, 0.14f, 0.99f, -0.26f, 1.3f);
        pathBuilderA.lineToRelative(-1.23f, 0.93f);
        pathBuilderA.curveToRelative(0.01f, 0.12f, 0.01f, 0.24f, 0.01f, 0.37f);
        pathBuilderA.reflectiveCurveTo(16.25f, 14.25f, 16.24f, 14.37f);
        pathBuilderA.close();
        pathBuilderA.moveTo(13.0f, 14.0f);
        pathBuilderA.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderA.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilderA.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 13.0f, 15.66f, 13.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSuggest = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
