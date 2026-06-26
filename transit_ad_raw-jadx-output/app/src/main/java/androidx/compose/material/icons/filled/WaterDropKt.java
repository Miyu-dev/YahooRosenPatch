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

/* JADX INFO: compiled from: WaterDrop.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_waterDrop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WaterDrop", "Landroidx/compose/material/icons/Icons$Filled;", "getWaterDrop", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class WaterDropKt {
    private static ImageVector _waterDrop;

    public static final ImageVector getWaterDrop(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _waterDrop;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.WaterDrop", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 2.0f);
        pathBuilderD.curveToRelative(-5.33f, 4.55f, -8.0f, 8.48f, -8.0f, 11.8f);
        pathBuilderD.curveToRelative(0.0f, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
        pathBuilderD.reflectiveCurveToRelative(8.0f, -3.22f, 8.0f, -8.2f);
        pathBuilderD.curveTo(20.0f, 10.48f, 17.33f, 6.55f, 12.0f, 2.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.83f, 14.0f);
        pathBuilderD.curveToRelative(0.37f, 0.0f, 0.67f, 0.26f, 0.74f, 0.62f);
        pathBuilderD.curveToRelative(0.41f, 2.22f, 2.28f, 2.98f, 3.64f, 2.87f);
        pathBuilderD.curveToRelative(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
        pathBuilderD.curveToRelative(0.0f, 0.4f, -0.32f, 0.73f, -0.72f, 0.75f);
        pathBuilderD.curveToRelative(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
        pathBuilderD.curveTo(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waterDrop = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
