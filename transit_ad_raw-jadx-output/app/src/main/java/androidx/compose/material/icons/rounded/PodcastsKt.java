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

/* JADX INFO: compiled from: Podcasts.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_podcasts", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Podcasts", "Landroidx/compose/material/icons/Icons$Rounded;", "getPodcasts", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PodcastsKt {
    private static ImageVector _podcasts;

    public static final ImageVector getPodcasts(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _podcasts;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Podcasts", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.74f, -0.4f, 1.38f, -1.0f, 1.72f);
        pathBuilderD.verticalLineTo(21.0f);
        pathBuilderD.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilderD.horizontalLineToRelative(0.0f);
        pathBuilderD.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilderD.verticalLineToRelative(-7.28f);
        pathBuilderD.curveToRelative(-0.6f, -0.35f, -1.0f, -0.98f, -1.0f, -1.72f);
        pathBuilderD.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderD.reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.75f, 6.13f);
        pathBuilderD.curveToRelative(-2.27f, 0.46f, -4.12f, 2.28f, -4.61f, 4.55f);
        pathBuilderD.curveToRelative(-0.4f, 1.86f, 0.07f, 3.62f, 1.08f, 4.94f);
        pathBuilderD.curveToRelative(0.35f, 0.45f, 1.03f, 0.47f, 1.43f, 0.07f);
        pathBuilderD.lineToRelative(0.07f, -0.07f);
        pathBuilderD.curveToRelative(0.34f, -0.34f, 0.34f, -0.87f, 0.06f, -1.25f);
        pathBuilderD.curveToRelative(-0.68f, -0.9f, -0.98f, -2.1f, -0.66f, -3.37f);
        pathBuilderD.curveToRelative(0.35f, -1.42f, 1.52f, -2.57f, 2.95f, -2.88f);
        pathBuilderD.curveTo(13.69f, 7.52f, 16.0f, 9.49f, 16.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.87f, -0.28f, 1.67f, -0.76f, 2.32f);
        pathBuilderD.curveToRelative(-0.3f, 0.41f, -0.29f, 0.97f, 0.07f, 1.33f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.44f, 0.44f, 1.17f, 0.37f, 1.54f, -0.14f);
        pathBuilderD.curveTo(17.57f, 14.53f, 18.0f, 13.31f, 18.0f, 12.0f);
        pathBuilderD.curveTo(18.0f, 8.28f, 14.61f, 5.35f, 10.75f, 6.13f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.83f, 2.07f);
        pathBuilderD.curveTo(6.3f, 2.58f, 2.61f, 6.25f, 2.07f, 10.78f);
        pathBuilderD.curveToRelative(-0.35f, 2.95f, 0.59f, 5.67f, 2.32f, 7.7f);
        pathBuilderD.curveToRelative(0.37f, 0.43f, 1.03f, 0.46f, 1.43f, 0.06f);
        pathBuilderD.lineToRelative(0.05f, -0.05f);
        pathBuilderD.curveToRelative(0.35f, -0.35f, 0.38f, -0.92f, 0.05f, -1.3f);
        pathBuilderD.curveToRelative(-1.56f, -1.83f, -2.33f, -4.37f, -1.7f, -7.06f);
        pathBuilderD.curveToRelative(0.7f, -3.01f, 3.18f, -5.39f, 6.22f, -5.97f);
        pathBuilderD.curveTo(15.53f, 3.18f, 20.0f, 7.08f, 20.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 1.96f, -0.72f, 3.76f, -1.9f, 5.16f);
        pathBuilderD.curveToRelative(-0.34f, 0.4f, -0.31f, 0.98f, 0.05f, 1.35f);
        pathBuilderD.lineToRelative(0.0f, 0.0f);
        pathBuilderD.curveToRelative(0.42f, 0.42f, 1.11f, 0.39f, 1.49f, -0.07f);
        pathBuilderD.curveTo(21.11f, 16.7f, 22.0f, 14.46f, 22.0f, 12.0f);
        pathBuilderD.curveTo(22.0f, 6.09f, 16.87f, 1.38f, 10.83f, 2.07f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _podcasts = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
