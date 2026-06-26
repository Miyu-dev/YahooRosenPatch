package androidx.compose.material.icons.sharp;

import a6.h;
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

/* JADX INFO: compiled from: ScreenLockRotation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_screenLockRotation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScreenLockRotation", "Landroidx/compose/material/icons/Icons$Sharp;", "getScreenLockRotation", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScreenLockRotationKt {
    private static ImageVector _screenLockRotation;

    public static final ImageVector getScreenLockRotation(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _screenLockRotation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ScreenLockRotation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(7.52f, 21.48f);
        pathBuilderD.curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
        pathBuilderD.lineTo(0.05f, 13.0f);
        pathBuilderD.curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
        pathBuilderD.lineToRelative(0.66f, -0.03f);
        android.support.v4.media.a.n(pathBuilderD, -3.81f, -3.82f, -1.33f, 1.33f);
        pathBuilderD.moveTo(20.05f, 4.0f);
        pathBuilderD.verticalLineToRelative(-0.36f);
        pathBuilderD.curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f);
        pathBuilderD.curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f);
        androidx.compose.animation.a.o(pathBuilderD, 15.05f, 4.0f, -1.0f, 6.0f);
        h.C(pathBuilderD, 7.0f, 21.05f, 4.0f, -1.0f);
        androidx.appcompat.view.menu.a.x(pathBuilderD, 19.25f, 4.0f, -3.4f, -0.5f);
        pathBuilderD.curveToRelative(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f);
        pathBuilderD.reflectiveCurveToRelative(1.7f, 0.76f, 1.7f, 1.7f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 19.25f, 4.0f, 19.73f, 11.2f);
        pathBuilderD.lineToRelative(-1.41f, 1.41f);
        pathBuilderD.lineToRelative(2.22f, 2.22f);
        pathBuilderD.lineToRelative(-5.66f, 5.66f);
        pathBuilderD.lineTo(3.56f, 9.17f);
        pathBuilderD.lineToRelative(5.66f, -5.66f);
        pathBuilderD.lineToRelative(2.1f, 2.1f);
        pathBuilderD.lineToRelative(1.41f, -1.41f);
        pathBuilderD.lineTo(9.22f, 0.69f);
        pathBuilderD.lineTo(0.74f, 9.17f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(pathBuilderD, 14.14f, 14.14f, 8.48f, -8.48f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenLockRotation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
