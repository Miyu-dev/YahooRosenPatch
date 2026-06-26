package androidx.compose.material.icons.outlined;

import androidx.appcompat.R;
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

/* JADX INFO: compiled from: SportsFootball.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsFootball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsFootball", "Landroidx/compose/material/icons/Icons$Outlined;", "getSportsFootball", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsFootballKt {
    private static ImageVector _sportsFootball;

    public static final ImageVector getSportsFootball(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _sportsFootball;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsFootball", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(20.31f, 3.69f);
        pathBuilderD.curveTo(19.99f, 3.36f, 18.37f, 3.0f, 16.26f, 3.0f);
        pathBuilderD.curveToRelative(-3.03f, 0.0f, -7.09f, 0.75f, -9.8f, 3.46f);
        pathBuilderD.curveTo(1.87f, 11.05f, 2.9f, 19.52f, 3.69f, 20.31f);
        pathBuilderD.curveTo(4.01f, 20.64f, 5.63f, 21.0f, 7.74f, 21.0f);
        pathBuilderD.curveToRelative(3.03f, 0.0f, 7.09f, -0.75f, 9.8f, -3.46f);
        pathBuilderD.curveTo(22.13f, 12.95f, 21.1f, 4.48f, 20.31f, 3.69f);
        pathBuilderD.close();
        pathBuilderD.moveTo(7.74f, 19.0f);
        pathBuilderD.curveToRelative(-1.14f, 0.0f, -2.02f, -0.12f, -2.53f, -0.23f);
        pathBuilderD.curveToRelative(-0.18f, -0.79f, -0.3f, -2.21f, -0.17f, -3.83f);
        pathBuilderD.lineToRelative(4.01f, 4.01f);
        pathBuilderD.curveTo(8.53f, 18.99f, 8.08f, 19.0f, 7.74f, 19.0f);
        pathBuilderD.close();
        pathBuilderD.moveTo(16.13f, 16.13f);
        pathBuilderD.curveToRelative(-1.33f, 1.33f, -3.06f, 2.05f, -4.66f, 2.44f);
        pathBuilderD.lineToRelative(-6.04f, -6.04f);
        pathBuilderD.curveToRelative(0.42f, -1.68f, 1.16f, -3.37f, 2.45f, -4.65f);
        pathBuilderD.curveToRelative(1.32f, -1.32f, 3.05f, -2.04f, 4.64f, -2.43f);
        pathBuilderD.lineToRelative(6.05f, 6.05f);
        pathBuilderD.curveTo(18.15f, 13.17f, 17.4f, 14.85f, 16.13f, 16.13f);
        a.y(pathBuilderD, 18.96f, 9.09f, -4.03f, -4.03f);
        pathBuilderD.curveTo(15.45f, 5.01f, 15.91f, 5.0f, 16.26f, 5.0f);
        pathBuilderD.curveToRelative(1.14f, 0.0f, 2.02f, 0.12f, 2.53f, 0.23f);
        pathBuilderD.curveTo(18.97f, 6.02f, 19.09f, 7.45f, 18.96f, 9.09f);
        pathBuilderD.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderD.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, androidx.appcompat.graphics.drawable.a.e(b.a(8.5f, 14.1f, 5.6f, -5.6f), 1.4f, 1.4f, -5.6f, 5.6f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m2844getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m3141getButtKaPHkGw(), companion3.m3151getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsFootball = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
