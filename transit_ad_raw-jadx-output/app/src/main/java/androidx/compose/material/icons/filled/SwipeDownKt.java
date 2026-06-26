package androidx.compose.material.icons.filled;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
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

/* JADX INFO: compiled from: SwipeDown.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_swipeDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwipeDown", "Landroidx/compose/material/icons/Icons$Filled;", "getSwipeDown", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SwipeDownKt {
    private static ImageVector _swipeDown;

    public static final ImageVector getSwipeDown(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _swipeDown;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SwipeDown", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(3.8f, 12.18f);
        pathBuilderD.curveToRelative(-0.2f, -0.86f, -0.3f, -1.76f, -0.3f, -2.68f);
        pathBuilderD.curveToRelative(0.0f, -2.84f, 0.99f, -5.45f, 2.63f, -7.5f);
        pathBuilderD.lineTo(7.2f, 3.07f);
        pathBuilderD.curveTo(5.82f, 4.85f, 5.0f, 7.08f, 5.0f, 9.5f);
        pathBuilderD.curveToRelative(0.0f, 0.88f, 0.11f, 1.74f, 0.32f, 2.56f);
        pathBuilderD.lineToRelative(1.62f, -1.62f);
        pathBuilderD.lineTo(8.0f, 11.5f);
        pathBuilderD.lineTo(4.5f, 15.0f);
        pathBuilderD.lineTo(1.0f, 11.5f);
        s.r(pathBuilderD, 1.06f, -1.06f, 3.8f, 12.18f);
        pathBuilderD.moveTo(13.85f, 11.62f);
        pathBuilderD.lineToRelative(-2.68f, -5.37f);
        pathBuilderD.curveToRelative(-0.37f, -0.74f, -1.27f, -1.04f, -2.01f, -0.67f);
        pathBuilderD.curveTo(8.41f, 5.96f, 8.11f, 6.86f, 8.48f, 7.6f);
        pathBuilderD.lineToRelative(4.81f, 9.6f);
        pathBuilderD.lineTo(10.05f, 18.0f);
        pathBuilderD.curveToRelative(-0.33f, 0.09f, -0.59f, 0.33f, -0.7f, 0.66f);
        pathBuilderD.lineTo(9.0f, 19.78f);
        pathBuilderD.lineToRelative(6.19f, 2.25f);
        pathBuilderD.curveToRelative(0.5f, 0.17f, 1.28f, 0.02f, 1.75f, -0.22f);
        pathBuilderD.lineToRelative(5.51f, -2.75f);
        pathBuilderD.curveToRelative(0.89f, -0.45f, 1.32f, -1.48f, 1.0f, -2.42f);
        pathBuilderD.lineToRelative(-1.43f, -4.27f);
        pathBuilderD.curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f);
        pathBuilderD.horizontalLineToRelative(-4.56f);
        pathBuilderD.curveToRelative(-0.31f, 0.0f, -0.62f, 0.07f, -0.89f, 0.21f);
        pathBuilderD.lineTo(13.85f, 11.62f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeDown = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
