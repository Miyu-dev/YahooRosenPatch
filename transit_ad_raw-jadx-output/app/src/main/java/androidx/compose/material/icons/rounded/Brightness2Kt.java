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

/* JADX INFO: compiled from: Brightness2.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_brightness2", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Brightness2", "Landroidx/compose/material/icons/Icons$Rounded;", "getBrightness2", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class Brightness2Kt {
    private static ImageVector _brightness2;

    public static final ImageVector getBrightness2(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _brightness2;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Brightness2", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.43f, 2.3f);
        pathBuilderD.curveToRelative(-2.38f, -0.59f, -4.68f, -0.27f, -6.63f, 0.64f);
        pathBuilderD.curveToRelative(-0.35f, 0.16f, -0.41f, 0.64f, -0.1f, 0.86f);
        pathBuilderD.curveTo(8.3f, 5.6f, 10.0f, 8.6f, 10.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 3.4f, -1.7f, 6.4f, -4.3f, 8.2f);
        pathBuilderD.curveToRelative(-0.32f, 0.22f, -0.26f, 0.7f, 0.09f, 0.86f);
        pathBuilderD.curveToRelative(1.28f, 0.6f, 2.71f, 0.94f, 4.21f, 0.94f);
        pathBuilderD.curveToRelative(6.05f, 0.0f, 10.85f, -5.38f, 9.87f, -11.6f);
        pathBuilderD.curveToRelative(-0.61f, -3.92f, -3.59f, -7.16f, -7.44f, -8.1f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness2 = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
