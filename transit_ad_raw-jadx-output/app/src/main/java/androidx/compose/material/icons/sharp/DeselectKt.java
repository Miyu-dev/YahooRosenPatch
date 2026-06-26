package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
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
import c.c;
import c.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Deselect.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_deselect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Deselect", "Landroidx/compose/material/icons/Icons$Sharp;", "getDeselect", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DeselectKt {
    private static ImageVector _deselect;

    public static final ImageVector getDeselect(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _deselect;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Deselect", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderI = c.i(3.0f, 13.0f, 2.0f, -2.0f, 3.0f);
        a.B(pathBuilderI, 13.0f, 7.0f, 21.0f, 2.0f);
        d.f(pathBuilderI, -2.0f, 7.0f, 21.0f);
        a.x(pathBuilderI, 13.0f, 3.0f, -2.0f, 2.0f);
        b.m(pathBuilderI, 2.0f, 3.0f, 19.0f, 3.0f);
        androidx.appcompat.graphics.drawable.a.q(pathBuilderI, 2.0f, 2.0f, 3.0f, 19.0f);
        android.support.v4.media.a.D(pathBuilderI, 5.0f, 21.0f, -2.0f, 3.0f);
        h.z(pathBuilderI, 2.0f, 5.0f, 3.0f, 17.0f);
        s.A(pathBuilderI, 2.0f, -2.0f, 3.0f, 17.0f);
        a.x(pathBuilderI, 11.0f, 21.0f, 2.0f, -2.0f);
        b.m(pathBuilderI, -2.0f, 21.0f, 19.0f, 13.0f);
        androidx.compose.animation.a.B(pathBuilderI, 2.0f, -2.0f, -2.0f, 13.0f);
        androidx.browser.browseractions.a.A(pathBuilderI, 19.0f, 9.0f, 2.0f, 7.0f);
        b.m(pathBuilderI, -2.0f, 9.0f, 15.0f, 5.0f);
        v.w(pathBuilderI, 2.0f, 3.0f, -2.0f, 5.0f);
        pathBuilderI.moveTo(7.83f, 5.0f);
        androidx.appcompat.app.m.r(pathBuilderI, 7.0f, 4.17f, 3.0f, 2.0f);
        h.z(pathBuilderI, 2.0f, 7.83f, 19.83f, 17.0f);
        androidx.appcompat.app.m.r(pathBuilderI, 19.0f, 16.17f, 15.0f, 2.0f);
        h.z(pathBuilderI, 2.0f, 19.83f, 21.19f, 21.19f);
        pathBuilderI.lineTo(2.81f, 2.81f);
        pathBuilderI.lineTo(1.39f, 4.22f);
        h.n(pathBuilderI, 4.17f, 7.0f, 3.0f, 2.0f);
        b.D(pathBuilderI, 2.0f, 7.83f, 2.0f, 2.0f);
        androidx.appcompat.app.m.u(pathBuilderI, 17.0f, 7.17f, 2.0f, 2.0f);
        androidx.browser.browseractions.a.B(pathBuilderI, 15.0f, 2.0f, 2.0f, -1.17f);
        s.r(pathBuilderI, 2.78f, 2.78f, 21.19f, 21.19f);
        pathBuilderI.moveTo(9.0f, 15.0f);
        pathBuilderI.verticalLineToRelative(-3.17f);
        pathBuilderI.lineTo(12.17f, 15.0f);
        pathBuilderI.horizontalLineTo(9.0f);
        pathBuilderI.close();
        h.D(pathBuilderI, 15.0f, 12.17f, 9.0f, -3.17f);
        androidx.compose.animation.a.r(pathBuilderI, -2.0f, -2.0f, 17.0f, 7.17f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderI, 15.0f, 12.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _deselect = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
