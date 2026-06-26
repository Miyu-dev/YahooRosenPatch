package androidx.compose.material.icons.rounded;

import a6.h;
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

/* JADX INFO: compiled from: FormatSize.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatSize", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatSize", "Landroidx/compose/material/icons/Icons$Rounded;", "getFormatSize", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FormatSizeKt {
    private static ImageVector _formatSize;

    public static final ImageVector getFormatSize(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _formatSize;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatSize", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(9.0f, 5.5f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.horizontalLineTo(14.0f);
        pathBuilderD.verticalLineToRelative(10.5f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.verticalLineTo(7.0f);
        pathBuilderD.horizontalLineToRelative(3.5f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(21.33f, 4.0f, 20.5f, 4.0f);
        pathBuilderD.horizontalLineToRelative(-10.0f);
        pathBuilderD.curveTo(9.67f, 4.0f, 9.0f, 4.67f, 9.0f, 5.5f);
        a.q(pathBuilderD, 4.5f, 12.0f, 6.0f, 5.5f);
        pathBuilderD.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(9.0f, 18.33f, 9.0f, 17.5f);
        pathBuilderD.verticalLineTo(12.0f);
        pathBuilderD.horizontalLineToRelative(1.5f);
        pathBuilderD.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveTo(11.33f, 9.0f, 10.5f, 9.0f);
        pathBuilderD.horizontalLineToRelative(-6.0f);
        pathBuilderD.curveTo(3.67f, 9.0f, 3.0f, 9.67f, 3.0f, 10.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 3.67f, 12.0f, 4.5f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatSize = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
