package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: Attractions.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_attractions", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Attractions", "Landroidx/compose/material/icons/Icons$Outlined;", "getAttractions", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AttractionsKt {
    private static ImageVector _attractions;

    public static final ImageVector getAttractions(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _attractions;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Attractions", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.15f, 14.42f);
        pathBuilderD.curveToRelative(0.23f, -0.77f, 0.35f, -1.58f, 0.35f, -2.42f);
        pathBuilderD.reflectiveCurveToRelative(-0.12f, -1.65f, -0.35f, -2.42f);
        pathBuilderD.curveToRelative(0.78f, -0.6f, 1.02f, -1.7f, 0.51f, -2.58f);
        pathBuilderD.reflectiveCurveToRelative(-1.58f, -1.23f, -2.49f, -0.85f);
        pathBuilderD.curveToRelative(-1.11f, -1.17f, -2.56f, -2.03f, -4.18f, -2.42f);
        pathBuilderD.curveTo(13.85f, 2.75f, 13.01f, 2.0f, 12.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.85f, 0.75f, -1.98f, 1.73f);
        pathBuilderD.curveTo(8.39f, 4.12f, 6.95f, 4.98f, 5.83f, 6.15f);
        pathBuilderD.curveTo(4.92f, 5.77f, 3.85f, 6.12f, 3.34f, 7.0f);
        pathBuilderD.reflectiveCurveTo(3.07f, 8.98f, 3.85f, 9.58f);
        pathBuilderD.curveTo(3.62f, 10.35f, 3.5f, 11.16f, 3.5f, 12.0f);
        pathBuilderD.reflectiveCurveToRelative(0.12f, 1.65f, 0.35f, 2.42f);
        pathBuilderD.curveToRelative(-0.78f, 0.6f, -1.02f, 1.7f, -0.51f, 2.58f);
        pathBuilderD.reflectiveCurveToRelative(1.58f, 1.23f, 2.49f, 0.85f);
        pathBuilderD.curveToRelative(0.4f, 0.42f, 0.83f, 0.79f, 1.3f, 1.12f);
        pathBuilderD.lineTo(5.78f, 22.0f);
        pathBuilderD.horizontalLineToRelative(1.88f);
        pathBuilderD.lineToRelative(0.98f, -2.19f);
        pathBuilderD.curveToRelative(0.44f, 0.19f, 0.9f, 0.34f, 1.38f, 0.46f);
        pathBuilderD.curveTo(10.15f, 21.25f, 10.99f, 22.0f, 12.0f, 22.0f);
        pathBuilderD.reflectiveCurveToRelative(1.85f, -0.75f, 1.98f, -1.73f);
        pathBuilderD.curveToRelative(0.46f, -0.11f, 0.91f, -0.26f, 1.34f, -0.44f);
        pathBuilderD.lineTo(16.3f, 22.0f);
        pathBuilderD.horizontalLineToRelative(1.88f);
        pathBuilderD.lineToRelative(-1.34f, -3.0f);
        pathBuilderD.curveToRelative(0.48f, -0.34f, 0.93f, -0.72f, 1.34f, -1.15f);
        pathBuilderD.curveToRelative(0.91f, 0.38f, 1.99f, 0.03f, 2.49f, -0.85f);
        pathBuilderD.curveTo(21.17f, 16.12f, 20.93f, 15.02f, 20.15f, 14.42f);
        pathBuilderD.close();
        pathBuilderD.moveTo(13.56f, 18.75f);
        pathBuilderD.curveTo(13.19f, 18.29f, 12.63f, 18.0f, 12.0f, 18.0f);
        pathBuilderD.reflectiveCurveToRelative(-1.2f, 0.29f, -1.57f, 0.75f);
        pathBuilderD.curveToRelative(-0.4f, -0.09f, -0.79f, -0.21f, -1.16f, -0.37f);
        pathBuilderD.lineToRelative(1.43f, -3.19f);
        pathBuilderD.curveToRelative(0.4f, 0.16f, 0.84f, 0.25f, 1.3f, 0.25f);
        pathBuilderD.curveToRelative(0.44f, 0.0f, 0.87f, -0.08f, 1.26f, -0.23f);
        pathBuilderD.lineToRelative(1.42f, 3.18f);
        pathBuilderD.curveTo(14.32f, 18.54f, 13.95f, 18.66f, 13.56f, 18.75f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.48f, 12.02f);
        pathBuilderD.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilderD.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderD.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilderD.reflectiveCurveTo(10.48f, 12.85f, 10.48f, 12.02f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.71f, 14.01f);
        pathBuilderD.curveToRelative(-0.61f, 0.07f, -1.18f, 0.41f, -1.52f, 0.99f);
        pathBuilderD.curveToRelative(-0.32f, 0.56f, -0.34f, 1.2f, -0.12f, 1.75f);
        pathBuilderD.curveToRelative(-0.28f, 0.29f, -0.58f, 0.55f, -0.9f, 0.79f);
        pathBuilderD.lineToRelative(-1.5f, -3.35f);
        pathBuilderD.curveToRelative(0.49f, -0.59f, 0.78f, -1.34f, 0.78f, -2.16f);
        pathBuilderD.curveToRelative(0.0f, -1.89f, -1.55f, -3.41f, -3.46f, -3.41f);
        pathBuilderD.reflectiveCurveToRelative(-3.46f, 1.53f, -3.46f, 3.41f);
        pathBuilderD.curveToRelative(0.0f, 0.8f, 0.28f, 1.54f, 0.75f, 2.13f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.lineToRelative(-1.52f, 3.39f);
        pathBuilderD.curveToRelative(-0.31f, -0.23f, -0.6f, -0.48f, -0.87f, -0.76f);
        pathBuilderD.curveTo(7.15f, 16.23f, 7.13f, 15.57f, 6.8f, 15.0f);
        pathBuilderD.curveToRelative(-0.34f, -0.59f, -0.93f, -0.94f, -1.56f, -0.99f);
        pathBuilderD.curveToRelative(-0.22f, -0.68f, -0.33f, -1.4f, -0.33f, -2.15f);
        pathBuilderD.curveToRelative(0.0f, -0.64f, 0.09f, -1.26f, 0.25f, -1.85f);
        pathBuilderD.curveToRelative(0.66f, -0.03f, 1.3f, -0.38f, 1.65f, -1.0f);
        pathBuilderD.curveToRelative(0.37f, -0.63f, 0.35f, -1.38f, 0.01f, -1.98f);
        pathBuilderD.curveTo(7.74f, 6.05f, 8.93f, 5.34f, 10.27f, 5.0f);
        pathBuilderD.curveToRelative(0.34f, 0.59f, 0.99f, 1.0f, 1.73f, 1.0f);
        pathBuilderD.reflectiveCurveToRelative(1.39f, -0.4f, 1.73f, -1.0f);
        pathBuilderD.curveToRelative(1.34f, 0.34f, 2.53f, 1.07f, 3.44f, 2.05f);
        pathBuilderD.curveTo(16.85f, 7.64f, 16.84f, 8.38f, 17.2f, 9.0f);
        pathBuilderD.curveToRelative(0.35f, 0.6f, 0.96f, 0.95f, 1.6f, 1.0f);
        pathBuilderD.curveToRelative(0.16f, 0.59f, 0.25f, 1.21f, 0.25f, 1.86f);
        pathBuilderD.curveTo(19.05f, 12.61f, 18.93f, 13.33f, 18.71f, 14.01f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attractions = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
