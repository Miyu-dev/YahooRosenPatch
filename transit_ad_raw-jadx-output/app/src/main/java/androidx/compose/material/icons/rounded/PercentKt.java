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

/* JADX INFO: compiled from: Percent.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_percent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Percent", "Landroidx/compose/material/icons/Icons$Rounded;", "getPercent", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PercentKt {
    private static ImageVector _percent;

    public static final ImageVector getPercent(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _percent;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Percent", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(7.5f, 4.0f);
        pathBuilderD.curveTo(5.57f, 4.0f, 4.0f, 5.57f, 4.0f, 7.5f);
        pathBuilderD.reflectiveCurveTo(5.57f, 11.0f, 7.5f, 11.0f);
        pathBuilderD.reflectiveCurveTo(11.0f, 9.43f, 11.0f, 7.5f);
        pathBuilderD.reflectiveCurveTo(9.43f, 4.0f, 7.5f, 4.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.5f, 9.0f);
        pathBuilderD.curveTo(6.67f, 9.0f, 6.0f, 8.33f, 6.0f, 7.5f);
        pathBuilderD.reflectiveCurveTo(6.67f, 6.0f, 7.5f, 6.0f);
        pathBuilderD.reflectiveCurveTo(9.0f, 6.67f, 9.0f, 7.5f);
        pathBuilderD.reflectiveCurveTo(8.33f, 9.0f, 7.5f, 9.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.5f, 13.0f);
        pathBuilderD.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilderD.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilderD.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderD.reflectiveCurveTo(18.43f, 13.0f, 16.5f, 13.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.5f, 18.0f);
        pathBuilderD.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(17.33f, 18.0f, 16.5f, 18.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.29f, 4.71f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineTo(6.12f, 19.29f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineTo(17.88f, 4.71f);
        pathBuilderD.curveTo(18.27f, 4.32f, 18.9f, 4.32f, 19.29f, 4.71f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _percent = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
