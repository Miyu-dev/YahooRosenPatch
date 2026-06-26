package androidx.compose.material.icons.filled;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: SortByAlpha.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sortByAlpha", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SortByAlpha", "Landroidx/compose/material/icons/Icons$Filled;", "getSortByAlpha", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SortByAlpha", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.94f, 4.66f);
        pathBuilder.horizontalLineToRelative(-4.72f);
        pathBuilder.lineToRelative(2.36f, -2.36f);
        pathBuilder.close();
        pathBuilder.moveTo(10.25f, 19.37f);
        b.C(pathBuilder, 4.66f, -2.33f, 2.33f);
        pathBuilder.moveTo(6.1f, 6.27f);
        pathBuilder.lineTo(1.6f, 17.73f);
        a.B(pathBuilder, 1.84f, 0.92f, -2.45f, 5.11f);
        pathBuilder.lineToRelative(0.92f, 2.45f);
        pathBuilder.horizontalLineToRelative(1.84f);
        android.support.v4.media.a.C(pathBuilder, 7.74f, 6.27f, 6.1f, 6.27f);
        pathBuilder.moveTo(4.97f, 13.64f);
        pathBuilder.lineToRelative(1.94f, -5.18f);
        s.r(pathBuilder, 1.94f, 5.18f, 4.97f, 13.64f);
        androidx.appcompat.view.menu.a.x(pathBuilder, 15.73f, 16.14f, 6.12f, 1.59f);
        s.s(pathBuilder, -8.53f, -1.29f, 5.92f, -8.56f);
        androidx.appcompat.view.menu.a.t(pathBuilder, -5.88f, -1.6f, 8.3f, 1.26f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(pathBuilder, -5.93f, 8.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sortByAlpha = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
