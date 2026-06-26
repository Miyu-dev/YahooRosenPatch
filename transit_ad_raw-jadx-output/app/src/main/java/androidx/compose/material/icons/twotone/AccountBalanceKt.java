package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
import androidx.compose.animation.b;
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

/* JADX INFO: compiled from: AccountBalance.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accountBalance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountBalance", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAccountBalance", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AccountBalanceKt {
    private static ImageVector _accountBalance;

    public static final ImageVector getAccountBalance(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _accountBalance;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AccountBalance", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(b.a(6.29f, 6.0f, 5.21f, -2.74f), 16.71f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(6.5f, 10.0f, -2.0f, 7.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderF, -7.0f, 12.5f, 10.0f, -2.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderF, 7.0f, 2.0f, -7.0f);
        pathBuilderF.moveTo(21.0f, 19.0f);
        a.b.s(pathBuilderF, 2.0f, 19.0f, 2.0f, 19.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderF, -2.0f, 18.5f, 10.0f, -2.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderF, 7.0f, 2.0f, -7.0f);
        pathBuilderF.moveTo(11.5f, 1.0f);
        a.b.s(pathBuilderF, 2.0f, 6.0f, 2.0f, 19.0f);
        androidx.compose.animation.a.A(pathBuilderF, 21.0f, 6.0f, -9.5f, -5.0f);
        pathBuilderF.moveTo(6.29f, 6.0f);
        pathBuilderF.lineToRelative(5.21f, -2.74f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderF, 16.71f, 6.0f, 6.29f, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountBalance = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
