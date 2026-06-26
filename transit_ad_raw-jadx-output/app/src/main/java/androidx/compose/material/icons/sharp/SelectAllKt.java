package androidx.compose.material.icons.sharp;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: SelectAll.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_selectAll", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SelectAll", "Landroidx/compose/material/icons/Icons$Sharp;", "getSelectAll", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SelectAllKt {
    private static ImageVector _selectAll;

    public static final ImageVector getSelectAll(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _selectAll;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SelectAll", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = b.o(3.0f, 13.0f, 2.0f, -2.0f);
        androidx.compose.animation.b.k(pathBuilderO, 3.0f, 11.0f, 2.0f);
        a.x(pathBuilderO, 7.0f, 21.0f, 2.0f, -2.0f);
        androidx.compose.animation.b.k(pathBuilderO, 7.0f, 19.0f, 2.0f);
        pathBuilderO.moveTo(3.0f, 9.0f);
        pathBuilderO.horizontalLineToRelative(2.0f);
        pathBuilderO.lineTo(5.0f, 7.0f);
        androidx.compose.animation.b.k(pathBuilderO, 3.0f, 7.0f, 2.0f);
        a.x(pathBuilderO, 13.0f, 3.0f, -2.0f, 2.0f);
        a.s(pathBuilderO, 2.0f, 13.0f, 3.0f);
        a.x(pathBuilderO, 3.0f, 17.0f, 2.0f, -2.0f);
        androidx.compose.animation.b.k(pathBuilderO, 3.0f, 15.0f, 2.0f);
        pathBuilderO.moveTo(9.0f, 3.0f);
        b.s(pathBuilderO, 7.0f, 3.0f, 2.0f, 2.0f);
        a.z(pathBuilderO, 9.0f, 3.0f, 5.0f, 3.0f);
        b.s(pathBuilderO, 3.0f, 3.0f, 2.0f, 2.0f);
        a.z(pathBuilderO, 5.0f, 3.0f, 11.0f, 21.0f);
        b.A(pathBuilderO, 2.0f, -2.0f, -2.0f, 2.0f);
        a.x(pathBuilderO, 19.0f, 13.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderO, -2.0f, 2.0f, 19.0f, 9.0f);
        a.y(pathBuilderO, 2.0f, 21.0f, 7.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderO, 2.0f, 19.0f, 17.0f, 2.0f);
        a.n(pathBuilderO, -2.0f, -2.0f, 2.0f);
        a.x(pathBuilderO, 15.0f, 21.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderO, -2.0f, 2.0f, 15.0f, 5.0f);
        a.y(pathBuilderO, 2.0f, 17.0f, 3.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderO, 2.0f, 19.0f, 5.0f, 2.0f);
        s.w(pathBuilderO, 21.0f, 3.0f, -2.0f, 2.0f);
        a.x(pathBuilderO, 19.0f, 21.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderO, -2.0f, 2.0f, 3.0f, 21.0f);
        android.support.v4.media.a.w(pathBuilderO, 2.0f, -2.0f, 3.0f, 19.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderO, 2.0f, 7.0f, 17.0f, 10.0f);
        pathBuilderO.lineTo(17.0f, 7.0f);
        androidx.compose.animation.b.k(pathBuilderO, 7.0f, 7.0f, 10.0f);
        a.x(pathBuilderO, 9.0f, 9.0f, 6.0f, 6.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.l(pathBuilderO, 9.0f, 15.0f, 9.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _selectAll = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
