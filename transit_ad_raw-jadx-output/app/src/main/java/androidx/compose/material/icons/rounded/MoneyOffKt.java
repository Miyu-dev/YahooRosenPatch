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

/* JADX INFO: compiled from: MoneyOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_moneyOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MoneyOff", "Landroidx/compose/material/icons/Icons$Rounded;", "getMoneyOff", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MoneyOffKt {
    private static ImageVector _moneyOff;

    public static final ImageVector getMoneyOff(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _moneyOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MoneyOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.5f, 6.9f);
        pathBuilderD.curveToRelative(1.42f, 0.0f, 2.13f, 0.54f, 2.39f, 1.4f);
        pathBuilderD.curveToRelative(0.13f, 0.43f, 0.56f, 0.7f, 1.01f, 0.7f);
        pathBuilderD.horizontalLineToRelative(0.06f);
        pathBuilderD.curveToRelative(0.7f, 0.0f, 1.22f, -0.71f, 0.97f, -1.36f);
        pathBuilderD.curveToRelative(-0.44f, -1.15f, -1.41f, -2.08f, -2.93f, -2.45f);
        pathBuilderD.verticalLineTo(4.5f);
        pathBuilderD.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(11.0f, 3.67f, 11.0f, 4.5f);
        pathBuilderD.verticalLineToRelative(0.66f);
        pathBuilderD.curveToRelative(-0.39f, 0.08f, -0.75f, 0.21f, -1.1f, 0.36f);
        pathBuilderD.lineToRelative(1.51f, 1.51f);
        pathBuilderD.curveToRelative(0.32f, -0.08f, 0.69f, -0.13f, 1.09f, -0.13f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.77f, 4.62f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineTo(7.5f, 8.77f);
        pathBuilderD.curveToRelative(0.0f, 2.08f, 1.56f, 3.22f, 3.91f, 3.91f);
        pathBuilderD.lineToRelative(3.51f, 3.51f);
        pathBuilderD.curveToRelative(-0.34f, 0.49f, -1.05f, 0.91f, -2.42f, 0.91f);
        pathBuilderD.curveToRelative(-1.65f, 0.0f, -2.5f, -0.59f, -2.83f, -1.43f);
        pathBuilderD.curveToRelative(-0.15f, -0.39f, -0.49f, -0.67f, -0.9f, -0.67f);
        pathBuilderD.horizontalLineTo(8.6f);
        pathBuilderD.curveToRelative(-0.72f, 0.0f, -1.24f, 0.74f, -0.95f, 1.39f);
        pathBuilderD.curveToRelative(0.59f, 1.33f, 1.89f, 2.12f, 3.36f, 2.44f);
        pathBuilderD.verticalLineToRelative(0.67f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.verticalLineToRelative(-0.65f);
        pathBuilderD.curveToRelative(0.96f, -0.18f, 1.83f, -0.55f, 2.46f, -1.12f);
        pathBuilderD.lineToRelative(1.51f, 1.51f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineTo(6.18f, 4.62f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moneyOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
