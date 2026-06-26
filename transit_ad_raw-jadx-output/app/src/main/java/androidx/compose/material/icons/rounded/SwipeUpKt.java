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

/* JADX INFO: compiled from: SwipeUp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_swipeUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwipeUp", "Landroidx/compose/material/icons/Icons$Rounded;", "getSwipeUp", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SwipeUpKt {
    private static ImageVector _swipeUp;

    public static final ImageVector getSwipeUp(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _swipeUp;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwipeUp", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(8.83f, 19.1f);
        pathBuilderD.curveToRelative(-0.26f, -0.6f, 0.09f, -1.28f, 0.73f, -1.41f);
        pathBuilderD.lineToRelative(3.58f, -0.71f);
        pathBuilderD.lineTo(8.79f, 7.17f);
        pathBuilderD.curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f);
        pathBuilderD.curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f);
        pathBuilderD.lineToRelative(2.43f, 5.49f);
        pathBuilderD.lineToRelative(0.84f, -0.37f);
        pathBuilderD.curveToRelative(0.28f, -0.13f, 0.59f, -0.18f, 0.9f, -0.17f);
        pathBuilderD.lineToRelative(4.56f, 0.21f);
        pathBuilderD.curveToRelative(0.86f, 0.04f, 1.6f, 0.63f, 1.83f, 1.45f);
        pathBuilderD.lineToRelative(1.23f, 4.33f);
        pathBuilderD.curveToRelative(0.27f, 0.96f, -0.2f, 1.97f, -1.11f, 2.37f);
        pathBuilderD.lineToRelative(-5.63f, 2.49f);
        pathBuilderD.curveToRelative(-0.48f, 0.21f, -1.26f, 0.33f, -1.76f, 0.14f);
        pathBuilderD.lineToRelative(-5.45f, -2.27f);
        pathBuilderD.curveTo(9.13f, 19.53f, 8.93f, 19.34f, 8.83f, 19.1f);
        pathBuilderD.close();
        pathBuilderD.moveTo(6.75f, 13.38f);
        pathBuilderD.curveToRelative(0.26f, -0.26f, 0.29f, -0.66f, 0.09f, -0.95f);
        pathBuilderD.curveTo(5.68f, 10.74f, 5.0f, 8.7f, 5.0f, 6.5f);
        pathBuilderD.curveToRelative(0.0f, -0.88f, 0.11f, -1.74f, 0.32f, -2.56f);
        pathBuilderD.lineToRelative(1.09f, 1.09f);
        pathBuilderD.curveToRelative(0.3f, 0.3f, 0.79f, 0.29f, 1.08f, -0.02f);
        pathBuilderD.curveToRelative(0.28f, -0.3f, 0.25f, -0.78f, -0.04f, -1.07f);
        pathBuilderD.lineTo(5.21f, 1.71f);
        pathBuilderD.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilderD.lineTo(1.53f, 3.97f);
        pathBuilderD.curveToRelative(-0.3f, 0.3f, -0.29f, 0.79f, 0.02f, 1.08f);
        pathBuilderD.curveToRelative(0.3f, 0.28f, 0.78f, 0.25f, 1.07f, -0.04f);
        pathBuilderD.lineTo(3.8f, 3.82f);
        pathBuilderD.curveTo(3.6f, 4.68f, 3.5f, 5.58f, 3.5f, 6.5f);
        pathBuilderD.curveToRelative(0.0f, 2.51f, 0.77f, 4.85f, 2.09f, 6.77f);
        pathBuilderD.curveTo(5.86f, 13.66f, 6.41f, 13.72f, 6.75f, 13.38f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeUp = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
