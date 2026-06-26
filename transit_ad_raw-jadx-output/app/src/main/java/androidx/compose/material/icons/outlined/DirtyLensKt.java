package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.compose.animation.a;
import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: DirtyLens.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_dirtyLens", "Landroidx/compose/ui/graphics/vector/ImageVector;", "DirtyLens", "Landroidx/compose/material/icons/Icons$Outlined;", "getDirtyLens", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class DirtyLensKt {
    private static ImageVector _dirtyLens;

    public static final ImageVector getDirtyLens(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _dirtyLens;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DirtyLens", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderC = s.c(20.0f, 5.0f, -3.17f, 15.0f, 3.0f);
        e.g(pathBuilderC, 9.0f, 7.17f, 5.0f, 4.0f);
        pathBuilderC.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        pathBuilderC.verticalLineToRelative(12.0f);
        pathBuilderC.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderC.horizontalLineToRelative(16.0f);
        pathBuilderC.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderC.verticalLineTo(7.0f);
        pathBuilderC.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        a.j(pathBuilderC, 20.0f, 19.0f, -7.02f);
        pathBuilderC.curveToRelative(-0.22f, -0.84f, -0.52f, -1.76f, -0.13f, -2.33f);
        pathBuilderC.curveToRelative(0.81f, -1.12f, 2.67f, 1.77f, 3.81f, -0.09f);
        pathBuilderC.curveToRelative(0.77f, -1.57f, -1.58f, -1.29f, -1.64f, -2.12f);
        pathBuilderC.curveToRelative(-0.05f, -0.84f, 3.68f, 0.17f, 3.04f, -1.66f);
        pathBuilderC.curveToRelative(-0.61f, -1.73f, -2.42f, 0.48f, -2.76f, -0.53f);
        pathBuilderC.curveToRelative(-0.58f, -1.74f, 4.7f, -1.68f, 2.85f, -4.01f);
        pathBuilderC.curveToRelative(-1.76f, -2.22f, -2.47f, 2.85f, -4.41f, 2.33f);
        pathBuilderC.curveToRelative(-1.34f, -0.36f, -1.01f, -2.88f, -2.65f, -2.44f);
        pathBuilderC.curveToRelative(-1.88f, 0.51f, 1.03f, 2.2f, 0.0f, 2.86f);
        pathBuilderC.curveToRelative(-0.96f, 0.63f, -1.72f, -0.92f, -2.51f, -1.19f);
        pathBuilderC.curveToRelative(-0.2f, -0.07f, -0.69f, -0.05f, -0.91f, 0.19f);
        pathBuilderC.curveToRelative(-0.78f, 0.86f, 0.28f, 1.16f, 0.25f, 1.91f);
        pathBuilderC.curveToRelative(-0.02f, 0.75f, -1.59f, 0.49f, -1.51f, 1.49f);
        pathBuilderC.curveToRelative(0.12f, 1.6f, 2.18f, 0.45f, 2.4f, 1.24f);
        pathBuilderC.curveToRelative(0.55f, 1.98f, -1.89f, 2.15f, -0.5f, 3.27f);
        pathBuilderC.curveToRelative(1.53f, 0.71f, 1.91f, -1.94f, 2.8f, -1.35f);
        pathBuilderC.curveToRelative(0.58f, 0.38f, 0.3f, 1.45f, 0.16f, 2.43f);
        c.a.i(pathBuilderC, 4.0f, 7.0f, 4.05f);
        pathBuilderC.lineToRelative(1.83f, -2.0f);
        a.C(pathBuilderC, 4.24f, 1.83f, 2.0f, 20.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderC, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(17.28f, 17.15f);
        pathBuilderD.curveToRelative(0.0f, 0.48f, 0.39f, 0.86f, 0.86f, 0.86f);
        pathBuilderD.curveToRelative(0.48f, 0.0f, 0.86f, -0.38f, 0.86f, -0.86f);
        pathBuilderD.reflectiveCurveToRelative(-0.39f, -0.86f, -0.86f, -0.86f);
        pathBuilderD.curveTo(17.66f, 16.29f, 17.28f, 16.67f, 17.28f, 17.15f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dirtyLens = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
