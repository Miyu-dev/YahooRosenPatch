package androidx.compose.material.icons.twotone;

import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.a;
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

/* JADX INFO: compiled from: AutoStories.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_autoStories", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AutoStories", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAutoStories", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-twotone_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class AutoStoriesKt {
    private static ImageVector _autoStories;

    public static final ImageVector getAutoStories(Icons.TwoTone twoTone) {
        m.h(twoTone, "<this>");
        ImageVector imageVector = _autoStories;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AutoStories", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderE = androidx.appcompat.app.m.e(3.0f, 6.71f, 9.91f);
        pathBuilderE.curveTo(4.14f, 16.21f, 5.31f, 16.0f, 6.5f, 16.0f);
        pathBuilderE.curveToRelative(1.19f, 0.0f, 2.36f, 0.21f, 3.5f, 0.62f);
        pathBuilderE.verticalLineTo(6.72f);
        pathBuilderE.curveTo(8.89f, 6.25f, 7.7f, 6.0f, 6.5f, 6.0f);
        pathBuilderE.curveTo(5.28f, 6.0f, 4.11f, 6.24f, 3.0f, 6.71f);
        pathBuilderE.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderE.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, a.e(b.a(19.0f, 0.5f, -5.0f, 5.0f), 0.0f, 9.5f, 5.0f, -4.5f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = androidx.browser.browseractions.a.d(22.47f, 5.2f);
        pathBuilderD.curveTo(22.0f, 4.96f, 21.51f, 4.76f, 21.0f, 4.59f);
        pathBuilderD.verticalLineToRelative(12.03f);
        pathBuilderD.curveTo(19.86f, 16.21f, 18.69f, 16.0f, 17.5f, 16.0f);
        pathBuilderD.curveToRelative(-1.9f, 0.0f, -3.78f, 0.54f, -5.5f, 1.58f);
        pathBuilderD.verticalLineTo(5.48f);
        pathBuilderD.curveTo(10.38f, 4.55f, 8.51f, 4.0f, 6.5f, 4.0f);
        pathBuilderD.curveTo(4.71f, 4.0f, 3.02f, 4.44f, 1.53f, 5.2f);
        pathBuilderD.curveTo(1.2f, 5.36f, 1.0f, 5.71f, 1.0f, 6.08f);
        pathBuilderD.verticalLineToRelative(12.08f);
        pathBuilderD.curveToRelative(0.0f, 0.58f, 0.47f, 0.99f, 1.0f, 0.99f);
        pathBuilderD.curveToRelative(0.16f, 0.0f, 0.32f, -0.04f, 0.48f, -0.12f);
        pathBuilderD.curveTo(3.69f, 18.4f, 5.05f, 18.0f, 6.5f, 18.0f);
        pathBuilderD.curveToRelative(2.07f, 0.0f, 3.98f, 0.82f, 5.5f, 2.0f);
        pathBuilderD.curveToRelative(1.52f, -1.18f, 3.43f, -2.0f, 5.5f, -2.0f);
        pathBuilderD.curveToRelative(1.45f, 0.0f, 2.81f, 0.4f, 4.02f, 1.04f);
        pathBuilderD.curveToRelative(0.16f, 0.08f, 0.32f, 0.12f, 0.48f, 0.12f);
        pathBuilderD.curveToRelative(0.52f, 0.0f, 1.0f, -0.41f, 1.0f, -0.99f);
        pathBuilderD.verticalLineTo(6.08f);
        pathBuilderD.curveTo(23.0f, 5.71f, 22.8f, 5.36f, 22.47f, 5.2f);
        pathBuilderD.close();
        pathBuilderD.moveTo(10.0f, 16.62f);
        pathBuilderD.curveTo(8.86f, 16.21f, 7.69f, 16.0f, 6.5f, 16.0f);
        pathBuilderD.curveToRelative(-1.19f, 0.0f, -2.36f, 0.21f, -3.5f, 0.62f);
        pathBuilderD.verticalLineTo(6.71f);
        pathBuilderD.curveTo(4.11f, 6.24f, 5.28f, 6.0f, 6.5f, 6.0f);
        pathBuilderD.curveTo(7.7f, 6.0f, 8.89f, 6.25f, 10.0f, 6.72f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, android.support.v4.media.a.j(pathBuilderD, 16.62f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoStories = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
