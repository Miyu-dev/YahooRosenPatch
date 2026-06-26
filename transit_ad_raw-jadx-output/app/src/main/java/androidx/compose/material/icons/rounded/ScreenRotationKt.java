package androidx.compose.material.icons.rounded;

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

/* JADX INFO: compiled from: ScreenRotation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_screenRotation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ScreenRotation", "Landroidx/compose/material/icons/Icons$Rounded;", "getScreenRotation", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class ScreenRotationKt {
    private static ImageVector _screenRotation;

    public static final ImageVector getScreenRotation(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _screenRotation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ScreenRotation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(10.23f, 1.75f);
        pathBuilderD.curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
        pathBuilderD.lineTo(1.75f, 8.11f);
        pathBuilderD.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilderD.lineToRelative(12.02f, 12.02f);
        pathBuilderD.curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
        pathBuilderD.lineToRelative(6.36f, -6.36f);
        pathBuilderD.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        androidx.appcompat.view.menu.a.z(pathBuilderD, 10.23f, 1.75f, 14.12f, 20.48f);
        pathBuilderD.lineTo(3.52f, 9.88f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilderD.lineToRelative(4.95f, -4.95f);
        pathBuilderD.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilderD.lineToRelative(10.61f, 10.61f);
        pathBuilderD.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilderD.lineToRelative(-4.95f, 4.95f);
        pathBuilderD.curveToRelative(-0.39f, 0.38f, -1.03f, 0.38f, -1.42f, -0.01f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.61f, 1.4f);
        pathBuilderD.curveTo(16.04f, 0.57f, 14.06f, -0.03f, 11.81f, 0.02f);
        pathBuilderD.curveToRelative(-0.18f, 0.0f, -0.26f, 0.22f, -0.14f, 0.35f);
        pathBuilderD.lineToRelative(3.48f, 3.48f);
        pathBuilderD.lineToRelative(1.33f, -1.33f);
        pathBuilderD.curveToRelative(3.09f, 1.46f, 5.34f, 4.37f, 5.89f, 7.86f);
        pathBuilderD.curveToRelative(0.06f, 0.41f, 0.44f, 0.69f, 0.86f, 0.62f);
        pathBuilderD.curveToRelative(0.41f, -0.06f, 0.69f, -0.45f, 0.62f, -0.86f);
        pathBuilderD.curveToRelative(-0.6f, -3.8f, -2.96f, -7.0f, -6.24f, -8.74f);
        a.y(pathBuilderD, 8.85f, 20.16f, -1.33f, 1.33f);
        pathBuilderD.curveToRelative(-3.09f, -1.46f, -5.34f, -4.37f, -5.89f, -7.86f);
        pathBuilderD.curveToRelative(-0.06f, -0.41f, -0.44f, -0.69f, -0.86f, -0.62f);
        pathBuilderD.curveToRelative(-0.41f, 0.06f, -0.69f, 0.45f, -0.62f, 0.86f);
        pathBuilderD.curveToRelative(0.6f, 3.81f, 2.96f, 7.01f, 6.24f, 8.75f);
        pathBuilderD.curveToRelative(1.57f, 0.83f, 3.55f, 1.43f, 5.8f, 1.38f);
        pathBuilderD.curveToRelative(0.18f, 0.0f, 0.26f, -0.22f, 0.14f, -0.35f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(pathBuilderD, -3.48f, -3.49f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
