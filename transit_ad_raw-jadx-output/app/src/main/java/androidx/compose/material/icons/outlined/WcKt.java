package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Wc.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wc", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Wc", "Landroidx/compose/material/icons/Icons$Outlined;", "getWc", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WcKt {
    private static ImageVector _wc;

    public static final ImageVector getWc(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _wc;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Wc", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderU = a.u(5.5f, 22.0f, -7.5f, 4.0f, 14.5f);
        pathBuilderU.lineTo(4.0f, 9.0f);
        pathBuilderU.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderU.horizontalLineToRelative(3.0f);
        pathBuilderU.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderU.verticalLineToRelative(5.5f);
        pathBuilderU.lineTo(9.5f, 14.5f);
        h.m(pathBuilderU, 9.5f, 22.0f, -4.0f);
        b.y(pathBuilderU, 18.0f, 22.0f, -6.0f, 3.0f);
        pathBuilderU.lineToRelative(-2.54f, -7.63f);
        pathBuilderU.curveTo(18.18f, 7.55f, 17.42f, 7.0f, 16.56f, 7.0f);
        pathBuilderU.horizontalLineToRelative(-0.12f);
        pathBuilderU.curveToRelative(-0.86f, 0.0f, -1.63f, 0.55f, -1.9f, 1.37f);
        androidx.compose.animation.a.o(pathBuilderU, 12.0f, 16.0f, 3.0f, 6.0f);
        androidx.compose.animation.b.q(pathBuilderU, 3.0f, 7.5f, 6.0f);
        pathBuilderU.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilderU.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilderU.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilderU.reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilderU.close();
        pathBuilderU.moveTo(16.5f, 6.0f);
        pathBuilderU.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilderU.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilderU.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.view.menu.a.j(pathBuilderU, 0.89f, 2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wc = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
