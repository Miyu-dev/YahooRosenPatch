package androidx.compose.material.icons.filled;

import a.b;
import a6.h;
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

/* JADX INFO: compiled from: Toys.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_toys", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Toys", "Landroidx/compose/material/icons/Icons$Filled;", "getToys", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ToysKt {
    private static ImageVector _toys;

    public static final ImageVector getToys(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _toys;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Toys", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(22.0f, 14.0f);
        pathBuilderD.curveToRelative(0.0f, -1.95f, -1.4f, -3.57f, -3.25f, -3.92f);
        pathBuilderD.lineTo(17.4f, 6.05f);
        pathBuilderD.curveTo(17.0f, 4.82f, 15.85f, 4.0f, 14.56f, 4.0f);
        pathBuilderD.horizontalLineTo(9.44f);
        pathBuilderD.curveTo(8.15f, 4.0f, 7.0f, 4.82f, 6.6f, 6.05f);
        pathBuilderD.lineTo(5.81f, 8.4f);
        pathBuilderD.lineTo(4.41f, 7.0f);
        pathBuilderD.lineToRelative(0.29f, -0.29f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.lineToRelative(-2.0f, 2.0f);
        pathBuilderD.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilderD.lineTo(3.0f, 8.41f);
        pathBuilderD.lineToRelative(1.79f, 1.79f);
        pathBuilderD.curveTo(3.18f, 10.72f, 2.0f, 12.22f, 2.0f, 14.0f);
        pathBuilderD.curveToRelative(0.0f, 1.5f, 0.83f, 2.79f, 2.05f, 3.48f);
        pathBuilderD.curveTo(4.28f, 18.9f, 5.51f, 20.0f, 7.0f, 20.0f);
        pathBuilderD.curveToRelative(1.3f, 0.0f, 2.4f, -0.84f, 2.82f, -2.0f);
        pathBuilderD.horizontalLineToRelative(4.37f);
        pathBuilderD.curveToRelative(0.41f, 1.16f, 1.51f, 2.0f, 2.82f, 2.0f);
        pathBuilderD.curveToRelative(1.49f, 0.0f, 2.72f, -1.1f, 2.95f, -2.52f);
        pathBuilderD.curveTo(21.17f, 16.79f, 22.0f, 15.5f, 22.0f, 14.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.0f, 18.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilderD.reflectiveCurveTo(7.55f, 18.0f, 7.0f, 18.0f);
        a.k(pathBuilderD, 11.0f, 10.0f, 7.41f);
        pathBuilderD.lineTo(7.39f, 9.98f);
        pathBuilderD.lineToRelative(1.1f, -3.3f);
        pathBuilderD.curveTo(8.63f, 6.27f, 9.01f, 6.0f, 9.44f, 6.0f);
        b.B(pathBuilderD, 11.0f, 10.0f, 13.0f, 6.0f);
        pathBuilderD.horizontalLineToRelative(1.56f);
        pathBuilderD.curveToRelative(0.43f, 0.0f, 0.81f, 0.27f, 0.95f, 0.68f);
        pathBuilderD.lineTo(16.61f, 10.0f);
        pathBuilderD.horizontalLineTo(13.0f);
        pathBuilderD.verticalLineTo(6.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.0f, 18.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 17.55f, 18.0f, 17.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _toys = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
