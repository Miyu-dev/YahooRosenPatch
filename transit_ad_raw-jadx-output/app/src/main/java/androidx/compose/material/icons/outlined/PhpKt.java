package androidx.compose.material.icons.outlined;

import android.support.v4.media.a;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Php.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_php", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Php", "Landroidx/compose/material/icons/Icons$Outlined;", "getPhp", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PhpKt {
    private static ImageVector _php;

    public static final ImageVector getPhp(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _php;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Php", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderI = c.i(13.0f, 9.0f, 1.5f, 6.0f, 13.0f);
        s.m(pathBuilderI, -2.5f, -2.0f, 15.0f, 9.5f);
        b.x(pathBuilderI, 9.0f, 11.0f, 2.0f, 2.0f);
        b.l(pathBuilderI, 9.0f, 8.0f, 10.5f, 1.0f);
        pathBuilderI.curveTo(8.0f, 12.3f, 7.3f, 13.0f, 6.5f, 13.0f);
        a.z(pathBuilderI, -2.0f, 2.0f, 3.0f, 9.0f);
        pathBuilderI.horizontalLineToRelative(3.5f);
        pathBuilderI.curveTo(7.3f, 9.0f, 8.0f, 9.7f, 8.0f, 10.5f);
        b.r(pathBuilderI, 6.5f, 10.5f, -2.0f, 1.0f);
        a.b.m(pathBuilderI, 2.0f, 10.5f, 21.5f, 10.5f);
        pathBuilderI.verticalLineToRelative(1.0f);
        pathBuilderI.curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f);
        androidx.appcompat.graphics.drawable.a.u(pathBuilderI, -2.0f, 2.0f, -1.5f, 9.0f);
        pathBuilderI.horizontalLineTo(20.0f);
        pathBuilderI.curveTo(20.8f, 9.0f, 21.5f, 9.7f, 21.5f, 10.5f);
        b.r(pathBuilderI, 20.0f, 10.5f, -2.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.a.g(pathBuilderI, 2.0f, 10.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _php = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
