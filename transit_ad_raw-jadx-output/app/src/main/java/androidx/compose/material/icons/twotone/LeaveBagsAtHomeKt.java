package androidx.compose.material.icons.twotone;

import a.b;
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

/* JADX INFO: compiled from: LeaveBagsAtHome.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_leaveBagsAtHome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LeaveBagsAtHome", "Landroidx/compose/material/icons/Icons$TwoTone;", "getLeaveBagsAtHome", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LeaveBagsAtHomeKt {
    private static ImageVector _leaveBagsAtHome;

    public static final ImageVector getLeaveBagsAtHome(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _leaveBagsAtHome;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LeaveBagsAtHome", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = b.u(7.0f, 19.0f, 9.83f, 1.0f, 1.0f);
        v.r(pathBuilderU, 18.0f, 1.5f, -5.67f);
        s.D(pathBuilderU, 1.75f, 1.75f, 18.0f, 1.5f);
        a.z(pathBuilderU, -2.42f, 1.75f, 1.75f, 18.0f);
        androidx.compose.animation.b.A(pathBuilderU, 0.67f, 1.0f, 1.0f, 7.0f);
        pathBuilderU.moveTo(10.83f, 8.0f);
        a.C(pathBuilderU, 1.0f, 1.0f, 0.92f, 0.92f);
        e.f(pathBuilderU, 1.75f, 1.75f, 9.0f, 16.0f);
        pathBuilderU.verticalLineToRelative(4.17f);
        pathBuilderU.lineToRelative(0.0f, 0.0f);
        pathBuilderU.lineToRelative(1.0f, 1.0f);
        pathBuilderU.verticalLineTo(8.0f);
        pathBuilderU.horizontalLineTo(10.83f);
        pathBuilderU.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderU.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = androidx.appcompat.app.m.f(10.83f, 8.0f, 17.0f, 6.17f);
        pathBuilderF.lineToRelative(2.0f, 2.0f);
        pathBuilderF.verticalLineTo(8.0f);
        pathBuilderF.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderF.horizontalLineToRelative(-2.0f);
        pathBuilderF.verticalLineTo(3.0f);
        pathBuilderF.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderF.horizontalLineToRelative(-4.0f);
        pathBuilderF.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        pathBuilderF.verticalLineToRelative(3.0f);
        pathBuilderF.horizontalLineTo(8.83f);
        pathBuilderF.lineTo(10.83f, 8.0f);
        pathBuilderF.close();
        androidx.appcompat.view.menu.a.x(pathBuilderF, 11.0f, 4.0f, 2.0f, 2.0f);
        b.m(pathBuilderF, -2.0f, 4.0f, 11.83f, 9.0f);
        androidx.appcompat.app.m.C(pathBuilderF, 0.92f, 0.92f, 11.83f, 9.0f);
        pathBuilderF.moveTo(21.19f, 21.19f);
        pathBuilderF.lineTo(2.81f, 2.81f);
        pathBuilderF.lineTo(1.39f, 4.22f);
        pathBuilderF.lineToRelative(3.63f, 3.63f);
        pathBuilderF.curveTo(5.02f, 7.9f, 5.0f, 7.95f, 5.0f, 8.0f);
        pathBuilderF.verticalLineToRelative(11.0f);
        pathBuilderF.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderF.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderF.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderF.horizontalLineToRelative(6.0f);
        pathBuilderF.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderF.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderF.curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f);
        s.r(pathBuilderF, 1.85f, 1.85f, 21.19f, 21.19f);
        pathBuilderF.moveTo(7.0f, 19.0f);
        pathBuilderF.verticalLineTo(9.83f);
        pathBuilderF.lineToRelative(1.0f, 1.0f);
        pathBuilderF.verticalLineTo(18.0f);
        s.s(pathBuilderF, 1.5f, -5.67f, 1.75f, 1.75f);
        v.r(pathBuilderF, 18.0f, 1.5f, -2.42f);
        s.D(pathBuilderF, 1.75f, 1.75f, 18.0f, 0.67f);
        b.l(pathBuilderF, 1.0f, 1.0f, 7.0f);
        pathBuilderF.moveTo(16.0f, 9.0f);
        a.z(pathBuilderF, 4.17f, -1.5f, -1.5f, 9.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.j(pathBuilderF, 16.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leaveBagsAtHome = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
