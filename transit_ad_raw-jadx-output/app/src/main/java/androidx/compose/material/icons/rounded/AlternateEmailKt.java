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

/* JADX INFO: compiled from: AlternateEmail.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_alternateEmail", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AlternateEmail", "Landroidx/compose/material/icons/Icons$Rounded;", "getAlternateEmail", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AlternateEmailKt {
    private static ImageVector _alternateEmail;

    public static final ImageVector getAlternateEmail(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _alternateEmail;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlternateEmail", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.72f, 2.03f);
        pathBuilderD.curveTo(6.63f, 1.6f, 1.6f, 6.63f, 2.03f, 12.72f);
        pathBuilderD.curveTo(2.39f, 18.01f, 7.01f, 22.0f, 12.31f, 22.0f);
        pathBuilderD.horizontalLineTo(16.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(-3.67f);
        pathBuilderD.curveToRelative(-3.73f, 0.0f, -7.15f, -2.42f, -8.08f, -6.03f);
        pathBuilderD.curveToRelative(-1.49f, -5.8f, 3.91f, -11.21f, 9.71f, -9.71f);
        pathBuilderD.curveTo(17.58f, 5.18f, 20.0f, 8.6f, 20.0f, 12.33f);
        pathBuilderD.verticalLineToRelative(1.1f);
        pathBuilderD.curveToRelative(0.0f, 0.79f, -0.71f, 1.57f, -1.5f, 1.57f);
        pathBuilderD.reflectiveCurveToRelative(-1.5f, -0.78f, -1.5f, -1.57f);
        pathBuilderD.verticalLineToRelative(-1.25f);
        pathBuilderD.curveToRelative(0.0f, -2.51f, -1.78f, -4.77f, -4.26f, -5.12f);
        pathBuilderD.curveToRelative(-3.4f, -0.49f, -6.27f, 2.45f, -5.66f, 5.87f);
        pathBuilderD.curveToRelative(0.34f, 1.91f, 1.83f, 3.49f, 3.72f, 3.94f);
        pathBuilderD.curveToRelative(1.84f, 0.43f, 3.59f, -0.16f, 4.74f, -1.33f);
        pathBuilderD.curveToRelative(0.89f, 1.22f, 2.67f, 1.86f, 4.3f, 1.21f);
        pathBuilderD.curveToRelative(1.34f, -0.53f, 2.16f, -1.9f, 2.16f, -3.34f);
        pathBuilderD.verticalLineToRelative(-1.09f);
        pathBuilderD.curveToRelative(0.0f, -5.31f, -3.99f, -9.93f, -9.28f, -10.29f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 15.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderD, -1.34f, 3.0f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alternateEmail = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
