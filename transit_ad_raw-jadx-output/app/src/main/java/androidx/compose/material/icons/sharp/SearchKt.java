package androidx.compose.material.icons.sharp;

import a6.h;
import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: Search.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_search", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Search", "Landroidx/compose/material/icons/Icons$Sharp;", "getSearch", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SearchKt {
    private static ImageVector _search;

    public static final ImageVector getSearch(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _search;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Search", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(15.5f, 14.0f, -0.79f, -0.28f, -0.27f);
        pathBuilderA.curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        pathBuilderA.curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        pathBuilderA.reflectiveCurveTo(3.0f, 5.91f, 3.0f, 9.5f);
        pathBuilderA.reflectiveCurveTo(5.91f, 16.0f, 9.5f, 16.0f);
        pathBuilderA.curveToRelative(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        pathBuilderA.lineToRelative(0.27f, 0.28f);
        pathBuilderA.verticalLineToRelative(0.79f);
        pathBuilderA.lineToRelative(5.0f, 4.99f);
        androidx.compose.animation.a.A(pathBuilderA, 20.49f, 19.0f, -4.99f, -5.0f);
        pathBuilderA.moveTo(9.5f, 14.0f);
        pathBuilderA.curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        pathBuilderA.reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f);
        pathBuilderA.reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderA, 11.99f, 14.0f, 9.5f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _search = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
