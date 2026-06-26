package androidx.compose.material.icons.twotone;

import a.b;
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

/* JADX INFO: compiled from: CurrencyBitcoin.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_currencyBitcoin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyBitcoin", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCurrencyBitcoin", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CurrencyBitcoinKt {
    private static ImageVector _currencyBitcoin;

    public static final ImageVector getCurrencyBitcoin(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _currencyBitcoin;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CurrencyBitcoin", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(17.06f, 11.57f);
        pathBuilderD.curveTo(17.65f, 10.88f, 18.0f, 9.98f, 18.0f, 9.0f);
        pathBuilderD.curveToRelative(0.0f, -1.86f, -1.27f, -3.43f, -3.0f, -3.87f);
        androidx.compose.animation.a.o(pathBuilderD, 15.0f, 3.0f, -2.0f, 2.0f);
        b.C(pathBuilderD, -2.0f, 3.0f, 9.0f, 2.0f);
        a.B(pathBuilderD, 6.0f, 2.0f, 2.0f, 10.0f);
        a.B(pathBuilderD, 6.0f, 2.0f, 3.0f, 2.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 2.0f, -2.0f, 2.0f, 2.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.verticalLineToRelative(-2.0f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderD.curveTo(19.0f, 13.55f, 18.22f, 12.27f, 17.06f, 11.57f);
        androidx.compose.animation.a.j(pathBuilderD, 10.0f, 7.0f, 4.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.m(pathBuilderD, -4.0f, 7.0f, 15.0f, 17.0f);
        android.support.v4.media.a.s(pathBuilderD, -5.0f, -4.0f, 5.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 16.1f, 17.0f, 15.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyBitcoin = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
