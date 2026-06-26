package androidx.compose.material.icons.twotone;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: BorderVertical.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_borderVertical", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BorderVertical", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBorderVertical", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BorderVerticalKt {
    private static ImageVector _borderVertical;

    public static final ImageVector getBorderVertical(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _borderVertical;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BorderVertical", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(7.0f, 3.0f, 2.0f, 2.0f);
        a.z(pathBuilderO, 7.0f, 5.0f, 7.0f, 11.0f);
        androidx.appcompat.app.m.C(pathBuilderO, 2.0f, 2.0f, 7.0f, 13.0f);
        a.x(pathBuilderO, 7.0f, 19.0f, 2.0f, 2.0f);
        a.z(pathBuilderO, 7.0f, 21.0f, 3.0f, 19.0f);
        androidx.appcompat.app.m.C(pathBuilderO, 2.0f, 2.0f, 3.0f, 21.0f);
        a.x(pathBuilderO, 3.0f, 3.0f, 2.0f, 2.0f);
        a.z(pathBuilderO, 3.0f, 5.0f, 3.0f, 11.0f);
        androidx.appcompat.app.m.C(pathBuilderO, 2.0f, 2.0f, 3.0f, 13.0f);
        a.x(pathBuilderO, 19.0f, 3.0f, 2.0f, 2.0f);
        a.w(pathBuilderO, -2.0f, 3.0f, 7.0f, 2.0f);
        h.q(pathBuilderO, 2.0f, 3.0f, 9.0f);
        a.x(pathBuilderO, 11.0f, 3.0f, 2.0f, 18.0f);
        a.w(pathBuilderO, -2.0f, 3.0f, 15.0f, 2.0f);
        h.q(pathBuilderO, 2.0f, 3.0f, 17.0f);
        a.x(pathBuilderO, 15.0f, 11.0f, 2.0f, 2.0f);
        a.w(pathBuilderO, -2.0f, 19.0f, 15.0f, 2.0f);
        androidx.appcompat.app.m.y(pathBuilderO, 2.0f, -2.0f, 19.0f, 11.0f);
        androidx.compose.animation.b.t(pathBuilderO, 2.0f, 2.0f, -2.0f);
        a.x(pathBuilderO, 19.0f, 7.0f, 2.0f, 2.0f);
        a.w(pathBuilderO, -2.0f, 19.0f, 19.0f, 2.0f);
        androidx.appcompat.app.m.y(pathBuilderO, 2.0f, -2.0f, 15.0f, 19.0f);
        androidx.compose.animation.b.t(pathBuilderO, 2.0f, 2.0f, -2.0f);
        a.x(pathBuilderO, 15.0f, 3.0f, 2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.c(pathBuilderO, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _borderVertical = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
