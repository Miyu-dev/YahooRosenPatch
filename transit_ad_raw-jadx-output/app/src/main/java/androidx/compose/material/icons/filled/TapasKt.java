package androidx.compose.material.icons.filled;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Tapas.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tapas", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tapas", "Landroidx/compose/material/icons/Icons$Filled;", "getTapas", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TapasKt {
    private static ImageVector _tapas;

    public static final ImageVector getTapas(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _tapas;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Tapas", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = h.c(22.0f, 10.0f, 1.0f, -8.0f, 9.0f);
        pathBuilderC.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        s.y(pathBuilderC, 21.0f, -2.0f, 2.0f, 6.0f);
        a.m(pathBuilderC, -2.0f, -2.0f, -7.14f);
        pathBuilderC.curveTo(20.72f, 13.41f, 22.0f, 11.86f, 22.0f, 10.0f);
        androidx.appcompat.app.m.n(pathBuilderC, 20.0f, 3.0f, 3.0f, -4.0f);
        androidx.appcompat.view.menu.a.o(pathBuilderC, 3.0f, 20.0f, 12.5f, 11.5f);
        pathBuilderC.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        s.B(pathBuilderC, 8.0f, 9.0f, 6.0f, -9.0f);
        pathBuilderC.horizontalLineTo(4.0f);
        pathBuilderC.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilderC.curveTo(1.5f, 10.12f, 2.62f, 9.0f, 4.0f, 9.0f);
        g.f(pathBuilderC, 2.0f, 8.0f, 4.0f);
        pathBuilderC.curveTo(2.62f, 8.0f, 1.5f, 6.88f, 1.5f, 5.5f);
        pathBuilderC.curveTo(1.5f, 4.12f, 2.62f, 3.0f, 4.0f, 3.0f);
        androidx.appcompat.app.m.w(pathBuilderC, 2.0f, 1.0f, 2.0f, 2.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilderC.curveTo(12.5f, 6.88f, 11.38f, 8.0f, 10.0f, 8.0f);
        androidx.compose.animation.a.s(pathBuilderC, 8.0f, 1.0f, 2.0f);
        pathBuilderC.curveTo(11.38f, 9.0f, 12.5f, 10.12f, 12.5f, 11.5f);
        pathBuilderC.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderC.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tapas = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
