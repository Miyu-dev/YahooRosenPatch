package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: CurrencyLira.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_currencyLira", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyLira", "Landroidx/compose/material/icons/Icons$Outlined;", "getCurrencyLira", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CurrencyLiraKt {
    private static ImageVector _currencyLira;

    public static final ImageVector getCurrencyLira(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _currencyLira;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CurrencyLira", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(9.0f, 8.76f, 3.0f, 2.0f, 4.51f);
        pathBuilderC.lineTo(15.0f, 5.0f);
        pathBuilderC.verticalLineToRelative(2.36f);
        pathBuilderC.lineToRelative(-4.0f, 2.51f);
        pathBuilderC.lineToRelative(0.01f, 2.35f);
        pathBuilderC.lineTo(15.0f, 9.72f);
        a.z(pathBuilderC, 2.36f, -4.0f, 2.51f, 19.0f);
        pathBuilderC.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.curveToRelative(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        androidx.compose.animation.a.z(pathBuilderC, 9.0f, -5.16f, -3.0f, 1.88f);
        pathBuilderC.lineToRelative(0.0f, -2.36f);
        pathBuilderC.lineToRelative(3.0f, -1.88f);
        pathBuilderC.verticalLineToRelative(-2.36f);
        pathBuilderC.lineTo(6.0f, 13.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderC, 0.0f, -2.36f, 9.0f, 8.76f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyLira = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
