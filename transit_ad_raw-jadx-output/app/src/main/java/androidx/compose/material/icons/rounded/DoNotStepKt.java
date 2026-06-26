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

/* JADX INFO: compiled from: DoNotStep.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_doNotStep", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DoNotStep", "Landroidx/compose/material/icons/Icons$Rounded;", "getDoNotStep", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DoNotStepKt {
    private static ImageVector _doNotStep;

    public static final ImageVector getDoNotStep(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _doNotStep;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoNotStep", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(2.1f, 3.51f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(7.19f, 7.19f);
        pathBuilderD.curveToRelative(0.18f, 0.2f, 0.18f, 0.5f, -0.01f, 0.7f);
        pathBuilderD.curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f);
        pathBuilderD.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        pathBuilderD.lineTo(6.87f, 11.1f);
        pathBuilderD.curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f);
        pathBuilderD.lineToRelative(1.4f, 1.4f);
        pathBuilderD.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderD.curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f);
        pathBuilderD.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        pathBuilderD.lineToRelative(-1.27f, -1.27f);
        pathBuilderD.curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f);
        pathBuilderD.lineToRelative(1.28f, 1.28f);
        pathBuilderD.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilderD.curveTo(6.26f, 15.95f, 6.13f, 16.0f, 6.0f, 16.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        pathBuilderD.lineToRelative(-1.38f, -1.38f);
        pathBuilderD.curveToRelative(-0.71f, 0.47f, -1.43f, 0.81f, -2.02f, 1.04f);
        pathBuilderD.curveTo(1.49f, 15.81f, 1.0f, 16.55f, 1.0f, 17.37f);
        pathBuilderD.lineTo(1.0f, 18.0f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(6.67f);
        pathBuilderD.curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f);
        pathBuilderD.lineToRelative(2.74f, -2.74f);
        pathBuilderD.lineToRelative(5.23f, 5.23f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineTo(3.51f, 3.51f);
        pathBuilderD.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 2.1f, 3.51f, 18.51f, 15.68f);
        pathBuilderD.lineToRelative(-1.41f, -1.41f);
        pathBuilderD.lineToRelative(4.48f, -4.48f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 18.51f, 15.68f, 20.88f, 9.08f);
        pathBuilderD.lineToRelative(-4.48f, 4.48f);
        pathBuilderD.lineTo(9.3f, 6.47f);
        pathBuilderD.lineToRelative(3.09f, -3.07f);
        pathBuilderD.curveToRelative(0.78f, -0.78f, 2.04f, -0.77f, 2.82f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 20.88f, 9.08f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotStep = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
