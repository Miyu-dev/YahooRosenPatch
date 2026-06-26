package androidx.compose.material.icons.rounded;

import a.b;
import androidx.appcompat.R;
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
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MotionPhotosAuto.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_motionPhotosAuto", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MotionPhotosAuto", "Landroidx/compose/material/icons/Icons$Rounded;", "getMotionPhotosAuto", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MotionPhotosAutoKt {
    private static ImageVector _motionPhotosAuto;

    public static final ImageVector getMotionPhotosAuto(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _motionPhotosAuto;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MotionPhotosAuto", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(4.0f, 9.0f, 4.0f, 9.0f);
        pathBuilderA.curveToRelative(0.26f, 0.26f, 0.34f, 0.63f, 0.25f, 0.98f);
        pathBuilderA.curveToRelative(-0.35f, 1.36f, -0.36f, 2.87f, 0.1f, 4.38f);
        pathBuilderA.curveToRelative(0.88f, 2.91f, 3.44f, 5.1f, 6.44f, 5.55f);
        pathBuilderA.curveToRelative(5.52f, 0.81f, 10.19f, -4.06f, 9.03f, -9.62f);
        pathBuilderA.curveToRelative(-0.65f, -3.13f, -3.23f, -5.61f, -6.37f, -6.16f);
        pathBuilderA.curveToRelative(-1.21f, -0.21f, -2.38f, -0.15f, -3.46f, 0.13f);
        pathBuilderA.curveTo(9.64f, 4.35f, 9.26f, 4.26f, 9.01f, 4.01f);
        pathBuilderA.lineToRelative(0.0f, 0.0f);
        pathBuilderA.curveTo(8.45f, 3.45f, 8.73f, 2.52f, 9.48f, 2.32f);
        pathBuilderA.curveToRelative(1.47f, -0.38f, 3.06f, -0.44f, 4.7f, -0.09f);
        pathBuilderA.curveToRelative(3.98f, 0.86f, 7.09f, 4.18f, 7.7f, 8.2f);
        pathBuilderA.curveToRelative(1.04f, 6.81f, -4.82f, 12.58f, -11.64f, 11.42f);
        pathBuilderA.curveTo(6.23f, 21.16f, 2.98f, 17.99f, 2.2f, 14.0f);
        pathBuilderA.curveToRelative(-0.31f, -1.59f, -0.24f, -3.12f, 0.12f, -4.53f);
        pathBuilderA.curveTo(2.52f, 8.72f, 3.45f, 8.45f, 4.0f, 9.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.0f, 5.5f);
        pathBuilderA.curveTo(7.0f, 6.33f, 6.33f, 7.0f, 5.5f, 7.0f);
        pathBuilderA.reflectiveCurveTo(4.0f, 6.33f, 4.0f, 5.5f);
        pathBuilderA.reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f);
        pathBuilderA.reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f);
        a.j(pathBuilderA, 12.03f, 8.99f, -0.07f);
        pathBuilderA.lineToRelative(-1.16f, 3.31f);
        androidx.appcompat.view.menu.a.s(pathBuilderA, 2.39f, 12.03f, 8.99f);
        pathBuilderA.moveTo(12.0f, 18.0f);
        pathBuilderA.curveToRelative(3.31f, 0.0f, 6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilderA.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilderA.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilderA.reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f);
        androidx.browser.browseractions.a.y(pathBuilderA, 8.61f, 14.63f, 2.43f, -6.46f);
        pathBuilderA.curveTo(11.19f, 7.77f, 11.57f, 7.5f, 12.0f, 7.5f);
        pathBuilderA.reflectiveCurveToRelative(0.82f, 0.27f, 0.97f, 0.67f);
        pathBuilderA.lineToRelative(2.43f, 6.46f);
        pathBuilderA.curveToRelative(0.16f, 0.42f, -0.15f, 0.87f, -0.6f, 0.87f);
        pathBuilderA.curveToRelative(-0.27f, 0.0f, -0.52f, -0.17f, -0.61f, -0.43f);
        pathBuilderA.lineToRelative(-0.56f, -1.61f);
        pathBuilderA.horizontalLineToRelative(-3.23f);
        pathBuilderA.lineToRelative(-0.57f, 1.62f);
        pathBuilderA.curveToRelative(-0.09f, 0.26f, -0.33f, 0.43f, -0.61f, 0.43f);
        pathBuilderA.curveTo(8.76f, 15.5f, 8.45f, 15.05f, 8.61f, 14.63f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motionPhotosAuto = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
