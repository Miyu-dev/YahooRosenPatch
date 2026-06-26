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

/* JADX INFO: compiled from: ShutterSpeed.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shutterSpeed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShutterSpeed", "Landroidx/compose/material/icons/Icons$TwoTone;", "getShutterSpeed", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ShutterSpeedKt {
    private static ImageVector _shutterSpeed;

    public static final ImageVector getShutterSpeed(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _shutterSpeed;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ShutterSpeed", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.0f, 6.0f);
        pathBuilderD.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        pathBuilderD.reflectiveCurveToRelative(3.13f, 7.0f, 7.0f, 7.0f);
        pathBuilderD.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        pathBuilderD.reflectiveCurveToRelative(-3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 7.0f);
        pathBuilderD.curveToRelative(0.46f, 0.0f, 0.9f, 0.06f, 1.33f, 0.15f);
        pathBuilderD.lineToRelative(-2.72f, 4.7f);
        pathBuilderD.lineToRelative(-2.32f, -3.56f);
        pathBuilderD.curveTo(9.31f, 7.49f, 10.6f, 7.0f, 12.0f, 7.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, -1.54f, 0.59f, -2.95f, 1.55f, -4.01f);
        pathBuilderD.lineTo(10.81f, 14.0f);
        pathBuilderD.lineTo(6.09f, 14.0f);
        pathBuilderD.curveToRelative(-0.05f, -0.33f, -0.09f, -0.66f, -0.09f, -1.0f);
        androidx.compose.animation.a.j(pathBuilderD, 6.35f, 15.0f, 5.33f);
        pathBuilderD.lineToRelative(-2.03f, 3.5f);
        pathBuilderD.lineToRelative(0.11f, 0.06f);
        pathBuilderD.curveToRelative(-1.59f, -0.64f, -2.84f, -1.94f, -3.41f, -3.56f);
        pathBuilderD.close();
        pathBuilderD.moveTo(12.0f, 19.0f);
        pathBuilderD.curveToRelative(-0.48f, 0.0f, -0.94f, -0.06f, -1.39f, -0.17f);
        pathBuilderD.lineToRelative(2.85f, -4.92f);
        pathBuilderD.lineToRelative(2.11f, 3.9f);
        pathBuilderD.curveToRelative(-1.0f, 0.74f, -2.23f, 1.19f, -3.57f, 1.19f);
        pathBuilderD.close();
        pathBuilderD.moveTo(18.0f, 13.0f);
        pathBuilderD.curveToRelative(0.0f, 1.6f, -0.63f, 3.06f, -1.66f, 4.13f);
        pathBuilderD.lineTo(13.57f, 12.0f);
        pathBuilderD.horizontalLineToRelative(4.34f);
        pathBuilderD.curveToRelative(0.05f, 0.33f, 0.09f, 0.66f, 0.09f, 1.0f);
        a.y(pathBuilderD, 12.26f, 11.0f, 2.05f, -3.54f);
        pathBuilderD.curveToRelative(1.56f, 0.65f, 2.77f, 1.94f, 3.34f, 3.54f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.c(pathBuilderD, -5.39f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(7.55f, 8.99f);
        pathBuilderD2.curveTo(6.59f, 10.05f, 6.0f, 11.46f, 6.0f, 13.0f);
        pathBuilderD2.curveToRelative(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderD2, 4.72f, 7.55f, 8.99f);
        pathBuilderD2.moveTo(14.31f, 7.46f);
        pathBuilderD2.lineTo(12.26f, 11.0f);
        pathBuilderD2.horizontalLineToRelative(5.39f);
        pathBuilderD2.curveToRelative(-0.57f, -1.6f, -1.78f, -2.89f, -3.34f, -3.54f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(13.33f, 7.15f);
        pathBuilderD2.curveTo(12.9f, 7.06f, 12.46f, 7.0f, 12.0f, 7.0f);
        pathBuilderD2.curveToRelative(-1.4f, 0.0f, -2.69f, 0.49f, -3.71f, 1.29f);
        android.support.v4.media.a.n(pathBuilderD2, 2.32f, 3.56f, 2.72f, -4.7f);
        pathBuilderD2.moveTo(11.68f, 15.0f);
        pathBuilderD2.lineTo(6.35f, 15.0f);
        pathBuilderD2.curveToRelative(0.57f, 1.62f, 1.82f, 2.92f, 3.41f, 3.56f);
        android.support.v4.media.a.n(pathBuilderD2, -0.11f, -0.06f, 2.03f, -3.5f);
        pathBuilderD2.moveTo(19.03f, 7.39f);
        pathBuilderD2.lineToRelative(1.42f, -1.42f);
        pathBuilderD2.curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        pathBuilderD2.lineToRelative(-1.42f, 1.42f);
        pathBuilderD2.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        pathBuilderD2.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilderD2.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        pathBuilderD2.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilderD2.curveToRelative(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        pathBuilderD2.close();
        pathBuilderD2.moveTo(12.0f, 20.0f);
        pathBuilderD2.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilderD2.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        pathBuilderD2.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilderD2.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        b.r(pathBuilderD2, 9.0f, 1.0f, 6.0f, 2.0f);
        androidx.appcompat.view.menu.a.z(pathBuilderD2, 9.0f, 3.0f, 16.34f, 17.13f);
        pathBuilderD2.curveTo(17.37f, 16.06f, 18.0f, 14.6f, 18.0f, 13.0f);
        pathBuilderD2.curveToRelative(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        b.C(pathBuilderD2, -4.34f, 2.77f, 5.13f);
        pathBuilderD2.moveTo(10.61f, 18.83f);
        pathBuilderD2.curveToRelative(0.45f, 0.11f, 0.91f, 0.17f, 1.39f, 0.17f);
        pathBuilderD2.curveToRelative(1.34f, 0.0f, 2.57f, -0.45f, 3.57f, -1.19f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderD2, -2.11f, -3.9f, -2.85f, 4.92f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shutterSpeed = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
