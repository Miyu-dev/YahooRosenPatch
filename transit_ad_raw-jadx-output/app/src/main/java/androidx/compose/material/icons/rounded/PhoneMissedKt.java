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

/* JADX INFO: compiled from: PhoneMissed.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phoneMissed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PhoneMissed", "Landroidx/compose/material/icons/Icons$Rounded;", "getPhoneMissed", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneMissed", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(23.09f, 16.2f);
        pathBuilderD.curveToRelative(-6.33f, -5.59f, -15.86f, -5.59f, -22.18f, 0.0f);
        pathBuilderD.curveToRelative(-0.84f, 0.74f, -0.84f, 2.05f, -0.05f, 2.84f);
        pathBuilderD.lineToRelative(1.2f, 1.2f);
        pathBuilderD.curveToRelative(0.71f, 0.71f, 1.84f, 0.77f, 2.62f, 0.15f);
        pathBuilderD.lineToRelative(1.97f, -1.57f);
        pathBuilderD.curveToRelative(0.47f, -0.37f, 0.75f, -0.94f, 0.75f, -1.55f);
        pathBuilderD.verticalLineTo(14.7f);
        pathBuilderD.curveToRelative(2.98f, -0.97f, 6.21f, -0.98f, 9.2f, 0.0f);
        pathBuilderD.verticalLineToRelative(2.58f);
        pathBuilderD.curveToRelative(0.0f, 0.6f, 0.28f, 1.17f, 0.75f, 1.55f);
        pathBuilderD.lineToRelative(1.96f, 1.56f);
        pathBuilderD.curveToRelative(0.79f, 0.62f, 1.91f, 0.56f, 2.62f, -0.15f);
        pathBuilderD.lineToRelative(1.2f, -1.2f);
        pathBuilderD.curveToRelative(0.8f, -0.79f, 0.79f, -2.1f, -0.04f, -2.84f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.0f, 9.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.verticalLineTo(6.43f);
        pathBuilderD.lineToRelative(4.24f, 4.24f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(5.66f, -5.66f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.lineToRelative(-4.95f, 4.95f);
        pathBuilderD.lineTo(8.4f, 5.0f);
        pathBuilderD.horizontalLineTo(10.0f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineTo(6.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
