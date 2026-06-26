package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Theaters.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_theaters", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Theaters", "Landroidx/compose/material/icons/Icons$TwoTone;", "getTheaters", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TheatersKt {
    private static ImageVector _theaters;

    public static final ImageVector getTheaters(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _theaters;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Theaters", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(18.0f, 3.0f, 2.0f, -2.0f);
        pathBuilderE.lineTo(16.0f, 3.0f);
        pathBuilderE.lineTo(8.0f, 3.0f);
        pathBuilderE.verticalLineToRelative(2.0f);
        pathBuilderE.lineTo(6.0f, 5.0f);
        pathBuilderE.lineTo(6.0f, 3.0f);
        b.s(pathBuilderE, 4.0f, 3.0f, 18.0f, 2.0f);
        a.l(pathBuilderE, -2.0f, 2.0f, 2.0f, 8.0f);
        a.l(pathBuilderE, -2.0f, 2.0f, 2.0f, 2.0f);
        h.m(pathBuilderE, 20.0f, 3.0f, -2.0f);
        pathBuilderE.moveTo(8.0f, 17.0f);
        b.s(pathBuilderE, 6.0f, 17.0f, -2.0f, 2.0f);
        android.support.v4.media.a.v(pathBuilderE, 2.0f, 8.0f, 13.0f);
        b.s(pathBuilderE, 6.0f, 13.0f, -2.0f, 2.0f);
        android.support.v4.media.a.v(pathBuilderE, 2.0f, 8.0f, 9.0f);
        pathBuilderE.lineTo(6.0f, 9.0f);
        s.w(pathBuilderE, 6.0f, 7.0f, 2.0f, 2.0f);
        pathBuilderE.moveTo(14.0f, 19.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderE, -4.0f, 10.0f, 5.0f, 4.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderE, 14.0f, 18.0f, 17.0f, -2.0f);
        androidx.appcompat.view.menu.a.n(pathBuilderE, -2.0f, 2.0f, 2.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderE, 18.0f, 13.0f, -2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderE, 2.0f, 2.0f, 18.0f, 9.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderE, -2.0f, 16.0f, 7.0f, 2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.h(pathBuilderE, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.i(10.0f, 5.0f, 4.0f, 14.0f, -4.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _theaters = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
