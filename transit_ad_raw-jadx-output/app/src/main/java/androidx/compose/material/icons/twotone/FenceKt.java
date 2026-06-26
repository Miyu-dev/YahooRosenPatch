package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Fence.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fence", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fence", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFence", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FenceKt {
    private static ImageVector _fence;

    public static final ImageVector getFence(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _fence;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Fence", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(16.0f, 6.83f, 1.0f, 1.0f, 10.0f);
        b.D(pathBuilderW, -2.0f, 7.83f, 0.41f, -0.41f);
        androidx.appcompat.view.menu.a.z(pathBuilderW, 16.0f, 6.83f, 12.0f, 6.83f);
        pathBuilderW.lineToRelative(0.59f, 0.59f);
        androidx.appcompat.app.m.r(pathBuilderW, 13.0f, 7.83f, 10.0f, -2.0f);
        pathBuilderW.verticalLineTo(7.83f);
        s.r(pathBuilderW, 0.41f, -0.41f, 12.0f, 6.83f);
        b.y(pathBuilderW, 11.0f, 14.0f, -2.0f, 2.0f);
        h.z(pathBuilderW, 2.0f, 11.0f, 13.0f, 16.0f);
        androidx.appcompat.view.menu.a.u(pathBuilderW, 2.0f, -2.0f, -2.0f, 13.0f);
        pathBuilderW.moveTo(7.0f, 7.83f);
        pathBuilderW.lineToRelative(1.0f, -1.0f);
        pathBuilderW.lineToRelative(0.59f, 0.59f);
        a.D(pathBuilderW, 9.0f, 7.83f, 10.0f, 7.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderW, 7.83f, 7.0f, 12.0f, 2.0f);
        d.f(pathBuilderW, 2.0f, 7.0f, 12.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderW, 7.0f, 16.0f, 2.0f, 2.0f);
        b.B(pathBuilderW, 7.0f, 16.0f, 17.0f, 18.0f);
        androidx.compose.animation.a.B(pathBuilderW, -2.0f, -2.0f, 2.0f, 18.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderW, 17.0f, 14.0f, -2.0f, -2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderW, 2.0f, 14.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(21.0f, 12.0f, -2.0f, -2.0f, 7.0f);
        pathBuilderV.lineToRelative(-3.0f, -3.0f);
        pathBuilderV.lineToRelative(-2.0f, 2.0f);
        pathBuilderV.lineToRelative(-2.0f, -2.0f);
        pathBuilderV.lineToRelative(-2.0f, 2.0f);
        pathBuilderV.lineTo(8.0f, 4.0f);
        androidx.appcompat.graphics.drawable.a.p(pathBuilderV, 5.0f, 7.0f, 3.0f, 3.0f);
        c.a.j(pathBuilderV, 2.0f, 2.0f, 2.0f, 3.0f);
        a.l(pathBuilderV, 2.0f, 2.0f, 4.0f, 14.0f);
        a.l(pathBuilderV, -4.0f, 2.0f, -2.0f, -2.0f);
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
        a.D(pathBuilderV, 9.0f, 7.83f, 10.0f, 7.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderV, 7.83f, 7.0f, 12.0f, 2.0f);
        d.f(pathBuilderV, 2.0f, 7.0f, 12.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 7.0f, 16.0f, 2.0f, 2.0f);
        b.B(pathBuilderV, 7.0f, 16.0f, 17.0f, 18.0f);
        androidx.compose.animation.a.B(pathBuilderV, -2.0f, -2.0f, 2.0f, 18.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 17.0f, 14.0f, -2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderV, 2.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fence = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
