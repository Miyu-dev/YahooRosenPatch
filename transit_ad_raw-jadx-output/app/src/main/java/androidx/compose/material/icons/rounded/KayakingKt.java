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

/* JADX INFO: compiled from: Kayaking.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_kayaking", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Kayaking", "Landroidx/compose/material/icons/Icons$Rounded;", "getKayaking", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KayakingKt {
    private static ImageVector _kayaking;

    public static final ImageVector getKayaking(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _kayaking;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Kayaking", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(2.0f, 22.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.87f, 0.0f, 1.73f, -0.24f, 2.53f, -0.7f);
        pathBuilderD.curveToRelative(0.29f, -0.16f, 0.65f, -0.17f, 0.94f, 0.0f);
        pathBuilderD.curveToRelative(1.59f, 0.9f, 3.48f, 0.9f, 5.06f, 0.0f);
        pathBuilderD.curveToRelative(0.29f, -0.16f, 0.65f, -0.16f, 0.94f, 0.0f);
        pathBuilderD.curveToRelative(1.59f, 0.9f, 3.48f, 0.9f, 5.06f, 0.0f);
        pathBuilderD.curveToRelative(0.29f, -0.16f, 0.65f, -0.16f, 0.94f, 0.0f);
        pathBuilderD.curveTo(19.27f, 20.76f, 20.13f, 21.0f, 21.0f, 21.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-1.03f, 0.0f, -2.06f, -0.25f, -3.0f, -0.75f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-1.92f, 1.02f, -4.18f, 1.0f, -6.09f, -0.05f);
        pathBuilderD.curveToRelative(-1.79f, 0.87f, -3.92f, 0.98f, -5.58f, -0.14f);
        pathBuilderD.curveTo(5.3f, 22.69f, 4.15f, 23.0f, 3.0f, 23.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveTo(2.45f, 23.0f, 2.0f, 22.55f, 2.0f, 22.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 5.5f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(13.1f, 5.5f, 12.0f, 5.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(21.47f, 18.45f);
        pathBuilderD.curveToRelative(-0.42f, 0.14f, -0.9f, 0.28f, -1.41f, 0.42f);
        pathBuilderD.curveToRelative(-0.53f, -0.15f, -1.03f, -0.43f, -1.45f, -0.77f);
        pathBuilderD.curveToRelative(-0.35f, -0.29f, -0.87f, -0.29f, -1.23f, 0.0f);
        pathBuilderD.curveTo(16.72f, 18.63f, 15.9f, 19.0f, 15.0f, 19.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.72f, -0.37f, -2.39f, -0.91f);
        pathBuilderD.curveToRelative(-0.35f, -0.28f, -0.87f, -0.28f, -1.22f, 0.0f);
        pathBuilderD.curveTo(10.72f, 18.63f, 9.9f, 19.0f, 9.0f, 19.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.72f, -0.37f, -2.39f, -0.91f);
        pathBuilderD.curveToRelative(-0.35f, -0.29f, -0.87f, -0.28f, -1.23f, 0.0f);
        pathBuilderD.curveToRelative(-0.43f, 0.35f, -0.92f, 0.62f, -1.45f, 0.77f);
        pathBuilderD.curveToRelative(-0.51f, -0.14f, -0.98f, -0.28f, -1.4f, -0.42f);
        pathBuilderD.curveToRelative(-0.92f, -0.3f, -0.92f, -1.6f, 0.0f, -1.9f);
        pathBuilderD.curveToRelative(1.21f, -0.39f, 2.79f, -0.82f, 4.6f, -1.13f);
        pathBuilderD.lineToRelative(1.35f, -4.17f);
        pathBuilderD.curveToRelative(0.31f, -0.95f, 1.32f, -1.47f, 2.27f, -1.16f);
        pathBuilderD.curveToRelative(0.09f, 0.03f, 0.19f, 0.07f, 0.27f, 0.11f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.lineToRelative(2.47f, 1.3f);
        pathBuilderD.lineToRelative(2.84f, -1.5f);
        pathBuilderD.lineToRelative(1.65f, -3.71f);
        pathBuilderD.lineToRelative(-0.36f, -0.93f);
        pathBuilderD.curveToRelative(-0.1f, -0.25f, -0.09f, -0.52f, 0.02f, -0.76f);
        pathBuilderD.lineToRelative(0.74f, -1.68f);
        pathBuilderD.curveToRelative(0.22f, -0.51f, 0.82f, -0.73f, 1.32f, -0.51f);
        pathBuilderD.lineToRelative(1.37f, 0.61f);
        pathBuilderD.curveToRelative(0.5f, 0.23f, 0.73f, 0.82f, 0.5f, 1.32f);
        pathBuilderD.lineToRelative(-0.75f, 1.68f);
        pathBuilderD.curveToRelative(-0.11f, 0.24f, -0.31f, 0.43f, -0.56f, 0.53f);
        pathBuilderD.lineTo(19.36f, 6.9f);
        pathBuilderD.lineToRelative(-3.72f, 8.34f);
        pathBuilderD.curveToRelative(2.33f, 0.3f, 4.35f, 0.84f, 5.82f, 1.31f);
        pathBuilderD.curveTo(22.39f, 16.85f, 22.4f, 18.15f, 21.47f, 18.45f);
        a.y(pathBuilderD, 15.02f, 12.96f, -0.59f, 0.31f);
        pathBuilderD.curveToRelative(-0.58f, 0.31f, -1.28f, 0.31f, -1.86f, 0.0f);
        pathBuilderD.lineToRelative(-0.81f, -0.43f);
        pathBuilderD.lineToRelative(-0.71f, 2.17f);
        pathBuilderD.curveTo(11.36f, 15.01f, 11.68f, 15.0f, 12.0f, 15.0f);
        pathBuilderD.curveToRelative(0.71f, 0.0f, 1.4f, 0.03f, 2.07f, 0.08f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 15.02f, 12.96f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kayaking = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
