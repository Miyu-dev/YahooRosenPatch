package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: Support.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_support", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Support", "Landroidx/compose/material/icons/Icons$Filled;", "getSupport", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SupportKt {
    private static ImageVector _support;

    public static final ImageVector getSupport(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _support;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Support", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        a.y(pathBuilderD, 19.46f, 9.12f, -2.78f, 1.15f);
        pathBuilderD.curveToRelative(-0.51f, -1.36f, -1.58f, -2.44f, -2.95f, -2.94f);
        pathBuilderD.lineToRelative(1.15f, -2.78f);
        pathBuilderD.curveTo(16.98f, 5.35f, 18.65f, 7.02f, 19.46f, 9.12f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 15.0f);
        pathBuilderD.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilderD.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilderD.reflectiveCurveTo(13.66f, 15.0f, 12.0f, 15.0f);
        a.y(pathBuilderD, 9.13f, 4.54f, 1.17f, 2.78f);
        pathBuilderD.curveToRelative(-1.38f, 0.5f, -2.47f, 1.59f, -2.98f, 2.97f);
        pathBuilderD.lineTo(4.54f, 9.13f);
        pathBuilderD.curveTo(5.35f, 7.02f, 7.02f, 5.35f, 9.13f, 4.54f);
        a.y(pathBuilderD, 4.54f, 14.87f, 2.78f, -1.15f);
        pathBuilderD.curveToRelative(0.51f, 1.38f, 1.59f, 2.46f, 2.97f, 2.96f);
        pathBuilderD.lineToRelative(-1.17f, 2.78f);
        pathBuilderD.curveTo(7.02f, 18.65f, 5.35f, 16.98f, 4.54f, 14.87f);
        a.y(pathBuilderD, 14.88f, 19.46f, -1.15f, -2.78f);
        pathBuilderD.curveToRelative(1.37f, -0.51f, 2.45f, -1.59f, 2.95f, -2.97f);
        pathBuilderD.lineToRelative(2.78f, 1.17f);
        pathBuilderD.curveTo(18.65f, 16.98f, 16.98f, 18.65f, 14.88f, 19.46f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _support = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
