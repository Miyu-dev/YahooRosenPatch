package androidx.compose.material.icons.rounded;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: Sledding.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sledding", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Sledding", "Landroidx/compose/material/icons/Icons$Rounded;", "getSledding", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SleddingKt {
    private static ImageVector _sledding;

    public static final ImageVector getSledding(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _sledding;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Sledding", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.0f, 4.5f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderD.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(14.0f, 3.4f, 14.0f, 4.5f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.92f, 19.24f);
        pathBuilderD.curveToRelative(-0.13f, 0.39f, -0.55f, 0.61f, -0.95f, 0.48f);
        pathBuilderD.lineToRelative(-2.61f, -0.85f);
        pathBuilderD.lineTo(14.9f, 20.3f);
        pathBuilderD.lineToRelative(3.32f, 1.08f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(1.31f, 0.43f, 2.72f, -0.29f, 3.15f, -1.61f);
        pathBuilderD.curveToRelative(0.36f, -1.12f, -0.11f, -2.32f, -1.07f, -2.91f);
        pathBuilderD.curveToRelative(-0.32f, -0.2f, -0.45f, -0.6f, -0.3f, -0.95f);
        pathBuilderD.curveToRelative(0.2f, -0.44f, 0.71f, -0.57f, 1.12f, -0.31f);
        pathBuilderD.curveToRelative(1.52f, 0.95f, 2.25f, 2.85f, 1.68f, 4.62f);
        pathBuilderD.curveToRelative(-0.68f, 2.1f, -2.94f, 3.25f, -5.04f, 2.57f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.lineTo(1.74f, 17.6f);
        pathBuilderD.curveToRelative(-0.39f, -0.13f, -0.63f, -0.54f, -0.52f, -0.93f);
        pathBuilderD.curveToRelative(0.12f, -0.41f, 0.55f, -0.63f, 0.95f, -0.5f);
        pathBuilderD.lineToRelative(3.22f, 1.05f);
        pathBuilderD.lineToRelative(0.46f, -1.43f);
        pathBuilderD.lineToRelative(-3.19f, -1.04f);
        pathBuilderD.curveToRelative(-0.39f, -0.13f, -0.63f, -0.54f, -0.52f, -0.93f);
        pathBuilderD.curveToRelative(0.12f, -0.41f, 0.55f, -0.63f, 0.95f, -0.5f);
        pathBuilderD.lineTo(4.0f, 13.6f);
        pathBuilderD.verticalLineToRelative(-2.78f);
        pathBuilderD.curveToRelative(0.0f, -0.8f, 0.48f, -1.52f, 1.21f, -1.84f);
        pathBuilderD.curveToRelative(0.75f, -0.32f, 4.11f, -1.76f, 4.26f, -1.83f);
        pathBuilderD.curveToRelative(0.41f, -0.18f, 0.89f, -0.21f, 1.35f, -0.04f);
        pathBuilderD.curveToRelative(0.91f, 0.34f, 1.37f, 1.36f, 1.07f, 2.28f);
        pathBuilderD.lineToRelative(-1.04f, 3.2f);
        pathBuilderD.lineTo(13.0f, 12.25f);
        pathBuilderD.curveToRelative(0.89f, -0.15f, 1.76f, 0.32f, 2.14f, 1.14f);
        pathBuilderD.lineToRelative(2.08f, 4.51f);
        pathBuilderD.lineToRelative(1.22f, 0.4f);
        pathBuilderD.curveTo(18.84f, 18.42f, 19.05f, 18.84f, 18.92f, 19.24f);
        a.y(pathBuilderD, 6.0f, 14.25f, 1.01f, 0.33f);
        pathBuilderD.curveToRelative(-0.22f, -0.42f, -0.28f, -0.92f, -0.12f, -1.4f);
        pathBuilderD.lineTo(7.92f, 10.0f);
        h.y(pathBuilderD, 6.0f, 10.82f, 14.25f);
        pathBuilderD.moveTo(13.94f, 18.41f);
        pathBuilderD.lineToRelative(-6.66f, -2.16f);
        pathBuilderD.lineToRelative(-0.46f, 1.43f);
        s.r(pathBuilderD, 6.66f, 2.16f, 13.94f, 18.41f);
        pathBuilderD.moveTo(14.63f, 17.05f);
        pathBuilderD.lineToRelative(-1.18f, -2.56f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD, -3.97f, 0.89f, 14.63f, 17.05f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sledding = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
