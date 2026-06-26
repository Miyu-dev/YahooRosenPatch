package androidx.compose.material.icons.rounded;

import androidx.appcompat.R;
import androidx.appcompat.widget.v;
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

/* JADX INFO: compiled from: RssFeed.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_rssFeed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "RssFeed", "Landroidx/compose/material/icons/Icons$Rounded;", "getRssFeed", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-rounded_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class RssFeedKt {
    private static ImageVector _rssFeed;

    public static final ImageVector getRssFeed(Icons.Rounded rounded) {
        m.h(rounded, "<this>");
        ImageVector imageVector = _rssFeed;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RssFeed", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = v.b(6.18f, 17.82f, -2.18f, 0.0f);
        pathBuilderB.arcToRelative(2.18f, 2.18f, 0.0f, true, true, 4.36f, 0.0f);
        pathBuilderB.arcToRelative(2.18f, 2.18f, 0.0f, true, true, -4.36f, 0.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(5.59f, 10.23f);
        pathBuilderD.curveToRelative(-0.84f, -0.14f, -1.59f, 0.55f, -1.59f, 1.4f);
        pathBuilderD.curveToRelative(0.0f, 0.71f, 0.53f, 1.28f, 1.23f, 1.4f);
        pathBuilderD.curveToRelative(2.92f, 0.51f, 5.22f, 2.82f, 5.74f, 5.74f);
        pathBuilderD.curveToRelative(0.12f, 0.7f, 0.69f, 1.23f, 1.4f, 1.23f);
        pathBuilderD.curveToRelative(0.85f, 0.0f, 1.54f, -0.75f, 1.41f, -1.59f);
        pathBuilderD.curveToRelative(-0.68f, -4.2f, -3.99f, -7.51f, -8.19f, -8.18f);
        pathBuilderD.close();
        pathBuilderD.moveTo(5.56f, 4.52f);
        pathBuilderD.curveTo(4.73f, 4.43f, 4.0f, 5.1f, 4.0f, 5.93f);
        pathBuilderD.curveToRelative(0.0f, 0.73f, 0.55f, 1.33f, 1.27f, 1.4f);
        pathBuilderD.curveToRelative(6.01f, 0.6f, 10.79f, 5.38f, 11.39f, 11.39f);
        pathBuilderD.curveToRelative(0.07f, 0.73f, 0.67f, 1.28f, 1.4f, 1.28f);
        pathBuilderD.curveToRelative(0.84f, 0.0f, 1.5f, -0.73f, 1.42f, -1.56f);
        pathBuilderD.curveToRelative(-0.73f, -7.34f, -6.57f, -13.19f, -13.92f, -13.92f);
        pathBuilderD.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rssFeed = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
