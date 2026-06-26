package androidx.compose.material.icons.rounded;

import a.b;
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

/* JADX INFO: compiled from: _3dRotation.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"__3dRotation", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_3dRotation", "Landroidx/compose/material/icons/Icons$Rounded;", "get_3dRotation", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class _3dRotationKt {
    private static ImageVector __3dRotation;

    public static final ImageVector get_3dRotation(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = __3dRotation;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._3dRotation", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.41f, 14.96f);
        pathBuilderD.curveToRelative(-0.19f, 0.0f, -0.37f, -0.03f, -0.52f, -0.08f);
        pathBuilderD.curveToRelative(-0.16f, -0.06f, -0.29f, -0.13f, -0.4f, -0.24f);
        pathBuilderD.curveToRelative(-0.11f, -0.1f, -0.2f, -0.22f, -0.26f, -0.37f);
        pathBuilderD.curveToRelative(-0.06f, -0.14f, -0.09f, -0.3f, -0.09f, -0.47f);
        pathBuilderD.horizontalLineToRelative(-1.3f);
        pathBuilderD.curveToRelative(0.0f, 0.36f, 0.07f, 0.68f, 0.21f, 0.95f);
        pathBuilderD.curveToRelative(0.14f, 0.27f, 0.33f, 0.5f, 0.56f, 0.69f);
        pathBuilderD.curveToRelative(0.24f, 0.18f, 0.51f, 0.32f, 0.82f, 0.41f);
        pathBuilderD.curveToRelative(0.3f, 0.1f, 0.62f, 0.15f, 0.96f, 0.15f);
        pathBuilderD.curveToRelative(0.37f, 0.0f, 0.72f, -0.05f, 1.03f, -0.15f);
        pathBuilderD.curveToRelative(0.32f, -0.1f, 0.6f, -0.25f, 0.83f, -0.44f);
        pathBuilderD.reflectiveCurveToRelative(0.42f, -0.43f, 0.55f, -0.72f);
        pathBuilderD.reflectiveCurveToRelative(0.2f, -0.61f, 0.2f, -0.97f);
        pathBuilderD.curveToRelative(0.0f, -0.19f, -0.02f, -0.38f, -0.07f, -0.56f);
        pathBuilderD.curveToRelative(-0.05f, -0.18f, -0.12f, -0.35f, -0.23f, -0.51f);
        pathBuilderD.curveToRelative(-0.1f, -0.16f, -0.24f, -0.3f, -0.4f, -0.43f);
        pathBuilderD.curveToRelative(-0.17f, -0.13f, -0.37f, -0.23f, -0.61f, -0.31f);
        pathBuilderD.curveToRelative(0.2f, -0.09f, 0.37f, -0.2f, 0.52f, -0.33f);
        pathBuilderD.curveToRelative(0.15f, -0.13f, 0.27f, -0.27f, 0.37f, -0.42f);
        pathBuilderD.curveToRelative(0.1f, -0.15f, 0.17f, -0.3f, 0.22f, -0.46f);
        pathBuilderD.reflectiveCurveToRelative(0.07f, -0.32f, 0.07f, -0.48f);
        pathBuilderD.curveToRelative(0.0f, -0.36f, -0.06f, -0.68f, -0.18f, -0.96f);
        pathBuilderD.reflectiveCurveToRelative(-0.29f, -0.51f, -0.51f, -0.69f);
        pathBuilderD.curveToRelative(-0.2f, -0.19f, -0.47f, -0.33f, -0.77f, -0.43f);
        pathBuilderD.curveTo(9.1f, 8.05f, 8.76f, 8.0f, 8.39f, 8.0f);
        pathBuilderD.curveToRelative(-0.36f, 0.0f, -0.69f, 0.05f, -1.0f, 0.16f);
        pathBuilderD.curveToRelative(-0.3f, 0.11f, -0.57f, 0.26f, -0.79f, 0.45f);
        pathBuilderD.curveToRelative(-0.21f, 0.19f, -0.38f, 0.41f, -0.51f, 0.67f);
        pathBuilderD.curveToRelative(-0.12f, 0.26f, -0.18f, 0.54f, -0.18f, 0.85f);
        pathBuilderD.horizontalLineToRelative(1.3f);
        pathBuilderD.curveToRelative(0.0f, -0.17f, 0.03f, -0.32f, 0.09f, -0.45f);
        pathBuilderD.reflectiveCurveToRelative(0.14f, -0.25f, 0.25f, -0.34f);
        pathBuilderD.reflectiveCurveToRelative(0.23f, -0.17f, 0.38f, -0.22f);
        pathBuilderD.reflectiveCurveToRelative(0.3f, -0.08f, 0.48f, -0.08f);
        pathBuilderD.curveToRelative(0.4f, 0.0f, 0.7f, 0.1f, 0.89f, 0.31f);
        pathBuilderD.curveToRelative(0.19f, 0.2f, 0.29f, 0.49f, 0.29f, 0.86f);
        pathBuilderD.curveToRelative(0.0f, 0.18f, -0.03f, 0.34f, -0.08f, 0.49f);
        pathBuilderD.reflectiveCurveToRelative(-0.14f, 0.27f, -0.25f, 0.37f);
        pathBuilderD.curveToRelative(-0.11f, 0.1f, -0.25f, 0.18f, -0.41f, 0.24f);
        pathBuilderD.curveToRelative(-0.16f, 0.06f, -0.36f, 0.09f, -0.58f, 0.09f);
        b.s(pathBuilderD, 7.5f, 11.4f, 1.03f, 0.77f);
        pathBuilderD.curveToRelative(0.22f, 0.0f, 0.42f, 0.02f, 0.6f, 0.07f);
        pathBuilderD.reflectiveCurveToRelative(0.33f, 0.13f, 0.45f, 0.23f);
        pathBuilderD.curveToRelative(0.12f, 0.11f, 0.22f, 0.24f, 0.29f, 0.4f);
        pathBuilderD.reflectiveCurveToRelative(0.1f, 0.35f, 0.1f, 0.57f);
        pathBuilderD.curveToRelative(0.0f, 0.41f, -0.12f, 0.72f, -0.35f, 0.93f);
        pathBuilderD.curveToRelative(-0.23f, 0.23f, -0.55f, 0.33f, -0.95f, 0.33f);
        pathBuilderD.close();
        pathBuilderD.moveTo(17.71f, 10.24f);
        pathBuilderD.curveToRelative(-0.18f, -0.47f, -0.43f, -0.87f, -0.75f, -1.2f);
        pathBuilderD.curveToRelative(-0.32f, -0.33f, -0.7f, -0.59f, -1.14f, -0.77f);
        pathBuilderD.curveToRelative(-0.43f, -0.18f, -0.92f, -0.27f, -1.46f, -0.27f);
        b.s(pathBuilderD, 12.0f, 8.0f, 8.0f, 2.3f);
        pathBuilderD.curveToRelative(0.55f, 0.0f, 1.06f, -0.09f, 1.51f, -0.27f);
        pathBuilderD.reflectiveCurveToRelative(0.84f, -0.43f, 1.16f, -0.76f);
        pathBuilderD.curveToRelative(0.32f, -0.33f, 0.57f, -0.73f, 0.74f, -1.19f);
        pathBuilderD.curveToRelative(0.17f, -0.47f, 0.26f, -0.99f, 0.26f, -1.57f);
        pathBuilderD.verticalLineToRelative(-0.4f);
        pathBuilderD.curveToRelative(0.0f, -0.58f, -0.09f, -1.1f, -0.26f, -1.57f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.58f, 12.2f);
        pathBuilderD.curveToRelative(0.0f, 0.42f, -0.05f, 0.79f, -0.14f, 1.13f);
        pathBuilderD.curveToRelative(-0.1f, 0.33f, -0.24f, 0.62f, -0.43f, 0.85f);
        pathBuilderD.reflectiveCurveToRelative(-0.43f, 0.41f, -0.71f, 0.53f);
        pathBuilderD.curveToRelative(-0.29f, 0.12f, -0.62f, 0.18f, -0.99f, 0.18f);
        androidx.appcompat.view.menu.a.y(pathBuilderD, -0.91f, 13.4f, 9.11f, 0.97f);
        pathBuilderD.curveToRelative(0.72f, 0.0f, 1.27f, 0.23f, 1.64f, 0.69f);
        pathBuilderD.curveToRelative(0.38f, 0.46f, 0.57f, 1.12f, 0.57f, 1.99f);
        android.support.v4.media.a.v(pathBuilderD, 0.41f, 15.15f, 3.84f);
        pathBuilderD.lineToRelative(1.33f, -1.33f);
        pathBuilderD.curveToRelative(3.09f, 1.46f, 5.34f, 4.37f, 5.89f, 7.86f);
        pathBuilderD.curveToRelative(0.06f, 0.41f, 0.44f, 0.69f, 0.86f, 0.62f);
        pathBuilderD.curveToRelative(0.41f, -0.06f, 0.69f, -0.45f, 0.62f, -0.86f);
        pathBuilderD.curveToRelative(-0.6f, -3.81f, -2.96f, -7.01f, -6.24f, -8.75f);
        pathBuilderD.curveTo(15.94f, 0.49f, 13.78f, -0.13f, 11.34f, 0.02f);
        android.support.v4.media.a.t(pathBuilderD, 3.81f, 3.82f, 8.85f, 20.15f);
        pathBuilderD.lineToRelative(-1.33f, 1.33f);
        pathBuilderD.curveToRelative(-3.09f, -1.46f, -5.34f, -4.37f, -5.89f, -7.86f);
        pathBuilderD.curveToRelative(-0.06f, -0.41f, -0.44f, -0.69f, -0.86f, -0.62f);
        pathBuilderD.curveToRelative(-0.41f, 0.06f, -0.69f, 0.45f, -0.62f, 0.86f);
        pathBuilderD.curveToRelative(0.6f, 3.81f, 2.96f, 7.01f, 6.24f, 8.75f);
        pathBuilderD.curveToRelative(1.67f, 0.89f, 3.83f, 1.51f, 6.27f, 1.36f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.j(pathBuilderD, -3.81f, -3.82f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __3dRotation = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
