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

/* JADX INFO: compiled from: RunCircle.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_runCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RunCircle", "Landroidx/compose/material/icons/Icons$Rounded;", "getRunCircle", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RunCircleKt {
    private static ImageVector _runCircle;

    public static final ImageVector getRunCircle(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _runCircle;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RunCircle", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(13.5f, 6.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.curveTo(12.5f, 6.45f, 12.95f, 6.0f, 13.5f, 6.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.41f, 11.91f);
        pathBuilderD.curveToRelative(-0.71f, -0.2f, -1.63f, -0.74f, -2.32f, -1.66f);
        pathBuilderD.lineToRelative(-0.41f, 2.35f);
        pathBuilderD.lineToRelative(1.19f, 1.3f);
        pathBuilderD.curveTo(13.95f, 13.98f, 14.0f, 14.1f, 14.0f, 14.22f);
        pathBuilderD.verticalLineToRelative(3.28f);
        pathBuilderD.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderD.verticalLineToRelative(-3.08f);
        pathBuilderD.lineToRelative(-1.11f, -1.21f);
        pathBuilderD.lineToRelative(-0.43f, 2.15f);
        pathBuilderD.curveToRelative(-0.05f, 0.27f, -0.32f, 0.45f, -0.59f, 0.39f);
        pathBuilderD.lineToRelative(-2.78f, -0.57f);
        pathBuilderD.curveToRelative(-0.27f, -0.06f, -0.45f, -0.32f, -0.39f, -0.59f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.06f, -0.27f, 0.32f, -0.44f, 0.59f, -0.39f);
        pathBuilderD.lineToRelative(2.29f, 0.47f);
        pathBuilderD.lineToRelative(0.96f, -4.89f);
        pathBuilderD.lineTo(10.0f, 10.35f);
        pathBuilderD.verticalLineToRelative(1.15f);
        pathBuilderD.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveTo(9.22f, 12.0f, 9.0f, 11.78f, 9.0f, 11.5f);
        pathBuilderD.verticalLineTo(10.0f);
        pathBuilderD.curveToRelative(0.0f, -0.21f, 0.13f, -0.4f, 0.33f, -0.47f);
        pathBuilderD.lineToRelative(2.95f, -1.09f);
        pathBuilderD.curveToRelative(0.49f, -0.18f, 1.02f, 0.04f, 1.25f, 0.51f);
        pathBuilderD.curveToRelative(0.65f, 1.35f, 1.55f, 1.85f, 2.1f, 2.0f);
        pathBuilderD.curveTo(15.85f, 11.0f, 16.0f, 11.18f, 16.0f, 11.4f);
        pathBuilderD.verticalLineToRelative(0.04f);
        pathBuilderD.curveTo(16.0f, 11.75f, 15.71f, 11.99f, 15.41f, 11.91f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _runCircle = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
