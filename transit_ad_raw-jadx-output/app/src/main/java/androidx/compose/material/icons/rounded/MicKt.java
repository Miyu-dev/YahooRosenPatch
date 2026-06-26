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

/* JADX INFO: compiled from: Mic.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_mic", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Mic", "Landroidx/compose/material/icons/Icons$Rounded;", "getMic", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MicKt {
    private static ImageVector _mic;

    public static final ImageVector getMic(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _mic;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Mic", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 14.0f);
        pathBuilderD.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilderD.lineTo(15.0f, 5.0f);
        pathBuilderD.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilderD.reflectiveCurveTo(9.0f, 3.34f, 9.0f, 5.0f);
        pathBuilderD.verticalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.91f, 11.0f);
        pathBuilderD.curveToRelative(-0.49f, 0.0f, -0.9f, 0.36f, -0.98f, 0.85f);
        pathBuilderD.curveTo(16.52f, 14.2f, 14.47f, 16.0f, 12.0f, 16.0f);
        pathBuilderD.reflectiveCurveToRelative(-4.52f, -1.8f, -4.93f, -4.15f);
        pathBuilderD.curveToRelative(-0.08f, -0.49f, -0.49f, -0.85f, -0.98f, -0.85f);
        pathBuilderD.curveToRelative(-0.61f, 0.0f, -1.09f, 0.54f, -1.0f, 1.14f);
        pathBuilderD.curveToRelative(0.49f, 3.0f, 2.89f, 5.35f, 5.91f, 5.78f);
        pathBuilderD.lineTo(11.0f, 20.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-2.08f);
        pathBuilderD.curveToRelative(3.02f, -0.43f, 5.42f, -2.78f, 5.91f, -5.78f);
        pathBuilderD.curveToRelative(0.1f, -0.6f, -0.39f, -1.14f, -1.0f, -1.14f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mic = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
