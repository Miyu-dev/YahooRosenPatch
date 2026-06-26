package androidx.compose.material.icons.rounded;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Balance.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_balance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Balance", "Landroidx/compose/material/icons/Icons$Rounded;", "getBalance", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BalanceKt {
    private static ImageVector _balance;

    public static final ImageVector getBalance(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _balance;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Balance", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(13.0f, 19.0f, 7.83f);
        pathBuilderN.curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f);
        pathBuilderN.horizontalLineTo(18.0f);
        pathBuilderN.lineToRelative(-2.78f, 6.49f);
        pathBuilderN.curveToRelative(-0.17f, 0.39f, -0.23f, 0.84f, -0.11f, 1.25f);
        pathBuilderN.curveToRelative(0.39f, 1.3f, 1.76f, 2.26f, 3.39f, 2.26f);
        pathBuilderN.reflectiveCurveToRelative(3.01f, -0.96f, 3.39f, -2.26f);
        pathBuilderN.curveToRelative(0.12f, -0.41f, 0.06f, -0.86f, -0.11f, -1.25f);
        pathBuilderN.lineTo(19.0f, 6.0f);
        pathBuilderN.horizontalLineToRelative(1.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderN.horizontalLineToRelative(-5.17f);
        pathBuilderN.curveTo(14.42f, 2.83f, 13.31f, 2.0f, 12.0f, 2.0f);
        pathBuilderN.reflectiveCurveTo(9.58f, 2.83f, 9.17f, 4.0f);
        pathBuilderN.lineTo(4.0f, 4.0f);
        pathBuilderN.curveTo(3.45f, 4.0f, 3.0f, 4.45f, 3.0f, 5.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderN.horizontalLineToRelative(1.0f);
        pathBuilderN.lineToRelative(-2.78f, 6.49f);
        pathBuilderN.curveToRelative(-0.17f, 0.39f, -0.23f, 0.84f, -0.11f, 1.25f);
        pathBuilderN.curveTo(2.49f, 15.04f, 3.87f, 16.0f, 5.5f, 16.0f);
        pathBuilderN.reflectiveCurveToRelative(3.01f, -0.96f, 3.39f, -2.26f);
        pathBuilderN.curveToRelative(0.12f, -0.41f, 0.06f, -0.86f, -0.11f, -1.25f);
        pathBuilderN.lineTo(6.0f, 6.0f);
        pathBuilderN.horizontalLineToRelative(3.17f);
        pathBuilderN.curveToRelative(0.3f, 0.85f, 0.98f, 1.53f, 1.83f, 1.83f);
        pathBuilderN.verticalLineTo(19.0f);
        pathBuilderN.moveTo(11.0f, 19.0f);
        pathBuilderN.horizontalLineTo(3.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderN.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderN.horizontalLineToRelative(18.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderN.horizontalLineToRelative(-8.0f);
        pathBuilderN.moveTo(20.37f, 13.0f);
        pathBuilderN.horizontalLineToRelative(-3.74f);
        s.r(pathBuilderN, 1.87f, -4.36f, 20.37f, 13.0f);
        pathBuilderN.moveTo(7.37f, 13.0f);
        pathBuilderN.horizontalLineTo(3.63f);
        a.C(pathBuilderN, 5.5f, 8.64f, 7.37f, 13.0f);
        pathBuilderN.moveTo(12.0f, 6.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderN.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderN.curveTo(13.0f, 5.55f, 12.55f, 6.0f, 12.0f, 6.0f);
        pathBuilderN.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderN.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _balance = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
