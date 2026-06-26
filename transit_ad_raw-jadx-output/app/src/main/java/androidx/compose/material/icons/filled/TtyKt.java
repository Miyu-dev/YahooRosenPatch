package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: Tty.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tty", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tty", "Landroidx/compose/material/icons/Icons$Filled;", "getTty", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TtyKt {
    private static ImageVector _tty;

    public static final ImageVector getTty(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _tty;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Tty", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(14.0f, 4.0f, 2.0f, 2.0f, -2.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderF, 4.0f, 13.0f, 7.0f, 2.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderF, 2.0f, -2.0f, 7.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 11.0f, 4.0f, 2.0f, 2.0f);
        b.m(pathBuilderF, -2.0f, 4.0f, 18.0f, 9.0f);
        v.w(pathBuilderF, -2.0f, 7.0f, 2.0f, 9.0f);
        a.A(pathBuilderF, 19.0f, 6.0f, -2.0f, 4.0f);
        b.m(pathBuilderF, 2.0f, 6.0f, 21.0f, 9.0f);
        v.w(pathBuilderF, -2.0f, 7.0f, 2.0f, 9.0f);
        a.A(pathBuilderF, 22.0f, 6.0f, -2.0f, 4.0f);
        b.m(pathBuilderF, 2.0f, 6.0f, 14.62f, 14.38f);
        pathBuilderF.lineTo(12.1f, 16.9f);
        pathBuilderF.curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6.0f, -6.0f);
        pathBuilderF.lineToRelative(2.52f, -2.52f);
        pathBuilderF.curveTo(8.86f, 8.14f, 8.96f, 7.8f, 8.9f, 7.48f);
        pathBuilderF.lineTo(8.16f, 3.8f);
        pathBuilderF.curveTo(8.07f, 3.34f, 7.66f, 3.0f, 7.18f, 3.0f);
        pathBuilderF.horizontalLineTo(3.03f);
        pathBuilderF.curveTo(2.47f, 3.0f, 2.0f, 3.47f, 2.03f, 4.03f);
        pathBuilderF.curveTo(2.2f, 6.92f, 3.05f, 9.63f, 4.43f, 12.0f);
        pathBuilderF.curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f);
        pathBuilderF.curveToRelative(2.37f, 1.37f, 5.08f, 2.23f, 7.97f, 2.4f);
        pathBuilderF.curveToRelative(0.56f, 0.03f, 1.03f, -0.44f, 1.03f, -1.0f);
        pathBuilderF.verticalLineToRelative(-4.15f);
        pathBuilderF.curveToRelative(0.0f, -0.48f, -0.34f, -0.89f, -0.8f, -0.98f);
        pathBuilderF.lineToRelative(-3.67f, -0.73f);
        pathBuilderF.curveTo(15.2f, 14.04f, 14.86f, 14.14f, 14.62f, 14.38f);
        androidx.compose.animation.b.r(pathBuilderF, 14.0f, 10.0f, 2.0f, 2.0f);
        b.m(pathBuilderF, -2.0f, 10.0f, 11.0f, 10.0f);
        androidx.compose.animation.a.B(pathBuilderF, 2.0f, 2.0f, -2.0f, 10.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderF, 19.0f, 12.0f, -2.0f, -2.0f);
        b.m(pathBuilderF, 2.0f, 12.0f, 22.0f, 12.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderF, -2.0f, -2.0f, 2.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tty = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
