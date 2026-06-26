package androidx.compose.material.icons.filled;

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

/* JADX INFO: compiled from: LinearScale.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_linearScale", "Landroidx/compose/ui/graphics/vector/ImageVector;", "LinearScale", "Landroidx/compose/material/icons/Icons$Filled;", "getLinearScale", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class LinearScaleKt {
    private static ImageVector _linearScale;

    public static final ImageVector getLinearScale(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _linearScale;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LinearScale", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.5f, 9.5f);
        pathBuilderD.curveToRelative(-1.03f, 0.0f, -1.9f, 0.62f, -2.29f, 1.5f);
        pathBuilderD.horizontalLineToRelative(-2.92f);
        pathBuilderD.curveTo(13.9f, 10.12f, 13.03f, 9.5f, 12.0f, 9.5f);
        pathBuilderD.reflectiveCurveToRelative(-1.9f, 0.62f, -2.29f, 1.5f);
        pathBuilderD.horizontalLineTo(6.79f);
        pathBuilderD.curveTo(6.4f, 10.12f, 5.53f, 9.5f, 4.5f, 9.5f);
        pathBuilderD.curveTo(3.12f, 9.5f, 2.0f, 10.62f, 2.0f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilderD.curveToRelative(1.03f, 0.0f, 1.9f, -0.62f, 2.29f, -1.5f);
        pathBuilderD.horizontalLineToRelative(2.92f);
        pathBuilderD.curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.9f, -0.62f, 2.29f, -1.5f);
        pathBuilderD.horizontalLineToRelative(2.92f);
        pathBuilderD.curveToRelative(0.39f, 0.88f, 1.26f, 1.5f, 2.29f, 1.5f);
        pathBuilderD.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.t(pathBuilderD, 20.88f, 9.5f, 19.5f, 9.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linearScale = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
