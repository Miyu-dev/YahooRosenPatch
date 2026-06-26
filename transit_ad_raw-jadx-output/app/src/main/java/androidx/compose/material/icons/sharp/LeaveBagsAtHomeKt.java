package androidx.compose.material.icons.sharp;

import a.b;
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
import c.e;
import c.h;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: LeaveBagsAtHome.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_leaveBagsAtHome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LeaveBagsAtHome", "Landroidx/compose/material/icons/Icons$Sharp;", "getLeaveBagsAtHome", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LeaveBagsAtHomeKt {
    private static ImageVector _leaveBagsAtHome;

    public static final ImageVector getLeaveBagsAtHome(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _leaveBagsAtHome;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LeaveBagsAtHome", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(11.83f, 9.0f, 0.92f, 0.92f);
        e.f(pathBuilderO, 1.75f, 1.75f, 9.0f, 16.0f);
        a.z(pathBuilderO, 4.17f, 3.0f, 3.0f, 6.0f);
        b.C(pathBuilderO, -4.0f, 2.0f, 9.0f, 4.0f);
        androidx.appcompat.graphics.drawable.a.t(pathBuilderO, 8.83f, 11.83f, 9.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderO, 11.0f, 4.0f, 2.0f, 2.0f);
        b.m(pathBuilderO, -2.0f, 4.0f, 21.19f, 21.19f);
        pathBuilderO.lineTo(2.81f, 2.81f);
        pathBuilderO.lineTo(1.39f, 4.22f);
        androidx.appcompat.app.m.r(pathBuilderO, 5.0f, 7.83f, 21.0f, 2.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderO.horizontalLineToRelative(6.0f);
        pathBuilderO.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderO.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderO.horizontalLineToRelative(1.17f);
        s.r(pathBuilderO, 1.61f, 1.61f, 21.19f, 21.19f);
        pathBuilderO.moveTo(8.0f, 18.0f);
        a.z(pathBuilderO, -7.17f, 1.5f, 1.5f, 18.0f);
        a.r(pathBuilderO, 8.0f, 11.25f, 18.0f, -3.92f);
        h.e(pathBuilderO, 1.5f, 1.5f, 18.0f, 11.25f);
        pathBuilderO.moveTo(14.5f, 18.0f);
        pathBuilderO.verticalLineToRelative(-0.67f);
        pathBuilderO.lineTo(15.17f, 18.0f);
        pathBuilderO.horizontalLineTo(14.5f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leaveBagsAtHome = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
