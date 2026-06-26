package androidx.compose.material.icons.outlined;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: Tty.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tty", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tty", "Landroidx/compose/material/icons/Icons$Outlined;", "getTty", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TtyKt {
    private static ImageVector _tty;

    public static final ImageVector getTty(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _tty;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tty", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.app.m.v(16.0f, 6.0f, -2.0f, 4.0f, 2.0f);
        a.B(pathBuilderV, 6.0f, 18.0f, 7.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderV, 2.0f, 2.0f, 7.0f);
        androidx.browser.browseractions.a.A(pathBuilderV, 19.0f, 9.0f, 2.0f, 7.0f);
        b.m(pathBuilderV, -2.0f, 9.0f, 19.0f, 4.0f);
        androidx.compose.animation.a.B(pathBuilderV, -2.0f, 2.0f, 2.0f, 4.0f);
        a.x(pathBuilderV, 15.0f, 7.0f, -2.0f, 2.0f);
        b.m(pathBuilderV, 2.0f, 7.0f, 19.0f, 10.0f);
        androidx.compose.animation.a.B(pathBuilderV, -2.0f, 2.0f, 2.0f, 10.0f);
        a.x(pathBuilderV, 16.0f, 10.0f, -2.0f, 2.0f);
        b.m(pathBuilderV, 2.0f, 10.0f, 13.0f, 4.0f);
        androidx.compose.animation.a.B(pathBuilderV, -2.0f, 2.0f, 2.0f, 4.0f);
        pathBuilderV.moveTo(20.0f, 15.82f);
        pathBuilderV.verticalLineToRelative(4.15f);
        pathBuilderV.curveToRelative(0.0f, 0.56f, -0.47f, 1.03f, -1.03f, 1.0f);
        pathBuilderV.curveToRelative(-2.89f, -0.17f, -5.6f, -1.03f, -7.97f, -2.4f);
        pathBuilderV.curveTo(8.27f, 16.99f, 6.01f, 14.73f, 4.43f, 12.0f);
        pathBuilderV.curveTo(3.05f, 9.63f, 2.2f, 6.92f, 2.03f, 4.03f);
        pathBuilderV.curveTo(2.0f, 3.47f, 2.47f, 3.0f, 3.03f, 3.0f);
        pathBuilderV.horizontalLineToRelative(4.15f);
        pathBuilderV.curveToRelative(0.48f, 0.0f, 0.89f, 0.34f, 0.98f, 0.8f);
        pathBuilderV.lineTo(8.9f, 7.48f);
        pathBuilderV.curveToRelative(0.07f, 0.33f, -0.04f, 0.67f, -0.27f, 0.9f);
        pathBuilderV.lineTo(6.1f, 10.9f);
        pathBuilderV.curveToRelative(1.43f, 2.5f, 3.5f, 4.57f, 6.0f, 6.0f);
        pathBuilderV.lineToRelative(2.52f, -2.52f);
        pathBuilderV.curveToRelative(0.24f, -0.24f, 0.58f, -0.34f, 0.9f, -0.27f);
        pathBuilderV.lineToRelative(3.67f, 0.73f);
        pathBuilderV.curveTo(19.66f, 14.93f, 20.0f, 15.34f, 20.0f, 15.82f);
        androidx.browser.browseractions.a.y(pathBuilderV, 5.18f, 8.99f, 1.65f, -1.65f);
        pathBuilderV.lineTo(6.36f, 5.0f);
        pathBuilderV.horizontalLineTo(4.13f);
        pathBuilderV.curveTo(4.3f, 6.37f, 4.66f, 7.71f, 5.18f, 8.99f);
        androidx.browser.browseractions.a.y(pathBuilderV, 18.0f, 16.64f, -2.34f, -0.47f);
        pathBuilderV.lineToRelative(-1.65f, 1.65f);
        pathBuilderV.curveToRelative(1.28f, 0.52f, 2.63f, 0.87f, 3.99f, 1.05f);
        androidx.compose.animation.b.l(pathBuilderV, 16.64f, 20.0f, 4.0f, 2.0f);
        b.w(pathBuilderV, 2.0f, 4.0f, 20.0f);
        a.x(pathBuilderV, 20.0f, 12.0f, 2.0f, -2.0f);
        b.m(pathBuilderV, -2.0f, 12.0f, 13.0f, 10.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderV, -2.0f, 2.0f, 2.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tty = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
