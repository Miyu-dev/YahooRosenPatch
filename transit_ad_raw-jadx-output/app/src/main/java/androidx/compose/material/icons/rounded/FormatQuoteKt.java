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

/* JADX INFO: compiled from: FormatQuote.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatQuote", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatQuote", "Landroidx/compose/material/icons/Icons$Rounded;", "getFormatQuote", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FormatQuoteKt {
    private static ImageVector _formatQuote;

    public static final ImageVector getFormatQuote(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _formatQuote;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatQuote", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(7.17f, 17.0f);
        pathBuilderD.curveToRelative(0.51f, 0.0f, 0.98f, -0.29f, 1.2f, -0.74f);
        pathBuilderD.lineToRelative(1.42f, -2.84f);
        pathBuilderD.curveToRelative(0.14f, -0.28f, 0.21f, -0.58f, 0.21f, -0.89f);
        pathBuilderD.lineTo(10.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.lineTo(5.0f, 7.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.lineToRelative(-1.03f, 2.06f);
        pathBuilderD.curveToRelative(-0.45f, 0.89f, 0.2f, 1.94f, 1.2f, 1.94f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.17f, 17.0f);
        pathBuilderD.curveToRelative(0.51f, 0.0f, 0.98f, -0.29f, 1.2f, -0.74f);
        pathBuilderD.lineToRelative(1.42f, -2.84f);
        pathBuilderD.curveToRelative(0.14f, -0.28f, 0.21f, -0.58f, 0.21f, -0.89f);
        pathBuilderD.lineTo(20.0f, 8.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderD.horizontalLineToRelative(-4.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.lineToRelative(-1.03f, 2.06f);
        pathBuilderD.curveToRelative(-0.45f, 0.89f, 0.2f, 1.94f, 1.2f, 1.94f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatQuote = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
