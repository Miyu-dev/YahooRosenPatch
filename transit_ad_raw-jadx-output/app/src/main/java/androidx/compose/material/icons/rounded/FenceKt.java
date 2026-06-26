package androidx.compose.material.icons.rounded;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fence", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fence", "Landroidx/compose/material/icons/Icons$Rounded;", "getFence", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FenceKt {
    private static ImageVector _fence;

    public static final ImageVector getFence(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _fence;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Fence", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(21.0f, 11.0f, 21.0f, 11.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.D(pathBuilderA, -1.0f, 7.0f, -2.29f, -2.29f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderA.lineTo(14.0f, 6.0f);
        pathBuilderA.lineToRelative(-1.29f, -1.29f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderA.lineTo(10.0f, 6.0f);
        pathBuilderA.lineTo(8.71f, 4.71f);
        pathBuilderA.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        a.p(pathBuilderA, 5.0f, 7.0f, 3.0f, 4.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        v.t(pathBuilderA, 1.0f, 2.0f, 4.0f);
        pathBuilderA.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(1.0f);
        pathBuilderA.verticalLineToRelative(3.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(12.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-3.0f);
        pathBuilderA.horizontalLineToRelative(1.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        android.support.v4.media.a.s(pathBuilderA, -1.0f, -2.0f, 1.0f);
        pathBuilderA.curveTo(20.55f, 12.0f, 21.0f, 11.55f, 21.0f, 11.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 16.0f, 6.83f, 1.0f, 1.0f);
        h.w(pathBuilderA, 10.0f, -2.0f, 7.83f);
        s.r(pathBuilderA, 0.41f, -0.41f, 16.0f, 6.83f);
        pathBuilderA.moveTo(12.0f, 6.83f);
        pathBuilderA.lineToRelative(0.59f, 0.59f);
        androidx.appcompat.app.m.r(pathBuilderA, 13.0f, 7.83f, 10.0f, -2.0f);
        pathBuilderA.verticalLineTo(7.83f);
        s.r(pathBuilderA, 0.41f, -0.41f, 12.0f, 6.83f);
        b.y(pathBuilderA, 11.0f, 14.0f, -2.0f, 2.0f);
        h.z(pathBuilderA, 2.0f, 11.0f, 13.0f, 16.0f);
        androidx.appcompat.view.menu.a.u(pathBuilderA, 2.0f, -2.0f, -2.0f, 13.0f);
        pathBuilderA.moveTo(7.0f, 7.83f);
        pathBuilderA.lineToRelative(1.0f, -1.0f);
        pathBuilderA.lineToRelative(0.59f, 0.59f);
        androidx.browser.browseractions.a.D(pathBuilderA, 9.0f, 7.83f, 10.0f, 7.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderA, 7.83f, 7.0f, 12.0f, 2.0f);
        d.f(pathBuilderA, 2.0f, 7.0f, 12.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 7.0f, 16.0f, 2.0f, 2.0f);
        b.B(pathBuilderA, 7.0f, 16.0f, 17.0f, 18.0f);
        androidx.compose.animation.a.B(pathBuilderA, -2.0f, -2.0f, 2.0f, 18.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 17.0f, 14.0f, -2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderA, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fence = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
