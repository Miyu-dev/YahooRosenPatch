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

/* JADX INFO: compiled from: Pinch.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pinch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Pinch", "Landroidx/compose/material/icons/Icons$Rounded;", "getPinch", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PinchKt {
    private static ImageVector _pinch;

    public static final ImageVector getPinch(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _pinch;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pinch", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.2f, 17.43f);
        pathBuilderD.curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f);
        pathBuilderD.lineTo(13.0f, 17.24f);
        pathBuilderD.verticalLineTo(6.5f);
        pathBuilderD.curveTo(13.0f, 5.67f, 13.67f, 5.0f, 14.5f, 5.0f);
        pathBuilderD.reflectiveCurveTo(16.0f, 5.67f, 16.0f, 6.5f);
        pathBuilderD.verticalLineToRelative(6.0f);
        pathBuilderD.horizontalLineToRelative(0.91f);
        pathBuilderD.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        pathBuilderD.lineToRelative(4.09f, 2.04f);
        pathBuilderD.curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f);
        pathBuilderD.lineToRelative(-0.63f, 4.46f);
        pathBuilderD.curveTo(22.21f, 22.27f, 21.36f, 23.0f, 20.37f, 23.0f);
        pathBuilderD.horizontalLineToRelative(-6.16f);
        pathBuilderD.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        pathBuilderD.lineToRelative(-4.07f, -4.29f);
        pathBuilderD.curveTo(8.3f, 17.94f, 8.2f, 17.69f, 8.2f, 17.43f);
        pathBuilderD.close();
        pathBuilderD.moveTo(9.5f, 5.25f);
        pathBuilderD.curveTo(9.5f, 5.66f, 9.84f, 6.0f, 10.25f, 6.0f);
        pathBuilderD.reflectiveCurveTo(11.0f, 5.66f, 11.0f, 5.25f);
        pathBuilderD.verticalLineTo(2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineTo(6.75f);
        pathBuilderD.curveTo(6.34f, 1.0f, 6.0f, 1.34f, 6.0f, 1.75f);
        pathBuilderD.reflectiveCurveTo(6.34f, 2.5f, 6.75f, 2.5f);
        androidx.appcompat.graphics.drawable.a.C(pathBuilderD, 1.69f, 2.5f, 8.44f, 6.75f);
        pathBuilderD.curveTo(2.5f, 6.34f, 2.16f, 6.0f, 1.75f, 6.0f);
        pathBuilderD.reflectiveCurveTo(1.0f, 6.34f, 1.0f, 6.75f);
        pathBuilderD.verticalLineTo(10.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(3.25f);
        pathBuilderD.curveTo(5.66f, 11.0f, 6.0f, 10.66f, 6.0f, 10.25f);
        pathBuilderD.reflectiveCurveTo(5.66f, 9.5f, 5.25f, 9.5f);
        pathBuilderD.horizontalLineTo(3.56f);
        pathBuilderD.lineTo(9.5f, 3.56f);
        pathBuilderD.verticalLineTo(5.25f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinch = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
