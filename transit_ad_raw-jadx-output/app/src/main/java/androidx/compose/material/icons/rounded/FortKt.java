package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
import c.i;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: Fort.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_fort", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Fort", "Landroidx/compose/material/icons/Icons$Rounded;", "getFort", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class FortKt {
    private static ImageVector _fort;

    public static final ImageVector getFort(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _fort;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Fort", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderV = s.v(21.0f, 4.0f, 1.0f, -2.0f, 4.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderV.horizontalLineToRelative(0.0f);
        pathBuilderV.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        s.l(pathBuilderV, 1.0f, -2.0f, 4.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderV.horizontalLineToRelative(0.0f);
        pathBuilderV.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderV.verticalLineToRelative(2.17f);
        pathBuilderV.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        a.p(pathBuilderV, 15.0f, 9.0f, 1.0f, 9.0f);
        pathBuilderV.verticalLineTo(9.0f);
        pathBuilderV.lineToRelative(1.41f, -1.41f);
        pathBuilderV.curveTo(10.79f, 7.21f, 11.0f, 6.7f, 11.0f, 6.17f);
        pathBuilderV.verticalLineTo(4.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderV.horizontalLineToRelative(0.0f);
        pathBuilderV.curveTo(9.45f, 3.0f, 9.0f, 3.45f, 9.0f, 4.0f);
        i.c(pathBuilderV, 1.0f, 7.0f, 4.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderV.horizontalLineToRelative(0.0f);
        pathBuilderV.curveTo(5.45f, 3.0f, 5.0f, 3.45f, 5.0f, 4.0f);
        i.c(pathBuilderV, 1.0f, 3.0f, 4.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderV.horizontalLineToRelative(0.0f);
        pathBuilderV.curveTo(1.45f, 3.0f, 1.0f, 3.45f, 1.0f, 4.0f);
        pathBuilderV.verticalLineToRelative(2.17f);
        pathBuilderV.curveTo(1.0f, 6.7f, 1.21f, 7.21f, 1.59f, 7.59f);
        pathBuilderV.lineTo(3.0f, 9.0f);
        pathBuilderV.verticalLineToRelative(6.0f);
        pathBuilderV.lineToRelative(-1.41f, 1.41f);
        pathBuilderV.curveTo(1.21f, 16.79f, 1.0f, 17.3f, 1.0f, 17.83f);
        pathBuilderV.verticalLineTo(19.0f);
        pathBuilderV.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderV.horizontalLineToRelative(7.0f);
        pathBuilderV.lineToRelative(0.0f, -2.89f);
        pathBuilderV.curveToRelative(0.0f, -1.0f, 0.68f, -1.92f, 1.66f, -2.08f);
        pathBuilderV.curveTo(12.92f, 15.82f, 14.0f, 16.79f, 14.0f, 18.0f);
        pathBuilderV.verticalLineToRelative(3.0f);
        pathBuilderV.horizontalLineToRelative(7.0f);
        pathBuilderV.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderV.verticalLineToRelative(-1.17f);
        pathBuilderV.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        pathBuilderV.lineTo(21.0f, 15.0f);
        pathBuilderV.verticalLineTo(9.0f);
        pathBuilderV.lineToRelative(1.41f, -1.41f);
        pathBuilderV.curveTo(22.79f, 7.21f, 23.0f, 6.7f, 23.0f, 6.17f);
        pathBuilderV.verticalLineTo(4.0f);
        pathBuilderV.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderV.horizontalLineToRelative(0.0f);
        pathBuilderV.curveTo(21.45f, 3.0f, 21.0f, 3.45f, 21.0f, 4.0f);
        pathBuilderV.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderV.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fort = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
