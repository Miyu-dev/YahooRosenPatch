package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Fence.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fence", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fence", "Landroidx/compose/material/icons/Icons$Sharp;", "getFence", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FenceKt {
    private static ImageVector _fence;

    public static final ImageVector getFence(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _fence;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Fence", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(21.0f, 12.0f, -2.0f, -2.0f, 7.0f);
        pathBuilderV.lineToRelative(-3.0f, -3.0f);
        pathBuilderV.lineToRelative(-2.0f, 2.0f);
        pathBuilderV.lineToRelative(-2.0f, -2.0f);
        pathBuilderV.lineToRelative(-2.0f, 2.0f);
        pathBuilderV.lineTo(8.0f, 4.0f);
        a.p(pathBuilderV, 5.0f, 7.0f, 3.0f, 3.0f);
        c.a.j(pathBuilderV, 2.0f, 2.0f, 2.0f, 3.0f);
        androidx.browser.browseractions.a.l(pathBuilderV, 2.0f, 2.0f, 4.0f, 14.0f);
        androidx.browser.browseractions.a.l(pathBuilderV, -4.0f, 2.0f, -2.0f, -2.0f);
        h.z(pathBuilderV, -2.0f, 21.0f, 16.0f, 6.83f);
        s.D(pathBuilderV, 1.0f, 1.0f, 10.0f, -2.0f);
        pathBuilderV.verticalLineTo(7.83f);
        s.r(pathBuilderV, 0.41f, -0.41f, 16.0f, 6.83f);
        pathBuilderV.moveTo(12.0f, 6.83f);
        pathBuilderV.lineToRelative(0.59f, 0.59f);
        androidx.appcompat.app.m.r(pathBuilderV, 13.0f, 7.83f, 10.0f, -2.0f);
        pathBuilderV.verticalLineTo(7.83f);
        s.r(pathBuilderV, 0.41f, -0.41f, 12.0f, 6.83f);
        b.y(pathBuilderV, 11.0f, 14.0f, -2.0f, 2.0f);
        h.z(pathBuilderV, 2.0f, 11.0f, 13.0f, 16.0f);
        androidx.appcompat.view.menu.a.u(pathBuilderV, 2.0f, -2.0f, -2.0f, 13.0f);
        pathBuilderV.moveTo(7.0f, 7.83f);
        pathBuilderV.lineToRelative(1.0f, -1.0f);
        pathBuilderV.lineToRelative(0.59f, 0.59f);
        androidx.browser.browseractions.a.D(pathBuilderV, 9.0f, 7.83f, 10.0f, 7.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderV, 7.83f, 7.0f, 12.0f, 2.0f);
        d.f(pathBuilderV, 2.0f, 7.0f, 12.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 7.0f, 16.0f, 2.0f, 2.0f);
        b.B(pathBuilderV, 7.0f, 16.0f, 17.0f, 18.0f);
        androidx.compose.animation.a.B(pathBuilderV, -2.0f, -2.0f, 2.0f, 18.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 17.0f, 14.0f, -2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderV, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fence = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
