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

/* JADX INFO: compiled from: ScubaDiving.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_scubaDiving", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScubaDiving", "Landroidx/compose/material/icons/Icons$Rounded;", "getScubaDiving", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScubaDivingKt {
    private static ImageVector _scubaDiving;

    public static final ImageVector getScubaDiving(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _scubaDiving;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ScubaDiving", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(1.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(1.0f, 14.1f, 1.0f, 13.0f);
        a.y(pathBuilderD, 8.89f, 10.11f, 3.56f, -0.95f);
        pathBuilderD.curveToRelative(0.53f, -0.14f, 0.85f, -0.69f, 0.71f, -1.22f);
        pathBuilderD.lineTo(12.9f, 6.97f);
        pathBuilderD.curveToRelative(-0.14f, -0.53f, -0.69f, -0.85f, -1.22f, -0.71f);
        pathBuilderD.lineTo(8.11f, 7.21f);
        pathBuilderD.curveToRelative(-0.8f, 0.21f, -1.28f, 1.04f, -1.06f, 1.84f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f);
        pathBuilderD.close();
        pathBuilderD.moveTo(22.52f, 2.52f);
        pathBuilderD.curveToRelative(-0.29f, -0.29f, -0.75f, -0.29f, -1.04f, 0.0f);
        pathBuilderD.lineTo(19.0f, 5.0f);
        pathBuilderD.lineToRelative(-2.0f, 4.0f);
        pathBuilderD.lineToRelative(-9.48f, 2.87f);
        pathBuilderD.curveToRelative(-0.82f, 0.2f, -1.39f, 0.89f, -1.5f, 1.68f);
        pathBuilderD.lineTo(5.24f, 18.0f);
        pathBuilderD.lineTo(3.0f, 21.0f);
        pathBuilderD.curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f);
        pathBuilderD.curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f);
        pathBuilderD.lineTo(7.0f, 19.0f);
        pathBuilderD.lineToRelative(1.14f, -3.14f);
        pathBuilderD.lineToRelative(5.57f, -1.77f);
        pathBuilderD.curveToRelative(0.19f, -0.06f, 0.38f, -0.15f, 0.54f, -0.27f);
        pathBuilderD.lineToRelative(4.2f, -2.94f);
        pathBuilderD.curveToRelative(0.36f, -0.25f, 0.62f, -0.61f, 0.75f, -1.02f);
        pathBuilderD.lineTo(20.5f, 5.9f);
        pathBuilderD.lineToRelative(2.06f, -2.38f);
        pathBuilderD.curveTo(22.81f, 3.22f, 22.79f, 2.79f, 22.52f, 2.52f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scubaDiving = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
