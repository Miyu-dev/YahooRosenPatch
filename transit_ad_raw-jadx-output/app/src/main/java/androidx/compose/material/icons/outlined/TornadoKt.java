package androidx.compose.material.icons.outlined;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Tornado.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tornado", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tornado", "Landroidx/compose/material/icons/Icons$Outlined;", "getTornado", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TornadoKt {
    private static ImageVector _tornado;

    public static final ImageVector getTornado(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _tornado;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Tornado", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderS = h.s(23.0f, 3.0f, 1.0f, 11.0f, 19.0f);
        a.z(pathBuilderS, 23.0f, 3.0f, 19.53f, 5.0f);
        pathBuilderS.lineToRelative(-1.74f, 3.0f);
        pathBuilderS.horizontalLineTo(6.21f);
        pathBuilderS.lineTo(4.47f, 5.0f);
        pathBuilderS.horizontalLineTo(19.53f);
        pathBuilderS.close();
        pathBuilderS.moveTo(10.26f, 15.0f);
        pathBuilderS.horizontalLineToRelative(3.48f);
        android.support.v4.media.a.C(pathBuilderS, 12.0f, 18.01f, 10.26f, 15.0f);
        pathBuilderS.moveTo(14.9f, 13.0f);
        s.u(pathBuilderS, 9.1f, -1.74f, -3.0f, 9.27f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderS, 14.9f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tornado = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
