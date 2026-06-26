package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Css.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_css", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Css", "Landroidx/compose/material/icons/Icons$Sharp;", "getCss", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CssKt {
    private static ImageVector _css;

    public static final ImageVector getCss(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _css;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Css", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderR = a.r(9.5f, 15.0f, -2.0f, 11.0f, 0.5f);
        android.support.v4.media.a.z(pathBuilderR, 2.0f, -1.0f, 9.5f, 9.0f);
        androidx.appcompat.app.m.x(pathBuilderR, 5.0f, 2.0f, 13.0f, -0.5f);
        a.u(pathBuilderR, -2.0f, 1.0f, 3.5f, 15.0f);
        h.v(pathBuilderR, 9.5f, 16.0f, 15.0f, 5.0f);
        androidx.browser.browseractions.a.l(pathBuilderR, -3.5f, -3.5f, -1.0f, 2.0f);
        c.g(pathBuilderR, 11.0f, 21.0f, 9.0f, -5.0f);
        androidx.browser.browseractions.a.l(pathBuilderR, 3.5f, 3.5f, 1.0f, -2.0f);
        b.z(pathBuilderR, 13.0f, 16.0f, 15.0f);
        androidx.appcompat.app.m.t(pathBuilderR, 8.0f, 11.0f, 9.0f, 3.0f);
        c.a.j(pathBuilderR, 6.0f, 5.0f, -2.0f, 6.5f);
        androidx.browser.browseractions.a.l(pathBuilderR, 0.5f, -2.0f, -3.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.k(pathBuilderR, 11.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _css = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
