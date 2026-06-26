package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: StrikethroughS.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_strikethroughS", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StrikethroughS", "Landroidx/compose/material/icons/Icons$Rounded;", "getStrikethroughS", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StrikethroughSKt {
    private static ImageVector _strikethroughS;

    public static final ImageVector getStrikethroughS(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _strikethroughS;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StrikethroughS", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.59f, 7.52f);
        pathBuilderD.curveToRelative(0.0f, -0.31f, -0.05f, -0.59f, -0.15f, -0.85f);
        pathBuilderD.curveToRelative(-0.09f, -0.27f, -0.24f, -0.49f, -0.44f, -0.68f);
        pathBuilderD.curveToRelative(-0.2f, -0.19f, -0.45f, -0.33f, -0.75f, -0.44f);
        pathBuilderD.curveToRelative(-0.3f, -0.1f, -0.66f, -0.16f, -1.06f, -0.16f);
        pathBuilderD.curveToRelative(-0.39f, 0.0f, -0.74f, 0.04f, -1.03f, 0.13f);
        pathBuilderD.reflectiveCurveToRelative(-0.53f, 0.21f, -0.72f, 0.36f);
        pathBuilderD.curveToRelative(-0.19f, 0.16f, -0.34f, 0.34f, -0.44f, 0.55f);
        pathBuilderD.curveToRelative(-0.1f, 0.21f, -0.15f, 0.43f, -0.15f, 0.66f);
        pathBuilderD.curveToRelative(0.0f, 0.48f, 0.25f, 0.88f, 0.74f, 1.21f);
        pathBuilderD.curveToRelative(0.38f, 0.25f, 0.77f, 0.48f, 1.41f, 0.7f);
        pathBuilderD.horizontalLineTo(7.39f);
        pathBuilderD.curveToRelative(-0.05f, -0.08f, -0.11f, -0.17f, -0.15f, -0.25f);
        pathBuilderD.curveToRelative(-0.26f, -0.48f, -0.39f, -1.03f, -0.39f, -1.67f);
        pathBuilderD.curveToRelative(0.0f, -0.61f, 0.13f, -1.16f, 0.4f, -1.67f);
        pathBuilderD.curveToRelative(0.26f, -0.5f, 0.63f, -0.93f, 1.11f, -1.29f);
        pathBuilderD.curveToRelative(0.48f, -0.35f, 1.05f, -0.63f, 1.7f, -0.83f);
        pathBuilderD.curveToRelative(0.66f, -0.19f, 1.39f, -0.29f, 2.18f, -0.29f);
        pathBuilderD.curveToRelative(0.81f, 0.0f, 1.54f, 0.11f, 2.21f, 0.34f);
        pathBuilderD.curveToRelative(0.66f, 0.22f, 1.23f, 0.54f, 1.69f, 0.94f);
        pathBuilderD.curveToRelative(0.47f, 0.4f, 0.83f, 0.88f, 1.08f, 1.43f);
        pathBuilderD.reflectiveCurveToRelative(0.38f, 1.15f, 0.38f, 1.81f);
        pathBuilderD.horizontalLineToRelative(-3.01f);
        pathBuilderD.moveTo(20.0f, 10.0f);
        pathBuilderD.horizontalLineTo(4.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(8.62f);
        pathBuilderD.curveToRelative(0.18f, 0.07f, 0.4f, 0.14f, 0.55f, 0.2f);
        pathBuilderD.curveToRelative(0.37f, 0.17f, 0.66f, 0.34f, 0.87f, 0.51f);
        pathBuilderD.reflectiveCurveToRelative(0.35f, 0.36f, 0.43f, 0.57f);
        pathBuilderD.curveToRelative(0.07f, 0.2f, 0.11f, 0.43f, 0.11f, 0.69f);
        pathBuilderD.curveToRelative(0.0f, 0.23f, -0.05f, 0.45f, -0.14f, 0.66f);
        pathBuilderD.curveToRelative(-0.09f, 0.2f, -0.23f, 0.38f, -0.42f, 0.53f);
        pathBuilderD.curveToRelative(-0.19f, 0.15f, -0.42f, 0.26f, -0.71f, 0.35f);
        pathBuilderD.curveToRelative(-0.29f, 0.08f, -0.63f, 0.13f, -1.01f, 0.13f);
        pathBuilderD.curveToRelative(-0.43f, 0.0f, -0.83f, -0.04f, -1.18f, -0.13f);
        pathBuilderD.reflectiveCurveToRelative(-0.66f, -0.23f, -0.91f, -0.42f);
        pathBuilderD.curveToRelative(-0.25f, -0.19f, -0.45f, -0.44f, -0.59f, -0.75f);
        pathBuilderD.reflectiveCurveToRelative(-0.25f, -0.76f, -0.25f, -1.21f);
        pathBuilderD.horizontalLineTo(6.4f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.08f, 1.13f, 0.24f, 1.58f);
        pathBuilderD.reflectiveCurveToRelative(0.37f, 0.85f, 0.65f, 1.21f);
        pathBuilderD.curveToRelative(0.28f, 0.35f, 0.6f, 0.66f, 0.98f, 0.92f);
        pathBuilderD.curveToRelative(0.37f, 0.26f, 0.78f, 0.48f, 1.22f, 0.65f);
        pathBuilderD.curveToRelative(0.44f, 0.17f, 0.9f, 0.3f, 1.38f, 0.39f);
        pathBuilderD.curveToRelative(0.48f, 0.08f, 0.96f, 0.13f, 1.44f, 0.13f);
        pathBuilderD.curveToRelative(0.8f, 0.0f, 1.53f, -0.09f, 2.18f, -0.28f);
        pathBuilderD.reflectiveCurveToRelative(1.21f, -0.45f, 1.67f, -0.79f);
        pathBuilderD.curveToRelative(0.46f, -0.34f, 0.82f, -0.77f, 1.07f, -1.27f);
        pathBuilderD.reflectiveCurveToRelative(0.38f, -1.07f, 0.38f, -1.71f);
        pathBuilderD.curveToRelative(0.0f, -0.6f, -0.1f, -1.14f, -0.31f, -1.61f);
        pathBuilderD.curveToRelative(-0.05f, -0.11f, -0.11f, -0.23f, -0.17f, -0.33f);
        pathBuilderD.horizontalLineTo(20.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineTo(11.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _strikethroughS = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
