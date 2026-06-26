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

/* JADX INFO: compiled from: SwipeLeft.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_swipeLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwipeLeft", "Landroidx/compose/material/icons/Icons$Outlined;", "getSwipeLeft", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SwipeLeftKt {
    private static ImageVector _swipeLeft;

    public static final ImageVector getSwipeLeft(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _swipeLeft;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwipeLeft", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw = StrokeCap.INSTANCE.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk8 = StrokeJoin.INSTANCE.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = b.a(18.89f, 13.77f, -3.8f, -1.67f);
        pathBuilderA.curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f);
        pathBuilderA.horizontalLineTo(14.0f);
        pathBuilderA.verticalLineTo(7.5f);
        pathBuilderA.curveTo(14.0f, 6.12f, 12.88f, 5.0f, 11.5f, 5.0f);
        pathBuilderA.reflectiveCurveTo(9.0f, 6.12f, 9.0f, 7.5f);
        pathBuilderA.verticalLineToRelative(8.15f);
        pathBuilderA.lineToRelative(-1.87f, -0.4f);
        pathBuilderA.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        pathBuilderA.lineTo(4.0f, 17.22f);
        pathBuilderA.lineToRelative(5.12f, 5.19f);
        pathBuilderA.curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f);
        pathBuilderA.horizontalLineToRelative(6.55f);
        pathBuilderA.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilderA.lineToRelative(0.92f, -5.44f);
        pathBuilderA.curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f);
        a.j(pathBuilderA, 17.08f, 21.0f, -6.55f);
        pathBuilderA.lineToRelative(-3.7f, -3.78f);
        pathBuilderA.lineTo(11.0f, 18.11f);
        pathBuilderA.verticalLineTo(7.5f);
        pathBuilderA.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        pathBuilderA.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        androidx.browser.browseractions.a.x(pathBuilderA, 6.18f, 1.76f, 18.0f, 15.56f);
        androidx.appcompat.view.menu.a.z(pathBuilderA, 17.08f, 21.0f, 4.09f, 5.5f);
        a.x(pathBuilderA, 7.0f, 7.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(1.5f);
        pathBuilderA.verticalLineToRelative(2.02f);
        pathBuilderA.curveTo(5.82f, 2.13f, 8.78f, 1.0f, 12.0f, 1.0f);
        pathBuilderA.curveToRelative(5.49f, 0.0f, 9.27f, 3.12f, 10.0f, 6.0f);
        pathBuilderA.horizontalLineToRelative(-1.57f);
        pathBuilderA.curveTo(19.67f, 5.02f, 16.74f, 2.5f, 12.0f, 2.5f);
        pathBuilderA.curveTo(8.97f, 2.5f, 6.21f, 3.64f, 4.09f, 5.5f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeLeft = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
