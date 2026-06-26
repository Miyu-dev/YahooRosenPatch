package androidx.compose.material.icons.sharp;

import a6.h;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shutterSpeed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShutterSpeed", "Landroidx/compose/material/icons/Icons$Sharp;", "getShutterSpeed", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ShutterSpeedKt {
    private static ImageVector _shutterSpeed;

    public static final ImageVector getShutterSpeed(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _shutterSpeed;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ShutterSpeed", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = a.b(15.0f, 1.0f, 9.0f, 1.0f, 2.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 6.0f, 15.0f, 1.0f);
        pathBuilderB.moveTo(19.03f, 7.39f);
        pathBuilderB.lineToRelative(1.42f, -1.42f);
        pathBuilderB.curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        pathBuilderB.lineToRelative(-1.42f, 1.42f);
        pathBuilderB.curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        pathBuilderB.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        pathBuilderB.reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f);
        pathBuilderB.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        pathBuilderB.curveToRelative(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f);
        pathBuilderB.close();
        pathBuilderB.moveTo(12.0f, 20.0f);
        pathBuilderB.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilderB.reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f);
        pathBuilderB.reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f);
        pathBuilderB.reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f);
        androidx.compose.animation.a.t(pathBuilderB, 11.68f, 15.0f, 6.35f, 15.0f);
        pathBuilderB.curveToRelative(0.57f, 1.62f, 1.82f, 2.92f, 3.41f, 3.56f);
        android.support.v4.media.a.n(pathBuilderB, -0.11f, -0.06f, 2.03f, -3.5f);
        pathBuilderB.moveTo(17.65f, 11.0f);
        pathBuilderB.curveToRelative(-0.57f, -1.6f, -1.78f, -2.89f, -3.34f, -3.54f);
        h.m(pathBuilderB, 12.26f, 11.0f, 5.39f);
        pathBuilderB.moveTo(10.61f, 18.83f);
        pathBuilderB.curveToRelative(0.45f, 0.11f, 0.91f, 0.17f, 1.39f, 0.17f);
        pathBuilderB.curveToRelative(1.34f, 0.0f, 2.57f, -0.45f, 3.57f, -1.19f);
        android.support.v4.media.a.n(pathBuilderB, -2.11f, -3.9f, -2.85f, 4.92f);
        pathBuilderB.moveTo(7.55f, 8.99f);
        pathBuilderB.curveTo(6.59f, 10.05f, 6.0f, 11.46f, 6.0f, 13.0f);
        pathBuilderB.curveToRelative(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        androidx.appcompat.view.menu.a.s(pathBuilderB, 4.72f, 7.55f, 8.99f);
        pathBuilderB.moveTo(16.34f, 17.13f);
        pathBuilderB.curveTo(17.37f, 16.06f, 18.0f, 14.6f, 18.0f, 13.0f);
        pathBuilderB.curveToRelative(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        b.C(pathBuilderB, -4.34f, 2.77f, 5.13f);
        pathBuilderB.moveTo(13.33f, 7.15f);
        pathBuilderB.curveTo(12.9f, 7.06f, 12.46f, 7.0f, 12.0f, 7.0f);
        pathBuilderB.curveToRelative(-1.4f, 0.0f, -2.69f, 0.49f, -3.71f, 1.29f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(pathBuilderB, 2.32f, 3.56f, 2.72f, -4.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shutterSpeed = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
