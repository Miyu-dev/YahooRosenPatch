package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
import androidx.compose.animation.a;
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

/* JADX INFO: compiled from: SwipeUp.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_swipeUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwipeUp", "Landroidx/compose/material/icons/Icons$Outlined;", "getSwipeUp", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SwipeUpKt {
    private static ImageVector _swipeUp;

    public static final ImageVector getSwipeUp(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _swipeUp;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwipeUp", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(20.22f, 10.0f, -4.15f, 0.01f);
        pathBuilderA.curveToRelative(-0.16f, -0.01f, -0.31f, 0.02f, -0.45f, 0.08f);
        pathBuilderA.lineToRelative(-0.59f, 0.26f);
        pathBuilderA.lineTo(13.2f, 6.25f);
        pathBuilderA.curveToRelative(-0.56f, -1.26f, -2.04f, -1.83f, -3.3f, -1.27f);
        pathBuilderA.reflectiveCurveToRelative(-1.83f, 2.04f, -1.27f, 3.3f);
        pathBuilderA.lineToRelative(3.3f, 7.45f);
        pathBuilderA.lineToRelative(-1.87f, 0.39f);
        pathBuilderA.curveToRelative(-0.19f, 0.05f, -0.99f, 0.27f, -1.36f, 1.21f);
        pathBuilderA.lineTo(8.0f, 19.19f);
        pathBuilderA.lineToRelative(6.78f, 2.67f);
        pathBuilderA.curveToRelative(0.49f, 0.19f, 1.05f, 0.18f, 1.53f, -0.04f);
        pathBuilderA.lineToRelative(5.99f, -2.65f);
        pathBuilderA.curveToRelative(0.89f, -0.4f, 1.37f, -1.38f, 1.13f, -2.32f);
        pathBuilderA.lineToRelative(-1.36f, -5.34f);
        pathBuilderA.curveTo(21.85f, 10.65f, 21.1f, 10.04f, 20.22f, 10.0f);
        a.t(pathBuilderA, 21.49f, 17.34f, 15.5f, 20.0f);
        pathBuilderA.lineToRelative(-4.92f, -1.96f);
        pathBuilderA.lineToRelative(4.18f, -0.88f);
        pathBuilderA.lineToRelative(-4.3f, -9.7f);
        pathBuilderA.curveToRelative(-0.11f, -0.25f, 0.0f, -0.55f, 0.25f, -0.66f);
        pathBuilderA.curveToRelative(0.25f, -0.11f, 0.55f, 0.0f, 0.66f, 0.25f);
        pathBuilderA.lineToRelative(2.5f, 5.65f);
        pathBuilderA.lineToRelative(1.61f, -0.71f);
        android.support.v4.media.a.C(pathBuilderA, 20.13f, 12.0f, 21.49f, 17.34f);
        pathBuilderA.moveTo(2.06f, 5.56f);
        pathBuilderA.lineTo(1.0f, 4.5f);
        pathBuilderA.lineTo(4.5f, 1.0f);
        pathBuilderA.lineTo(8.0f, 4.5f);
        pathBuilderA.lineTo(6.94f, 5.56f);
        pathBuilderA.lineTo(5.32f, 3.94f);
        pathBuilderA.curveTo(5.11f, 4.76f, 5.0f, 5.62f, 5.0f, 6.5f);
        pathBuilderA.curveToRelative(0.0f, 2.42f, 0.82f, 4.65f, 2.2f, 6.43f);
        pathBuilderA.lineTo(6.13f, 14.0f);
        pathBuilderA.curveTo(4.49f, 11.95f, 3.5f, 9.34f, 3.5f, 6.5f);
        pathBuilderA.curveToRelative(0.0f, -0.92f, 0.1f, -1.82f, 0.3f, -2.68f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 2.06f, 5.56f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeUp = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
