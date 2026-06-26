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

/* JADX INFO: compiled from: PestControl.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_pestControl", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PestControl", "Landroidx/compose/material/icons/Icons$Filled;", "getPestControl", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PestControlKt {
    private static ImageVector _pestControl;

    public static final ImageVector getPestControl(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _pestControl;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PestControl", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = a.e(21.0f, 15.0f, -2.0f, -3.07f);
        pathBuilderE.curveToRelative(-0.05f, -0.39f, -0.12f, -0.77f, -0.22f, -1.14f);
        pathBuilderE.lineToRelative(2.58f, -1.49f);
        pathBuilderE.lineToRelative(-1.0f, -1.73f);
        pathBuilderE.lineTo(16.92f, 10.0f);
        pathBuilderE.curveToRelative(-0.28f, -0.48f, -0.62f, -0.91f, -0.99f, -1.29f);
        pathBuilderE.curveTo(15.97f, 8.48f, 16.0f, 8.25f, 16.0f, 8.0f);
        pathBuilderE.curveToRelative(0.0f, -0.8f, -0.24f, -1.55f, -0.65f, -2.18f);
        pathBuilderE.lineTo(17.0f, 4.17f);
        pathBuilderE.lineToRelative(-1.41f, -1.41f);
        pathBuilderE.lineToRelative(-1.72f, 1.72f);
        pathBuilderE.curveToRelative(-1.68f, -0.89f, -3.1f, -0.33f, -3.73f, 0.0f);
        pathBuilderE.lineTo(8.41f, 2.76f);
        pathBuilderE.lineTo(7.0f, 4.17f);
        pathBuilderE.lineToRelative(1.65f, 1.65f);
        pathBuilderE.curveTo(8.24f, 6.45f, 8.0f, 7.2f, 8.0f, 8.0f);
        pathBuilderE.curveToRelative(0.0f, 0.25f, 0.03f, 0.48f, 0.07f, 0.72f);
        pathBuilderE.curveTo(7.7f, 9.1f, 7.36f, 9.53f, 7.08f, 10.0f);
        pathBuilderE.lineTo(4.71f, 8.63f);
        pathBuilderE.lineToRelative(-1.0f, 1.73f);
        pathBuilderE.lineToRelative(2.58f, 1.49f);
        pathBuilderE.curveToRelative(-0.1f, 0.37f, -0.17f, 0.75f, -0.22f, 1.14f);
        androidx.compose.animation.a.s(pathBuilderE, 3.0f, 2.0f, 3.07f);
        pathBuilderE.curveToRelative(0.05f, 0.39f, 0.12f, 0.77f, 0.22f, 1.14f);
        pathBuilderE.lineToRelative(-2.58f, 1.49f);
        pathBuilderE.lineToRelative(1.0f, 1.73f);
        pathBuilderE.lineTo(7.08f, 18.0f);
        pathBuilderE.curveToRelative(1.08f, 1.81f, 2.88f, 3.0f, 4.92f, 3.0f);
        pathBuilderE.reflectiveCurveToRelative(3.84f, -1.19f, 4.92f, -3.0f);
        pathBuilderE.lineToRelative(2.37f, 1.37f);
        pathBuilderE.lineToRelative(1.0f, -1.73f);
        pathBuilderE.lineToRelative(-2.58f, -1.49f);
        pathBuilderE.curveToRelative(0.1f, -0.37f, 0.17f, -0.75f, 0.22f, -1.14f);
        h.v(pathBuilderE, 21.0f, 13.0f, 17.0f, -2.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderE, -6.0f, 2.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pestControl = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
