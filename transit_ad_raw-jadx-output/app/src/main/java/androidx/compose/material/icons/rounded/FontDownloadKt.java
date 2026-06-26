package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: FontDownload.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fontDownload", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FontDownload", "Landroidx/compose/material/icons/Icons$Rounded;", "getFontDownload", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FontDownloadKt {
    private static ImageVector _fontDownload;

    public static final ImageVector getFontDownload(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _fontDownload;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FontDownload", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(9.93f, 13.5f, 4.14f, 12.0f, 7.98f);
        a.z(pathBuilderC, 9.93f, 13.5f, 20.0f, 2.0f);
        pathBuilderC.lineTo(4.0f, 2.0f);
        pathBuilderC.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderC.verticalLineToRelative(16.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.horizontalLineToRelative(16.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.lineTo(22.0f, 4.0f);
        pathBuilderC.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        androidx.browser.browseractions.a.y(pathBuilderC, 15.71f, 17.88f, -0.9f, -2.38f);
        pathBuilderC.lineTo(9.17f, 15.5f);
        pathBuilderC.lineToRelative(-0.89f, 2.37f);
        pathBuilderC.curveToRelative(-0.14f, 0.38f, -0.5f, 0.63f, -0.91f, 0.63f);
        pathBuilderC.curveToRelative(-0.68f, 0.0f, -1.15f, -0.69f, -0.9f, -1.32f);
        pathBuilderC.lineToRelative(4.25f, -10.81f);
        pathBuilderC.curveToRelative(0.22f, -0.53f, 0.72f, -0.87f, 1.28f, -0.87f);
        pathBuilderC.reflectiveCurveToRelative(1.06f, 0.34f, 1.27f, 0.87f);
        pathBuilderC.lineToRelative(4.25f, 10.81f);
        pathBuilderC.curveToRelative(0.25f, 0.63f, -0.22f, 1.32f, -0.9f, 1.32f);
        pathBuilderC.curveToRelative(-0.4f, 0.0f, -0.76f, -0.25f, -0.91f, -0.62f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownload = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
