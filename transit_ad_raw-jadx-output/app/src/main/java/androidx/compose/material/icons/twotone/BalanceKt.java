package androidx.compose.material.icons.twotone;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Balance.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_balance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Balance", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBalance", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BalanceKt {
    private static ImageVector _balance;

    public static final ImageVector getBalance(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _balance;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Balance", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(12.0f, 5.0f, -1.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilderB.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.0f, 7.83f);
        pathBuilderD.curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f);
        pathBuilderD.horizontalLineTo(18.0f);
        pathBuilderD.lineToRelative(-3.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, 1.66f, 1.57f, 3.0f, 3.5f, 3.0f);
        pathBuilderD.reflectiveCurveToRelative(3.5f, -1.34f, 3.5f, -3.0f);
        androidx.appcompat.view.menu.a.D(pathBuilderD, -3.0f, -7.0f, 2.0f, 4.0f);
        pathBuilderD.horizontalLineToRelative(-6.17f);
        pathBuilderD.curveTo(14.42f, 2.83f, 13.31f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(9.58f, 2.83f, 9.17f, 4.0f);
        b.s(pathBuilderD, 3.0f, 4.0f, 2.0f, 2.0f);
        pathBuilderD.lineToRelative(-3.0f, 7.0f);
        pathBuilderD.curveToRelative(0.0f, 1.66f, 1.57f, 3.0f, 3.5f, 3.0f);
        pathBuilderD.reflectiveCurveTo(9.0f, 14.66f, 9.0f, 13.0f);
        pathBuilderD.lineTo(6.0f, 6.0f);
        pathBuilderD.horizontalLineToRelative(3.17f);
        pathBuilderD.curveToRelative(0.3f, 0.85f, 0.98f, 1.53f, 1.83f, 1.83f);
        androidx.compose.animation.b.x(pathBuilderD, 19.0f, 2.0f, 2.0f, 20.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderD, -2.0f, -9.0f, 7.83f);
        pathBuilderD.moveTo(20.37f, 13.0f);
        pathBuilderD.horizontalLineToRelative(-3.74f);
        s.r(pathBuilderD, 1.87f, -4.36f, 20.37f, 13.0f);
        pathBuilderD.moveTo(7.37f, 13.0f);
        pathBuilderD.horizontalLineTo(3.63f);
        android.support.v4.media.a.C(pathBuilderD, 5.5f, 8.64f, 7.37f, 13.0f);
        pathBuilderD.moveTo(12.0f, 6.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.curveTo(13.0f, 5.55f, 12.55f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _balance = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
