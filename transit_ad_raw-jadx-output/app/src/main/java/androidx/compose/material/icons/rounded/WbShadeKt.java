package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: WbShade.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_wbShade", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbShade", "Landroidx/compose/material/icons/Icons$Rounded;", "getWbShade", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WbShadeKt {
    private static ImageVector _wbShade;

    public static final ImageVector getWbShade(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _wbShade;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WbShade", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(14.0f, 14.13f, 14.0f, 14.13f);
        pathBuilderA.curveToRelative(0.0f, 0.23f, 0.09f, 0.46f, 0.26f, 0.63f);
        pathBuilderA.lineToRelative(4.98f, 4.98f);
        pathBuilderA.curveToRelative(0.17f, 0.17f, 0.39f, 0.26f, 0.62f, 0.26f);
        pathBuilderA.horizontalLineToRelative(0.0f);
        pathBuilderA.curveToRelative(0.79f, 0.0f, 1.18f, -0.95f, 0.62f, -1.51f);
        pathBuilderA.lineToRelative(-4.98f, -4.98f);
        pathBuilderA.curveTo(14.95f, 12.95f, 14.0f, 13.35f, 14.0f, 14.13f);
        a.j(pathBuilderA, 15.0f, 20.0f, 2.0f);
        pathBuilderA.lineToRelative(-3.0f, -3.0f);
        pathBuilderA.verticalLineToRelative(2.0f);
        pathBuilderA.curveTo(14.0f, 19.55f, 14.45f, 20.0f, 15.0f, 20.0f);
        a.t(pathBuilderA, 7.65f, 4.35f, 2.85f, 9.15f);
        pathBuilderA.curveTo(2.54f, 9.46f, 2.76f, 10.0f, 3.21f, 10.0f);
        pathBuilderA.horizontalLineTo(4.0f);
        pathBuilderA.verticalLineToRelative(9.0f);
        pathBuilderA.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderA.horizontalLineToRelative(6.0f);
        pathBuilderA.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderA.verticalLineToRelative(-9.0f);
        pathBuilderA.horizontalLineToRelative(0.79f);
        pathBuilderA.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilderA.lineTo(8.35f, 4.35f);
        pathBuilderA.curveTo(8.16f, 4.16f, 7.84f, 4.16f, 7.65f, 4.35f);
        androidx.browser.browseractions.a.q(pathBuilderA, 9.0f, 14.0f, 7.0f, -4.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.g(pathBuilderA, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbShade = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
