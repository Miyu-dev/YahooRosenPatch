package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: _6kPlus.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__6kPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_6kPlus", "Landroidx/compose/material/icons/Icons$Rounded;", "get_6kPlus", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _6kPlusKt {
    private static ImageVector __6kPlus;

    public static final ImageVector get_6kPlus(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = __6kPlus;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._6kPlus", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = androidx.appcompat.app.m.v(7.5f, 12.5f, 1.0f, 14.0f, -1.0f);
        a.y(pathBuilderV, 12.5f, 19.0f, 3.0f, 5.0f);
        pathBuilderV.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderV.verticalLineToRelative(14.0f);
        pathBuilderV.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderV.horizontalLineToRelative(14.0f);
        pathBuilderV.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderV.verticalLineTo(5.0f);
        pathBuilderV.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        androidx.browser.browseractions.a.q(pathBuilderV, 9.25f, 10.5f, 7.5f, 1.0f);
        pathBuilderV.horizontalLineTo(9.0f);
        pathBuilderV.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderV.verticalLineTo(14.0f);
        pathBuilderV.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderV.horizontalLineTo(7.0f);
        pathBuilderV.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderV.verticalLineToRelative(-4.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderV.horizontalLineToRelative(2.25f);
        pathBuilderV.curveTo(9.66f, 9.0f, 10.0f, 9.34f, 10.0f, 9.75f);
        pathBuilderV.verticalLineToRelative(0.0f);
        pathBuilderV.curveTo(10.0f, 10.16f, 9.66f, 10.5f, 9.25f, 10.5f);
        a.t(pathBuilderV, 14.59f, 15.0f, 14.59f, 15.0f);
        pathBuilderV.curveToRelative(-0.22f, 0.0f, -0.42f, -0.1f, -0.55f, -0.27f);
        pathBuilderV.lineToRelative(-1.54f, -1.98f);
        pathBuilderV.verticalLineToRelative(1.55f);
        pathBuilderV.curveToRelative(0.0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f);
        pathBuilderV.horizontalLineTo(11.7f);
        pathBuilderV.curveToRelative(-0.39f, 0.0f, -0.7f, -0.31f, -0.7f, -0.7f);
        pathBuilderV.verticalLineTo(9.7f);
        pathBuilderV.curveTo(11.0f, 9.31f, 11.31f, 9.0f, 11.7f, 9.0f);
        pathBuilderV.horizontalLineToRelative(0.09f);
        pathBuilderV.curveToRelative(0.39f, 0.0f, 0.7f, 0.31f, 0.7f, 0.7f);
        pathBuilderV.verticalLineToRelative(1.55f);
        pathBuilderV.lineToRelative(1.54f, -1.98f);
        pathBuilderV.curveTo(14.17f, 9.1f, 14.38f, 9.0f, 14.59f, 9.0f);
        pathBuilderV.horizontalLineToRelative(0.0f);
        pathBuilderV.curveToRelative(0.58f, 0.0f, 0.91f, 0.66f, 0.56f, 1.12f);
        pathBuilderV.lineTo(13.75f, 12.0f);
        pathBuilderV.lineToRelative(1.41f, 1.88f);
        pathBuilderV.curveTo(15.5f, 14.34f, 15.17f, 15.0f, 14.59f, 15.0f);
        b.r(pathBuilderV, 18.5f, 12.5f, -1.0f, 1.0f);
        pathBuilderV.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        pathBuilderV.lineToRelative(0.0f, 0.0f);
        pathBuilderV.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderV.verticalLineToRelative(-1.0f);
        pathBuilderV.horizontalLineToRelative(-1.0f);
        pathBuilderV.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        pathBuilderV.verticalLineToRelative(0.0f);
        pathBuilderV.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderV.horizontalLineToRelative(1.0f);
        pathBuilderV.verticalLineToRelative(-1.0f);
        pathBuilderV.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        pathBuilderV.lineToRelative(0.0f, 0.0f);
        pathBuilderV.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderV.verticalLineToRelative(1.0f);
        pathBuilderV.horizontalLineToRelative(1.0f);
        pathBuilderV.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        pathBuilderV.verticalLineToRelative(0.0f);
        pathBuilderV.curveTo(19.0f, 12.28f, 18.78f, 12.5f, 18.5f, 12.5f);
        pathBuilderV.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderV.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __6kPlus = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
