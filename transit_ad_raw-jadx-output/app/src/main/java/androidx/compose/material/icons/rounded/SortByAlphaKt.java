package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.s;
import androidx.browser.browseractions.a;
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

/* JADX INFO: compiled from: SortByAlpha.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sortByAlpha", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SortByAlpha", "Landroidx/compose/material/icons/Icons$Rounded;", "getSortByAlpha", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SortByAlpha", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(12.93f, 2.65f);
        pathBuilderD.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        pathBuilderD.lineToRelative(-2.01f, 2.01f);
        b.C(pathBuilderD, 4.72f, -2.0f, -2.01f);
        pathBuilderD.moveTo(12.23f, 21.35f);
        pathBuilderD.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        pathBuilderD.lineToRelative(1.98f, -1.98f);
        b.C(pathBuilderD, -4.66f, 1.97f, 1.98f);
        pathBuilderD.moveTo(10.98f, 17.73f);
        pathBuilderD.curveToRelative(0.6f, 0.0f, 1.01f, -0.6f, 0.79f, -1.16f);
        pathBuilderD.lineTo(8.04f, 7.03f);
        pathBuilderD.curveToRelative(-0.18f, -0.46f, -0.63f, -0.76f, -1.12f, -0.76f);
        pathBuilderD.curveToRelative(-0.49f, 0.0f, -0.94f, 0.3f, -1.12f, 0.76f);
        pathBuilderD.lineToRelative(-3.74f, 9.53f);
        pathBuilderD.curveToRelative(-0.22f, 0.56f, 0.19f, 1.16f, 0.79f, 1.16f);
        pathBuilderD.curveToRelative(0.35f, 0.0f, 0.67f, -0.22f, 0.8f, -0.55f);
        pathBuilderD.lineToRelative(0.71f, -1.9f);
        pathBuilderD.horizontalLineToRelative(5.11f);
        pathBuilderD.lineToRelative(0.71f, 1.9f);
        pathBuilderD.curveToRelative(0.13f, 0.34f, 0.45f, 0.56f, 0.8f, 0.56f);
        a.y(pathBuilderD, 4.97f, 13.64f, 1.94f, -5.18f);
        s.r(pathBuilderD, 1.94f, 5.18f, 4.97f, 13.64f);
        pathBuilderD.moveTo(21.05f, 16.14f);
        pathBuilderD.horizontalLineToRelative(-5.33f);
        pathBuilderD.lineToRelative(5.72f, -8.29f);
        pathBuilderD.curveToRelative(0.46f, -0.66f, -0.02f, -1.57f, -0.82f, -1.57f);
        pathBuilderD.horizontalLineToRelative(-6.48f);
        pathBuilderD.curveToRelative(-0.44f, 0.0f, -0.79f, 0.36f, -0.79f, 0.8f);
        pathBuilderD.verticalLineToRelative(0.01f);
        pathBuilderD.curveToRelative(0.0f, 0.44f, 0.36f, 0.8f, 0.79f, 0.8f);
        pathBuilderD.horizontalLineToRelative(5.09f);
        pathBuilderD.lineToRelative(-5.73f, 8.28f);
        pathBuilderD.curveToRelative(-0.46f, 0.66f, 0.02f, 1.57f, 0.82f, 1.57f);
        pathBuilderD.horizontalLineToRelative(6.72f);
        pathBuilderD.curveToRelative(0.44f, 0.0f, 0.79f, -0.36f, 0.79f, -0.79f);
        pathBuilderD.curveToRelative(0.02f, -0.45f, -0.34f, -0.81f, -0.78f, -0.81f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sortByAlpha = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
