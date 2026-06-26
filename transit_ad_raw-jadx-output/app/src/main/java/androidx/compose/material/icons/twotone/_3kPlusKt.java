package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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
import c.e;
import c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: _3kPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__3kPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_3kPlus", "Landroidx/compose/material/icons/Icons$TwoTone;", "get_3kPlus", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _3kPlusKt {
    private static ImageVector __3kPlus;

    public static final ImageVector get_3kPlus(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = __3kPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone._3kPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(5.0f, 19.0f, 14.0f, -6.5f, -1.5f);
        v.C(pathBuilderF, 14.0f, -1.0f, -1.5f, 15.0f);
        b.u(pathBuilderF, -1.0f, 1.5f, 10.0f, 1.0f);
        c.a.h(pathBuilderF, 1.5f, 19.0f, 5.0f, 5.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderF, 19.0f, 11.0f, 9.0f, 1.5f);
        e.h(pathBuilderF, 2.25f, 14.25f, 9.0f, 16.0f);
        pathBuilderF.lineToRelative(-2.25f, 3.0f);
        pathBuilderF.lineTo(16.0f, 15.0f);
        c.a.l(pathBuilderF, -1.75f, -1.75f, -2.25f, 15.0f);
        a.b.B(pathBuilderF, 11.0f, 9.0f, 5.5f, 13.5f);
        androidx.appcompat.view.menu.a.t(pathBuilderF, 3.0f, -1.0f, -2.0f, -1.0f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderF, 2.0f, -1.0f, -3.0f, 9.0f);
        pathBuilderF.horizontalLineTo(9.0f);
        pathBuilderF.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderF.verticalLineToRelative(4.0f);
        pathBuilderF.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.i(pathBuilderF, 5.5f, 13.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(19.0f, 3.0f, 5.0f);
        pathBuilderB.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        androidx.compose.animation.a.k(pathBuilderB, 19.0f, 11.5f, -1.5f, 10.0f);
        androidx.appcompat.app.m.x(pathBuilderB, -1.0f, 1.5f, 15.0f, 1.0f);
        androidx.appcompat.app.m.w(pathBuilderB, 1.5f, 14.0f, 1.0f, -1.5f);
        androidx.compose.animation.a.x(pathBuilderB, 19.0f, 19.0f, 5.0f, 5.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderB, 14.0f, 11.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(10.0f, 14.0f, -4.0f);
        pathBuilderE.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.B(pathBuilderE, 5.5f, 1.5f, 3.0f, 1.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderE, -2.0f, 1.0f, 2.0f, 1.0f);
        g.f(pathBuilderE, -3.0f, 15.0f, 9.0f);
        pathBuilderE.curveTo(9.55f, 15.0f, 10.0f, 14.55f, 10.0f, 14.0f);
        pathBuilderE.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(12.5f, 12.75f, 1.75f, 2.25f);
        pathBuilderA.lineToRelative(1.75f, 0.0f);
        pathBuilderA.lineToRelative(-2.25f, -3.0f);
        pathBuilderA.lineToRelative(2.25f, -3.0f);
        pathBuilderA.lineToRelative(-1.75f, 0.0f);
        pathBuilderA.lineToRelative(-1.75f, 2.25f);
        pathBuilderA.lineToRelative(0.0f, -2.25f);
        pathBuilderA.lineToRelative(-1.5f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderA, 0.0f, 6.0f, 1.5f, 0.0f), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __3kPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
