package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: HeartBroken.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_heartBroken", "Landroidx/compose/ui/graphics/vector/ImageVector;", "HeartBroken", "Landroidx/compose/material/icons/Icons$Outlined;", "getHeartBroken", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class HeartBrokenKt {
    private static ImageVector _heartBroken;

    public static final ImageVector getHeartBroken(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _heartBroken;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HeartBroken", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(16.5f, 3.0f);
        pathBuilderD.curveToRelative(-0.96f, 0.0f, -1.9f, 0.25f, -2.73f, 0.69f);
        pathBuilderD.lineTo(12.0f, 9.0f);
        pathBuilderD.horizontalLineToRelative(3.0f);
        pathBuilderD.lineToRelative(-3.0f, 10.0f);
        pathBuilderD.lineToRelative(1.0f, -9.0f);
        pathBuilderD.horizontalLineToRelative(-3.0f);
        pathBuilderD.lineToRelative(1.54f, -5.39f);
        pathBuilderD.curveTo(10.47f, 3.61f, 9.01f, 3.0f, 7.5f, 3.0f);
        pathBuilderD.curveTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        pathBuilderD.curveToRelative(0.0f, 4.13f, 4.16f, 7.18f, 10.0f, 12.5f);
        pathBuilderD.curveToRelative(5.47f, -4.94f, 10.0f, -8.26f, 10.0f, -12.5f);
        pathBuilderD.curveTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.24f, 16.73f);
        pathBuilderD.curveTo(6.45f, 13.34f, 4.0f, 11.0f, 4.0f, 8.5f);
        pathBuilderD.curveTo(4.0f, 6.54f, 5.54f, 5.0f, 7.5f, 5.0f);
        pathBuilderD.curveToRelative(0.59f, 0.0f, 1.19f, 0.15f, 1.73f, 0.42f);
        pathBuilderD.lineTo(7.35f, 12.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderD, 3.42f, 10.24f, 16.73f);
        pathBuilderD.moveTo(15.13f, 15.53f);
        pathBuilderD.lineTo(17.69f, 7.0f);
        pathBuilderD.horizontalLineToRelative(-2.91f);
        pathBuilderD.lineToRelative(0.61f, -1.82f);
        pathBuilderD.curveTo(15.75f, 5.06f, 16.13f, 5.0f, 16.5f, 5.0f);
        pathBuilderD.curveTo(18.46f, 5.0f, 20.0f, 6.54f, 20.0f, 8.5f);
        pathBuilderD.curveTo(20.0f, 10.71f, 17.98f, 12.93f, 15.13f, 15.53f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _heartBroken = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
