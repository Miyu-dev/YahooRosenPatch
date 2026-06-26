package androidx.compose.material.icons.sharp;

import a.b;
import a6.h;
import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: RecentActors.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_recentActors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RecentActors", "Landroidx/compose/material/icons/Icons$Sharp;", "getRecentActors", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RecentActorsKt {
    private static ImageVector _recentActors;

    public static final ImageVector getRecentActors(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _recentActors;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.RecentActors", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(21.0f, 5.0f, 14.0f, 2.0f);
        h.m(pathBuilderE, 23.0f, 5.0f, -2.0f);
        pathBuilderE.moveTo(17.0f, 19.0f);
        androidx.appcompat.view.menu.a.y(pathBuilderE, 2.0f, 19.0f, 5.0f, -2.0f);
        android.support.v4.media.a.v(pathBuilderE, 14.0f, 15.0f, 5.0f);
        b.s(pathBuilderE, 1.0f, 5.0f, 14.0f, 14.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderE, 15.0f, 5.0f, 8.0f, 7.75f);
        pathBuilderE.curveToRelative(1.24f, 0.0f, 2.25f, 1.01f, 2.25f, 2.25f);
        pathBuilderE.reflectiveCurveTo(9.24f, 12.25f, 8.0f, 12.25f);
        pathBuilderE.reflectiveCurveTo(5.75f, 11.24f, 5.75f, 10.0f);
        pathBuilderE.reflectiveCurveTo(6.76f, 7.75f, 8.0f, 7.75f);
        androidx.compose.animation.b.r(pathBuilderE, 12.5f, 17.0f, -9.0f, -0.75f);
        pathBuilderE.curveToRelative(0.0f, -1.5f, 3.0f, -2.25f, 4.5f, -2.25f);
        pathBuilderE.reflectiveCurveToRelative(4.5f, 0.75f, 4.5f, 2.25f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.compose.animation.b.h(pathBuilderE, 12.5f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recentActors = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
