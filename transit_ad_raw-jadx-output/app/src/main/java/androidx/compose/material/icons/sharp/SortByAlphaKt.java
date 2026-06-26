package androidx.compose.material.icons.sharp;

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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: SortByAlpha.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sortByAlpha", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SortByAlpha", "Landroidx/compose/material/icons/Icons$Sharp;", "getSortByAlpha", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SortByAlpha", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(14.94f, 4.66f, -4.72f, 2.36f, -2.36f);
        a.t(pathBuilderA, 2.36f, 2.36f, 10.25f, 19.37f);
        pathBuilderA.horizontalLineToRelative(4.66f);
        a.n(pathBuilderA, -2.33f, 2.33f, -2.33f, -2.33f);
        pathBuilderA.moveTo(6.1f, 6.27f);
        pathBuilderA.lineTo(1.6f, 17.73f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderA, 1.84f, 0.92f, -2.45f, 5.11f);
        pathBuilderA.lineToRelative(0.92f, 2.45f);
        pathBuilderA.horizontalLineToRelative(1.84f);
        a.C(pathBuilderA, 7.74f, 6.27f, 6.1f, 6.27f);
        pathBuilderA.moveTo(4.97f, 13.64f);
        pathBuilderA.lineToRelative(1.94f, -5.18f);
        s.r(pathBuilderA, 1.94f, 5.18f, 4.97f, 13.64f);
        androidx.appcompat.view.menu.a.x(pathBuilderA, 15.73f, 16.14f, 6.12f, 1.59f);
        s.s(pathBuilderA, -8.53f, -1.29f, 5.92f, -8.56f);
        androidx.appcompat.view.menu.a.t(pathBuilderA, -5.88f, -1.6f, 8.3f, 1.26f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(pathBuilderA, -5.93f, 8.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sortByAlpha = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
