package androidx.compose.material.icons.outlined;

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

/* JADX INFO: compiled from: ModeFanOff.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_modeFanOff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ModeFanOff", "Landroidx/compose/material/icons/Icons$Outlined;", "getModeFanOff", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ModeFanOffKt {
    private static ImageVector _modeFanOff;

    public static final ImageVector getModeFanOff(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _modeFanOff;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ModeFanOff", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(18.0f, 8.0f);
        pathBuilderD.curveToRelative(-1.06f, 0.0f, -1.64f, 0.29f, -3.91f, 1.19f);
        pathBuilderD.curveToRelative(-0.19f, -0.14f, -0.4f, -0.27f, -0.62f, -0.37f);
        pathBuilderD.curveToRelative(0.25f, -1.03f, 0.61f, -1.53f, 1.33f, -2.04f);
        pathBuilderD.curveTo(15.61f, 6.21f, 16.0f, 5.44f, 16.0f, 4.5f);
        pathBuilderD.curveTo(16.0f, 3.28f, 15.05f, 2.0f, 13.4f, 2.0f);
        pathBuilderD.curveToRelative(-3.08f, 0.0f, -4.92f, 1.47f, -5.32f, 3.26f);
        pathBuilderD.lineToRelative(2.33f, 2.33f);
        pathBuilderD.curveTo(10.07f, 6.69f, 10.0f, 6.38f, 10.0f, 6.0f);
        pathBuilderD.curveToRelative(0.0f, -1.18f, 1.4f, -2.0f, 3.4f, -2.0f);
        pathBuilderD.curveTo(13.97f, 4.0f, 14.0f, 4.42f, 14.0f, 4.5f);
        pathBuilderD.curveToRelative(0.0f, 0.27f, -0.05f, 0.43f, -0.35f, 0.65f);
        pathBuilderD.curveToRelative(-1.27f, 0.9f, -1.83f, 1.91f, -2.16f, 3.39f);
        pathBuilderD.lineToRelative(-0.02f, 0.1f);
        pathBuilderD.lineToRelative(7.25f, 7.25f);
        pathBuilderD.curveTo(18.96f, 15.95f, 19.22f, 16.0f, 19.5f, 16.0f);
        pathBuilderD.curveToRelative(1.22f, 0.0f, 2.5f, -0.95f, 2.5f, -2.6f);
        pathBuilderD.curveTo(22.0f, 9.91f, 20.11f, 8.0f, 18.0f, 8.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(19.5f, 14.0f);
        pathBuilderD.curveToRelative(-0.27f, 0.0f, -0.43f, -0.05f, -0.65f, -0.35f);
        pathBuilderD.curveToRelative(-0.9f, -1.27f, -1.91f, -1.83f, -3.39f, -2.16f);
        pathBuilderD.curveToRelative(-0.03f, -0.22f, -0.08f, -0.42f, -0.15f, -0.62f);
        pathBuilderD.curveTo(17.11f, 10.12f, 17.49f, 10.0f, 18.0f, 10.0f);
        pathBuilderD.curveToRelative(1.18f, 0.0f, 2.0f, 1.4f, 2.0f, 3.4f);
        pathBuilderD.curveTo(20.0f, 13.97f, 19.58f, 14.0f, 19.5f, 14.0f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(1.39f, 4.22f, 3.89f, 3.89f);
        pathBuilderA.curveTo(5.04f, 8.05f, 4.78f, 8.0f, 4.5f, 8.0f);
        pathBuilderA.curveTo(3.28f, 8.0f, 2.0f, 8.95f, 2.0f, 10.6f);
        pathBuilderA.curveTo(2.0f, 14.09f, 3.89f, 16.0f, 6.0f, 16.0f);
        pathBuilderA.curveToRelative(1.06f, 0.0f, 1.64f, -0.29f, 3.91f, -1.19f);
        pathBuilderA.curveToRelative(0.19f, 0.14f, 0.4f, 0.27f, 0.62f, 0.37f);
        pathBuilderA.curveToRelative(-0.25f, 1.03f, -0.61f, 1.53f, -1.33f, 2.04f);
        pathBuilderA.curveTo(8.39f, 17.79f, 8.0f, 18.56f, 8.0f, 19.5f);
        pathBuilderA.curveToRelative(0.0f, 1.22f, 0.95f, 2.5f, 2.6f, 2.5f);
        pathBuilderA.curveToRelative(3.08f, 0.0f, 4.92f, -1.47f, 5.32f, -3.26f);
        pathBuilderA.lineToRelative(3.86f, 3.86f);
        pathBuilderA.lineToRelative(1.41f, -1.41f);
        android.support.v4.media.a.C(pathBuilderA, 2.81f, 2.81f, 1.39f, 4.22f);
        pathBuilderA.moveTo(12.52f, 15.46f);
        pathBuilderA.curveToRelative(0.03f, 0.0f, 0.06f, -0.02f, 0.09f, -0.02f);
        pathBuilderA.lineToRelative(0.97f, 0.97f);
        pathBuilderA.curveTo(13.93f, 17.31f, 14.0f, 17.62f, 14.0f, 18.0f);
        pathBuilderA.curveToRelative(0.0f, 1.18f, -1.4f, 2.0f, -3.4f, 2.0f);
        pathBuilderA.curveToRelative(-0.57f, 0.0f, -0.6f, -0.42f, -0.6f, -0.5f);
        pathBuilderA.curveToRelative(0.0f, -0.27f, 0.05f, -0.43f, 0.35f, -0.65f);
        pathBuilderA.curveTo(11.63f, 17.96f, 12.18f, 16.94f, 12.52f, 15.46f);
        pathBuilderA.close();
        pathBuilderA.moveTo(8.54f, 12.52f);
        pathBuilderA.curveToRelative(0.03f, 0.22f, 0.08f, 0.42f, 0.15f, 0.62f);
        pathBuilderA.curveTo(6.89f, 13.88f, 6.51f, 14.0f, 6.0f, 14.0f);
        pathBuilderA.curveToRelative(-1.18f, 0.0f, -2.0f, -1.4f, -2.0f, -3.4f);
        pathBuilderA.curveTo(4.0f, 10.03f, 4.42f, 10.0f, 4.5f, 10.0f);
        pathBuilderA.curveToRelative(0.27f, 0.0f, 0.43f, 0.05f, 0.65f, 0.35f);
        pathBuilderA.curveTo(6.04f, 11.63f, 7.06f, 12.18f, 8.54f, 12.52f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modeFanOff = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
