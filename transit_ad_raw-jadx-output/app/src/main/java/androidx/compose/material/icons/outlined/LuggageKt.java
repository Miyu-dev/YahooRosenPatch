package androidx.compose.material.icons.outlined;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Luggage.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_luggage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Luggage", "Landroidx/compose/material/icons/Icons$Outlined;", "getLuggage", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LuggageKt {
    private static ImageVector _luggage;

    public static final ImageVector getLuggage(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _luggage;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Luggage", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderG = androidx.appcompat.app.m.g(9.5f, 18.0f, 8.0f, 9.0f, 1.5f);
        a.B(pathBuilderG, 18.0f, 12.75f, 18.0f, -1.5f);
        a.v(pathBuilderG, 9.0f, 1.5f, 18.0f);
        androidx.browser.browseractions.a.A(pathBuilderG, 16.0f, 18.0f, -1.5f, 9.0f);
        b.B(pathBuilderG, 16.0f, 18.0f, 17.0f, 6.0f);
        pathBuilderG.horizontalLineToRelative(-2.0f);
        pathBuilderG.verticalLineTo(3.0f);
        pathBuilderG.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderG.horizontalLineToRelative(-4.0f);
        pathBuilderG.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        pathBuilderG.verticalLineToRelative(3.0f);
        pathBuilderG.horizontalLineTo(7.0f);
        pathBuilderG.curveTo(5.9f, 6.0f, 5.0f, 6.9f, 5.0f, 8.0f);
        pathBuilderG.verticalLineToRelative(11.0f);
        pathBuilderG.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderG.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderG.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderG.horizontalLineToRelative(6.0f);
        pathBuilderG.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderG.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderG.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderG.verticalLineTo(8.0f);
        pathBuilderG.curveTo(19.0f, 6.9f, 18.1f, 6.0f, 17.0f, 6.0f);
        androidx.compose.animation.a.k(pathBuilderG, 10.5f, 3.5f, 3.0f, 6.0f);
        b.m(pathBuilderG, -3.0f, 3.5f, 17.0f, 19.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, g.e(pathBuilderG, 7.0f, 8.0f, 10.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _luggage = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
