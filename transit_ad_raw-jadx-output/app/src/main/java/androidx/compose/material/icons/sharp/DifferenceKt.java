package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: Difference.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_difference", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Difference", "Landroidx/compose/material/icons/Icons$Sharp;", "getDifference", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DifferenceKt {
    private static ImageVector _difference;

    public static final ImageVector getDifference(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _difference;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Difference", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderG = androidx.appcompat.app.m.g(18.0f, 23.0f, 2.0f, 7.0f, 2.0f);
        a.h(pathBuilderG, 14.0f, 14.0f, 23.0f);
        pathBuilderG.moveTo(15.0f, 1.0f);
        pathBuilderG.horizontalLineTo(6.01f);
        pathBuilderG.lineTo(6.0f, 19.0f);
        pathBuilderG.horizontalLineToRelative(15.0f);
        h.u(pathBuilderG, 7.0f, 15.0f, 1.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderG, 16.5f, 15.0f, -6.0f, -2.0f);
        b.m(pathBuilderG, 6.0f, 15.0f, 16.5f, 9.0f);
        a.u(pathBuilderG, -2.0f, 2.0f, -2.0f, 9.0f);
        androidx.appcompat.view.menu.a.A(pathBuilderG, -2.0f, 7.0f, 2.0f, 5.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.l(pathBuilderG, 2.0f, 2.0f, 2.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _difference = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
