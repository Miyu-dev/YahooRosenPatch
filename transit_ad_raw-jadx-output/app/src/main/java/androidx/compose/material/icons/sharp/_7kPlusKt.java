package androidx.compose.material.icons.sharp;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.b;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: _7kPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__7kPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_7kPlus", "Landroidx/compose/material/icons/Icons$Sharp;", "get_7kPlus", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _7kPlusKt {
    private static ImageVector __7kPlus;

    public static final ImageVector get_7kPlus(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = __7kPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._7kPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        a.y(pathBuilderO, 3.0f, 8.5f, 15.0f, 6.75f);
        b.f(pathBuilderO, 1.38f, -4.5f, 5.5f, 9.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderO, 4.86f, 8.5f, 15.0f);
        pathBuilderO.moveTo(16.0f, 15.0f);
        c.a.l(pathBuilderO, -1.75f, -1.75f, -2.25f, 15.0f);
        s.t(pathBuilderO, 11.0f, 9.0f, 1.5f, 2.25f);
        pathBuilderO.lineTo(14.25f, 9.0f);
        pathBuilderO.horizontalLineTo(16.0f);
        s.r(pathBuilderO, -2.25f, 3.0f, 16.0f, 15.0f);
        androidx.browser.browseractions.a.A(pathBuilderO, 19.0f, 12.5f, -1.5f, 14.0f);
        androidx.appcompat.app.m.x(pathBuilderO, -1.0f, -1.5f, 15.0f, -1.0f);
        androidx.appcompat.app.m.w(pathBuilderO, 1.5f, 10.0f, 1.0f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.i(pathBuilderO, 19.0f, 12.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __7kPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
