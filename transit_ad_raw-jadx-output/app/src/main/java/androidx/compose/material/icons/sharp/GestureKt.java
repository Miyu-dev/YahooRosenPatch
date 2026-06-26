package androidx.compose.material.icons.sharp;

import a.b;
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

/* JADX INFO: compiled from: Gesture.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_gesture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Gesture", "Landroidx/compose/material/icons/Icons$Sharp;", "getGesture", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-sharp_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class GestureKt {
    private static ImageVector _gesture;

    public static final ImageVector getGesture(Icons.Sharp sharp) {
        m.h(sharp, "<this>");
        ImageVector imageVector = _gesture;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Gesture", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(4.59f, 6.89f);
        pathBuilderD.curveToRelative(0.7f, -0.71f, 1.4f, -1.35f, 1.71f, -1.22f);
        pathBuilderD.curveToRelative(0.5f, 0.2f, 0.0f, 1.03f, -0.3f, 1.52f);
        pathBuilderD.curveToRelative(-0.25f, 0.42f, -2.86f, 3.89f, -2.86f, 6.31f);
        pathBuilderD.curveToRelative(0.0f, 1.28f, 0.48f, 2.34f, 1.34f, 2.98f);
        pathBuilderD.curveToRelative(0.75f, 0.56f, 1.74f, 0.73f, 2.64f, 0.46f);
        pathBuilderD.curveToRelative(1.07f, -0.31f, 1.95f, -1.4f, 3.06f, -2.77f);
        pathBuilderD.curveToRelative(1.21f, -1.49f, 2.83f, -3.44f, 4.08f, -3.44f);
        pathBuilderD.curveToRelative(1.63f, 0.0f, 1.65f, 1.01f, 1.76f, 1.79f);
        pathBuilderD.curveToRelative(-3.78f, 0.64f, -5.38f, 3.67f, -5.38f, 5.37f);
        pathBuilderD.curveToRelative(0.0f, 1.7f, 1.44f, 3.09f, 3.21f, 3.09f);
        pathBuilderD.curveToRelative(1.63f, 0.0f, 4.29f, -1.33f, 4.69f, -6.1f);
        b.s(pathBuilderD, 21.0f, 14.88f, -2.5f, -2.47f);
        pathBuilderD.curveToRelative(-0.15f, -1.65f, -1.09f, -4.2f, -4.03f, -4.2f);
        pathBuilderD.curveToRelative(-2.25f, 0.0f, -4.18f, 1.91f, -4.94f, 2.84f);
        pathBuilderD.curveToRelative(-0.58f, 0.73f, -2.06f, 2.48f, -2.29f, 2.72f);
        pathBuilderD.curveToRelative(-0.25f, 0.3f, -0.68f, 0.84f, -1.11f, 0.84f);
        pathBuilderD.curveToRelative(-0.45f, 0.0f, -0.72f, -0.83f, -0.36f, -1.92f);
        pathBuilderD.curveToRelative(0.35f, -1.09f, 1.4f, -2.86f, 1.85f, -3.52f);
        pathBuilderD.curveToRelative(0.78f, -1.14f, 1.3f, -1.92f, 1.3f, -3.28f);
        pathBuilderD.curveTo(8.95f, 3.69f, 7.31f, 3.0f, 6.44f, 3.0f);
        pathBuilderD.curveTo(5.12f, 3.0f, 3.97f, 4.0f, 3.72f, 4.25f);
        pathBuilderD.curveToRelative(-0.36f, 0.36f, -0.66f, 0.66f, -0.88f, 0.93f);
        android.support.v4.media.a.t(pathBuilderD, 1.75f, 1.71f, 13.88f, 18.55f);
        pathBuilderD.curveToRelative(-0.31f, 0.0f, -0.74f, -0.26f, -0.74f, -0.72f);
        pathBuilderD.curveToRelative(0.0f, -0.6f, 0.73f, -2.2f, 2.87f, -2.76f);
        pathBuilderD.curveToRelative(-0.3f, 2.69f, -1.43f, 3.48f, -2.13f, 3.48f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gesture = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
