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

/* JADX INFO: compiled from: ExtensionOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_extensionOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ExtensionOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getExtensionOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ExtensionOffKt {
    private static ImageVector _extensionOff;

    public static final ImageVector getExtensionOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _extensionOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ExtensionOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.49f, 21.9f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.lineToRelative(-0.92f, -0.92f);
        pathBuilderD.curveTo(18.1f, 20.98f, 18.05f, 21.0f, 18.0f, 21.0f);
        pathBuilderD.horizontalLineToRelative(-3.8f);
        pathBuilderD.curveToRelative(0.0f, -2.71f, -2.16f, -3.0f, -2.7f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.7f, 0.29f, -2.7f, 3.0f);
        pathBuilderD.horizontalLineTo(5.0f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.verticalLineToRelative(-3.8f);
        pathBuilderD.curveToRelative(2.71f, 0.0f, 3.0f, -2.16f, 3.0f, -2.7f);
        pathBuilderD.curveToRelative(0.0f, -0.54f, -0.3f, -2.7f, -2.99f, -2.7f);
        pathBuilderD.verticalLineTo(6.0f);
        pathBuilderD.curveToRelative(0.0f, -0.05f, 0.02f, -0.09f, 0.02f, -0.14f);
        pathBuilderD.lineTo(2.1f, 4.93f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(16.97f, 16.97f);
        pathBuilderD.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 20.49f, 21.9f, 20.0f, 17.17f);
        pathBuilderD.verticalLineTo(15.0f);
        pathBuilderD.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        pathBuilderD.reflectiveCurveTo(21.38f, 10.0f, 20.0f, 10.0f);
        pathBuilderD.verticalLineTo(6.0f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.horizontalLineToRelative(-4.0f);
        pathBuilderD.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        pathBuilderD.reflectiveCurveTo(9.0f, 2.62f, 9.0f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.k(pathBuilderD, 6.83f, 20.0f, 17.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extensionOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
