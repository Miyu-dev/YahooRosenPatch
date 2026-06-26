package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
import androidx.compose.animation.b;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Tty.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tty", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tty", "Landroidx/compose/material/icons/Icons$TwoTone;", "getTty", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TtyKt {
    private static ImageVector _tty;

    public static final ImageVector getTty(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _tty;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Tty", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.13f, 5.0f);
        pathBuilderD.curveTo(4.3f, 6.37f, 4.66f, 7.71f, 5.18f, 8.99f);
        pathBuilderD.lineToRelative(1.65f, -1.65f);
        i.b(pathBuilderD, 6.36f, 5.0f, 4.13f);
        pathBuilderD.moveTo(15.66f, 16.17f);
        pathBuilderD.lineToRelative(-1.65f, 1.65f);
        pathBuilderD.curveToRelative(1.28f, 0.52f, 2.63f, 0.87f, 3.99f, 1.05f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.i(pathBuilderD, -2.23f, 15.66f, 16.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(19.2f, 14.84f, -3.67f, -0.73f);
        pathBuilderA.curveToRelative(-0.33f, -0.07f, -0.67f, 0.04f, -0.9f, 0.27f);
        pathBuilderA.lineTo(12.1f, 16.9f);
        pathBuilderA.curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6.0f, -6.0f);
        pathBuilderA.lineToRelative(2.52f, -2.52f);
        pathBuilderA.curveTo(8.86f, 8.14f, 8.96f, 7.8f, 8.9f, 7.48f);
        pathBuilderA.lineTo(8.16f, 3.8f);
        pathBuilderA.curveTo(8.07f, 3.34f, 7.66f, 3.0f, 7.18f, 3.0f);
        pathBuilderA.horizontalLineTo(3.03f);
        pathBuilderA.curveTo(2.47f, 3.0f, 2.0f, 3.47f, 2.03f, 4.03f);
        pathBuilderA.curveTo(2.2f, 6.92f, 3.05f, 9.63f, 4.43f, 12.0f);
        pathBuilderA.curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f);
        pathBuilderA.curveToRelative(2.37f, 1.37f, 5.08f, 2.23f, 7.97f, 2.4f);
        pathBuilderA.curveToRelative(0.56f, 0.03f, 1.03f, -0.44f, 1.03f, -1.0f);
        pathBuilderA.verticalLineToRelative(-4.15f);
        pathBuilderA.curveTo(20.0f, 15.34f, 19.66f, 14.93f, 19.2f, 14.84f);
        androidx.compose.animation.a.j(pathBuilderA, 4.13f, 5.0f, 2.23f);
        pathBuilderA.lineToRelative(0.47f, 2.34f);
        pathBuilderA.lineTo(5.18f, 8.99f);
        pathBuilderA.curveTo(4.66f, 7.71f, 4.3f, 6.37f, 4.13f, 5.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(18.0f, 18.87f);
        pathBuilderA.curveToRelative(-1.37f, -0.17f, -2.71f, -0.53f, -3.99f, -1.05f);
        pathBuilderA.lineToRelative(1.65f, -1.65f);
        h.y(pathBuilderA, 18.0f, 16.64f, 18.87f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 14.0f, 4.0f, 2.0f, 2.0f);
        a.b.m(pathBuilderA, -2.0f, 4.0f, 13.0f, 7.0f);
        androidx.compose.animation.a.B(pathBuilderA, 2.0f, 2.0f, -2.0f, 7.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 11.0f, 4.0f, 2.0f, 2.0f);
        a.b.m(pathBuilderA, -2.0f, 4.0f, 18.0f, 9.0f);
        v.w(pathBuilderA, -2.0f, 7.0f, 2.0f, 9.0f);
        a.A(pathBuilderA, 19.0f, 6.0f, -2.0f, 4.0f);
        a.b.m(pathBuilderA, 2.0f, 6.0f, 21.0f, 9.0f);
        v.w(pathBuilderA, -2.0f, 7.0f, 2.0f, 9.0f);
        a.A(pathBuilderA, 22.0f, 6.0f, -2.0f, 4.0f);
        a.b.m(pathBuilderA, 2.0f, 6.0f, 14.0f, 10.0f);
        androidx.compose.animation.a.B(pathBuilderA, 2.0f, 2.0f, -2.0f, 10.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 11.0f, 10.0f, 2.0f, 2.0f);
        a.b.m(pathBuilderA, -2.0f, 10.0f, 19.0f, 12.0f);
        androidx.compose.animation.a.B(pathBuilderA, -2.0f, -2.0f, 2.0f, 12.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 22.0f, 12.0f, -2.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderA, 2.0f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tty = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
