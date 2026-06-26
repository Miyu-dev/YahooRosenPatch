package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Calculate.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_calculate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Calculate", "Landroidx/compose/material/icons/Icons$Rounded;", "getCalculate", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CalculateKt {
    private static ImageVector _calculate;

    public static final ImageVector getCalculate(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _calculate;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Calculate", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(19.0f, 3.0f, 5.0f);
        pathBuilderB.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilderB.verticalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB.horizontalLineToRelative(14.0f);
        pathBuilderB.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderB.verticalLineTo(5.0f);
        pathBuilderB.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        a.t(pathBuilderB, 13.56f, 6.53f, 13.56f, 6.53f);
        pathBuilderB.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilderB.lineToRelative(0.88f, 0.88f);
        pathBuilderB.lineToRelative(0.88f, -0.88f);
        pathBuilderB.curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilderB.lineToRelative(-0.88f, 0.88f);
        pathBuilderB.lineToRelative(0.88f, 0.88f);
        pathBuilderB.curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0.0f, 1.06f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilderB.lineTo(15.5f, 9.54f);
        pathBuilderB.lineToRelative(-0.88f, 0.88f);
        pathBuilderB.curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0.0f, -1.06f);
        pathBuilderB.lineToRelative(0.88f, -0.88f);
        pathBuilderB.lineToRelative(-0.88f, -0.88f);
        pathBuilderB.curveTo(13.26f, 7.3f, 13.26f, 6.82f, 13.56f, 6.53f);
        a.j(pathBuilderB, 7.0f, 7.72f, 3.5f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        pathBuilderB.horizontalLineTo(7.0f);
        pathBuilderB.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(6.25f, 8.06f, 6.59f, 7.72f, 7.0f, 7.72f);
        androidx.browser.browseractions.a.q(pathBuilderB, 10.75f, 16.0f, 9.5f, 1.25f);
        pathBuilderB.curveTo(9.5f, 17.66f, 9.16f, 18.0f, 8.75f, 18.0f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveTo(8.34f, 18.0f, 8.0f, 17.66f, 8.0f, 17.25f);
        pathBuilderB.verticalLineTo(16.0f);
        pathBuilderB.horizontalLineTo(6.75f);
        pathBuilderB.curveTo(6.34f, 16.0f, 6.0f, 15.66f, 6.0f, 15.25f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderB.horizontalLineTo(8.0f);
        pathBuilderB.verticalLineToRelative(-1.25f);
        pathBuilderB.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderB.horizontalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderB.verticalLineToRelative(1.25f);
        pathBuilderB.horizontalLineToRelative(1.25f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(11.5f, 15.66f, 11.16f, 16.0f, 10.75f, 16.0f);
        a.j(pathBuilderB, 17.25f, 17.25f, -3.5f);
        pathBuilderB.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderB.horizontalLineToRelative(3.5f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderB.lineToRelative(0.0f, 0.0f);
        pathBuilderB.curveTo(18.0f, 16.91f, 17.66f, 17.25f, 17.25f, 17.25f);
        a.j(pathBuilderB, 17.25f, 14.75f, -3.5f);
        pathBuilderB.curveTo(13.34f, 14.75f, 13.0f, 14.41f, 13.0f, 14.0f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilderB.horizontalLineToRelative(3.5f);
        pathBuilderB.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilderB.verticalLineToRelative(0.0f);
        pathBuilderB.curveTo(18.0f, 14.41f, 17.66f, 14.75f, 17.25f, 14.75f);
        pathBuilderB.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _calculate = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
