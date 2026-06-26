package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
import androidx.compose.animation.b;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: BakeryDining.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_bakeryDining", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BakeryDining", "Landroidx/compose/material/icons/Icons$Filled;", "getBakeryDining", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BakeryDiningKt {
    private static ImageVector _bakeryDining;

    public static final ImageVector getBakeryDining(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _bakeryDining;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BakeryDining", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int iM3071getEvenOddRgk1Os = PathFillType.INSTANCE.m3071getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.28f, 16.34f);
        pathBuilderD.curveTo(18.07f, 15.45f, 17.46f, 15.0f, 17.46f, 15.0f);
        pathBuilderD.reflectiveCurveToRelative(0.32f, -0.59f, 0.96f, -1.78f);
        pathBuilderD.curveToRelative(0.38f, -0.59f, 1.22f, -0.59f, 1.6f, 0.0f);
        pathBuilderD.lineToRelative(0.81f, 1.26f);
        pathBuilderD.curveToRelative(0.19f, 0.3f, 0.21f, 0.68f, 0.06f, 1.0f);
        pathBuilderD.lineToRelative(-0.22f, 0.47f);
        pathBuilderD.curveTo(20.42f, 16.49f, 19.76f, 16.67f, 19.28f, 16.34f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.72f, 16.34f);
        pathBuilderD.curveToRelative(-0.48f, 0.33f, -1.13f, 0.15f, -1.39f, -0.38f);
        pathBuilderD.lineTo(3.1f, 15.49f);
        pathBuilderD.curveToRelative(-0.15f, -0.32f, -0.13f, -0.7f, 0.06f, -1.0f);
        pathBuilderD.lineToRelative(0.81f, -1.26f);
        pathBuilderD.curveToRelative(0.38f, -0.59f, 1.22f, -0.59f, 1.6f, 0.0f);
        pathBuilderD.curveTo(6.22f, 14.41f, 6.54f, 15.0f, 6.54f, 15.0f);
        pathBuilderD.reflectiveCurveTo(5.93f, 15.45f, 4.72f, 16.34f);
        pathBuilderD.close();
        pathBuilderD.moveTo(15.36f, 9.37f);
        pathBuilderD.curveToRelative(0.09f, -0.68f, 0.73f, -1.06f, 1.27f, -0.75f);
        pathBuilderD.lineToRelative(1.59f, 0.9f);
        pathBuilderD.curveToRelative(0.46f, 0.26f, 0.63f, 0.91f, 0.36f, 1.41f);
        pathBuilderD.lineTo(16.5f, 15.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderD, -1.8f, 15.36f, 9.37f);
        pathBuilderD.moveTo(8.63f, 9.37f);
        pathBuilderD.lineTo(9.3f, 15.0f);
        pathBuilderD.horizontalLineTo(7.5f);
        pathBuilderD.lineToRelative(-2.09f, -4.08f);
        pathBuilderD.curveToRelative(-0.27f, -0.5f, -0.1f, -1.15f, 0.36f, -1.41f);
        pathBuilderD.lineToRelative(1.59f, -0.9f);
        pathBuilderD.curveTo(7.89f, 8.31f, 8.54f, 8.69f, 8.63f, 9.37f);
        androidx.compose.animation.a.j(pathBuilderD, 13.8f, 15.0f, -3.6f);
        pathBuilderD.lineTo(9.46f, 8.12f);
        pathBuilderD.curveTo(9.39f, 7.53f, 9.81f, 7.0f, 10.34f, 7.0f);
        pathBuilderD.horizontalLineToRelative(3.3f);
        pathBuilderD.curveToRelative(0.53f, 0.0f, 0.94f, 0.53f, 0.88f, 1.12f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 13.8f, 15.0f), iM3071getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bakeryDining = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
