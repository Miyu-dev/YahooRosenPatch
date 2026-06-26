package androidx.compose.material.icons.twotone;

import android.support.v4.media.a;
import androidx.appcompat.R;
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
import c.h;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Stairs.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stairs", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Stairs", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStairs", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StairsKt {
    private static ImageVector _stairs;

    public static final ImageVector getStairs(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _stairs;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Stairs", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(19.0f, 5.0f, 14.0f, 5.0f, 5.0f);
        pathBuilderU.horizontalLineTo(19.0f);
        pathBuilderU.moveTo(18.0f, 6.0f);
        pathBuilderU.horizontalLineToRelative(-4.42f);
        androidx.appcompat.app.m.z(pathBuilderU, 3.33f, 11.0f, 3.33f, 8.42f);
        b.x(pathBuilderU, 16.0f, 6.0f, 2.0f, 4.42f);
        a.b.x(pathBuilderU, -3.33f, 13.0f, -3.33f, 2.58f);
        pathBuilderU.verticalLineTo(8.0f);
        pathBuilderU.horizontalLineTo(18.0f);
        pathBuilderU.verticalLineTo(6.0f);
        pathBuilderU.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderU.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU2 = a.u(19.0f, 5.0f, 14.0f, 5.0f, 5.0f);
        h.f(pathBuilderU2, 19.0f, 19.0f, 3.0f, 5.0f);
        pathBuilderU2.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderU2.verticalLineToRelative(14.0f);
        pathBuilderU2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderU2.horizontalLineToRelative(14.0f);
        pathBuilderU2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderU2.verticalLineTo(5.0f);
        pathBuilderU2.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderU2, 19.0f, 3.0f, 18.0f, 6.0f);
        androidx.appcompat.app.m.x(pathBuilderU2, -4.42f, 3.33f, 11.0f, 3.33f);
        androidx.compose.animation.a.v(pathBuilderU2, 8.42f, 16.0f, 6.0f, 2.0f);
        androidx.appcompat.app.m.x(pathBuilderU2, 4.42f, -3.33f, 13.0f, -3.33f);
        pathBuilderU2.horizontalLineToRelative(2.58f);
        pathBuilderU2.verticalLineTo(8.0f);
        pathBuilderU2.horizontalLineTo(18.0f);
        pathBuilderU2.verticalLineTo(6.0f);
        pathBuilderU2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderU2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stairs = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
