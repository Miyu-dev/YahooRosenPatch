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

/* JADX INFO: compiled from: Snowmobile.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_snowmobile", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Snowmobile", "Landroidx/compose/material/icons/Icons$Rounded;", "getSnowmobile", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SnowmobileKt {
    private static ImageVector _snowmobile;

    public static final ImageVector getSnowmobile(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _snowmobile;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Snowmobile", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(11.0f, 6.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(1.25f);
        pathBuilderD.lineToRelative(1.45f, 1.3f);
        pathBuilderD.lineTo(11.0f, 11.0f);
        pathBuilderD.lineToRelative(-9.12f, -0.96f);
        pathBuilderD.curveTo(0.88f, 9.93f, 0.0f, 10.72f, 0.0f, 11.73f);
        pathBuilderD.curveToRelative(0.0f, 0.75f, 0.49f, 1.41f, 1.21f, 1.63f);
        pathBuilderD.lineToRelative(3.33f, 1.0f);
        pathBuilderD.lineToRelative(-3.49f, 1.88f);
        pathBuilderD.curveTo(-0.77f, 17.22f, -0.07f, 20.0f, 2.0f, 20.0f);
        pathBuilderD.horizontalLineToRelative(6.0f);
        pathBuilderD.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        androidx.appcompat.graphics.drawable.a.B(pathBuilderD, 4.0f, 2.0f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(5.0f);
        pathBuilderD.curveToRelative(1.13f, 0.0f, 2.11f, -0.62f, 2.63f, -1.55f);
        pathBuilderD.curveToRelative(0.36f, -0.65f, -0.15f, -1.45f, -0.9f, -1.45f);
        pathBuilderD.curveToRelative(-0.34f, 0.0f, -0.68f, 0.16f, -0.84f, 0.47f);
        pathBuilderD.curveTo(21.72f, 17.78f, 21.38f, 18.0f, 21.0f, 18.0f);
        pathBuilderD.horizontalLineToRelative(-0.17f);
        pathBuilderD.lineToRelative(-2.2f, -2.2f);
        pathBuilderD.curveTo(20.58f, 15.37f, 22.0f, 14.4f, 22.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, -0.89f, -7.72f, -7.75f, -7.72f, -7.75f);
        pathBuilderD.curveTo(14.1f, 5.09f, 13.87f, 5.0f, 13.62f, 5.0f);
        pathBuilderD.horizontalLineTo(12.0f);
        pathBuilderD.curveTo(11.45f, 5.0f, 11.0f, 5.45f, 11.0f, 6.0f);
        a.k(pathBuilderD, 8.0f, 18.0f, 2.0f);
        pathBuilderD.lineToRelative(5.25f, -2.83f);
        pathBuilderD.lineTo(10.0f, 16.0f);
        pathBuilderD.curveTo(10.0f, 17.1f, 9.11f, 18.0f, 8.0f, 18.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _snowmobile = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
