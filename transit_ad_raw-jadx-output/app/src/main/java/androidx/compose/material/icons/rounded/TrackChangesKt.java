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

/* JADX INFO: compiled from: TrackChanges.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_trackChanges", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TrackChanges", "Landroidx/compose/material/icons/Icons$Rounded;", "getTrackChanges", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class TrackChangesKt {
    private static ImageVector _trackChanges;

    public static final ImageVector getTrackChanges(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _trackChanges;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TrackChanges", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.32f, 5.68f);
        pathBuilderD.curveToRelative(-0.36f, 0.36f, -0.39f, 0.92f, -0.07f, 1.32f);
        pathBuilderD.curveToRelative(1.45f, 1.82f, 2.21f, 4.31f, 1.53f, 6.92f);
        pathBuilderD.curveToRelative(-0.79f, 3.05f, -3.18f, 5.33f, -6.21f, 5.94f);
        pathBuilderD.curveTo(8.47f, 20.87f, 4.0f, 16.93f, 4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -4.08f, 3.05f, -7.44f, 7.0f, -7.93f);
        pathBuilderD.verticalLineToRelative(2.02f);
        pathBuilderD.curveToRelative(-3.13f, 0.53f, -5.43f, 3.46f, -4.93f, 6.83f);
        pathBuilderD.curveToRelative(0.39f, 2.61f, 2.56f, 4.71f, 5.18f, 5.03f);
        pathBuilderD.curveTo(14.89f, 18.4f, 18.0f, 15.56f, 18.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -1.25f, -0.38f, -2.4f, -1.03f, -3.36f);
        pathBuilderD.curveToRelative(-0.34f, -0.5f, -1.07f, -0.53f, -1.5f, -0.11f);
        pathBuilderD.lineToRelative(-0.01f, 0.01f);
        pathBuilderD.curveToRelative(-0.34f, 0.34f, -0.37f, 0.87f, -0.11f, 1.27f);
        pathBuilderD.curveToRelative(0.6f, 0.92f, 0.84f, 2.1f, 0.49f, 3.32f);
        pathBuilderD.curveToRelative(-0.39f, 1.37f, -1.54f, 2.46f, -2.94f, 2.77f);
        pathBuilderD.curveToRelative(-2.6f, 0.57f, -4.9f, -1.39f, -4.9f, -3.9f);
        pathBuilderD.curveToRelative(0.0f, -1.86f, 1.28f, -3.41f, 3.0f, -3.86f);
        pathBuilderD.verticalLineToRelative(2.14f);
        pathBuilderD.curveToRelative(-0.6f, 0.35f, -1.0f, 0.98f, -1.0f, 1.72f);
        pathBuilderD.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderD.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderD.curveToRelative(0.0f, -0.74f, -0.4f, -1.38f, -1.0f, -1.72f);
        pathBuilderD.verticalLineTo(2.71f);
        pathBuilderD.curveToRelative(0.0f, -0.39f, -0.32f, -0.71f, -0.71f, -0.71f);
        pathBuilderD.curveToRelative(-5.36f, -0.2f, -9.98f, 4.06f, -10.27f, 9.4f);
        pathBuilderD.curveToRelative(-0.36f, 6.55f, 5.41f, 11.82f, 12.01f, 10.4f);
        pathBuilderD.curveToRelative(3.88f, -0.83f, 6.88f, -3.8f, 7.75f, -7.67f);
        pathBuilderD.curveToRelative(0.71f, -3.16f, -0.2f, -6.16f, -1.97f, -8.37f);
        pathBuilderD.curveToRelative(-0.37f, -0.47f, -1.07f, -0.5f, -1.49f, -0.08f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _trackChanges = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
