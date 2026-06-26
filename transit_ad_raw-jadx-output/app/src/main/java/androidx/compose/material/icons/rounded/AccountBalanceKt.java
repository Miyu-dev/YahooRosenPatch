package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.compose.animation.a;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accountBalance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountBalance", "Landroidx/compose/material/icons/Icons$Rounded;", "getAccountBalance", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AccountBalanceKt {
    private static ImageVector _accountBalance;

    public static final ImageVector getAccountBalance(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _accountBalance;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AccountBalance", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(4.0f, 11.5f, 4.0f);
        pathBuilderE.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderE.reflectiveCurveTo(7.0f, 16.33f, 7.0f, 15.5f);
        pathBuilderE.verticalLineToRelative(-4.0f);
        pathBuilderE.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderE.reflectiveCurveTo(4.0f, 10.67f, 4.0f, 11.5f);
        a.n(pathBuilderE, 10.0f, 11.5f, 4.0f);
        pathBuilderE.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderE.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderE.verticalLineToRelative(-4.0f);
        pathBuilderE.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderE.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        a.j(pathBuilderE, 3.5f, 22.0f, 16.0f);
        pathBuilderE.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderE.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderE.horizontalLineToRelative(-16.0f);
        pathBuilderE.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderE.reflectiveCurveTo(2.67f, 22.0f, 3.5f, 22.0f);
        a.n(pathBuilderE, 16.0f, 11.5f, 4.0f);
        pathBuilderE.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilderE.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilderE.verticalLineToRelative(-4.0f);
        pathBuilderE.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderE.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        androidx.browser.browseractions.a.y(pathBuilderE, 10.57f, 1.49f, -7.9f, 4.16f);
        pathBuilderE.curveToRelative(-0.41f, 0.21f, -0.67f, 0.64f, -0.67f, 1.1f);
        pathBuilderE.curveTo(2.0f, 7.44f, 2.56f, 8.0f, 3.25f, 8.0f);
        pathBuilderE.horizontalLineToRelative(16.51f);
        pathBuilderE.curveTo(20.44f, 8.0f, 21.0f, 7.44f, 21.0f, 6.75f);
        pathBuilderE.curveToRelative(0.0f, -0.46f, -0.26f, -0.89f, -0.67f, -1.1f);
        pathBuilderE.lineToRelative(-7.9f, -4.16f);
        pathBuilderE.curveToRelative(-0.58f, -0.31f, -1.28f, -0.31f, -1.86f, 0.0f);
        pathBuilderE.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountBalance = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
