package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: GasMeter.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_gasMeter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "GasMeter", "Landroidx/compose/material/icons/Icons$Rounded;", "getGasMeter", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GasMeterKt {
    private static ImageVector _gasMeter;

    public static final ImageVector getGasMeter(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _gasMeter;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GasMeter", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderT = b.t(16.0f, 4.0f, -1.0f, 3.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderT.horizontalLineToRelative(0.0f);
        pathBuilderT.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        s.l(pathBuilderT, 1.0f, -2.0f, 3.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderT.horizontalLineToRelative(0.0f);
        pathBuilderT.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        pathBuilderT.verticalLineToRelative(1.0f);
        pathBuilderT.horizontalLineTo(8.0f);
        pathBuilderT.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        pathBuilderT.verticalLineToRelative(10.0f);
        pathBuilderT.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderT.horizontalLineToRelative(8.0f);
        pathBuilderT.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderT.verticalLineTo(8.0f);
        pathBuilderT.curveTo(20.0f, 5.79f, 18.21f, 4.0f, 16.0f, 4.0f);
        pathBuilderT.close();
        pathBuilderT.moveTo(12.0f, 18.0f);
        pathBuilderT.curveToRelative(-1.38f, 0.0f, -2.5f, -1.1f, -2.5f, -2.46f);
        pathBuilderT.curveToRelative(0.0f, -1.02f, 0.38f, -1.35f, 2.12f, -3.35f);
        pathBuilderT.curveToRelative(0.2f, -0.23f, 0.56f, -0.23f, 0.75f, 0.0f);
        pathBuilderT.curveToRelative(1.73f, 1.99f, 2.12f, 2.34f, 2.12f, 3.35f);
        pathBuilderT.curveTo(14.5f, 16.9f, 13.38f, 18.0f, 12.0f, 18.0f);
        a.k(pathBuilderT, 15.0f, 10.0f, 9.0f);
        pathBuilderT.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderT.verticalLineToRelative(0.0f);
        pathBuilderT.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderT.horizontalLineToRelative(6.0f);
        pathBuilderT.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderT.verticalLineToRelative(0.0f);
        pathBuilderT.curveTo(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f);
        pathBuilderT.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderT.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gasMeter = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
