package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: CurrencyRupee.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_currencyRupee", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyRupee", "Landroidx/compose/material/icons/Icons$Rounded;", "getCurrencyRupee", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CurrencyRupeeKt {
    private static ImageVector _currencyRupee;

    public static final ImageVector getCurrencyRupee(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _currencyRupee;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyRupee", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderS = h.s(10.5f, 14.0f, 9.77f, 5.1f, 5.31f);
        pathBuilderS.curveToRelative(0.61f, 0.64f, 0.16f, 1.69f, -0.72f, 1.69f);
        pathBuilderS.curveToRelative(-0.27f, 0.0f, -0.53f, -0.11f, -0.72f, -0.31f);
        pathBuilderS.lineTo(7.4f, 14.41f);
        pathBuilderS.curveTo(7.14f, 14.15f, 7.0f, 13.79f, 7.0f, 13.43f);
        pathBuilderS.curveTo(7.0f, 12.64f, 7.64f, 12.0f, 8.43f, 12.0f);
        pathBuilderS.horizontalLineToRelative(2.07f);
        pathBuilderS.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        pathBuilderS.lineTo(7.0f, 9.0f);
        pathBuilderS.curveTo(6.45f, 9.0f, 6.0f, 8.55f, 6.0f, 8.0f);
        pathBuilderS.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderS.lineToRelative(6.66f, 0.0f);
        pathBuilderS.curveTo(13.1f, 5.82f, 11.9f, 5.0f, 10.5f, 5.0f);
        pathBuilderS.lineTo(7.0f, 5.0f);
        pathBuilderS.curveTo(6.45f, 5.0f, 6.0f, 4.55f, 6.0f, 4.0f);
        pathBuilderS.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderS.horizontalLineToRelative(10.0f);
        pathBuilderS.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderS.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderS.lineToRelative(-2.26f, 0.0f);
        pathBuilderS.curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2.0f);
        pathBuilderS.lineTo(17.0f, 7.0f);
        pathBuilderS.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderS.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderS.lineToRelative(-1.02f, 0.0f);
        pathBuilderS.curveTo(15.72f, 11.8f, 13.36f, 14.0f, 10.5f, 14.0f);
        pathBuilderS.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderS.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyRupee = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
