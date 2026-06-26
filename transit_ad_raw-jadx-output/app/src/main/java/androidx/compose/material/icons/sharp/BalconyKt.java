package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Balcony.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_balcony", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Balcony", "Landroidx/compose/material/icons/Icons$Sharp;", "getBalcony", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BalconyKt {
    private static ImageVector _balcony;

    public static final ImageVector getBalcony(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _balcony;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Balcony", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderR = a.r(10.0f, 10.0f, 2.0f, 8.0f, -2.0f);
        androidx.browser.browseractions.a.r(pathBuilderR, 10.0f, 16.0f, 12.0f, -2.0f);
        s.q(pathBuilderR, -2.0f, 2.0f, 16.0f);
        android.support.v4.media.a.D(pathBuilderR, 21.0f, 14.0f, 8.0f, 3.0f);
        android.support.v4.media.a.m(pathBuilderR, -8.0f, 1.0f, -4.0f);
        pathBuilderR.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilderR.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        h.z(pathBuilderR, 4.0f, 21.0f, 7.0f, 16.0f);
        v.B(pathBuilderR, 5.0f, 4.0f, 2.0f, 16.0f);
        b.z(pathBuilderR, 11.0f, 16.0f, 9.0f, 4.0f);
        b.m(pathBuilderR, 2.0f, 16.0f, 11.0f, 4.08f);
        pathBuilderR.curveTo(8.16f, 4.56f, 6.0f, 7.03f, 6.0f, 10.0f);
        a.h(pathBuilderR, 4.0f, 5.0f, 4.08f);
        androidx.appcompat.view.menu.a.x(pathBuilderR, 13.0f, 14.0f, 5.0f, -4.0f);
        pathBuilderR.curveToRelative(0.0f, -2.97f, -2.16f, -5.44f, -5.0f, -5.92f);
        androidx.appcompat.view.menu.a.B(pathBuilderR, 14.0f, 15.0f, 16.0f, -2.0f);
        a.h(pathBuilderR, 4.0f, 2.0f, 16.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderR, 19.0f, 16.0f, -2.0f, 4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderR, 2.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _balcony = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
