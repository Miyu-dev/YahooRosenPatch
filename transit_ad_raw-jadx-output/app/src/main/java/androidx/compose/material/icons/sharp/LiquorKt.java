package androidx.compose.material.icons.sharp;

import a6.h;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Liquor.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_liquor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Liquor", "Landroidx/compose/material/icons/Icons$Sharp;", "getLiquor", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LiquorKt {
    private static ImageVector _liquor;

    public static final ImageVector getLiquor(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _liquor;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Liquor", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(3.0f, 14.0f);
        pathBuilderD.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        b.x(pathBuilderD, 20.0f, 3.0f, 2.0f, 6.0f);
        v.z(pathBuilderD, -2.0f, 7.0f, -3.18f);
        pathBuilderD.curveTo(8.16f, 16.4f, 9.0f, 15.3f, 9.0f, 14.0f);
        b.z(pathBuilderD, 6.0f, 3.0f, 14.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 5.0f, 8.0f, 2.0f, 3.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.i(pathBuilderD, 5.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderW = a.w(22.0f, 9.0f, -3.0f, -1.01f, 2.0f);
        s.s(pathBuilderW, -5.0f, 6.0f, -3.0f, 1.01f);
        androidx.appcompat.view.menu.a.v(pathBuilderW, 22.0f, 11.0f, 9.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderW, 16.0f, 4.0f, 1.0f, 1.0f);
        a.b.m(pathBuilderW, -1.0f, 4.0f, 13.0f, 10.44f);
        s.D(pathBuilderW, 3.0f, -0.98f, 7.0f, 1.0f);
        a.z(pathBuilderW, 2.46f, 3.0f, 0.98f, 12.0f);
        a.b.m(pathBuilderW, -7.0f, 10.44f, 20.0f, 20.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderW, -7.0f, -2.0f, 7.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _liquor = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
