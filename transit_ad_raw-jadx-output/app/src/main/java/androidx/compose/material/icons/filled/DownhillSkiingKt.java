package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: DownhillSkiing.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_downhillSkiing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DownhillSkiing", "Landroidx/compose/material/icons/Icons$Filled;", "getDownhillSkiing", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DownhillSkiingKt {
    private static ImageVector _downhillSkiing;

    public static final ImageVector getDownhillSkiing(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _downhillSkiing;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DownhillSkiing", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.5f, 4.5f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(18.5f, 3.4f, 18.5f, 4.5f);
        a.y(pathBuilderD, 15.78f, 20.9f, 0.76f, 0.27f);
        pathBuilderD.curveToRelative(0.62f, 0.21f, 1.27f, 0.33f, 1.96f, 0.33f);
        pathBuilderD.curveToRelative(0.84f, 0.0f, 1.65f, -0.18f, 2.38f, -0.5f);
        pathBuilderD.lineTo(22.0f, 22.13f);
        pathBuilderD.curveTo(20.95f, 22.68f, 19.76f, 23.0f, 18.5f, 23.0f);
        pathBuilderD.curveToRelative(-0.86f, 0.0f, -1.68f, -0.14f, -2.45f, -0.41f);
        pathBuilderD.lineTo(2.0f, 17.47f);
        pathBuilderD.lineToRelative(0.5f, -1.41f);
        pathBuilderD.lineToRelative(6.9f, 2.51f);
        pathBuilderD.lineToRelative(1.72f, -4.44f);
        pathBuilderD.lineTo(7.55f, 10.4f);
        pathBuilderD.curveTo(6.66f, 9.46f, 6.88f, 7.93f, 8.0f, 7.28f);
        pathBuilderD.lineToRelative(3.48f, -2.01f);
        pathBuilderD.curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f);
        pathBuilderD.lineToRelative(0.33f, 1.08f);
        pathBuilderD.curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f);
        pathBuilderD.lineTo(18.07f, 9.0f);
        pathBuilderD.lineToRelative(1.43f, 0.46f);
        pathBuilderD.lineToRelative(-1.12f, 3.45f);
        pathBuilderD.curveToRelative(-2.45f, -0.4f, -4.48f, -2.07f, -5.38f, -4.32f);
        pathBuilderD.lineToRelative(-2.53f, 1.45f);
        pathBuilderD.lineToRelative(3.03f, 3.46f);
        pathBuilderD.lineToRelative(-2.22f, 5.76f);
        pathBuilderD.lineToRelative(3.09f, 1.12f);
        pathBuilderD.lineToRelative(2.1f, -6.44f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.46f, 0.18f, 0.94f, 0.31f, 1.44f, 0.41f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 15.78f, 20.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downhillSkiing = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
