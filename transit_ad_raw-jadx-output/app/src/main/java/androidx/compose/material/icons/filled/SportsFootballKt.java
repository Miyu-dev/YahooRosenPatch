package androidx.compose.material.icons.filled;

import a6.h;
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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_sportsFootball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SportsFootball", "Landroidx/compose/material/icons/Icons$Filled;", "getSportsFootball", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-filled_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class SportsFootballKt {
    private static ImageVector _sportsFootball;

    public static final ImageVector getSportsFootball(Icons.Filled filled) {
        m.h(filled, "<this>");
        ImageVector imageVector = _sportsFootball;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SportsFootball", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(3.02f, 15.62f);
        pathBuilderD.curveToRelative(-0.08f, 2.42f, 0.32f, 4.34f, 0.67f, 4.69f);
        pathBuilderD.reflectiveCurveToRelative(2.28f, 0.76f, 4.69f, 0.67f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 3.02f, 15.62f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD2 = a.d(13.08f, 3.28f);
        pathBuilderD2.curveTo(10.75f, 3.7f, 8.29f, 4.62f, 6.46f, 6.46f);
        pathBuilderD2.reflectiveCurveToRelative(-2.76f, 4.29f, -3.18f, 6.62f);
        pathBuilderD2.lineToRelative(7.63f, 7.63f);
        pathBuilderD2.curveToRelative(2.34f, -0.41f, 4.79f, -1.34f, 6.62f, -3.18f);
        pathBuilderD2.reflectiveCurveToRelative(2.76f, -4.29f, 3.18f, -6.62f);
        androidx.appcompat.view.menu.a.z(pathBuilderD2, 13.08f, 3.28f, 9.9f, 15.5f);
        pathBuilderD2.lineToRelative(-1.4f, -1.4f);
        pathBuilderD2.lineToRelative(5.6f, -5.6f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.p(pathBuilderD2, 1.4f, 1.4f, 9.9f, 15.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD3 = a.d(20.98f, 8.38f);
        pathBuilderD3.curveToRelative(0.08f, -2.42f, -0.32f, -4.34f, -0.67f, -4.69f);
        pathBuilderD3.reflectiveCurveToRelative(-2.28f, -0.76f, -4.69f, -0.67f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD3, 20.98f, 8.38f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsFootball = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
