package androidx.compose.material.icons.sharp;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Co2.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_co2", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Co2", "Landroidx/compose/material/icons/Icons$Sharp;", "getCo2", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class Co2Kt {
    private static ImageVector _co2;

    public static final ImageVector getCo2(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _co2;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Co2", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderF = a.f(15.0f, 9.0f, -5.0f, 6.0f, 5.0f);
        androidx.appcompat.view.menu.a.B(pathBuilderF, 9.0f, 13.5f, 13.5f, -2.0f);
        androidx.appcompat.graphics.drawable.a.h(pathBuilderF, -3.0f, 2.0f, 13.5f);
        android.support.v4.media.a.D(pathBuilderF, 8.0f, 13.0f, 2.0f, 3.0f);
        v.C(pathBuilderF, 9.0f, 5.0f, 2.0f, 6.5f);
        a.l(pathBuilderF, -0.5f, -2.0f, 3.0f, 2.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderF, 13.0f, 8.0f, 18.5f, 15.5f);
        s.m(pathBuilderF, 1.0f, 3.0f, 18.0f, 17.0f);
        a.l(pathBuilderF, -3.5f, 3.0f, -1.0f, -3.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.app.m.q(pathBuilderF, 12.0f, 4.5f, 3.5f, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _co2 = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
