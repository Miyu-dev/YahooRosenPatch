package androidx.compose.material.icons.outlined;

import a6.h;
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
import c.e;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: MonitorHeart.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_monitorHeart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "MonitorHeart", "Landroidx/compose/material/icons/Icons$Outlined;", "getMonitorHeart", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended-outlined_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class MonitorHeartKt {
    private static ImageVector _monitorHeart;

    public static final ImageVector getMonitorHeart(Icons.Outlined outlined) {
        m.h(outlined, "<this>");
        ImageVector imageVector = _monitorHeart;
        if (imageVector != null) {
            m.e(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MonitorHeart", Dp.m5267constructorimpl(24.0f), Dp.m5267constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM3141getButtKaPHkGw = companion2.m3141getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM3151getBevelLxFBmk8 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB = s.b(20.0f, 4.0f, 4.0f);
        pathBuilderB.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        b.u(pathBuilderB, 3.0f, 2.0f, 6.0f, 16.0f);
        s.l(pathBuilderB, 3.0f, 2.0f, 6.0f);
        pathBuilderB.curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        pathBuilderB.close();
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, pathBuilderB.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw, iM3151getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw2 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk82 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderB2 = e.b(20.0f, 18.0f, 4.0f, -3.0f, 2.0f);
        pathBuilderB2.verticalLineToRelative(3.0f);
        pathBuilderB2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderB2.horizontalLineToRelative(16.0f);
        pathBuilderB2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector.Builder.m3359addPathoIyEayM$default(builder, h.k(pathBuilderB2, -3.0f, -2.0f, 18.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw2, iM3151getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m2844getBlack0d7_KjU(), null);
        int iM3141getButtKaPHkGw3 = companion2.m3141getButtKaPHkGw();
        int iM3151getBevelLxFBmk83 = companion3.m3151getBevelLxFBmk8();
        PathBuilder pathBuilderD = a.d(14.89f, 7.55f);
        pathBuilderD.curveToRelative(-0.34f, -0.68f, -1.45f, -0.68f, -1.79f, 0.0f);
        pathBuilderD.lineTo(10.0f, 13.76f);
        pathBuilderD.lineToRelative(-1.11f, -2.21f);
        pathBuilderD.curveTo(8.72f, 11.21f, 8.38f, 11.0f, 8.0f, 11.0f);
        androidx.compose.animation.a.s(pathBuilderD, 2.0f, 2.0f, 5.38f);
        pathBuilderD.lineToRelative(1.72f, 3.45f);
        pathBuilderD.curveTo(9.28f, 16.79f, 9.62f, 17.0f, 10.0f, 17.0f);
        pathBuilderD.reflectiveCurveToRelative(0.72f, -0.21f, 0.89f, -0.55f);
        pathBuilderD.lineTo(14.0f, 10.24f);
        pathBuilderD.lineToRelative(1.11f, 2.21f);
        pathBuilderD.curveTo(15.28f, 12.79f, 15.62f, 13.0f, 16.0f, 13.0f);
        android.support.v4.media.a.s(pathBuilderD, 6.0f, -2.0f, -5.38f);
        ImageVector imageVectorBuild = ImageVector.Builder.m3359addPathoIyEayM$default(builder, b.h(pathBuilderD, 14.89f, 7.55f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM3141getButtKaPHkGw3, iM3151getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monitorHeart = imageVectorBuild;
        m.e(imageVectorBuild);
        return imageVectorBuild;
    }
}
