package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.view.menu.a;
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

/* JADX INFO: compiled from: Tapas.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_tapas", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Tapas", "Landroidx/compose/material/icons/Icons$Rounded;", "getTapas", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TapasKt {
    private static ImageVector _tapas;

    public static final ImageVector getTapas(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _tapas;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Tapas", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderN = s.n(22.0f, 10.0f, 2.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderN.horizontalLineToRelative(-6.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderN.verticalLineToRelative(8.0f);
        pathBuilderN.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        pathBuilderN.verticalLineTo(21.0f);
        pathBuilderN.horizontalLineToRelative(-1.0f);
        pathBuilderN.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderN.verticalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderN.horizontalLineToRelative(4.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderN.horizontalLineToRelative(-1.0f);
        pathBuilderN.verticalLineToRelative(-7.14f);
        pathBuilderN.curveTo(20.72f, 13.41f, 22.0f, 11.86f, 22.0f, 10.0f);
        androidx.appcompat.app.m.n(pathBuilderN, 20.0f, 3.0f, 3.0f, -4.0f);
        a.o(pathBuilderN, 3.0f, 20.0f, 9.86f, 9.0f);
        pathBuilderN.lineTo(8.0f, 9.0f);
        pathBuilderN.verticalLineTo(8.0f);
        pathBuilderN.lineToRelative(1.86f, 0.0f);
        pathBuilderN.curveToRelative(1.31f, 0.0f, 2.5f, -0.94f, 2.63f, -2.24f);
        pathBuilderN.curveTo(12.64f, 4.26f, 11.47f, 3.0f, 10.0f, 3.0f);
        pathBuilderN.horizontalLineTo(8.0f);
        pathBuilderN.verticalLineTo(2.0f);
        pathBuilderN.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderN.horizontalLineToRelative(0.0f);
        pathBuilderN.curveTo(6.45f, 1.0f, 6.0f, 1.45f, 6.0f, 2.0f);
        pathBuilderN.verticalLineToRelative(1.0f);
        pathBuilderN.lineTo(4.14f, 3.0f);
        pathBuilderN.curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f);
        pathBuilderN.curveTo(1.36f, 6.74f, 2.53f, 8.0f, 4.0f, 8.0f);
        android.support.v4.media.a.w(pathBuilderN, 2.0f, 1.0f, 4.14f, 9.0f);
        pathBuilderN.curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f);
        pathBuilderN.curveTo(1.36f, 12.74f, 2.53f, 14.0f, 4.0f, 14.0f);
        pathBuilderN.horizontalLineToRelative(2.0f);
        pathBuilderN.verticalLineToRelative(8.0f);
        pathBuilderN.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderN.horizontalLineToRelative(0.0f);
        pathBuilderN.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderN.verticalLineToRelative(-8.0f);
        pathBuilderN.horizontalLineToRelative(2.0f);
        pathBuilderN.curveToRelative(1.47f, 0.0f, 2.64f, -1.26f, 2.49f, -2.76f);
        pathBuilderN.curveTo(12.36f, 9.94f, 11.17f, 9.0f, 9.86f, 9.0f);
        pathBuilderN.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderN.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tapas = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
