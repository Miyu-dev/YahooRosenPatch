package androidx.compose.material.icons.sharp;

import a.b;
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
import c.e;
import c.j;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Dining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Dining", "Landroidx/compose/material/icons/Icons$Sharp;", "getDining", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DiningKt {
    private static ImageVector _dining;

    public static final ImageVector getDining(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _dining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Dining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(22.0f, 2.0f, 2.0f, 20.0f, 20.0f);
        a.y(pathBuilderO, 2.0f, 11.0f, 10.3f);
        pathBuilderO.curveToRelative(0.0f, 0.93f, -0.64f, 1.71f, -1.5f, 1.93f);
        androidx.appcompat.graphics.drawable.a.o(pathBuilderO, 19.0f, 8.0f, -6.77f);
        pathBuilderO.curveToRelative(-0.86f, -0.22f, -1.5f, -1.0f, -1.5f, -1.93f);
        pathBuilderO.verticalLineTo(6.0f);
        pathBuilderO.horizontalLineTo(7.0f);
        pathBuilderO.horizontalLineToRelative(0.5f);
        pathBuilderO.verticalLineToRelative(3.0f);
        pathBuilderO.horizontalLineToRelative(0.75f);
        pathBuilderO.verticalLineTo(6.0f);
        pathBuilderO.horizontalLineToRelative(0.5f);
        pathBuilderO.horizontalLineToRelative(0.5f);
        j.f(pathBuilderO, 3.0f, 10.0f, 6.0f, 0.5f);
        b.B(pathBuilderO, 11.0f, 10.3f, 15.58f, 12.59f);
        e.f(pathBuilderO, -0.08f, 0.03f, 19.0f, 14.0f);
        pathBuilderO.verticalLineToRelative(-6.38f);
        pathBuilderO.lineToRelative(-0.08f, -0.04f);
        pathBuilderO.curveToRelative(-0.97f, -0.47f, -1.67f, -1.7f, -1.67f, -3.18f);
        pathBuilderO.curveToRelative(0.0f, -1.88f, 1.13f, -3.4f, 2.5f, -3.4f);
        pathBuilderO.curveToRelative(1.38f, 0.0f, 2.5f, 1.53f, 2.5f, 3.41f);
        pathBuilderO.curveTo(17.25f, 10.89f, 16.55f, 12.12f, 15.58f, 12.59f);
        pathBuilderO.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderO.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
