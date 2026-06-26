package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Dry.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dry", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Dry", "Landroidx/compose/material/icons/Icons$Rounded;", "getDry", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DryKt {
    private static ImageVector _dry;

    public static final ImageVector getDry(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _dry;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Dry", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(1.94f, 11.79f);
        pathBuilderD.curveTo(1.34f, 12.36f, 1.0f, 13.14f, 1.0f, 13.97f);
        pathBuilderD.verticalLineTo(20.0f);
        pathBuilderD.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.lineToRelative(13.68f, 0.0f);
        pathBuilderD.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilderD.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilderD.horizontalLineTo(12.5f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.lineToRelative(7.18f, 0.0f);
        pathBuilderD.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilderD.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilderD.horizontalLineTo(12.5f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.lineToRelative(8.18f, 0.0f);
        pathBuilderD.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilderD.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilderD.horizontalLineTo(12.5f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderD.lineToRelative(6.18f, 0.0f);
        pathBuilderD.curveToRelative(0.65f, 0.0f, 1.25f, -0.47f, 1.32f, -1.12f);
        pathBuilderD.curveToRelative(0.08f, -0.75f, -0.51f, -1.38f, -1.24f, -1.38f);
        pathBuilderD.horizontalLineTo(8.86f);
        pathBuilderD.lineToRelative(1.49f, -2.61f);
        pathBuilderD.curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f);
        pathBuilderD.curveToRelative(0.0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f);
        pathBuilderD.lineTo(9.81f, 5.71f);
        pathBuilderD.curveTo(9.43f, 5.32f, 8.8f, 5.3f, 8.4f, 5.68f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 1.94f, 11.79f, 16.99f, 8.07f);
        pathBuilderD.curveToRelative(0.0f, 0.52f, -0.42f, 0.93f, -0.93f, 0.93f);
        pathBuilderD.curveToRelative(-0.52f, 0.0f, -0.93f, -0.42f, -0.93f, -0.93f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.03f, -0.67f, -0.22f, -1.33f, -0.71f, -1.86f);
        pathBuilderD.lineToRelative(-0.07f, -0.06f);
        pathBuilderD.curveToRelative(-0.9f, -0.89f, -1.38f, -2.03f, -1.34f, -3.22f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveTo(13.0f, 2.42f, 13.42f, 2.0f, 13.93f, 2.0f);
        pathBuilderD.curveToRelative(0.51f, 0.0f, 0.93f, 0.42f, 0.93f, 0.93f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(-0.03f, 0.67f, 0.22f, 1.33f, 0.71f, 1.86f);
        pathBuilderD.lineToRelative(0.07f, 0.07f);
        pathBuilderD.curveTo(16.55f, 5.74f, 17.03f, 6.88f, 16.99f, 8.07f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 16.99f, 8.07f, 21.0f, 8.07f);
        pathBuilderD.curveTo(21.0f, 8.58f, 20.58f, 9.0f, 20.06f, 9.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.93f, -0.42f, -0.93f, -0.93f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.03f, -0.67f, -0.22f, -1.33f, -0.71f, -1.86f);
        pathBuilderD.lineToRelative(-0.07f, -0.06f);
        pathBuilderD.curveToRelative(-0.9f, -0.89f, -1.38f, -2.03f, -1.34f, -3.22f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.51f, 0.42f, -0.93f, 0.93f, -0.93f);
        pathBuilderD.reflectiveCurveToRelative(0.93f, 0.42f, 0.93f, 0.93f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(-0.03f, 0.67f, 0.22f, 1.33f, 0.71f, 1.86f);
        pathBuilderD.lineToRelative(0.07f, 0.07f);
        pathBuilderD.curveTo(20.55f, 5.74f, 21.03f, 6.88f, 21.0f, 8.07f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 21.0f, 8.07f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dry = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
