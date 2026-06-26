package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.v;
import androidx.browser.browseractions.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: GridView.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_gridView", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GridView", "Landroidx/compose/material/icons/Icons$Filled;", "getGridView", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GridViewKt {
    private static ImageVector _gridView;

    public static final ImageVector getGridView(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _gridView;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GridView", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int iM3071getEvenOddRgk1Os = PathFillType.INSTANCE.m3071getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(3.0f, 3.0f, 8.0f, 8.0f);
        android.support.v4.media.a.C(pathBuilderE, 11.0f, 3.0f, 3.0f, 3.0f);
        pathBuilderE.moveTo(9.0f, 9.0f);
        pathBuilderE.lineTo(5.0f, 9.0f);
        s.w(pathBuilderE, 5.0f, 5.0f, 4.0f, 4.0f);
        b.y(pathBuilderE, 3.0f, 13.0f, 8.0f, 8.0f);
        h.q(pathBuilderE, -8.0f, 3.0f, 13.0f);
        pathBuilderE.moveTo(9.0f, 19.0f);
        b.s(pathBuilderE, 5.0f, 19.0f, -4.0f, 4.0f);
        s.z(pathBuilderE, 4.0f, 13.0f, 3.0f, 8.0f);
        h.C(pathBuilderE, 8.0f, 21.0f, 3.0f, -8.0f);
        pathBuilderE.moveTo(19.0f, 9.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderE, -4.0f, 15.0f, 5.0f, 4.0f);
        s.z(pathBuilderE, 4.0f, 13.0f, 13.0f, 8.0f);
        androidx.compose.animation.b.t(pathBuilderE, 8.0f, -8.0f, -8.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderE, 19.0f, 19.0f, -4.0f, -4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, v.j(pathBuilderE, 4.0f, 4.0f), iM3071getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gridView = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
