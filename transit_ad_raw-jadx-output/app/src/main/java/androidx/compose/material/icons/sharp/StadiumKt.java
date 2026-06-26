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
import c.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Stadium.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stadium", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Stadium", "Landroidx/compose/material/icons/Icons$Sharp;", "getStadium", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StadiumKt {
    private static ImageVector _stadium;

    public static final ImageVector getStadium(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _stadium;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Stadium", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = c.c(7.0f, 5.0f, 3.0f, 7.0f, 3.0f);
        a.z(pathBuilderC, 7.0f, 5.0f, 18.0f, 3.0f);
        pathBuilderC.verticalLineToRelative(4.0f);
        s.r(pathBuilderC, 4.0f, -2.0f, 18.0f, 3.0f);
        pathBuilderC.moveTo(11.0f, 2.0f);
        pathBuilderC.verticalLineToRelative(4.0f);
        s.r(pathBuilderC, 4.0f, -2.0f, 11.0f, 2.0f);
        pathBuilderC.moveTo(5.0f, 10.04f);
        pathBuilderC.curveTo(6.38f, 10.53f, 8.77f, 11.0f, 12.0f, 11.0f);
        pathBuilderC.reflectiveCurveToRelative(5.62f, -0.47f, 7.0f, -0.96f);
        pathBuilderC.curveTo(19.0f, 9.86f, 16.22f, 9.0f, 12.0f, 9.0f);
        pathBuilderC.reflectiveCurveTo(5.0f, 9.86f, 5.0f, 10.04f);
        androidx.browser.browseractions.a.k(pathBuilderC, 15.0f, 17.0f, 9.0f);
        pathBuilderC.lineToRelative(0.0f, 4.88f);
        pathBuilderC.curveTo(4.94f, 21.49f, 2.0f, 20.34f, 2.0f, 19.0f);
        pathBuilderC.verticalLineToRelative(-9.0f);
        pathBuilderC.curveToRelative(0.0f, -1.66f, 4.48f, -3.0f, 10.0f, -3.0f);
        pathBuilderC.reflectiveCurveToRelative(10.0f, 1.34f, 10.0f, 3.0f);
        pathBuilderC.verticalLineToRelative(9.0f);
        pathBuilderC.curveToRelative(0.0f, 1.34f, -2.94f, 2.48f, -7.0f, 2.87f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderC, 15.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stadium = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
