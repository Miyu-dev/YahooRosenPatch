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

/* JADX INFO: compiled from: Camera.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_camera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Camera", "Landroidx/compose/material/icons/Icons$Rounded;", "getCamera", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Camera", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(13.81f, 2.86f);
        pathBuilderD.curveToRelative(0.17f, -0.3f, 0.0f, -0.7f, -0.35f, -0.74f);
        pathBuilderD.curveToRelative(-2.62f, -0.37f, -5.3f, 0.28f, -7.44f, 1.86f);
        pathBuilderD.curveToRelative(-0.19f, 0.15f, -0.25f, 0.43f, -0.12f, 0.65f);
        pathBuilderD.lineToRelative(3.01f, 5.22f);
        pathBuilderD.curveToRelative(0.19f, 0.33f, 0.67f, 0.33f, 0.87f, 0.0f);
        android.support.v4.media.a.t(pathBuilderD, 4.03f, -6.99f, 21.3f, 8.33f);
        pathBuilderD.curveToRelative(-0.98f, -2.47f, -2.92f, -4.46f, -5.35f, -5.5f);
        pathBuilderD.curveToRelative(-0.23f, -0.1f, -0.5f, 0.0f, -0.63f, 0.22f);
        pathBuilderD.lineToRelative(-3.01f, 5.21f);
        pathBuilderD.curveToRelative(-0.19f, 0.32f, 0.05f, 0.74f, 0.44f, 0.74f);
        pathBuilderD.horizontalLineToRelative(8.08f);
        pathBuilderD.curveToRelative(0.35f, 0.0f, 0.6f, -0.35f, 0.47f, -0.67f);
        androidx.compose.animation.a.j(pathBuilderD, 21.37f, 10.0f, -6.2f);
        pathBuilderD.curveToRelative(-0.38f, 0.0f, -0.63f, 0.42f, -0.43f, 0.75f);
        pathBuilderD.lineTo(19.0f, 18.14f);
        pathBuilderD.curveToRelative(0.17f, 0.3f, 0.6f, 0.35f, 0.82f, 0.08f);
        pathBuilderD.curveToRelative(1.74f, -2.18f, 2.48f, -5.03f, 2.05f, -7.79f);
        pathBuilderD.curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f);
        pathBuilderD.close();
        pathBuilderD.moveTo(4.18f, 5.79f);
        pathBuilderD.curveToRelative(-1.73f, 2.19f, -2.48f, 5.02f, -2.05f, 7.79f);
        pathBuilderD.curveToRelative(0.03f, 0.24f, 0.25f, 0.42f, 0.5f, 0.42f);
        pathBuilderD.horizontalLineToRelative(6.2f);
        pathBuilderD.curveToRelative(0.38f, 0.0f, 0.63f, -0.42f, 0.43f, -0.75f);
        pathBuilderD.lineTo(5.0f, 5.87f);
        pathBuilderD.curveToRelative(-0.18f, -0.3f, -0.61f, -0.35f, -0.82f, -0.08f);
        pathBuilderD.close();
        pathBuilderD.moveTo(2.7f, 15.67f);
        pathBuilderD.curveToRelative(0.98f, 2.47f, 2.92f, 4.46f, 5.35f, 5.5f);
        pathBuilderD.curveToRelative(0.23f, 0.1f, 0.5f, 0.0f, 0.63f, -0.22f);
        pathBuilderD.lineToRelative(3.01f, -5.21f);
        pathBuilderD.curveToRelative(0.19f, -0.33f, -0.05f, -0.75f, -0.43f, -0.75f);
        pathBuilderD.lineTo(3.17f, 14.99f);
        pathBuilderD.curveToRelative(-0.35f, 0.01f, -0.6f, 0.36f, -0.47f, 0.68f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.53f, 21.89f);
        pathBuilderD.curveToRelative(2.62f, 0.37f, 5.3f, -0.28f, 7.44f, -1.86f);
        pathBuilderD.curveToRelative(0.2f, -0.15f, 0.26f, -0.44f, 0.13f, -0.66f);
        pathBuilderD.lineToRelative(-3.01f, -5.22f);
        pathBuilderD.curveToRelative(-0.19f, -0.33f, -0.67f, -0.33f, -0.87f, 0.0f);
        pathBuilderD.lineToRelative(-4.04f, 6.99f);
        pathBuilderD.curveToRelative(-0.17f, 0.3f, 0.01f, 0.7f, 0.35f, 0.75f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _camera = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
