package androidx.compose.material.icons.sharp;

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

/* JADX INFO: compiled from: _4kPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__4kPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_4kPlus", "Landroidx/compose/material/icons/Icons$Sharp;", "get_4kPlus", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _4kPlusKt {
    private static ImageVector __4kPlus;

    public static final ImageVector get_4kPlus(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = __4kPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp._4kPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderO = s.o(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        a.B(pathBuilderO, 3.0f, 11.0f, 13.5f, -1.0f);
        b.x(pathBuilderO, 15.0f, 8.5f, -1.5f, -3.0f);
        b.x(pathBuilderO, 9.0f, 7.0f, 3.0f, 1.5f);
        b.x(pathBuilderO, 9.0f, 10.0f, 3.0f, 1.0f);
        android.support.v4.media.a.y(pathBuilderO, 13.5f, 14.75f, 15.0f);
        androidx.appcompat.app.m.r(pathBuilderO, 13.0f, 12.75f, 15.0f, -1.5f);
        androidx.appcompat.graphics.drawable.a.o(pathBuilderO, 9.0f, 13.0f, 2.25f);
        pathBuilderO.lineTo(14.75f, 9.0f);
        pathBuilderO.horizontalLineToRelative(1.75f);
        pathBuilderO.lineToRelative(-2.25f, 3.0f);
        a.b.l(pathBuilderO, 2.25f, 3.0f, 14.75f);
        androidx.browser.browseractions.a.A(pathBuilderO, 19.0f, 12.5f, -1.5f, 14.0f);
        androidx.appcompat.app.m.x(pathBuilderO, -1.0f, -1.5f, 15.0f, -1.0f);
        androidx.appcompat.app.m.w(pathBuilderO, 1.5f, 10.0f, 1.0f, 1.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.browser.browseractions.a.i(pathBuilderO, 19.0f, 12.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __4kPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
