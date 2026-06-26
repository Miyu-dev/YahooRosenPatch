package androidx.compose.material.icons.twotone;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: PsychologyAlt.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_psychologyAlt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PsychologyAlt", "Landroidx/compose/material/icons/Icons$TwoTone;", "getPsychologyAlt", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class PsychologyAltKt {
    private static ImageVector _psychologyAlt;

    public static final ImageVector getPsychologyAlt(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _psychologyAlt;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PsychologyAlt", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.0f, 5.0f);
        pathBuilderD.curveToRelative(-2.65f, 0.0f, -4.79f, 2.06f, -4.97f, 4.67f);
        h.n(pathBuilderD, 6.7f, 12.0f, 8.0f, 4.0f);
        androidx.appcompat.view.menu.a.t(pathBuilderD, 3.0f, 3.0f, 3.0f, -3.95f);
        pathBuilderD.lineToRelative(0.89f, -0.42f);
        pathBuilderD.curveTo(16.71f, 13.88f, 18.0f, 12.09f, 18.0f, 10.0f);
        pathBuilderD.curveTo(18.0f, 7.24f, 15.76f, 5.0f, 13.0f, 5.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.5f, 14.0f);
        pathBuilderD.curveToRelative(-0.41f, 0.0f, -0.74f, -0.33f, -0.74f, -0.74f);
        pathBuilderD.curveToRelative(0.0f, -0.41f, 0.33f, -0.73f, 0.74f, -0.73f);
        pathBuilderD.curveToRelative(0.41f, 0.0f, 0.73f, 0.32f, 0.73f, 0.73f);
        pathBuilderD.curveTo(13.23f, 13.67f, 12.92f, 14.0f, 12.5f, 14.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(14.26f, 9.68f);
        pathBuilderD.curveToRelative(-0.44f, 0.65f, -0.86f, 0.85f, -1.09f, 1.27f);
        pathBuilderD.curveToRelative(-0.09f, 0.17f, -0.13f, 0.28f, -0.13f, 0.82f);
        pathBuilderD.horizontalLineToRelative(-1.06f);
        pathBuilderD.curveToRelative(0.0f, -0.29f, -0.04f, -0.75f, 0.18f, -1.16f);
        pathBuilderD.curveToRelative(0.28f, -0.51f, 0.83f, -0.81f, 1.14f, -1.26f);
        pathBuilderD.curveToRelative(0.33f, -0.47f, 0.15f, -1.36f, -0.8f, -1.36f);
        pathBuilderD.curveToRelative(-0.62f, 0.0f, -0.92f, 0.47f, -1.05f, 0.86f);
        pathBuilderD.lineToRelative(-0.96f, -0.4f);
        pathBuilderD.curveTo(10.76f, 7.67f, 11.46f, 7.0f, 12.5f, 7.0f);
        pathBuilderD.curveToRelative(0.86f, 0.0f, 1.45f, 0.39f, 1.75f, 0.88f);
        pathBuilderD.curveTo(14.51f, 8.31f, 14.66f, 9.1f, 14.26f, 9.68f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(19.94f, 9.06f);
        pathBuilderD2.curveTo(19.5f, 5.73f, 16.57f, 3.0f, 13.0f, 3.0f);
        pathBuilderD2.curveTo(9.47f, 3.0f, 6.57f, 5.61f, 6.08f, 9.0f);
        pathBuilderD2.lineToRelative(-1.93f, 3.48f);
        pathBuilderD2.curveTo(3.74f, 13.14f, 4.22f, 14.0f, 5.0f, 14.0f);
        pathBuilderD2.horizontalLineToRelative(1.0f);
        pathBuilderD2.lineToRelative(0.0f, 2.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        android.support.v4.media.a.s(pathBuilderD2, 1.0f, 3.0f, 7.0f);
        pathBuilderD2.lineToRelative(0.0f, -4.68f);
        pathBuilderD2.curveTo(18.62f, 15.07f, 20.35f, 12.24f, 19.94f, 9.06f);
        androidx.compose.animation.a.t(pathBuilderD2, 14.89f, 14.63f, 14.0f, 15.05f);
        v.C(pathBuilderD2, 19.0f, -3.0f, -3.0f, 8.0f);
        androidx.appcompat.app.m.B(pathBuilderD2, -4.0f, 6.7f, 1.33f, -2.33f);
        pathBuilderD2.curveTo(8.21f, 7.06f, 10.35f, 5.0f, 13.0f, 5.0f);
        pathBuilderD2.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilderD2.curveTo(18.0f, 12.09f, 16.71f, 13.88f, 14.89f, 14.63f);
        pathBuilderD2.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(12.5f, 12.54f);
        pathBuilderD3.curveToRelative(-0.41f, 0.0f, -0.74f, 0.31f, -0.74f, 0.73f);
        pathBuilderD3.curveToRelative(0.0f, 0.41f, 0.33f, 0.74f, 0.74f, 0.74f);
        pathBuilderD3.curveToRelative(0.42f, 0.0f, 0.73f, -0.33f, 0.73f, -0.74f);
        pathBuilderD3.curveTo(13.23f, 12.85f, 12.92f, 12.54f, 12.5f, 12.54f);
        pathBuilderD3.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw4 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk84 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD4 = a.d(12.5f, 7.0f);
        pathBuilderD4.curveToRelative(-1.03f, 0.0f, -1.74f, 0.67f, -2.0f, 1.45f);
        pathBuilderD4.lineToRelative(0.96f, 0.4f);
        pathBuilderD4.curveToRelative(0.13f, -0.39f, 0.43f, -0.86f, 1.05f, -0.86f);
        pathBuilderD4.curveToRelative(0.95f, 0.0f, 1.13f, 0.89f, 0.8f, 1.36f);
        pathBuilderD4.curveToRelative(-0.32f, 0.45f, -0.86f, 0.75f, -1.14f, 1.26f);
        pathBuilderD4.curveToRelative(-0.23f, 0.4f, -0.18f, 0.87f, -0.18f, 1.16f);
        pathBuilderD4.horizontalLineToRelative(1.06f);
        pathBuilderD4.curveToRelative(0.0f, -0.55f, 0.04f, -0.65f, 0.13f, -0.82f);
        pathBuilderD4.curveToRelative(0.23f, -0.42f, 0.65f, -0.62f, 1.09f, -1.27f);
        pathBuilderD4.curveToRelative(0.4f, -0.59f, 0.25f, -1.38f, -0.01f, -1.8f);
        pathBuilderD4.curveTo(13.95f, 7.39f, 13.36f, 7.0f, 12.5f, 7.0f);
        pathBuilderD4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw4, iM3151getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _psychologyAlt = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
