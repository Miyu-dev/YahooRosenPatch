package androidx.compose.material.icons.twotone;

import a6.h;
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

/* JADX INFO: compiled from: Camera.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_camera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Camera", "Landroidx/compose/material/icons/Icons$TwoTone;", "getCamera", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Camera", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.9f, 19.91f);
        pathBuilderD.curveToRelative(0.36f, 0.05f, 0.72f, 0.09f, 1.1f, 0.09f);
        pathBuilderD.curveToRelative(2.18f, 0.0f, 4.16f, -0.88f, 5.61f, -2.3f);
        androidx.compose.animation.a.A(pathBuilderD, 14.89f, 13.0f, -3.99f, 6.91f);
        pathBuilderD.moveTo(9.86f, 19.7f);
        pathBuilderD.lineToRelative(2.71f, -4.7f);
        pathBuilderD.lineTo(4.59f, 15.0f);
        pathBuilderD.curveToRelative(0.93f, 2.28f, 2.87f, 4.03f, 5.27f, 4.7f);
        androidx.compose.animation.a.t(pathBuilderD, 8.54f, 12.0f, 5.7f, 7.09f);
        pathBuilderD.curveTo(4.64f, 8.45f, 4.0f, 10.15f, 4.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, 0.69f, 0.1f, 1.36f, 0.26f, 2.0f);
        b.C(pathBuilderD, 5.43f, -1.15f, -2.0f);
        pathBuilderD.moveTo(18.3f, 16.91f);
        pathBuilderD.curveTo(19.36f, 15.55f, 20.0f, 13.85f, 20.0f, 12.0f);
        pathBuilderD.curveToRelative(0.0f, -0.69f, -0.1f, -1.36f, -0.26f, -2.0f);
        b.C(pathBuilderD, -5.43f, 3.99f, 6.91f);
        pathBuilderD.moveTo(13.73f, 9.0f);
        pathBuilderD.horizontalLineToRelative(5.68f);
        pathBuilderD.curveToRelative(-0.93f, -2.28f, -2.88f, -4.04f, -5.28f, -4.7f);
        h.m(pathBuilderD, 11.42f, 9.0f, 2.31f);
        pathBuilderD.moveTo(10.27f, 9.0f);
        pathBuilderD.lineToRelative(2.83f, -4.92f);
        pathBuilderD.curveTo(12.74f, 4.03f, 12.37f, 4.0f, 12.0f, 4.0f);
        pathBuilderD.curveToRelative(-2.18f, 0.0f, -4.16f, 0.88f, -5.6f, 2.3f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.s(pathBuilderD, 9.12f, 11.0f, 1.15f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(12.0f, 22.0f);
        pathBuilderD2.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderD2.curveToRelative(0.0f, -4.75f, -3.31f, -8.72f, -7.75f, -9.74f);
        pathBuilderD2.lineToRelative(-0.08f, -0.04f);
        pathBuilderD2.lineToRelative(-0.01f, 0.02f);
        pathBuilderD2.curveTo(13.46f, 2.09f, 12.74f, 2.0f, 12.0f, 2.0f);
        pathBuilderD2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderD2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(12.0f, 20.0f);
        pathBuilderD2.curveToRelative(-0.38f, 0.0f, -0.74f, -0.04f, -1.1f, -0.09f);
        pathBuilderD2.lineTo(14.89f, 13.0f);
        pathBuilderD2.lineToRelative(2.72f, 4.7f);
        pathBuilderD2.curveTo(16.16f, 19.12f, 14.18f, 20.0f, 12.0f, 20.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(20.0f, 12.0f);
        pathBuilderD2.curveToRelative(0.0f, 1.85f, -0.64f, 3.55f, -1.7f, 4.91f);
        pathBuilderD2.lineToRelative(-4.0f, -6.91f);
        pathBuilderD2.horizontalLineToRelative(5.43f);
        pathBuilderD2.curveToRelative(0.17f, 0.64f, 0.27f, 1.31f, 0.27f, 2.0f);
        androidx.compose.animation.a.j(pathBuilderD2, 19.41f, 9.0f, -7.99f);
        pathBuilderD2.lineToRelative(2.71f, -4.7f);
        pathBuilderD2.curveToRelative(2.4f, 0.66f, 4.35f, 2.42f, 5.28f, 4.7f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(12.0f, 4.0f);
        pathBuilderD2.curveToRelative(0.37f, 0.0f, 0.74f, 0.03f, 1.1f, 0.08f);
        pathBuilderD2.lineTo(10.27f, 9.0f);
        pathBuilderD2.lineToRelative(-1.15f, 2.0f);
        pathBuilderD2.lineTo(6.4f, 6.3f);
        pathBuilderD2.curveTo(7.84f, 4.88f, 9.82f, 4.0f, 12.0f, 4.0f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(4.0f, 12.0f);
        pathBuilderD2.curveToRelative(0.0f, -1.85f, 0.64f, -3.55f, 1.7f, -4.91f);
        pathBuilderD2.lineTo(8.54f, 12.0f);
        pathBuilderD2.lineToRelative(1.15f, 2.0f);
        pathBuilderD2.lineTo(4.26f, 14.0f);
        pathBuilderD2.curveTo(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
        androidx.compose.animation.a.j(pathBuilderD2, 10.27f, 15.0f, 2.3f);
        pathBuilderD2.lineToRelative(-2.71f, 4.7f);
        pathBuilderD2.curveToRelative(-2.4f, -0.67f, -4.35f, -2.42f, -5.28f, -4.7f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.c(pathBuilderD2, 5.69f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _camera = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
