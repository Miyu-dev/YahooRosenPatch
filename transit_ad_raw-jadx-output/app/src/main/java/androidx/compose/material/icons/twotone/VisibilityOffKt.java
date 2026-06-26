package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: VisibilityOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_visibilityOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "VisibilityOff", "Landroidx/compose/material/icons/Icons$TwoTone;", "getVisibilityOff", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class VisibilityOffKt {
    private static ImageVector _visibilityOff;

    public static final ImageVector getVisibilityOff(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _visibilityOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VisibilityOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 14.0f);
        pathBuilderD.curveToRelative(0.04f, 0.0f, 0.08f, -0.01f, 0.12f, -0.01f);
        pathBuilderD.lineToRelative(-2.61f, -2.61f);
        pathBuilderD.curveToRelative(0.0f, 0.04f, -0.01f, 0.08f, -0.01f, 0.12f);
        pathBuilderD.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        a.y(pathBuilderD, 13.01f, 9.21f, 1.28f, 1.28f);
        pathBuilderD.curveToRelative(-0.26f, -0.57f, -0.71f, -1.03f, -1.28f, -1.28f);
        pathBuilderD.close();
        pathBuilderD.moveTo(20.82f, 11.5f);
        pathBuilderD.curveTo(19.17f, 8.13f, 15.79f, 6.0f, 12.0f, 6.0f);
        pathBuilderD.curveToRelative(-0.68f, 0.0f, -1.34f, 0.09f, -1.99f, 0.22f);
        pathBuilderD.lineToRelative(0.92f, 0.92f);
        pathBuilderD.curveToRelative(0.35f, -0.09f, 0.7f, -0.14f, 1.07f, -0.14f);
        pathBuilderD.curveToRelative(2.48f, 0.0f, 4.5f, 2.02f, 4.5f, 4.5f);
        pathBuilderD.curveToRelative(0.0f, 0.37f, -0.06f, 0.72f, -0.14f, 1.07f);
        pathBuilderD.lineToRelative(2.05f, 2.05f);
        pathBuilderD.curveToRelative(0.98f, -0.86f, 1.81f, -1.91f, 2.41f, -3.12f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 17.0f);
        pathBuilderD.curveToRelative(0.95f, 0.0f, 1.87f, -0.13f, 2.75f, -0.39f);
        pathBuilderD.lineToRelative(-0.98f, -0.98f);
        pathBuilderD.curveToRelative(-0.54f, 0.24f, -1.14f, 0.37f, -1.77f, 0.37f);
        pathBuilderD.curveToRelative(-2.48f, 0.0f, -4.5f, -2.02f, -4.5f, -4.5f);
        pathBuilderD.curveToRelative(0.0f, -0.63f, 0.13f, -1.23f, 0.36f, -1.77f);
        pathBuilderD.lineTo(6.11f, 7.97f);
        pathBuilderD.curveToRelative(-1.22f, 0.91f, -2.23f, 2.1f, -2.93f, 3.52f);
        pathBuilderD.curveTo(4.83f, 14.86f, 8.21f, 17.0f, 12.0f, 17.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(12.0f, 6.0f);
        pathBuilderD2.curveToRelative(3.79f, 0.0f, 7.17f, 2.13f, 8.82f, 5.5f);
        pathBuilderD2.curveToRelative(-0.59f, 1.22f, -1.42f, 2.27f, -2.41f, 3.12f);
        pathBuilderD2.lineToRelative(1.41f, 1.41f);
        pathBuilderD2.curveToRelative(1.39f, -1.23f, 2.49f, -2.77f, 3.18f, -4.53f);
        pathBuilderD2.curveTo(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        pathBuilderD2.curveToRelative(-1.27f, 0.0f, -2.49f, 0.2f, -3.64f, 0.57f);
        pathBuilderD2.lineToRelative(1.65f, 1.65f);
        pathBuilderD2.curveTo(10.66f, 6.09f, 11.32f, 6.0f, 12.0f, 6.0f);
        a.y(pathBuilderD2, 14.28f, 10.49f, 2.07f, 2.07f);
        pathBuilderD2.curveToRelative(0.08f, -0.34f, 0.14f, -0.7f, 0.14f, -1.07f);
        pathBuilderD2.curveTo(16.5f, 9.01f, 14.48f, 7.0f, 12.0f, 7.0f);
        pathBuilderD2.curveToRelative(-0.37f, 0.0f, -0.72f, 0.06f, -1.07f, 0.14f);
        pathBuilderD2.lineTo(13.0f, 9.21f);
        pathBuilderD2.curveToRelative(0.58f, 0.25f, 1.03f, 0.71f, 1.28f, 1.28f);
        a.y(pathBuilderD2, 2.01f, 3.87f, 2.68f, 2.68f);
        pathBuilderD2.curveTo(3.06f, 7.83f, 1.77f, 9.53f, 1.0f, 11.5f);
        pathBuilderD2.curveTo(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        pathBuilderD2.curveToRelative(1.52f, 0.0f, 2.98f, -0.29f, 4.32f, -0.82f);
        pathBuilderD2.lineToRelative(3.42f, 3.42f);
        pathBuilderD2.lineToRelative(1.41f, -1.41f);
        android.support.v4.media.a.C(pathBuilderD2, 3.42f, 2.45f, 2.01f, 3.87f);
        pathBuilderD2.moveTo(9.51f, 11.37f);
        pathBuilderD2.lineToRelative(2.61f, 2.61f);
        pathBuilderD2.curveToRelative(-0.04f, 0.01f, -0.08f, 0.02f, -0.12f, 0.02f);
        pathBuilderD2.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilderD2.curveToRelative(0.0f, -0.05f, 0.01f, -0.08f, 0.01f, -0.13f);
        a.y(pathBuilderD2, 6.11f, 7.97f, 1.75f, 1.75f);
        pathBuilderD2.curveToRelative(-0.23f, 0.55f, -0.36f, 1.15f, -0.36f, 1.78f);
        pathBuilderD2.curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f);
        pathBuilderD2.curveToRelative(0.63f, 0.0f, 1.23f, -0.13f, 1.77f, -0.36f);
        pathBuilderD2.lineToRelative(0.98f, 0.98f);
        pathBuilderD2.curveToRelative(-0.88f, 0.24f, -1.8f, 0.38f, -2.75f, 0.38f);
        pathBuilderD2.curveToRelative(-3.79f, 0.0f, -7.17f, -2.13f, -8.82f, -5.5f);
        pathBuilderD2.curveToRelative(0.7f, -1.43f, 1.72f, -2.61f, 2.93f, -3.53f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _visibilityOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
