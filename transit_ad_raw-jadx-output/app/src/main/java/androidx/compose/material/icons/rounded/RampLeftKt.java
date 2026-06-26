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

/* JADX INFO: compiled from: RampLeft.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rampLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RampLeft", "Landroidx/compose/material/icons/Icons$Rounded;", "getRampLeft", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RampLeftKt {
    private static ImageVector _rampLeft;

    public static final ImageVector getRampLeft(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _rampLeft;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RampLeft", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 21.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineTo(6.83f);
        pathBuilderD.lineToRelative(-0.88f, 0.88f);
        pathBuilderD.curveTo(9.73f, 8.1f, 9.1f, 8.1f, 8.71f, 7.71f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineToRelative(2.59f, -2.59f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(2.59f, 2.59f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.lineTo(13.0f, 6.83f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.verticalLineTo(9.0f);
        pathBuilderD.curveToRelative(0.0f, 3.62f, 2.89f, 6.22f, 4.97f, 7.62f);
        pathBuilderD.curveToRelative(0.52f, 0.35f, 0.59f, 1.09f, 0.14f, 1.53f);
        pathBuilderD.curveToRelative(-0.33f, 0.33f, -0.87f, 0.4f, -1.26f, 0.13f);
        pathBuilderD.curveToRelative(-1.59f, -1.06f, -2.89f, -2.28f, -3.85f, -3.59f);
        pathBuilderD.lineToRelative(0.0f, 5.3f);
        pathBuilderD.curveTo(13.0f, 20.55f, 12.55f, 21.0f, 12.0f, 21.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rampLeft = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
