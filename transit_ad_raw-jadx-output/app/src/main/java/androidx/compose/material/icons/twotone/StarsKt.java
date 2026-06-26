package androidx.compose.material.icons.twotone;

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

/* JADX INFO: compiled from: Stars.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_stars", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Stars", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStars", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class StarsKt {
    private static ImageVector _stars;

    public static final ImageVector getStars(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _stars;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Stars", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(19.47f, 9.16f);
        pathBuilderD.curveToRelative(-1.1f, -2.87f, -3.8f, -4.95f, -7.01f, -5.14f);
        android.support.v4.media.a.n(pathBuilderD, 2.0f, 4.71f, 5.01f, 0.43f);
        pathBuilderD.moveTo(11.54f, 4.02f);
        pathBuilderD.curveToRelative(-3.22f, 0.18f, -5.92f, 2.27f, -7.02f, 5.15f);
        android.support.v4.media.a.n(pathBuilderD, 5.02f, -0.43f, 2.0f, -4.72f);
        pathBuilderD.moveTo(4.23f, 10.14f);
        pathBuilderD.curveTo(4.08f, 10.74f, 4.0f, 11.36f, 4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 2.48f, 1.14f, 4.7f, 2.91f, 6.17f);
        android.support.v4.media.a.n(pathBuilderD, 1.11f, -4.75f, -3.79f, -3.28f);
        pathBuilderD.moveTo(19.77f, 10.13f);
        pathBuilderD.lineToRelative(-3.79f, 3.28f);
        pathBuilderD.lineToRelative(1.1f, 4.76f);
        pathBuilderD.curveTo(18.86f, 16.7f, 20.0f, 14.48f, 20.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -0.64f, -0.09f, -1.27f, -0.23f, -1.87f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.84f, 18.82f);
        pathBuilderD.curveToRelative(1.21f, 0.74f, 2.63f, 1.18f, 4.15f, 1.18f);
        pathBuilderD.curveToRelative(1.53f, 0.0f, 2.95f, -0.44f, 4.17f, -1.18f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderD, 12.0f, 16.31f, -4.16f, 2.51f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(11.99f, 2.0f);
        pathBuilderD2.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD2.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilderD2.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilderD2.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        a.y(pathBuilderD2, 19.47f, 9.16f, -5.01f, -0.43f);
        pathBuilderD2.lineToRelative(-2.0f, -4.71f);
        pathBuilderD2.curveToRelative(3.21f, 0.19f, 5.91f, 2.27f, 7.01f, 5.14f);
        a.y(pathBuilderD2, 12.0f, 8.06f, 1.09f, 2.56f);
        pathBuilderD2.lineToRelative(2.78f, 0.24f);
        pathBuilderD2.lineToRelative(-2.11f, 1.83f);
        pathBuilderD2.lineToRelative(0.63f, 2.73f);
        pathBuilderD2.lineTo(12.0f, 13.98f);
        pathBuilderD2.lineToRelative(-2.39f, 1.44f);
        pathBuilderD2.lineToRelative(0.63f, -2.72f);
        pathBuilderD2.lineToRelative(-2.11f, -1.83f);
        s.r(pathBuilderD2, 2.78f, -0.24f, 12.0f, 8.06f);
        pathBuilderD2.moveTo(11.54f, 4.02f);
        pathBuilderD2.lineToRelative(-2.0f, 4.72f);
        pathBuilderD2.lineToRelative(-5.02f, 0.43f);
        pathBuilderD2.curveToRelative(1.1f, -2.88f, 3.8f, -4.97f, 7.02f, -5.15f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(4.0f, 12.0f);
        pathBuilderD2.curveToRelative(0.0f, -0.64f, 0.08f, -1.26f, 0.23f, -1.86f);
        pathBuilderD2.lineToRelative(3.79f, 3.28f);
        pathBuilderD2.lineToRelative(-1.11f, 4.75f);
        pathBuilderD2.curveTo(5.14f, 16.7f, 4.0f, 14.48f, 4.0f, 12.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(11.99f, 20.0f);
        pathBuilderD2.curveToRelative(-1.52f, 0.0f, -2.94f, -0.44f, -4.15f, -1.18f);
        pathBuilderD2.lineTo(12.0f, 16.31f);
        pathBuilderD2.lineToRelative(4.16f, 2.51f);
        pathBuilderD2.curveToRelative(-1.22f, 0.74f, -2.64f, 1.18f, -4.17f, 1.18f);
        a.y(pathBuilderD2, 17.09f, 18.17f, -1.1f, -4.76f);
        pathBuilderD2.lineToRelative(3.79f, -3.28f);
        pathBuilderD2.curveToRelative(0.13f, 0.6f, 0.22f, 1.23f, 0.22f, 1.87f);
        pathBuilderD2.curveToRelative(0.0f, 2.48f, -1.14f, 4.7f, -2.91f, 6.17f);
        pathBuilderD2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stars = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
