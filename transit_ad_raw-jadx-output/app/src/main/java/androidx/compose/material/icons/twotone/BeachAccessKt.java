package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: BeachAccess.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_beachAccess", "Landroidx/compose/ui/graphics/vector/ImageVector;", "BeachAccess", "Landroidx/compose/material/icons/Icons$TwoTone;", "getBeachAccess", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class BeachAccessKt {
    private static ImageVector _beachAccess;

    public static final ImageVector getBeachAccess(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _beachAccess;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BeachAccess", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(7.6f, 7.6f);
        pathBuilderD.curveToRelative(-0.47f, 2.34f, 0.03f, 4.78f, 1.39f, 6.83f);
        pathBuilderD.lineToRelative(5.45f, -5.45f);
        pathBuilderD.curveToRelative(-1.53f, -1.02f, -3.28f, -1.56f, -5.08f, -1.56f);
        pathBuilderD.curveToRelative(-0.6f, 0.0f, -1.19f, 0.06f, -1.76f, 0.18f);
        pathBuilderD.close();
        pathBuilderD.moveTo(13.12f, 5.0f);
        pathBuilderD.curveToRelative(-0.93f, 0.0f, -1.82f, 0.16f, -2.67f, 0.46f);
        pathBuilderD.curveToRelative(1.91f, 0.19f, 3.79f, 0.89f, 5.44f, 2.07f);
        pathBuilderD.lineToRelative(1.39f, -1.39f);
        pathBuilderD.curveTo(16.03f, 5.4f, 14.61f, 5.0f, 13.12f, 5.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(5.0f, 13.12f);
        pathBuilderD.curveToRelative(0.0f, 1.49f, 0.4f, 2.91f, 1.14f, 4.15f);
        pathBuilderD.lineToRelative(1.39f, -1.39f);
        pathBuilderD.curveToRelative(-1.18f, -1.65f, -1.88f, -3.52f, -2.07f, -5.44f);
        pathBuilderD.curveToRelative(-0.3f, 0.86f, -0.46f, 1.76f, -0.46f, 2.68f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(13.126f, 14.56f, 1.428f, -1.428f);
        android.support.v4.media.a.n(pathBuilderA, 6.442f, 6.442f, -1.43f, 1.428f);
        pathBuilderA.moveTo(13.12f, 3.0f);
        pathBuilderA.curveToRelative(-2.58f, 0.0f, -5.16f, 0.98f, -7.14f, 2.95f);
        pathBuilderA.lineToRelative(-0.01f, 0.01f);
        pathBuilderA.curveToRelative(-3.95f, 3.95f, -3.95f, 10.36f, 0.0f, 14.31f);
        pathBuilderA.lineToRelative(14.3f, -14.31f);
        pathBuilderA.curveTo(18.3f, 3.99f, 15.71f, 3.0f, 13.12f, 3.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(6.14f, 17.27f);
        pathBuilderA.curveTo(5.4f, 16.03f, 5.0f, 14.61f, 5.0f, 13.12f);
        pathBuilderA.curveToRelative(0.0f, -0.93f, 0.16f, -1.82f, 0.46f, -2.67f);
        pathBuilderA.curveToRelative(0.19f, 1.91f, 0.89f, 3.79f, 2.07f, 5.44f);
        android.support.v4.media.a.t(pathBuilderA, -1.39f, 1.38f, 8.98f, 14.43f);
        pathBuilderA.curveTo(7.63f, 12.38f, 7.12f, 9.93f, 7.6f, 7.6f);
        pathBuilderA.curveToRelative(0.58f, -0.12f, 1.16f, -0.18f, 1.75f, -0.18f);
        pathBuilderA.curveToRelative(1.8f, 0.0f, 3.55f, 0.55f, 5.08f, 1.56f);
        android.support.v4.media.a.t(pathBuilderA, -5.45f, 5.45f, 10.45f, 5.46f);
        pathBuilderA.curveToRelative(0.85f, -0.3f, 1.74f, -0.46f, 2.67f, -0.46f);
        pathBuilderA.curveToRelative(1.49f, 0.0f, 2.91f, 0.4f, 4.15f, 1.14f);
        pathBuilderA.lineToRelative(-1.39f, 1.39f);
        pathBuilderA.curveToRelative(-1.65f, -1.18f, -3.52f, -1.88f, -5.43f, -2.07f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _beachAccess = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
