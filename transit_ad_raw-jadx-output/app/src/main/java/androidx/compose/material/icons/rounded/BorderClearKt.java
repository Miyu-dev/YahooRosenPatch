package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: BorderClear.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_borderClear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BorderClear", "Landroidx/compose/material/icons/Icons$Rounded;", "getBorderClear", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BorderClearKt {
    private static ImageVector _borderClear;

    public static final ImageVector getBorderClear(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _borderClear;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BorderClear", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(7.0f, 5.0f, 2.0f, 9.0f, 3.0f);
        b.k(pathBuilderC, 7.0f, 3.0f, 2.0f);
        a.x(pathBuilderC, 7.0f, 13.0f, 2.0f, -2.0f);
        b.k(pathBuilderC, 7.0f, 11.0f, 2.0f);
        a.x(pathBuilderC, 7.0f, 21.0f, 2.0f, -2.0f);
        b.k(pathBuilderC, 7.0f, 19.0f, 2.0f);
        a.x(pathBuilderC, 11.0f, 17.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderC, -2.0f, 2.0f, 11.0f, 21.0f);
        a.b.A(pathBuilderC, 2.0f, -2.0f, -2.0f, 2.0f);
        a.x(pathBuilderC, 3.0f, 21.0f, 2.0f, -2.0f);
        b.k(pathBuilderC, 3.0f, 19.0f, 2.0f);
        a.x(pathBuilderC, 3.0f, 17.0f, 2.0f, -2.0f);
        b.k(pathBuilderC, 3.0f, 15.0f, 2.0f);
        a.x(pathBuilderC, 3.0f, 13.0f, 2.0f, -2.0f);
        b.k(pathBuilderC, 3.0f, 11.0f, 2.0f);
        pathBuilderC.moveTo(3.0f, 9.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.lineTo(5.0f, 7.0f);
        b.k(pathBuilderC, 3.0f, 7.0f, 2.0f);
        pathBuilderC.moveTo(3.0f, 5.0f);
        pathBuilderC.horizontalLineToRelative(2.0f);
        pathBuilderC.lineTo(5.0f, 3.0f);
        b.k(pathBuilderC, 3.0f, 3.0f, 2.0f);
        a.x(pathBuilderC, 11.0f, 13.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderC, -2.0f, 2.0f, 19.0f, 17.0f);
        a.b.A(pathBuilderC, 2.0f, -2.0f, -2.0f, 2.0f);
        a.x(pathBuilderC, 19.0f, 13.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderC, -2.0f, 2.0f, 19.0f, 21.0f);
        a.b.A(pathBuilderC, 2.0f, -2.0f, -2.0f, 2.0f);
        pathBuilderC.moveTo(19.0f, 9.0f);
        a.y(pathBuilderC, 2.0f, 21.0f, 7.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderC, 2.0f, 11.0f, 9.0f, 2.0f);
        s.w(pathBuilderC, 13.0f, 7.0f, -2.0f, 2.0f);
        a.b.y(pathBuilderC, 19.0f, 3.0f, 2.0f, 2.0f);
        h.m(pathBuilderC, 21.0f, 3.0f, -2.0f);
        pathBuilderC.moveTo(11.0f, 5.0f);
        a.y(pathBuilderC, 2.0f, 13.0f, 3.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.A(pathBuilderC, 2.0f, 15.0f, 21.0f, 2.0f);
        a.n(pathBuilderC, -2.0f, -2.0f, 2.0f);
        a.x(pathBuilderC, 15.0f, 13.0f, 2.0f, -2.0f);
        androidx.appcompat.graphics.drawable.a.z(pathBuilderC, -2.0f, 2.0f, 15.0f, 5.0f);
        a.y(pathBuilderC, 2.0f, 17.0f, 3.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.h(pathBuilderC, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _borderClear = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
