package androidx.compose.material.icons.twotone;

import android.support.v4.media.a;
import androidx.appcompat.R;
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

/* JADX INFO: compiled from: SwipeRight.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_swipeRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SwipeRight", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSwipeRight", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SwipeRightKt {
    private static ImageVector _swipeRight;

    public static final ImageVector getSwipeRight(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _swipeRight;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwipeRight", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.a(17.08f, 21.0f, -6.55f, -3.7f, -3.78f);
        pathBuilderA.lineTo(11.0f, 18.11f);
        pathBuilderA.verticalLineTo(7.5f);
        pathBuilderA.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        pathBuilderA.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        androidx.browser.browseractions.a.x(pathBuilderA, 6.18f, 1.76f, 18.0f, 15.56f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderA, 17.08f, 21.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = b.a(18.89f, 13.77f, -3.8f, -1.67f);
        pathBuilderA2.curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f);
        pathBuilderA2.horizontalLineTo(14.0f);
        pathBuilderA2.verticalLineTo(7.5f);
        pathBuilderA2.curveTo(14.0f, 6.12f, 12.88f, 5.0f, 11.5f, 5.0f);
        pathBuilderA2.reflectiveCurveTo(9.0f, 6.12f, 9.0f, 7.5f);
        pathBuilderA2.verticalLineToRelative(8.15f);
        pathBuilderA2.lineToRelative(-1.87f, -0.4f);
        pathBuilderA2.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        pathBuilderA2.lineTo(4.0f, 17.22f);
        pathBuilderA2.lineToRelative(5.12f, 5.19f);
        pathBuilderA2.curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f);
        pathBuilderA2.horizontalLineToRelative(6.55f);
        pathBuilderA2.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        pathBuilderA2.lineToRelative(0.92f, -5.44f);
        pathBuilderA2.curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f);
        androidx.compose.animation.a.j(pathBuilderA2, 17.08f, 21.0f, -6.55f);
        pathBuilderA2.lineToRelative(-3.7f, -3.78f);
        pathBuilderA2.lineTo(11.0f, 18.11f);
        pathBuilderA2.verticalLineTo(7.5f);
        pathBuilderA2.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        pathBuilderA2.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        androidx.browser.browseractions.a.x(pathBuilderA2, 6.18f, 1.76f, 18.0f, 15.56f);
        androidx.appcompat.view.menu.a.z(pathBuilderA2, 17.08f, 21.0f, 12.0f, 2.5f);
        pathBuilderA2.curveTo(7.26f, 2.5f, 4.33f, 5.02f, 3.57f, 7.0f);
        pathBuilderA2.horizontalLineTo(2.0f);
        pathBuilderA2.curveToRelative(0.73f, -2.88f, 4.51f, -6.0f, 10.0f, -6.0f);
        pathBuilderA2.curveToRelative(3.22f, 0.0f, 6.18f, 1.13f, 8.5f, 3.02f);
        b.x(pathBuilderA2, 2.0f, 22.0f, 5.0f, -5.0f);
        pathBuilderA2.verticalLineTo(5.5f);
        pathBuilderA2.horizontalLineToRelative(2.91f);
        pathBuilderA2.curveTo(17.79f, 3.64f, 15.03f, 2.5f, 12.0f, 2.5f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderA2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeRight = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
