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

/* JADX INFO: compiled from: Spa.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_spa", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Spa", "Landroidx/compose/material/icons/Icons$Rounded;", "getSpa", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SpaKt {
    private static ImageVector _spa;

    public static final ImageVector getSpa(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _spa;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Spa", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(15.49f, 9.63f);
        pathBuilderD.curveToRelative(-0.16f, -2.42f, -1.03f, -4.79f, -2.64f, -6.76f);
        pathBuilderD.curveToRelative(-0.41f, -0.5f, -1.16f, -0.5f, -1.57f, 0.0f);
        pathBuilderD.curveToRelative(-1.65f, 1.98f, -2.57f, 4.35f, -2.77f, 6.76f);
        pathBuilderD.curveToRelative(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f);
        pathBuilderD.curveToRelative(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f);
        pathBuilderD.close();
        pathBuilderD.moveTo(8.99f, 12.28f);
        pathBuilderD.curveToRelative(-0.14f, -0.1f, -0.3f, -0.19f, -0.45f, -0.29f);
        pathBuilderD.curveToRelative(0.15f, 0.11f, 0.31f, 0.19f, 0.45f, 0.29f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.41f, 12.03f);
        pathBuilderD.curveToRelative(-0.13f, 0.09f, -0.27f, 0.16f, -0.4f, 0.26f);
        pathBuilderD.curveToRelative(0.13f, -0.1f, 0.27f, -0.17f, 0.4f, -0.26f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 15.45f);
        pathBuilderD.curveToRelative(-1.95f, -2.97f, -5.14f, -5.03f, -8.83f, -5.39f);
        pathBuilderD.curveToRelative(-0.64f, -0.06f, -1.17f, 0.47f, -1.11f, 1.11f);
        pathBuilderD.curveToRelative(0.45f, 4.8f, 3.65f, 8.78f, 7.98f, 10.33f);
        pathBuilderD.curveToRelative(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f);
        pathBuilderD.curveToRelative(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f);
        pathBuilderD.curveToRelative(4.33f, -1.55f, 7.53f, -5.52f, 7.98f, -10.33f);
        pathBuilderD.curveToRelative(0.06f, -0.64f, -0.48f, -1.17f, -1.11f, -1.11f);
        pathBuilderD.curveToRelative(-3.71f, 0.36f, -6.9f, 2.42f, -8.85f, 5.39f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spa = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
