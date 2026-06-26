package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: FormatTextdirectionLToR.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_formatTextdirectionLToR", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FormatTextdirectionLToR", "Landroidx/compose/material/icons/Icons$Filled;", "getFormatTextdirectionLToR", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FormatTextdirectionLToRKt {
    private static ImageVector _formatTextdirectionLToR;

    public static final ImageVector getFormatTextdirectionLToR(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _formatTextdirectionLToR;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FormatTextdirectionLToR", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(9.0f, 10.0f, 5.0f, 2.0f);
        androidx.compose.animation.a.o(pathBuilderE, 11.0f, 4.0f, 2.0f, 11.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderE, 2.0f, 15.0f, 4.0f, 2.0f);
        pathBuilderE.lineTo(17.0f, 2.0f);
        pathBuilderE.lineTo(9.0f, 2.0f);
        pathBuilderE.curveTo(6.79f, 2.0f, 5.0f, 3.79f, 5.0f, 6.0f);
        pathBuilderE.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        a.y(pathBuilderE, 21.0f, 18.0f, -4.0f, -4.0f);
        v.y(pathBuilderE, 3.0f, 5.0f, 17.0f, 2.0f);
        pathBuilderE.horizontalLineToRelative(12.0f);
        pathBuilderE.verticalLineToRelative(3.0f);
        pathBuilderE.lineToRelative(4.0f, -4.0f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatTextdirectionLToR = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
