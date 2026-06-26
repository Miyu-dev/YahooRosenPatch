package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
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
import c.a;
import c.k;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: _11mp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__11mp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_11mp", "Landroidx/compose/material/icons/Icons$Sharp;", "get_11mp", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _11mpKt {
    private static ImageVector __11mp;

    public static final ImageVector get_11mp(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = __11mp;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._11mp", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(3.0f, 3.0f, 18.0f, 18.0f, 3.0f);
        h.v(pathBuilderV, 3.0f, 8.0f, 5.5f, 3.0f);
        a.h(pathBuilderV, 6.0f, 9.5f, 7.0f, 8.0f);
        androidx.compose.animation.a.y(pathBuilderV, 5.5f, 12.5f, 18.5f, 11.0f);
        v.C(pathBuilderV, 14.0f, -1.0f, 3.0f, 8.5f);
        a.j(pathBuilderV, -3.0f, -1.0f, 4.5f, 6.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderV, -6.0f, 6.5f, 18.5f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 13.0f, 5.5f, 3.0f, 6.0f);
        k.d(pathBuilderV, -1.5f, 7.0f, 13.0f, 5.5f);
        androidx.appcompat.view.menu.a.x(pathBuilderV, 18.0f, 17.0f, -3.0f, 1.5f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.i(pathBuilderV, -1.5f, -6.0f, 18.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(15.0f, 14.0f, 1.5f, 1.5f, -1.5f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __11mp = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
