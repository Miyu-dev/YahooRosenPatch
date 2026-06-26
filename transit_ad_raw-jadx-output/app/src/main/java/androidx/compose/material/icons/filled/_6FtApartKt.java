package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: _6FtApart.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__6FtApart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_6FtApart", "Landroidx/compose/material/icons/Icons$Filled;", "get_6FtApart", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _6FtApartKt {
    private static ImageVector __6FtApart;

    public static final ImageVector get_6FtApart(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = __6FtApart;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._6FtApart", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(6.0f, 6.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(7.1f, 2.0f, 6.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(4.0f, 2.9f, 4.0f, 4.0f);
        pathBuilderD.reflectiveCurveTo(4.9f, 6.0f, 6.0f, 6.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.0f, 9.43f);
        pathBuilderD.curveToRelative(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        pathBuilderD.curveTo(7.93f, 7.21f, 6.99f, 7.0f, 6.0f, 7.0f);
        pathBuilderD.curveTo(5.01f, 7.0f, 4.07f, 7.21f, 3.22f, 7.58f);
        pathBuilderD.curveTo(2.48f, 7.9f, 2.0f, 8.62f, 2.0f, 9.43f);
        androidx.appcompat.view.menu.a.v(pathBuilderD, 10.0f, 8.0f, 9.43f);
        pathBuilderD.moveTo(18.0f, 6.0f);
        pathBuilderD.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveTo(16.9f, 6.0f, 18.0f, 6.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(22.0f, 9.43f);
        pathBuilderD.curveToRelative(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        pathBuilderD.curveTo(19.93f, 7.21f, 18.99f, 7.0f, 18.0f, 7.0f);
        pathBuilderD.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilderD.curveTo(14.48f, 7.9f, 14.0f, 8.62f, 14.0f, 9.43f);
        androidx.appcompat.view.menu.a.v(pathBuilderD, 10.0f, 8.0f, 9.43f);
        pathBuilderD.moveTo(19.0f, 17.0f);
        v.y(pathBuilderD, -2.01f, 5.0f, 15.0f, 2.0f);
        pathBuilderD.lineToRelative(-3.0f, -3.0f);
        pathBuilderD.lineToRelative(3.0f, -3.0f);
        v.y(pathBuilderD, 2.01f, 19.0f, 13.0f, -2.0f);
        s.r(pathBuilderD, 3.0f, 3.0f, 19.0f, 17.0f);
        android.support.v4.media.a.D(pathBuilderD, 10.0f, 19.0f, -1.0f, 7.5f);
        pathBuilderD.curveTo(7.22f, 18.0f, 7.0f, 18.22f, 7.0f, 18.5f);
        pathBuilderD.verticalLineToRelative(3.0f);
        pathBuilderD.curveTo(7.0f, 21.78f, 7.22f, 22.0f, 7.5f, 22.0f);
        pathBuilderD.horizontalLineToRelative(2.0f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderD.verticalLineTo(20.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        e.e(pathBuilderD, 8.0f, 19.0f, 10.0f);
        androidx.appcompat.app.m.t(pathBuilderD, 9.0f, 20.5f, 21.0f, 8.0f);
        h.z(pathBuilderD, -0.5f, 9.0f, 17.5f, 19.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, -1.0f, 3.0f, -1.0f, -3.0f);
        androidx.compose.animation.a.B(pathBuilderD, -1.0f, -1.0f, 3.0f, 19.0f);
        b.y(pathBuilderD, 12.5f, 19.0f, 0.5f, 1.0f);
        androidx.compose.animation.b.u(pathBuilderD, 1.0f, -1.0f, 22.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-4.0f);
        pathBuilderD.horizontalLineTo(14.0f);
        pathBuilderD.verticalLineToRelative(1.0f);
        pathBuilderD.horizontalLineTo(12.5f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __6FtApart = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
