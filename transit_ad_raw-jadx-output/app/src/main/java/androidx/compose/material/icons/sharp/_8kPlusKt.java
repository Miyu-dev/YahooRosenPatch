package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: _8kPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__8kPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_8kPlus", "Landroidx/compose/material/icons/Icons$Sharp;", "get_8kPlus", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _8kPlusKt {
    private static ImageVector __8kPlus;

    public static final ImageVector get_8kPlus(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = __8kPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._8kPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.app.m.v(7.5f, 12.5f, 1.0f, 14.0f, -1.0f);
        a.B(pathBuilderV, 12.5f, 7.5f, 10.0f, 1.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderV, 1.5f, -1.0f, 10.0f);
        b.z(pathBuilderV, 21.0f, 3.0f, 3.0f, 18.0f);
        b.m(pathBuilderV, 18.0f, 3.0f, 10.0f, 14.0f);
        pathBuilderV.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderV.horizontalLineTo(7.0f);
        pathBuilderV.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderV.verticalLineToRelative(-4.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderV.horizontalLineToRelative(2.0f);
        pathBuilderV.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.B(pathBuilderV, 14.0f, 16.0f, 15.0f, -1.75f);
        e.f(pathBuilderV, -1.75f, -2.25f, 15.0f, 11.0f);
        v.r(pathBuilderV, 9.0f, 1.5f, 2.25f);
        pathBuilderV.lineTo(14.25f, 9.0f);
        pathBuilderV.horizontalLineTo(16.0f);
        s.r(pathBuilderV, -2.25f, 3.0f, 16.0f, 15.0f);
        androidx.browser.browseractions.a.A(pathBuilderV, 19.0f, 12.5f, -1.5f, 14.0f);
        androidx.appcompat.app.m.x(pathBuilderV, -1.0f, -1.5f, 15.0f, -1.0f);
        androidx.appcompat.app.m.w(pathBuilderV, 1.5f, 10.0f, 1.0f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.i(pathBuilderV, 19.0f, 12.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __8kPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
