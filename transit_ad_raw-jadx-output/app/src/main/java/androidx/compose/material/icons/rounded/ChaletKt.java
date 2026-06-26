package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: Chalet.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_chalet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Chalet", "Landroidx/compose/material/icons/Icons$Rounded;", "getChalet", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ChaletKt {
    private static ImageVector _chalet;

    public static final ImageVector getChalet(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _chalet;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Chalet", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.0f, 15.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.verticalLineToRelative(4.0f);
        pathBuilderD.horizontalLineTo(6.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-3.67f);
        pathBuilderD.lineToRelative(-0.38f, 0.38f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineToRelative(6.09f, -6.09f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(6.09f, 6.09f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilderD.lineTo(15.0f, 15.33f);
        pathBuilderD.verticalLineTo(19.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(-3.0f);
        pathBuilderD.verticalLineToRelative(-4.0f);
        pathBuilderD.curveTo(11.0f, 15.45f, 10.55f, 15.0f, 10.0f, 15.0f);
        androidx.compose.animation.a.n(pathBuilderD, 17.5f, 7.5f, 0.89f);
        pathBuilderD.lineToRelative(-1.08f, 1.08f);
        pathBuilderD.curveToRelative(-0.18f, 0.18f, -0.21f, 0.48f, -0.05f, 0.69f);
        pathBuilderD.curveToRelative(0.19f, 0.23f, 0.53f, 0.24f, 0.74f, 0.04f);
        pathBuilderD.lineToRelative(0.39f, -0.39f);
        pathBuilderD.verticalLineToRelative(0.69f);
        pathBuilderD.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilderD.verticalLineTo(9.81f);
        pathBuilderD.lineToRelative(0.39f, 0.39f);
        pathBuilderD.curveToRelative(0.21f, 0.21f, 0.55f, 0.19f, 0.74f, -0.04f);
        pathBuilderD.curveToRelative(0.17f, -0.2f, 0.14f, -0.5f, -0.05f, -0.69f);
        pathBuilderD.lineTo(18.5f, 8.39f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 0.0f, -0.89f, 0.0f, -0.89f);
        pathBuilderD.horizontalLineToRelative(0.89f);
        pathBuilderD.lineToRelative(1.08f, 1.08f);
        pathBuilderD.curveToRelative(0.18f, 0.18f, 0.48f, 0.21f, 0.69f, 0.05f);
        pathBuilderD.curveToRelative(0.23f, -0.19f, 0.24f, -0.53f, 0.04f, -0.74f);
        pathBuilderD.lineTo(20.81f, 7.5f);
        pathBuilderD.horizontalLineToRelative(0.69f);
        pathBuilderD.curveTo(21.78f, 7.5f, 22.0f, 7.28f, 22.0f, 7.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilderD.lineToRelative(-0.69f, 0.0f);
        pathBuilderD.lineToRelative(0.39f, -0.39f);
        pathBuilderD.curveToRelative(0.21f, -0.21f, 0.19f, -0.55f, -0.04f, -0.74f);
        pathBuilderD.curveToRelative(-0.2f, -0.17f, -0.5f, -0.14f, -0.69f, 0.05f);
        pathBuilderD.lineTo(19.39f, 6.5f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, -0.89f, 0.0f, -0.89f, 0.0f);
        pathBuilderD.verticalLineTo(5.61f);
        pathBuilderD.lineToRelative(1.08f, -1.08f);
        pathBuilderD.curveToRelative(0.18f, -0.18f, 0.21f, -0.48f, 0.05f, -0.69f);
        pathBuilderD.curveToRelative(-0.19f, -0.23f, -0.53f, -0.24f, -0.74f, -0.04f);
        pathBuilderD.lineTo(18.5f, 4.19f);
        pathBuilderD.verticalLineTo(3.5f);
        pathBuilderD.curveTo(18.5f, 3.22f, 18.28f, 3.0f, 18.0f, 3.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        pathBuilderD.verticalLineToRelative(0.69f);
        pathBuilderD.lineTo(17.11f, 3.8f);
        pathBuilderD.curveToRelative(-0.21f, -0.21f, -0.55f, -0.19f, -0.74f, 0.04f);
        pathBuilderD.curveToRelative(-0.17f, 0.2f, -0.14f, 0.5f, 0.05f, 0.69f);
        pathBuilderD.lineToRelative(1.08f, 1.08f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, 0.0f, 0.89f, 0.0f, 0.89f);
        pathBuilderD.horizontalLineToRelative(-0.89f);
        pathBuilderD.lineToRelative(-1.08f, -1.08f);
        pathBuilderD.curveToRelative(-0.18f, -0.18f, -0.48f, -0.21f, -0.69f, -0.05f);
        pathBuilderD.curveToRelative(-0.23f, 0.19f, -0.24f, 0.53f, -0.04f, 0.74f);
        pathBuilderD.lineToRelative(0.39f, 0.39f);
        pathBuilderD.horizontalLineTo(14.5f);
        pathBuilderD.curveTo(14.22f, 6.5f, 14.0f, 6.72f, 14.0f, 7.0f);
        pathBuilderD.verticalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilderD.lineToRelative(0.69f, 0.0f);
        pathBuilderD.lineTo(14.8f, 7.89f);
        pathBuilderD.curveToRelative(-0.21f, 0.21f, -0.19f, 0.55f, 0.04f, 0.74f);
        pathBuilderD.curveToRelative(0.2f, 0.17f, 0.5f, 0.14f, 0.69f, -0.05f);
        pathBuilderD.lineToRelative(1.08f, -1.08f);
        pathBuilderD.curveTo(16.61f, 7.5f, 17.5f, 7.5f, 17.5f, 7.5f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chalet = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
