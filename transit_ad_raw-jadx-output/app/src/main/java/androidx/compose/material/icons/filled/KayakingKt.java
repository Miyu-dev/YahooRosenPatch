package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Kayaking.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_kayaking", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Kayaking", "Landroidx/compose/material/icons/Icons$Filled;", "getKayaking", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KayakingKt {
    private static ImageVector _kayaking;

    public static final ImageVector getKayaking(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _kayaking;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Kayaking", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(21.0f, 23.0f);
        pathBuilderD.curveToRelative(-1.03f, 0.0f, -2.06f, -0.25f, -3.0f, -0.75f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f);
        pathBuilderD.curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f);
        pathBuilderD.curveTo(5.05f, 22.75f, 4.03f, 23.0f, 3.0f, 23.0f);
        s.u(pathBuilderD, 2.0f, 0.0f, -2.0f, 1.0f);
        pathBuilderD.curveToRelative(1.04f, 0.0f, 2.08f, -0.35f, 3.0f, -1.0f);
        pathBuilderD.curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f);
        pathBuilderD.curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f);
        pathBuilderD.curveToRelative(0.91f, 0.65f, 1.96f, 1.0f, 3.0f, 1.0f);
        s.q(pathBuilderD, 1.0f, 2.0f, 21.0f);
        pathBuilderD.moveTo(12.0f, 5.5f);
        pathBuilderD.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(13.1f, 5.5f, 12.0f, 5.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(24.0f, 17.5f);
        pathBuilderD.curveToRelative(0.0f, 0.0f, -1.52f, 0.71f, -3.93f, 1.37f);
        pathBuilderD.curveToRelative(-0.82f, -0.23f, -1.53f, -0.75f, -2.07f, -1.37f);
        pathBuilderD.curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f);
        pathBuilderD.reflectiveCurveToRelative(-2.27f, -0.66f, -3.0f, -1.5f);
        pathBuilderD.curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f);
        pathBuilderD.reflectiveCurveToRelative(-2.27f, -0.66f, -3.0f, -1.5f);
        pathBuilderD.curveToRelative(-0.54f, 0.61f, -1.25f, 1.13f, -2.07f, 1.37f);
        pathBuilderD.curveTo(1.52f, 18.21f, 0.0f, 17.5f, 0.0f, 17.5f);
        pathBuilderD.reflectiveCurveToRelative(2.93f, -1.36f, 7.13f, -2.08f);
        pathBuilderD.lineToRelative(1.35f, -4.17f);
        pathBuilderD.curveToRelative(0.31f, -0.95f, 1.32f, -1.47f, 2.27f, -1.16f);
        pathBuilderD.curveToRelative(0.09f, 0.03f, 0.19f, 0.07f, 0.27f, 0.11f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.lineToRelative(2.47f, 1.3f);
        pathBuilderD.lineToRelative(2.84f, -1.5f);
        pathBuilderD.lineToRelative(1.65f, -3.71f);
        pathBuilderD.lineToRelative(-0.51f, -1.32f);
        pathBuilderD.lineTo(18.8f, 2.0f);
        pathBuilderD.lineTo(22.0f, 3.43f);
        pathBuilderD.lineTo(20.67f, 6.4f);
        pathBuilderD.lineToRelative(-1.31f, 0.5f);
        pathBuilderD.lineToRelative(-3.72f, 8.34f);
        pathBuilderD.curveTo(20.49f, 15.87f, 24.0f, 17.5f, 24.0f, 17.5f);
        a.y(pathBuilderD, 15.02f, 12.96f, -1.52f, 0.8f);
        pathBuilderD.lineToRelative(-1.75f, -0.92f);
        pathBuilderD.lineToRelative(-0.71f, 2.17f);
        pathBuilderD.curveTo(11.36f, 15.01f, 11.68f, 15.0f, 12.0f, 15.0f);
        pathBuilderD.curveToRelative(0.71f, 0.0f, 1.4f, 0.03f, 2.07f, 0.08f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 15.02f, 12.96f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kayaking = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
